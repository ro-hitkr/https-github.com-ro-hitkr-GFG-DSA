import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> roots = new ArrayList<>();

        // 1. Calculate the discriminant
        int discriminant = (b * b) - (4 * a * c);

        // 2. If roots are imaginary, return a list containing -1
        if (discriminant < 0) {
            roots.add(-1);
            return roots;
        }

        // 3. Calculate floor values using Math.floor()
        // We use 2.0 * a to prevent integer division truncation during intermediate steps
        int root1 = (int) Math.floor((-b + Math.sqrt(discriminant)) / (2.0 * a));
        int root2 = (int) Math.floor((-b - Math.sqrt(discriminant)) / (2.0 * a));

        // 4. Add roots and ensure decreasing order
        roots.add(root1);
        roots.add(root2);

        // Sort in descending order as requested by the problem
        Collections.sort(roots, Collections.reverseOrder());

        return roots;
    }
}
