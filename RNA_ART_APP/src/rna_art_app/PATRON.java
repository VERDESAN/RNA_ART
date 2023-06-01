package rna_art_app;

import java.awt.Color;
import java.util.Arrays;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author verdeHK
 */
public class PATRON extends javax.swing.JFrame {

    public PATRON() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        G00 = new javax.swing.JToggleButton();
        TITULO = new javax.swing.JLabel();
        G01 = new javax.swing.JToggleButton();
        G02 = new javax.swing.JToggleButton();
        G03 = new javax.swing.JToggleButton();
        G04 = new javax.swing.JToggleButton();
        G10 = new javax.swing.JToggleButton();
        G11 = new javax.swing.JToggleButton();
        G12 = new javax.swing.JToggleButton();
        G13 = new javax.swing.JToggleButton();
        G14 = new javax.swing.JToggleButton();
        G20 = new javax.swing.JToggleButton();
        G21 = new javax.swing.JToggleButton();
        G22 = new javax.swing.JToggleButton();
        G23 = new javax.swing.JToggleButton();
        G24 = new javax.swing.JToggleButton();
        G30 = new javax.swing.JToggleButton();
        G31 = new javax.swing.JToggleButton();
        G32 = new javax.swing.JToggleButton();
        G33 = new javax.swing.JToggleButton();
        G34 = new javax.swing.JToggleButton();
        G40 = new javax.swing.JToggleButton();
        G41 = new javax.swing.JToggleButton();
        G42 = new javax.swing.JToggleButton();
        G43 = new javax.swing.JToggleButton();
        G44 = new javax.swing.JToggleButton();
        ADDBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PRINT = new javax.swing.JButton();
        PVSLIDER = new javax.swing.JSlider();
        PVLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        G00.setBackground(new java.awt.Color(255, 255, 255));
        G00.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G00.setForeground(new java.awt.Color(0, 0, 0));
        G00.setText("0,0");
        G00.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G00.setBorderPainted(false);
        G00.setContentAreaFilled(false);
        G00.setFocusPainted(false);
        G00.setMinimumSize(new java.awt.Dimension(50, 50));
        G00.setOpaque(true);
        G00.setPreferredSize(new java.awt.Dimension(50, 50));
        G00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G00ActionPerformed(evt);
            }
        });
        getContentPane().add(G00, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        TITULO.setText("RNA_ART INTELIGENCIA ARTIFICIAL");
        getContentPane().add(TITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        G01.setBackground(new java.awt.Color(255, 255, 255));
        G01.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G01.setForeground(new java.awt.Color(0, 0, 0));
        G01.setText("0,1");
        G01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G01.setBorderPainted(false);
        G01.setContentAreaFilled(false);
        G01.setFocusPainted(false);
        G01.setMinimumSize(new java.awt.Dimension(50, 50));
        G01.setOpaque(true);
        G01.setPreferredSize(new java.awt.Dimension(50, 50));
        G01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G01ActionPerformed(evt);
            }
        });
        getContentPane().add(G01, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        G02.setBackground(new java.awt.Color(255, 255, 255));
        G02.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G02.setForeground(new java.awt.Color(0, 0, 0));
        G02.setText("0,2");
        G02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G02.setBorderPainted(false);
        G02.setContentAreaFilled(false);
        G02.setFocusPainted(false);
        G02.setMinimumSize(new java.awt.Dimension(50, 50));
        G02.setOpaque(true);
        G02.setPreferredSize(new java.awt.Dimension(50, 50));
        G02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G02ActionPerformed(evt);
            }
        });
        getContentPane().add(G02, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        G03.setBackground(new java.awt.Color(255, 255, 255));
        G03.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G03.setForeground(new java.awt.Color(0, 0, 0));
        G03.setText("0,3");
        G03.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G03.setBorderPainted(false);
        G03.setContentAreaFilled(false);
        G03.setFocusPainted(false);
        G03.setMinimumSize(new java.awt.Dimension(50, 50));
        G03.setOpaque(true);
        G03.setPreferredSize(new java.awt.Dimension(50, 50));
        G03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G03ActionPerformed(evt);
            }
        });
        getContentPane().add(G03, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        G04.setBackground(new java.awt.Color(255, 255, 255));
        G04.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G04.setForeground(new java.awt.Color(0, 0, 0));
        G04.setText("0,4");
        G04.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G04.setBorderPainted(false);
        G04.setContentAreaFilled(false);
        G04.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        G04.setFocusPainted(false);
        G04.setMinimumSize(new java.awt.Dimension(50, 50));
        G04.setOpaque(true);
        G04.setPreferredSize(new java.awt.Dimension(50, 50));
        G04.setRolloverEnabled(false);
        G04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G04ActionPerformed(evt);
            }
        });
        getContentPane().add(G04, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        G10.setBackground(new java.awt.Color(255, 255, 255));
        G10.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G10.setForeground(new java.awt.Color(0, 0, 0));
        G10.setText("1,0");
        G10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G10.setBorderPainted(false);
        G10.setContentAreaFilled(false);
        G10.setFocusPainted(false);
        G10.setMinimumSize(new java.awt.Dimension(50, 50));
        G10.setOpaque(true);
        G10.setPreferredSize(new java.awt.Dimension(50, 50));
        G10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G10ActionPerformed(evt);
            }
        });
        getContentPane().add(G10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        G11.setBackground(new java.awt.Color(255, 255, 255));
        G11.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G11.setForeground(new java.awt.Color(0, 0, 0));
        G11.setText("1,1");
        G11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G11.setBorderPainted(false);
        G11.setContentAreaFilled(false);
        G11.setFocusPainted(false);
        G11.setMinimumSize(new java.awt.Dimension(50, 50));
        G11.setOpaque(true);
        G11.setPreferredSize(new java.awt.Dimension(50, 50));
        G11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G11ActionPerformed(evt);
            }
        });
        getContentPane().add(G11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        G12.setBackground(new java.awt.Color(255, 255, 255));
        G12.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G12.setForeground(new java.awt.Color(0, 0, 0));
        G12.setText("1,2");
        G12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G12.setBorderPainted(false);
        G12.setContentAreaFilled(false);
        G12.setFocusPainted(false);
        G12.setMinimumSize(new java.awt.Dimension(50, 50));
        G12.setOpaque(true);
        G12.setPreferredSize(new java.awt.Dimension(50, 50));
        G12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G12ActionPerformed(evt);
            }
        });
        getContentPane().add(G12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        G13.setBackground(new java.awt.Color(255, 255, 255));
        G13.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G13.setForeground(new java.awt.Color(0, 0, 0));
        G13.setText("1,3");
        G13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G13.setBorderPainted(false);
        G13.setContentAreaFilled(false);
        G13.setFocusPainted(false);
        G13.setMinimumSize(new java.awt.Dimension(50, 50));
        G13.setOpaque(true);
        G13.setPreferredSize(new java.awt.Dimension(50, 50));
        G13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G13ActionPerformed(evt);
            }
        });
        getContentPane().add(G13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        G14.setBackground(new java.awt.Color(255, 255, 255));
        G14.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G14.setForeground(new java.awt.Color(0, 0, 0));
        G14.setText("1,4");
        G14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G14.setBorderPainted(false);
        G14.setContentAreaFilled(false);
        G14.setFocusPainted(false);
        G14.setMinimumSize(new java.awt.Dimension(50, 50));
        G14.setOpaque(true);
        G14.setPreferredSize(new java.awt.Dimension(50, 50));
        G14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G14ActionPerformed(evt);
            }
        });
        getContentPane().add(G14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        G20.setBackground(new java.awt.Color(255, 255, 255));
        G20.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G20.setForeground(new java.awt.Color(0, 0, 0));
        G20.setText("2,0");
        G20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G20.setBorderPainted(false);
        G20.setContentAreaFilled(false);
        G20.setFocusPainted(false);
        G20.setMinimumSize(new java.awt.Dimension(50, 50));
        G20.setOpaque(true);
        G20.setPreferredSize(new java.awt.Dimension(50, 50));
        G20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G20ActionPerformed(evt);
            }
        });
        getContentPane().add(G20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        G21.setBackground(new java.awt.Color(255, 255, 255));
        G21.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G21.setForeground(new java.awt.Color(0, 0, 0));
        G21.setText("2,1");
        G21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G21.setBorderPainted(false);
        G21.setContentAreaFilled(false);
        G21.setFocusPainted(false);
        G21.setMinimumSize(new java.awt.Dimension(50, 50));
        G21.setOpaque(true);
        G21.setPreferredSize(new java.awt.Dimension(50, 50));
        G21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G21ActionPerformed(evt);
            }
        });
        getContentPane().add(G21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        G22.setBackground(new java.awt.Color(255, 255, 255));
        G22.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G22.setForeground(new java.awt.Color(0, 0, 0));
        G22.setText("2,2");
        G22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G22.setBorderPainted(false);
        G22.setContentAreaFilled(false);
        G22.setFocusPainted(false);
        G22.setMinimumSize(new java.awt.Dimension(50, 50));
        G22.setOpaque(true);
        G22.setPreferredSize(new java.awt.Dimension(50, 50));
        G22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G22ActionPerformed(evt);
            }
        });
        getContentPane().add(G22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        G23.setBackground(new java.awt.Color(255, 255, 255));
        G23.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G23.setForeground(new java.awt.Color(0, 0, 0));
        G23.setText("2,3");
        G23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G23.setBorderPainted(false);
        G23.setContentAreaFilled(false);
        G23.setFocusPainted(false);
        G23.setMinimumSize(new java.awt.Dimension(50, 50));
        G23.setOpaque(true);
        G23.setPreferredSize(new java.awt.Dimension(50, 50));
        G23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G23ActionPerformed(evt);
            }
        });
        getContentPane().add(G23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        G24.setBackground(new java.awt.Color(255, 255, 255));
        G24.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G24.setForeground(new java.awt.Color(0, 0, 0));
        G24.setText("2,4");
        G24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G24.setBorderPainted(false);
        G24.setContentAreaFilled(false);
        G24.setFocusPainted(false);
        G24.setMinimumSize(new java.awt.Dimension(50, 50));
        G24.setOpaque(true);
        G24.setPreferredSize(new java.awt.Dimension(50, 50));
        G24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G24ActionPerformed(evt);
            }
        });
        getContentPane().add(G24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        G30.setBackground(new java.awt.Color(255, 255, 255));
        G30.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G30.setForeground(new java.awt.Color(0, 0, 0));
        G30.setText("3,0");
        G30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G30.setBorderPainted(false);
        G30.setContentAreaFilled(false);
        G30.setFocusPainted(false);
        G30.setMinimumSize(new java.awt.Dimension(50, 50));
        G30.setOpaque(true);
        G30.setPreferredSize(new java.awt.Dimension(50, 50));
        G30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G30ActionPerformed(evt);
            }
        });
        getContentPane().add(G30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        G31.setBackground(new java.awt.Color(255, 255, 255));
        G31.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G31.setForeground(new java.awt.Color(0, 0, 0));
        G31.setText("3,1");
        G31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G31.setBorderPainted(false);
        G31.setContentAreaFilled(false);
        G31.setFocusPainted(false);
        G31.setMinimumSize(new java.awt.Dimension(50, 50));
        G31.setOpaque(true);
        G31.setPreferredSize(new java.awt.Dimension(50, 50));
        G31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G31ActionPerformed(evt);
            }
        });
        getContentPane().add(G31, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        G32.setBackground(new java.awt.Color(255, 255, 255));
        G32.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G32.setForeground(new java.awt.Color(0, 0, 0));
        G32.setText("3,2");
        G32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G32.setBorderPainted(false);
        G32.setContentAreaFilled(false);
        G32.setFocusPainted(false);
        G32.setMinimumSize(new java.awt.Dimension(50, 50));
        G32.setOpaque(true);
        G32.setPreferredSize(new java.awt.Dimension(50, 50));
        G32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G32ActionPerformed(evt);
            }
        });
        getContentPane().add(G32, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        G33.setBackground(new java.awt.Color(255, 255, 255));
        G33.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G33.setForeground(new java.awt.Color(0, 0, 0));
        G33.setText("3,3");
        G33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G33.setBorderPainted(false);
        G33.setContentAreaFilled(false);
        G33.setFocusPainted(false);
        G33.setMinimumSize(new java.awt.Dimension(50, 50));
        G33.setOpaque(true);
        G33.setPreferredSize(new java.awt.Dimension(50, 50));
        G33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G33ActionPerformed(evt);
            }
        });
        getContentPane().add(G33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        G34.setBackground(new java.awt.Color(255, 255, 255));
        G34.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G34.setForeground(new java.awt.Color(0, 0, 0));
        G34.setText("3,4");
        G34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G34.setBorderPainted(false);
        G34.setContentAreaFilled(false);
        G34.setFocusPainted(false);
        G34.setMinimumSize(new java.awt.Dimension(50, 50));
        G34.setOpaque(true);
        G34.setPreferredSize(new java.awt.Dimension(50, 50));
        G34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G34ActionPerformed(evt);
            }
        });
        getContentPane().add(G34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        G40.setBackground(new java.awt.Color(255, 255, 255));
        G40.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G40.setForeground(new java.awt.Color(0, 0, 0));
        G40.setText("4,0");
        G40.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G40.setBorderPainted(false);
        G40.setContentAreaFilled(false);
        G40.setFocusPainted(false);
        G40.setMinimumSize(new java.awt.Dimension(50, 50));
        G40.setOpaque(true);
        G40.setPreferredSize(new java.awt.Dimension(50, 50));
        G40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G40ActionPerformed(evt);
            }
        });
        getContentPane().add(G40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        G41.setBackground(new java.awt.Color(255, 255, 255));
        G41.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G41.setForeground(new java.awt.Color(0, 0, 0));
        G41.setText("4,1");
        G41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G41.setBorderPainted(false);
        G41.setContentAreaFilled(false);
        G41.setFocusPainted(false);
        G41.setMinimumSize(new java.awt.Dimension(50, 50));
        G41.setOpaque(true);
        G41.setPreferredSize(new java.awt.Dimension(50, 50));
        G41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G41ActionPerformed(evt);
            }
        });
        getContentPane().add(G41, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        G42.setBackground(new java.awt.Color(255, 255, 255));
        G42.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G42.setForeground(new java.awt.Color(0, 0, 0));
        G42.setText("4,2");
        G42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G42.setBorderPainted(false);
        G42.setContentAreaFilled(false);
        G42.setFocusPainted(false);
        G42.setMinimumSize(new java.awt.Dimension(50, 50));
        G42.setOpaque(true);
        G42.setPreferredSize(new java.awt.Dimension(50, 50));
        G42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G42ActionPerformed(evt);
            }
        });
        getContentPane().add(G42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        G43.setBackground(new java.awt.Color(255, 255, 255));
        G43.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G43.setForeground(new java.awt.Color(0, 0, 0));
        G43.setText("4,3");
        G43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G43.setBorderPainted(false);
        G43.setContentAreaFilled(false);
        G43.setFocusPainted(false);
        G43.setMinimumSize(new java.awt.Dimension(50, 50));
        G43.setOpaque(true);
        G43.setPreferredSize(new java.awt.Dimension(50, 50));
        G43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G43ActionPerformed(evt);
            }
        });
        getContentPane().add(G43, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        G44.setBackground(new java.awt.Color(255, 255, 255));
        G44.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        G44.setForeground(new java.awt.Color(0, 0, 0));
        G44.setText("4,4");
        G44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G44.setBorderPainted(false);
        G44.setContentAreaFilled(false);
        G44.setFocusPainted(false);
        G44.setMinimumSize(new java.awt.Dimension(50, 50));
        G44.setOpaque(true);
        G44.setPreferredSize(new java.awt.Dimension(50, 50));
        G44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G44ActionPerformed(evt);
            }
        });
        getContentPane().add(G44, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        ADDBTN.setBackground(new java.awt.Color(0, 0, 0));
        ADDBTN.setForeground(new java.awt.Color(255, 255, 255));
        ADDBTN.setText("AGREGAR PATRON");
        ADDBTN.setFocusable(false);
        ADDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ADDBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jLabel1.setText("PARAMETRO DE VIGILANCIA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        PRINT.setBackground(new java.awt.Color(255, 255, 255));
        PRINT.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        PRINT.setForeground(new java.awt.Color(0, 0, 0));
        PRINT.setText("PRINT");
        PRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRINTActionPerformed(evt);
            }
        });
        getContentPane().add(PRINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        PVSLIDER.setMaximum(10);
        PVSLIDER.setPaintTicks(true);
        PVSLIDER.setValue(5);
        PVSLIDER.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PVSLIDERStateChanged(evt);
            }
        });
        getContentPane().add(PVSLIDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        PVLBL.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        PVLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PVLBL.setText("0.5");
        getContentPane().add(PVLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int conteoentrada = 0;
    //INICIALIZACION
    int E0[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    //PESO INICIAL 1/1+25 // SE UTILIZA 0.032 PARA QUE SEA 0.8 PESO TOTAL COMO EL EJEMPLO
    double P0[] = {0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032, 0.032};
    int CLASES = 2;
    int[] E1 = new int[25];
    int[] E2 = new int[25];
    int[] E3 = new int[25];
    int[] E4 = new int[25];
    int[] E5 = new int[25];
    int[] E6 = new int[25];
    int[] E7 = new int[25];
    int[] E8 = new int[25];
    int[] E9 = new int[25];
    int[] E10 = new int[25];
    double[] P1 = new double[25];
    double[] P2 = new double[25];
    double[] P3 = new double[25];
    double[] P4 = new double[25];
    double[] P5 = new double[25];
    double[] P6 = new double[25];
    double[] P7 = new double[25];
    double[] P8 = new double[25];
    double[] P9 = new double[25];
    double[] P10 = new double[25];
    double PV = 0.5;

    private Color pressedColor = Color.BLACK;
    private Color normalColor = Color.WHITE;

    public void CAMBIOBASE() {
        if (G00.isSelected()) {
            G00.setBackground(pressedColor);
        } else {
            G00.setBackground(normalColor);
        }
    }

    // cambios de seleccion botones
    private void G00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G00ActionPerformed
        if (G00.isSelected()) {
            G00.setBackground(pressedColor);
        } else {
            G00.setBackground(normalColor);
        }
    }//GEN-LAST:event_G00ActionPerformed

    private void G01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G01ActionPerformed
        if (G01.isSelected()) {
            G01.setBackground(pressedColor);
        } else {
            G01.setBackground(normalColor);
        }
    }//GEN-LAST:event_G01ActionPerformed

    private void G02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G02ActionPerformed
        if (G02.isSelected()) {
            G02.setBackground(pressedColor);
        } else {
            G02.setBackground(normalColor);
        }
    }//GEN-LAST:event_G02ActionPerformed

    private void G03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G03ActionPerformed
        if (G03.isSelected()) {
            G03.setBackground(pressedColor);
        } else {
            G03.setBackground(normalColor);
        }
    }//GEN-LAST:event_G03ActionPerformed

    private void G04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G04ActionPerformed
        if (G04.isSelected()) {
            G04.setBackground(pressedColor);
        } else {
            G04.setBackground(normalColor);
        }
    }//GEN-LAST:event_G04ActionPerformed

    private void G10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G10ActionPerformed
        if (G10.isSelected()) {
            G10.setBackground(pressedColor);
        } else {
            G10.setBackground(normalColor);
        }
    }//GEN-LAST:event_G10ActionPerformed

    private void G11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G11ActionPerformed
        if (G11.isSelected()) {
            G11.setBackground(pressedColor);
        } else {
            G11.setBackground(normalColor);
        }
    }//GEN-LAST:event_G11ActionPerformed

    private void G12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G12ActionPerformed
        if (G12.isSelected()) {
            G12.setBackground(pressedColor);
        } else {
            G12.setBackground(normalColor);
        }
    }//GEN-LAST:event_G12ActionPerformed

    private void G13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G13ActionPerformed
        if (G13.isSelected()) {
            G13.setBackground(pressedColor);
        } else {
            G13.setBackground(normalColor);
        }
    }//GEN-LAST:event_G13ActionPerformed

    private void G14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G14ActionPerformed
        if (G14.isSelected()) {
            G14.setBackground(pressedColor);
        } else {
            G14.setBackground(normalColor);
        }
    }//GEN-LAST:event_G14ActionPerformed

    private void G20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G20ActionPerformed
        if (G20.isSelected()) {
            G20.setBackground(pressedColor);
        } else {
            G20.setBackground(normalColor);
        }
    }//GEN-LAST:event_G20ActionPerformed

    private void G21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G21ActionPerformed
        if (G21.isSelected()) {
            G21.setBackground(pressedColor);
        } else {
            G21.setBackground(normalColor);
        }
    }//GEN-LAST:event_G21ActionPerformed

    private void G22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G22ActionPerformed
        if (G22.isSelected()) {
            G22.setBackground(pressedColor);
        } else {
            G22.setBackground(normalColor);
        }
    }//GEN-LAST:event_G22ActionPerformed

    private void G23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G23ActionPerformed
        if (G23.isSelected()) {
            G23.setBackground(pressedColor);
        } else {
            G23.setBackground(normalColor);
        }
    }//GEN-LAST:event_G23ActionPerformed

    private void G24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G24ActionPerformed
        if (G24.isSelected()) {
            G24.setBackground(pressedColor);
        } else {
            G24.setBackground(normalColor);
        }
    }//GEN-LAST:event_G24ActionPerformed

    private void G30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G30ActionPerformed
        if (G30.isSelected()) {
            G30.setBackground(pressedColor);
        } else {
            G30.setBackground(normalColor);
        }
    }//GEN-LAST:event_G30ActionPerformed

    private void G31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G31ActionPerformed
        if (G31.isSelected()) {
            G31.setBackground(pressedColor);
        } else {
            G31.setBackground(normalColor);
        }
    }//GEN-LAST:event_G31ActionPerformed

    private void G32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G32ActionPerformed
        if (G32.isSelected()) {
            G32.setBackground(pressedColor);
        } else {
            G32.setBackground(normalColor);
        }
    }//GEN-LAST:event_G32ActionPerformed

    private void G33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G33ActionPerformed
        if (G33.isSelected()) {
            G33.setBackground(pressedColor);
        } else {
            G33.setBackground(normalColor);
        }
    }//GEN-LAST:event_G33ActionPerformed

    private void G34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G34ActionPerformed
        if (G34.isSelected()) {
            G34.setBackground(pressedColor);
        } else {
            G34.setBackground(normalColor);
        }
    }//GEN-LAST:event_G34ActionPerformed

    private void G40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G40ActionPerformed
        if (G40.isSelected()) {
            G40.setBackground(pressedColor);
        } else {
            G40.setBackground(normalColor);
        }
    }//GEN-LAST:event_G40ActionPerformed

    private void G41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G41ActionPerformed
        if (G41.isSelected()) {
            G41.setBackground(pressedColor);
        } else {
            G41.setBackground(normalColor);
        }
    }//GEN-LAST:event_G41ActionPerformed

    private void G42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G42ActionPerformed
        if (G42.isSelected()) {
            G42.setBackground(pressedColor);
        } else {
            G42.setBackground(normalColor);
        }
    }//GEN-LAST:event_G42ActionPerformed

    private void G43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G43ActionPerformed
        if (G43.isSelected()) {
            G43.setBackground(pressedColor);
        } else {
            G43.setBackground(normalColor);
        }
    }//GEN-LAST:event_G43ActionPerformed

    private void G44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G44ActionPerformed
        if (G44.isSelected()) {
            G44.setBackground(pressedColor);
        } else {
            G44.setBackground(normalColor);
        }
    }//GEN-LAST:event_G44ActionPerformed

    // INICIO DE PROGRAMA
    private void ADDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBTNActionPerformed
        //LIMPIAMOS AUX
        int[] aux;
        aux = new int[25];
        int i = 0;
        if (G00.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G01.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G02.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G03.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G04.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G10.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G11.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G12.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G13.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G14.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G20.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G21.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G22.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G23.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G24.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G30.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G31.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G32.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G33.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G34.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G40.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G41.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G42.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G43.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }
        i = i + 1;
        if (G44.isSelected()) {
            aux[i] = 1;
        } else {
            aux[i] = 0;
        }

        //no se programar en java (: 
        //asi que voy a hacer como si no existieran metodos 
        //y programar de la forma mas basica posible
        if (conteoentrada == 0) {
            E1 = aux;
        }
        if (conteoentrada == 1) {
            E2 = aux;
        }
        if (conteoentrada == 2) {
            E3 = aux;
        }
        if (conteoentrada == 3) {
            E4 = aux;
        }
        if (conteoentrada == 4) {
            E5 = aux;
        }
        if (conteoentrada == 5) {
            E6 = aux;
        }
        if (conteoentrada == 6) {
            E7 = aux;
        }
        if (conteoentrada == 7) {
            E8 = aux;
        }
        if (conteoentrada == 8) {
            E9 = aux;
        }
        if (conteoentrada == 9) {
            E10 = aux;
        }
        if (conteoentrada == 10) {
            System.out.println("max de entradas");
        }

        SALIDA();
    }//GEN-LAST:event_ADDBTNActionPerformed

    private void PRINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRINTActionPerformed
        PRINT PROTOTIPOS = new PRINT();
        PROTOTIPOS.setVisible(true);
        PROTOTIPOS.TITULO.setText("PROTOTIPO 1");
        if (E1[0] == 1) {
            PROTOTIPOS.L00.setBackground(pressedColor);
        }
        if (E1[1] == 1) {
            PROTOTIPOS.L01.setBackground(pressedColor);
        }
        if (E1[2] == 1) {
            PROTOTIPOS.L02.setBackground(pressedColor);
        }
        if (E1[3] == 1) {
            PROTOTIPOS.L03.setBackground(pressedColor);
        }
        if (E1[4] == 1) {
            PROTOTIPOS.L04.setBackground(pressedColor);
        }
        if (E1[5] == 1) {
            PROTOTIPOS.L10.setBackground(pressedColor);
        }
        if (E1[6] == 1) {
            PROTOTIPOS.L11.setBackground(pressedColor);
        }
        if (E1[7] == 1) {
            PROTOTIPOS.L12.setBackground(pressedColor);
        }
        if (E1[8] == 1) {
            PROTOTIPOS.L13.setBackground(pressedColor);
        }
        if (E1[9] == 1) {
            PROTOTIPOS.L14.setBackground(pressedColor);
        }
        if (E1[10] == 1) {
            PROTOTIPOS.L20.setBackground(pressedColor);
        }
        if (E1[11] == 1) {
            PROTOTIPOS.L21.setBackground(pressedColor);
        }
        if (E1[12] == 1) {
            PROTOTIPOS.L22.setBackground(pressedColor);
        }
        if (E1[13] == 1) {
            PROTOTIPOS.L23.setBackground(pressedColor);
        }
        if (E1[14] == 1) {
            PROTOTIPOS.L24.setBackground(pressedColor);
        }
        if (E1[15] == 1) {
            PROTOTIPOS.L30.setBackground(pressedColor);
        }
        if (E1[16] == 1) {
            PROTOTIPOS.L31.setBackground(pressedColor);
        }
        if (E1[17] == 1) {
            PROTOTIPOS.L32.setBackground(pressedColor);
        }
        if (E1[18] == 1) {
            PROTOTIPOS.L33.setBackground(pressedColor);
        }
        if (E1[19] == 1) {
            PROTOTIPOS.L34.setBackground(pressedColor);
        }
        if (E1[20] == 1) {
            PROTOTIPOS.L40.setBackground(pressedColor);
        }
        if (E1[21] == 1) {
            PROTOTIPOS.L41.setBackground(pressedColor);
        }
        if (E1[22] == 1) {
            PROTOTIPOS.L42.setBackground(pressedColor);
        }
        if (E1[23] == 1) {
            PROTOTIPOS.L43.setBackground(pressedColor);
        }
        if (E1[24] == 1) {
            PROTOTIPOS.L44.setBackground(pressedColor);
        }

        PRINT PROTOTIPOS2 = new PRINT();
        PROTOTIPOS2.setVisible(true);
        PROTOTIPOS2.TITULO.setText("PROTOTIPO 2");
        if (E2[0] == 1) {
            PROTOTIPOS2.L00.setBackground(pressedColor);
        }
        if (E2[1] == 1) {
            PROTOTIPOS2.L01.setBackground(pressedColor);
        }
        if (E2[2] == 1) {
            PROTOTIPOS2.L02.setBackground(pressedColor);
        }
        if (E2[3] == 1) {
            PROTOTIPOS2.L03.setBackground(pressedColor);
        }
        if (E2[4] == 1) {
            PROTOTIPOS2.L04.setBackground(pressedColor);
        }
        if (E2[5] == 1) {
            PROTOTIPOS2.L10.setBackground(pressedColor);
        }
        if (E2[6] == 1) {
            PROTOTIPOS2.L11.setBackground(pressedColor);
        }
        if (E2[7] == 1) {
            PROTOTIPOS2.L12.setBackground(pressedColor);
        }
        if (E2[8] == 1) {
            PROTOTIPOS2.L13.setBackground(pressedColor);
        }
        if (E2[9] == 1) {
            PROTOTIPOS2.L14.setBackground(pressedColor);
        }
        if (E2[10] == 1) {
            PROTOTIPOS2.L20.setBackground(pressedColor);
        }
        if (E2[11] == 1) {
            PROTOTIPOS2.L21.setBackground(pressedColor);
        }
        if (E2[12] == 1) {
            PROTOTIPOS2.L22.setBackground(pressedColor);
        }
        if (E2[13] == 1) {
            PROTOTIPOS2.L23.setBackground(pressedColor);
        }
        if (E2[14] == 1) {
            PROTOTIPOS2.L24.setBackground(pressedColor);
        }
        if (E2[15] == 1) {
            PROTOTIPOS2.L30.setBackground(pressedColor);
        }
        if (E2[16] == 1) {
            PROTOTIPOS2.L31.setBackground(pressedColor);
        }
        if (E2[17] == 1) {
            PROTOTIPOS2.L32.setBackground(pressedColor);
        }
        if (E2[18] == 1) {
            PROTOTIPOS2.L33.setBackground(pressedColor);
        }
        if (E2[19] == 1) {
            PROTOTIPOS2.L34.setBackground(pressedColor);
        }
        if (E2[20] == 1) {
            PROTOTIPOS2.L40.setBackground(pressedColor);
        }
        if (E2[21] == 1) {
            PROTOTIPOS2.L41.setBackground(pressedColor);
        }
        if (E2[22] == 1) {
            PROTOTIPOS2.L42.setBackground(pressedColor);
        }
        if (E2[23] == 1) {
            PROTOTIPOS2.L43.setBackground(pressedColor);
        }
        if (E2[24] == 1) {
            PROTOTIPOS2.L44.setBackground(pressedColor);
        }
        if (CLASES >2){
            PRINT PROTOTIPOS3 = new PRINT();
            PROTOTIPOS3.setVisible(true);
            PROTOTIPOS3.TITULO.setText("PROTOTIPO 3");
            if (E3[0] == 1) {
                PROTOTIPOS3.L00.setBackground(pressedColor);
            }
            if (E3[1] == 1) {
                PROTOTIPOS3.L01.setBackground(pressedColor);
            }
            if (E3[2] == 1) {
                PROTOTIPOS3.L02.setBackground(pressedColor);
            }
            if (E3[3] == 1) {
                PROTOTIPOS3.L03.setBackground(pressedColor);
            }
            if (E3[4] == 1) {
                PROTOTIPOS3.L04.setBackground(pressedColor);
            }
            if (E3[5] == 1) {
                PROTOTIPOS3.L10.setBackground(pressedColor);
            }
            if (E3[6] == 1) {
                PROTOTIPOS3.L11.setBackground(pressedColor);
            }
            if (E3[7] == 1) {
                PROTOTIPOS3.L12.setBackground(pressedColor);
            }
            if (E3[8] == 1) {
                PROTOTIPOS3.L13.setBackground(pressedColor);
            }
            if (E3[9] == 1) {
                PROTOTIPOS3.L14.setBackground(pressedColor);
            }
            if (E3[10] == 1) {
                PROTOTIPOS3.L20.setBackground(pressedColor);
            }
            if (E3[11] == 1) {
                PROTOTIPOS3.L21.setBackground(pressedColor);
            }
            if (E3[12] == 1) {
                PROTOTIPOS3.L22.setBackground(pressedColor);
            }
            if (E3[13] == 1) {
                PROTOTIPOS3.L23.setBackground(pressedColor);
            }
            if (E3[14] == 1) {
                PROTOTIPOS3.L24.setBackground(pressedColor);
            }
            if (E3[15] == 1) {
                PROTOTIPOS3.L30.setBackground(pressedColor);
            }
            if (E3[16] == 1) {
                PROTOTIPOS3.L31.setBackground(pressedColor);
            }
            if (E3[17] == 1) {
                PROTOTIPOS3.L32.setBackground(pressedColor);
            }
            if (E3[18] == 1) {
                PROTOTIPOS3.L33.setBackground(pressedColor);
            }
            if (E3[19] == 1) {
                PROTOTIPOS3.L34.setBackground(pressedColor);
            }
            if (E3[20] == 1) {
                PROTOTIPOS3.L40.setBackground(pressedColor);
            }
            if (E3[21] == 1) {
                PROTOTIPOS3.L41.setBackground(pressedColor);
            }
            if (E3[22] == 1) {
                PROTOTIPOS3.L42.setBackground(pressedColor);
            }
            if (E3[23] == 1) {
                PROTOTIPOS3.L43.setBackground(pressedColor);
            }
            if (E3[24] == 1) {
                PROTOTIPOS3.L44.setBackground(pressedColor);
            }
        }
    }//GEN-LAST:event_PRINTActionPerformed

    private void PVSLIDERStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PVSLIDERStateChanged
        PV=PVSLIDER.getValue();
        PV=PV/10;
        
        PVLBL.setText(PV+"");
    }//GEN-LAST:event_PVSLIDERStateChanged

    // SALIDAS DE LA RED
    private void SALIDA() {
        //POR FALTA DE TIEMPO NO SE PENSARAN ALGORITMOS PARA OPTIMIZAR O ELIMINAR RECURSIVIDAD(:
        double NS1 = 0;
        double NS2 = 0;
        //ITERACION 1 NO HAY VENCEDOR, SIEMPRE SE PASA LA PRIMERA.

        if (conteoentrada == 0) {
            //SE SACA NUEVO PESOS
            for (int i = 0; i < 25; i++) {
                NS1 = NS1 + (P0[i] * E1[i]);
            }
            System.out.println("peso " + NS1);
            //SE ALMACENA NUEVA LISTA PESOS
            for (int i = 0; i < 25; i++) {
                if (E1[i] == 1) {
                    P1[i] = NS1;
                    System.out.print(P1[i] + ", ");
                }
            }
        }
        //COMPETENCIA ENTRADA 1 VS E2
        if (conteoentrada == 1) {
            for (int i = 0; i < 25; i++) {
                NS1 = NS1 + (P1[i] * E2[i]);
                NS2 = NS2 + (P0[i] * E2[i]);
            }
            System.out.println("ns1= " + NS1);
            System.out.println("ns2= " + NS2);
            //SI GANA ENTRADA2
            if (NS2 > NS1) {

                //SE ALMACENA NUEVA LISTA PESOS
                for (int i = 0; i < 25; i++) {
                    if (E2[i] == 1) {
                        P2[i] = NS2;
                        //System.out.print(P2[i]+", ");
                    } else {
                        P2[i] = 0;
                    }
                }
            } else {
                //ES CLASE 1 IGUAL A LA PRIMERA 
                double RS = 0;
                double high = 0;
                double low = 0;
                for (int i = 0; i < 25; i++) {
                    high = (E2[i] * E1[i]) + high;
                    low = E2[i] + low;
                }
                RS = high / low;
                System.out.println(RS+" "+PV);
                if (RS > PV) {
                    conteoentrada=conteoentrada-1;

                    for (int i = 0; i < 25; i++) {
                            E1[i] = E1[i] * E2[i];
                    }
                    //NUEVO PESO
                    for (int i = 0; i < 25; i++) {
                            NS2 = NS2 + (P0[i] * E1[i]);
                        }
                        for (int i = 0; i < 25; i++) {
                            if (E1[i] == 1) {
                                P1[i] = NS2;
                                //System.out.print(P1[i] + ", ");
                            } else {
                                P1[i] = 0;
                            }
                    }
                }
                else{
                    for (int i = 0; i < 25; i++) {
                        if (E2[i] == 1) {
                            P2[i] = NS2;
                            //System.out.print(P2[i]+", ");
                        } else {
                            P2[i] = 0;
                        }
                    }
                }
            }
        }
        if (conteoentrada == 2) {
            for (int i = 0; i < 25; i++) {
                NS1 = NS1 + (P1[i] * E3[i]);
                NS2 = NS2 + (P2[i] * E3[i]);
            }
            System.out.println("ns1= " + NS1);
            System.out.println("ns2= " + NS2);
            //PERTENECE A CLASE2
            if (NS2 > NS1) {
                //RELACION SEMEJANZA
                double RS = 0;
                double high = 0;
                double low = 0;
                for (int i = 0; i < 25; i++) {
                    high = (E3[i] * E2[i]) + high;
                    low = E3[i] + low;
                }
                RS = high / low;
                if (RS > PV) {
                    conteoentrada=conteoentrada-1;
                    //SON MISMA CLASE AJUSTE (AND)
                    for (int i = 0; i < 25; i++) {
                        E2[i] = E2[i] * E3[i];
                    }
                } else {
                    //ES NUEVA CLASE
                    CLASES = CLASES + 1;
                    //CREACION DE PESO EXTRA
                    for (int i = 0; i < 25; i++) {
                        NS2 = NS2 + (P0[i] * E3[i]);
                    }
                    for (int i = 0; i < 25; i++) {
                        if (E3[i] == 1) {
                            P3[i] = NS2;
                            System.out.print(P3[i] + ", ");
                        } else {
                            P3[i] = 0;
                        }
                    }
                }
            } else {
                //ES CLASE 1 IGUAL A LA PRIMERA 
                double RS = 0;
                double high = 0;
                double low = 0;
                for (int i = 0; i < 25; i++) {
                    high = (E3[i] * E1[i]) + high;
                    low = E3[i] + low;
                }
                RS = high / low;
                if (RS > PV) {
                    conteoentrada=conteoentrada-1;
                    //SON MISMA CLASE AJUSTE (AND)
                    for (int i = 0; i < 25; i++) {
                        E1[i] = E1[i] * E3[i];
                    }
                } else {
                    //ES NUEVA CLASE
                    CLASES = CLASES + 1;
                    //CREACION DE PESO EXTRA
                    for (int i = 0; i < 25; i++) {
                        NS2 = NS2 + (P0[i] * E3[i]);
                    }
                    for (int i = 0; i < 25; i++) {
                        if (E3[i] == 1) {
                            P3[i] = NS2;
                            System.out.print(P3[i] + ", ");
                        } else {
                            P3[i] = 0;
                        }
                    }
                }
            }
        }
        if (conteoentrada == 3) {
            for (int i = 0; i < 25; i++) {
                NS1 = NS1 + (P1[i] * E4[i]);
                NS2 = NS2 + (P2[i] * E4[i]);
            }
            System.out.println("ns1= " + NS1);
            System.out.println("ns2= " + NS2);
            //PERTENECE A CLASE2
            if (NS2 > NS1) {
                //RELACION SEMEJANZA
                double RS = 0;
                double high = 0;
                double low = 0;
                for (int i = 0; i < 25; i++) {
                    high = (E4[i] * E2[i]) + high;
                    low = E4[i] + low;
                }
                RS = high / low;
                if (RS > PV) {
                    conteoentrada=conteoentrada-1;
                    //SON MISMA CLASE AJUSTE (AND)
                    for (int i = 0; i < 25; i++) {
                        E2[i] = E2[i] * E4[i];
                    }
                } else {
                    //ES NUEVA CLASE
                    CLASES = CLASES + 1;
                    //CREACION DE PESO EXTRA
                    for (int i = 0; i < 25; i++) {
                        NS2 = NS2 + (P0[i] * E4[i]);
                    }
                    for (int i = 0; i < 25; i++) {
                        if (E4[i] == 1) {
                            P4[i] = NS2;
                            System.out.print(P4[i] + ", ");
                        } else {
                            P4[i] = 0;
                        }
                    }
                }
            } else {
                //ES CLASE 1 IGUAL A LA PRIMERA 
                double RS = 0;
                double high = 0;
                double low = 0;
                for (int i = 0; i < 25; i++) {
                    high = (E4[i] * E1[i]) + high;
                    low = E4[i] + low;
                }
                RS = high / low;
                if (RS > PV) {
                    conteoentrada=conteoentrada-1;
                    //SON MISMA CLASE AJUSTE (AND)
                    for (int i = 0; i < 25; i++) {
                        E1[i] = E1[i] * E4[i];
                    }
                } else {
                    //ES NUEVA CLASE
                    CLASES = CLASES + 1;
                    //CREACION DE PESO EXTRA
                    for (int i = 0; i < 25; i++) {
                        NS2 = NS2 + (P0[i] * E4[i]);
                    }
                    for (int i = 0; i < 25; i++) {
                        if (E3[i] == 1) {
                            P3[i] = NS2;
                            System.out.print(P4[i] + ", ");
                        } else {
                            P3[i] = 0;
                        }
                    }
                }
            }
        }
        if (conteoentrada == 4) {

        }
        if (conteoentrada == 5) {

        }
        if (conteoentrada == 6) {

        }
        if (conteoentrada == 7) {

        }
        if (conteoentrada == 8) {

        }
        if (conteoentrada == 9) {

        }
        if (conteoentrada == 10) {
            System.out.println("max de entradas");
        }
        conteoentrada = conteoentrada + 1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBTN;
    private javax.swing.JToggleButton G00;
    private javax.swing.JToggleButton G01;
    private javax.swing.JToggleButton G02;
    private javax.swing.JToggleButton G03;
    private javax.swing.JToggleButton G04;
    private javax.swing.JToggleButton G10;
    private javax.swing.JToggleButton G11;
    private javax.swing.JToggleButton G12;
    private javax.swing.JToggleButton G13;
    private javax.swing.JToggleButton G14;
    private javax.swing.JToggleButton G20;
    private javax.swing.JToggleButton G21;
    private javax.swing.JToggleButton G22;
    private javax.swing.JToggleButton G23;
    private javax.swing.JToggleButton G24;
    private javax.swing.JToggleButton G30;
    private javax.swing.JToggleButton G31;
    private javax.swing.JToggleButton G32;
    private javax.swing.JToggleButton G33;
    private javax.swing.JToggleButton G34;
    private javax.swing.JToggleButton G40;
    private javax.swing.JToggleButton G41;
    private javax.swing.JToggleButton G42;
    private javax.swing.JToggleButton G43;
    private javax.swing.JToggleButton G44;
    private javax.swing.JButton PRINT;
    private javax.swing.JLabel PVLBL;
    private javax.swing.JSlider PVSLIDER;
    private javax.swing.JLabel TITULO;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
