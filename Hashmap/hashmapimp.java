
import java.util.LinkedList;

class hashmapimp{
    
    static class Mynewhashmap<k,v>{

        public static final int Default_Capacity = 4;
        
        public static final float  Default_load_factor = 0.75f;     //literal
        
        class Node {
            k key;
            v value;

            Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }


        private int n;
        private LinkedList<Node> buckets[];

        
        private void initbuckets(int n) {
            buckets = new LinkedList[n];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        public Mynewhashmap(int n){
            initbuckets(n);
        }

        public int Findhashind(k key) {
            int currbucket = key.hashCode();
            return Math.abs(currbucket) % buckets.length;
        }

        public int size() {
            return n;
        }

        private int SearchinBucket() {
            
        }

        public void put(k key,v value) {
            
        }

    }
    
    
    
    public static void main(String[] args) {
        
    }
}