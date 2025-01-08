import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TodoList todoList = new TodoList(120);

      AskQuestion(scanner, todoList);

    }

    public static void AskQuestion (Scanner scanner, TodoList todoList){
       

        int entre;  

        System.out.println("");
        System.out.println("Bienvenue sur notre application ");
        System.out.println("Faites un choix ");
        System.out.println("1-Ajouter une tâche ");
        System.out.println("2-Supprimer une tâche ");
        System.out.println("3-modifier une tâche ");
        System.out.println("4-Afficher toutes les tâches ");
        System.out.println("5-Marquer une tâche comme terminée ");
        System.out.println("0-Quitter ");

        entre = scanner.nextInt();
scanner.nextLine();
        switch (entre) {
            case 1:
                System.out.println("Entrez la tâche à ajouter : ");
                String newTask = scanner.nextLine();

                if (newTask.length() > 0) {
                    System.out.println("Entrez la description :");
                    String newDescription = scanner.nextLine();
                    Task task = new Task(newTask, newDescription);
                    todoList.addTask(task);
                    todoList.printTasks();
                AskQuestion(scanner, todoList);
                }

                break;
                case 2:
                todoList.printTasks();
                System.out.println("Sélectionnez la tâche à supprimer");
            
                int choice = scanner.nextInt(); 
                scanner.nextLine(); 
                System.out.println("tache supprimer avec succes");
            
                if (choice >= 0) { 
                 todoList.deleteTask(choice);

                } else {
                    System.out.println("Index de tâche invalide.");
                }
         AskQuestion(scanner, todoList);

                break;

                case 3:
                todoList.printTasks();
                System.out.println("Sélectionnez la tâche à modifier");
            
                 choice = scanner.nextInt(); 
                scanner.nextLine(); 
            
                if (choice >= 0) { 
                    System.out.println("Entrez la nouvelle tâche : ");
                    newTask = scanner.nextLine();
            
                    if (newTask.length() > 0) {
                        System.out.println("Entrez la description :");
                        String newDescription = scanner.nextLine();
            
                        todoList.editTask(choice, newTask, newDescription);
                        todoList.printTasks();
                    } else {
                        System.out.println("La tâche ne peut pas être vide.");
                    }
                } else {
                    System.out.println("Index de tâche invalide.");
                }
                AskQuestion(scanner, todoList);

                break;
                 
                case 4:
                System.out.println("Afficher toutes les tâches");
                todoList.printTasks();
            
      AskQuestion(scanner, todoList);

                break;
                case 5:
                System.out.println("selectionnez la tâche terminée");
                todoList.printTasks();
            
                 choice = scanner.nextInt(); 
                scanner.nextLine(); 
            
                if (choice >= 0) { 
                   todoList.markTaskAsDone(choice);
                System.out.println("tâche marquée comme terminée");

                    todoList.printTasks();
                
                } else {
                    System.out.println("Index de tâche invalide.");
                }
            AskQuestion(scanner, todoList);

                break;
            
            case 0:
                System.out.println("Au revoir !");
                scanner.close();

                break;

            default:
                System.out.println("Choix invalide, veuillez réessayer.");
                AskQuestion(scanner, todoList);

                break;
        }
        
    }


}
