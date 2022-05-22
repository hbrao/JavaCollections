package hashing;

public class Student {
    private String firstname;

    public Student(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public boolean equals(Object other) {
        if (other.getClass() != Student.class) return false;
        Student otherStudent = (Student)other;
        return otherStudent.firstname.equals(firstname);
    }
    
    @Override
    public int hashCode() {
        return firstname.length();
    }
    
    @Override
    public String toString() {
        return "Student{" + "firstname=" + firstname + '}';
    }
}
