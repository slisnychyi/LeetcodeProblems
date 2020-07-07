package contest;

import java.util.ArrayList;
import java.util.List;

public class ParallelCourse {

    public static void main(String[] args) {

        int i = new ParallelCourse().minNumberOfSemesters(11, new int[][]{

        }, 2);
        System.out.println(i);
    }

    public int minNumberOfSemesters(int n, int[][] dependencies, int k) {
        if(dependencies.length == 0) return (n / k) + (n % k == 0 ? 0 : 1);
        Paths root = new Paths(n, new ArrayList<>());
        populate(dependencies, root);
        return calc(root, k);
    }

    int calc(Paths root, int k) {
        if (root == null) return 0;
        int result = root.paths.size() / (k + root.paths.size() % k == 0 ? 0 : 1);
        List<Integer> sum = new ArrayList<>();
        for (Paths path : root.paths) {
            sum.add(calc(path, k));
        }
        return result + sum.stream().mapToInt(Integer::intValue).min().orElse(0);
    }

    void populate(int[][] dependencies, Paths root) {
        for (int i = dependencies.length - 1; i >= 0; i--) {
            if (root.val == dependencies[i][1]) {
                Paths chl = new Paths(dependencies[i][0], new ArrayList<>());
                root.paths.add(chl);
            }
        }
        root.paths.forEach(c -> populate(dependencies, c));
    }

    class Paths {
        int val;
        List<Paths> paths;

        Paths() {
        }

        Paths(int val) {
            this.val = val;
        }

        Paths(int val, List<Paths> paths) {
            this.val = val;
            this.paths = paths;
        }
    }
}
