
public class inclass {


    public static void main(String[] args) {
        Person myPerson = new Person ("asher", "black");
        System.out.print(myPerson);
        
        
        
        
        
        
        
        
        
    }
    
}

class Person{
    
    String personName;
    String favColor;        
    
    
    public Person(String pName, String pColor){
        this.personName = pName;
        this.favColor = pColor;
        
    }

    
    public void setFavColor(String pColor){
        this.favColor = pColor; 
    }
    @Override
    public String toString(){
       return "name - " + this.personName + " color -" + this.favColor;
    }
}



