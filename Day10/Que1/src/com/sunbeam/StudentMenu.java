package com.sunbeam;

import java.util.*;

public class StudentMenu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        int choice;

        while(true){
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Sort by Roll No");
            System.out.println("5. Sort by Name");
            System.out.println("6. Sort by Marks");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter rollno: ");
                    int r = sc.nextInt();
                    System.out.print("Enter name: ");
                    String n = sc.next();
                    System.out.print("Enter marks: ");
                    double m = sc.nextDouble();
                    list.add(new Student(r, n, m));
                    System.out.println("Student added.");
                    break;

                case 2:
                    Iterator<Student> it = list.iterator();
                    while(it.hasNext()){
                        System.out.println(it.next());
                    }
                    break;

                case 3:
                    System.out.print("Enter rollno to search: ");
                    int sr = sc.nextInt();
                    boolean found = false;
                    for(Student s : list){
                        if(s.getRollno() == sr){
                            System.out.println("Found: " + s);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    Collections.sort(list, Comparator.comparing(Student::getRollno));
                    System.out.println("Sorted by rollno.");
                    break;

                case 5:
                    Collections.sort(list, Comparator.comparing(Student::getName));
                    System.out.println("Sorted by name.");
                    break;

                case 6:
                    Collections.sort(list, Comparator.comparing(Student::getMarks));
                    System.out.println("Sorted by marks.");
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}