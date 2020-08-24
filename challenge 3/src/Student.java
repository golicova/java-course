public class Student {
    String firstName;
    String lastName;
    int graduatingYear;
    double GPA;
    String declearedMajor;

    // constructor
    public Student (String firstName, String lastName,
                    int graduatingYear, double GPA,
                    String declearedMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduatingYear = graduatingYear;
        this.GPA = GPA;
        this.declearedMajor = declearedMajor;
    }

    // function
    public int incrementExpectedGraduationYear() {
        graduatingYear++;
        return graduatingYear;
    }
}
