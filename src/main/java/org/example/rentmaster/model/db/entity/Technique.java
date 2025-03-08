package org.example.rentmaster.model.db.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.rentmaster.model.enums.Availability;

import java.util.List;


/*данные о технике, которая имеется в компании*/


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "technique")
public class Technique {

    @Id
    @Column(name = "stateNumber")
    private String stateNumber;

    @ManyToOne
    @JsonBackReference(value = "technique_branch")
    @JoinColumn(name = "branchId")
    private Branches branch;

    @Column(name = "type")
    private String type;

    @Column(name = "baseCost")
    private Double baseCost; //Базовая стоимость аренды

    @Column(name = "availability")
    private Availability availability; //Доступность технике

    @OneToMany(mappedBy = "techniques")
    @JsonManagedReference(value = "technique_order")
    private List<RentalOrder> rentalOrders;

}
