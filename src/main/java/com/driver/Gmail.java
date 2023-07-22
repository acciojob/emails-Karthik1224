package com.driver;

import java.util.*;

public class Gmail extends Email {
    PriorityQueue<String> DT = new PriorityQueue<>();
    PriorityQueue<String> MS = new PriorityQueue<>();
    HashSet<String>uniqueEmails = new HashSet<>();
    int initialInboxCapacity;
    int trashCapacity;
    int inboxCapacity; //maximum number of mails inbox can store
    //Inbox: Stores mails. Each mail has date (Date), sender (String), message (String). It is guaranteed that message is distinct for all mails.
    //Trash: Stores mails. Each mail has date (Date), sender (String), message (String)
    public Gmail(String emailId, int inboxCapacity) {
        super(emailId);
        this.inboxCapacity = inboxCapacity;
        initialInboxCapacity=0;
        trashCapacity = 0;
    }

    public void receiveMail(Date date, String sender, String message){
        // If the inbox is full, move the oldest mail in the inbox to trash and add the new mail to inbox.
        // It is guaranteed that:
        // 1. Each mail in the inbox is distinct.
        // 2. The mails are received in non-decreasing order. This means that the date of a new mail is greater than equal to the dates of mails received already.
        if(!uniqueEmails.contains(super.getEmailId()))
        {

            if(initialInboxCapacity == inboxCapacity)
            {
                initialInboxCapacity--;
                MS.poll();
                trashCapacity++;

            }

            uniqueEmails.add(super.getEmailId());
            MS.add
            initialInboxCapacity++;




        }


    }

    public void deleteMail(String message){
        // Each message is distinct
        // If the given message is found in any mail in the inbox, move the mail to trash, else do nothing

    }

    public String findLatestMessage(){
        // If the inbox is empty, return null
        // Else, return the message of the latest mail present in the inbox

    }

    public String findOldestMessage(){
        // If the inbox is empty, return null
        // Else, return the message of the oldest mail present in the inbox

    }

    public int findMailsBetweenDates(Date start, Date end){
        //find number of mails in the inbox which are received between given dates
        //It is guaranteed that start date <= end date

    }

    public int getInboxSize(){
        // Return number of mails in inbox
        return initialInboxCapacity;

    }

    public int getTrashSize(){
        // Return number of mails in Trash
       return trashCapacity;
    }

    public void emptyTrash(){
        // clear all mails in the trash
       trashCapacity = 0;
    }

    public int getInboxCapacity() {
        // Return the maximum number of mails that can be stored in the inbox
        return inboxCapacity;
    }

    public void helper(Date date, String sender, String message)
    {

    }
}
class pq implements Comparator<Pair>{

    // Overriding compare()method of Comparator
    // for descending order of cgpa
    public int compare(Pair s1, Pair s2) {
        if (s1.cgpa < s2.cgpa)
            return 1;
        else if (s1.cgpa > s2.cgpa)
            return -1;
        return 0;
    }
}
