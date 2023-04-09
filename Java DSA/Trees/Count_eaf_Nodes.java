package Trees;

public class Count_eaf_Nodes {
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

    public static int countLeafNodes(TreeNode<Integer> root){

        // Write your code here
        if(root == null){
            return 0;
        }
        int count = 0;
        if(root.children.size() == 0)
            count++;

        for(int i =0 ; i<root.children.size() ; i++){
            count += countLeafNodes(root.children.get(i));
        }
        return count;
    }

}
