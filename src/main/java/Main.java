import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        School school = new School("Katolicka", "Torun");
        School school1 = new School("Matematyczna", "Katowice");
        School school2 = new School("Hotelarska", "Bydgoszcz");
        School school3 = new School("Sportowa","Gdansk");

        Student student = new Student("Jan", "Kowalski");
        Student student1 = new Student("Piotr","Nowak");
        Student student2 = new Student("Michal", "Lewandowski");
        Student student3 = new Student("Kamil","Kaminiski");
        Student student4 = new Student("Wladek", "Kosmecki");
        Student student5 = new Student("Ola","Odbolka");
        Student student6 = new Student("Kasia", "Cieslik");
        Student student7 = new Student("Marta","Soltys");


       List<Student> listaSzkola = new ArrayList<>();
       listaSzkola.add(student);
       listaSzkola.add(student1);

       List<Student> listaSzkola1 = new ArrayList<>();
       listaSzkola1.add(student2);
       listaSzkola1.add(student3);

       List<Student> listaSzkola2 = new ArrayList<>();
       listaSzkola2.add(student4);
       listaSzkola2.add(student5);

       List<Student> listaSzkola3 = new ArrayList<>();
       listaSzkola3.add(student6);
       listaSzkola3.add(student7);

        Map<School, List<Student>> map = new HashMap<School, List<Student>>();
        map.put(school,listaSzkola);
        map.put(school1,listaSzkola1);
        map.put(school2,listaSzkola2);
        map.put(school3,listaSzkola3);

        for (Map.Entry<School, List<Student>> entry : map.entrySet())
        {
            System.out.println("Szkoła: " + entry.getKey() + " " + "Studenci: " + entry.getValue());
        }

    }
}
