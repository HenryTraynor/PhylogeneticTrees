public class Prim {
    public static void main(String[] args){
        Graph graph = new Graph(21, false, true);

        graph.addEdge(0,1,6);
        graph.addEdge(0,2,7);
        graph.addEdge(0,3,12);
        graph.addEdge(0,4,10);
        graph.addEdge(0,5,11);
        graph.addEdge(0,6,11);
        graph.addEdge(0,7,18);
        graph.addEdge(0,8,17);
        graph.addEdge(0,9,13);
        graph.addEdge(0,10,15);
        graph.addEdge(0,11,20);
        graph.addEdge(0,12,27);
        graph.addEdge(0,13,26);
        graph.addEdge(0,14,40);
        graph.addEdge(0,15,41);
        graph.addEdge(0,16,41);
        graph.addEdge(0,17,46);
        graph.addEdge(0,18,40);
        graph.addEdge(0,19,42);
        graph.addEdge(0,20,64);
        graph.addEdge(1,0,6);
        graph.addEdge(1,2,7);
        graph.addEdge(1,3,10);
        graph.addEdge(1,4,8);
        graph.addEdge(1,5,9);
        graph.addEdge(1,6,9);
        graph.addEdge(1,7,17);
        graph.addEdge(1,8,16);
        graph.addEdge(1,9,11);
        graph.addEdge(1,10,13);
        graph.addEdge(1,11,19);
        graph.addEdge(1,12,23);
        graph.addEdge(1,13,23);
        graph.addEdge(1,14,38);
        graph.addEdge(1,15,39);
        graph.addEdge(1,16,39);
        graph.addEdge(1,17,45);
        graph.addEdge(1,18,38);
        graph.addEdge(1,19,41);
        graph.addEdge(1,20,65);
        graph.addEdge(2,0,7);
        graph.addEdge(2,1,7);
        graph.addEdge(2,3,10);
        graph.addEdge(2,4,10);
        graph.addEdge(2,5,11);
        graph.addEdge(2,6,11);
        graph.addEdge(2,7,17);
        graph.addEdge(2,8,17);
        graph.addEdge(2,9,13);
        graph.addEdge(2,10,16);
        graph.addEdge(2,11,22);
        graph.addEdge(2,12,26);
        graph.addEdge(2,13,26);
        graph.addEdge(2,14,38);
        graph.addEdge(2,15,39);
        graph.addEdge(2,16,42);
        graph.addEdge(2,17,46);
        graph.addEdge(2,18,41);
        graph.addEdge(2,19,42);
        graph.addEdge(2,20,66);
        graph.addEdge(3,0,12);
        graph.addEdge(3,1,10);
        graph.addEdge(3,2,10);
        graph.addEdge(3,4,3);
        graph.addEdge(3,5,4);
        graph.addEdge(3,6,8);
        graph.addEdge(3,7,17);
        graph.addEdge(3,8,17);
        graph.addEdge(3,9,14);
        graph.addEdge(3,10,18);
        graph.addEdge(3,11,22);
        graph.addEdge(3,12,25);
        graph.addEdge(3,13,25);
        graph.addEdge(3,14,40);
        graph.addEdge(3,15,41);
        graph.addEdge(3,16,41);
        graph.addEdge(3,17,45);
        graph.addEdge(3,18,40);
        graph.addEdge(3,19,40);
        graph.addEdge(3,20,64);
        graph.addEdge(4,0,10);
        graph.addEdge(4,1,8);
        graph.addEdge(4,2,10);
        graph.addEdge(4,3,3);
        graph.addEdge(4,5,3);
        graph.addEdge(4,6,7);
        graph.addEdge(4,7,16);
        graph.addEdge(4,8,16);
        graph.addEdge(4,9,13);
        graph.addEdge(4,10,17);
        graph.addEdge(4,11,20);
        graph.addEdge(4,12,25);
        graph.addEdge(4,13,25);
        graph.addEdge(4,14,38);
        graph.addEdge(4,15,39);
        graph.addEdge(4,16,41);
        graph.addEdge(4,17,45);
        graph.addEdge(4,18,40);
        graph.addEdge(4,19,41);
        graph.addEdge(4,20,64);
        graph.addEdge(5,0,11);
        graph.addEdge(5,1,9);
        graph.addEdge(5,2,11);
        graph.addEdge(5,3,4);
        graph.addEdge(5,4,3);
        graph.addEdge(5,6,8);
        graph.addEdge(5,7,17);
        graph.addEdge(5,8,17);
        graph.addEdge(5,9,14);
        graph.addEdge(5,10,18);
        graph.addEdge(5,11,21);
        graph.addEdge(5,12,25);
        graph.addEdge(5,13,24);
        graph.addEdge(5,14,38);
        graph.addEdge(5,15,39);
        graph.addEdge(5,16,41);
        graph.addEdge(5,17,45);
        graph.addEdge(5,18,40);
        graph.addEdge(5,19,41);
        graph.addEdge(5,20,64);
        graph.addEdge(6,0,11);
        graph.addEdge(6,1,9);
        graph.addEdge(6,2,11);
        graph.addEdge(6,3,8);
        graph.addEdge(6,4,7);
        graph.addEdge(6,5,8);
        graph.addEdge(6,7,17);
        graph.addEdge(6,8,16);
        graph.addEdge(6,9,13);
        graph.addEdge(6,10,18);
        graph.addEdge(6,11,22);
        graph.addEdge(6,12,26);
        graph.addEdge(6,13,27);
        graph.addEdge(6,14,38);
        graph.addEdge(6,15,39);
        graph.addEdge(6,16,41);
        graph.addEdge(6,17,47);
        graph.addEdge(6,18,42);
        graph.addEdge(6,19,44);
        graph.addEdge(6,20,64);
        graph.addEdge(7,0,18);
        graph.addEdge(7,1,17);
        graph.addEdge(7,2,17);
        graph.addEdge(7,3,17);
        graph.addEdge(7,4,16);
        graph.addEdge(7,5,17);
        graph.addEdge(7,6,27);
        graph.addEdge(7,8,2);
        graph.addEdge(7,9,8);
        graph.addEdge(7,10,18);
        graph.addEdge(7,11,22);
        graph.addEdge(7,12,30);
        graph.addEdge(7,13,28);
        graph.addEdge(7,14,42);
        graph.addEdge(7,15,43);
        graph.addEdge(7,16,44);
        graph.addEdge(7,17,43);
        graph.addEdge(7,18,42);
        graph.addEdge(7,19,43);
        graph.addEdge(7,20,65);
        graph.addEdge(8,0,17);
        graph.addEdge(8,1,16);
        graph.addEdge(8,2,17);
        graph.addEdge(8,3,17);
        graph.addEdge(8,4,16);
        graph.addEdge(8,5,17);
        graph.addEdge(8,6,16);
        graph.addEdge(8,7,2);
        graph.addEdge(8,9,7);
        graph.addEdge(8,10,18);
        graph.addEdge(8,11,23);
        graph.addEdge(8,12,31);
        graph.addEdge(8,13,29);
        graph.addEdge(8,14,41);
        graph.addEdge(8,15,41);
        graph.addEdge(8,16,42);
        graph.addEdge(8,17,42);
        graph.addEdge(8,18,41);
        graph.addEdge(8,19,41);
        graph.addEdge(8,20,64);
        graph.addEdge(9,0,13);
        graph.addEdge(9,1,11);
        graph.addEdge(9,2,13);
        graph.addEdge(9,3,14);
        graph.addEdge(9,4,13);
        graph.addEdge(9,5,14);
        graph.addEdge(9,6,13);
        graph.addEdge(9,7,8);
        graph.addEdge(9,8,7);
        graph.addEdge(9,10,12);
        graph.addEdge(9,11,20);
        graph.addEdge(9,12,25);
        graph.addEdge(9,13,24);
        graph.addEdge(9,14,41);
        graph.addEdge(9,15,41);
        graph.addEdge(9,16,42);
        graph.addEdge(9,17,45);
        graph.addEdge(9,18,39);
        graph.addEdge(9,19,42);
        graph.addEdge(9,20,64);
        graph.addEdge(10,0,15);
        graph.addEdge(10,1,13);
        graph.addEdge(10,2,16);
        graph.addEdge(10,3,18);
        graph.addEdge(10,4,17);
        graph.addEdge(10,5,18);
        graph.addEdge(10,6,18);
        graph.addEdge(10,7,18);
        graph.addEdge(10,8,18);
        graph.addEdge(10,9,12);
        graph.addEdge(10,11,26);
        graph.addEdge(10,12,30);
        graph.addEdge(10,13,31);
        graph.addEdge(10,14,45);
        graph.addEdge(10,15,44);
        graph.addEdge(10,16,46);
        graph.addEdge(10,17,50);
        graph.addEdge(10,18,43);
        graph.addEdge(10,19,45);
        graph.addEdge(10,20,66);
        graph.addEdge(11,0,20);
        graph.addEdge(11,1,19);
        graph.addEdge(11,2,22);
        graph.addEdge(11,3,22);
        graph.addEdge(11,4,20);
        graph.addEdge(11,5,21);
        graph.addEdge(11,6,22);
        graph.addEdge(11,7,22);
        graph.addEdge(11,8,23);
        graph.addEdge(11,9,20);
        graph.addEdge(11,10,26);
        graph.addEdge(11,12,13);
        graph.addEdge(11,13,11);
        graph.addEdge(11,14,40);
        graph.addEdge(11,15,40);
        graph.addEdge(11,16,40);
        graph.addEdge(11,17,43);
        graph.addEdge(11,18,39);
        graph.addEdge(11,19,44);
        graph.addEdge(11,20,66);
        graph.addEdge(12,0,27);
        graph.addEdge(12,1,23);
        graph.addEdge(12,2,26);
        graph.addEdge(12,3,25);
        graph.addEdge(12,4,25);
        graph.addEdge(12,5,25);
        graph.addEdge(12,6,26);
        graph.addEdge(12,7,30);
        graph.addEdge(12,8,31);
        graph.addEdge(12,9,25);
        graph.addEdge(12,10,30);
        graph.addEdge(12,11,13);
        graph.addEdge(12,13,5);
        graph.addEdge(12,14,40);
        graph.addEdge(12,15,40);
        graph.addEdge(12,16,40);
        graph.addEdge(12,17,43);
        graph.addEdge(12,18,39);
        graph.addEdge(12,19,44);
        graph.addEdge(12,20,65);
        graph.addEdge(13,0,26);
        graph.addEdge(13,1,23);
        graph.addEdge(13,2,26);
        graph.addEdge(13,3,25);
        graph.addEdge(13,4,25);
        graph.addEdge(13,5,24);
        graph.addEdge(13,6,27);
        graph.addEdge(13,7,28);
        graph.addEdge(13,8,29);
        graph.addEdge(13,9,24);
        graph.addEdge(13,10,31);
        graph.addEdge(13,11,11);
        graph.addEdge(13,12,5);
        graph.addEdge(13,14,39);
        graph.addEdge(13,15,40);
        graph.addEdge(13,16,38);
        graph.addEdge(13,17,42);
        graph.addEdge(13,18,39);
        graph.addEdge(13,19,42);
        graph.addEdge(13,20,64);
        graph.addEdge(14,0,40);
        graph.addEdge(14,1,38);
        graph.addEdge(14,2,38);
        graph.addEdge(14,3,40);
        graph.addEdge(14,4,38);
        graph.addEdge(14,5,38);
        graph.addEdge(14,6,38);
        graph.addEdge(14,7,42);
        graph.addEdge(14,8,41);
        graph.addEdge(14,9,41);
        graph.addEdge(14,10,45);
        graph.addEdge(14,11,40);
        graph.addEdge(14,12,40);
        graph.addEdge(14,13,39);
        graph.addEdge(14,15,10);
        graph.addEdge(14,16,12);
        graph.addEdge(14,17,45);
        graph.addEdge(14,18,43);
        graph.addEdge(14,19,42);
        graph.addEdge(14,20,66);
        graph.addEdge(15,0,41);
        graph.addEdge(15,1,39);
        graph.addEdge(15,2,39);
        graph.addEdge(15,3,41);
        graph.addEdge(15,4,39);
        graph.addEdge(15,5,39);
        graph.addEdge(15,6,39);
        graph.addEdge(15,7,43);
        graph.addEdge(15,8,41);
        graph.addEdge(15,9,41);
        graph.addEdge(15,10,44);
        graph.addEdge(15,11,40);
        graph.addEdge(15,12,40);
        graph.addEdge(15,13,40);
        graph.addEdge(15,14,10);
        graph.addEdge(15,16,13);
        graph.addEdge(15,17,47);
        graph.addEdge(15,18,44);
        graph.addEdge(15,19,43);
        graph.addEdge(15,20,67);
        graph.addEdge(16,0,41);
        graph.addEdge(16,1,39);
        graph.addEdge(16,2,42);
        graph.addEdge(16,3,41);
        graph.addEdge(16,4,41);
        graph.addEdge(16,5,41);
        graph.addEdge(16,6,41);
        graph.addEdge(16,7,44);
        graph.addEdge(16,8,42);
        graph.addEdge(16,9,42);
        graph.addEdge(16,10,46);
        graph.addEdge(16,11,40);
        graph.addEdge(16,12,40);
        graph.addEdge(16,13,38);
        graph.addEdge(16,14,12);
        graph.addEdge(16,15,13);
        graph.addEdge(16,17,45);
        graph.addEdge(16,18,41);
        graph.addEdge(16,19,42);
        graph.addEdge(16,20,66);
        graph.addEdge(17,0,46);
        graph.addEdge(17,1,45);
        graph.addEdge(17,2,46);
        graph.addEdge(17,3,45);
        graph.addEdge(17,4,45);
        graph.addEdge(17,5,45);
        graph.addEdge(17,6,47);
        graph.addEdge(17,7,43);
        graph.addEdge(17,8,42);
        graph.addEdge(17,9,45);
        graph.addEdge(17,10,50);
        graph.addEdge(17,11,43);
        graph.addEdge(17,12,43);
        graph.addEdge(17,13,42);
        graph.addEdge(17,14,45);
        graph.addEdge(17,15,47);
        graph.addEdge(17,16,44);
        graph.addEdge(17,18,23);
        graph.addEdge(17,19,25);
        graph.addEdge(17,20,72);
        graph.addEdge(18,0,40);
        graph.addEdge(18,1,38);
        graph.addEdge(18,2,41);
        graph.addEdge(18,3,40);
        graph.addEdge(18,4,40);
        graph.addEdge(18,5,40);
        graph.addEdge(18,6,42);
        graph.addEdge(18,7,42);
        graph.addEdge(18,8,41);
        graph.addEdge(18,9,39);
        graph.addEdge(18,10,43);
        graph.addEdge(18,11,39);
        graph.addEdge(18,12,39);
        graph.addEdge(18,13,39);
        graph.addEdge(18,14,43);
        graph.addEdge(18,15,44);
        graph.addEdge(18,16,41);
        graph.addEdge(18,17,23);
        graph.addEdge(18,19,27);
        graph.addEdge(18,20,67);
        graph.addEdge(19,0,42);
        graph.addEdge(19,1,41);
        graph.addEdge(19,2,42);
        graph.addEdge(19,3,40);
        graph.addEdge(19,4,41);
        graph.addEdge(19,5,41);
        graph.addEdge(19,6,44);
        graph.addEdge(19,7,43);
        graph.addEdge(19,8,41);
        graph.addEdge(19,9,42);
        graph.addEdge(19,10,45);
        graph.addEdge(19,11,42);
        graph.addEdge(19,12,44);
        graph.addEdge(19,13,42);
        graph.addEdge(19,14,42);
        graph.addEdge(19,15,43);
        graph.addEdge(19,16,42);
        graph.addEdge(19,17,25);
        graph.addEdge(19,18,27);
        graph.addEdge(19,20,69);
        graph.addEdge(20,0,64);
        graph.addEdge(20,1,65);
        graph.addEdge(20,2,66);
        graph.addEdge(20,3,64);
        graph.addEdge(20,4,64);
        graph.addEdge(20,5,64);
        graph.addEdge(20,6,64);
        graph.addEdge(20,7,65);
        graph.addEdge(20,8,64);
        graph.addEdge(20,9,64);
        graph.addEdge(20,10,66);
        graph.addEdge(20,11,64);
        graph.addEdge(20,12,65);
        graph.addEdge(20,13,64);
        graph.addEdge(20,14,66);
        graph.addEdge(20,15,67);
        graph.addEdge(20,16,66);
        graph.addEdge(20,17,72);
        graph.addEdge(20,18,67);
        graph.addEdge(20,19,69);

        int startNode = 0;
        // Distance from the start node to itself is 0
        graph.setEdges(0, startNode); 

        for(int i = 0; i < graph.getNumOfNodes()-1; i++){
            int node = minEdgeNotIncluded(graph);

            graph.setIncludedInMST(node);

            double[][] matrix = graph.getMatrix();
            for(int v = 0; v < graph.getNumOfNodes(); v++){
                if(matrix[node][v] != 0 && 
                   !graph.getIncludedInMST(v) && 
                   matrix[node][v] < graph.getEdges(v)){
                    graph.setEdges(matrix[node][v], v);
                    graph.setParents(node, v);
                }
            }
        }
        
        System.out.println("MST consists of the following edges:");
        for(int i = 1; i < graph.getNumOfNodes(); i++){
            System.out.println("edge: (" + (int)graph.getParents(i) + ", " + i + "), weight: " + graph.getEdges(i));
        }
    }
       
    public static int minEdgeNotIncluded(Graph graph){
        double min = Double.POSITIVE_INFINITY;
        int minIndex = -1;
        int numOfNodes = graph.getNumOfNodes();

        for(int i = 0; i < numOfNodes; i++){
            if(!graph.getIncludedInMST(i) && graph.getEdges(i) < min){
                minIndex = i;
                min = graph.getEdges(i);
            }
        }
        return minIndex;
    }
}
