package com.js.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table	// @Table(name="Actor_details") if you need table name to be different than the entity class name
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Actor {

	// @Column (name="actor_id") if you need col name to be diff than the class property name.
	@Id	// Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Sequence - if you want to give your own seq #
	
	private Integer aid;
	@Column(length=20)
	@NonNull
	private String aname;
	@Column(length=20)
	@NonNull
	private String category;
	@Column
	@NonNull
	private Long mobileno;
}
