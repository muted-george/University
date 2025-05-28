class Node {
    private int task_id;
    private String task_description;
    private int priority;
    private int durationInMinutes;

    // Default constructor
    public Node() {
        this.task_id = 0;
        this.task_description = null;
        this.priority = 0;
        this.durationInMinutes = 0;
    }

    // Loaded constructor
    public Node(int task_id, String task_description, int priority, int durationInMinutes) {
        this.task_id = task_id;
        this.task_description = task_description;
        this.priority = priority;
        this.durationInMinutes = durationInMinutes;
    }

    // Getters
    public int getTaskId() {
        return task_id;
    }

    public String getTaskDescription() {
        return task_description;
    }

    public int getPriority() {
        return priority;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    // Setters
    public void setTaskId(int task_id) {
        this.task_id = task_id;
    }

    public void setTaskDescription(String task_description) {
        this.task_description = task_description;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}
