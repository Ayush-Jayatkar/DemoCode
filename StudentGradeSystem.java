public class StudentGradeSystem {

    public static void main(String[] args) {

        String name = "Ayush";

        // Hardcoded subject marks (Jenkins cannot take user input)
        double[] marks = {85, 78, 92, 88};

        double total = 0;
        int subjects = marks.length;

        for (int i = 0; i < subjects; i++) {
            total += marks[i];
        }

        double average = total / subjects;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n--- Result ---");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}
