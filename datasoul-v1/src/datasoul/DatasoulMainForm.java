/* 
 * Copyright 2005-2008 Samuel Mello & Eduardo Schnell
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation; version 2 of the License.
 * 
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 * 
 */

/*
 * DatasoulMainForm.java
 *
 * Created on 13 de Dezembro de 2005, 21:59
 */

package datasoul;

import datasoul.config.BackgroundConfig;
import datasoul.config.ConfigObj;
import datasoul.config.ConfigPanel;
import datasoul.config.DisplayControlConfig;
import datasoul.datashow.DatashowPanel;
import datasoul.help.HelpPanel;
import datasoul.render.ContentManager;
import datasoul.song.AllSongsListTable;
import datasoul.song.ChordsDB;
import datasoul.song.SongsPanel;
import datasoul.templates.TemplatePanel;
import datasoul.datashow.TimerManager;
import datasoul.templates.TemplateManager;
import datasoul.util.KeyListner;
import datasoul.util.ObjectManager;
import datasoul.util.Splash;
import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.io.File;
import javax.swing.UIManager;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 *
 * @author  Administrador
 */
public class DatasoulMainForm extends javax.swing.JFrame {
    
    public SongsPanel songs = new SongsPanel();
    public DatashowPanel datashow = new DatashowPanel();
    public TemplatePanel templates = new TemplatePanel();
    public ConfigPanel config = new ConfigPanel();
    public HelpPanel help = new HelpPanel();
    
    
    public static final String DATASOUL_VERSION = "RC1";
    
