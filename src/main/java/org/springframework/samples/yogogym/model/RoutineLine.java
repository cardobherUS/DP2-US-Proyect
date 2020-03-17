package org.springframework.samples.yogogym.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import lombok.Data;

@Entity
@Data
@Table(name = "routines_lines")
public class RoutineLine extends BaseEntity{
	
	@Column(name = "reps")
	@Min(1)
	protected Integer reps;
	
	@Column(name = "weight")
	@Min(0)
	protected Double weight;
	
	@Column(name = "time")
	@Min(0)
	protected Double time;
	
	@Column(name = "series")
	@Min(1)
	protected Integer series;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = false)
	@JoinColumn(name = "exercise_id")
	protected Exercise exercise;

}
