import com.sun.xml.internal.ws.encoding.HasEncoding;
import entity.Address;
import entity.Employee;
import entity.PhoneNumber;
import util.JpaUtil;

import javax.persistence.EntityManager;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        PhoneNumber phoneNumber = PhoneNumber.builder().mobNumber("09366325418").teNumber("02136985473").build();
        PhoneNumber phoneNumber1= PhoneNumber.builder().mobNumber("09385412635").teNumber("02158584796").build();
        PhoneNumber phoneNumber2= PhoneNumber.builder().mobNumber("09125847963").teNumber("02158749633").build();
        PhoneNumber phoneNumber3= PhoneNumber.builder().mobNumber("09198745963").teNumber("02469587413").build();
        PhoneNumber phoneNumber4= PhoneNumber.builder().mobNumber("09908521479").teNumber("02832230745").build();
        PhoneNumber phoneNumber5= PhoneNumber.builder().mobNumber("09013259847").teNumber("02156987415").build();
        PhoneNumber phoneNumber6= PhoneNumber.builder().mobNumber("09225226595").teNumber("02832234808").build();

        entityManager.persist(phoneNumber );
        entityManager.persist(phoneNumber1);
        entityManager.persist(phoneNumber2);
        entityManager.persist(phoneNumber3);
        entityManager.persist(phoneNumber4);
        entityManager.persist(phoneNumber5);
        entityManager.persist(phoneNumber6);


        Address address = Address.builder().postalAddress("Iran, Tehran").city("Tehran").phoneNumber(phoneNumber)
                .postalCode("4312569870").build();
        Address address1= Address.builder().postalAddress("Iran, Yazd").city("Yazd").phoneNumber(phoneNumber1)
                .postalCode("6541239877").build();
        Address address2= Address.builder().postalAddress("Iran, Khorasa").city("Mashhad").phoneNumber(phoneNumber2)
                .postalCode("5566998877").build();
        Address address3= Address.builder().postalAddress("Iran, Qom").city("Qom").phoneNumber(phoneNumber3)
                .postalCode("3365299874").build();
        Address address4= Address.builder().postalAddress("Iran, Gilan").city("Rasht").phoneNumber(phoneNumber4)
                .postalCode("85542569870").build();
        Address address5= Address.builder().postalAddress("Iran, Khozastan").city("Abadan").phoneNumber(phoneNumber5)
                .postalCode("48569775899").build();
        Address address6= Address.builder().postalAddress("Iran, Qazvin").city("Alvand").phoneNumber(phoneNumber6)
                .postalCode("5874698547").build();
        Address address7= Address.builder().postalAddress("Iran, Qazvin").city("Qazvin").phoneNumber(phoneNumber6)
                .postalCode("5874698547").build();

        entityManager.persist(address );
        entityManager.persist(address1);
        entityManager.persist(address2);
        entityManager.persist(address3);
        entityManager.persist(address4);
        entityManager.persist(address5);
        entityManager.persist(address6);
        entityManager.persist(address7);


        Set<Address> addresses = new HashSet<>();
        addresses.add(address);
        Set<Address> addresses1 = new HashSet<>();
        addresses1.add(address1);
        Set<Address> addresses2 = new HashSet<>();
        addresses2.add(address2);
        Set<Address> addresses3 = new HashSet<>();
        addresses3.add(address3);
        Set<Address> addresses4 = new HashSet<>();
        addresses4.add(address4);
        Set<Address> addresses5 = new HashSet<>();
        addresses5.add(address5);
        Set<Address> addresses6 = new HashSet<>();
        addresses6.add(address6);
        addresses6.add(address7);

        Employee employee = Employee.builder().name("Takhtaei").empCode("321").salary(254.00).address(addresses ).build();
        Employee employee1= Employee.builder().name("Amini").empCode("322").salary(350.00).address(addresses1).build();
        Employee employee2= Employee.builder().name("Yasi").empCode("344").salary(170.00).address(addresses2).build();
        Employee employee3= Employee.builder().name("Soleymani").empCode("368").salary(260.00).address(addresses3).build();
        Employee employee4= Employee.builder().name("Jafari").empCode("396").salary(600.00).address(addresses4).build();
        Employee employee5= Employee.builder().name("Shahsavand").empCode("381").salary(364.00).address(addresses5).build();
        Employee employee6= Employee.builder().name("Salili").empCode("371").salary(164.00).address(addresses6).build();

        entityManager.persist(employee);
        entityManager.persist(employee1);
        entityManager.persist(employee2);
        entityManager.persist(employee3);
        entityManager.persist(employee4);
        entityManager.persist(employee5);
        entityManager.persist(employee6);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
