/* before you override, both animal and bird instances will call the original getName() function.
after you override, only bird instances will instead use the new overridden getName() function.
this tells us that methods that are overridden are only overridden when called from instances of the subclass that contains the overriding function */
/* the only one that does not work is putting an animal into a bird.
This aligns with the idea of is-a has-a because as a Bird object is-a Animal object, but a Bird object is-not-a Animal object.
therefore, you can store a bird in a animal type, but cannot store an animal in a bird type.*/

public class Driver{
  public static void main(String[] args){
    Animal freshie = new Animal("durrrr", 45, "freshie");
    //freshie.speak();
    Bird birdie = new Bird("chirp", 5, "birdie", 4.3, "black");
    //birdie.speak();
    Animal a1 = new Animal("noisy!", 123, "monkey");
    Bird b1 = new Bird("burp", 51, "pencil", 123.3, "green");
    //Bird b2 = new Animal("belch!", 111, "doggy");
    Animal a2 = new Bird("gasp", 51, "pig", 13.3, "pink");
    a1.speak();
    b1.speak();
    a2.speak();
  }
}
