/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame1.java
 *
 * Created on Jul 29, 2017, 10:00:11 AM
 */

package prateek;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;

/**
 *
 * @author intel
 */
public class Food extends javax.swing.JFrame {

    /** Creates new form NewJFrame1 */
    public Food() {
        initComponents();
       r1.setVisible(false);
       r2.setVisible(false);
       r3.setVisible(false);
       r4.setVisible(false);
       r5.setVisible(false);
       r6.setVisible(false);
       r7.setVisible(false);
       r8.setVisible(false);
       r9.setVisible(false);
       r10.setVisible(false);
       r11.setVisible(false);
       r12.setVisible(false);
       r13.setVisible(false);
       r14.setVisible(false);
       r15.setVisible(false);
       r16.setVisible(false);
       r17.setVisible(false);
       r18.setVisible(false);
       r19.setVisible(false);
       r20.setVisible(false);
       r21.setVisible(false);
       r22.setVisible(false);
       r23.setVisible(false);
       r24.setVisible(false);
       r25.setVisible(false);
       r26.setVisible(false);
       r27.setVisible(false);
       r28.setVisible(false);
       r29.setVisible(false);
       r30.setVisible(false);
       r31.setVisible(false);
       r32.setVisible(false);
       r33.setVisible(false);
       r34.setVisible(false);
       r35.setVisible(false);
       r36.setVisible(false);
       r37.setVisible(false);
       r38.setVisible(false);
       r39.setVisible(false);
       r40.setVisible(false);
       r41.setVisible(false);
       r42.setVisible(false);
       r43.setVisible(false);
       r44.setVisible(false);
       r45.setVisible(false);
       r46.setVisible(false);
       r47.setVisible(false);
       r48.setVisible(false);
       r49.setVisible(false);
       r50.setVisible(false);
       r51.setVisible(false);
       r52.setVisible(false);
       
       try{
           Class.forName("java.sql.DriverManager");
           Connection c=(Connection)
                   DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","hello");
           Statement s=(Statement)c.createStatement();
           String query="select * from foodprice";
 ResultSet r=s.executeQuery(query);
while(r.next())
{String fname=r.getString("FoodItemIndex");
            if(fname.equalsIgnoreCase("r1"))
             r1.setToolTipText(r.getString("Price"));
           else if(fname.equalsIgnoreCase("r2"))
               r2.setToolTipText(r.getString("Price"));
          else if(fname.equalsIgnoreCase("r3"))
                r3.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r4"))
                r4.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r5"))
                r5.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r6"))
                r6.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r7"))
                r7.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r8"))
                r8.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r9"))
                r9.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r10"))
                r10.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r11"))
                r11.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r12"))
                r12.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r13"))
                r13.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r14"))
                r14.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r15"))
                r15.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r16"))
                r16.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r17"))
                r17.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r18"))
                r18.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r19"))
                r19.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r20"))
                r20.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r21"))
                r21.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r22"))
                r22.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r23"))
                r23.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r24"))
                r24.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r25"))
                r25.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r26"))
                r26.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r27"))
                r27.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r28"))
                r28.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r29"))
                r29.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r30"))
                r30.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r31"))
                r31.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r32"))
                r32.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r33"))
                r33.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r34"))
                r34.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r35"))
                r35.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r36"))
                r36.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r37"))
                r37.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r38"))
                r38.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r39"))
                r39.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r40"))
                r40.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r41"))
                r41.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r42"))
                {r42.setToolTipText(r.getString("Price"));
                 System.out.println(""+r42.getToolTipText());
                }
            else if(fname.equalsIgnoreCase("r43"))
                r43.setToolTipText(r.getString("Price"));

            else if(fname.equalsIgnoreCase("r44"))
                r44.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r45"))
                r45.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r46"))
                r46.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r47"))
                r47.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r48"))
                r48.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r49"))
                r49.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r50"))
                r50.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r51"))
                r51.setToolTipText(r.getString("Price"));
            else if(fname.equalsIgnoreCase("r52"))
                r52.setToolTipText(r.getString("Price"));
}
}

catch(Exception e)
{System.out.println(e);
       }
       

    }
    
