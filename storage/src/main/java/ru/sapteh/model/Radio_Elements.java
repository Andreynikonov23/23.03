package ru.sapteh.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "radio_elements")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Radio_Elements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;
    @Column(name = "Manufacturer")
    private String manufacturer;
    @Column(name = "Description")
    private String description;
    @Column(name = "Quantity")
    private int quantity;
    @Column(name = "Cost")
    private double cost;


    @Override
    public String toString() {
        return "Radio_elements{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}
