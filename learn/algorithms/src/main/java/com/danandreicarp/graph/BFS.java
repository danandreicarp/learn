package com.danandreicarp.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import com.danandreicarp.algorithms.model.Colors;
import com.danandreicarp.algorithms.model.Graph;
import com.danandreicarp.algorithms.model.Vertex;
import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public class BFS {
	
	private static int[] distance;
	private static int[] predecessor;
	Queue<Vertex> queue;
	
	public BFS(int size) {
		distance = new int[size];
		predecessor = new int[size];
	}
	
	public void search(Graph graph, Vertex start) {
		
		for (Vertex vertex : graph.getVertices()) {
			int value = vertex.getValue();
			
			predecessor[value] = -1;
			distance[value] = Integer.MAX_VALUE;
			vertex.setColor(Colors.WHITE);
		}
		
		distance[start.getValue()] = 0;
		queue = new LinkedList<Vertex>();
		queue.add(start);
		
		while (!queue.isEmpty()) {
			Vertex vertex = queue.poll();
			
			for (Vertex neighbor : vertex.getConnected()) {
				if (neighbor.getColor().equals(Colors.WHITE)) {
					distance[neighbor.getValue()] = distance[vertex.getValue()] + 1;
					predecessor[neighbor.getValue()] = vertex.getValue();
					neighbor.setColor(Colors.GRAY);
					queue.add(neighbor);
				}
			}
			
			vertex.setColor(Colors.BLACK);
		}
	}
	
	public static void main(String[] args) {
		
		BFS bfs = new BFS(8);
		Graph graph = AlgorithmsUtil.generateGraph(8, 7);
		bfs.search(graph, graph.getVertices().get(0));
		
		System.out.println(graph);
		System.out.println(Arrays.toString(distance));
		System.out.println(Arrays.toString(predecessor));
	}
}
