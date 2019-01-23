public class Solution {
    class node {
        int key;
        int data;
        node next;
        node prev;

        public node(int key,int val) {
            data = val;
            this.key=key;
            
        }
    }
    int capacity;
    node head=null;
    node end=null;
    Map<Integer,node> map=new HashMap<>();
    public Solution(int capacity) {
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            remove(map.get(key));
            SetHead(map.get(key));
            return map.get(key).data;
        }
            return -1;
    }
    
    public void set(int key, int value) {
        if(map.containsKey(key))
        {
            node n=map.get(key);
            n.data=value;
            remove(n);
            SetHead(n);    
        }
        else {
            node n=new node(key,value);
            if(map.size()>=capacity)
            {
                map.remove(end.key);
                remove(end);
                SetHead(n);
            }
            else
            {
                SetHead(n);
            }
            map.put(key,n);
        }
    }
    public void SetHead(node temp) {
         temp.next = head;
        temp.prev = null;
        if (head != null)
            head.prev = temp;
        head = temp;
        if (end == null)
            end = head;
    }
     public void remove(node temp) {
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            end = temp.prev;
        }
    }
}
