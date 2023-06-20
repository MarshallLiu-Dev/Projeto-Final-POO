package views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ClienteNovo extends JFrame implements ActionListener {
    private JLabel lblCliente;
    private JLabel lblTelefone;
    private JLabel lblEmail;

    private JTextField txtCliente;
    private JTextField txtTelefone;
    private JTextField txtEmail;

    private JButton btnCadastro;
    private JButton btnCancela;

    public ClienteNovo(String nome) {
        super(nome);
        this.setBounds(100, 100, 400, 300);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.lblCliente = new JLabel("Nome:");
        this.lblCliente.setBounds(30, 20, 80, 20);
        this.getContentPane().add(this.lblCliente);

        this.lblTelefone = new JLabel("Telefone:");
        this.lblTelefone.setBounds(30, 110, 80, 20);
        this.getContentPane().add(this.lblTelefone);

        this.lblEmail = new JLabel("Email:");
        this.lblEmail.setBounds(30, 140, 80, 20);
        this.getContentPane().add(this.lblEmail);

        this.txtCliente = new JTextField();
        this.txtCliente.setBounds(150, 20, 150, 20);
        this.getContentPane().add(this.txtCliente);

        this.txtTelefone = new JTextField();
        this.txtTelefone.setBounds(150, 110, 150, 20);
        this.getContentPane().add(this.txtTelefone);

        this.txtEmail = new JTextField();
        this.txtEmail.setBounds(150, 140, 150, 20);
        this.getContentPane().add(this.txtEmail);

        this.btnCadastro = new JButton("Cadastrar");
        this.btnCadastro.setBounds(100, 200, 100, 30);
        this.btnCadastro.setBackground(Color.GREEN);
        this.btnCadastro.addActionListener(this);
        this.getContentPane().add(this.btnCadastro);

        this.btnCancela = new JButton("Cancelar");
        this.btnCancela.setBounds(210, 200, 100, 30);
        this.btnCancela.setBackground(Color.RED);
        this.btnCancela.addActionListener(this);
        this.getContentPane().add(this.btnCancela);

        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
    }

    private void setDefaultCloseOperation(String exitOnClose) {
		// TODO Auto-generated method stub
		
	}

	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private JComponent getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setLayout(Object object) {
		// TODO Auto-generated method stub
		
	}

	private void setBounds(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}

	@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCadastro) {
            String cliente = txtCliente.getText();
            String telefone = txtTelefone.getText();
            String email = txtEmail.getText();

            JOptionPane.showInputDialog(this);

            txtCliente.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");
        } else if (e.getSource() == btnCancela) {
            this.dispose();
        }
    }

    private void dispose() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ClienteNovo(EXIT_ON_CLOSE);
        });
    }
}
