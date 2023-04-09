package Trees;

public class maxSumNode {

    /*	TreeNode structure
     *
     * class TreeNode<T> {
            T data;
            ArrayList<TreeNode<T>> children;

            TreeNode(T data){
                this.data = data;
                children = new ArrayList<TreeNode<T>>();
            }
        }*/	public static int sum(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int sum = root.data;
        for(int i = 0 ; i< root.children.size(); i++){
            sum += root.children.get(i).data;
        }
        return sum;
    }



    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        // Write your code here

        if(root == null){
            return null;
        }
        int sumroot = sum(root);
        int maxvalue = Integer.MIN_VALUE;
        TreeNode<Integer> maxnodesum = null;
        for(int i = 0 ; i< root.children.size(); i++){
            TreeNode<Integer> maxNode =maxSumNode(root.children.get(i));
            int sum = sum(maxNode);
            if(maxvalue < sum){
                maxvalue = sum;
                maxnodesum = maxNode;
            }
        }
        if( sumroot > maxvalue ) {
            return root;
        }
        return maxnodesum;
    }


}
