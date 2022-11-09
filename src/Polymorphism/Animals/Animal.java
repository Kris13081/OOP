package Polymorphism.Animals;

public class Animal {

    private String name;
    private String favouriteFood;

    public Animal(String name, String favouriteFood) {
        setName(name);
        setFavouriteFood(favouriteFood);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    private void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String explainSelf(){
        return  String.format("I am %s and my favourite food is %s",
                getName(),
                getFavouriteFood());
    }

}
