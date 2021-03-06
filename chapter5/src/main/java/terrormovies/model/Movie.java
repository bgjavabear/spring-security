package terrormovies.model;

public class Movie {
    private String name;
    private String budget;

    public Movie(String name, String budget) {
        super();
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public String getBudget() {
        return budget;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", budget='" + budget + '\'' +
                '}';
    }
}
