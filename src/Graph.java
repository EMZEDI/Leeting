public class Graph {
    public static boolean isBipartite(int[][] adj_list){
        /*
        a graph is bipartite if and only if you have two set of vertices that all the edges have one endpoint in the
        first set of vertices and the other in the other set of vertices. two vertices in the same list cant be neighbors
        start from the 0th vertex.

         */
        int outter_index= 0;
        int inside_index = 0;
        while(outter_index< adj_list.length){
            if (adj_list[outter_index].length == 0){
                outter_index++;
                continue;
            }
            // now we are on an
        }

    }
    public static void main(String[] args) {

    }
}
