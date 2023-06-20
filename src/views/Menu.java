package views;

import java.awt.Window;
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
        JMenu petMenu = new JMenu("Pets");
        JMenu servicosMenu = new JMenu("Serviços");
        JMenu produtosMenu = new JMenu("Produtos");
        JMenu sobreMenu = new JMenu("Sobre");


        // Criar os JMenuItems
        JMenuItem clienteItem = new JMenuItem("Novo Cliente");
        // JMenuItem clienteItem = new JMenuItem("Todos");
        JMenuItem petItem = new JMenuItem("Novo Pet");
        // JMenuItem petItem = new JMenuItem("Todos");
        JMenuItem servicosItem = new JMenuItem("Novo Serviço");
        // JMenuItem servicosItem = new JMenuItem("Serviço em andamento");
        JMenuItem produtosItem = new JMenuItem("Produtos");
        JMenuItem sobreItem = new JMenuItem("Sobre");

        // Adicionar os JMenuItems aos JMenus
        clienteMenu.add(clienteItem);
        petMenu.add(petItem);
        servicosMenu.add(servicosItem);
        produtosMenu.add(produtosItem);
        sobreMenu.add(sobreItem);

        // Adicionar os JMenus à JMenuBar
        menuBar.add(clienteMenu);
        menuBar.add(petMenu);
        menuBar.add(servicosMenu);
        menuBar.add(produtosMenu);
        menuBar.add(sobreMenu);

        // Adicionar a JMenuBar ao JFrame
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
   
    


        // Configuração do evento de clique do botão "Abrir"
       clienteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cliente janelaGUI = new Cliente(); 
                janelaGUI.setVisible(true);
            }
        });
        
        // Configuração do evento de clique do botão "Abrir"
       petItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Pet janelaGUI = new Pet(); 
                ((Window) janelaGUI).setVisible(true);
            }
        });
                // Configuração do evento de clique do botão "Abrir"
      servicosItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Servico janelaGUI = new Servico("Atendimento");
                janelaGUI.setVisible(true);
            }
        });


 }

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}