package de.haegerconsulting.entities;

public class Patient {

    private final Integer patientId;
    private final String patientName;


    public Patient(Integer patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;

    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                '}';
    }

    public Integer getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

}
