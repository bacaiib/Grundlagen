package Calculator;

import org.w3c.dom.ls.LSOutput;

public class operationen {

//    public operationen(float a, float b) {
//        this.a = a;
//        this.b = b;
//    }

    public operationen() {

    }

//    public void getOP(operationen op){
//        if (op=='/'){
//
//        }
//    }


    public float mul(float a, float b){
        return a*b;
    }

    public float div(float a, float b){
        if (a==0||b==0){
          throw new IllegalArgumentException("Division mit 0 nicht möglich");
        } return a/b;

    }

    public float add(float a, float b){
        return a+b;
    }

    public float sub(float a, float b){
        return a-b;
    }
}
