public class Person {
    private String name;
    private int age;
    private int birthYear;

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        }else{
            System.out.println("Invalid Age.  Setting age to 0");
            this.age = 0;
        }
        this.age = newAge;
    }

    public int getAge() {
        return age;
    }

    public Person(int year) {
        this.birthYear = year;
    }


    public int getBirthYear() {
        return birthYear;
    }

    public static void main (String[] args){
        Person p = new Person(2004);

        p.setName("Matt");
        p.setAge(20);
        System.out.println(p.getName());
        System.out.println(p.getAge());

        p.setAge(-5);
        System.out.println("Age after invalid input: " + p.getAge());
    }
}
