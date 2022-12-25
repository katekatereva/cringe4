package myexception;

public class Umer extends RuntimeException{
    public Umer(String name){
        super(name + " умер");
    }
}
