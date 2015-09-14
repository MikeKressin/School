
package school;

public class School {

    public static void main(String[] args) {
        Person joe = 
        Person.addPerson("Joe",Person.Gender.Male,120);
        Person jill = 
        Person.addPerson("Jill",Person.Gender.Female,105);
        jill.setName("Julie");
        Person billyJoe = 
        Person.addPerson("BillyJoe",Person.Gender.Male,210);
        System.out.println(billyJoe.getWeight());
      
        //Person.printNames();
        
        Person.printNames(Person.Gender.Male);
        System.out.println(billyJoe);
    }
}
