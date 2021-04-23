class CustomStack {
    List<Integer> ls;
    int maxSize;
    public CustomStack(int maxSize) {
        this.ls = new ArrayList<>();
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(ls.size() < maxSize)ls.add(x);
    }
    
    public int pop() {
        int size = ls.size();
        if(size == 0) return -1;
        int t = ls.get(size-1);
        ls.remove(size-1);
        return t;
    }
    
    public void increment(int k, int val) {
        int size = Math.min(ls.size(),k);
        for(int i=0;i<size;i++) {
            ls.set(i,ls.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
