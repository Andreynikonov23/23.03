package ru.sapteh.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "radio_elements")
public class RadioElements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String name;

    @NonNull
    private String manufacturer;

    private String description;

    private int quantity;

    @NonNull
    private String cost;

    @Override
    public String toString() {
        return "RadioElements{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", cost='" + cost + '\'' +
                '}';
    }
}
