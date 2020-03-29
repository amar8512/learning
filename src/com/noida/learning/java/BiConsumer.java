package com.noida.learning.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class BiConsumer {
    public static void main(String[] args) {
        List<String>  list = Arrays.asList("Cat","Dog","Hen","Donkey","Cow");

        Consumer<String> listConsumer =(String name)->{
                if(name.equals("Dog")){
                    System.out.println("Yo have a loyal pet , it will stay with you!!!");
                }
        };
        Consumer<String> consumerDog = (String name)->{
          //  System.out.println("It can be of any breed!!!");
        };
        list.forEach(listConsumer.andThen(consumerDog));

    }
}
