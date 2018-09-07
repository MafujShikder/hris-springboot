package com.hisptz.hris.core.Model.rest;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * Created by Guest on 9/5/18.
 */
public class Sorting {
//
//    public List<Map<String, String>> sorting(List<Map<String, String>> results, String sort){
//        if (sort.equalsIgnoreCase("asc")){
//            results.sort(new Comparator<Map<String, String>>() {
//                @Override
//                public int compare(Map<String, String> o1, Map<String, String> o2) {
//                    return compareT(o1, o2, sort);
//                }
//            });
//            return results;
//        } else if (sort.equalsIgnoreCase("desc")){
//            results.sort(new Comparator<Map<String, String>>() {
//                @Override
//                public int compare(Map<String, String> o1, Map<String, String> o2) {
//                    return compareT(o1, o2, sort);
//                }
//            });
//            return results;
//        } else {
//            return results;
//        }
//    }
//    public int compareT(Map<String, String> o1, Map<String, String> o2, String sort) {
//        if (sort.equalsIgnoreCase("asc")) {
//            if (o1.getId() < o2.getId()) {
//                return -1;
//            } else if (o1.getId() > o2.getId()) {
//                return 1;
//            }
//        } else if (sort.equalsIgnoreCase("desc")) {
//            if (o1.getId() > o2.getId()) {
//                return -1;
//            } else if (o1.getId() < o2.getId()) {
//                return 1;
//            }
//        }
//        return 0;
//    }
}
