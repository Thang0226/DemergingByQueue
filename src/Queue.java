import java.util.LinkedList;

public class Queue {
	private final LinkedList<Staff> queue;

	public Queue() {
		queue = new LinkedList<>();
	}

	public boolean enqueue(Staff staff) {
		queue.addLast(staff);
		return true;
	}

	public Staff dequeue() {
		if (isEmpty()) {
			return null;
		}
		return queue.removeFirst();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}
}
