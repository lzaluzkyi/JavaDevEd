package scaner;

public class StudentGroup {

    String name;

    Student[] students;

    public StudentGroup(String name) {
        this.name = name;
        this.students = new Student[5];
    }

    public void delete(String name){
        for (int i = 0; i < this.students.length; i++) {

            if (this.students[i] == null){
                continue;
            }
            if (this.students[i].getName().equals(name)){
                this.students[i] = null;
                break;
            }
        }
    }

    public void add(Student student){
        boolean isAdded = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = student;
                isAdded = true;
                break;
            }
        }

        if (!isAdded){
            Integer newLength = this.students.length * 2;
            Student[] students = new Student[newLength];
            int i = 0;
            for (; i < this.students.length; i++) {
                students[i] = this.students[i];
            }
            students[i] = student;
            this.students = students;
        }
    }

    public void findStudent(String name){
        Student[] students = this.students;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                continue;
            }
            if (students[i].getName().equals(name)){
                System.out.println("Yes this student present is group");
                return;
            }
        }
        System.out.println("No this student not present is group");
    }

    public void printInfo(){
        System.out.println("in group " + this.name + " next student");
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {continue;}
            System.out.println(students[i].getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