    int q=0;
    public Food(String mg){
     initComponents();
q=Integer.parseInt(mg);
t1.setVisible(false);
t1.setText("0");
t2.setText("0000000000");
t2.setVisible(false);
l1.setVisible(false);
l2.setVisible(false);
p6.setVisible(false);
p8.setVisible(false);

}



int s1=0,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20;
int s21=0,s22,s23,s24,s25,s26,s27,s28,s29,s30,s31,s32,s33,s34,s35,s36,s37,s38,s39,s40;
int s41=0,s42,s43,s44,s45,s46,s47,s48,s49,s50,s51,s52;
      /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        r1 = new javax.swing.JSpinner();
        r2 = new javax.swing.JSpinner();
        r3 = new javax.swing.JSpinner();
        r4 = new javax.swing.JSpinner();
        r5 = new javax.swing.JSpinner();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        c6 = new javax.swing.JCheckBox();
        c7 = new javax.swing.JCheckBox();
        c8 = new javax.swing.JCheckBox();
        c9 = new javax.swing.JCheckBox();
        c10 = new javax.swing.JCheckBox();
        c11 = new javax.swing.JCheckBox();
        c12 = new javax.swing.JCheckBox();
        r6 = new javax.swing.JSpinner();
        r7 = new javax.swing.JSpinner();
        r8 = new javax.swing.JSpinner();
        r9 = new javax.swing.JSpinner();
        r10 = new javax.swing.JSpinner();
        r11 = new javax.swing.JSpinner();
        r12 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        c23 = new javax.swing.JCheckBox();
        c24 = new javax.swing.JCheckBox();
        c25 = new javax.swing.JCheckBox();
        c26 = new javax.swing.JCheckBox();
        c27 = new javax.swing.JCheckBox();
        c28 = new javax.swing.JCheckBox();
        r23 = new javax.swing.JSpinner();
        r24 = new javax.swing.JSpinner();
        r25 = new javax.swing.JSpinner();
        r26 = new javax.swing.JSpinner();
        r27 = new javax.swing.JSpinner();
        r28 = new javax.swing.JSpinner();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        c41 = new javax.swing.JCheckBox();
        c42 = new javax.swing.JCheckBox();
        c43 = new javax.swing.JCheckBox();
        c44 = new javax.swing.JCheckBox();
        c45 = new javax.swing.JCheckBox();
        r41 = new javax.swing.JSpinner();
        r42 = new javax.swing.JSpinner();
        r43 = new javax.swing.JSpinner();
        r44 = new javax.swing.JSpinner();
        r45 = new javax.swing.JSpinner();
        jLabel44 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        c46 = new javax.swing.JCheckBox();
        r46 = new javax.swing.JSpinner();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        c13 = new javax.swing.JCheckBox();
        c14 = new javax.swing.JCheckBox();
        c15 = new javax.swing.JCheckBox();
        c16 = new javax.swing.JCheckBox();
        c17 = new javax.swing.JCheckBox();
        c18 = new javax.swing.JCheckBox();
        c19 = new javax.swing.JCheckBox();
        r13 = new javax.swing.JSpinner();
        r14 = new javax.swing.JSpinner();
        r15 = new javax.swing.JSpinner();
        r16 = new javax.swing.JSpinner();
        r17 = new javax.swing.JSpinner();
        r18 = new javax.swing.JSpinner();
        r19 = new javax.swing.JSpinner();
        c20 = new javax.swing.JCheckBox();
        r20 = new javax.swing.JSpinner();
        c21 = new javax.swing.JCheckBox();
        r21 = new javax.swing.JSpinner();
        r22 = new javax.swing.JSpinner();
        c22 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        c29 = new javax.swing.JCheckBox();
        c30 = new javax.swing.JCheckBox();
        c31 = new javax.swing.JCheckBox();
        c32 = new javax.swing.JCheckBox();
        c33 = new javax.swing.JCheckBox();
        c34 = new javax.swing.JCheckBox();
        r29 = new javax.swing.JSpinner();
        r30 = new javax.swing.JSpinner();
        r31 = new javax.swing.JSpinner();
        r32 = new javax.swing.JSpinner();
        r33 = new javax.swing.JSpinner();
        r34 = new javax.swing.JSpinner();
        jLabel74 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        c35 = new javax.swing.JCheckBox();
        c36 = new javax.swing.JCheckBox();
        c37 = new javax.swing.JCheckBox();
        c38 = new javax.swing.JCheckBox();
        c39 = new javax.swing.JCheckBox();
        c40 = new javax.swing.JCheckBox();
        r35 = new javax.swing.JSpinner();
        r36 = new javax.swing.JSpinner();
        r37 = new javax.swing.JSpinner();
        r38 = new javax.swing.JSpinner();
        r39 = new javax.swing.JSpinner();
        r40 = new javax.swing.JSpinner();
        jLabel83 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        p8 = new javax.swing.JPanel();
        c47 = new javax.swing.JCheckBox();
        r47 = new javax.swing.JSpinner();
        c48 = new javax.swing.JCheckBox();
        r48 = new javax.swing.JSpinner();
        c49 = new javax.swing.JCheckBox();
        r49 = new javax.swing.JSpinner();
        c50 = new javax.swing.JCheckBox();
        r50 = new javax.swing.JSpinner();
        r51 = new javax.swing.JSpinner();
        c51 = new javax.swing.JCheckBox();
        c52 = new javax.swing.JCheckBox();
        r52 = new javax.swing.JSpinner();
        jLabel55 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Soups", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        c1.setText("Tomato soup");
        c1.setToolTipText("");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        c2.setText("Corn soup");
        c2.setToolTipText("");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        c3.setText("Vegetable soup");
        c3.setToolTipText("150");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        c4.setText("houseway soup");
        c4.setToolTipText("100");
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });

        c5.setText("lemon coriender soup");
        c5.setToolTipText("150");
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });

        r1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r2.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r3.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r4.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r5.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel46.setText("Qty");

        jLabel48.setText("Items");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c5)
                            .addComponent(c4)
                            .addComponent(c3)
                            .addComponent(c2)
                            .addComponent(c1)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel48)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c2)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c3)
                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c5)
                            .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c4)
                        .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dals", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        c6.setText("Dal makni");
        c6.setToolTipText("220");
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });

        c7.setText("Dal fry");
        c7.setToolTipText("200");
        c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7ActionPerformed(evt);
            }
        });

        c8.setText(" Dal tarka");
        c8.setToolTipText("180");
        c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c8ActionPerformed(evt);
            }
        });

        c9.setText(" gujrati Dal");
        c9.setToolTipText("150");
        c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c9ActionPerformed(evt);
            }
        });

        c10.setText(" Dal masala");
        c10.setToolTipText("180");
        c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c10ActionPerformed(evt);
            }
        });

        c11.setText("fry Shai dal");
        c11.setToolTipText("320");
        c11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c11ActionPerformed(evt);
            }
        });

        c12.setText(" Mix dal");
        c12.setToolTipText("180");
        c12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c12ActionPerformed(evt);
            }
        });

        r6.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r7.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r8.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r9.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r10.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r11.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r12.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel3.setText("Qty");

        jLabel5.setText("Items");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c11)
                            .addComponent(c10)
                            .addComponent(c9)
                            .addComponent(c8)
                            .addComponent(c7)
                            .addComponent(c6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(c12)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c6)
                    .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c7)
                    .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c8)
                    .addComponent(r8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c10)
                            .addComponent(r10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c11)
                            .addComponent(r11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c9)
                        .addComponent(r9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c12)
                    .addComponent(r12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rice", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        c23.setText("mix rice");
        c23.setToolTipText("220");
        c23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c23ActionPerformed(evt);
            }
        });

        c24.setText("Fried rice");
        c24.setToolTipText("275");
        c24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c24ActionPerformed(evt);
            }
        });

        c25.setText("Dam biryani");
        c25.setToolTipText("370");
        c25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c25ActionPerformed(evt);
            }
        });

        c26.setText("Curd rice");
        c26.setToolTipText("300");
        c26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c26ActionPerformed(evt);
            }
        });

        c27.setText("Kabuli");
        c27.setToolTipText("370");
        c27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c27ActionPerformed(evt);
            }
        });

        c28.setText("Plain rice");
        c28.setToolTipText("250");
        c28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c28ActionPerformed(evt);
            }
        });

        r23.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r24.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r25.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r26.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r27.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r28.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel36.setText("Qty");

        jLabel38.setText("Items");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c28)
                            .addComponent(c27)
                            .addComponent(c26)
                            .addComponent(c25)
                            .addComponent(c24)
                            .addComponent(c23)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel38)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(r23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c23)
                    .addComponent(r23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c24)
                    .addComponent(r24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c25)
                    .addComponent(r25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c27)
                            .addComponent(r27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c28)
                            .addComponent(r28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c26)
                        .addComponent(r26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Roti", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        c41.setText("Nan");
        c41.setToolTipText("20");
        c41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c41ActionPerformed(evt);
            }
        });

        c42.setText("Butter Nan");
        c42.setToolTipText("");
        c42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c42ActionPerformed(evt);
            }
        });

        c43.setText("Masala Nan");
        c43.setToolTipText("45");
        c43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c43ActionPerformed(evt);
            }
        });

        c44.setText("Missi Roti");
        c44.setToolTipText("25");
        c44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c44ActionPerformed(evt);
            }
        });

        c45.setText("Roti");
        c45.setToolTipText("15");
        c45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c45ActionPerformed(evt);
            }
        });

        jLabel44.setText("Qty");

        jLabel54.setText("Items");

        c46.setText("Allu ka paratha");
        c46.setToolTipText("35");
        c46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c46ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c43)
                            .addComponent(c42)
                            .addComponent(c41)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel54))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c45)
                            .addComponent(c44)
                            .addComponent(c46))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(r41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c41)
                    .addComponent(r41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c42)
                    .addComponent(r42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c43)
                    .addComponent(r43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c46)
                            .addComponent(r46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(c45))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c44)
                            .addComponent(r44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Calculate Bill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vegetables", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        c13.setText("Paneer bhurji");
        c13.setToolTipText("220");
        c13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c13ActionPerformed(evt);
            }
        });

        c14.setText("Shahi Paneer");
        c14.setToolTipText("250");
        c14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c14ActionPerformed(evt);
            }
        });

        c15.setText("Palak Paneer");
        c15.setToolTipText("250");
        c15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c15ActionPerformed(evt);
            }
        });

        c16.setText("Maliai Kofta");
        c16.setToolTipText("270");
        c16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c16ActionPerformed(evt);
            }
        });

        c17.setText("Pindy chole");
        c17.setToolTipText("250");
        c17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c17ActionPerformed(evt);
            }
        });

        c18.setText("tandoor Paneer");
        c18.setToolTipText("320");
        c18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c18ActionPerformed(evt);
            }
        });

        c19.setText("Masala Paneer");
        c19.setToolTipText("250");
        c19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c19ActionPerformed(evt);
            }
        });

        r13.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r14.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r15.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r16.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r17.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r18.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r19.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        c20.setText("honey chilly patato");
        c20.setToolTipText("300");
        c20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c20ActionPerformed(evt);
            }
        });

        r20.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        c21.setText("mix vegetable");
        c21.setToolTipText("270");
        c21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c21ActionPerformed(evt);
            }
        });

        r21.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r22.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        c22.setText("navratan korma");
        c22.setToolTipText("320");
        c22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c22ActionPerformed(evt);
            }
        });

        jLabel15.setText("Items");

        jLabel13.setText("Qty");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c14)
                    .addComponent(c15)
                    .addComponent(c18)
                    .addComponent(c19)
                    .addComponent(c16)
                    .addComponent(c17)
                    .addComponent(c20)
                    .addComponent(c21)
                    .addComponent(c22)
                    .addComponent(jLabel15)
                    .addComponent(c13))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(r16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c14)
                    .addComponent(r14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c15)
                    .addComponent(r15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c16)
                    .addComponent(r16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c17)
                    .addComponent(r17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c18)
                    .addComponent(r18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c19)
                    .addComponent(r19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c20)
                    .addComponent(r20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c21, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c22))))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deserts", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        c29.setText("Browni with ice cream");
        c29.setToolTipText("500");
        c29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c29ActionPerformed(evt);
            }
        });

        c30.setText("Chocolava cake");
        c30.setToolTipText("120");
        c30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c30ActionPerformed(evt);
            }
        });

        c31.setText("Gulab jamun");
        c31.setToolTipText("45");
        c31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c31ActionPerformed(evt);
            }
        });

        c32.setText("ice screm");
        c32.setToolTipText("45");
        c32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c32ActionPerformed(evt);
            }
        });

        c33.setText("Softy");
        c33.setToolTipText("55");
        c33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c33ActionPerformed(evt);
            }
        });

        c34.setText("ice cream bar");
        c34.setToolTipText("45");
        c34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c34ActionPerformed(evt);
            }
        });

        r29.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r30.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r31.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r32.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r33.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r34.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel74.setText("Qty");

        jLabel76.setText("Items");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c34)
                            .addComponent(c33)
                            .addComponent(c32)
                            .addComponent(c31)
                            .addComponent(c30)
                            .addComponent(c29)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel76)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74)
                    .addComponent(r29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jLabel76))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c29)
                    .addComponent(r29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c30)
                    .addComponent(r30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c31)
                    .addComponent(r31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c33)
                            .addComponent(r33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c34)
                            .addComponent(r34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c32)
                        .addComponent(r32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        p6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Starter", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        c35.setText("Chinese Samosa");
        c35.setToolTipText("15");
        c35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c35ActionPerformed(evt);
            }
        });

        c36.setText("Veg Kutlet");
        c36.setToolTipText("30");
        c36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c36ActionPerformed(evt);
            }
        });

        c37.setText("Tacous");
        c37.setToolTipText("50");
        c37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c37ActionPerformed(evt);
            }
        });

        c38.setText("French Fries");
        c38.setToolTipText("50");
        c38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c38ActionPerformed(evt);
            }
        });

        c39.setText("Cheesa Ball");
        c39.setToolTipText("90");
        c39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c39ActionPerformed(evt);
            }
        });

        c40.setText("panner tikka");
        c40.setToolTipText("100");
        c40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c40ActionPerformed(evt);
            }
        });

        r35.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r36.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r37.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r38.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r39.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        r40.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel83.setText("Qty");

        jLabel85.setText("Items");

        jLabel92.setText("Cost");

        jLabel93.setText("Qty");

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c37)
                                    .addComponent(c36)
                                    .addComponent(c35)))
                            .addGroup(p6Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel85))
                            .addGroup(p6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(c38)))
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel83)
                                    .addComponent(r36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(p6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(r35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(c39))
                    .addGroup(p6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(c40)))
                .addGap(166, 166, 166)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel92)
                .addContainerGap())
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jLabel85)
                    .addComponent(jLabel93)
                    .addComponent(jLabel92))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c35)
                    .addComponent(r35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c36)
                    .addComponent(r36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c37)
                    .addComponent(r37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c38)
                            .addComponent(r38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c39)
                            .addComponent(r39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c40))
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(r40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        l1.setText("Cusstomer Name");

        l2.setText("Phone Number");

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        p8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drinks", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        c47.setText("Sweet Drink");
        c47.setToolTipText("60");
        c47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c47ActionPerformed(evt);
            }
        });

        c48.setText("Orange Juice");
        c48.setToolTipText("80");
        c48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c48ActionPerformed(evt);
            }
        });

        c49.setText("Lemon soda");
        c49.setToolTipText("90");
        c49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c49ActionPerformed(evt);
            }
        });

        c50.setText("Mojito");
        c50.setToolTipText("100");
        c50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c50ActionPerformed(evt);
            }
        });

        c51.setText("Fruit Punch");
        c51.setToolTipText("120");
        c51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c51ActionPerformed(evt);
            }
        });

        c52.setText("Blue Berry Sparkling");
        c52.setToolTipText("150");
        c52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c52ActionPerformed(evt);
            }
        });

        jLabel55.setText("Items");

        jLabel45.setText("Qty");

        javax.swing.GroupLayout p8Layout = new javax.swing.GroupLayout(p8);
        p8.setLayout(p8Layout);
        p8Layout.setHorizontalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addGap(30, 30, 30))
            .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p8Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c49)
                        .addComponent(c48)
                        .addComponent(c47)
                        .addComponent(c51)
                        .addComponent(c50)
                        .addComponent(c52))
                    .addGap(18, 18, 18)
                    .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(r47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        p8Layout.setVerticalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel45))
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p8Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c47)
                        .addComponent(r47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c48)
                        .addComponent(r48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c49)
                        .addComponent(r49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(p8Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c52)
                                .addComponent(r52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(p8Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(c51))
                        .addGroup(p8Layout.createSequentialGroup()
                            .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c50)
                                .addComponent(r50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(35, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p6, 0, 205, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l1)
                            .addComponent(l2))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(l1)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(l2)
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
if(s4==0){
    r4.setVisible(true);
s4++;}
else if(s4==1){
    r4.setVisible(false);
s4--;}
}//GEN-LAST:event_c4ActionPerformed
    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
if(s5==0){
    r5.setVisible(true);
s5++;}
else if(s5==1){
    r5.setVisible(false);
s5--;}        // TODO add your handling code here:
}//GEN-LAST:event_c5ActionPerformed
    private void c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c9ActionPerformed
