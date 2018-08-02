package dto;

import org.springframework.data.annotation.Id;

/**
 * Created by Ioannis on 28/7/2018.
 */
public class Building {

    @Id
    private String id;

    private String buildingName;
    private String addressName;
    private String adressNumber;
    private String postalCode;
    private String coordinates;
    private int numberOfFloors;
    private String hasRooftop;
    private boolean isAbandoned = false;

}
