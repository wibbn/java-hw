package lab6;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    private JTextArea text_area = new JTextArea();

    private JMenu color_menu = new JMenu("Color");
    private JMenu font_menu = new JMenu("Font");

    private String[] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};
    private String[] colors = {"blue", "red", "black"};

    public Gui() {
        var menubar = new JMenuBar();

        for (String i: fonts) {
            var menu_item = new JMenuItem(i);
            menu_item.addActionListener((event) -> text_area.setFont(new Font(i, Font.PLAIN, 20)));
            font_menu.add(menu_item);
        }

        for (String i: colors) {
            var menu_item = new JMenuItem(i);
            menu_item.addActionListener((event) -> {
                switch (i) {
                    case "blue" -> text_area.setForeground(Color.BLUE);
                    case "red" -> text_area.setForeground(Color.RED);
                    case "black" -> text_area.setForeground(Color.BLACK);
                    default -> text_area.setForeground(Color.DARK_GRAY);
                }
            });
            color_menu.add(menu_item);
        }

        menubar.add(color_menu);
        menubar.add(font_menu);
        setJMenuBar(menubar);

        add(text_area, BorderLayout.CENTER);

        setTitle("Awesome Input Filed and Menus");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new Gui();
            ex.setVisible(true);
        });
    }
}
