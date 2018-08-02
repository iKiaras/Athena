package dto;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ioannis on 23/7/2018.
 */
@Entity
public class humans {

    @Id
    private String id;

    //Name Info
    private String firstName;
    private String middleName;
    private String surname;

    //Birth Info
    private String birthDay;
    private int age;
    private String placeOfBirth;
    private String typeOfBirth;
    private String generalInfo;

    //Living Info
    private ArrayList<Building> relatedBuildings;
    private HashMap<String,String> phoneNumber;
    private ArrayList<String> pets;

    //Occupation Info
    private String occupation;
    private String occupationLeven;
    private String company;
    private String email;

    //Rest memories
    private HashMap<String, String> memories;


}
