package com.dinesh.elumalai.java.alg.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 * 
 * @author dineshelumalai
 * In DFS,  You start with  an un-visited node and start picking an adjacent node,
 * until you have no choice, then you backtrack until you have another choice to pick a node, 
 * if not, you select another un-visited node.
 * DFS can be implemented in two ways.
		Recursive
		Iterative
 *
 */
public class DepthFirstSearch {

	static class Node {
		int data;
		boolean visited;
		List<Node> neighbors;

		public Node(int data) {
			this.data = data;
			this.neighbors = new ArrayList<>();
		}

		public void addNeighbors(Node node) {
			this.neighbors.add(node);
		}

		public List<Node> getNeighbors() {
			return this.neighbors;
		}

		public void setNeighbors(List<Node> neighbors) {
			this.neighbors = neighbors;
		}

	}

	public void dfs(Node node) {
		System.out.print("\t" + node.data);
		node.visited = true;
		List<Node> neighbors = node.getNeighbors();
		for (int i = 0; i < neighbors.size(); i++) {
			Node n = neighbors.get(i);
			if (n != null && !n.visited) {
				dfs(n);
			}
		}
	}

	public void dfsUsingStack(Node node) {
		Stack<Node> stack = new Stack<Node>();
		stack.add(node);
		node.visited = true;
		while (!stack.isEmpty()) {
			Node element = stack.pop();
			System.out.print(element.data + " ");

			List<Node> neighbours = element.getNeighbors();
			for (int i = 0; i < neighbours.size(); i++) {
				Node n = neighbours.get(i);
				if (n != null && !n.visited) {
					stack.add(n);
					n.visited = true;

				}
			}
		}
	}

	public static void main(String arg[]) {

		Node node40 = new Node(40);
		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50 = new Node(50);
		Node node70 = new Node(70);

		node40.addNeighbors(node10);
		node40.addNeighbors(node20);
		node10.addNeighbors(node30);
		node20.addNeighbors(node10);
		node20.addNeighbors(node30);
		node20.addNeighbors(node60);
		node20.addNeighbors(node50);
		node30.addNeighbors(node60);
		node60.addNeighbors(node70);
		node50.addNeighbors(node70);

		DepthFirstSearch dfsExample = new DepthFirstSearch();

		System.out.println("The DFS traversal of the graph using stack ");
		dfsExample.dfsUsingStack(node40);

		System.out.println();

		// Resetting the visited flag for nodes
		node40.visited = false;
		node10.visited = false;
		node20.visited = false;
		node30.visited = false;
		node60.visited = false;
		node50.visited = false;
		node70.visited = false;

		System.out.println("The DFS traversal of the graph using recursion ");
		dfsExample.dfs(node40);
	}

}
