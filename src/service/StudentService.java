package service;

import model.Student;

public class StudentService {


    public static Student[] convert(String[] result){

        Student[] students = new Student[result.length];
        for (int i = 0; i < result.length; i++) {
            Student student = new Student(result[i]);
            students[i] = student;
        }

        return students;
    }

    public static Student max (Student[] a) {
       Student max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max.getAge() < a[i].getAge())
                max = a[i];
        }
        return max;
    }
    public static String bablsort (Student[] rand) {
        Student datarkBajak;
        for (int i = 0; i < rand.length; i++) {
            for (int j = 1; j < rand.length - i; j++) {
                if (rand[j - 1].getAge() > rand[j].getAge()) {
                    datarkBajak = rand[j];
                    rand[j] = rand[j - 1];
                    rand[j - 1] = datarkBajak;
                }
            }
        }
        String a = "";
        for (int i = 0; i < rand.length; i++) {
            a = a + rand[i].getName() + "-" + rand[i].getAge() + "\n";
        }
        return a;
    }
    public static String [] student (Student a) {
        String [] s = new String[2];
        s[0] = a.getName();
        s[1] = a.getName() + " - " + Integer.toString(a.getAge());
        return s;
    }
}
