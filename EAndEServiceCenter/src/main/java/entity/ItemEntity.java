package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class ItemEntity {
    private String category;
    private String name;
    private String price;
    private String status;
}