if(s9==0){
    r9.setVisible(true);
s9++;}
else if(s9==1){
    r9.setVisible(false);
s9--;}        // TODO add your handling code here:
}//GEN-LAST:event_c9ActionPerformed

    private void c10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c10ActionPerformed
if(s10==0){
    r10.setVisible(true);
s10++;}
else if(s10==1){
    r10.setVisible(false);
s10--;}        // TODO add your handling code here:
}//GEN-LAST:event_c10ActionPerformed
    private void c11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c11ActionPerformed
if(s11==0){
    r11.setVisible(true);
s11++;}
else if(s11==1){
    r11.setVisible(false);
s11--;}        // TODO add your handling code here:
}//GEN-LAST:event_c11ActionPerformed
    private void c12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c12ActionPerformed
if(s12==0){
    r12.setVisible(true);
s12++;}
else if(s12==1){
    r12.setVisible(false);
s12--;}        // TODO add your handling code here:
}//GEN-LAST:event_c12ActionPerformed
    private void c26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c26ActionPerformed
if(s26==0){
    r26.setVisible(true);
s26++;}
else if(s26==1){
    r26.setVisible(false);
s26--;}        // TODO add your handling code here:
}//GEN-LAST:event_c26ActionPerformed
    private void c27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c27ActionPerformed
