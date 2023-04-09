package Trees;
import java.util.*;
public class printLevelWise {

/*	TreeNode structure
 *
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/



    public static void printLevelWise(TreeNode<Integer> root){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
        if (root == null)
            return;
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {
            int n = pendingNodes.size();
            while (n > 0) {
                TreeNode<Integer> front = pendingNodes.peek();
                pendingNodes.remove();
                System.out.print(front.data + " ");

                for (int i = 0; i < front.children.size(); i++) {
                    pendingNodes.add(front.children.get(i));
                }
                n--;
            }
            System.out.println();
        }


    }



}
