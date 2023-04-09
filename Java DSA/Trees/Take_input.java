//package Trees;
//import java.util.Scanner;
//public class Take_input {
//    public static TreeNode<Integer> takeInput(){
////        Scanner s= new Scanner(System.in);
////        QueueUsingLL<TreeNode<Integer>> pendingNodes= new QueueUsingLL<>();
////        System.out.println("Enter the root data ");
////        int rootData= s.nextInt();
////        if(rootData==-1)
////            return null;
////
////        TreeNode<Integer> root= new TreeNode<Integer>(rootData);
////        pendingNodes.enqueue(root);
////
////        while(!pendingNodes.isEmpty()){
////            TreeNode<Integer> front= pendingNodes.dequeue();
////            System.out.println("Enter no. of children "+ front.data);
////            int numChild= s.nextInt();
////            for(int i=0;i<numChile;i++){
////                System.out.println("Enter the  "+i+" th child data"+ front.data);
////                int childData= s.nextInt();
////                TreeNode<Integer> childNode= new TreeNode<>(childData);
////                front.children.add(childNode);
////                pendingNodes.enqueue(childNode);
////            }
////        }
////        return root;
////    }
//          public static void main(String args[]){
//        TreeNode<Integer> root = takeInput();
//    }
//}
//