if(s27==0){
    r27.setVisible(true);
s27++;}
else if(s27==1){
    r27.setVisible(false);
s27--;}        // TODO add your handling code here:
}//GEN-LAST:event_c27ActionPerformed
    private void c28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c28ActionPerformed
if(s28==0){
    r28.setVisible(true);
s28++;}
else if(s28==1){
    r28.setVisible(false);
s28--;}        // TODO add your handling code here:
}//GEN-LAST:event_c28ActionPerformed
    private void c44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c44ActionPerformed
if(s44==0){
    r44.setVisible(true);
s44++;}
else if(s44==1){
    r44.setVisible(false);
s44--;}        // TODO add your handling code here:
}//GEN-LAST:event_c44ActionPerformed
    private void c45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c45ActionPerformed
if(s45==0){
    r45.setVisible(true);
s45++;}
else if(s45==1){
    r45.setVisible(false);
s45--;}        // TODO add your handling code here:
}//GEN-LAST:event_c45ActionPerformed
    private void c46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c46ActionPerformed
if(s46==0){
    r46.setVisible(true);
s46++;}
else if(s46==1){
    r46.setVisible(false);
s46--;}        // TODO add your handling code here:
}//GEN-LAST:event_c46ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);         // TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try
{
int bill=0;

String n=t1.getText();
if(n.equalsIgnoreCase(""))
    JOptionPane.showMessageDialog(null,"Please Enter Customer Name");
else{
String pno=t2.getText();
if(pno.equalsIgnoreCase(""))
    JOptionPane.showMessageDialog(null,"Please Enter Phone Number");
else{
    int l=0;
   try{ l=pno.length();}
   catch(Exception ex)
   {       JOptionPane.showMessageDialog(null,"Please Enter Phone Number correctly");   }
    if(l!=10)
        JOptionPane.showMessageDialog(null,"Plesae Enter Phone Number Correctly");
    else
    {
int pn=Integer.parseInt(pno);
if(n.equals(""))
    JOptionPane.showMessageDialog(this,"Please Enter Customer Name");
int lpn=pno.length();
if(lpn!=10)
JOptionPane.showMessageDialog(this,"Please Enter Phone number correctly");


if(c1.isSelected())
{int s=Integer.parseInt(r1.getValue().toString());
 bill+=s*Integer.parseInt(r1.getToolTipText());
}
if(c2.isSelected())
{int s=Integer.parseInt(r2.getValue().toString());
 bill+=s*Integer.parseInt(r2.getToolTipText());
}
if(c3.isSelected())
{int s=Integer.parseInt(r3.getValue().toString());
 bill+=s*Integer.parseInt(r3.getToolTipText());
}
if(c4.isSelected())
{int s=Integer.parseInt(r4.getValue().toString());
 bill+=s*Integer.parseInt(r4.getToolTipText());
}
if(c5.isSelected())
{int s=Integer.parseInt(r5.getValue().toString());
 bill+=s*Integer.parseInt(r5.getToolTipText());
}
if(c6.isSelected())
{int s=Integer.parseInt(r6.getValue().toString());
 bill+=s*Integer.parseInt(r6.getToolTipText());
}
if(c7.isSelected())
{int s=Integer.parseInt(r7.getValue().toString());
 bill+=s*Integer.parseInt(r7.getToolTipText());
}
if(c8.isSelected())
{int s=Integer.parseInt(r8.getValue().toString());
 bill+=s*Integer.parseInt(r8.getToolTipText());
}
if(c9.isSelected())
{int s=Integer.parseInt(r9.getValue().toString());
 bill+=s*Integer.parseInt(r9.getToolTipText());
}
if(c10.isSelected())
{int s=Integer.parseInt(r10.getValue().toString());
 bill+=s*Integer.parseInt(r10.getToolTipText());
}
if(c11.isSelected())
{int s=Integer.parseInt(r11.getValue().toString());
 bill+=s*Integer.parseInt(r11.getToolTipText());
}
if(c12.isSelected())
{int s=Integer.parseInt(r12.getValue().toString());
 bill+=s*Integer.parseInt(r12.getToolTipText());
}
if(c13.isSelected())
{int s=Integer.parseInt(r13.getValue().toString());
 bill+=s*Integer.parseInt(r13.getToolTipText());
}
if(c14.isSelected())
{int s=Integer.parseInt(r14.getValue().toString());
 bill+=s*Integer.parseInt(r14.getToolTipText());
}
if(c15.isSelected())
{int s=Integer.parseInt(r15.getValue().toString());
 bill+=s*Integer.parseInt(r15.getToolTipText());
}
if(c16.isSelected())
{int s=Integer.parseInt(r16.getValue().toString());
 bill+=s*Integer.parseInt(r16.getToolTipText());
}
if(c17.isSelected())
{int s=Integer.parseInt(r17.getValue().toString());
 bill+=s*Integer.parseInt(r17.getToolTipText());
}
if(c18.isSelected())
{int s=Integer.parseInt(r18.getValue().toString());
 bill+=s*Integer.parseInt(r18.getToolTipText());
}
if(c19.isSelected())
{int s=Integer.parseInt(r19.getValue().toString());
 bill+=s*Integer.parseInt(r19.getToolTipText());
}
if(c20.isSelected())
{int s=Integer.parseInt(r20.getValue().toString());
 bill+=s*Integer.parseInt(r20.getToolTipText());
}
if(c21.isSelected())
{int s=Integer.parseInt(r21.getValue().toString());
 bill+=s*Integer.parseInt(r21.getToolTipText());
}
if(c22.isSelected())
{int s=Integer.parseInt(r22.getValue().toString());
 bill+=s*Integer.parseInt(r22.getToolTipText());
}
if(c23.isSelected())
{int s=Integer.parseInt(r23.getValue().toString());
 bill+=s*Integer.parseInt(r23.getToolTipText());
}
if(c24.isSelected())
{int s=Integer.parseInt(r24.getValue().toString());
 bill+=s*Integer.parseInt(r24.getToolTipText());
}
if(c25.isSelected())
{int s=Integer.parseInt(r25.getValue().toString());
 bill+=s*Integer.parseInt(r25.getToolTipText());
}
if(c26.isSelected())
{int s=Integer.parseInt(r26.getValue().toString());
 bill+=s*Integer.parseInt(r26.getToolTipText());
}
if(c27.isSelected())
{int s=Integer.parseInt(r27.getValue().toString());
 bill+=s*Integer.parseInt(r27.getToolTipText());

}if(c28.isSelected())
{int s=Integer.parseInt(r28.getValue().toString());
 bill+=s*Integer.parseInt(r28.getToolTipText());
}
if(c29.isSelected())
{int s=Integer.parseInt(r29.getValue().toString());
 bill+=s*Integer.parseInt(r29.getToolTipText());
}
if(c30.isSelected())
{int s=Integer.parseInt(r30.getValue().toString());
 bill+=s*Integer.parseInt(r30.getToolTipText());
}
if(c31.isSelected())
{int s=Integer.parseInt(r31.getValue().toString());
 bill+=s*Integer.parseInt(r31.getToolTipText());
}
if(c32.isSelected())
{int s=Integer.parseInt(r32.getValue().toString());
 bill+=s*Integer.parseInt(r32.getToolTipText());
}
if(c33.isSelected())
{int s=Integer.parseInt(r33.getValue().toString());
 bill+=s*Integer.parseInt(r33.getToolTipText());
}
if(c34.isSelected())
{int s=Integer.parseInt(r34.getValue().toString());
 bill+=s*Integer.parseInt(r34.getToolTipText());
}
if(c35.isSelected())
{int s=Integer.parseInt(r35.getValue().toString());
 bill+=s*Integer.parseInt(r35.getToolTipText());
}
if(c36.isSelected())
{int s=Integer.parseInt(r36.getValue().toString());
 bill+=s*Integer.parseInt(r36.getToolTipText());
}
if(c37.isSelected())
{int s=Integer.parseInt(r37.getValue().toString());
 bill+=s*Integer.parseInt(r37.getToolTipText());
}
if(c38.isSelected())
{int s=Integer.parseInt(r38.getValue().toString());
 bill+=s*Integer.parseInt(r38.getToolTipText());
}
if(c39.isSelected())
{int s=Integer.parseInt(r39.getValue().toString());
 bill+=s*Integer.parseInt(r39.getToolTipText());
}
if(c40.isSelected())
{int s=Integer.parseInt(r40.getValue().toString());
 bill+=s*Integer.parseInt(r40.getToolTipText());
}
if(c41.isSelected())
{int s=Integer.parseInt(r41.getValue().toString());
 bill+=s*Integer.parseInt(r41.getToolTipText());
}
if(c42.isSelected())
{int s=Integer.parseInt(r42.getValue().toString());
 bill+=s*Integer.parseInt(r42.getToolTipText());
}
if(c43.isSelected())
{int s=Integer.parseInt(r43.getValue().toString());
 bill+=s*Integer.parseInt(r43.getToolTipText());
}
if(c44.isSelected())
{int s=Integer.parseInt(r44.getValue().toString());
 bill+=s*Integer.parseInt(r44.getToolTipText());
}
if(c45.isSelected())
{int s=Integer.parseInt(r45.getValue().toString());
 bill+=s*Integer.parseInt(r45.getToolTipText());
}
if(c46.isSelected())
{int s=Integer.parseInt(r46.getValue().toString());
 bill+=s*Integer.parseInt(r46.getToolTipText());
}
if(c47.isSelected())
{int s=Integer.parseInt(r47.getValue().toString());
 bill+=s*Integer.parseInt(r47.getToolTipText());
}
if(c48.isSelected())
{int s=Integer.parseInt(r48.getValue().toString());
 bill+=s*Integer.parseInt(r48.getToolTipText());
}
if(c49.isSelected())
{int s=Integer.parseInt(r49.getValue().toString());
 bill+=s*Integer.parseInt(r49.getToolTipText());
}
if(c50.isSelected())
{int s=Integer.parseInt(r50.getValue().toString());
 bill+=s*Integer.parseInt(r50.getToolTipText());
}
if(c51.isSelected())
{int s=Integer.parseInt(r51.getValue().toString());
 bill+=s*Integer.parseInt(r51.getToolTipText());
}
if(c52.isSelected())
{int s=Integer.parseInt(r52.getValue().toString());
 bill+=s*Integer.parseInt(r52.getToolTipText());
}

Class.forName("java.sql.DriverManager");
Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","hello");
Statement stat=(Statement)con.createStatement();
if(q==1)
{String fb=Integer.toString(bill);
 setVisible(false);
new Hall(fb);
}
else if(q==0)
{String  query="Insert into food values('"+n+"','"+pno+"',"+bill+");";
stat.executeQuery(query);
System.out.println(""+bill);
}

    }}}}
