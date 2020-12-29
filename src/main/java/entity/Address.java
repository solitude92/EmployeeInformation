package entity;

import lombok.*;
import org.hibernate.engine.internal.Cascade;
import sun.management.snmp.jvmmib.EnumJvmMemPoolCollectThreshdSupport;

import javax.persistence.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String postalCode;

    @Column
    private String postalAddress;


    @Column
    private String city;


    @OneToOne(cascade = CascadeType.ALL)
    private PhoneNumber phoneNumber;

}
