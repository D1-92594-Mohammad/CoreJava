package com.sunbeam;

import java.util.*;

public class ProjectMenu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Project> projectSet = new HashSet<>();
        List<Project> projectList = new ArrayList<>();

        int choice;

        while(true){
            System.out.println("\n1. Add Dummy Data");
            System.out.println("2. Add Project (User Input)");
            System.out.println("3. Display All Projects in Set");
            System.out.println("4. Delete Project by ID");
            System.out.println("5. Copy Set to ArrayList");
            System.out.println("6. Display All Projects from List");
            System.out.println("7. Sort Projects in List by Cost");
            System.out.println("8. Max Team Size Project");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    projectSet.add(new Project(1, "Train Reservation System", 5, 5000000, "Java"));
                    projectSet.add(new Project(2, "Airline Reservation System", 3, 6000000, ".NET"));
                    projectSet.add(new Project(4, "Online Grocery Shop", 6, 3000000, "Java"));
                    projectSet.add(new Project(5, "Online Book Shop", 2, 3000000, ".NET"));
                    projectSet.add(new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"));
                    projectSet.add(new Project(2, "Bus Reservation System", 3, 3500000, "JS")); // duplicate ID - ignored
                    System.out.println("Dummy data added.");
                    break;

                case 2:
                    System.out.print("Enter id: ");
                    int id = sc.nextInt();
                    System.out.print("Enter title: ");
                    String title = sc.next();
                    System.out.print("Enter team size: ");
                    int team = sc.nextInt();
                    System.out.print("Enter cost: ");
                    double cost = sc.nextDouble();
                    System.out.print("Enter technology: ");
                    String tech = sc.next();

                    boolean added = projectSet.add(new Project(id, title, team, cost, tech));

                    if(!added){
                        System.out.println("Duplicate Project ID - Not Added!");
                    } else {
                        System.out.println("Project Added.");
                    }
                    break;

                case 3:
                    for(Project p : projectSet){
                        System.out.println(p);
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    boolean removed = projectSet.remove(new Project(delId, "", 0, 0, ""));
                    if(removed){
                        System.out.println("Project removed.");
                    } else {
                        System.out.println("Project not found.");
                    }
                    break;

                case 5:
                    projectList.clear();
                    projectList.addAll(projectSet);
                    System.out.println("Copied to ArrayList.");
                    break;

                case 6:
                    for(Project p : projectList){
                        System.out.println(p);
                    }
                    break;

                case 7:
                    projectList.sort(Comparator.comparing(Project::getProjectCost));
                    System.out.println("List sorted by project cost.");
                    break;

                case 8:
                    if(projectSet.isEmpty()){
                        System.out.println("Set is empty.");
                    } else {
                        Project maxTeam = Collections.max(projectSet, Comparator.comparing(Project::getTeamSize));
                        System.out.println("Max Team Size Project: " + maxTeam);
                    }
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