catch(Exception e)
{System.out.println(e);
}
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        t1.setText("");
        t2.setText("");
        c1.setSelected(false);
        c2.setSelected(false);
        c3.setSelected(false);
        c4.setSelected(false);
        c5.setSelected(false);
        c6.setSelected(false);
        c7.setSelected(false);
        c8.setSelected(false);
        c9.setSelected(false);
        c10.setSelected(false);
        c11.setSelected(false);
        c12.setSelected(false);
        c13.setSelected(false);
        c14.setSelected(false);
        c15.setSelected(false);
        c16.setSelected(false);        
        c17.setSelected(false);
        c18.setSelected(false);
        c19.setSelected(false);
        c20.setSelected(false);
        c21.setSelected(false);
        c22.setSelected(false);        
        c23.setSelected(false);
        c24.setSelected(false);
        c25.setSelected(false);
        c26.setSelected(false);
        c27.setSelected(false);
        c28.setSelected(false);
        c29.setSelected(false);
        c30.setSelected(false);
        c31.setSelected(false);
        c32.setSelected(false);
        c33.setSelected(false);
        c34.setSelected(false);
        c35.setSelected(false);
        c36.setSelected(false);
        c37.setSelected(false);
        c38.setSelected(false);
        c39.setSelected(false);
        c40.setSelected(false);
        c41.setSelected(false);
        c42.setSelected(false);
        c43.setSelected(false);
        c44.setSelected(false);
        c45.setSelected(false);
        c46.setSelected(false);
        r1.setValue(0);
        r2.setValue(0);
        r3.setValue(0);
        r4.setValue(0);
        r5.setValue(0);
        r6.setValue(0);
        r7.setValue(0);
        r8.setValue(0);
        r9.setValue(0);
        r10.setValue(0);
        r11.setValue(0);
        r12.setValue(0);
        r13.setValue(0);
        r14.setValue(0);
        r15.setValue(0);
        r16.setValue(0);
        r17.setValue(0);
        r18.setValue(0);
        r19.setValue(0);
        r20.setValue(0);
        r21.setValue(0);
        r22.setValue(0);
        r23.setValue(0);
        r24.setValue(0);
        r25.setValue(0);
        r26.setValue(0);
        r27.setValue(0);
        r28.setValue(0);
        r29.setValue(0);
        r30.setValue(0);
        r31.setValue(0);
        r32.setValue(0);
        r33.setValue(0);
        r34.setValue(0);
        r35.setValue(0);
        r36.setValue(0);
        r37.setValue(0);
        r38.setValue(0);
        r39.setValue(0);
        r40.setValue(0);
        r41.setValue(0);
        r42.setValue(0);
        r43.setValue(0);
        r44.setValue(0);
        r45.setValue(0);
        r46.setValue(0);
}//GEN-LAST:event_jButton2ActionPerformed

    private void c16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c16ActionPerformed
