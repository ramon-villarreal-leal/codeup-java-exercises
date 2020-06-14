package movies;

public class Movie {

    //making an instance of name and movies
    private String name;
    private String category;

    //getter for name above
    public String getName(){
        return this.name;
    }

    //setter for name above
    public void setName(String name){
        this.name = name;
    }

    //getter for movies
    public String getCategory(){
        return this.category;
    }

    //setter for movies
    public void setCategory(String category) {
        this.category = category;
    }

    //constructor that sets both of names/categories
    public Movie(String name, String category) {
        System.out.println(name + " -- " + category);
    }


}
