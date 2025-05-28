import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\georg\\IdeaProjects\\Trees\\src\\natNums");
            Scanner scanner = new Scanner(file);
            int bstCount = 1;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("#");
                String[] numbers = parts[0].split(",");


                int k;
                if (parts.length > 1 && !parts[1].trim().isEmpty()) {
                    try {
                        k = Integer.parseInt(parts[1].trim());
                    } catch (NumberFormatException e) {
                        k = -1; //invalid if not a number
                    }
                } else {
                    k = -1; // No k value provided
                }

                BinarySearchTree bst = new BinarySearchTree();
                for (String numStr : numbers) {
                    try {
                        int num = Integer.parseInt(numStr.trim());
                        bst.insert(new Node(num));
                    } catch (NumberFormatException e) {
                    }
                }

                if (k > 0) {
                    try {
                        int kthSmallest = bst.find_kth_smallest(k);


                        String suffix;
                        if (k == 1) {
                            suffix = "st";
                        } else if (k == 2) {
                            suffix = "nd";
                        } else if (k == 3) {
                            suffix = "rd";
                        } else {
                            suffix = "th";
                        }

                        System.out.println("BST " + bstCount + ": k = " + k +
                                " and " + k + suffix + " smallest node = " + kthSmallest);
                    } catch (IllegalArgumentException e) {
                        System.out.println("BST " + bstCount + ": k = " + k + " - Input not valid");
                    }
                } else {
                    System.out.println("BST " + bstCount + ": No valid k value provided");
                }

                bstCount++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not find the file.");
        }
    }
}