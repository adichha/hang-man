import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.SwingConstants;


public class mainScreen extends javax.swing.JFrame {

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

        lblLivesTitle.setFont(new java.awt.Font("Candara", 1, 24)); 
        lblLivesTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblLivesTitle.setText("Lives:");
        jPanel1.add(lblLivesTitle);
        lblLivesTitle.setBounds(260, 10, 70, 30);

        lblLives.setFont(new java.awt.Font("Candara", 1, 24));
        lblLives.setForeground(new java.awt.Color(255, 255, 255));
        lblLives.setText(" ");
        jPanel1.add(lblLives);
        lblLives.setBounds(340, 10, 50, 30);

        lblGuessed.setFont(new java.awt.Font("Candara", 1, 18));
        jPanel1.add(lblGuessed);
        lblGuessed.setBounds(10, 250, 380, 40);

        btnGuess.setBackground(new java.awt.Color(255, 255, 255));
        btnGuess.setFont(new java.awt.Font("Brush Script Std", 0, 24)); 
        btnGuess.setForeground(new java.awt.Color(0, 0, 255));
        btnGuess.setText("Guess");
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuess);
        btnGuess.setBounds(160, 210, 90, 33);

        txtInput.setFont(new java.awt.Font("Candara", 0, 18)); 
        jPanel1.add(txtInput);
        txtInput.setBounds(160, 170, 90, 30);

        lblOutput.setFont(new java.awt.Font("Candara", 1, 48)); 
        lblOutput.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblOutput);
        lblOutput.setBounds(10, 100, 380, 60);

        lblComment.setFont(new java.awt.Font("Candara", 1, 18));
        lblComment.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblComment);
        lblComment.setBounds(10, 40, 380, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Advitya\\Documents\\FinalProject_AChhabra\\src\\background.jpg")); 
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
    }
    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {
    String temp="";
    
    letter= this.txtInput.getText();   
    
    
    this.lblLives.setText(lives+"");
    
    if(guessed.indexOf(letter)==-1){

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
        
     if(letter.equalsIgnoreCase(guessWord) ){
              winScreen win= new winScreen();
              win.setVisible(true);
              this.dispose();
              stop=System.currentTimeMillis();
              passed=(stop-start)*0.001;
              win.time(passed);
          }
     
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
    }

    public static void main(String args[]) {
       
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainScreen().setVisible(true);

            }
        });
        
    }

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

}
