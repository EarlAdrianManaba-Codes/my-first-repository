public class Main {
    public static void main(String[] args) {
   
        Movie movie1 = new Movie();
        movie1.title = "Titanic";     
        movie1.genre = "Romance/Drama";      
        movie1.duration = 314;   

        Movie movie2 = new Movie();
        movie2.title = "Parasite";
        movie2.genre = "Thriller/Drama";
        movie2.duration = 212;

        Movie movie3 = new Movie();
        movie3.title = "Toy Story";
        movie3.genre = "Animation/Comedy/Adventure";
        movie3.duration = 121;

        movie1.displayInfo();
        movie2.displayInfo();
        movie3.displayInfo();
    }
}
