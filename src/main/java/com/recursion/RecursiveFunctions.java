package com.recursion;

import java.util.List;

public class RecursiveFunctions {

    public static int recursiveIndexOf(List<String> list, String target) {
        if (list.isEmpty()){
            return -1;
        }
        if (target.equals(list.get(0))){
            return 0;
        }
        int subIndex= recursiveIndexOf(list.subList(1, list.size()),target);
        if (subIndex==-1){
            return -1;
        }else{
            return subIndex+1;
        }
    }

    public static int recursiveIndexOfByIndex(List<String> list, String target, int index) {
        if (index >= list.size()){
            return -1;
        }
        if (target.equals(list.get(index))){
            return index;
        }
        return recursiveIndexOfByIndex(list,target,index+1);
    }

    public static int recursiveIndexOfEmpty(List<String> list) {
        String vacio="";
        if (list.isEmpty()){
            return -1;
        }
        if(vacio.equals(list.get(0))){
            return 0;
        }
        int subIndex= recursiveIndexOfEmpty(list.subList(1,list.size()));
        if (subIndex==-1){
            return -1;
        }else{
            return subIndex+1;
        }
    }

    public static int recursivePut(String target, List<String> list) {
        String vacio="";
        if (list.isEmpty()){
            return -1;
        }
        if (vacio.equals(list.get(0))){
            list.set(0,target);
            return 0;
        }
        int subIndex= recursivePut(target,list.subList(1,list.size()));
        if (subIndex != -1) {
            return subIndex+1;
        }else{
            return -1;
        }

    }

    public static int recursiveRemove(List<String> list, String target) {
        if (list.isEmpty()){
            return 0;
        }
        int contador=0;
        if(target.equals(list.get(0))){
            list.remove(0);
            contador=1;
        }else{
            contador += recursiveRemove(list.subList(1, list.size()), target);
            return contador;
        }
        contador+= recursiveRemove(list,target);
        return contador;
    }

    public static int recursiveSum(List<Integer> list) {
        if (list.isEmpty()){
            return 0;
        }
        return list.get(0)+recursiveSum(list.subList(1, list.size()));
    }

    public static int recursiveFactorial(int n) {
        if(n==0){
            return 1;
        }
        return n* recursiveFactorial(n-1);
    }

    public static int recursivePow(int base, int exponent) {
        if(exponent==0){
            return 1;
        }
        return base * recursivePow(base,exponent-1);
    }

    public static int recursiveFibonacci(int n) {
        if(n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
    }

    public static boolean recursivePalindrome(String word) {
        if(word.length()<=1){
            return true;
        }
        if(word.charAt(0)!=word.charAt(word.length()-1)){
            return false;
        }
        return recursivePalindrome(word.substring(1,word.length()-1));
    }


}
