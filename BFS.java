package com.razorthink;

import java.util.LinkedHashSet;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

public class BFS 
{
	public static void main(String[] args)
	{	
		Graph<Integer,DefaultEdge> g = new DefaultDirectedGraph<>(DefaultEdge.class);
		Set<Integer> s = new LinkedHashSet<Integer>();
		
		for(int i = 1 ; i <= 8 ; i++)
			g.addVertex(i);
		
		g.addEdge(1,7);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(2,6);
		g.addEdge(2,4);
		g.addEdge(3,4);
		g.addEdge(3,8);
		g.addEdge(4,5);
		
		s.add(1); // Root
		
		for(DefaultEdge e : g.edgeSet())
		{
			Integer v = g.getEdgeTarget(e);
			s.add(v);
		}
		System.out.println(s);
	}
}