package Book.DavidFlanagan;

import javax.swing.*;

public class MakeChoice {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Введите число:"));
        String text = number % 2 == 0 ? "Чётное" : "Нечётное";
        JOptionPane.showMessageDialog(null, "Вы ввели " + text + " число.");
    }
}
