package Trees;

public class getHeigh {
    public static int getHeight(TreeNode<Integer> root){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int height = 0 , temp = 0;
        if(root == null){
            return 0;
        }
        if(root.children.size()==0){
            return 1;
        }
        for(int i = 0; i< root.children.size(); i++){
            temp = getHeight(root.children.get(i));
            if(temp>height){
                height = temp;
            }
        }
        return 1+height;
    }

}