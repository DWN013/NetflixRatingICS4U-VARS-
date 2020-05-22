/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Movie
{
    private int movieId;
    public String title, genres[];
    private ArrayList<Double> movieRating = new ArrayList();
    public double averageRating = 0, totalRating = 0;
    public Movie (int m, String t,String [] g)
    {
        movieId = m;
        title = t;
        genres = g;
    }
    public void addRating(double r){
        movieRating.add(r);
        totalRating+=r;
        averageRating = totalRating/movieRating.size();
    }
    public double getAverageRating(){
        return averageRating;
    }
    public String getTitle(){
        return title;
    }
    
}