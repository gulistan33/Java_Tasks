package movieTasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieObject {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setInfo("USA","Journey to SDET: Cybertek Betch23","Comedy","Muhtar",
                LocalDate.of(2021,05,17));

        String[] casts = {"mehmet","Akber"};
        movie1.addCast("Asiya");
        movie1.addCast(casts);

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Dilem","Ahmet","Tugba","Feruza","Nazli"));

        movie1.addCast(students);

        System.out.println(movie1);
    }
}
