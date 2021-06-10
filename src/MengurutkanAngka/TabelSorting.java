package MengurutkanAngka;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabelSorting {
    private JTextField textAngka;
    private JButton buttonProses;
    private JTable outputTable;
    private JPanel RootPanel;
    private JTextField textMasukanAngka;
    private JButton selesaiButton;
    private DefaultTableModel tableModel;
    private boolean added = false;

    public JPanel getRootPanel() {

        return RootPanel;
    }

    public TabelSorting() {

        this.initComponents();
        buttonProses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) outputTable.getModel();
                String angka = textMasukanAngka.getText();
                int jumlah = Integer.parseInt(textAngka.getText());
                String[] exc = angka.split(",");
                if (angka.isBlank()) {
                    JOptionPane.showMessageDialog(RootPanel,
                            "Data belum Lengkap",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                }
                int a = 0;
                for (int i : Sorting.getascenden(angka, jumlah)) {
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : Sorting.getdescenden(angka, jumlah)){
                    model.setValueAt(i, b, 1);
                b++;
            }

                 }
        });
        selesaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.exit(0);
            }
        });

    }

    private void initComponents(){
        //nama kolom
        Object[] tableColom = {
                "Ascending",
                "Descending"

        };
        //kolom data
        Object[][] data = {
        };
        tableModel = new DefaultTableModel(data, tableColom);

        //set table model
        outputTable.setModel(tableModel);

        //menampilkan sorting di setiap kolom
        outputTable.setAutoCreateRowSorter(true);

        //seting untuk tabel yg diseleki bisa lebih beberapa row
        outputTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//enable single selection

    }
}


