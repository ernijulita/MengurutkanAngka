package MengurutkanAngka;

import javax.swing.*;

public class RunTabelSorting {
        public static void main(String[] args) {
            try{
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored){
            }

        ImageIcon imageIcon = new ImageIcon("res/erni.jpg");
        JFrame jFrame = new JFrame("Biodata Mahasiswa With Table");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new TabelSorting().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
    }

}
