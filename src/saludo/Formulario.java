 /* Tarea 1 del segundo parcial Navarrete Rosales Karla Paola. */
package saludo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;

public class Formulario extends JFrame {
    private final JLabel lblTitulo;
    private final JLabel lbl;
    private final JButton btn;
    private final JFormattedTextField txtNombre;
    
  public Formulario() {
      this.setBounds(100, 100, 400, 300);
      this.setDefaultCloseOperation(
      JFrame.EXIT_ON_CLOSE
      );
      this.getContentPane().setLayout(null);
      
      lblTitulo = new JLabel("Saludo");
      lblTitulo.setBounds(30, 20, 200, 30);
      this.getContentPane().add(lblTitulo);
      
      lbl = new JLabel("¿Cómo te llamas?");
      lbl.setBounds(30,60,200,30);
      this.getContentPane().add(lbl);
      
      txtNombre = new JFormattedTextField();
      txtNombre.setValue("Escribe tu nombre");
      txtNombre.setBounds(30, 100, 200, 30);
      this.getContentPane().add(txtNombre);
      
      btn = new JButton("Saludar");
      btn.setBounds(70,150,120,35);
      this.getContentPane().add(btn);
      Evento e = new Evento();
      btn.addActionListener(e);
  }
  
    class Evento implements ActionListener {
          @Override
          public void actionPerformed(ActionEvent e){
              String nombre = txtNombre.getText();
    lblTitulo.setText("¡Hola,bienvenido " + nombre +  "!");
    lbl.setVisible(false);
    txtNombre.setVisible(false);
    btn.setVisible(false);
          }
    }
}
 
