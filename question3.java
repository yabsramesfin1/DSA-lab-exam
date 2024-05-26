class CircularQueue {
    private int[] queue;
    private int head;
    private int tail;
    private int size;
    private int capacity;
    public CircularQueue(int k) {
    capacity = k;
    queue = new int[capacity];
    head = -1;
    tail = -1;
    size = 0;
    }
    public boolean enqueue(int value) {
    if (isFull()) return false;
    if (isEmpty()) head = 0;
    tail = (tail + 1) % capacity;
    queue[tail] = value;
    size++;
    return true;
    }
    public boolean dequeue() {
    if (isEmpty()) return false;
    if (head == tail) {
    head = -1;
    tail = -1;
    } else {
    head = (head + 1) % capacity;
    }
    size--;
    return true;
    }
    public int front() {
    return isEmpty() ? -1 : queue[head];
    }
    public int rear() {
    return isEmpty() ? -1 : queue[tail];
    }
    public boolean isEmpty() {
    return size == 0;
    }
    public boolean isFull() {
    return size == capacity;
    }
    public static void main(String[] args) {
    CircularQueue q = new CircularQueue(3);
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.dequeue();
    q.enqueue(4);
    System.out.println(q.front()); // returns 2
    System.out.println(q.rear()); // returns 4
    }
    }