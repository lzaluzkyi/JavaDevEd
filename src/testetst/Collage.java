package testetst;

import java.util.Arrays;

public class Collage {

   private Student[] students;


   private Integer firstFreePlace = 0;

    public Collage() {
        this.students = new Student[1];
    }



    public boolean addStudent(Student student){
        if (firstFreePlace < this.students.length){
            this.students[firstFreePlace] = student;
            firstFreePlace++;
            print();
            return true;
        }
        int index = this.students.length;
        this.students = Arrays.copyOf(this.students, (int) (this.students.length * 1.5)+1);
        this.students[index] = student;
        firstFreePlace++;
        print();
        return true;
    }

    public void print(){
        System.out.println(Arrays.deepToString(this.students));
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
