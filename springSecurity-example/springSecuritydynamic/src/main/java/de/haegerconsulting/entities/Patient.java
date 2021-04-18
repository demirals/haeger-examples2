package de.haegerconsulting.entities;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private int id;

    @Column(name = "patient_name", nullable = false, length = 25)
    private String patientName;

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
