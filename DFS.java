import java.util.*;
public class Graph 
{
  private int V;
  private LinkedList<Integer> adj[];
 
     Graph(int v)
      {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
          {
            adj[i]=new LinkedList();
          }
      }

  public void addEdge(int v,int w)
    {
       adj[v].add(w);
    }

  public void DFS(int v)
    {
       boolean visited[]= new boolean[V];
 
       DFS1(v,visited);
    }
 
  public void DFS1(int v, boolean visited[])
    {
       visited[v]=true;
         System.out.print(v+" -> ");
 
       Iterator<Integer> i = adj[v].listIterator();
         
         while(i.hasNext())
           {
             int n = i.next();
             
             if(!visited[n]) 
                {
               DFS1(n,visited);
                }
           }
    }

   public static void main(String arg[]) 
     {
        Graph g = new Graph(4);
    
           g.addEdge(0,1);
           g.addEdge(0,2);
           g.addEdge(1,2);
           g.addEdge(2,0);
           g.addEdge(2,3);
           g.addEdge(3,3);

       g.DFS(2); //source node 
     }
}