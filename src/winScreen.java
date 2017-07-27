import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;


public class winScreen extends javax.swing.JFrame {
/*
Name: Advitya Chhabra
Date: July 26 2017
Assignment: Summative
Purpose: Create a working hangman game
Screen purpose: This is the screen that is displayed when the user wins,
                it takes the user's name and writes it to an external file
*/
    
//creates an arraylist with the type player    
ArrayList <players> playerScores = new ArrayList ();
public static double time, multiplier;
DecimalFormat x = new DecimalFormat("#.00");
        

    public winScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        lblTime = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        lblTitle1.setFont(new java.awt.Font("Brush Script MT", 1, 48)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("Hangman");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setFont(new java.awt.Font("Brush Script MT", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Enter Name:");

        txtInput.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        lblTime.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Brush Script Std", 0, 24)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 0, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("You guessed the word!");

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Advitya\\Documents\\FinalProject_AChhabra\\src\\background.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(btnSubmit))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    Clicking this button takes the user's name and score and writes it to an external scoresheet. The
    preconditon for this button is that the user must win the game and enter their name in the textbox.
    The user's name and score are added as elements of an object, with that object being the player
    */
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        players scores;
        String name, score;
        
        name = this.txtInput.getText();
        score = x.format((time*multiplier));
        
        //adds the object to the object array
        scores = new players(name, score);
        playerScores.add(scores);
        
        //runs the highscore method
        try {
             highScores(playerScores);
         } catch (IOException ex) {
             Logger.getLogger(winScreen.class.getName()).log(Level.SEVERE, null, ex);
         }
   
        openingScreen start= new openingScreen();
        start.setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_btnSubmitActionPerformed
    
    /*
    This method takes the object array which is the players, their names and their
    scores and it writes it to an external score sheet, which is an external text file.
    The preconditions to this method is that the user must win and enter their name. 
    An object of the user is then created and put in an object array.
    */
    public void highScores(ArrayList<players> playerScores) throws IOException{
        for (int i = 0; i < playerScores.size(); i++) {
            write(playerScores.get(i));
        }
    }
    void write(players playerScores) throws IOException  {
        Writer out = new OutputStreamWriter(new FileOutputStream("scores.txt",true));
        try {
          out.write(playerScores.score+"\r\n"+playerScores.name+"\r\n");
        }
        finally {
          out.close();
        }
    }

    /*
    This method takes the time that the user took to guess the word and outputs 
    it as their score. Precondition same as last method.
    */
    public void time(double passed){
    this.lblTime.setText("It took you "+ x.format(passed)+ " seconds!");
    lblTime.setHorizontalAlignment(SwingConstants.CENTER);
    
    time=passed;
    }     
    
    /*
    This method calculates the score of the user depending on the level they chose
    to play.Precondition same as last method.
    */
    public void scoreMultiplier(String difficulty){
    
        if(difficulty.equals("e"))
            multiplier= 1;
        else if(difficulty.equals("m"))
            multiplier= 0.85;
        else if(difficulty.equals("h"))
            multiplier= 0.7;
    }
    /*
    This class defines the type player. Each object that is a player has a name
    and score
    */
    class players {

        String name, score;

        players (String _name, String _score) {
            name = _name;
            score = _score;
           
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(winScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(winScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(winScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(winScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new winScreen().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
