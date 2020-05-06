package telran.data;

import java.sql.SQLOutput;

public class WaterPipe implements Printable, Stetable{
    @Override
    public void print() {
        System.out.println("I'm pipe");
    }

    @Override
    public void printState(int n) {
//        if(n==OPEN){
//            System.out.println("Water is opened");
//        } else if (n==CLOSED){
//            System.out.println("Water is closed");
//        }else{
//            System.out.println("State is invalid");
//        }
        System.out.println((n==OPEN)?"Water is opened":
                (n==CLOSED)?"Water is closed":"State is invalid");
    }
}
