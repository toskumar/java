package com.dp.behavior.iterator;

interface MyIterator {

	public boolean hasNext();

	public Object next();
}

class MyIteratorImpl implements MyIterator {

	Stack stack;
	
	int current = 0;

	public MyIteratorImpl(Stack stack) {
		this.stack = stack;
	}

	@Override
	public boolean hasNext() {
		if (this.current <= this.stack.position()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		if (this.hasNext()) {
			return this.stack.elements()[this.current++];
		}
		return null;
	}
}

interface Stack {
	public void push(Object obj);

	public Object pop();

	public Object[] elements();

	public int position();

	public int size();
	
	public MyIterator iterator();
}

class StackImpl implements Stack {

	Object[] elements;
	int pos = -1;
	int size = 0;

	public StackImpl(int size) {
		this.elements = new Object[size];
		this.size = size;
	}

	@Override
	public Object[] elements() {
		return this.elements;
	}

	@Override
	public int position() {
		return pos;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void push(Object obj) {
		if (pos < size) {
			pos++;
			this.elements[pos] = obj;
		}
	}

	@Override
	public Object pop() {
		Object obj = null;
		if (pos > -1) {
			obj = this.elements[pos];
			this.elements[pos] = null;
			pos--;
		}
		return obj;
	}

	public MyIterator iterator() {
		return new MyIteratorImpl(this);
	}
}