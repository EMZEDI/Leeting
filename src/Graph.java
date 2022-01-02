public class Graph {
//    public static boolean isBipartite(int[][] adj_list){
//        /*
//        a graph is bipartite if and only if you have two set of vertices that all the edges have one endpoint in the
//        first set of vertices and the other in the other set of vertices. two vertices in the same list cant be neighbors
//        start from the 0th vertex. and check if we can create a bipartite graph or not!
//         */
//        int vertex = 0;
//        int inner_element = 0;
//        while(vertex < adj_list.length){
//            if (adj_list[vertex].length == 0){
//                vertex++;
//            }
//            else break;
//        }
//
//        // now we are on a vertex which has neighbors!
//        // iterate thru the vertex which is not empty to find the neighbors for each neighbor, we have to check if
//        // it is connected to the next neighbor or not!
//        // first, check the second set of vertices
//        for (int i = 0; i < adj_list[vertex].length; i++){
//            int neighbor = adj_list[vertex][i];
//            int check = 0;
//            while(check < adj_list[neighbor].length){
//                if (adj_list[neighbor][check] == vertex) check++;
//                else {
//                    if (adj_list[neighbor][check] == vertex)
//                }
//                }
//        }
//    }
//    public static void main(String[] args) {
//
//    }
}
