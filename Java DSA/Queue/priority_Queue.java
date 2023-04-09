package Queue;

import java.util.ArrayList;

public class priority_Queue<T>{
    private ArrayList<Element<T>> heap;
    public priority_Queue(){
        heap = new ArrayList<>();
    }

    //Insert the value and priority
    public void insert(T value , int priority){
        Element<T> e = new Element<>(value, priority);
        heap.add(e);
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;

        while(childIndex > 0) {
            if (heap.get(childIndex).priority < heap.get(parentIndex).priority) {
                Element<T> temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }
    //get the minimum element
    public T getmin() throws priority_Queue_Exception{
          if(isEmpty()){
              throw new priority_Queue_Exception();
          }
          return heap.get(0).value;
    }

    //remove the minimum element in heap
    public T removeMin() throws priority_Queue_Exception {
        if (isEmpty()) {
            throw new priority_Queue_Exception();
        }
        Element<T> minElement = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int parentIndex = 0;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;
        int minIndex = 0;
        while (leftChildIndex < heap.size()) {

            if (heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex).priority < heap.get(minIndex).priority) {
                minIndex = rightChildIndex;
            }
            if (minIndex != parentIndex) {
                Element<T> temp = heap.get(parentIndex);
                heap.set(parentIndex, heap.get(minIndex));
                heap.set(minIndex, temp);
                parentIndex = minIndex;
                leftChildIndex = 2 * parentIndex + 1;
                rightChildIndex = 2 * parentIndex + 2;
            } else {
                break;
            }

        }
        return (T) minElement;
    }



// size of heap
    public int size(){
           return heap.size();
    }
    // find heap is empty or not
    public boolean isEmpty(){
         if(size() == 0){
             return true;
         }
         return false;
    }

}
