/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.dam.aeropuerto.logica;

/**
 *
 * @author estelafm
 */
public class ValidationResult {
    private boolean valid;
    private String validationErrorMessage;

    public ValidationResult(boolean valid, String validationErrorMessage) {
        this.valid = valid;
        this.validationErrorMessage = validationErrorMessage;
    }

    public boolean isValid() {
        return valid;
    }

    public String getValidationErrorMessage() {
        return validationErrorMessage;
    }

    
}
