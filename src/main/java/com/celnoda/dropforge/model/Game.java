package com.celnoda.dropforge.model;

import java.io.Serializable;

public class Game implements Serializable {	
	private static final long serialVersionUID = 3501739505617744446L;

	private Long id;
	
	private String name;
	private String desc;
	
	public Game(String name) {
		this(name, null, null);
	}
	public Game(String name, String desc) {
		this(name, desc, null);
	}
	public Game(String name, String desc, Long[] playerIds) {
		this.id = (long) Math.floor(Math.random() * 1000000);
		
		this.setName(name);
		this.setDesc(desc);
			}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}

