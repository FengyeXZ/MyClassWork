public class Pet {
    String type;
    String petName;
    int age;

    Pet(String a, String b, int c){
        type = a;
        petName = b;
        age = c;
    }

    void sayHi(){
        System.out.println("I am " + petName + ", is a " + type + " and " + age);
    }

    int addAge(int year){
        age = age + year;
        return age;
    }
    
}
