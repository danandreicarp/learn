package com.danandreicarp.algorithms.util;

import java.util.LinkedList;
import java.util.List;

import com.danandreicarp.algorithms.model.Edge;
import com.danandreicarp.algorithms.model.Graph;
import com.danandreicarp.algorithms.model.Vertex;

public class AlgorithmsUtil {

	public static List<Integer> generateLinkedList(final int size) {
		final List<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < size; i++) {
			list.add(Double.valueOf(Math.random() * 1000).intValue());
		}

		return list;
	}
	
	public static Graph generateGraph(int size, int edges) {
		Graph graph = new Graph();
		
		for (int i = 0; i < size; i++) {
			Vertex vertex = new Vertex(i);
			graph.getVertices().add(vertex);
		}
		
		for (int j = 0; j < edges; j++) {
			generateEdge(size, graph);
		}
		
		return graph;
	}
	
	private static void generateEdge(int size, Graph graph) {
		int start = Double.valueOf(Math.random() * size).intValue();
		int end;
		
		do {
			end = Double.valueOf(Math.random() * size).intValue();
		} while (end == start);
		
		addEdge(start, end, graph);
		
		if (!graph.isDirected()) {
			addEdge(end, start, graph);
		}
	}
	
	private static void addEdge(int start, int end, Graph graph) {
		
		Edge edge = new Edge(start, end);
		graph.getEdges().add(edge);
		
		List<Vertex> connected = graph.getVertices().get(edge.getStart()).getConnected();
		connected.add(graph.getVertices().get(edge.getEnd()));
	}
	
	public static void swap(final List<Integer> list, final Integer i, final Integer j) {
		final Integer temp = list.get(j);
		list.set(j, list.get(i));
		list.set(i, temp);
	}

	public static long time(final String label) {
		final long time = System.currentTimeMillis();
		System.out.println(label + ": " + time);
		return time;
	}
}
