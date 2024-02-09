package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@ToString
@Entity

public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderID;
    private String customerName;
    private String emailAddress;
    private String contactNumber;
    private String itemCategory;
    private String description;
    private String date;
    private String status;


}