package projects.bootcamp.turkcell.external.service.egovernment;

import java.time.LocalDate;

public class Person {
    private int id;
    private String identityNumber;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Person(int id, String identityNumber, String firstName, String lastName, LocalDate dateOfBirth) {
        this.id = id;
        this.identityNumber = identityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
