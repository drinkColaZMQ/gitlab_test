package test;

public class Test3 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();


        new Thread(()->{
            synchronized (a){
                func(10000);
                synchronized (b){
                    System.out.println("hello1");
                }
            }
        }).start();

        new Thread(()->{
            synchronized (b){
                func(10000);
                synchronized (a){
                    System.out.println("hello2");
                }
            }
        }).start();
    }

    public static int func(int n){
        if (n==0){
            return 1;
        }else {
            return n*func(n-1);
        }

    }

}

class A {

}

class B{

}
