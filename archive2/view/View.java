package by.epam.jonline.tasks.archive2.view;

public class View {
	
	public static void printIncomingMessage(String message) {
        System.out.println(message);
    }

    public static void informAboutAddingNewUser(String userName) {
        System.out.println("участник с именем " + userName + " присоединился к серверу");
    }

    public static void informAboutDeletingNewUser(String userName) {
        System.out.println("участник с именем " + userName + " покинул сервер");
    }
    
    public static void writeMessage(String message){
        System.out.println(message);
    }
    
    

}
