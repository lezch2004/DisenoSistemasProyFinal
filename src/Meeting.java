import java.time.LocalDate;
import java.util.List;

public class Meeting {

    private String organizer; 
    private List<String> participants; 
    private String topic; 
    private String place; 
    private LocalDate startDate; 
    private LocalDate endDate; 

    public Meeting (String organizer, List<String> participants, String topic, String place, LocalDate startDate, LocalDate endDate){
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

    public void setStartDate(LocalDate startDate){
        this.startDate = startDate; 
    }

    public LocalDate getStartDate(){
        return startDate;
    }

    public void setEndDate(LocalDate endDate){
        this.endDate = endDate; 
    }

    public LocalDate getEndDate(){
        return endDate;
    }






}




