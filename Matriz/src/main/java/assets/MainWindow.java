/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assets;

import javax.swing.JFrame;

/**
 *
 * @author derek
 */
public class MainWindow extends JFrame{
    private int an,al;
    private boolean visible;
    private String tittle = "Proyecto Gaussjordan";

    public MainWindow() {
    }
//contructor
    public MainWindow(int an, int al, boolean visible) {
        this.an = an;
        this.al = al;
        this.visible = visible;
        setSize(an,al);
        setVisible(visible);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle(tittle);
        initComponents();
    }
    //iniciar componentes
    
    private void initComponents()
    {
        
        
        
        
        
        
        
        
        
        
        
        
        //no tocar 
       
        getContentPane().setLayout(null);
        getContentPane().setBackground(new java.awt.Color ( 30, 124, 113 ));      
        //fin de no tocar 
    }
   
    
}
