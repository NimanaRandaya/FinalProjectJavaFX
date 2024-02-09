package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    private long id;
    private String customerName;
    private String email;
    private String contactNumber;

    public CustomerEntity(Long id, String customerName, String email, String contactNumber) {
        this.id = id;
        this.customerName = customerName;
        this.email = email;
        this.contactNumber = contactNumber;
    }
}
