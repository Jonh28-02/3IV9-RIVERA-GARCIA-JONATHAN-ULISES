import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class GATO extends JFrame implements ActionListener{
        JButton iniciar;
        JButton tablero [][];
        String jugador1,jugador2;
        int turno=-1;
        JLabel mensaje;
        Color colorB;
        JLabel puntaje1,puntaje2;

    public GATO(JButton iniciar, JButton[][] tablero, String jugador1, String jugador2, JLabel mensaje, Color colorB, JLabel puntaje1, JLabel puntaje2) {
        this.iniciar = iniciar;
        this.tablero = tablero;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.mensaje = mensaje;
        this.colorB = colorB;
        this.puntaje1 = puntaje1;
        this.puntaje2 = puntaje2;
    }
        
        
        GATO (){
            jugador1=JOptionPane.showInputDialog(this,"Escribe tu nombre,jugador1");
            jugador2=JOptionPane.showInputDialog(this,"Escribe tu nombre, jugador2");   
            this.setLayout(null);
            mensaje = new JLabel("Hola, soy la Barbie Guiaaa");
            mensaje.setBounds(150,40,200,30);
            this.add(mensaje);
            iniciar = new JButton("ARRANCAAA");
            iniciar.setBounds(175,350,150,30);
            iniciar.addActionListener(this);
            this.add(iniciar);  
            
            
            /*JButton guardar = new JButton("Guardar");
            guardar.setBounds(170,470,150,30);
            guardar.addActionListener(this);
            this.add(guardar);*/

            
            this.setLayout(null);
            JLabel Jugador1 = new JLabel("Jugador 1 :"+jugador1);
            Jugador1.setBounds(110,420,210,30);
            this.add(Jugador1);
            
            this.setLayout(null);
            puntaje2 = new JLabel("Puntaje");
            puntaje2.setBounds(110,430,210,30);
            this.add(puntaje2);
            
            
            this.setLayout(null);
            puntaje1 = new JLabel("0");
            puntaje1.setBounds(190,430,210,30);
            this.add(puntaje1);
            
            this.setLayout(null);
            JLabel Jugador2 = new JLabel("Jugador 2 :"+jugador2);
            Jugador2.setBounds(250,420,210,30);
            this.add(Jugador2);
            
            this.setLayout(null);
            puntaje2 = new JLabel("Puntaje");
            puntaje2.setBounds(250,430,210,30);
            this.add(puntaje2);
            
            this.setLayout(null);
            puntaje2 = new JLabel("0");
            puntaje2.setBounds(330,430,210,30);
            this.add(puntaje2);
            
            
            
            tablero=new JButton[3][3];
            for(int i=0;i<3;i++){
                for(int j=0; j<3;j++){
                    tablero[i][j]=new JButton();
                    tablero[i][j].setBounds((i+1)*80+40,(j+1)*80,80,80);
                    this.add(tablero[i][j]);
                    tablero[i][j].addActionListener(this);
                }
            }
            colorB=tablero[0][0].getBackground();
        }
        
    //METODO MAIIIIIIIIIIIIIIIIIIIIIN
    public static void main(String [] args){        
        
        
        GATO ventana=new GATO();
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(500,550);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setTitle("VAMO A JUGAAAAAAAAAAAAAAAA");
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==iniciar){
            turno=0;
            JOptionPane.showMessageDialog(this,"Iniciando, abrocha tu cinturon");
            //jugador1=JOptionPane.showInputDialog(this,"Escribe tu nombre,jugador1");
            //jugador2=JOptionPane.showInputDialog(this,"Escribe tu nombre, jugador2");
            mensaje.setText("Turno de "+jugador1);
            limpiar();
        }else{
            JButton boton=(JButton) e.getSource();
            if(turno==0){
                if(boton.getText().equals("")){
                    boton.setBackground(Color.PINK);
                    boton.setText("X");
                    boton.setEnabled(false);
                    turno=1;
                    mensaje.setText("Turno del Jugador "+jugador2);
                }
            }else{
                if(turno==1){
                    if(boton.getText().equals("")){
                    boton.setBackground(Color.cyan);
                    boton.setText("O");
                    boton.setEnabled(false);
                    turno=0;
                    mensaje.setText("Turno del Jugador "+jugador1);
                }
            }
        }
            verificar();
    }
}
    private void verificar(){
        int ganador=0;
        for(int i=0;i<3;i++){
            if(tablero[0][i].getText().equals("X") && tablero[1][i].getText().equals("X")&& tablero[2][i].getText().equals("X")){
                ganador=1;
            }
            if(tablero[i][0].getText().equals("X") && tablero[i][1].getText().equals("X")&& tablero[i][2].getText().equals("X")){
                ganador=1;
            }
        }
        if(tablero[0][0].getText().equals("X") && tablero[1][1].getText().equals("X")&& tablero[2][2].getText().equals("X")){
                ganador=1;
        }
        if(tablero[0][2].getText().equals("X") && tablero[1][1].getText().equals("X")&& tablero[2][0].getText().equals("X")){
            ganador=1;
        }
        //Para las O
        for(int i=0;i<3;i++){
            if(tablero[0][i].getText().equals("O") && tablero[1][i].getText().equals("O")&& tablero[2][i].getText().equals("O")){
                ganador=2;
            }
            if(tablero[i][0].getText().equals("O") && tablero[i][1].getText().equals("O")&& tablero[i][2].getText().equals("O")){
                ganador=2;
            }
        }
        if(tablero[0][0].getText().equals("O") && tablero[1][1].getText().equals("O")&& tablero[2][2].getText().equals("O")){
                ganador=2;
        }
        if(tablero[0][2].getText().equals("O") && tablero[1][1].getText().equals("O")&& tablero[2][0].getText().equals("O")){
            ganador=2;
        }
        if(ganador==1){
            JOptionPane.showMessageDialog(this, "Ganaste "+jugador1);
            puntaje1.setText(Integer.toString(Integer.parseInt(puntaje1.getText()) + 5));
            bloquear();
        }
        if(ganador==2){
            JOptionPane.showMessageDialog(this, "Ganaste "+jugador2);
            puntaje2.setText(Integer.toString(Integer.parseInt(puntaje2.getText()) + 5));
            bloquear();
        }
    }
    private void bloquear(){
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tablero[i][j].setEnabled(false);
            }
        }
    }
    private void limpiar(){
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tablero[i][j].setEnabled(true);
                tablero[i][j].setText("");
                tablero[i][j].setBackground(colorB);

            }
        }        
    }           
}
