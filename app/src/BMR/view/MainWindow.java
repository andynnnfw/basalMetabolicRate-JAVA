package BMR.view;

import BMR.model.CalculatorBmr;
import BMR.util.Validator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame{
    private JTextField weightZone, heightZone, ageZone;
    private JComboBox<String> comboGender;
    private JLabel resultLabel;

    public MainWindow(){
        setTitle("Basal Metabolic Rate Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(6, 2, 8, 8));
        painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        painel.add(new JLabel("Peso: "));
        weightZone = new JTextField();
        painel.add(weightZone);

        painel.add(new JLabel("Altura: "));
        heightZone = new JTextField();
        painel.add(heightZone);

        painel.add(new JLabel("Idade: "));
        ageZone = new JTextField();
        painel.add(ageZone);

        painel.add(new JLabel("Genero: "));
        comboGender = new JComboBox<>(new String[]{"Male", "Female"});
        painel.add(comboGender);

        JButton btnCalc = new JButton("Calcular");
        btnCalc.addActionListener(this::calculate);
        painel.add(btnCalc);

        resultLabel = new JLabel("Resultado: ");
        painel.add(resultLabel);

        add(painel);
    }


    private void calculate(ActionEvent e) {
        String weight = weightZone.getText();
        String height = heightZone.getText();
        String age = ageZone.getText();

        if (!Validator.isValidNumber(weight) || !Validator.isValidNumber(height) || !Validator.isValidNumber(age)){
            JOptionPane.showMessageDialog(this, "please, fill the boxes");
            return;
        }

        double w = Double.parseDouble(weight);
        double h = Double.parseDouble(height);
        int a = Integer.parseInt(age);

        double bmr;

        CalculatorBmr calc = new CalculatorBmr(w, h, a, (String) comboGender.getSelectedItem());
        bmr = calc.calculate();

        resultLabel.setText(String.format("Resultado: %.2f kcal/dia", bmr));
    }
}

