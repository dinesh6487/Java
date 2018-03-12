package com.dinesh.elumalai.java.alg.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dinesh Elumalai
 * Steps for Breadth first search:
 *		Create empty queue and push root node to it.
 *			Do the following when queue is not empty
 *			Pop a node from queue and print it.
 *			Find neighbors of node with the help of adjacency matrix and check if node is already visited or not.
 *			Push neighbors of node into queue if not null
 *
 */
public class BreadthFirstSearch {
	
	private Queue<Node> queue;
	static ArrayList<Node> nodes=new ArrayList<Node>();
	
	public BreadthFirstSearch() {
		this.queue = new LinkedList<>();
	}
	static class Node{
		int data;
		boolean visited;
		List<Node> neighbors;
		
		public Node(int data) {
			this.data = data;
			this.neighbors = new ArrayList<Node>();
		}

		public void addNeighbors(Node node){
			neighbors.add(node);
		}
		
		public List<Node> getNeighbors(){
			return neighbors;
		}
		
		public void setNeighbours(List<Node> neighbors){
			this.neighbors = neighbors;
		}		
	}
	
	public void bfs(Node node){
		queue.add(node);
		node.visited = true;
		while(!queue.isEmpty()){
			Node element = queue.remove();
			System.out.print("\t"+element.data);
			List<Node> neighbours = element.getNeighbors();
			for (int i = 0; i < neighbours.size(); i++) {
				Node n = neighbours.get(i);
				if(n!=null && n.visited!=true){
					queue.add(n);
					n.visited = true;
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Node n1= new Node(10);
		Node n2= new Node(40);
		Node n6= new Node(23);
		Node n4= new Node(57);
		Node n5= new Node(66);
		Node n3= new Node(24);
		
		n1.addNeighbors(n2);
		n1.addNeighbors(n3);
		n2.addNeighbors(n4);
		n2.addNeighbors(n5);
		n3.addNeighbors(n6);
		
		BreadthFirstSearch bfs = new BreadthFirstSearch();
		bfs.bfs(n1);
	}
	
	

}
