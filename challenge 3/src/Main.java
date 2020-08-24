public class Main {
    public static void main(String[] args) {
        Student studentA = new Student("Iulia", "Golicova", 2020, 3.0,"CSE");
        Student studentB = new Student("Courtney", "Wing", 2018, 4.0, "Sociology");

        studentA.incrementExpectedGraduationYear();

        System.out.println(studentA.graduatingYear);
    }

}
