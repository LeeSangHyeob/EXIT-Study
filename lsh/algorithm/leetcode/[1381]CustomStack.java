https://leetcode.com/problems/design-a-stack-with-increment-operation/

class CustomStack {

    int ptr;
	int[] stack;
	
	public CustomStack(int maxSize) {
		stack = new int[maxSize];
		ptr = 0;
	}

	public void push(int x) {
		if(ptr < stack.length) stack[ptr++] = x;
	}

	public int pop() {
		if(ptr > 0) return stack[--ptr];
		else return -1;
	}

	public void increment(int k, int val) {
        if(k > ptr) k = ptr;
		for(int i = 0; i < k; i++) {
			stack[i] += val;
		}
	}
}
