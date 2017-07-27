public class openingScreen extends javax.swing.JFrame {
/*
Name: Advitya Chhabra
Date: July 26 2017
Assignment: Summative
Purpose: Create a working hangman game
Screen purpose: This is the opening screen of the game, 
                it gives the user options as to what they wish to do
*/
    public static String difficulty;

    public openingScreen() {
        initComponents();         
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupLevel = new javax.swing.ButtonGroup();
        panelLayout = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnPlayGame = new javax.swing.JButton();
        btnScores = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        btnHard = new javax.swing.JRadioButton();
        btnEasy = new javax.swing.JRadioButton();
        btnMedium = new javax.swing.JRadioButton();
        btnRules = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLayout.setBackground(new java.awt.Color(204, 204, 0));
        panelLayout.setForeground(new java.awt.Color(255, 102, 51));
        panelLayout.setLayout(null);

        lblTitle.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Difficulty:");
        panelLayout.add(lblTitle);
        lblTitle.setBounds(10, 270, 110, 30);

        btnPlayGame.setBackground(new java.awt.Color(255, 255, 255));
        btnPlayGame.setFont(new java.awt.Font("Brush Script Std", 0, 24)); // NOI18N
        btnPlayGame.setForeground(new java.awt.Color(0, 0, 255));
        btnPlayGame.setText("Play");
        btnPlayGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayGameActionPerformed(evt);
            }
        });
        panelLayout.add(btnPlayGame);
        btnPlayGame.setBounds(160, 140, 90, 33);

        btnScores.setBackground(new java.awt.Color(255, 255, 255));
        btnScores.setFont(new java.awt.Font("Brush Script Std", 0, 24)); // NOI18N
        btnScores.setForeground(new java.awt.Color(0, 0, 255));
        btnScores.setText("Score");
        btnScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoresActionPerformed(evt);
            }
        });
        panelLayout.add(btnScores);
        btnScores.setBounds(160, 220, 90, 33);

        lblTitle1.setFont(new java.awt.Font("Brush Script MT", 1, 48)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("Hangman");
        panelLayout.add(lblTitle1);
        lblTitle1.setBounds(120, 50, 180, 70);

        btnHard.setBackground(new java.awt.Color(0, 204, 0));
        groupLevel.add(btnHard);
        btnHard.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnHard.setText("Hard");
        panelLayout.add(btnHard);
        btnHard.setBounds(290, 270, 80, 27);

        btnEasy.setBackground(new java.awt.Color(0, 204, 0));
        groupLevel.add(btnEasy);
        btnEasy.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnEasy.setText("Easy");
        panelLayout.add(btnEasy);
        btnEasy.setBounds(120, 270, 80, 27);

        btnMedium.setBackground(new java.awt.Color(0, 204, 0));
        groupLevel.add(btnMedium);
        btnMedium.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnMedium.setText("Medium");
        panelLayout.add(btnMedium);
        btnMedium.setBounds(200, 270, 80, 27);

        btnRules.setBackground(new java.awt.Color(255, 255, 255));
        btnRules.setFont(new java.awt.Font("Brush Script Std", 0, 24)); // NOI18N
        btnRules.setForeground(new java.awt.Color(0, 0, 255));
        btnRules.setText("Rules");
        btnRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRulesActionPerformed(evt);
            }
        });
        panelLayout.add(btnRules);
        btnRules.setBounds(160, 180, 90, 33);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Advitya\\Documents\\FinalProject_AChhabra\\src\\background.jpg")); // NOI18N
        panelLayout.add(lblBackground);
        lblBackground.setBounds(0, 0, 400, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    By clicking this button, the program sets itself up to play hangman, it reads the userinput for difficulty,
    styles the radio buttons to be transparent, sends the user's input as a variable to two other pages and
    switches to the game page.
    */
    private void btnPlayGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayGameActionPerformed

        btnEasy.setActionCommand("e");
        btnMedium.setActionCommand("m");
        btnHard.setActionCommand("h");
        
        //styles the radio buttons to be transparent
        btnEasy.setOpaque(false);
        btnEasy.setContentAreaFilled(false);
        btnEasy.setBorderPainted(false);
        
        difficulty= groupLevel.getSelection().getActionCommand();
        
        //sends the user input for difficulty to two other pages
        mainScreen game =  new mainScreen();
        winScreen win = new winScreen();
        game.hangMan(difficulty);
        win.scoreMultiplier(difficulty);
        
        game.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnPlayGameActionPerformed

    //By clicking this button, the program switches to the scores page  
    private void btnScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoresActionPerformed
        scoreScreen scores= new scoreScreen();
        scores.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnScoresActionPerformed
    //By clicking this button, the program switches to the rules page 
    private void btnRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRulesActionPerformed
        rulesScreen rules= new rulesScreen();
        rules.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRulesActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(openingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(openingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(openingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(openingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new openingScreen().setVisible(true);

            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnEasy;
    private javax.swing.JRadioButton btnHard;
    private javax.swing.JRadioButton btnMedium;
    private javax.swing.JButton btnPlayGame;
    private javax.swing.JButton btnRules;
    private javax.swing.JButton btnScores;
    private javax.swing.ButtonGroup groupLevel;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JPanel panelLayout;
    // End of variables declaration//GEN-END:variables
}
