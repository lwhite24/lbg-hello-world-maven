package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Lee"));
        System.out.println(sayHelloToSomeone("Suzy"));
        System.out.println(sayHelloToSomeone("Sadie"));
        System.out.println(sayHelloToSomeone("Evie"));
        System.out.println(sayHelloToSomeone("Mabel"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
