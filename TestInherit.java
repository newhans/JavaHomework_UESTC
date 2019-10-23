class SuperClassName{
    int x;
    SuperClassName(){
        x = 3;
        System.out.println("In SuperClass: x = " + x);
    }
    void doSomething(){
        System.out.println("In SuperClass.doSomething()");
    }
}

class SubClass extends SuperClassName{
    int x;
    SubClass(){
        super();
        x = 5 ;
        System.out.println("In SubClass: x = " + x);
    }
  void  doSomething(){
        super.doSomething();
        System.out.println("In SubClass.doSomething()");
        System.out.println("super.x="+super.x+ "  sub.x=" +x);
    }
}

public class TestInherit{
    public static void main(String args[]){

        SubClass a = new SubClass();
        a.doSomething(); 
       }
}