if(s16==0){
    r16.setVisible(true);
s16++;}
else if(s16==1){
    r16.setVisible(false);
s16--;}        // TODO add your handling code here:
}//GEN-LAST:event_c16ActionPerformed

    private void c17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c17ActionPerformed
if(s17==0){
    r17.setVisible(true);
s17++;}
else if(s17==1){
    r17.setVisible(false);
s17--;}        // TODO add your handling code here:
}//GEN-LAST:event_c17ActionPerformed
    private void c18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c18ActionPerformed
if(s18==0){
    r18.setVisible(true);
s18++;}
else if(s18==1){
    r18.setVisible(false);
s18--;}        // TODO add your handling code here:
}//GEN-LAST:event_c18ActionPerformed
    private void c19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c19ActionPerformed
if(s19==0){
    r19.setVisible(true);
s19++;}
else if(s19==1){
    r19.setVisible(false);
s19--;}        // TODO add your handling code here:
}//GEN-LAST:event_c19ActionPerformed
    private void c20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c20ActionPerformed
if(s20==0){
    r20.setVisible(true);
s20++;}
else if(s20==1){
    r20.setVisible(false);
s20--;}        // TODO add your handling code here:
}//GEN-LAST:event_c20ActionPerformed
    private void c21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c21ActionPerformed
