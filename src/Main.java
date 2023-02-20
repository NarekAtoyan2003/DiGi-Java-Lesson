import model.Student;
import service.StudentService;
import service.FilService;

public class Main {
    public static final String URL = "Baza.txt";
    public static void main(String[] args) throws Exception {

        String[] read = FilService.read(URL);
        Student[] convert = StudentService.convert(read);
        String s = StudentService.bablsort(convert);

        for (int i = 0; i < convert.length; i++) {
            FilService.wrait(convert[i].getName(), convert[i].toString());
        }
    }
}
/* Tnayin
*  1- Krknel nuyn@
*  2- Rerturna talis Max studentin
*  3- Return 1 = String @st Bablsorti
*  4- Stexcel Studentneri fayler*/