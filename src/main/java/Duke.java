import java.util.*;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------");
        System.out.println("Hello! I am Duke");
        System.out.println("What can i do for you");
        System.out.println("------------");
        String mes = "Hello";

        while(!mes.equalsIgnoreCase("bye")){
            // in-case first case bye in entered ##
            mes = sc.nextLine();
            if(!mes.equalsIgnoreCase("bye")){
                System.out.println("  ---------");
                System.out.println("     "+mes+"   ");
                System.out.println("  ---------");
            }
        }


        System.out.println("  ---------");
        System.out.println("     Bye. Hope to see you again");
        System.out.println("  ---------");
    }
}
