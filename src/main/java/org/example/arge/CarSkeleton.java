package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){

    }
    public CarSkeleton(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String startEngine(){
        return (getName() + " has been started.");
    }
    public String drive(){
        return (runEngine()+ " is being driven.");
    }
    protected String runEngine(){
        return getClass().getSimpleName();
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
