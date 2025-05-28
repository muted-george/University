import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        // Read tasks from file and build the heap
        try {
            File file = new File("C://Users//georg//IdeaProjects//last term 2//src//tasks");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Skip empty lines and comments
                if (line.isEmpty()) {
                    continue;
                }

                // Split the line by commas
                String[] parts = line.split(",");

                if (parts.length == 4) {
                    int task_id = Integer.parseInt(parts[0].trim());
                    String task_description = parts[1].trim();
                    int priority = Integer.parseInt(parts[2].trim());
                    int duration = Integer.parseInt(parts[3].trim());

                    Node task = new Node(task_id, task_description, priority, duration);
                    pq.insert(task);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: file was not found.");
            return;
        }

        //priority = highest to lowest
        System.out.println("|--------------------------------------------------------------------|");
        System.out.println("| Order | Task ID | Task Description     | Priority | Duration (min) |");
        System.out.println("|-------|---------|----------------------|----------|----------------|");

        int order = 1;
        PriorityQueue tempQueue = new PriorityQueue();

        // had to use print formatted in order to get it into table form
        while (!pq.isEmpty()) {
            Node task = pq.delete();
            //%-5d means left align integer
            //%d - integer; %s - string; %f - floating poitn
            System.out.printf("| %-5d | %-7d | %-20s | %-8d | %-14d |\n",
                    order++, task.getTaskId(), task.getTaskDescription(),
                    task.getPriority(), task.getDurationInMinutes());
            System.out.println("|--------------------------------------------------------------------|");

            tempQueue.insert(task);

        }

    }
}