/* 
Classes and objects
Queue data structures 
*/

import java.io.*;
import java.util.*;

class QueDS {
	int front, rear, capacity;
	int[] Que;

	public QueDS(int c) {
		front = -1;
		rear = -1;
		capacity = c;
		Que = new int[capacity];
	}

	int size() {
		if (isEmpty())
			return 0;
		return rear - front + 1;
	}

	boolean isFull() {
		return (rear == capacity - 1);
	}

	boolean isEmpty() {
		return ((front == -1) || (front > rear));
	}

	void enqueue(int x) {
		if (front == -1)
			front = 0;
		if (!isFull())
			Que[++rear] = x;
		else
			System.out.print("\nFull Queue. Cant insert element.");
	}

	void dequeue() {
		if (!isEmpty())
			front++;
		else
			System.out.print("\nEmpty queue. Cant delete element.");
	}

	void fnDisplay() {
		if (!isEmpty()) {
			System.out.print("\nElements in Queue : ");
			for (int i = front; i <= rear; i++)
				System.out.print(Que[i] + " ");
		}

		else
			System.out.println("\nEmpty Queue. No elements present. ");
	}
}

class QueueImplementation {
	public static void main(String[] as) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter queue size : ");
		int cap = sc.nextInt();
		QueDS q = new QueDS(cap);

		int choice;
		do {
			System.out.print("\nMenu: 1. Enqueue\t2. Dequeue\t3. Exit");
			System.out.print("\nEnter choice : ");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.print("\nEnter element : ");
					int ele = sc.nextInt();
					q.enqueue(ele);
					q.fnDisplay();
					break;
				case 2:
					q.dequeue();
					q.fnDisplay();
					break;
				case 3:
					System.exit(0);
					sc.close();
			}
		} while (true);

	}
}