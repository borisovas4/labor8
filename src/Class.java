public class Class {
    static public void main(String[] args) {
        Student student = new Student("asd", "student", 18);
        student.walk();
        student.run();
        student.voice();
        student.learn();
        System.out.println(student.toString());
        Teacher teacher = new Teacher("das", "teacher", 45);
        teacher.walk();
        teacher.run();
        teacher.voice();
        teacher.teach();
        System.out.println(teacher.toString());
    }
}
