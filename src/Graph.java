public class Graph {

    private int numOfNodes;
    private boolean directed;
    private boolean weighted;
    private double[][] matrix;
    
    private double[] edges;
    private double[] parents;
    private boolean[] includedInMST;
    
    private boolean[][] isSetMatrix;
    
    public int getNumOfNodes() {
        return numOfNodes;
    }
    public double getEdges(int i) {
	return edges[i];
    }
    public void setEdges(double edge, int node) {
	this.edges[node] = edge;
    }
    public boolean getIncludedInMST(int i) {
	return includedInMST[i];
    }
    public void setIncludedInMST(int node) {
	this.includedInMST[node] = true;
    }
    public double[][] getMatrix() {
	return matrix;
    }
    public void setParents(double parent, int node) {
	this.parents[node] = parent;
    }
    public double getParents(int i) { 
        return parents[i]; 
    }
    public void addEdge(int source, int destination) {

        int valueToAdd = 1;

        if (weighted) {
            valueToAdd = 0;
        }

        matrix[source][destination] = valueToAdd;
        isSetMatrix[source][destination] = true;

        if (!directed) {
            matrix[destination][source] = valueToAdd;
            isSetMatrix[destination][source] = true;
        }
    }
    public void addEdge(int source, int destination, int weight) {

        int valueToAdd = weight;

        if (!weighted) {
            valueToAdd = 1;
        }

        matrix[source][destination] = valueToAdd;
        isSetMatrix[source][destination] = true;

        if (!directed) {
            matrix[destination][source] = valueToAdd;
            isSetMatrix[destination][source] = true;
        }
    }
    
    public void printMatrix() {
        for (int i = 0; i < numOfNodes; i++) {
            for (int j = 0; j < numOfNodes; j++) {
                // We only want to print the values of those positions that have been marked as set
                if (isSetMatrix[i][j]) System.out.format("%8s", String.valueOf(matrix[i][j]));
                else System.out.format("%8s", "/  ");
            }
            System.out.println();
        }
    }
   
    public void printEdges() {
        for (int i = 0; i < numOfNodes; i++) {
            System.out.print("Node " + i + " is connected to: ");
            for (int j = 0; j < numOfNodes; j++) {
                if (isSetMatrix[i][j]) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    public boolean hasEdge(int source, int destination) {
        return isSetMatrix[source][destination];
    }
    
    
    public Graph(int numOfNodes, boolean directed, boolean weighted) {
        this.directed = directed;
        this.weighted = weighted;
        this.numOfNodes = numOfNodes;

        // Simply initializes our adjacency matrix to the appropriate size
        matrix = new double[numOfNodes][numOfNodes];
        isSetMatrix = new boolean[numOfNodes][numOfNodes];
    
        edges = new double[numOfNodes];
        parents = new double[numOfNodes];
        includedInMST = new boolean[numOfNodes];

        for(int i = 0; i < numOfNodes; i++){
            edges[i] = Double.POSITIVE_INFINITY;
            parents[i] = -1;
            includedInMST[i] = false;
        }
    }
}