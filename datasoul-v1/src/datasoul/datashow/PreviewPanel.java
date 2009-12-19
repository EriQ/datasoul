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
 * PreviewPanel.java
 *
 * Created on 26 de Dezembro de 2005, 23:21
 */

package datasoul.datashow;

import datasoul.util.ObjectManager;
import datasoul.render.ContentManager;
import datasoul.song.Song;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author  Administrador
 */
public class PreviewPanel extends javax.swing.JPanel implements ListSelectionListener {

    /**
     * Creates new form PreviewPanel
     */
    public PreviewPanel() {
        initComponents();
        serviceItemTable1.addTableListener(this);
    }

    public void previewItem(ServiceItem serviceItem){
        ContentManager cm = ContentManager.getInstance();
        cm.setTemplatePreview(serviceItem.getTemplate());
        cm.setTitlePreview(serviceItem.getTitle());
        serviceItemTable1.setServiceItem(serviceItem);
        cm.setSlidePreview( serviceItemTable1.getSlideText() );
        cm.setNextSlidePreview( serviceItemTable1.getNextSlideText() );
        cm.setActiveImagePreview(serviceItemTable1.getSlideImage());
        cm.setNextImagePreview(serviceItemTable1.getNextSlideImage());
        if(serviceItem instanceof Song){
            cm.setSongAuthorPreview( ((Song)serviceItem).getSongAuthor() );
            cm.setSongSourcePreview( ((Song)serviceItem).getSongSource() );
            cm.setCopyrightPreview( ((Song)serviceItem).getCopyright() );
        }
        cm.updatePreview();
         
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serviceItemTable1 = new datasoul.datashow.ServiceItemTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnGoLive = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Preview"));
        setDoubleBuffered(false);

        jToolBar1.setFloatable(false);

        btnGoLive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/v2/media-playback-start.png"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("datasoul/internationalize"); // NOI18N
        btnGoLive.setText(bundle.getString("GO_LIVE")); // NOI18N
        btnGoLive.setToolTipText(bundle.getString("Send_slides_to_live")); // NOI18N
        btnGoLive.setBorderPainted(false);
        btnGoLive.setFocusPainted(false);
        btnGoLive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoLiveActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGoLive);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(serviceItemTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serviceItemTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoLiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoLiveActionPerformed

        goLive();
        
    }//GEN-LAST:event_btnGoLiveActionPerformed

    public void goLive(){
        try{
            ObjectManager.getInstance().setBusyCursor();
            ServiceItem previewItem = ObjectManager.getInstance().getPreviewPanel().serviceItemTable1.getServiceItem();
            ObjectManager.getInstance().getLivePanel().showItem(previewItem);
        }finally{
            ObjectManager.getInstance().setDefaultCursor();
        }        
    }
    
    public void valueChanged(ListSelectionEvent e) {
        ContentManager cm = ContentManager.getInstance();
        cm.setSlidePreview( serviceItemTable1.getSlideText() );
        cm.setNextSlidePreview( serviceItemTable1.getNextSlideText() );
        cm.setActiveImagePreview(serviceItemTable1.getSlideImage());
        cm.setNextImagePreview(serviceItemTable1.getNextSlideImage());
        cm.updatePreview();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoLive;
    private javax.swing.JToolBar jToolBar1;
    private datasoul.datashow.ServiceItemTable serviceItemTable1;
    // End of variables declaration//GEN-END:variables
    
}
