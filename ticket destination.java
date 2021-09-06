package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    static void printroute(HashMap<String,String> m)
    {
        String s ="";
        HashMap<String,String> h=new HashMap<>();
        for(Map.Entry<String,String> entry : m.entrySet())
        {
            h.put(entry.getValue(),entry.getKey());
        }
        for(Map.Entry<String,String> entry : m.entrySet())
        {
            if(!h.containsKey(entry.getKey()))
            {
                s=entry.getKey();
                break;
            }
        }
        while(m.containsKey(s))
        {
            System.out.print(s+"->"+m.get(s)+",");
            s=m.get(s);

        }






    }
    public static void main(String[] args) {
	// write your code here
        HashMap<String,String> route=new HashMap<>();
        route.put("Chennai","Banglore");
        route.put("Bombay","Delhi");
        route.put("Goa","Chennai");
        route.put("Delhi","Goa");
        printroute(route);
    }
}
