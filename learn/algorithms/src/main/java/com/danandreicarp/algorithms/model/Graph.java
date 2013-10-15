package com.danandreicarp.algorithms.model;

import java.util.LinkedList;
import java.util.List;

public class Graph {
	private List<Vertex> vertices;
	private List<Edge> edges;
	private boolean directed;
	
	public Graph() {
		this(new LinkedList<Vertex>());
	}
	
	public Graph(List<Vertex> vertices) {
		this.vertices = vertices;
		edges = new LinkedList<Edge>();
		directed = false;
		
		calculateEdges();
	}

	private void calculateEdges() {
		for (Vertex vertex : vertices) {
			if (!vertex.getConnected().isEmpty()) {
				for (Vertex neighbor : vertex.getConnected()) {
					Edge edge = new Edge(vertex.getValue(), neighbor.getValue());
					edges.add(edge);
				}
			}
		}
	}

	public List<Vertex> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	
	public boolean isDirected() {
		return directed;
	}

	public void setDirected(boolean directed) {
		this.directed = directed;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("vertices: ");
		
		sb.append(System.lineSeparator());
		
		for (Vertex vertex : vertices) {
			sb.append(vertex);
		}
		
		sb.append(System.lineSeparator());
		sb.append("edges: ");
		sb.append(System.lineSeparator());
		
		for (Edge edge : edges) {
			sb.append(edge);
		}
		
		return sb.toString();
	}
	
}
