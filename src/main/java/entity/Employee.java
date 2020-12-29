package entity;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String empCode;

    @Column
    private Double salary;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Address> address;

}
