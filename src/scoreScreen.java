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

    public scoreScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

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

        lblScores.setFont(new java.awt.Font("Brush Script MT", 1, 48)); 
        lblScores.setForeground(new java.awt.Color(255, 255, 255));
        lblScores.setText("Scores");

        btnExport.setBackground(new java.awt.Color(255, 255, 255));
        btnExport.setFont(new java.awt.Font("Brush Script Std", 0, 24)); 
        btnExport.setForeground(new java.awt.Color(0, 0, 255));
        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Brush Script Std", 0, 24)); 
        btnSearch.setForeground(new java.awt.Color(0, 0, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMenu.setFont(new java.awt.Font("Brush Script Std", 0, 24)); 
        btnMenu.setForeground(new java.awt.Color(0, 0, 255));
        btnMenu.setText("Back");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblOutput.setFont(new java.awt.Font("Candara", 1, 18)); 
        lblOutput.setForeground(new java.awt.Color(255, 255, 255));

        txtInput.setFont(new java.awt.Font("Candara", 0, 18)); 

        lblTitle.setFont(new java.awt.Font("Candara", 1, 24)); 
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Enter your name:");

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Advitya\\Documents\\FinalProject_AChhabra\\src\\background.jpg")); 

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
    }
    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {
       try {
            sortFile();
        } catch (IOException ex) {
            Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.exit(0);
    }
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {
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
    }
    
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {

        openingScreen start= new openingScreen();
        start.setVisible(true);
        this.dispose();
    }

    public static int sortedLinearSearch (String [ ] A, String V) {
    for (int k=0; k<A.length; k++) {
        int compare = A[k].compareTo(V);
        if (compare == 0) {
            return k;
        }
    }
    return -1;
}

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scoreScreen().setVisible(true);
            }
        });
    }

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

}