    GroupLayout songsLayout;
    GroupLayout datashowLayout;
    GroupLayout templatesLayout;
    GroupLayout configLayout;
    GroupLayout helpLayout;

    
    /**
     * Creates new form DatasoulMainForm
     */
    public DatasoulMainForm() {
        
        initComponents();
        
        this.setTitle("Datasoul - "+DATASOUL_VERSION);
        
        ObjectManager.getInstance().setDatasoulMainForm(this);
        
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/datasoul.gif")).getImage());
        
        // Initialize datashow Layout
        datashowLayout = new GroupLayout(getContentPane());
        datashowLayout.setHorizontalGroup(
            datashowLayout.createParallelGroup(GroupLayout.LEADING)
            .add(datashow, GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
            .add(toolBarMain)
        );
        datashowLayout.setVerticalGroup(
            datashowLayout.createParallelGroup(GroupLayout.LEADING)
            .add(GroupLayout.LEADING, datashowLayout.createSequentialGroup()
                .add(toolBarMain, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.RELATED)
                .add(datashow, GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
        );

        // Initialize songs layout
        songsLayout = new GroupLayout(getContentPane());
        songsLayout.setHorizontalGroup(
            songsLayout.createParallelGroup(GroupLayout.LEADING)
            .add(songs, GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
            .add(toolBarMain)
        );
        songsLayout.setVerticalGroup(
            songsLayout.createParallelGroup(GroupLayout.LEADING)
            .add(GroupLayout.LEADING, songsLayout.createSequentialGroup()
                .add(toolBarMain, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.RELATED)
                .add(songs, GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
        );
        
        // Initialize templates layout
        templatesLayout = new GroupLayout(getContentPane());
        templatesLayout.setHorizontalGroup(
            templatesLayout.createParallelGroup(GroupLayout.LEADING)
            .add(templates, GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
            .add(toolBarMain)
        );
        templatesLayout.setVerticalGroup(
            templatesLayout.createParallelGroup(GroupLayout.LEADING)
            .add(GroupLayout.LEADING, templatesLayout.createSequentialGroup()
                .add(toolBarMain, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.RELATED)
                .add(templates, GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
        );
        
        // Initialize config layout
        configLayout = new GroupLayout(getContentPane());
        configLayout.setHorizontalGroup(
            configLayout.createParallelGroup(GroupLayout.LEADING)
            .add(config, GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
            .add(toolBarMain)
        );
        configLayout.setVerticalGroup(
            configLayout.createParallelGroup(GroupLayout.LEADING)
            .add(GroupLayout.LEADING, configLayout.createSequentialGroup()
                .add(toolBarMain, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.RELATED)
                .add(config, GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
        );
        
        // Initialize help layout
        helpLayout = new GroupLayout(getContentPane());
        helpLayout.setHorizontalGroup(
            helpLayout.createParallelGroup(GroupLayout.LEADING)
            .add(help, GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
            .add(toolBarMain)
        );
        helpLayout.setVerticalGroup(
            helpLayout.createParallelGroup(GroupLayout.LEADING)
            .add(GroupLayout.LEADING, helpLayout.createSequentialGroup()
                .add(toolBarMain, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.RELATED)
                .add(help, GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
        );

        showPanel(ObjectManager.VIEW_PROJECTOR);
        ObjectManager.getInstance().setViewActive(ObjectManager.VIEW_PROJECTOR);        
    }
    
    
    public void showPanel(int panel){
        
        songs.setVisible(false);
        datashow.setVisible(false);
        templates.setVisible(false);
        config.setVisible(false);
        help.setVisible(false);
        btnDatashow.setEnabled(true);
        btnSongs.setEnabled(true);
        btnTemplates.setEnabled(true);
        btnConfig.setEnabled(true);
        btnHelp.setEnabled(true);

        switch (panel) {
            case ObjectManager.VIEW_PROJECTOR:
                datashow.setVisible(true);
                getContentPane().setLayout(datashowLayout);
                datashow.validate();
                btnDatashow.setEnabled(false);
                break;
            case ObjectManager.VIEW_SONGS:
                songs.setVisible(true);
                getContentPane().setLayout(songsLayout);
                songs.validate();
                btnSongs.setEnabled(false);
                break;        
            case ObjectManager.VIEW_TEMPLATES:
                templates.setVisible(true);
                getContentPane().setLayout(templatesLayout);
                templates.validate();
                btnTemplates.setEnabled(false);
                break;
            case ObjectManager.VIEW_CONFIG:
                config.setVisible(true);
                getContentPane().setLayout(configLayout);
                config.validate();
                btnConfig.setEnabled(false);
                break;
            case ObjectManager.VIEW_HELP:
                help.setVisible(true);
                getContentPane().setLayout(helpLayout);
                help.validate();
                btnHelp.setEnabled(false);
                break;
                
        }
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBarMain = new javax.swing.JToolBar();
        btnDatashow = new javax.swing.JButton();
        btnTemplates = new javax.swing.JButton();
        btnSongs = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datasoul");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        toolBarMain.setFloatable(false);
        toolBarMain.setMinimumSize(new java.awt.Dimension(451, 60));
        toolBarMain.setOpaque(false);
        toolBarMain.setPreferredSize(new java.awt.Dimension(442, 60));

        btnDatashow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/projector1.png"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("datasoul/internationalize"); // NOI18N
        btnDatashow.setText(bundle.getString("Projector")); // NOI18N
        btnDatashow.setToolTipText(bundle.getString("Projector_operation_view")); // NOI18N
        btnDatashow.setBorderPainted(false);
        btnDatashow.setFocusPainted(false);
        btnDatashow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDatashowMouseClicked(evt);
            }
        });
        toolBarMain.add(btnDatashow);

        btnTemplates.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/looknfeel.png"))); // NOI18N
        btnTemplates.setText(bundle.getString("Templates")); // NOI18N
        btnTemplates.setToolTipText(bundle.getString("Template_edit_view")); // NOI18N
        btnTemplates.setBorderPainted(false);
        btnTemplates.setFocusPainted(false);
        btnTemplates.setMaximumSize(new java.awt.Dimension(88, 44));
        btnTemplates.setMinimumSize(new java.awt.Dimension(88, 44));
        btnTemplates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemplatesActionPerformed(evt);
            }
        });
        toolBarMain.add(btnTemplates);

        btnSongs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/music1.png"))); // NOI18N
        btnSongs.setText(bundle.getString("Songs")); // NOI18N
        btnSongs.setToolTipText(bundle.getString("Song_manipulation_view")); // NOI18N
        btnSongs.setBorderPainted(false);
        btnSongs.setFocusPainted(false);
        btnSongs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSongsMouseClicked(evt);
            }
        });
        toolBarMain.add(btnSongs);

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/package_settings.png"))); // NOI18N
        btnConfig.setText(bundle.getString("Configuration")); // NOI18N
        btnConfig.setToolTipText(bundle.getString("Configuration_view")); // NOI18N
        btnConfig.setBorderPainted(false);
        btnConfig.setFocusPainted(false);
        btnConfig.setMaximumSize(new java.awt.Dimension(88, 44));
        btnConfig.setMinimumSize(new java.awt.Dimension(88, 44));
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });
        toolBarMain.add(btnConfig);

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/khelpcenter.png"))); // NOI18N
        btnHelp.setText(bundle.getString("Help")); // NOI18N
        btnHelp.setBorderPainted(false);
        btnHelp.setFocusPainted(false);
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        toolBarMain.add(btnHelp);

        jSeparator1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        toolBarMain.add(jSeparator1);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/exit.png"))); // NOI18N
        btnClose.setText(bundle.getString("Close")); // NOI18N
        btnClose.setToolTipText(bundle.getString("Close_the_program")); // NOI18N
        btnClose.setBorderPainted(false);
        btnClose.setFocusPainted(false);
        btnClose.setMaximumSize(new java.awt.Dimension(88, 44));
        btnClose.setMinimumSize(new java.awt.Dimension(88, 44));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        toolBarMain.add(btnClose);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(toolBarMain, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(toolBarMain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(657, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        ObjectManager.getInstance().setViewActive(ObjectManager.VIEW_HELP);        
        showPanel(ObjectManager.VIEW_HELP);

    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed

        ObjectManager.getInstance().setViewActive(ObjectManager.VIEW_CONFIG);        
        showPanel(ObjectManager.VIEW_CONFIG);

    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnTemplatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemplatesActionPerformed

        ObjectManager.getInstance().setViewActive(ObjectManager.VIEW_TEMPLATES);        
        showPanel(ObjectManager.VIEW_TEMPLATES);
        
    }//GEN-LAST:event_btnTemplatesActionPerformed

    private void btnSongsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSongsMouseClicked
    
        ObjectManager.getInstance().setViewActive(ObjectManager.VIEW_SONGS);        
        showPanel(ObjectManager.VIEW_SONGS);
  
    }//GEN-LAST:event_btnSongsMouseClicked

    private void btnDatashowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatashowMouseClicked
        
        ObjectManager.getInstance().setViewActive(ObjectManager.VIEW_PROJECTOR);        
        showPanel(ObjectManager.VIEW_PROJECTOR);
        
    }//GEN-LAST:event_btnDatashowMouseClicked
    
    public static void checkStorageLocation(){
        String stgloc = ConfigObj.getInstance().getStorageLoc();
        if (stgloc == null || stgloc.trim().equals("")){
            stgloc = System.getProperty("user.dir")+System.getProperty("file.separator")+"datasoul";
            ConfigObj.getInstance().setStorageLoc(stgloc);
            ConfigObj.getInstance().save();
        }
        System.setProperty("datasoul.stgloc", stgloc);
        
        File stglocdir  = new File(stgloc);
        if (!stglocdir.exists()){
            stglocdir.mkdirs();
        }
        
        File templates  = new File(stgloc+System.getProperty("file.separator")+"templates");
        if (!templates.exists()){
            templates.mkdirs();
        }
        
        File songs  = new File(stgloc+System.getProperty("file.separator")+"songs");
        if (!songs.exists()){
            songs.mkdirs();
        }
    
        File serviceslist  = new File(stgloc+System.getProperty("file.separator")+"servicelists");
        if (!serviceslist.exists()){
            serviceslist.mkdirs();
        }

    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
        // Enable anti-aliasing
        System.setProperty("swing.aatext","true");
        
        try{
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }catch(Exception e){
            //ignore and fall back to java look and feel
        }
        
        //start splashscreen
        final Splash splash = new Splash();
        splash.setVisible(true);
        
        splash.setStatusText(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Loading_configuration..."));
        ConfigObj.getInstance();
        checkStorageLocation();
        
        BackgroundConfig.getInstance();
        TemplateManager.getInstance().refreshAvailableTemplates();
        DisplayControlConfig.getInstance();

        splash.setStatusText(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Loading_songs..."));
        AllSongsListTable.getInstance();
        splash.setStatusText(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Loading_chords_database..."));
        ChordsDB.getInstance();
        splash.setStatusText(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Starting_content_manager..."));
        ContentManager.getInstance();
        TimerManager.getInstance();
        splash.setStatusText(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Creating_user_interface..."));
        final DatasoulMainForm mainForm = new DatasoulMainForm();
        
        splash.setStatusText(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Starting_application..."));


        Toolkit.getDefaultToolkit().addAWTEventListener( new KeyListner(), AWTEvent.KEY_EVENT_MASK);        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainForm.setVisible(true);
                splash.setVisible(false);
                splash.dispose();
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnClose;
    javax.swing.JButton btnConfig;
    javax.swing.JButton btnDatashow;
    javax.swing.JButton btnHelp;
    javax.swing.JButton btnSongs;
    javax.swing.JButton btnTemplates;
    javax.swing.JSeparator jSeparator1;
    javax.swing.JToolBar toolBarMain;
    // End of variables declaration//GEN-END:variables
    
}
