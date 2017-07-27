import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.SwingConstants;


public class mainScreen extends javax.swing.JFrame {
/*
Name: Advitya Chhabra
Date: July 26 2017
Assignment: Summative
Purpose: Create a working hangman game
Screen purpose: This is the main screen, where the game is played
*/

public static String guessWord, letter, hiddenWord;
public static int lives =5;
public static long start, stop;
public static double passed;

ArrayList <String> words = new ArrayList <>();
ArrayList <String> wrongGuesses = new ArrayList <>();
ArrayList <String> guessed = new ArrayList <>();

    public mainScreen() {
        initComponents();
    }
 
    /*
    This method takes the difficulty that the user inputted and reads the appropriate section
    of the words file, choosing a word from that section of the file at random. It also begins
    a timer. The precondition for this method is that the user entered a difficulty and pressed
    the play button the opening screen.
    */
    public void hangMan(String difficulty){       
        guessed.clear();
        lives=5;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("words.txt"));
            
            String word;
            while ((word = br.readLine()) != null ){
                
            words.add(word);    
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
        
        Random word = new Random();
    
        if (difficulty=="e"){
        
            int wordRandom = word.nextInt(49) + 1;
            guessWord= words.get(wordRandom);
            playGame(guessWord);
            start = System.currentTimeMillis();
        }else if(difficulty=="m"){
            
            int wordRandom = word.nextInt(49) + 51;
            guessWord= words.get(wordRandom);
            playGame(guessWord);
            start = System.currentTimeMillis();   
        }else{
            
            int wordRandom = word.nextInt(49) + 101;
            guessWord= words.get(wordRandom);
            playGame(guessWord);
            start = System.currentTimeMillis();   
                
        }
    }
    
    /*
    This method takes the automatically generated word and replaces each letter in the word
    with dashes for the user to guess. It then outputs the hidden word. 
    */
    public void playGame(String word){
        hiddenWord = "";
        for(int i=0;i<word.length();i++){
         hiddenWord+="-";
        }
        this.lblOutput.setText(hiddenWord);
        lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
     
        this.lblLives.setText(lives+"");
        this.lblComment.setText("This word has "+guessWord.length()+" letters");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ag = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblLivesTitle = new javax.swing.JLabel();
        lblLives = new javax.swing.JLabel();
        lblGuessed = new javax.swing.JLabel();
        btnGuess = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        lblOutput = new javax.swing.JLabel();
        lblComment = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        lblLivesTitle.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        lblLivesTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblLivesTitle.setText("Lives:");
        jPanel1.add(lblLivesTitle);
        lblLivesTitle.setBounds(260, 10, 70, 30);

        lblLives.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        lblLives.setForeground(new java.awt.Color(255, 255, 255));
        lblLives.setText(" ");
        jPanel1.add(lblLives);
        lblLives.setBounds(340, 10, 50, 30);

        lblGuessed.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jPanel1.add(lblGuessed);
        lblGuessed.setBounds(10, 250, 380, 40);

        btnGuess.setBackground(new java.awt.Color(255, 255, 255));
        btnGuess.setFont(new java.awt.Font("Brush Script Std", 0, 24)); // NOI18N
        btnGuess.setForeground(new java.awt.Color(0, 0, 255));
        btnGuess.setText("Guess");
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuess);
        btnGuess.setBounds(160, 210, 90, 33);

        txtInput.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jPanel1.add(txtInput);
        txtInput.setBounds(160, 170, 90, 30);

        lblOutput.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        lblOutput.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblOutput);
        lblOutput.setBounds(10, 100, 380, 60);

        lblComment.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        lblComment.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblComment);
        lblComment.setBounds(10, 40, 380, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Advitya\\Documents\\FinalProject_AChhabra\\src\\background.jpg")); // NOI18N
        jPanel1.add(lblBackground);
        lblBackground.setBounds(0, 0, 400, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    Every time this button is clicked, the program reads the user input and saves it to an array
    which stores all of the user's guesses. It then checks to see if the letter is in the word 
    and if it is, it replaces the dash with the letter and displays it to the user.If the user 
    wins the game, the program switches to the winner's message screen and outputs the user's score. 
    If the user has five wrong guesses, a losing message screen is opened and the word is revealed.
    Upon every wrong guess, a lives counter is printed in the top right corner. Precondition requires
    the user to guess and put an input into the text box.
    */
    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed
    String temp="";
    
    //prints all of the user's guesses
    letter= this.txtInput.getText();   
    
    
    this.lblLives.setText(lives+"");
    
    //checks to see if word has been said before
    if(guessed.indexOf(letter)==-1){
    
        //if the user guesses a correct letter 
        for(int i =0;i<guessWord.length();i++){ 
               if(letter.charAt(0)==guessWord.charAt(i)) {       
                    temp +=guessWord.charAt(i); 
               }
               else{
                    temp +=hiddenWord.charAt(i); 
               }  
        }
              this.lblComment.setText("Nice guess!");
              hiddenWord = temp;
              this.lblOutput.setText(hiddenWord);
              
              
              //if the user makes a wrong guess attempt
              if(guessWord.indexOf(letter)==-1){
                  lives--;
                  wrongGuesses.add(letter);
                  String printGuessed = String.join(",", wrongGuesses);
                  this.lblGuessed.setText("Wrong Guesses: "+printGuessed);
                  this.lblLives.setText(lives+"");
                  this.lblComment.setText("That letter's not in the word!");
                  if(lives==0){

                  loseScreen.wordReveal(guessWord);    
                  loseScreen lose= new loseScreen();
                  lose.setVisible(true);
                  this.dispose();
                  }
              }
    }else{
        this.lblComment.setText("You already guessed that!");
    }
        
    //if the user guesses the whole word in one shot
     if(letter.equalsIgnoreCase(guessWord) ){
              winScreen win= new winScreen();
              win.setVisible(true);
              this.dispose();
              stop=System.currentTimeMillis();
              passed=(stop-start)*0.001;
              win.time(passed);
          }
     
    //if the user guesses the word letter by letter
    if(hiddenWord.equalsIgnoreCase(guessWord) ){ 
              winScreen win= new winScreen();
              win.setVisible(true);
              this.dispose();
              stop=System.currentTimeMillis();
              passed=(stop-start)*0.001;
              win.time(passed);
          }
    this.txtInput.setText("");
    guessed.add(letter);      
    }//GEN-LAST:event_btnGuessActionPerformed

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
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainScreen().setVisible(true);

            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ag;
    private javax.swing.JButton btnGuess;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblGuessed;
    private javax.swing.JLabel lblLives;
    private javax.swing.JLabel lblLivesTitle;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
