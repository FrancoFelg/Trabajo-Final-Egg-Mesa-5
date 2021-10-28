package com.Mesa5.Mesa5.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gitgorra {

	@Id
	private String id;
	private Boolean odioPorGit = true;
	
}
