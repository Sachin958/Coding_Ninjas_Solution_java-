package Hashmaps;

import java.util.ArrayList;

public class Map<k,v> {
    ArrayList<MapNode<k, v>> buckets;
    int count;
    int numbuckests;

    public Map() {
        buckets = new ArrayList<>();
        numbuckests = 20;
        for (int i = 0; i < numbuckests; i++) {
            buckets.add(null);
        }
    }

    private int getBucketsIndex(k key) {
        int hc = key.hashCode();
        int index = hc % numbuckests;
        return index;
    }

    public int size() {
        return count;
    }
    public v remove(k key){
        int BucketsIndex = getBucketsIndex(key);
        MapNode<k, v> head = buckets.get(BucketsIndex);
        MapNode<k, v> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if(prev!=null){
                    prev.next = head.next;
                }else {
                    buckets.set(BucketsIndex, head.next);
                }
            }
            prev = head;
            head = head.next;

        }
        return null;
    }

    public v getValue(k key) {
        int BucketsIndex = getBucketsIndex(key);
        MapNode<k, v> head = buckets.get(BucketsIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

        public void insert (k key, v value){
            int BucketsIndex = getBucketsIndex(key);
            MapNode<k, v> head = buckets.get(BucketsIndex);
            while (head != null) {
                if (head.key.equals(key)) {
                    head.value = value;
                    return;
                }
                head = head.next;
            }
            head = buckets.get(BucketsIndex);
            MapNode<k, v> newNode = new MapNode<>(key, value);
            newNode.next = head;
            buckets.set(BucketsIndex, newNode);
        }
    }

