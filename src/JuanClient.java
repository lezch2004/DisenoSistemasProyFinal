import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuanClient {

    static final String name = "Juan Perez";

    public static void main(String[] args) {
        System.out.println("\nBIENVENIDO " + name + " AL MANEJADOR DE REUNIONES CORPORATIVO ");

        do { 
        System.out.println("\nELIGE ACCIÓN (INGRESA EL VALOR DESEADO): ");
        System.out.println("1: CREAR REUNIÓN");
        System.out.println("2: MODIFICAR REUNIÓN");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        while (choice > 2 || choice < 1){
            System.out.println("\nVALOR INVALIDO!");
            System.out.println("\nELIGE ACCIÓN (INGRESA EL VALOR DESEADO): ");
            System.out.println("1: CREAR REUNIÓN");
            System.out.println("2: MODIFICAR REUNIÓN");
            choice = scan.nextInt();
        }

        switch (choice){
            case 1:{
                System.out.println("1");
                createMeeting();
                break;
            }
            case 2:{     
                System.out.println("2"); 
                changeMeeting();
                break;
            }
        }
        } while (true);
    }

    public static void createMeeting(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nCREA UNA REUNIÓN!");
        System.out.println("\nINGRESA EL NÚMERO DE INVITADOS (1-4): ");
        int numParticipants = scan.nextInt(); 
        scan.nextLine();

        while (numParticipants > 4  || numParticipants < 1){
            System.out.println("\nNÚMERO INVÁLIDO");
            System.out.println("\nINGRESA EL NÚMERO DE INVITADOS (1-4): ");
            numParticipants = scan.nextInt(); 
            scan.nextLine();
        }

        List<String> participants = new ArrayList<>();
        System.out.println("\nINGRESE EL NOMBRE DE CADA INVITADO (Nombre_Apellido)");
        for (int i = 1; i<=numParticipants; i++){
            System.out.println("\nINVITADO " + i + ": ");
            String name = scan.nextLine();
            participants.add(name);
        }

        System.out.println("\nINGRESE EL TEMA DE LA REUNIÓN: ");
        String topic = scan.nextLine();

        System.out.println("\nINGRESE EL LUGAR DE LA REUNIÓN: ");
        String place = scan.nextLine();

        System.out.println("\nINGRESE FECHA Y HORA DE INICIO (yyyy-MM-dd HH:mm): ");
        String inputStartDate = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime startDate;

        try {
            startDate = LocalDateTime.parse(inputStartDate, formatter);
        } catch (Exception e) {
            System.out.println("INGRESO INVALIDO. FECHA DEFAULT INICIALIZADA");
            startDate = LocalDateTime.now();
        }

        System.out.println("\nINGRESE FECHA Y HORA DE FIN (yyyy-MM-dd HH:mm): ");
        String inputEndDate = scan.nextLine();

        LocalDateTime endDate;

        try {
            endDate = LocalDateTime.parse(inputEndDate, formatter);
        } catch (Exception e) {
            System.out.println("INGRESO INVALIDO. FECHA DEFAULT INICIALIZADA");
            endDate = LocalDateTime.now().plusDays(1);
        }

        Meeting newMeeting = new Meeting(name.replace(" ", "_"), participants, topic, place, startDate, endDate);
        //notifyServer(newMeeting);
    }

    public static void changeMeeting(){
        //mostrar lista de reuniones desde archivo 
        //elegir reunion
        //ingresar campos
        //notificar servidor 
    }



}