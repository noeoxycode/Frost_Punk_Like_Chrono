package org.example;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        System.out.println( "Hello World!" );

        Game game = new Game("title test", LocalDateTime.now(),  10, 10, 10, 10, 10);
        ProductorBuilding newProd = new ProductorBuilding("title", "imgLink", 5, 5,
                5, 5, 5, 5, 5, 5, Ressources.Gold, 5);
        System.out.println(game.getWood());
        game.setGold(newProd.producingRessource());
        System.out.println(game.getWood());
    }


}
