public class Student {
    int    rollno;
    String name;
    String address;

    public Student(int rollno , String name , String address) {
        this.rollno  = rollno;
        this.name    = name;
        this.address = address;
    }

    public int getRollno( ) {
        return rollno;
    }

    @Override
    public String toString( ) {
        return "Student: " + "rollno=" + rollno + ", name='" + name + '\'' + ", address='" + address + '\'';
    }
}
