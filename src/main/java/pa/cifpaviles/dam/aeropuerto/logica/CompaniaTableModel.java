/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.dam.aeropuerto.logica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pa.cifpaviles.dam.aeropuerto.dto.Compania;

/**
 *
 * @author estelafm
 */
public class CompaniaTableModel extends AbstractTableModel {

    List<Compania> lstRegistros;
    ArrayList<String> columnNames;
    ArrayList<Class> columnClasses;

    public CompaniaTableModel(List<Compania> lstRegistros) {
        this.lstRegistros = lstRegistros;
        columnClasses = new ArrayList<>();
        columnNames = new ArrayList<>();
        columnNames.add("Prefijo");
        columnNames.add("Código");
        columnNames.add("Nombre");
        columnNames.add("Tel. Información");
        
    }

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return columnClasses.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
