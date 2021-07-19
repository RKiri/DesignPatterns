package com.weiyuze.dp.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] arr = {9, 2, 3, 5, 7, 1, 4};
        Cat[] arr = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
        //Dog[] arr = {new Dog(3),new Dog(5),new Dog(1)};

        //Sorter<int> sorter = new Sorter<>();

        Sorter<Cat> sorter = new Sorter<>();

        //Sorter<Dog> sorter = new Sorter<>();

        //Sorter sorter = new Sorter();

        sorter.sort(arr,new CatWeightComparator());

        //sorter.sort(arr,new CatHeightComparator());

        //sorter.sort(arr,new DogComparator());

        //sorter.sort(arr);

        sorter.sort(arr, (o1, o2) -> {
            if (o1.weight>o2.weight)return 1;
            else if(o1.weight<o2.weight)return -1;
            else return 0;
        });
        System.out.println(Arrays.toString(arr));
    }
}
