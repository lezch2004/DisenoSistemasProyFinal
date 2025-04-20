import java.time.LocalDateTime;
import java.util.List;

public class Meeting {

    private String organizer; 
    private List<String> participants; 
    private String topic; 
    private String place; 
    private LocalDateTime startDate; 
    private LocalDateTime endDate; 

    public Meeting (String organizer, List<String> participants, String topic, String place, LocalDateTime startDate, LocalDateTime endDate){
        setOrganizer(organizer);
        setParticipants(participants);
        setTopic(topic);
        setPlace(place);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    public void setOrganizer(String organizer){
        this.organizer = organizer; 
    }

    public String getOrganizer(){
        return organizer;
    }

    public void setParticipants(List<String> participants){
        this.participants = participants; 
    }

    public List<String> getParticipants(){
        return participants;
    }

    public void setTopic(String topic){
        this.topic = topic; 
    }

    public String getTopic(){
        return topic;
    }

    public void setPlace(String place){
        this.place = place; 
    }

    public String getPlace(){
        return place;
    }

    public void setStartDate(LocalDateTime startDate){
        this.startDate = startDate; 
    }

    public LocalDateTime getStartDate(){
        return startDate;
    }

    public void setEndDate(LocalDateTime endDate){
        this.endDate = endDate; 
    }

    public LocalDateTime getEndDate(){
        return endDate;
    }

    @Override
    public String toString() {
        return "Organizador: " + organizer +
           "\nInvitados: " + participants.toString() +
           "\nTema: " + topic +
           "\nLugar: " + place +
           "\nInicio: " + startDate +
           "\nFin: " + endDate;
}
}




