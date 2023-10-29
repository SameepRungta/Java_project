class Dog{

String name;
String breed;

    public Dog(String name, String breed){

        this.name=name;
        this.breed=breed;
        
    }
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){

        this.breed=breed;

    }
}



public class dog_CNO {
    public static void main(String[] args){

        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Charlie", "Bulldog");

        System.out.println(dog1.getName()+" "+dog1.getBreed());
        System.out.println(dog2.getName()+" "+dog2.getBreed());

        System.out.println("~~~After Updatation~~~");

        dog1.setBreed("Labrador Retriever");
        dog2.setName("rocky");
        
        System.out.println(dog1.getName()+" "+dog1.getBreed());
        System.out.println(dog2.getName()+" "+dog2.getBreed());

    }
}
