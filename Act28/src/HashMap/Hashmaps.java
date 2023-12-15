package HashMap;

import java.util.HashMap;

public class Hashmaps {

    private HashMap<String, String> game = new HashMap<>();

    public void addToGame(String name, String genre){
        game.put(name, genre);
    }
    public void removeFromGame(String name){
        game.remove(name);
    }
    public String getGenre(String name){
        String genre;
        if (game.containsKey(name)){
            genre = game.get(name);
        } else {
            genre = "Game not found";
        }
        return genre;
    }
    public void displayGame(){
        game.forEach( (name, genre)-> {
            System.out.printf(" Name: %s Genre: %s\n", name, genre);
        });
    }
}
