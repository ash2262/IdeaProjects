package Ques2;

interface Scaler{
    void myMethod();
    void getInfo();
}


abstract class IB implements Scaler{

    void getData(){
        System.out.println("IB");
    }
}

