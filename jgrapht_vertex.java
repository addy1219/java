package com.razorthink;

import java.util.*;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultDirectedGraph;

public class Assignment1 // DefaultDirectedGraph 
{
	Graph<Character,DefaultEdge> g;
	static Scanner sc;
	int count;
	@SuppressWarnings("static-access")
	public Assignment1(Graph<Character,DefaultEdge> g, Scanner sc, int count)
	{
		this.g=g;
		this.sc=sc;
		this.count=count;
	}
	
	public static void main(String[] args)
	{	
	Assignment1 a = new Assignment1(new DefaultDirectedGraph<>(DefaultEdge.class),new Scanner(System.in),0);
	
	while(true)
	{
		System.out.println("1.Insert\n2.Root\n3.Leaf\n4.Parent\n5.Child\n6.Topology\n7.Graph\n8.Dijkstra\n9.Disp\n10.Exit\n");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
		a.insertion();
		break;
		case 2:
		a.findRoot();
		break;
		case 3:
		a.findLeaf();
		break;
		case 4:
		a.getParent();
		break;
		case 5:
		a.getChild();
		break;
		case 6:
	    a.topology();
		break;
		case 7:
		a.getGraph();
		break;
		case 8:
		a.dijkstra();
		break;
		case 9:
		a.disp();
		break;
		case 10:
		System.exit(0);
		}
		}
	}
	
	public void insertion()
	{	
		for(int i = 'A' ; i <= 'J' ; i++)
			g.addVertex((char)i);
		
		g.addEdge('A', 'B');
		g.addEdge('B', 'C');
		g.addEdge('D', 'E');
		g.addEdge('C', 'F');
		g.addEdge('E', 'F');
		g.addEdge('F', 'G');
		g.addEdge('F', 'I');
		g.addEdge('G', 'H');
		g.addEdge('I', 'J');
	}
	
	public void disp()
	{
      System.out.println(g);
	}
	
	public void findRoot()
	{
		for(Character c : g.vertexSet())
		{
			if(g.inDegreeOf(c)==0)
				System.out.println(c);
		}
	}
	
	public void findLeaf()
	{
		for(Character c : g.vertexSet())
		{
			if(g.outDegreeOf(c)==0)
				System.out.println(c);
		}
	}
	
	public void getParent()
	{
		System.out.println("Mention the particular node id to check it's parent id: ");
		char ch=sc.next().charAt(0);
		
		System.out.println(Graphs.predecessorListOf(g,ch));
	}
	
	public void getChild()
	{
		System.out.println("Mention the particular node id to check it's child id: ");
		char ch=sc.next().charAt(0);
		
		System.out.println(Graphs.successorListOf(g,ch));
	}
	
	public void getGraph()
	{
		for(char i='A' ; i<='J' ; i++)
		{
			System.out.print(" "+i+"->");
			System.out.print(g.outgoingEdgesOf(i));
			System.out.println();
		}
	}
	
	@SuppressWarnings("unused")
	public void topology()
	{
		HashSet<Character> l = new LinkedHashSet<Character>();
		System.out.println("Topological ordering:- ");
		
		for(Character c1 : g.vertexSet())
		{
			for(Character c2 : g.vertexSet())
			{
				if(g.inDegreeOf(c2)==count)
					l.add(c2);
			}
			count++;
		}
		System.out.println(l);
	}
	
	public void dijkstra()
	{
		DijkstraShortestPath<Character, DefaultEdge> dj = new DijkstraShortestPath<>(g);
		dj.getPath('A', 'F').getEdgeList().forEach(System.out::println);
	}
}