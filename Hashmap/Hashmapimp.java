package Hashmap;

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
    

        private int Hashfunction(K key) {
            
            int hashind = key.hashCode();
            
            return Math.abs(hashind) % Buckets.length;
        }

        public int size() {
            return n;

        }
        
        public void put(K key, V value) {

            int Hashindex = Hashfunction(Key);

        }
        
        public V Get(K key) {

            return null;

        }
        
        public V Remove(K key) {
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
        
    }
}
