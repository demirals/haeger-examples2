package de.haegerconsulting.security;

public enum ApplicationUserPermission {

    PATIENT_LESEN("patient: lesen"),
    PATIENT_SCHREIBEN("patient: schreiben"),
    REZEPT_LESEN("rezept: lesen"),
    REZEPT_SCHREIBEN("rezept: schreiben");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission(){
        return permission;
    }

}