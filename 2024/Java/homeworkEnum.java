import java.util.Scanner;

public class homeworkEnum {
        // Define the enum with days of the week
        public enum DayOfWeek {
            Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        }

    public static void main(String[] args) {
        // Display each day of the week
        displayDay(DayOfWeek.Monday);
        displayDay(DayOfWeek.Tuesday);
        displayDay(DayOfWeek.Wednesday);
        displayDay(DayOfWeek.Thursday);
        displayDay(DayOfWeek.Friday);
        displayDay(DayOfWeek.Saturday);
        displayDay(DayOfWeek.Sunday);
    }

    public static void displayDay(DayOfWeek day) {
        if (day == DayOfWeek.Saturday || day == DayOfWeek.Sunday) {
            System.out.println(day.toString().toLowerCase());
        } else {
            System.out.println(day);
                }
            }
        }
    
