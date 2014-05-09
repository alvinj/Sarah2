package com.devdaily.sarah.gui

import com.devdaily.sarah.Sarah
import javax.swing.SwingUtilities
import com.devdaily.sarah.plugins.PluginUtils
import com.devdaily.sarah.actors.Brain
import com.devdaily.sarah.MainFrame2
import java.awt.event.ComponentAdapter
import java.awt.event.ComponentEvent
import java.awt.event.ActionListener
import java.awt.event.ActionEvent
import javax.swing.event.DocumentListener
import javax.swing.event.DocumentEvent
import javax.swing.JOptionPane

class Sarah2MainFrameController(sarah: Sarah)
extends BaseMainFrameController {

    val mainFrame = new MainFrame2("")
    val textField = mainFrame.getTextField

    /**
     * this is needed to re-display the window after (a) it is hidden with Cmd-H and
     * then (b) re-displayed with Cmd-Tab. without this, the jframe is not visible.
     */
    mainFrame.addComponentListener(new ComponentAdapter() {
        override def componentShown(e: ComponentEvent) {
          mainFrame.setVisible(true)
        }
    })

    textField.getDocument.addDocumentListener(new DocumentListener() {
        def insertUpdate(e: DocumentEvent) {
          sarah.sendPhraseToBrain(textField.getText)
        }
        def changedUpdate(e: DocumentEvent) {}
        def removeUpdate(e: DocumentEvent) {}
    })
    
    def getMainFrame = mainFrame
    def updateUIBasedOnStates {}
    
    def updateUISpeakingHasEnded {
        textField.setText("")
    }
  
}




