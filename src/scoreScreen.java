import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;

public class scoreScreen extends javax.swing.JFrame {
/*
Name: Advitya Chhabra
Date: July 26 2017
Assignment: Summative
Purpose: Create a working hangman game
Screen purpose: The screen where the user can check their score
*/
    public scoreScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblScores = new javax.swing.JLabel();
        btnExport = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        lblOutput = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblScores.setFont(new java.awt.Font("Brush Script MT", 1, 48)); // NOI18N
        lblScores.setForeground(new java.awt.Color(255, 255, 255));
        lblScores.setText("Scores");

        btnExport.setBackground(new java.awt.Color(255, 255, 255));
        btnExport.setFont(new java.awt.Font("Brush Script Std", 0, 24)); // NOI18N
        btnExport.setForeground(new java.awt.Color(0, 0, 255));
        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Brush Script Std", 0, 24)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMenu.setFont(new java.awt.Font("Brush Script Std", 0, 24)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(0, 0, 255));
        btnMenu.setText("Back");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblOutput.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        lblOutput.setForeground(new java.awt.Color(255, 255, 255));

        txtInput.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        lblTitle.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Enter your name:");

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Advitya\\Documents\\FinalProject_AChhabra\\src\\background.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblScores, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblScores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnExport))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btnMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //When this button is clicked the contents of the score sheet are sorted so they can be saved, precondition is that there must be scores to sort
    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
       try {
            sortFile();
        } catch (IOException ex) {
            Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.exit(0);
    }//GEN-LAST:event_btnExportActionPerformed

    /*
    Clicking this button, searches through the external text file to see if it contains the name of a user.
    It works by reading line by line through the textfile, it adds the player's names to one file and their
    score to another file. It then finds the user's name in the name array and retrives the element with the
    same index number in the scores array. It then outputs the user's score.
    */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        ArrayList <String> playerName = new ArrayList <>();
        ArrayList <String> playerScore = new ArrayList<>();
        int counter=0;
        int index;
        String name= this.txtInput.getText();
        
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("scores.txt"));
            
            String score;
            while ((score = br.readLine()) != null ){
                
                /*
                player scores are added to one array and their names are added to another
                */
                if(counter%2==0){
                playerScore.add(score);
                }
                else{
                playerName.add(score);
                }
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
      
        String [] scoreName = new String[playerName.size()];
        playerName.toArray(scoreName);
        
        String message;
        
        //conducts linear search
        if (sortedLinearSearch(scoreName, name)!=-1){
            index = sortedLinearSearch(scoreName, name);
            message = "Your score was "+playerScore.get(index)+" seconds";
        }
        else
            message = "This name is not in the system";
        
        this.lblOutput.setText(message);
        lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
    }//GEN-LAST:event_btnSearchActionPerformed
    //When this button is clicked, the page switches to the opening screen
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed

        openingScreen start= new openingScreen();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

     /*
    The following method searches through an array for a String and returns the index of the string, if the
    string is not in the array it reults -1.
    */
    public static int sortedLinearSearch (String [ ] A, String V) {
    for (int k=0; k<A.length; k++) {
        int compare = A[k].compareTo(V);
        if (compare == 0) {
            return k;
        }
    }
    return -1;
}
    
    /*
    The following method sorts the contents of the scoresheet, it reads the contents of the file row by row,
    adds it all to an arraylist and sorts that arraylist, it then writes the new arraylist to the file The 
    precondition is that the file must contain records to be sorted, meaning that the game must be played.
    */
    public static void sortFile() throws IOException
{   
    FileReader fileReader = new FileReader("scores.txt");
    BufferedReader readFile = new BufferedReader(fileReader);
    ArrayList<String> lines = new ArrayList<String>();
    String line = null;
    while ((line = readFile.readLine()) != null) {
        lines.add(line);
    }
    readFile.close();

    Collections.sort(lines, Collator.getInstance());
    
    FileWriter writer = new FileWriter("scores.txt"); 
    for(String scores: lines) {
      writer.write(scores + "\r\n");
    }
    writer.close();
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
            java.util.logging.Logger.getLogger(scoreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scoreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scoreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scoreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scoreScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblScores;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
