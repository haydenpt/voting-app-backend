package com.misso.votingappbackend.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table
@NamedQuery(name = "MyAccount.getMyAccount",
            query = ""/* custom joint query here
            ex: select e from Employee e where e.email = ?1 */
)
public class MyAccount {
    @Id
    private Integer memberId;
    private String firstName;
    private String lastName;
    private String major;
    private String classification;
    private String total_points;
    // TODO
    /*
        Send points in header or reuse joint SQL query in node.js backend
     */

    /*
     * Event attendance count for eligibility
     * To run for officer, member must attend certain event type
     */
    private int pm_count;
    private int ws_count;
    private int soc_count;
    private int vol_count;
    private int fr_count;
    private int mentor_count;
    private int career_count;
    private int hack_count;


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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}
