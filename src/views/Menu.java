import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame implements ActionListener{ 
   

	public static void  main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Criar o JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Criar os JMenus
        JMenu clienteMenu = new JMenu("Clientes");
        JMenu petMenu = new JMenu("Pet");
        JMenu servicosMenu = new JMenu("Serviços");

        // Criar os JMenuItems
        JMenuItem clienteItem = new JMenuItem("Novo Cliente");
        // JMenuItem clienteItem = new JMenuItem("Todos");
        JMenuItem petItem = new JMenuItem("Novo Pet");
        // JMenuItem petItem = new JMenuItem("Todos");
        JMenuItem servicosItem = new JMenuItem("Novo Serviço");
        // JMenuItem servicosItem = new JMenuItem("Serviço em andamento");


        // Adicionar os JMenuItems aos JMenus
        clienteMenu.add(clienteItem);
        petMenu.add(petItem);
        servicosMenu.add(servicosItem);

        // Adicionar os JMenus à JMenuBar
        menuBar.add(clienteMenu);
        menuBar.add(petMenu);
        menuBar.add(servicosMenu);

        // Adicionar a JMenuBar ao JFrame
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
   
    
        // Criação do botão de "Abrir"
        // JButton abrirButton = new JButton("Abrir");

        // Configuração do evento de clique do botão "Abrir"
       clienteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a GUI desejada
                // MinhaJanelaGUI janelaGUI = new MinhaJanelaGUI();
                Cliente janelaGUI = new Cliente("Cadastro"); 
                janelaGUI.setVisible(true);
            }
        });
        
        // Configuração do evento de clique do botão "Abrir"
       petItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a GUI desejada
                // MinhaJanelaGUI janelaGUI = new MinhaJanelaGUI();
                Pet janelaGUI = new Pet("Animal"); 
                janelaGUI.setVisible(true);
            }
        });
                // Configuração do evento de clique do botão "Abrir"
      servicosItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a GUI desejada
                // MinhaJanelaGUI janelaGUI = new MinhaJanelaGUI();
                Servico janelaGUI = new Servico("Atendimento");
                janelaGUI.setVisible(true);
            }
        });


 }

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}