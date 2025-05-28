/***
 Mutevhani
 Takudzwa
 4428917
 CSC211 2025 Practical 2
 HospitalManagementSystem.java
 */
import java.util.*;
class HospitalManagementSystem {
    private Node head;

    // Admit a patient at the end
    public void admitPatient(Patient patient) {
        Node newNode = new Node(patient);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(newNode);
        }
        System.out.println(patient.getName() + " has been admitted into the hospital.");
        System.out.println(" ");
    }

    // Admit a patient before another patient
    public void admitBefore(Patient newPatient, int patientID) {
        Node newNode = new Node(newPatient);
        if (head == null) {
            System.out.println("No patients on list.");
            return;
        }
        if (head.getPatient().getPatientId() == patientID) {
            newNode.setNextNode(head);
            head = newNode;
            System.out.println(newPatient + " has been admitted to the hospital.");
            return;
        }
        Node temp = head;
        while (temp.getNextNode() != null && temp.getNextNode().getPatient().getPatientId() != patientID) {
            temp = temp.getNextNode();
        }
        if (temp.getNextNode() == null) {
            System.out.println("ID not found.");
        } else {
            newNode.setNextNode(temp.getNextNode());
            temp.setNextNode(newNode);
            System.out.println("Patient admitted.");
        }
    }

    // Search for a patient
    public Patient searchPatient(int patientID) {
        Node temp = head;
        while (temp != null) {
            if (temp.getPatient().getPatientId() == patientID) {
                return temp.getPatient();
            }
            temp = temp.getNextNode();
        }
        System.out.println("Patient not found.");
        return null;
    }

    // remove a patient
    public void dischargePatient(int patientID) {
        if (head == null) {
            System.out.println("No patients to remove.");
            return;
        }
        if (head.getPatient().getPatientId() == patientID) {
            head = head.getNextNode();
            //System.out.println("Patient discharged successfully.");
            return;
        }
        Node temp = head;
        while (temp.getNextNode() != null && temp.getNextNode().getPatient().getPatientId() != patientID) {
            temp = temp.getNextNode();
        }
        if (temp.getNextNode() == null) {
            System.out.println("Patient not found.");
        } else {
            temp.setNextNode(temp.getNextNode().getNextNode());
            System.out.println("Patient discharged successfully.");
        }
    }

    // List all patients
    public void listAllPatients() {
        if (head == null) {
            System.out.println("No patients on the list.");
            return;
        }

        System.out.println("All patients in the hospital after sorting:");
        System.out.println(" ");

        Node temp = head;
        while (temp != null) {
            Patient patient = temp.getPatient();
            System.out.println("Patient: " + patient.getName() + " (treated by " + patient.getDoctor() + ", Patient ID: " + patient.getPatientId() + ")");
            temp = temp.getNextNode();
        }
    }

    //sort list in ID order
    public void sortRecords() {
        if (head == null || head.getNextNode() == null) {
            System.out.println("Nothing to sort");
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            Node prev = null;

            while (current != null && current.getNextNode() != null) {
                Node next = current.getNextNode();

                if (current.getPatient().getPatientId() > next.getPatient().getPatientId()) {
                    // Swap nodes
                    if (prev == null) {
                        // Swap head node
                        head = next;
                    } else {
                        prev.setNextNode(next);
                    }

                    current.setNextNode(next.getNextNode());
                    next.setNextNode(current);

                    swapped = true;

                    prev = next;
                } else {
                    prev = current;
                    current = next;
                }
            }
        } while (swapped);

    }

    // Count total patients
    public int totalPatients() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.getNextNode();
        }
        return count;
    }

    // Main method to run my system
    public static void main(String[] args) {
        HospitalManagementSystem system = new HospitalManagementSystem();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Welcome to the new Hospital Management System");
        System.out.println(" ");

        while (true) {
            System.out.println("1. Admit patient");
            System.out.println("2. Admit patient before a specific patient ID");
            System.out.println("3. Search patient by patient ID");
            System.out.println("4. Discharge patient by patient ID");
            System.out.println("5. List all patients");
            System.out.println("6. Sort patients by patient ID");
            System.out.println("7. Count total patients");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 8) {
                System.out.println("Bye.");
                break;
            }

            //when they choose an option

            switch (choice) {
                case 1:


                    System.out.print("Enter patient ID: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter doctor’s name: ");
                    String doctor = scanner.nextLine();

                    system.admitPatient(new Patient(name, age, doctor, patientId  ));
                    break;

                case 2:
                    System.out.print("Enter new patient ID: ");
                    int newPId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new patient name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter existing patient ID to insert before: ");
                    int beforeId = scanner.nextInt();
                    system.admitBefore(new Patient(newName, 0, "", newPId), beforeId);
                    break;

                case 3:
                    System.out.print("Enter patient ID to search: ");
                    int searchId = scanner.nextInt();
                    Patient found = system.searchPatient(searchId);
                    if (found != null) {
                        System.out.println("Patient found: Patient: " + found);
                    }
                    break;

                case 4:
                    System.out.print("Enter patient ID to discharge: ");
                    int dischargeId = scanner.nextInt();
                    Patient patientToDischarge = system.searchPatient(dischargeId);
                    if (patientToDischarge != null) {
                        system.dischargePatient(dischargeId);
                        System.out.println("Patient discharged: Patient: " + patientToDischarge.getName() + " (treated by " + patientToDischarge.getDoctor() + ", Patient ID: " + patientToDischarge.getPatientId() + ")");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 5:
                    system.listAllPatients();
                    break;

                case 6:
                    system.sortRecords();
                    System.out.println("All patients in the hospital after sorting:");
                    System.out.println(" ");
                    system.listAllPatients(); // Display the sorted list
                    break;

                case 7:
                    System.out.println("Total number of patients in the hospital: " + system.totalPatients());
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }


        }
    }
}