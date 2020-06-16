package movies;

public class Movie {


    //making an instance of name and category
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

    //getter for category
    public String getCategory(){
        return this.category;
    }

    //setter for category
    public void setCategory(String category) {
        this.category = category;
    }

    //constructor that sets both of names/categories
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String movieFormat(){
        return name + " -- " + category;
    }


}
