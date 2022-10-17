package io.ms.leetcodechallenges.september2022;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day19_DuplicateFileInSsytem_609 {


    public static void main(String[] args) {

        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};

        List<List<String>> result = findDuplicate(paths);

        result.stream().forEach( (x) -> x.stream().forEach(System.out::println));
    }



    public static List<List<String>> findDuplicate(String[] paths) {

        Map<String,List<String>> map = new HashMap<>();

        for(String path: paths){
            String[] directory = path.split(" ");
            String rootPath = directory[0];
            for(int i=1;i<directory.length;i++){
                String content = directory[i].substring(directory[i].indexOf("("),directory[i].indexOf(")"));
                 if(!map.containsKey(content)){
                     map.put(content,new ArrayList<>());
                 }
                 map.get(content).add(rootPath+"/"+directory[i].substring(0,directory[i].indexOf("(")));
            }
        }

        List<List<String>> result = new ArrayList<>();

        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            if(entry.getValue().size()>1){
                result.add(entry.getValue());
            }
        }

        return result;
    }
}
