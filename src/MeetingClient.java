import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class MeetingClient {

    protected abstract String getName();
    protected abstract int getServerCode();

    public void run() {
        gestionMenu(getName(), getServerCode());
    }

    //Menu de creación de reunión
    public static void gestionMenu(String name, int serverCode){
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
                createMeeting(name, serverCode);
                break;
            }
            case 2:{     
                System.out.println("2"); 
                changeMeeting(name, serverCode);
                break;
            }
        }
        } while (true);
    }

    public static void createMeeting(String name, int serverCode){
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
            String nombres = scan.nextLine();
            participants.add(nombres);
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
        //notifyServer(newMeeting, serverCode);
    }

    public static void changeMeeting(String name, int serverCode){
        //mostrar lista de reuniones desde archivo 
        //elegir reunion
        //ingresar campos
        //notificar servidor 
    }

    public static void notifyServer(Meeting meeting){
        //notificar servidor
        System.out.println("\nNOTIFICANDO AL SERVIDOR...");
        System.out.println(meeting.toString());
        System.out.println("\nNOTIFICACIÓN ENVIADA!");
    }
    
}
