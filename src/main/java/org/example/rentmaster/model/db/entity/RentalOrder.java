package org.example.rentmaster.model.db.entity;
/*создание нового заказа, изменение существующего заказа, расчет стоимости аренды*/

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.rentmaster.model.enums.Status;


import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/*Заявка на аренду строительной техники*/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "rentalOrder")
public class RentalOrder {

    @Id
    @Column(name = "rental_order")
    UUID rentalOrderId;

    @ManyToOne
    @JsonBackReference(value = "client_order")
    @JoinColumn(name = "clientsId")
    private Clients clients;

    @ManyToOne
    @JsonBackReference(value = "branch_order")
    @JoinColumn(name = "branchId")
    private Branches branch;

    @ManyToOne
    @JsonBackReference(value = "technique_order")
    @JoinColumn(name = "techniquesId")
    private Technique techniques;

    @Column(name = "rentalCost")
    private Double rentalCost;

    @Column(name = "status")
    private Status status;

    @ManyToOne
    @JsonBackReference(value = "client_order")
    private Employees employees;

    @Column(name = "createdAt")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt = LocalDateTime.now();

    @Column(name = "addrres")
    private String addrres;

    @OneToMany
    @JoinColumn(name="personalNumber")
    private List<Drivers> drivers;


}
