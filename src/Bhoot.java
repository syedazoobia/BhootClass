public class Bhoot {
    boolean isvisible;
    String name;
    int age;
    String location;
    

    Bhoot(boolean isvisible, String name, int age, String location){
        this.isvisible = isvisible;
        this.name = name;
        this.age = age;
        this.location =location;
    }

    public void disappear(){
        isvisible = false;
        System.out.println(name+" has disappeared into darkness...");
    }

      public void appear(){
        System.out.println(name+ " is APPEAR! HEHEHHEHEH");
    }

    public void fight(){
        System.out.println(name +" is FIGHTING fiercely!");
    }
    public void haunt(){
        System.out.println("hahahahahhuhuhuhuhehhehhehheheheh");
    }
    public void speak(){
        System.out.println("MAI TUM SAB KO KAHA JAO GA! HAHHAHAHHA");
    }

    public void display(){
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
        System.out.println("ISVISIBLE: "+isvisible);
        System.out.println("LOCATION: "+location);
    }
}
