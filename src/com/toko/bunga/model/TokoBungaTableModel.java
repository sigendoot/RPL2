
package com.toko.bunga.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asep Hikmat
 */
public class TokoBungaTableModel extends AbstractTableModel{
        private List<TokoBunga> listTokoBunga = new ArrayList();
    private final String HEADER[] = {"Kode Bunga","Nama Bunga","Jenis Bunga","Harga Bunga"};
    
    public TokoBungaTableModel(List<TokoBunga> listTokoBunga) {
        this.listTokoBunga = listTokoBunga;
    }
    
    
    
    @Override
    public int getRowCount() {
        return listTokoBunga.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TokoBunga tokoBunga = listTokoBunga.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return tokoBunga.getKd_bunga();
            case 1:
                return tokoBunga.getNama();
            case 2:
                return tokoBunga.getJenis();
            case 3:
                return tokoBunga.getHarga();
            default:
                return null;
        }
    }
    
    public String getColumnName(int index){
        return HEADER[index];
    }
    
}
