package com.celnoda.dropforge.model;

import java.util.stream.Stream;

public enum Attribute {
	STRENGTH, DEXTERITY, FITNESS,
	INTELLECT, INTUITION, WILLPOWER,
	BEARING, GUILE, COMPOSURE;
	
	@Override
	public String toString() {
		return name().charAt(0) + name().substring(1).toLowerCase();
	}

	public static final int size() {
		return values().length;
	}
	
	public static String[] getStrings() {
	    return Stream.of(Attribute.values()).map(Attribute::toString).toArray(String[]::new);
	}
}

