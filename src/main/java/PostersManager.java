public class PostersManager {
    private String[] movies = new String[0];
    private int limit;

    public PostersManager() {
        this.limit = 5;
    }

    public PostersManager(int limit) {
        this.limit = limit;
    }


    public void addMovie(String movie) {
        String[] mov = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            mov[i] = movies[i];
        }
        mov[mov.length - 1] = movie;
        this.movies = mov;

    }

    public String[] findAll() {
        return movies;
    }


    public String[] findLast() {

        int result;

        if (movies.length < limit) {
            result = movies.length;
        } else {
            result = limit;
        }


        String[] mov = new String[result];
        for (int i = 0; i < mov.length; i++) {
            mov[i] = movies[movies.length - 1 - i];
        }
        return mov;
    }

}


