

import java.util.LinkedList;

public class Hashmapimp {
    
    static class hashmap<K, V> {
        
        public static final int Default_Capacity = 4;
        
        public static final float Default_LoadFactor = 0.75f;
        
        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }


        private int n;

        private LinkedList<Node>[] Buckets;
    

        private void initbuckets(int N) {
            Buckets = new LinkedList[N];

            for (int i = 0; i < Buckets.length; i++) {
                Buckets[i] = new LinkedList<>();
            }
        }

        public hashmap() {
            initbuckets(Default_Capacity);
        }

        private int Hashfunction(K key) {
            
            int hashind = key.hashCode();
            
            return Math.abs(hashind) % Buckets.length;
        }

        public int size() {
            return n;
        }
        
        public void put(K key, V value) {

            int Hashindex = Hashfunction(key);

            LinkedList<Node> currbucket =  Buckets[Hashindex];
            
            int ei = SearchinBucket(currbucket, key);

            if (ei == -1) {
                Node node = new Node(key, value);
                currbucket.add(node);
                n++;
            }
            else {//for the update
               
                    Node temp = currbucket.get(ei);
                    temp.value = value;
                
            }

        }
        
        //traverse the linkedlist and looks for a node with the key if it is found so give index otherwise return null
        private int SearchinBucket(LinkedList<Node> ll ,K key) {
            
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        public V Get(K key) {

            int buccketind = Hashfunction(key);
            
            LinkedList<Node> currbucket = Buckets[buccketind];

            int Foundind = SearchinBucket(currbucket, key);
            
            if (currbucket.get(Foundind).key == key) {
                return currbucket.get(Foundind).value;
            }
                //key not found
                return null;
        }
        
        public V Remove(K key) {
            int buccketind = Hashfunction(key);
            
            LinkedList<Node> currbucket = Buckets[buccketind];

            int Foundind = SearchinBucket(currbucket, key);

            if (Foundind != -1) {
                V value = currbucket.get(Foundind).value;
                currbucket.remove(Foundind);
                n--;
                return value;
            }
            System.out.println("Not Found");
            return null;
            
        }


        private void Rehash(int N) {  //N (Capital) is capacity / Size of bucket array
            
            Buckets = new LinkedList[N];

            for (int i = 0; i < Buckets.length; i++) {
                Buckets[i] = new LinkedList<>();

            }
        }
    }
    
    
    
    public static void main(String[] args) {
        hashmap<String, Integer> h1 = new hashmap<>();

        h1.put("A", 1);
        h1.put("B", 2);
        h1.put("C", 3);
        
        System.out.println("Testing size :- "+h1.size());
    

        System.out.println("Deleted value :- "+h1.Remove("C"));
        System.out.println("Deleted value :- " + h1.Remove("A"));
        
        System.out.println("Current size :- "+h1.size());
        
    }
}
