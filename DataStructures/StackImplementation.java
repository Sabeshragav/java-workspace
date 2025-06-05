/* 
Classes and objects
Stack data structures 
*/

import java.io.*;
import java.util.*;

class StkDS {
	int tos, capacity;
	int[] Stk;

	public StkDS(int c) {
		tos = -1;
		capacity = c;
		Stk = new int[capacity];
	}

	int size() {
		return tos + 1;
	}

	boolean isFull() {
		return ((tos + 1) == capacity);
	}

	boolean isEmpty() {
		return (tos == -1);
	}

	void push(int x) {
		if (!isFull())
			Stk[++tos] = x;
		else
			System.out.print("\nFull stack. Cant insert element.");
	}

	void pop() {
		if (!isEmpty())
			tos--;
		else
			System.out.print("\nEmpty stack. Cant delete element.");
	}

	int topandpop() {
		if (!isEmpty())
			return (Stk[tos--]);
		else {
			System.out.print("\nEmpty stack. Cant delete element.");
			return -1;
		}
	}

	void peek() {

		if (!isEmpty())
			System.out.print("\nElement on top of stack is " + Stk[tos]);
		else
			System.out.print("\nEmpty stack. No element present.");
	}

	void fnDisplay() {
		if (!isEmpty()) {
			System.out.print("\nElements in stack : ");
			for (int i = 0; i <= tos; i++)
				System.out.print(Stk[i] + " ");
		} else
			System.out.println("\nEmpty stack. No elements present. ");
	}
}

class StackImplementation {
	public static void main(String[] as) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter stack size : ");
		int cap = sc.nextInt();
		StkDS s = new StkDS(cap);

		int choice;
		do {
			System.out.print("\nMenu: 1. Push\t2. Pop\t3. TopandPop\t4. Peek\t5. Exit");
			System.out.print("\nEnter choice : ");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.print("\nEnter element : ");
					int ele = sc.nextInt();
					s.push(ele);
					s.fnDisplay();
					break;
				case 2:
					s.pop();
					s.fnDisplay();
					break;
				case 3:
					int val = s.topandpop();
					System.out.println("\nDeleted element : " + val);
					s.fnDisplay();
					break;
				case 4:
					s.peek();
					s.fnDisplay();
					break;
				case 5:
					System.exit(0);
			}
		} while (true);
	}
}