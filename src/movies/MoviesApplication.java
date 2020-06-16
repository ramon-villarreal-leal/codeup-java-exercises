package movies;

import util.Input;


//Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        //start of text prompt
        System.out.println("What would you like to do! \n");

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");

        Movie[] movieList = MoviesArray.findAll();
        System.out.println(movieList);
        boolean exitZero = true;


        do {
            System.out.println("Enter your choice: ");
            int userInput = input.getInt();
            //select 0 exit
            if (userInput == 0) {
                exitZero = false;
                //select 1 show all movies
            } else if (userInput == 1) {
                for (Movie movie : movieList) {
                    System.out.println(movie.movieFormat());
                }
                //select 2 show all animation movies
            } else if (userInput == 2) {
                    for (Movie movie : movieList) {
                        if(movie.getCategory().equals("animated")) {
                            System.out.println(movie.movieFormat());
                        }
                    }
                //select all drama movies and display them
            } else if(userInput == 3) {
                for (Movie movie : movieList) {
                    if(movie.getCategory().equals("drama")) {
                        System.out.println(movie.movieFormat());
                    }
                }
                //display all horror movies with button click
            } else if(userInput == 4) {
                for (Movie movie : movieList) {
                    if(movie.getCategory().equals("horror")) {
                        System.out.println(movie.movieFormat());
                    }
                }
                //display all scifi movies
            } else if(userInput == 5) {
                for (Movie movie : movieList) {
                    if(movie.getCategory().equals("scifi")) {
                        System.out.println(movie.movieFormat());
                    }
                }
            }


        } while (exitZero);

//        for(Movie movie : movieList) {
//            System.out.println(movie.movieFormat());
//        }


        // Enter input of user that will display information.


    }
}
