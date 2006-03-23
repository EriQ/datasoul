/*
 * AuxiliarPanel.java
 *
 * Created on 26 de Dezembro de 2005, 23:37
 */

package datasoul.datashow;

import datasoul.render.ContentManager;
import datasoul.render.DisplayManager;
import datasoul.render.SDLDisplay;
import datasoul.templates.DisplayTemplate;
import datasoul.templates.TemplateManager;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author  Administrador
 */
public class AuxiliarPanel extends javax.swing.JPanel {

    private DatashowPanel objectManager;
    
    /**
     * Creates new form AuxiliarPanel
     */
    public AuxiliarPanel() {
        initComponents();
        btnTimerOff.setSelected(true);
        pnlTimerStart.setVisible(false);
        pnlTimerTotal.setVisible(false);
        
    }

    public DatashowPanel getObjectManager() {
        return objectManager;
    }

    public void setObjectManager(DatashowPanel objectManager) {
        this.objectManager = objectManager;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        tabAuxiliar = new javax.swing.JTabbedPane();
        panelMessage = new javax.swing.JPanel();
        PanelDisplay = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnChangeBackground = new javax.swing.JButton();
        imgBackground = new datasoul.datashow.ImageDisplayer();
        btnBlack = new javax.swing.JToggleButton();
        btnClear = new javax.swing.JToggleButton();
        cbBackgroundMode = new javax.swing.JComboBox();
        cbInputSrc = new javax.swing.JComboBox();
        cbDeintrelaceMode = new javax.swing.JComboBox();
        cbInputMode = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panelClock = new javax.swing.JPanel();
        pnlTimerStart = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        edtTimerStartMin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edtTimerStartSec = new javax.swing.JTextField();
        pnlTimerTotal = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        edtTimerTotalMin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        edtTimerTotalSec = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnTimerBackward = new javax.swing.JToggleButton();
        btnTimerForward = new javax.swing.JToggleButton();
        btnTimerOff = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        btnApplyTimer = new javax.swing.JButton();

        tabAuxiliar.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        tabAuxiliar.setMaximumSize(new java.awt.Dimension(32767, 250));
        tabAuxiliar.setMinimumSize(new java.awt.Dimension(80, 0));
        org.jdesktop.layout.GroupLayout panelMessageLayout = new org.jdesktop.layout.GroupLayout(panelMessage);
        panelMessage.setLayout(panelMessageLayout);
        panelMessageLayout.setHorizontalGroup(
            panelMessageLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 761, Short.MAX_VALUE)
        );
        panelMessageLayout.setVerticalGroup(
            panelMessageLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 248, Short.MAX_VALUE)
        );
        tabAuxiliar.addTab(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("MESSAGE"), panelMessage);

        jButton1.setText("Init Display Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnChangeBackground.setText("Change Background");
        btnChangeBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeBackgroundActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout imgBackgroundLayout = new org.jdesktop.layout.GroupLayout(imgBackground);
        imgBackground.setLayout(imgBackgroundLayout);
        imgBackgroundLayout.setHorizontalGroup(
            imgBackgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 156, Short.MAX_VALUE)
        );
        imgBackgroundLayout.setVerticalGroup(
            imgBackgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 116, Short.MAX_VALUE)
        );

        btnBlack.setText("Black");
        btnBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlackActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        cbBackgroundMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Static", "Live" }));
        cbBackgroundMode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBackgroundModeItemStateChanged(evt);
            }
        });
        cbBackgroundMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBackgroundModeActionPerformed(evt);
            }
        });

        cbInputSrc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tuner", "Composite", "S-Video" }));
        cbInputSrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInputSrcActionPerformed(evt);
            }
        });

        cbDeintrelaceMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Blend", "Smart Blend", "Smooth Blend" }));
        cbDeintrelaceMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDeintrelaceModeActionPerformed(evt);
            }
        });

        cbInputMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PAL", "NTSC", "SECAM" }));
        cbInputMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInputModeActionPerformed(evt);
            }
        });

        jLabel1.setText("Background:");

        jLabel2.setText("Input Source:");

        jLabel3.setText("Input Mode:");

        jLabel4.setText("Deintrelace:");

        jButton2.setText("Start Feedback");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout PanelDisplayLayout = new org.jdesktop.layout.GroupLayout(PanelDisplay);
        PanelDisplay.setLayout(PanelDisplayLayout);
        PanelDisplayLayout.setHorizontalGroup(
            PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanelDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PanelDisplayLayout.createSequentialGroup()
                        .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(btnClear, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(btnBlack, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jLabel1))
                        .add(20, 20, 20)
                        .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(cbBackgroundMode, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, btnChangeBackground, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(jButton2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(imgBackground, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(jLabel3)
                    .add(jLabel4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(PanelDisplayLayout.createSequentialGroup()
                        .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(cbInputSrc, 0, 134, Short.MAX_VALUE)
                            .add(cbInputMode, 0, 134, Short.MAX_VALUE))
                        .add(88, 88, 88))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, PanelDisplayLayout.createSequentialGroup()
                        .add(cbDeintrelaceMode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelDisplayLayout.setVerticalGroup(
            PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanelDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PanelDisplayLayout.createSequentialGroup()
                        .add(9, 9, 9)
                        .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(cbInputSrc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(cbInputMode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(cbDeintrelaceMode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel4)))
                    .add(PanelDisplayLayout.createSequentialGroup()
                        .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButton1)
                            .add(btnBlack))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnChangeBackground)
                            .add(btnClear))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(PanelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(cbBackgroundMode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel1))
                        .add(19, 19, 19)
                        .add(jButton2))
                    .add(imgBackground, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        tabAuxiliar.addTab("Display", PanelDisplay);

        pnlTimerStart.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel5.setText("Start");

        edtTimerStartMin.setText("00");
        edtTimerStartMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtTimerStartMinKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtTimerStartMinKeyTyped(evt);
            }
        });

        jLabel6.setText(":");

        edtTimerStartSec.setText("00");
        edtTimerStartSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtTimerStartSecKeyTyped(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pnlTimerStartLayout = new org.jdesktop.layout.GroupLayout(pnlTimerStart);
        pnlTimerStart.setLayout(pnlTimerStartLayout);
        pnlTimerStartLayout.setHorizontalGroup(
            pnlTimerStartLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlTimerStartLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(edtTimerStartMin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(edtTimerStartSec, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTimerStartLayout.setVerticalGroup(
            pnlTimerStartLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlTimerStartLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlTimerStartLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlTimerStartLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel6)
                        .add(edtTimerStartSec, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pnlTimerStartLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel5)
                        .add(edtTimerStartMin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTimerTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel7.setText("Total");

        edtTimerTotalMin.setText("00");
        edtTimerTotalMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtTimerTotalMinKeyTyped(evt);
            }
        });

        jLabel8.setText(":");

        edtTimerTotalSec.setText("00");
        edtTimerTotalSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtTimerTotalSecKeyTyped(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pnlTimerTotalLayout = new org.jdesktop.layout.GroupLayout(pnlTimerTotal);
        pnlTimerTotal.setLayout(pnlTimerTotalLayout);
        pnlTimerTotalLayout.setHorizontalGroup(
            pnlTimerTotalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlTimerTotalLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(edtTimerTotalMin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(edtTimerTotalSec, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTimerTotalLayout.setVerticalGroup(
            pnlTimerTotalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlTimerTotalLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlTimerTotalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlTimerTotalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel8)
                        .add(edtTimerTotalSec, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pnlTimerTotalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel7)
                        .add(edtTimerTotalMin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTimerBackward.setText("Backward");
        btnTimerBackward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimerBackwardActionPerformed(evt);
            }
        });

        btnTimerForward.setText("Forward");
        btnTimerForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimerForwardActionPerformed(evt);
            }
        });

        btnTimerOff.setText("Off");
        btnTimerOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimerOffActionPerformed(evt);
            }
        });

        jLabel9.setText("Timer");

        btnApplyTimer.setText("Apply");
        btnApplyTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyTimerActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnTimerOff)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnTimerForward)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnTimerBackward)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnApplyTimer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnApplyTimer)
                    .add(btnTimerBackward)
                    .add(btnTimerForward)
                    .add(btnTimerOff)
                    .add(jLabel9))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout panelClockLayout = new org.jdesktop.layout.GroupLayout(panelClock);
        panelClock.setLayout(panelClockLayout);
        panelClockLayout.setHorizontalGroup(
            panelClockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelClockLayout.createSequentialGroup()
                .addContainerGap()
                .add(panelClockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3, 0, 355, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, panelClockLayout.createSequentialGroup()
                        .add(pnlTimerStart, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pnlTimerTotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        panelClockLayout.setVerticalGroup(
            panelClockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelClockLayout.createSequentialGroup()
                .add(6, 6, 6)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelClockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(pnlTimerStart, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlTimerTotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        tabAuxiliar.addTab(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("CLOCK"), panelClock);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tabAuxiliar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tabAuxiliar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApplyTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyTimerActionPerformed

        int min, sec, minTot, secTot;
        
        if (btnTimerOff.isSelected()){
            TimerManager.getInstance().setTimerOff();
        }else if (btnTimerForward.isSelected()){
            try{
                min = Integer.parseInt( edtTimerStartMin.getText() );
            }catch(Exception e){
                min = 0;
            }
            try{
                sec = Integer.parseInt( edtTimerStartSec.getText() );
                if (sec > 59) 
                    sec = 59;
            }catch(Exception e){
                sec = 0;
            }
            TimerManager.getInstance().setTimerForward( (min*60 + sec)*1000 );
        }else if (btnTimerBackward.isSelected()){
            try{
                min = Integer.parseInt( edtTimerStartMin.getText() );
            }catch(Exception e){
                min = 0;
            }
            try{
                sec = Integer.parseInt( edtTimerStartSec.getText() );
                if (sec > 59) 
                    sec = 59;
            }catch(Exception e){
                sec = 0;
            }
            try{
                minTot = Integer.parseInt( edtTimerTotalMin.getText() );
            }catch(Exception e){
                minTot = 0;
            }
            try{
                secTot = Integer.parseInt( edtTimerTotalSec.getText() );
                if (secTot > 59) 
                    secTot = 59;
            }catch(Exception e){
                secTot = 0;
            }
            TimerManager.getInstance().setTimerBackward( (min*60 + sec)*1000, (minTot*60 + secTot)*1000 );
            
        }
        
    }//GEN-LAST:event_btnApplyTimerActionPerformed

    private void edtTimerTotalSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTimerTotalSecKeyTyped
        handleNumberKeyPress(evt);
    }//GEN-LAST:event_edtTimerTotalSecKeyTyped

    private void edtTimerTotalMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTimerTotalMinKeyTyped
        handleNumberKeyPress(evt);
    }//GEN-LAST:event_edtTimerTotalMinKeyTyped

    private void edtTimerStartSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTimerStartSecKeyTyped
        handleNumberKeyPress(evt);
    }//GEN-LAST:event_edtTimerStartSecKeyTyped

    private void edtTimerStartMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTimerStartMinKeyTyped
        handleNumberKeyPress(evt);
    }//GEN-LAST:event_edtTimerStartMinKeyTyped

    private void handleNumberKeyPress(java.awt.event.KeyEvent evt){
        char key = evt.getKeyChar();
        if (key < '0' || key > '9'){
            evt.consume();
        }
    }
    
    
    private void edtTimerStartMinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTimerStartMinKeyPressed
