/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VirtualPet.Forms;

import VirtualPet.Creature.Pet;
import static VirtualPet.Forms.GUIApp.petMap;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jeffe
 */
public class LoadForm extends javax.swing.JFrame {

    /**
     * Creates new form LoadFrom
     */
    public LoadForm() {
        initComponents();
        
    }

    
    HashMap<String, Pet> petMap = null;
    public void loadPetsIntoList(HashMap<String, Pet> petMap)
    {
        this.petMap = petMap;
        
        Set<String> keySet = petMap.keySet();
        String[] names = new String[0];
        names = keySet.toArray(names);

        petListBox.setModel(new JList<String>(names).getModel());
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        petListScrollPane = new javax.swing.JScrollPane();
        petListBox = new javax.swing.JList<>();
        backButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        speciesLabel = new javax.swing.JLabel();
        thirstValueBar = new javax.swing.JProgressBar();
        hungerValueBar = new javax.swing.JProgressBar();
        nameValueLabel = new javax.swing.JLabel();
        speciesValueLabel = new javax.swing.JLabel();
        exerciseValueBar = new javax.swing.JProgressBar();
        bladderValueBar = new javax.swing.JProgressBar();
        sadnessValueBar = new javax.swing.JProgressBar();
        foodValueBar = new javax.swing.JProgressBar();
        waterValueBar = new javax.swing.JProgressBar();
        needsLabel = new javax.swing.JLabel();
        thirstLabel = new javax.swing.JLabel();
        hungerLabel = new javax.swing.JLabel();
        exerciseLabel = new javax.swing.JLabel();
        bladderLabel = new javax.swing.JLabel();
        sadnessLabel = new javax.swing.JLabel();
        resourcesLabel = new javax.swing.JLabel();
        foodLabel = new javax.swing.JLabel();
        waterLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Virtual Pet - Load");
        setMinimumSize(new java.awt.Dimension(500, 350));
        setPreferredSize(new java.awt.Dimension(500, 320));

        petListBox.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        petListBox.setMaximumSize(new java.awt.Dimension(1000000, 1000000));
        petListBox.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                petListBoxValueChanged(evt);
            }
        });
        petListScrollPane.setViewportView(petListBox);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Name: ");

        speciesLabel.setText("Species: ");

        thirstValueBar.setValue(50);
        thirstValueBar.setMinimumSize(new java.awt.Dimension(10, 100));

        hungerValueBar.setValue(50);
        hungerValueBar.setMinimumSize(new java.awt.Dimension(10, 100));

        nameValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nameValueLabel.setText("...");

        speciesValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        speciesValueLabel.setText("...");

        exerciseValueBar.setValue(50);
        exerciseValueBar.setMinimumSize(new java.awt.Dimension(10, 100));

        bladderValueBar.setValue(50);
        bladderValueBar.setMinimumSize(new java.awt.Dimension(10, 100));

        sadnessValueBar.setValue(50);
        sadnessValueBar.setMinimumSize(new java.awt.Dimension(10, 100));

        foodValueBar.setValue(50);
        foodValueBar.setMinimumSize(new java.awt.Dimension(10, 100));

        waterValueBar.setValue(50);
        waterValueBar.setMinimumSize(new java.awt.Dimension(10, 100));

        needsLabel.setText("Needs:");

        thirstLabel.setText("Thirst:");

        hungerLabel.setText("Hunger:");

        exerciseLabel.setText("Exercise:");

        bladderLabel.setText("Bladder:");

        sadnessLabel.setText("Sadness:");

        resourcesLabel.setText("Resources:");

        foodLabel.setText("Food:");

        waterLabel.setText("Water:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(petListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(speciesLabel)
                            .addComponent(needsLabel)
                            .addComponent(resourcesLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exerciseLabel)
                                    .addComponent(hungerLabel)
                                    .addComponent(thirstLabel)
                                    .addComponent(bladderLabel)
                                    .addComponent(sadnessLabel)
                                    .addComponent(waterLabel)
                                    .addComponent(foodLabel))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(foodValueBar, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(thirstValueBar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(exerciseValueBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(hungerValueBar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(sadnessValueBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(waterValueBar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(bladderValueBar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameValueLabel)
                                    .addComponent(speciesValueLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loadButton)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(petListScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameValueLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(speciesLabel)
                            .addComponent(speciesValueLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(needsLabel)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(thirstLabel)
                                            .addComponent(thirstValueBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(hungerLabel)
                                                    .addComponent(hungerValueBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(exerciseLabel))
                                            .addComponent(exerciseValueBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bladderLabel))
                                    .addComponent(bladderValueBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sadnessLabel))
                            .addComponent(sadnessValueBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resourcesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(foodLabel)
                                    .addComponent(foodValueBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(waterLabel))
                            .addComponent(waterValueBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(loadButton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        // TODO add your handling code here:
        if (petMap != null)
        {
           Pet pet = petMap.get(petListBox.getSelectedValue());
           GUIApp.loadedPet = pet;
           GUIApp.openPetAppForm();
        }
    }//GEN-LAST:event_loadButtonActionPerformed

    private void petListBoxValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_petListBoxValueChanged
        // TODO add your handling code here:
        if (petMap != null)
        {
           Pet pet = petMap.get(petListBox.getSelectedValue());
           nameValueLabel.setText(pet.attributes.getName());
           speciesValueLabel.setText(pet.attributes.getSpecies());
           
           thirstValueBar.setValue(pet.needs.getThirst());
           hungerValueBar.setValue(pet.needs.getHunger());
           exerciseValueBar.setValue(pet.needs.getExercise());
           bladderValueBar.setValue(pet.needs.getBladder());
           sadnessValueBar.setValue(pet.attributes.getSadness());
           
           foodValueBar.setValue(pet.resources.getFood());
           waterValueBar.setValue(pet.resources.getWater());
        }
        
    }//GEN-LAST:event_petListBoxValueChanged

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        GUIApp.openStartForm();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LoadForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bladderLabel;
    private javax.swing.JProgressBar bladderValueBar;
    private javax.swing.JLabel exerciseLabel;
    private javax.swing.JProgressBar exerciseValueBar;
    private javax.swing.JLabel foodLabel;
    private javax.swing.JProgressBar foodValueBar;
    private javax.swing.JLabel hungerLabel;
    private javax.swing.JProgressBar hungerValueBar;
    private javax.swing.JButton loadButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameValueLabel;
    private javax.swing.JLabel needsLabel;
    private javax.swing.JList<String> petListBox;
    private javax.swing.JScrollPane petListScrollPane;
    private javax.swing.JLabel resourcesLabel;
    private javax.swing.JLabel sadnessLabel;
    private javax.swing.JProgressBar sadnessValueBar;
    private javax.swing.JLabel speciesLabel;
    private javax.swing.JLabel speciesValueLabel;
    private javax.swing.JLabel thirstLabel;
    private javax.swing.JProgressBar thirstValueBar;
    private javax.swing.JLabel waterLabel;
    private javax.swing.JProgressBar waterValueBar;
    // End of variables declaration//GEN-END:variables
}