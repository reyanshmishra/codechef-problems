import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        int arr[][] = new int[][] {{2, 0}, {1, 0}, {3, 1}, {3, 2}, {1, 3}};
        int numCourses = 4;
        ArrayList<Integer> graph[] = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList();

        for (int[] edge : arr)
            graph[edge[0]].add(edge[1]);

        int visting[] = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            ArrayList<Integer> nodes = graph[i];
            visting = new int[numCourses];
            if (!nodes.isEmpty() && dfs(graph, graph[i], i, visting)) {
                System.out.println("CYCL");
            }
        }
        System.out.println("NO CYCK");
    }

    public static boolean dfs(ArrayList<Integer> graph[], ArrayList<Integer> nodes, int node,
            int visiting[]) {
        if (visiting[node] == 2)// We have found the cycle.
            return true;

        if (visiting[node] != 1) {// The node is not visited go ahead and visit.
            visiting[node] = 2;// Mark as visiting.
            for (int i = 0; i < nodes.size(); i++) {
                if (dfs(graph, graph[nodes.get(i)], nodes.get(i), visiting)) {
                    return true;
                }
            }
            visiting[node] = 1;
        }
        return false;
    }
}
