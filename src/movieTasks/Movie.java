package movieTasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country, title, genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts = new ArrayList<>();

    public void setInfo(String country, String title, String genre, String director, LocalDate releaseDate) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;

    }

    public void addCast(String person){
        casts.add(person);
    }
    public void addCast(String[] cast){
        casts.addAll(Arrays.asList(cast));
    }
    public void addCast(ArrayList<String> casts){
        this.casts.addAll(casts);
    }

    public String toString() {//default locaTime prints 2021-01-12
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/YYYY EEEE");

        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director= " + director + '\'' +
                ", releaseDate= " + releaseDate.format(df) +
                ", number of casts= " + casts.size() +
                '}';
    }
}
/*
Create a class named Movie
    Attributes:
        country (String), title (String), Genre (String), releaseDate (LocalDate), director (String),
        casts (ArrayList<String>)

    Instance methods
        setInfo(): sets the country, title, release date, and director of the Movie
        addCast(String): adds the given string argument to the arrayList casts
        addCast(String[]): adds the given string array argument to the arrayList casts
        addCast(ArrayLis<String>): adds the given string arraylist argument to the arrayList casts
        toString(): returns the name of country, title, release date, and total number of casts

    create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cybertek Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: May/17/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Mehmet, Akbar and 5 more students from your group

            print the full info of the movie
 */