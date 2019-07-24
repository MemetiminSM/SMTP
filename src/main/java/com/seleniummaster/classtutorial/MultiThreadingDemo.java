package com.seleniummaster.classtutorial;



public class MultiThreadingDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("This is multi threading demo");

      // Calculator.main(new String[] {});
    }
    public static  void main(String[] args){

    MultiThreadingDemo multiThreadingDemo=new MultiThreadingDemo();
//define thread1
        Thread  thread1=new Thread(multiThreadingDemo,"Thread one");
        //define thread2
        Thread   thread2=new Thread(multiThreadingDemo,"Thread two");
        System.out.println(thread1.getId());//return id of the thread
        System.out.println(thread1.getName());//return the name of the thread
        System.out.println(thread2.getId());//return id of the thread
        System.out.println(thread2.getName());//return the name of the thread

        thread1.start();
        thread2.start();
}

}
