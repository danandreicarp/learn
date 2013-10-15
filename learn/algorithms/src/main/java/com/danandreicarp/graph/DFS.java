package com.danandreicarp.graph;

import java.util.Arrays;

import com.danandreicarp.algorithms.model.Colors;
import com.danandreicarp.algorithms.model.Graph;
import com.danandreicarp.algorithms.model.Vertex;
import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public class DFS {
	
	private static int[] discovered;
	private static int[] finished;
	private static int[] predecessor;
	private static int counter;
	
	public DFS(int size) {
		discovered = new int[size];
		finished = new int[size];
		predecessor = new int[size];
	}
	
	public void search(Graph graph, Vertex start) {
		
		for (Vertex vertex : graph.getVertices()) {
			int value = vertex.getValue();
			discovered[value] = -1;
			finished[value] = -1;
			predecessor[value] = -1;
			vertex.setColor(Colors.WHITE);
		}
		
		counter = 0;
		visit(graph, start);
		
		for (Vertex vertex : graph.getVertices()) {
			if (vertex.getColor() == Colors.WHITE) {
				visit(graph, vertex);
			}
		}
	}
	
	private void visit(Graph graph, Vertex vertex) {
		
		vertex.setColor(Colors.GRAY);
		
		discovered[vertex.getValue()] = ++counter;
		for (Vertex neighbor : vertex.getConnected()) {
			if (neighbor.getColor().equals(Colors.WHITE)) {
				predecessor[neighbor.getValue()] = vertex.getValue();
				visit(graph, neighbor);
			}
		}
		
		vertex.setColor(Colors.BLACK);
		finished[vertex.getValue()] = ++counter;
	}
	
	public static void main(String[] args) {
		
		DFS dfs = new DFS(8);
		Graph graph = AlgorithmsUtil.generateGraph(8, 4);
		dfs.search(graph, graph.getVertices().get(0));
		
		System.out.println(graph);
		System.out.println(Arrays.toString(discovered));
		System.out.println(Arrays.toString(finished));
		System.out.println(Arrays.toString(predecessor));
	}
}
