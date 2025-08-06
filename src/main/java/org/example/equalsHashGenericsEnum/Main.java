package org.example.equalsHashGenericsEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(23.49, 68.99);
        Rectangle rectangle2 = new Rectangle(23.49, 68.99);
        System.out.println(rectangle2.equals(rectangle1));
        System.out.println(rectangle1.hashCode());
        System.out.println(rectangle2.hashCode());
        System.out.println(rectangle2.toString());



        Person person1 = new Person("Andrei",23,"andrei@gmail.com");
        Person person2 = new Person("Andreii",23,"andreii@gmail.com");
        Person person3 = new Person("Andrei",23,"andrei@gmail.com");

        System.out.println(person2.equals(person1));
        System.out.println(person1.equals(person3));



        Student student1 = new Student("Aron",30,"aron@gmail.com");
        Student student2 = new Student("Marius",49,"Marius@gmail.com");
        Student student3 = new Student("Marius",49,"Marius@gmail.com");
        System.out.println(student2.equals(student1));
        System.out.println(student2.equals(student3));
        System.out.println(student1.toString());
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());



        Song song1 = new Song("Moonlight Sonata","Bethoven",30);
        Song song2 = new Song("Moonlight Sonata","Bethoven",30);
        System.out.println(song2.equals(song1));
        System.out.println(song2.hashCode()+" "+ song1.hashCode());


        Product product1 = new Product("Dove",5.99,10);
        Product product2 = new Product("Domestos",9.99,10);
        System.out.println(product1.equals(product2)+ " "+ product1.hashCode()+ " "+ product2.hashCode());

        product2.setId(11);
        System.out.println(product1.equals(product2)+ " "+ product1.hashCode()+ " "+ product2.hashCode());

        LightColor color1 = LightColor.GREEN;
        System.out.println(color1);
        System.out.println(color1.getTime());


        System.out.println("\n\nSimultaing cache");
        List<Entities> entities = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            entities.add(new Entities("Entity-" + i));
        }


        SimulatingCache cache = new SimulatingCache();
        for(Entities ent : entities)
        {
            cache.addToCache(ent);
        }
        cache.printCache();

        Service service = new Service();
        Integer[] arr= {10,20,30,40,50};

        service.swapPositions(arr,2,3);

        for( int i: arr)
        {
            System.out.println(i);
        }

        Pairs<Integer,String> pair1 = new Pairs<>(1000,"ana are mere");
         pair1.getFirst();
        System.out.println(pair1.toString());
    }

}
