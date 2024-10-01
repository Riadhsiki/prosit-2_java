public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int currentCageIndex;
    int nbrAnimal;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.currentCageIndex = 0;
        this.animals = new Animal[nbrCages];
    }
//instruction 8
    public void displayZOO() {
        System.out.println("Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages);
    }
}
