/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author arulpeter
 */
public class ShoutBox {
    //Hashmap <key, value>
    Map<Integer, String> msgout;
    
    public void setMap() {
        msgout = new HashMap<>(); 
        msgout.put(1, "Java: write once, run away!"); 
        msgout.put(2, "When debugging, novices insert corrective code; experts remove defective code."); 
        msgout.put(3, "First, solve the problem. Then, write the code.");
        msgout.put(4, "Copy and paste is a design error.");
        msgout.put(5, "Software sucks because users demand it to.");
        msgout.put(6, "Linux is only free if your time has no value.");
        msgout.put(7, "The best thing about a boolean is even if you are wrong, you are only off by a bit.");
        msgout.put(8, "Good design adds value faster than it adds cost.");
        msgout.put(9, "Before software can be reusable it first has to be usable.");
        msgout.put(10, "One of my most productive days was throwing away 1000 lines of code.");
    }
    
    public Map<Integer, String> getMap() {
        return msgout;
    }
    //previously void method converted to static string
     public String shoutOutCannedMessage() {
        setMap();
        //stores a given set of strings.
        StringBuilder sbmsg = new StringBuilder();
        for (Map.Entry<Integer, String> messages : msgout.entrySet()) 
        {
        sbmsg.append("Advise "+messages.getKey()).append(": " +messages.getValue()).append("\n");
        }
        return sbmsg.toString();
    }

    public String shoutoutRandomMessage(){
      HashMap<String, ArrayList<String>> mymsg = new HashMap<String, ArrayList<String>>();
        ArrayList<String> subject = new ArrayList<String>();
        subject.add("I");
        subject.add("You");
        subject.add("He");
        subject.add("She");
        ArrayList<String> verb = new ArrayList<String>();
        verb.add("studying");
        verb.add("eating");
        verb.add("running");
        verb.add("sleeping");
        ArrayList<String> adjective = new ArrayList<String>();
        adjective.add("funny");
        adjective.add("awesome");
        adjective.add("tough");
        adjective.add("wonderful");
        ArrayList<String> object = new ArrayList<String>();
        object.add("course.");
        object.add("homework.");
        object.add("assignment.");
        object.add("test.");
        ArrayList<String> adverb = new ArrayList<String>();
        adverb.add("quickly");
        adverb.add("everywhere");
        adverb.add("easily");
        adverb.add("happily");
     
        /*Adding elements to HashMap*/
        mymsg.put("Subject", subject);
        mymsg.put("Verb", verb);
        mymsg.put("Adjective", adjective);
        mymsg.put("Object", object);
        mymsg.put("Adverb", adverb);

     StringBuilder sbrandom = new StringBuilder();
     for (Map.Entry<String, ArrayList<String>> entry : mymsg.entrySet()) 
        {
                sbrandom.append(entry.getValue().get(randomNumber(0,3))).append(" ");
	}
         return sbrandom.toString();
    }
    //random number generator
    public int randomNumber(int min, int max) {
    int randomInt = min+(int)(Math.random()*((max - min)+1));
    return randomInt;
}
    
}
