package io.ms.leetcodechallenges.march2022;

import java.util.Stack;

public class SimplyfyPath_71 {

    public static void main(String[] args) {

        String path = "/home/";

        String result = simplifyPath(path);

        System.out.println(result);

    }

    public static String simplifyPath(String path) {

        if(path == null){
            return path;
        }

        String[] splittedPathValue = path.split("\\/");

        Stack<String> stack = new Stack<>();

        for(String current : splittedPathValue){

            if(current.length() ==0 || current.equalsIgnoreCase(".")){
                continue;
            }else if( current.equalsIgnoreCase("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(current);
            }
        }


        String result = "";

        while (!stack.isEmpty()){

            result = stack.pop() +"/"+result;
        }

        if(result.length() ==0){
         return  "/";
        }else{
            return "/"+result.substring(0,result.length()-1);
        }

    }
}
