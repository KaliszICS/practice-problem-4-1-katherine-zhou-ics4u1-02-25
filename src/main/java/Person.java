public class Person {
    private String name;
    private double age;
    private int height;
    private int weight;
    private String eyeColour;
    private String hairColour;

    public Person (String name, double age, int height, int weight, String eye, String hair){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight= weight;
        this.eyeColour=eye;
        this.hairColour= hair;
    }

    public String getName(){
        return this.name;
    }

    public double getAge(){
        return this.age;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getHairColour(){
        return this.hairColour;
    }

    public String getEyeColour(){
        return this.eyeColour;
    }


}
