package jgrapht;

import java.util.*;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultDirectedGraph;

public class Assignment2 
{
	Graph<Character,DefaultEdge> g;
	Scanner sc;
	int count;
	public Assignment2(Graph<Character,DefaultEdge> g, Scanner sc, int count)
	{
		this.g=g;
		this.sc=sc;
		this.count=count;
	}
	
	public static void main(String[] args)
	{	
	Assignment2 a = new Assignment2(new DefaultDirectedGraph<>(DefaultEdge.class),new Scanner(System.in),0);
	a.insertion();
	System.out.println();
	a.findRoot();
	System.out.println();
	a.findLeaf();
	System.out.println();
	a.getParent();
	System.out.println();
	a.getChild();
	System.out.println();
	a.getGraph();
	System.out.println();
	a.topology();
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
		
		System.out.println(g);
	}
	
	public void findRoot()
	{
        int count = 0;
        System.out.println("Root node/s of graph is/are:- ");
		
		for(DefaultEdge d1: g.edgeSet()) 
		{
			char ch=g.getEdgeSource(d1);
			count = 0;
			for(DefaultEdge d2: g.edgeSet())
			{
				if(ch==g.getEdgeTarget(d2))
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.print(ch+" ");
		}
	}
	
	public void findLeaf()
	{
		System.out.println("Leaf node/s of graph is/are:- ");
		
		for(DefaultEdge d1: g.edgeSet())
		{
			char ch=g.getEdgeTarget(d1);
			count = 0;
			for(DefaultEdge d2: g.edgeSet())
			{
				if(ch==g.getEdgeSource(d2))
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.print(ch+" ");
		}
	}
	
	public void getParent()
	{
		System.out.println("Mention the particular node id to check it's parent id: ");
		char ch=sc.next().charAt(0);
		
		for(DefaultEdge d1: g.edgeSet())
		{
			if(g.getEdgeTarget(d1)==ch)
				System.out.println(g.getEdgeSource(d1)+" ");
		}
	}
	
	public void getChild()
	{
		System.out.println("Mention the particular node id to check it's child id: ");
		char ch=sc.next().charAt(0);
		
		for(DefaultEdge d1: g.edgeSet())
		{
			if(g.getEdgeSource(d1)==ch)
				System.out.println(g.getEdgeTarget(d1)+" ");
		}
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
		
		for(DefaultEdge d1: g.edgeSet())
		{
			for(DefaultEdge d2: g.edgeSet())
			{
				if(g.degreeOf(g.getEdgeSource(d2))==count)
					l.add(g.getEdgeSource(d2));
				if(g.degreeOf(g.getEdgeTarget(d2))==count)
					l.add(g.getEdgeSource(d2));
					
			}
			count++;
		}
		System.out.println(l);
	}
}