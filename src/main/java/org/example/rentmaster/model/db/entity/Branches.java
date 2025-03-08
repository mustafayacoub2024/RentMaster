package org.example.rentmaster.model.db.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

/*Филиал, в каждом городе свой отдельный филиал*/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "branches")
public class Branches {
    @Id
    @Column(name= "branchId")
    private UUID branchId;

    @ManyToOne
    @JsonBackReference(value = "branch_location")
    @JoinColumn(name = "locationId")
    private Location location;

    @OneToMany(mappedBy = "branch")
    @JsonManagedReference(value = "branch_technique")
    private List<Technique> techniques;

    @OneToMany(mappedBy = "branch")
    @JsonManagedReference(value = "branch_order")
    private List<RentalOrder> rentalOrders;

    @Column(name = "email")
    @Email
    private String email;

    @Column(name = "phone")
    private String phone;
}






