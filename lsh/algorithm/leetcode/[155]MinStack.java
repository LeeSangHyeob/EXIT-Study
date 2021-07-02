class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> min = new Stack<Integer>();

	public MinStack() {
	}

	public void push(int val) {
		stack.push(val);
		if (min.size() != 0) {
			min.push(min.peek() > val ? val : min.peek());
		} else {
			min.push(val);
		}
	}

	public void pop() {
		stack.pop();
		min.pop();
	}

	public int top() {
		if (stack.size() == 0)
			return -1;
		return stack.peek();
	}

	public int getMin() {
		if (min.size() == 0)
			return -1;
		return min.peek();
	}
}
