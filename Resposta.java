package teste;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;

public class teste {
    private JFrame frame; // Janela principal
    private JPasswordField passwordField; // Campo de senha

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    teste window = new teste();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public teste() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(SystemColor.activeCaption); // Define a cor de fundo da janela
        frame.getContentPane().setForeground(Color.DARK_GRAY);
        frame.setBounds(100, 100, 450, 300); // Define a posição e o tamanho da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o comportamento ao fechar a janela
        frame.getContentPane().setLayout(null); // Define o layout como nulo (coordenadas absolutas)

        JLabel lblNewLabel_1 = new JLabel("Usuario"); // Rótulo "Usuario"
        lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 11)); // Define a fonte do rótulo
        lblNewLabel_1.setBounds(84, 64, 46, 14); // Define a posição e o tamanho do rótulo
        frame.getContentPane().add(lblNewLabel_1); // Adiciona o rótulo à janela

        JLabel lblNewLabel_2 = new JLabel("Senha"); // Rótulo "Senha"
        lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 11)); // Define a fonte do rótulo
        lblNewLabel_2.setBounds(84, 111, 46, 14); // Define a posição e o tamanho do rótulo
        frame.getContentPane().add(lblNewLabel_2); // Adiciona o rótulo à janela

        passwordField = new JPasswordField(); // Campo de senha
        passwordField.setBounds(84, 125, 124, 20); // Define a posição e o tamanho do campo de senha
        frame.getContentPane().add(passwordField); // Adiciona o campo de senha à janela

        JButton btnNewButton = new JButton("Confirmar"); // Botão "Confirmar"
        btnNewButton.setToolTipText(""); // Define a dica de ferramenta do botão
        btnNewButton.setBounds(165, 227, 97, 23); // Define a posição e o tamanho do botão
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Fecha a janela ao clicar no botão
            }
        });
        frame.getContentPane().add(btnNewButton); // Adiciona o botão à janela

        JLabel lblNewLabel = new JLabel("Sistema"); // Rótulo "Sistema"
        lblNewLabel.setBounds(165, 11, 138, 32); // Define a posição e o tamanho do rótulo
        lblNewLabel.setFont(new Font("Dialog", Font.ITALIC, 29)); // Define a fonte do rótulo
	lblNewLabel.setBackground(new Color(139, 0, 0)); // Define a cor de fundo do rótulo
	frame.getContentPane().add(lblNewLabel); // Adiciona o rótulo à janela
	lblNewLabel.setBackground(new Color(139, 0, 0)); // Define a cor de fundo do rótulo
	frame.getContentPane().add(lblNewLabel); // Adiciona o rótulo à janela
    JFormattedTextField formattedTextField = new JFormattedTextField(); // Campo de texto formatado
    formattedTextField.setBounds(84, 80, 124, 20); // Define a posição e o tamanho do campo de texto
    frame.getContentPane().add(formattedTextField); // Adiciona o campo de texto à janela

    JCheckBox chckbxNewCheckBox = new JCheckBox("Lembrar Senha"); // Caixa de seleção "Professor"
    chckbxNewCheckBox.setFont(new Font("Arial", Font.ITALIC, 11)); // Define a fonte da caixa de seleção
    chckbxNewCheckBox.setBackground(SystemColor.activeCaption); // Define a cor de fundo da caixa de seleção
    chckbxNewCheckBox.setBounds(84, 169, 124, 23); // Define a posição e o tamanho da caixa de seleção
    frame.getContentPane().add(chckbxNewCheckBox); // Adiciona a caixa de seleção à janela

}
}
