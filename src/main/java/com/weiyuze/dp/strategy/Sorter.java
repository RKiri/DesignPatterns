package com.weiyuze.dp.strategy;

//public class Sorter {
public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {

                minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    public void sort(Comparable[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            int minPos = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                minPos =  arr[j].compareTo(arr[minPos])==-1 ? j : minPos;
//            }
//            swap1(arr, i, minPos);
//        }
//    }
//
//    void swap1(Comparable[] arr, int i, int j) {
//        Comparable temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
}
