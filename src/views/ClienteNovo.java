package views;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ClienteNovo  extends JFrame implements ActionListener {

    private JLabel janela;
    private JLabel lblCliente;
    private JLabel lblEmail;
    private JLabel lblTelefone;
 
    private JTextField txtCliente;
    private JTextField txtEmail;
    private JTextField txtTelefone;

    private JButton btnCadastro;
    private JButton btnCancela;

    // cores
    Color red = new Color(255,0,0);
    Color green = new Color(0,128,0);
   
    public Cliente(String nome) {
    	super(nome);
        this.setBounds(100, 100, 400, 300);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.janela = new JLabel("");
        this.janela.setBounds(30, 140, 100, 30);
        this.getContentPane().add(this.janela);
        this.janela.setBackground(Color.white);

        this.lblCliente = new JLabel("Nome:");
        this.lblCliente.setBounds(30, 20, 80, 20);
        this.getContentPane().add(this.lblCliente);


        this.lblEndereço = new JLabel("Telefone:");
        this.lblEndereço.setBounds(30, 110, 80, 20);
        this.getContentPane().add(this.lblEndereço);

        this.lblEmail = new JLabel("Email:");
        this.lblEmail.setBounds(30, 140, 80, 20);
        this.getContentPane().add(this.lblEmail);

        this.txtCliente = new JTextField();
        this.txtCliente.setBounds(150, 20, 150, 20);
        this.getContentPane().add(this.txtCliente);

        this.txtEndereço = new JTextField();
        this.txtEndereço.setBounds(150, 110, 150, 20);
        this.getContentPane().add(this.txtTelefone);

        this.txtEmail = new JTextField();
        this.txtEmail.setBounds(150, 140, 150, 20);
        this.getContentPane().add(this.txtEmail);

        this.btnCadastro = new JButton("Cadastrar");
        this.btnCadastro.setBounds(100, 200, 100, 30);
        this.btnCadastro.setBackground(Color.green);
        this.btnCadastro.addActionListener(this);

        this.btnCancela = new JButton("Cancelar");
        this.btnCancela.setBounds(210, 200, 100, 30);
        this.btnCancela.setBackground(Color.red);
        this.btnCancela.addActionListener(this);

        this.getContentPane().add(this.btnCancela);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.getContentPane().add(this.btnCadastro);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }
    }
    
    @override 
    public void actionPerformed(ActionEvent e){
    	if (e.getSource() == btnCadastro) {
            String cliente = txtCliente.getText();
            String telefone = txtTelefone.getText();
            String endereco = txtEndereço.getText();
            String email = txtEmail.getText();

            JOptionPane.showMessageDialog(this, "Nome: " + cliente + "\Telefone: " + telefone +
                    "\nCPF: " + cpf + "\nEndereço: " + endereco + "\nEmail: " + email, "Cadastro realizado",
                    JOptionPane.INFORMATION_MESSAGE);

            txtCliente.setText("");
            txtDtNascimento.setText("");
            txtCpf.setText("");
            txtEndereço.setText("");
            txtEmail.setText("");
        } else if (e.getSource() == btnCancela) {
            this.dispose();
        }
    	
    }
}
