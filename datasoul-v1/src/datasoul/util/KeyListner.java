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
 * KeyListner.java
 *
 * Created on 25 de Junho de 2006, 23:06
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package datasoul.util;

import datasoul.DatasoulMainForm;
import datasoul.config.ConfigObj;
import datasoul.datashow.AuxiliarPanel;
import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Administrador
 */
public class KeyListner implements KeyListener, AWTEventListener{
    
    /** Creates a new instance of KeyListner */
    public KeyListner() {
    }

    @Override
    public void eventDispatched(AWTEvent e) {
        switch (e.getID()) {
            case KeyEvent.KEY_PRESSED:
               keyPressed((KeyEvent) e);
            break;
            case KeyEvent.KEY_RELEASED:
               keyReleased((KeyEvent) e);
            break;
            case KeyEvent.KEY_TYPED:
               keyTyped((KeyEvent) e);
            break;        
        }
    }


    @Override
    public void keyPressed(KeyEvent e) {
        // to conform with KeyListner
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // to conform with KeyListner
    }

    @Override
    public void keyReleased(KeyEvent e) {

        switch(e.getKeyCode()){ 
            case KeyEvent.VK_F3: 
                ObjectManager.getInstance().getPreviewPanel().goLive();
                ObjectManager.getInstance().getDatasoulMainForm().showDisplayControls();
                ObjectManager.getInstance().getLivePanel().setFocusInTable();
                break;
            case KeyEvent.VK_F4: 
                ObjectManager.getInstance().getDatasoulMainForm().showDisplayControls();
                ObjectManager.getInstance().getLivePanel().setFocusInTable();
                break;
            case KeyEvent.VK_F5: 
                ObjectManager.getInstance().getDatasoulMainForm().showDisplayControls();
                ObjectManager.getInstance().getAuxiliarPanel().setVisibleTab(AuxiliarPanel.TAB_DISPLAY);
                break;
            case KeyEvent.VK_F6: 
                ObjectManager.getInstance().getDatasoulMainForm().showDisplayControls();
                ObjectManager.getInstance().getAuxiliarPanel().setVisibleTab(AuxiliarPanel.TAB_ALARM);
                break;
            case KeyEvent.VK_F7: 
                if (ConfigObj.getInstance().getMonitorOutput()){
                    ObjectManager.getInstance().getDatasoulMainForm().showDisplayControls();
                    ObjectManager.getInstance().getAuxiliarPanel().setVisibleTab(AuxiliarPanel.TAB_CLOCK);
                }
                break;                
            case KeyEvent.VK_F8: 
                ObjectManager.getInstance().getDatasoulMainForm().showDisplayControls();
                ObjectManager.getInstance().getAuxiliarPanel().setVisibleTab(AuxiliarPanel.TAB_BACKGROUND);
                break;                
            case KeyEvent.VK_F9: 
                ObjectManager.getInstance().getAuxiliarPanel().getDisplayControlPanel().shortcutHideMain();
                break;                
            case KeyEvent.VK_F10: 
                ObjectManager.getInstance().getAuxiliarPanel().getDisplayControlPanel().shortcutShowMain();
                break;                
            case KeyEvent.VK_F12:     
                ObjectManager.getInstance().getAuxiliarPanel().getDisplayControlPanel().mainDisplayBlack();
                break;
            case KeyEvent.VK_PAGE_DOWN:
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_DOWN:
                ObjectManager.getInstance().getLivePanel().serviceNextSlide();
                break;
            case KeyEvent.VK_PAGE_UP:
            case KeyEvent.VK_UP:
            case KeyEvent.VK_LEFT:
                ObjectManager.getInstance().getLivePanel().servicePreviousSlide();
                break;

            case KeyEvent.VK_ESCAPE:
                ObjectManager.getInstance().getDatasoulMainForm().closeOutputs();
                break;
        }
    }
}
