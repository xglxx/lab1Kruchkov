package mirea2419.lab1.kruchkov;
import java.lang.*;
public class ball {
    private String color;
    private int circuit;
    private double weight;
    public ball(String c,int cir,double w){
        color = c;
        circuit = cir;
        weight =w;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void setRadius(int radius){
        this.circuit = radius;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getColor(){
        return color;
    }
    public int getRadius(){
        return circuit;
    }
    public double getWeight(){
        return weight;
    }
    public String toString() {return "color:"+this.color+",radius:"+this.circuit+",weight:"+this.weight;
    }
}