package ru.kpfu.itis.poll;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Poll p1 = new Poll(1, "abc");
        Poll p2 = new Poll(2, "abc");
        Poll p3 = new Poll(3, "abc");
        Poll p4 = new Poll(4, "abc");
        Poll p5 = new Poll(5, "abc");
        Poll p6 = new Poll(6, "abc");
        Poll p7 = new Poll(7, "abc");
        ArrayList<Poll> polls = new ArrayList<Poll>();
        polls.add(p1);
        polls.add(p2);
        System.out.println(polls);
        polls.remove(p2);
        System.out.println(polls);
    }
}
