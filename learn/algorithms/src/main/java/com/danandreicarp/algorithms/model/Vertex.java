package com.danandreicarp.algorithms.model;

import java.util.LinkedList;
import java.util.List;

public class Vertex {
	private Integer value;
	private Colors color;
	private List<Vertex> connected;
	
	public Vertex() {
		this(null);
	}
	
	public Vertex(Integer value) {
		this.value = value;
		connected = new LinkedList<Vertex>();
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public List<Vertex> getConnected() {
		return connected;
	}

	public void setConnected(List<Vertex> connected) {
		this.connected = connected;
	}
	
	public Colors getColor() {
		return color;
	}

	public void setColor(Colors color) {
		this.color = color;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(value);
		
		for (Vertex vertex : connected) {
			sb.append(" ").append(vertex.getValue());
		}
		
		sb.append(System.lineSeparator());
		
		return sb.toString();
	}
}
