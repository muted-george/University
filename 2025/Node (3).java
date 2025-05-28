/***
 Mutevhani
 Takudzwa
 4428917
 CSC211 2025 Practical 2
 Node.java
 */

class Node {
    private Patient patient;
    private Node nextNode;

    //constructor
    public Node(Patient patient) {
        this.patient = patient;
        this.nextNode = null;
    }

    public Patient getPatient() {
        return patient;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public String toString() {
        return "Node containing: " + patient.toString();
    }
}
