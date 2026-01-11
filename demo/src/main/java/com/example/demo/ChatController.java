package com.example.demo;

import java.time.LocalTime;
import java.util.Random;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ChatController {

    String[] jokes = {
    "Why do programmers prefer dark mode? Because light attracts bugs! 🐛",
    "How many programmers does it take to change a light bulb? None, that's a hardware problem! 💡",
    "Why do Java developers wear glasses? Because they don’t C#! 🤓",
    "I told my computer I needed a break, and it said 'No problem — I'll go to sleep.' 😴",
    "Why was the developer unhappy at their job? They wanted arrays! 😅",
    "Debugging: Being the detective in a crime movie where you are also the murderer. 🕵️‍♂️",
    "Why do programmers hate nature? It has too many bugs. 🌳🐞",
    "What’s a programmer’s favorite coffee? Java! ☕",
    "There are 10 types of people in the world: those who understand binary and those who don’t. 🧑‍💻",
    "Why do Python programmers have low self-esteem? Because they’re constantly comparing their self to others. 🐍",
    "How does a computer get drunk? It takes screenshots! 📸",
    "Why did the function return early? Because it had too many arguments. 🤯",
    "A SQL query walks into a bar, walks up to two tables and asks, 'Can I join you?' 🍻",
    "Why did the programmer quit his job? Because he didn't get arrays (a raise)! 😄",
    "To understand what recursion is, you must first understand recursion... 🔄"
    };


    Random rand = new Random();

    @GetMapping("/chat")
    public String chat(@RequestParam String message) {

        message = message.toLowerCase();

        if(message.contains("hi") || message.contains("hello")){
            return "Hello Geetha! How can I help you? 😊";
        }
        else if(message.contains("your name")){
            return "My name is JavaBot 🤖";
        }
        else if(message.contains("good morning")){
            return "Good Morning, Geetha! Have a great day 🌞";
        }
        else if(message.contains("how are you")){
            return "I am doing good! What about you?";
        }
        else if(message.contains("time")){
            LocalTime time = LocalTime.now();
            return "Current time is " + time.getHour() + ":" + time.getMinute();
        }
        else if(message.contains("jokes")){
            int index = rand.nextInt(jokes.length);
            return jokes[index];
        }
        else if(message.contains("help")){
            return """
                   You can ask me:
                   - hi / hello
                   - your name
                   - good morning
                   - how are you
                   - time
                   - jokes
                   - bye
                   """;
        }
        else if(message.contains("binary search")){
                return "Binary Search works on sorted arrays. It divides the array into halves. Time Complexity: O(log n).";
            }
        else if(message.contains("linear search")){
            return "Linear Search checks each element one by one. Time Complexity: O(n).";
        }
        else if(message.contains("array")){
            return "Array stores multiple values of same datatype in continuous memory locations.";
        }
        else if(message.contains("oops")){
            return "OOPS concepts: Encapsulation, Inheritance, Polymorphism, Abstraction.";
        }
        else if(message.contains("stack")){
            return "Stack follows LIFO principle (Last In First Out).";
        }
        else if(message.contains("queue")){
            return "Queue follows FIFO principle (First In First Out).";
        }
        else if(message.contains("prime")){
            return "A prime number has exactly two factors: 1 and itself.";
        }
        else if(message.contains("time complexity")){
            return "Time complexity measures how fast an algorithm runs.";
        }
        else if(message.contains("inheritance")){
            return "Inheritance allows one class to acquire properties of another class.";
        }
        else if(message.contains("polymorphism")){
            return "Polymorphism allows one method to behave differently in different objects.";
        }
        else if(message.contains("linked list")){
            return "A Linked List is a linear data structure where each element points to the next. " +
           "Advantages: dynamic size, ease of insertion/deletion. \n" +
           "Example in Java:\n" +
           "class Node { int data; Node next; }";
        }
        else if(message.contains("sorting algorithms")){
            return "Common sorting algorithms:\n" +
           "- Bubble Sort: O(n^2), simple but slow\n" +
           "- Merge Sort: O(n log n), efficient divide and conquer\n" +
           "- Quick Sort: O(n log n) average case\n" +
           "Need help with any specific one?";
        }
        else if(message.contains("help me with java")){
            return "Sure! You can ask me about:\n" +
           "- Java basics (variables, loops, conditionals)\n" +
           "- OOP concepts\n" +
           "- Exception handling\n" +
           "- Collections framework\n" +
           "Just type your question!";
        }

        else if(message.contains("bye")){
            return "Bye 👋 Have a good day!";
        }
        else{
            return "Sorry, I didn't understand 😔";
        }
    }
}
