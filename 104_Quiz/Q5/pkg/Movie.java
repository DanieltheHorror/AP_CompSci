package pkg;

public class Movie{
    
    String name;
    double rating;
    int numratings;
    int revenue;
    
    public Movie() {
        name = "Avengers";
        rating = 8.0;
        numratings = 33;
        revenue = 623357910;
    }
    
    public Movie(String n, double r, int num, int rev) {
        name = n;
        rating = r;
        numratings = num;
        revenue = rev;
    }
        
    }
    

    
    public void movieToString() {
        System.out.println("Movie: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Number of ratings: " + numratings);
        System.out.println("Revenue: " + revenue);
        System.out.println("");
    }
    
    public String getMovieName() {
        return name;
    }
    
    public int getRevenue() {
        return revenue;
    }
    
    public double getRating() {
        return rating;
    }
    
    public void addRating(double a) {
        rating = rating * numratings;
        rating = rating + a;
        numratings = numratings + 1;
        rating = rating / numratings;
    }
    
    public boolean compareRatings(Movie r) {

        if (rating != r.getRating()) {
            if (rating >= r.getRating()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    

    
}