if(s21==0){
    r21.setVisible(true);
s21++;}
else if(s21==1){
    r21.setVisible(false);
s21--;}        // TODO add your handling code here:
}//GEN-LAST:event_c21ActionPerformed
    private void c22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c22ActionPerformed
if(s22==0){
    r22.setVisible(true);
s22++;}
else if(s22==1){
    r22.setVisible(false);
s22--;}        // TODO add your handling code here:
}//GEN-LAST:event_c22ActionPerformed
    private void c32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c32ActionPerformed
if(s32==0){
    r32.setVisible(true);
s32++;}
else if(s32==1){
    r32.setVisible(false);
s32--;}
}//GEN-LAST:event_c32ActionPerformed
    private void c33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c33ActionPerformed
if(s33==0){
    r33.setVisible(true);
s33++;}
else if(s33==1){
    r33.setVisible(false);
s33--;}        // TODO add your handling code here:
}//GEN-LAST:event_c33ActionPerformed
    private void c34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c34ActionPerformed
if(s34==0){
    r34.setVisible(true);
s34++;}
else if(s34==1){
    r34.setVisible(false);
s34--;}        // TODO add your handling code here:
}//GEN-LAST:event_c34ActionPerformed
    private void c38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c38ActionPerformed
if(s38==0){
    r38.setVisible(true);
s38++;}
else if(s38==1){
    r38.setVisible(false);
s38--;}        // TODO add your handling code here:
}//GEN-LAST:event_c38ActionPerformed
    private void c39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c39ActionPerformed
if(s39==0){
    r39.setVisible(true);
s39++;}
else if(s39==1){
    r39.setVisible(false);
s39--;}        // TODO add your handling code here:
}//GEN-LAST:event_c39ActionPerformed
    private void c40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c40ActionPerformed
if(s40==0){
    r40.setVisible(true);
s40++;}
else if(s40==1){
    r40.setVisible(false);
s40--;}        // TODO add your handling code here:
}//GEN-LAST:event_c40ActionPerformed
    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
         // TODO add your handling code here:
}//GEN-LAST:event_t2ActionPerformed

    private void c50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c50ActionPerformed
