package com.celnoda.dropforge.playercharacter;

import java.io.Serializable;
import java.util.Arrays;

public class PlayerCharacter implements Serializable {
	private static final long serialVersionUID = 8194438641483198800L;
	
	private Long id;

	private Long gameId;
	
	private String name;
	private String desc;
	private Integer[] attributes;
	
	public PlayerCharacter(String name) {
		this(null, name, null, null);
	}
	public PlayerCharacter(String name, String desc) {
		this(null, name, desc, null);
	}
	public PlayerCharacter(Long gameId, String name) {
		this(gameId, name, null, null);
	}
	public PlayerCharacter(Long gameId, String name, String desc) {
		this(gameId, name, desc, null);
	}
	public PlayerCharacter(Long gameId, String name, String desc, Integer[] attributes) {
		this.id = (long) Math.floor(Math.random() * 1000000);
		
		this.setGameId(gameId);
		this.setName(name);
		this.setDesc(desc);
		
		if (attributes == null) {
			attributes = new Integer[Attribute.size()];
			Arrays.fill(attributes, 1);
		}
		System.arraycopy(attributes, 0, this.attributes, 0, Attribute.size());
	}
	
	public Long getId() {
		return id;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
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

	public Integer getAttr(Attribute attr) {
		return this.attributes[attr.ordinal()];
	}

	public void setAttr(Attribute attr, Integer level) {
		this.attributes[attr.ordinal()] = level;
	}
}

