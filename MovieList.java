
package movielist;
import java.util.Scanner;

public class MovieList {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String movie, rating;
        int year, runtime;
        Movie favoriteMovie;
        System.out.println("Please enter movie title: ");//ASk for Movie title
        movie = in.nextLine();
        System.out.println("Please enter movie rating: ");//Ask for Movie Rating
        rating = in.nextLine();
        System.out.println("Please enter year produced: ");// ASk for year produced
        year = in.nextInt();
        System.out.println("Please enter total runtime: ");//Ask for Runtime
        runtime = in.nextInt();
        favoriteMovie = new Movie(movie, rating, year, runtime);// Collects all the information in one object/String
        System.out.println(favoriteMovie.toString());//Prints all the information out
    }
    
}