// TODO add your handling code here:
    }//GEN-LAST:event_edtTimerStartMinKeyPressed

    private void btnTimerBackwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimerBackwardActionPerformed

        if (btnTimerBackward.isSelected() ){
            btnTimerForward.setSelected(false);
            btnTimerOff.setSelected(false);
        }

        pnlTimerStart.setVisible(true);
        pnlTimerTotal.setVisible(true);
        
    }//GEN-LAST:event_btnTimerBackwardActionPerformed

    private void btnTimerForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimerForwardActionPerformed

        if (btnTimerForward.isSelected() ){
            btnTimerBackward.setSelected(false);
            btnTimerOff.setSelected(false);
        }

        pnlTimerStart.setVisible(true);
        pnlTimerTotal.setVisible(false);
        
    }//GEN-LAST:event_btnTimerForwardActionPerformed

    private void btnTimerOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimerOffActionPerformed

        if (btnTimerOff.isSelected() ){
            btnTimerBackward.setSelected(false);
            btnTimerForward.setSelected(false);
        }
        
        pnlTimerStart.setVisible(false);
        pnlTimerTotal.setVisible(false);
        
    }//GEN-LAST:event_btnTimerOffActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        ContentManager cm = ContentManager.getInstance();
        cm.setTemplateLive("monitor");
        cm.setTitleLive("FooTitulo");
        cm.setSlideLive("Texto do Slide");
        cm.setNextSlideLive("Texto do proximo Slide");
        cm.updateLive();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbDeintrelaceModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDeintrelaceModeActionPerformed
        DisplayManager.getMainDisplay().setDeintrelaceMode( cbDeintrelaceMode.getSelectedIndex() );
    }//GEN-LAST:event_cbDeintrelaceModeActionPerformed

    private void cbInputModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInputModeActionPerformed
        DisplayManager.getMainDisplay().setInputMode( cbInputMode.getSelectedIndex() );
    }//GEN-LAST:event_cbInputModeActionPerformed

    private void cbInputSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInputSrcActionPerformed
        DisplayManager.getMainDisplay().setInputSrc( cbInputSrc.getSelectedIndex() );
    }//GEN-LAST:event_cbInputSrcActionPerformed

    private void cbBackgroundModeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBackgroundModeItemStateChanged
 
        DisplayManager.getMainDisplay().setBackgroundMode( cbBackgroundMode.getSelectedIndex() ); 
        
    }//GEN-LAST:event_cbBackgroundModeItemStateChanged

    private void cbBackgroundModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBackgroundModeActionPerformed
        
    }//GEN-LAST:event_cbBackgroundModeActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

           if( btnClear.isSelected() ){
               DisplayManager.getMainDisplay().clear(1);
           }else{
               DisplayManager.getMainDisplay().clear(0);
           }

        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlackActionPerformed

           if( btnBlack.isSelected() ){
               DisplayManager.getMainDisplay().black(1);
           }else{
               DisplayManager.getMainDisplay().black(0);
           }
        
    }//GEN-LAST:event_btnBlackActionPerformed

    private void btnChangeBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeBackgroundActionPerformed
        
        JFileChooser fc = new JFileChooser();
        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        fc.setMultiSelectionEnabled(false);
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setControlButtonsAreShown(true);
        fc.setDialogTitle("Select Image");
        
        try{
            if(fc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION && fc.getSelectedFile().exists() ){
                String filename = fc.getSelectedFile().getAbsolutePath();
                imgBackground.setImage(filename);
                SDLDisplay d = DisplayManager.getMainDisplay();                
                d.paintBackground( imgBackground.getImage() );
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(this,"Unable to load Background:\n"+e.getMessage(),"DataSoul Error",0);                
        }
        
    }//GEN-LAST:event_btnChangeBackgroundActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        SDLDisplay d = DisplayManager.getMainDisplay();
        DisplayTemplate template = null;
        try {
            template = TemplateManager.getDisplayTemplate("Teste1");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        d.paintOverlay(template);
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDisplay;
    private javax.swing.JButton btnApplyTimer;
    private javax.swing.JToggleButton btnBlack;
    private javax.swing.JButton btnChangeBackground;
    private javax.swing.JToggleButton btnClear;
    private javax.swing.JToggleButton btnTimerBackward;
    private javax.swing.JToggleButton btnTimerForward;
    private javax.swing.JToggleButton btnTimerOff;
    private javax.swing.JComboBox cbBackgroundMode;
    private javax.swing.JComboBox cbDeintrelaceMode;
    private javax.swing.JComboBox cbInputMode;
    private javax.swing.JComboBox cbInputSrc;
    private javax.swing.JTextField edtTimerStartMin;
    private javax.swing.JTextField edtTimerStartSec;
    private javax.swing.JTextField edtTimerTotalMin;
    private javax.swing.JTextField edtTimerTotalSec;
    private datasoul.datashow.ImageDisplayer imgBackground;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelClock;
    private javax.swing.JPanel panelMessage;
    private javax.swing.JPanel pnlTimerStart;
    private javax.swing.JPanel pnlTimerTotal;
    private javax.swing.JTabbedPane tabAuxiliar;
    // End of variables declaration//GEN-END:variables
    
}
