package Queue;

public class Priority_Queue_use {
    public static void main(String args[]) throws priority_Queue_Exception{
        priority_Queue<String> pg = new priority_Queue<>();

        pg.insert("a", 2);
        pg.insert("ab", 3);
        pg.insert("abc", 4);
        pg.insert("ass", 5);
        pg.insert("aaa", 6);
        pg.insert("aa", 7);
        pg.insert("ade", 15);

        while (!pg.isEmpty()){
            System.out.println("getmin" +" "+ pg.getmin());
            pg.removeMin();
           System.out.println("size" +" "+pg.size());
        }
    }
}
