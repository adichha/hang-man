import javax.swing.SwingConstants;


public class loseScreen extends javax.swing.JFrame {

public static String word;
    public loseScreen() {
        initComponents();
        this.lblWord.setText("Your word was "+ word);
        lblWord.setHorizontalAlignment(SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnRetry = new javax.swing.JButton();
        lblWord = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        lblTitle.setFont(new java.awt.Font("Brush Script MT", 1, 36)); 
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Oh no you lost!");
        jPanel2.add(lblTitle);
        lblTitle.setBounds(100, 80, 220, 60);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Brush Script Std", 0, 24)); 
        btnExit.setForeground(new java.awt.Color(0, 0, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit);
        btnExit.setBounds(230, 250, 100, 33);

        btnRetry.setBackground(new java.awt.Color(255, 255, 255));
        btnRetry.setFont(new java.awt.Font("Brush Script Std", 0, 24)); 
        btnRetry.setForeground(new java.awt.Color(0, 0, 255));
        btnRetry.setText("Retry");
        btnRetry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetryActionPerformed(evt);
            }
        });
        jPanel2.add(btnRetry);
        btnRetry.setBounds(60, 250, 100, 33);

        lblWord.setFont(new java.awt.Font("Candara", 1, 18)); 
        lblWord.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblWord);
        lblWord.setBounds(0, 140, 400, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Advitya\\Documents\\FinalProject_AChhabra\\src\\background.jpg")); // NOI18N
        jPanel2.add(lblBackground);
        lblBackground.setBounds(0, 0, 400, 300);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void btnRetryActionPerformed(java.awt.event.ActionEvent evt) {
        openingScreen start = new openingScreen();
        
        start.setVisible(true);
        this.dispose();
    }

    public static void wordReveal(String guessWord){
        word= guessWord;
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
            java.util.logging.Logger.getLogger(loseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                new loseScreen().setVisible(true);
                
            }
        });
    }

    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRetry;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWord;

}