if(s50==0){
    r50.setVisible(true);
s50++;}
else if(s50==1){
    r50.setVisible(false);
s50--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c50ActionPerformed

    private void c51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c51ActionPerformed
if(s51==0){
    r51.setVisible(true);
s51++;}
else if(s51==1){
    r51.setVisible(false);
s51--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c51ActionPerformed

    private void c52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c52ActionPerformed
if(s52==0){
    r52.setVisible(true);
s52++;}
else if(s52==1){
    r52.setVisible(false);
s52--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c52ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
if(s1==0){
    r1.setVisible(true);
s1++;}
else if(s1==1){
    r1.setVisible(false);
s1--;}
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
if(s2==0){
    r2.setVisible(true);
s2++;}
else if(s2==1){
    r2.setVisible(false);
s2--;}
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
if(s3==0){
    r3.setVisible(true);
s3++;}
else if(s3==1){
    r3.setVisible(false);
s3--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
if(s6==0){
    r6.setVisible(true);
s6++;}
else if(s6==1){
    r6.setVisible(false);
s6--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c6ActionPerformed

    private void c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7ActionPerformed
if(s7==0){
    r7.setVisible(true);
s7++;}
else if(s7==1){
    r7.setVisible(false);
s7--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c7ActionPerformed

    private void c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c8ActionPerformed
if(s8==0){
    r8.setVisible(true);
s8++;}
else if(s8==1){
    r8.setVisible(false);
s8--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c8ActionPerformed

    private void c13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c13ActionPerformed
if(s13==0){
    r13.setVisible(true);
s13++;}
else if(s13==1){
    r13.setVisible(false);
s13--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c13ActionPerformed

    private void c14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c14ActionPerformed
if(s14==0){
    r14.setVisible(true);
s14++;}
else if(s14==1){
    r14.setVisible(false);
s14--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c14ActionPerformed

    private void c15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c15ActionPerformed
if(s15==0){
    r15.setVisible(true);
s15++;}
else if(s15==1){
    r15.setVisible(false);
s15--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c15ActionPerformed

    private void c41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c41ActionPerformed
if(s41==0){
    r41.setVisible(true);
s41++;}
else if(s41==1){
    r41.setVisible(false);
s41--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c41ActionPerformed

    private void c42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c42ActionPerformed
if(s42==0){
    r42.setVisible(true);
s42++;}
else if(s42==1){
    r42.setVisible(false);
s42--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c42ActionPerformed

    private void c43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c43ActionPerformed
if(s43==0){
    r43.setVisible(true);
s43++;}
else if(s43==1){
    r43.setVisible(false);
s43--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c43ActionPerformed

    private void c23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c23ActionPerformed
if(s23==0){
    r23.setVisible(true);
s23++;}
else if(s23==1){
    r23.setVisible(false);
s23--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c23ActionPerformed

    private void c24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c24ActionPerformed
if(s24==0){
    r24.setVisible(true);
s24++;}
else if(s24==1){
    r24.setVisible(false);
s24--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c24ActionPerformed

    private void c25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c25ActionPerformed
if(s25==0){
    r25.setVisible(true);
s25++;}
else if(s25==1){
    r25.setVisible(false);
s25--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c25ActionPerformed

    private void c29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c29ActionPerformed
if(s29==0){
    r29.setVisible(true);
s29++;}
else if(s29==1){
    r29.setVisible(false);
s29--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c29ActionPerformed

    private void c30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c30ActionPerformed
if(s30==0){
    r30.setVisible(true);
s30++;}
else if(s30==1){
    r30.setVisible(false);
s30--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c30ActionPerformed

    private void c31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c31ActionPerformed
if(s31==0){
    r31.setVisible(true);
s31++;}
else if(s31==1){
    r31.setVisible(false);
s31--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c31ActionPerformed

    private void c35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c35ActionPerformed
if(s35==0){
    r35.setVisible(true);
s35++;}
else if(s35==1){
    r35.setVisible(false);
s35--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c35ActionPerformed

    private void c36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c36ActionPerformed
if(s36==0){
    r36.setVisible(true);
s36++;}
else if(s36==1){
    r36.setVisible(false);
s36--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c36ActionPerformed

    private void c37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c37ActionPerformed
if(s37==0){
    r37.setVisible(true);
s37++;}
else if(s37==1){
    r37.setVisible(false);
s37--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c37ActionPerformed

    private void c47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c47ActionPerformed
if(s47==0){
    r47.setVisible(true);
s47++;}
else if(s47==1){
    r47.setVisible(false);
s47--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c47ActionPerformed

    private void c48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c48ActionPerformed
if(s48==0){
    r48.setVisible(true);
s48++;}
else if(s48==1){
    r48.setVisible(false);
s48--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c48ActionPerformed

    private void c49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c49ActionPerformed
if(s49==0){
    r49.setVisible(true);
s49++;}
else if(s49==1){
    r49.setVisible(false);
s49--;}        // TODO add your handling code here:
    }//GEN-LAST:event_c49ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new Start().setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Food().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c10;
    private javax.swing.JCheckBox c11;
    private javax.swing.JCheckBox c12;
    private javax.swing.JCheckBox c13;
    private javax.swing.JCheckBox c14;
    private javax.swing.JCheckBox c15;
    private javax.swing.JCheckBox c16;
    private javax.swing.JCheckBox c17;
    private javax.swing.JCheckBox c18;
    private javax.swing.JCheckBox c19;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c20;
    private javax.swing.JCheckBox c21;
    private javax.swing.JCheckBox c22;
    private javax.swing.JCheckBox c23;
    private javax.swing.JCheckBox c24;
    private javax.swing.JCheckBox c25;
    private javax.swing.JCheckBox c26;
    private javax.swing.JCheckBox c27;
    private javax.swing.JCheckBox c28;
    private javax.swing.JCheckBox c29;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c30;
    private javax.swing.JCheckBox c31;
    private javax.swing.JCheckBox c32;
    private javax.swing.JCheckBox c33;
    private javax.swing.JCheckBox c34;
    private javax.swing.JCheckBox c35;
    private javax.swing.JCheckBox c36;
    private javax.swing.JCheckBox c37;
    private javax.swing.JCheckBox c38;
    private javax.swing.JCheckBox c39;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c40;
    private javax.swing.JCheckBox c41;
    private javax.swing.JCheckBox c42;
    private javax.swing.JCheckBox c43;
    private javax.swing.JCheckBox c44;
    private javax.swing.JCheckBox c45;
    private javax.swing.JCheckBox c46;
    private javax.swing.JCheckBox c47;
    private javax.swing.JCheckBox c48;
    private javax.swing.JCheckBox c49;
    private javax.swing.JCheckBox c5;
    private javax.swing.JCheckBox c50;
    private javax.swing.JCheckBox c51;
    private javax.swing.JCheckBox c52;
    private javax.swing.JCheckBox c6;
    private javax.swing.JCheckBox c7;
    private javax.swing.JCheckBox c8;
    private javax.swing.JCheckBox c9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p8;
    private javax.swing.JSpinner r1;
    private javax.swing.JSpinner r10;
    private javax.swing.JSpinner r11;
    private javax.swing.JSpinner r12;
    private javax.swing.JSpinner r13;
    private javax.swing.JSpinner r14;
    private javax.swing.JSpinner r15;
    private javax.swing.JSpinner r16;
    private javax.swing.JSpinner r17;
    private javax.swing.JSpinner r18;
    private javax.swing.JSpinner r19;
    private javax.swing.JSpinner r2;
    private javax.swing.JSpinner r20;
    private javax.swing.JSpinner r21;
    private javax.swing.JSpinner r22;
    private javax.swing.JSpinner r23;
    private javax.swing.JSpinner r24;
    private javax.swing.JSpinner r25;
    private javax.swing.JSpinner r26;
    private javax.swing.JSpinner r27;
    private javax.swing.JSpinner r28;
    private javax.swing.JSpinner r29;
    private javax.swing.JSpinner r3;
    private javax.swing.JSpinner r30;
    private javax.swing.JSpinner r31;
    private javax.swing.JSpinner r32;
    private javax.swing.JSpinner r33;
    private javax.swing.JSpinner r34;
    private javax.swing.JSpinner r35;
    private javax.swing.JSpinner r36;
    private javax.swing.JSpinner r37;
    private javax.swing.JSpinner r38;
    private javax.swing.JSpinner r39;
    private javax.swing.JSpinner r4;
    private javax.swing.JSpinner r40;
    private javax.swing.JSpinner r41;
    private javax.swing.JSpinner r42;
    private javax.swing.JSpinner r43;
    private javax.swing.JSpinner r44;
    private javax.swing.JSpinner r45;
    private javax.swing.JSpinner r46;
    private javax.swing.JSpinner r47;
    private javax.swing.JSpinner r48;
    private javax.swing.JSpinner r49;
    private javax.swing.JSpinner r5;
    private javax.swing.JSpinner r50;
    private javax.swing.JSpinner r51;
    private javax.swing.JSpinner r52;
    private javax.swing.JSpinner r6;
    private javax.swing.JSpinner r7;
    private javax.swing.JSpinner r8;
    private javax.swing.JSpinner r9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}

