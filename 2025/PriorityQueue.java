class PriorityQueue {
    private int size;
    private Node[] heap;

    //constructor
    public PriorityQueue() {
        size = 0;
        heap = new Node[10];

    }

    // Getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node[] getHeap() {
        return heap;
    }

    public void setHeap(Node[] heap) {
        this.heap = heap;
    }

    public void clear() {
        size = 0;
        heap = new Node[10];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(Node x) {
        if (size >= heap.length) {
            return false; //Heap is full
        }

        int hole = size;
        size++;

        while (hole > 0 && x.getPriority() < heap[(hole - 1) / 2].getPriority()) {
            heap[hole] = heap[(hole - 1)/ 2];
            hole = (hole - 1)/ 2;
        }
        heap[hole] = x;
        return true;
    }

    public Node delete() {
        if (isEmpty()) {
            return null;
        }

        Node min = heap[0];
        heap[0] = heap[--size];
        percolateDown(0);
        return min;
    }

    private void percolateDown(int hole) {
        Node temp = heap[hole];
        int child;

        while ((2 * hole + 1) < size) {
            child = 2*hole + 1;

            //if right child exists and has higher priority than sibling(left)
            if (child+1 < size && heap[child+1].getPriority() < heap[child].getPriority()) {
                child++;
            }

            //if child ahs higher priority than parent
            if (heap[child].getPriority()< temp.getPriority()) {
                heap[hole] = heap[child];
                hole = child;
            } else {
                break;
            }
        }
        heap[hole] = temp;

    }
}



