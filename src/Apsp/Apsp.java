package Apsp;
class AllPairShortestPath
{
    final static int INF = 77777, V = 16;
    void floydWarshall(int graphmatrix[][])
    {
        int distance[][] = new int[V][V];
        int i, j, k;

        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                distance[i][j] = graphmatrix[i][j];
        
        for (k = 0; k < V; k++)
        {
            for (i = 0; i < V; i++)
            {
                
                for (j = 0; j < V; j++)
                {
                 
                    if (distance[i][k] + distance[k][j] < distance[i][j])
                        distance[i][j] = distance[i][k] + distance[k][j];
                }
            }
        }
 
        printMatrix(distance);
    }
 
    void printMatrix(int distance[][])
    {
        System.out.println("Following matrix shows the shortest "+
                         "distances between every pair of vertices");
        for (int i=0; i<V; ++i)
        {
            for (int j=0; j<V; ++j)
            {
                if (distance[i][j]==INF)
                    System.out.print("INF ");
                else
                    System.out.print(distance[i][j]+"   ");
            }
            System.out.println();
        }
    }
 
    // Driver program to test above function
    public static void main (String[] args)
    {
        int graphmatrix[][] = { {0, 1, INF, INF, 2, INF, INF, INF,INF, INF, INF, INF,INF, INF, INF, INF},
        		          {1, 0, 4, INF,INF, 3, INF, INF,INF, INF, INF, INF,INF, INF, INF, INF},
        		          {INF, 4, 0, 9,INF, INF, 5, INF,INF, INF, INF, INF,INF, INF, INF, INF},
        		          {INF, INF, 9, 0,INF, INF, INF, 4,INF, INF, INF, INF,INF, INF, INF, INF},
        		          {2, INF, INF, INF,0, 6, INF, INF,4, INF, INF, INF,INF, INF, INF, INF},
        		          {INF, 3, INF, INF,6, 0, 3, INF,INF, 3, INF, INF,INF, INF, INF, INF},
        		          {INF, INF, 5, INF,INF, 3, 0, 5,INF, INF, 5, INF,INF, INF, INF, INF},
        		          {INF, INF, INF, 4,INF, INF, 5, 0,INF, INF, INF, 6,INF, INF, INF, INF},
        		          {INF, INF, INF, INF,4, INF, INF, INF,0, 7, INF, INF,INF, INF, INF, INF},
        		          {INF, INF, INF, INF,INF, 3, INF, INF,7, 0, 2, INF,INF, 6, INF, INF},
        		          {INF, INF, INF, INF,INF, INF, 5, INF,INF, 2, 0, 4,INF, INF, 5, INF},
        		          {INF, INF, INF, INF,INF, INF, INF, 6,INF, INF, 4, 0,INF, INF, INF, 4},
        		          {INF, INF, INF, INF,INF, INF, INF, INF,7, INF, INF, INF,0, 4, INF, INF},
        		          {INF, INF, INF, INF,INF, INF, INF, INF,INF, 6, INF, INF,4, 0, 10, INF},
        		          {INF, INF, INF, INF,INF, INF, INF, INF,INF, INF, 5, INF,INF, 10, 0, 6},
        		          {INF, INF, INF, INF,INF, INF, INF, INF,INF, INF, INF, 4,INF, INF, 6, 0},     		          
                        };
        AllPairShortestPath a = new AllPairShortestPath();
 
        // Print the solution
        a.floydWarshall(graphmatrix);
    }
}
