/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina.expendedora;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PRODUCTOS extends javax.swing.JFrame {

    public int PRECIOPRODUCTO;
    public int INDENTIFICADORPRODUCTO;
    public int TOTALPROD1;
    public int TOTALPROD2;
    public int TOTALPROD3;
    public int TOTALPROD4;
    public int TOTALPROD5;
    public int TOTALPROD6;
    public int TOTALPROD7;
    public int TOTALPROD8;
    public int TOTALPROD9;
    public int TOTALPROD10;
    public int TOTALPROD11;
    public int TOTALPROD12;

    public int sumatoria = 0;
    public int sumatoriamonedas = 0;
    int auxiliar = 0;
    public int conver = 0;
    public int monedaauxiliar;
    public int contando;
    public int prod;

    //String  no1=(String)PRECIOS.getSelectedItem();
    public PRODUCTOS() {

        initComponents();

        ImageIcon imagen = new ImageIcon(getClass().getResource("/IMASH/MAQUINA.jpg"));
        imagen = new ImageIcon(imagen.getImage().getScaledInstance(ANUNCIOS.getWidth(), ANUNCIOS.getHeight(), Image.SCALE_AREA_AVERAGING));
        ANUNCIOS.setIcon(imagen);

        //producto 1
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/imgproductos/1,.PNG"));
        imagen1 = new ImageIcon(imagen1.getImage().getScaledInstance(PROD.getWidth(), PROD.getHeight(), Image.SCALE_AREA_AVERAGING));
        PROD.setIcon(imagen1);
        //producto2
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/imgproductos/2,.PNG"));
        imagen2 = new ImageIcon(imagen2.getImage().getScaledInstance(PROD2.getWidth(), PROD2.getHeight(), Image.SCALE_AREA_AVERAGING));
        PROD2.setIcon(imagen2);

//                         //producto 3
        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/imgproductos/3,.PNG"));
        imagen3 = new ImageIcon(imagen3.getImage().getScaledInstance(PROD3.getWidth(), PROD3.getHeight(), Image.SCALE_AREA_AVERAGING));
        PROD3.setIcon(imagen3);

//                       //  PRODUCTO 4
        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/imgproductos/4,.PNG"));
        imagen4 = new ImageIcon(imagen4.getImage().getScaledInstance(PROD4.getWidth(), PROD4.getHeight(), Image.SCALE_AREA_AVERAGING));
        PROD4.setIcon(imagen4);
//                         //  PRODUCTO 5
        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/imgproductos/5,.PNG"));
        imagen5 = new ImageIcon(imagen5.getImage().getScaledInstance(PROD5.getWidth(), PROD5.getHeight(), Image.SCALE_AREA_AVERAGING));
        PROD5.setIcon(imagen5);
//                         //  PRODUCTO 6
        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/imgproductos/6,.PNG"));
        imagen6 = new ImageIcon(imagen6.getImage().getScaledInstance(PROD4.getWidth(), PROD4.getHeight(), Image.SCALE_AREA_AVERAGING));
        PROD6.setIcon(imagen6);
//                         //  PRODUCTO 7
        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/imgproductos/7,.PNG"));
        imagen7 = new ImageIcon(imagen7.getImage().getScaledInstance(PROD7.getWidth(), PROD7.getHeight(), Image.SCALE_AREA_AVERAGING));
        PROD7.setIcon(imagen7);
//                          //  PRODUCTO 8
        ImageIcon imagen8 = new ImageIcon(getClass().getResource("/imgproductos/8,.PNG"));
        imagen8 = new ImageIcon(imagen8.getImage().getScaledInstance(PROD8.getWidth(), PROD8.getHeight(), Image.SCALE_AREA_AVERAGING));
        PROD8.setIcon(imagen8);
//                         
        ImageIcon imagen9 = new ImageIcon(getClass().getResource("/imgproductos/9,.PNG"));
        imagen9 = new ImageIcon(imagen9.getImage().getScaledInstance(PROD9U.getWidth(), PROD9U.getHeight(), Image.SCALE_AREA_AVERAGING));
        PROD9U.setIcon(imagen9);

//                         
        ImageIcon imagen10 = new ImageIcon(getClass().getResource("/imgproductos/10,.PNG"));
        imagen10 = new ImageIcon(imagen10.getImage().getScaledInstance(PROD10U.getWidth(), PROD10U.getHeight(), Image.SCALE_AREA_AVERAGING));
        PROD10U.setIcon(imagen10);

//                         
        ImageIcon imagen11 = new ImageIcon(getClass().getResource("/imgproductos/11,.PNG"));
        imagen11 = new ImageIcon(imagen11.getImage().getScaledInstance(PROD11U.getWidth(), PROD11U.getHeight(), Image.SCALE_AREA_AVERAGING));
        PROD11U.setIcon(imagen11);

//                         
        ImageIcon imagen12 = new ImageIcon(getClass().getResource("/imgproductos/12,.PNG"));
        imagen12 = new ImageIcon(imagen12.getImage().getScaledInstance(PROD12U.getWidth(), PROD12U.getHeight(), Image.SCALE_AREA_AVERAGING));
        PROD12U.setIcon(imagen12);

//                  
        ImageIcon automataa = new ImageIcon(getClass().getResource("/automas/q1.JPG"));
        automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
        AUTOMATA.setIcon(automataa);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Q1 = new javax.swing.JLabel();
        EFECTIVO = new javax.swing.JLabel();
        PRECIOS = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        MENSAJES = new javax.swing.JTextArea();
        ENTREGAPRODUCTO = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        INGRESAR = new javax.swing.JButton();
        MONEDA = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        precio = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        precio4 = new javax.swing.JLabel();
        precio5 = new javax.swing.JLabel();
        precio6 = new javax.swing.JLabel();
        precio7 = new javax.swing.JLabel();
        precio8 = new javax.swing.JLabel();
        precio9 = new javax.swing.JLabel();
        precio10 = new javax.swing.JLabel();
        precio11 = new javax.swing.JLabel();
        precio12 = new javax.swing.JLabel();
        AUTOMATA = new javax.swing.JLabel();
        PROD = new javax.swing.JLabel();
        PROD3 = new javax.swing.JLabel();
        PROD5 = new javax.swing.JLabel();
        PROD2 = new javax.swing.JLabel();
        PROD4 = new javax.swing.JLabel();
        PROD6 = new javax.swing.JLabel();
        Q17 = new javax.swing.JLabel();
        Q16 = new javax.swing.JLabel();
        PROD7 = new javax.swing.JLabel();
        PROD8 = new javax.swing.JLabel();
        PROD9U = new javax.swing.JLabel();
        Q5 = new javax.swing.JLabel();
        Q11 = new javax.swing.JLabel();
        Q13 = new javax.swing.JLabel();
        Q14 = new javax.swing.JLabel();
        Q15 = new javax.swing.JLabel();
        Q18 = new javax.swing.JLabel();
        Q19 = new javax.swing.JLabel();
        Q20 = new javax.swing.JLabel();
        Q21 = new javax.swing.JLabel();
        PROD10U = new javax.swing.JLabel();
        PROD11U = new javax.swing.JLabel();
        PROD12U = new javax.swing.JLabel();
        ANUNCIOS = new javax.swing.JLabel();
        espejo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Q1.setBackground(new java.awt.Color(255, 255, 255));
        Q1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        Q1.setForeground(new java.awt.Color(255, 255, 255));
        Q1.setText("Q.15");
        getContentPane().add(Q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 61, 20));

        EFECTIVO.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                EFECTIVOMouseDragged(evt);
            }
        });
        EFECTIVO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EFECTIVOMousePressed(evt);
            }
        });
        getContentPane().add(EFECTIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 160, 70));

        PRECIOS.setBackground(new java.awt.Color(153, 153, 153));
        PRECIOS.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        PRECIOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "1", "5", "10", "20", "50", " " }));
        PRECIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRECIOSActionPerformed(evt);
            }
        });
        getContentPane().add(PRECIOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 170, 100));

        MENSAJES.setColumns(20);
        MENSAJES.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        MENSAJES.setRows(5);
        jScrollPane1.setViewportView(MENSAJES);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 620, 90));

        ENTREGAPRODUCTO.setBackground(new java.awt.Color(255, 204, 0));
        getContentPane().add(ENTREGAPRODUCTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 130, 100));

        jButton3.setText("REINICIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 110, 50));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setText("Comprar");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, -1, 40));

        INGRESAR.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        INGRESAR.setText("INGRESAR");
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });
        getContentPane().add(INGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, 150, 50));

        MONEDA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MONEDAMouseDragged(evt);
            }
        });
        getContentPane().add(MONEDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 50, 40));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("SELECCIONA EL PRODUCTO QUE DESEES OBTENER");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 760, 20));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));

        precio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio.setForeground(new java.awt.Color(255, 51, 51));
        precio.setText("10");
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 40, -1));

        precio2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio2.setForeground(new java.awt.Color(255, 0, 0));
        precio2.setText("10");
        getContentPane().add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 30, -1));

        precio3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio3.setForeground(new java.awt.Color(255, 0, 0));
        precio3.setText("10");
        getContentPane().add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        precio4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio4.setForeground(new java.awt.Color(255, 0, 0));
        precio4.setText("10");
        getContentPane().add(precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        precio5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio5.setForeground(new java.awt.Color(255, 0, 0));
        precio5.setText("10");
        getContentPane().add(precio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        precio6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio6.setForeground(new java.awt.Color(255, 0, 0));
        precio6.setText("10");
        getContentPane().add(precio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        precio7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio7.setForeground(new java.awt.Color(255, 0, 0));
        precio7.setText("10");
        getContentPane().add(precio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        precio8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio8.setForeground(new java.awt.Color(255, 0, 0));
        precio8.setText("10");
        getContentPane().add(precio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        precio9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio9.setForeground(new java.awt.Color(255, 0, 0));
        precio9.setText("10");
        getContentPane().add(precio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, -1));

        precio10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio10.setForeground(new java.awt.Color(255, 0, 0));
        precio10.setText("10");
        getContentPane().add(precio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, -1, -1));

        precio11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio11.setForeground(new java.awt.Color(255, 0, 0));
        precio11.setText("10");
        getContentPane().add(precio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, -1, -1));

        precio12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio12.setForeground(new java.awt.Color(255, 0, 0));
        precio12.setText("10");
        getContentPane().add(precio12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, 30, -1));
        getContentPane().add(AUTOMATA, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 1010, 900));

        PROD.setText("1");
        PROD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PROD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRODMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PRODMousePressed(evt);
            }
        });
        getContentPane().add(PROD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 140, 130));

        PROD3.setText("3");
        PROD3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PROD3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PROD3MousePressed(evt);
            }
        });
        getContentPane().add(PROD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 140, 130));

        PROD5.setText("5");
        PROD5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PROD5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PROD5MousePressed(evt);
            }
        });
        getContentPane().add(PROD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 140, 130));

        PROD2.setText("2");
        PROD2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PROD2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PROD2MousePressed(evt);
            }
        });
        getContentPane().add(PROD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 130, 130));

        PROD4.setText("4");
        PROD4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PROD4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PROD4MousePressed(evt);
            }
        });
        getContentPane().add(PROD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 150, 130));

        PROD6.setText("6");
        PROD6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PROD6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PROD6MousePressed(evt);
            }
        });
        getContentPane().add(PROD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 140, 130));

        Q17.setBackground(new java.awt.Color(102, 102, 102));
        Q17.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        Q17.setForeground(new java.awt.Color(255, 255, 255));
        Q17.setText("Q.35");
        getContentPane().add(Q17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 61, 20));

        Q16.setBackground(new java.awt.Color(102, 102, 102));
        Q16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        Q16.setForeground(new java.awt.Color(255, 255, 255));
        Q16.setText("Q.35");
        getContentPane().add(Q16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 61, 20));

        PROD7.setText("7");
        PROD7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PROD7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PROD7MousePressed(evt);
            }
        });
        getContentPane().add(PROD7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 150, 140));

        PROD8.setText("8");
        PROD8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PROD8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PROD8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PROD8MousePressed(evt);
            }
        });
        getContentPane().add(PROD8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 140, 140));

        PROD9U.setText("9");
        PROD9U.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PROD9U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PROD9UMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PROD9UMousePressed(evt);
            }
        });
        getContentPane().add(PROD9U, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 140, 140));

        Q5.setBackground(new java.awt.Color(102, 102, 102));
        Q5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        Q5.setForeground(new java.awt.Color(255, 255, 255));
        Q5.setText("Q.5");
        getContentPane().add(Q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 180, 50, 20));

        Q11.setBackground(new java.awt.Color(102, 102, 102));
        Q11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        Q11.setForeground(new java.awt.Color(255, 255, 255));
        Q11.setText("Q.5");
        getContentPane().add(Q11, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 180, 50, 20));

        Q13.setBackground(new java.awt.Color(102, 102, 102));
        Q13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        Q13.setForeground(new java.awt.Color(255, 255, 255));
        Q13.setText("Q.25");
        getContentPane().add(Q13, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 330, 50, 20));

        Q14.setBackground(new java.awt.Color(102, 102, 102));
        Q14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        Q14.setForeground(new java.awt.Color(255, 255, 255));
        Q14.setText("Q.15");
        getContentPane().add(Q14, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 330, 50, 20));

        Q15.setBackground(new java.awt.Color(102, 102, 102));
        Q15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        Q15.setForeground(new java.awt.Color(255, 255, 255));
        Q15.setText("Q.25");
        getContentPane().add(Q15, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 330, 50, 20));

        Q18.setBackground(new java.awt.Color(102, 102, 102));
        Q18.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        Q18.setForeground(new java.awt.Color(255, 255, 255));
        Q18.setText("Q.45");
        getContentPane().add(Q18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 61, 20));

        Q19.setBackground(new java.awt.Color(102, 102, 102));
        Q19.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        Q19.setForeground(new java.awt.Color(255, 255, 255));
        Q19.setText("Q.45");
        getContentPane().add(Q19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, 61, 20));

        Q20.setBackground(new java.awt.Color(102, 102, 102));
        Q20.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        Q20.setForeground(new java.awt.Color(255, 255, 255));
        Q20.setText("Q.45");
        getContentPane().add(Q20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 61, 20));

        Q21.setBackground(new java.awt.Color(102, 102, 102));
        Q21.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        Q21.setForeground(new java.awt.Color(255, 255, 255));
        Q21.setText("Q.45");
        getContentPane().add(Q21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, 61, 20));

        PROD10U.setText("10");
        PROD10U.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PROD10U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PROD10UMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PROD10UMousePressed(evt);
            }
        });
        getContentPane().add(PROD10U, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 140, 130));

        PROD11U.setText("11");
        PROD11U.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PROD11U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PROD11UMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PROD11UMousePressed(evt);
            }
        });
        getContentPane().add(PROD11U, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 140, 130));

        PROD12U.setText("12");
        PROD12U.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PROD12U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PROD12UMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PROD12UMousePressed(evt);
            }
        });
        getContentPane().add(PROD12U, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 140, 130));
        getContentPane().add(ANUNCIOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 890, 770));

        espejo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(espejo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 630, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
        jButton2.setEnabled(true);
        //movimiento del dinero
        System.out.println("localizacion de la moneda" + MONEDA.getLocation());
        System.out.println("LOCALIZACION DEL BILLETE" + EFECTIVO.getLocation());
        // EFECTIVO.setLocation(650, 260);

        int INDICE = PRECIOS.getSelectedIndex();
        String no1 = (String) PRECIOS.getSelectedItem();
        conver = Integer.parseInt(no1);

        // IMPRIMIENDO LAS IMAGENES DE LAS MONEDAS
        //LOCALIZACION PARA EL INGRESO DEL DINERO           
        if (((MONEDA.getX() >= 651 && MONEDA.getX() < 709) && (MONEDA.getY() >= 145 && MONEDA.getY() <= 190)) || ((EFECTIVO.getX() >= 669 && EFECTIVO.getX() <= 681) && (EFECTIVO.getY() >= 105 && EFECTIVO.getY() <= 139))) {
            sumatoria = sumatoria + conver;
            if (conver == 5 && contando <= 3) {

                contando = contando + 1;
            }
            if (conver == 5) {

                prod = prod + 1;
            }
            if (conver == 1) {

                monedaauxiliar = monedaauxiliar + 1;
            }
            if (conver == 1 && sumatoriamonedas <= 5) {
                sumatoriamonedas = sumatoriamonedas + 1;

                //Q.1
                if (sumatoriamonedas == 1) {

                    ImageIcon automataa = new ImageIcon(getClass().getResource("/automas/q1-1.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);

                }
                if (sumatoriamonedas == 2) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/Q1,5/2.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (sumatoriamonedas == 3) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/Q1,5/3.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }

                if (PRECIOPRODUCTO != 8 && PRECIOPRODUCTO != 20) {
                    if (sumatoriamonedas == 4 && PRECIOPRODUCTO != 94 && PRECIOPRODUCTO != 20) {
                        ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide19.JPG"));
                        automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                        AUTOMATA.setIcon(automataa);
                    }
                    if (PRECIOPRODUCTO == 5) {
                        if (sumatoriamonedas == 5) {
                            ImageIcon automataa = new ImageIcon(getClass().getResource("/Q1,5/5.PNG"));
                            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                            AUTOMATA.setIcon(automataa);
                        }
                    }

                } else {
                    MENSAJES.setText("SOLO PUEDES INGRESAR HASTA 3 FICHAS Y UN BILLETE DE A 5");
                }
            } //----------------------------------------------------------------------------------------------------------------
            // ESTABLECIENDO RESTRICCIONES PARA EL INGRESO BILLETES DE A CINCO
            else if (conver == 5 && PRECIOPRODUCTO == 5) {

                ImageIcon automataa = new ImageIcon(getClass().getResource("/B5/1.PNG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (conver == 5 && PRECIOPRODUCTO == 1) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/5-1/1.PNG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (conver == 10 && PRECIOPRODUCTO == 1) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/B1-10/1.PNG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (conver == 20 && PRECIOPRODUCTO == 1) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/B1-20/1.PNG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (conver == 50 && PRECIOPRODUCTO == 1) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/B1-50/1.PNG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (conver == 10 && PRECIOPRODUCTO == 5) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D5-10/1.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (conver == 20 && PRECIOPRODUCTO == 5) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D20-5L/4.PNG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (conver == 20 && PRECIOPRODUCTO == 5 && auxiliar == 1) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D20-5L/1.PNG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (conver == 50 && PRECIOPRODUCTO == 5) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D50-5L/1.PNG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (conver == 50 && PRECIOPRODUCTO == 5 && auxiliar == 1) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D50-5L/1.PNG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            }

            if (PRECIOPRODUCTO == 8) {
                if (sumatoriamonedas == 3 && conver == 5 && PRECIOPRODUCTO != 9) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D8/1.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
            } else if (PRECIOPRODUCTO == 10 && sumatoria < 10 && conver == 5) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/5-1/1.PNG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            }
            if (conver == 10 && PRECIOPRODUCTO == 8) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D8/D810,1.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            }
            if (conver == 20 && PRECIOPRODUCTO == 8) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D8/D820.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            }
            if (conver == 50 && PRECIOPRODUCTO == 8) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D8/D850.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            }
            if (PRECIOPRODUCTO == 9 && sumatoriamonedas == 4 && conver == 5 && sumatoria == 9) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide67.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (sumatoria == 3 && conver == 5) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D8/1.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (PRECIOPRODUCTO == 9 && sumatoria == 4 && conver == 5) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/1.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (PRECIOPRODUCTO == 9 && conver == 10) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/D10,91.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (PRECIOPRODUCTO == 9 && conver == 20) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D10/1.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (PRECIOPRODUCTO == 20 && conver == 20) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide134.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (PRECIOPRODUCTO == 9 && conver == 50) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide74.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (PRECIOPRODUCTO == 12 && conver == 10) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/B1-10/1.Png"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (PRECIOPRODUCTO == 12 && sumatoria == 11) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide77.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            } else if (PRECIOPRODUCTO == 12 && sumatoria == 12) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide78.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            }

            if (PRECIOPRODUCTO == 12 && sumatoria < 12 || PRECIOPRODUCTO == 15) {

                if (sumatoriamonedas == 1) {

                    ImageIcon automataa = new ImageIcon(getClass().getResource("/automas/q1-1.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);

                }
                if (sumatoriamonedas == 2) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/Q1,5/2.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (sumatoriamonedas == 3) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/Q1,5/3.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (sumatoriamonedas == 4 && PRECIOPRODUCTO != 9) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide39.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (sumatoriamonedas == 5) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide40.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }

                if (sumatoria == 10) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide81.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (sumatoria == 11) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide82.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (sumatoria == 12) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide8.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }

                if (PRECIOPRODUCTO == 12 && sumatoria == 15 && conver == 5) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide86.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);

                }

            }
            if (PRECIOPRODUCTO == 10 && conver == 10) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide102.jpg"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            }
            if (PRECIOPRODUCTO == 10 && conver == 20) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide103.jpg"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            }
            if (PRECIOPRODUCTO == 10 && conver == 50) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide105.jpg"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            }

            if (PRECIOPRODUCTO == 15 && sumatoriamonedas == 5 && sumatoria == 15) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide107.jpg"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);

            }
            if (PRECIOPRODUCTO == 15 && sumatoriamonedas == 0 && sumatoria == 10) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/B1-10/1.PNG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);

            }
            if (PRECIOPRODUCTO == 15 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 15) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide112.jpg"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);

            }
            if (PRECIOPRODUCTO == 15 && sumatoriamonedas == 0 && conver == 5) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide44.jpg"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);

            }
            if (PRECIOPRODUCTO == 15 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 10) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide99.jpg"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);

            }
            if (PRECIOPRODUCTO == 15 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 15) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide99.jpg"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);

            }
            if (PRECIOPRODUCTO == 15 && conver == 20) {

                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide118.jpg"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            }
            if (PRECIOPRODUCTO == 15 && conver == 50) {

                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide120.jpg"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            }

            if (PRECIOPRODUCTO == 20 && sumatoriamonedas == 4 || sumatoriamonedas == 5 || sumatoriamonedas == 0) {

                if (sumatoriamonedas == 4) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide19.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }

                if (sumatoriamonedas == 5 || PRECIOPRODUCTO == 20) {

                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide20.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (sumatoriamonedas == 5 && conver == 5 && sumatoria == 10) {

                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide81.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (sumatoriamonedas == 5 && conver == 5 && sumatoria == 15) {

                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide86.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (sumatoriamonedas == 5 && conver == 5 && sumatoria == 20) {

                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide122.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (sumatoriamonedas == 5 && conver == 5 && sumatoria == 20) {

                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide122.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }

                if (PRECIOPRODUCTO == 20 && sumatoriamonedas == 0 && sumatoria == 10) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/B1-10/1.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (PRECIOPRODUCTO == 20 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 15) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide112.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (PRECIOPRODUCTO == 20 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 20) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide127.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }

            }

            if (PRECIOPRODUCTO == 20 && conver == 5 && conver != 10 && conver != 20 && conver != 50) {
                if (PRECIOPRODUCTO == 20 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 5) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/5-1/1.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (PRECIOPRODUCTO == 20 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 10) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide99.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (PRECIOPRODUCTO == 20 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 15) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide115.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (PRECIOPRODUCTO == 20 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 20) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide130.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
            }
            if (PRECIOPRODUCTO == 20 && conver == 20) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide133.jpg"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);

            }
            if (PRECIOPRODUCTO == 20 && conver == 50) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide139.jpg"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);

            } //    else if(conver==5 && sumatoriamonedas<=4 ){
            //  
            //   sumatoria=sumatoria+conver; 
            //}
            //------------------------------------------------------------------------
            //    else if(conver==5 && sumatoriamonedas<=5 ){
            //  
            //   sumatoria=sumatoria+conver; 
            //}
            //   else if(conver==5 && sumatoria<=20 ){
            //  
            //   sumatoria=sumatoria+conver; 
            //} 
            //   
            //    else if(conver==10  ){
            //  
            //   sumatoria=sumatoria+conver; 
            //} 
            //    else if(conver==10 && sumatoriamonedas<=2 ){
            //  
            //   sumatoria=sumatoria+conver; 
            //} 
            //    else if(conver==5 && sumatoriamonedas<=2 ){
            //  
            //   sumatoria=sumatoria+conver; 
            //} 
            //     else if(conver==20 ||conver==20&&sumatoriamonedas<=1 ){
            //  
            //   sumatoria=sumatoria+conver; 
            //} 
            //      else if(conver==50  ){
            //  
            //   sumatoria=sumatoria+conver; 
            //} 
            //---------------------------------------------------------------   
            else if (conver == 1 && sumatoriamonedas == 5) {
                JOptionPane.showMessageDialog(null, "HAS EXCEDIDIDO DEL NUMERO MAXIMO DE MONEDAS A INGRESAR EL MAXIMO SON 5");
            }

            if (sumatoria < PRECIOPRODUCTO) {

                JOptionPane.showMessageDialog(null, "El CREDITO ES INSUFICIENTE PARA OBTENER EL PRODUCTO AUN FALTAN " + (PRECIOPRODUCTO - sumatoria));
            } //Q.1
            else if (sumatoria >= PRECIOPRODUCTO) {
                JOptionPane.showMessageDialog(null, "FELICIDADES SU PRODUCTO HA SIDO ACREDITADO");

                if (sumatoria == 1) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/automas/q1-d.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }

                if (auxiliar == 0) {
                    if (sumatoriamonedas == 5) {
                        ImageIcon automataa = new ImageIcon(getClass().getResource("/Q1,5/7.PNG"));
                        automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                        AUTOMATA.setIcon(automataa);
                    }
                } else if (auxiliar == 1) {
                    if (sumatoriamonedas == 5) {
                        ImageIcon automataa = new ImageIcon(getClass().getResource("/Q1,5/7,1.JPG"));
                        automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                        AUTOMATA.setIcon(automataa);
                    }
                } // BILLETES
                else if (conver == 5 && PRECIOPRODUCTO == 5) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/B5/2.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (conver == 5 && PRECIOPRODUCTO == 1) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/5-1/2.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (conver == 10 && PRECIOPRODUCTO == 1) {
                    sumatoria = sumatoria + conver;
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/B1-10/2.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (conver == 20 && PRECIOPRODUCTO == 1) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/B1-20/2.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (conver == 50 && PRECIOPRODUCTO == 1) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/B1-50/2.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (conver == 10 && PRECIOPRODUCTO == 5) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D5-10/2.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (conver == 10 && PRECIOPRODUCTO == 5 && auxiliar == 1) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D5-10L/1.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (conver == 5 && PRECIOPRODUCTO == 5 && auxiliar == 1) {

                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D5-5L/2.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (conver == 20 && PRECIOPRODUCTO == 5) {
                    sumatoria = sumatoria + conver;
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D20-5L/5.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (conver == 20 && PRECIOPRODUCTO == 5 && auxiliar == 1) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D20-5L/2.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (conver == 50 && PRECIOPRODUCTO == 5) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D50-5L/2.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (conver == 50 && PRECIOPRODUCTO == 5 && auxiliar == 1) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D50-5L/4.PNG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }

                if (sumatoriamonedas == 3 && conver == 5) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D8/2.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (conver == 10 && PRECIOPRODUCTO == 8) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D8/D810,.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }

                if (sumatoria == 9) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/2.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (PRECIOPRODUCTO == 9 && conver == 10) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/D10,92.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (PRECIOPRODUCTO == 9 && conver == 20) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D10/2.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (PRECIOPRODUCTO == 9 && conver == 50) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide75.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                } else if (PRECIOPRODUCTO == 12 && sumatoria == 12) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide84.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (PRECIOPRODUCTO == 12 && sumatoria == 15 && conver == 5) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide89.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);

                }
                if (PRECIOPRODUCTO == 12 && conver == 20) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide94.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);

                }
                if (PRECIOPRODUCTO == 12 && conver == 50) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide95.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);

                }
                if (PRECIOPRODUCTO == 10 && sumatoriamonedas == 5 && sumatoria == 10) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide97.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);

                }
                if (PRECIOPRODUCTO == 10 && conver == 5 && sumatoria == 5) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide3.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);

                }
                if (PRECIOPRODUCTO == 10 && conver == 5 && sumatoria == 10) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide99.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);

                }
                if (PRECIOPRODUCTO == 10 && conver == 5 && sumatoria == 10) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide100.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);

                }
                if (PRECIOPRODUCTO == 15 && sumatoriamonedas == 5 && sumatoria == 15) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide109.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);

                }

                if (PRECIOPRODUCTO == 15 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 15) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide113.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);

                }

                if (PRECIOPRODUCTO == 15 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 15 && contando == 3) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide116.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);

                }

                if (PRECIOPRODUCTO == 20 && sumatoriamonedas == 5 && sumatoria == 20) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide123.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (PRECIOPRODUCTO == 9 && sumatoriamonedas == 4 && conver == 5 && sumatoria == 9) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide68.JPG"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (PRECIOPRODUCTO == 20 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 20 && prod != 4) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide128.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }
                if (PRECIOPRODUCTO == 20 && conver == 5 && prod == 4) {
                    ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide131.jpg"));
                    automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                    AUTOMATA.setIcon(automataa);
                }

                if (sumatoria >= PRECIOPRODUCTO) {
                    INGRESAR.setEnabled(false);

                }

            }

        } else {
            MENSAJES.setText("COLOQUE EL DINERO EN UNA POSICION DE INGRESO");
        }

    }//GEN-LAST:event_INGRESARActionPerformed

    private void PRECIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRECIOSActionPerformed

    }//GEN-LAST:event_PRECIOSActionPerformed

    private void EFECTIVOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EFECTIVOMousePressed
        int i = PRECIOS.getSelectedIndex();

        if (i == 1) {

            ImageIcon imagenn = new ImageIcon(getClass().getResource("/DINERO/1BILLETE.JPG"));
            imagenn = new ImageIcon(imagenn.getImage().getScaledInstance(EFECTIVO.getWidth(), EFECTIVO.getHeight(), Image.SCALE_AREA_AVERAGING));
            EFECTIVO.setIcon(imagenn);

            ImageIcon imagenn1 = new ImageIcon(getClass().getResource("/DINERO/1Quetzal.PNG"));
            imagenn = new ImageIcon(imagenn1.getImage().getScaledInstance(MONEDA.getWidth(), MONEDA.getHeight(), Image.SCALE_AREA_AVERAGING));
            MONEDA.setIcon(imagenn);

        }

        if (i == 2) {
            ImageIcon imagenn = new ImageIcon(getClass().getResource("/DINERO/5quetzales.PNG"));
            imagenn = new ImageIcon(imagenn.getImage().getScaledInstance(EFECTIVO.getWidth(), EFECTIVO.getHeight(), Image.SCALE_AREA_AVERAGING));
            EFECTIVO.setIcon(imagenn);
        }

        if (i == 3) {
            ImageIcon imagenn = new ImageIcon(getClass().getResource("/DINERO/10Quetzales.PNG"));
            imagenn = new ImageIcon(imagenn.getImage().getScaledInstance(EFECTIVO.getWidth(), EFECTIVO.getHeight(), Image.SCALE_AREA_AVERAGING));
            EFECTIVO.setIcon(imagenn);
        }
        if (i == 4) {
            ImageIcon imagenn = new ImageIcon(getClass().getResource("/DINERO/20quetzales.JPG"));
            imagenn = new ImageIcon(imagenn.getImage().getScaledInstance(EFECTIVO.getWidth(), EFECTIVO.getHeight(), Image.SCALE_AREA_AVERAGING));
            EFECTIVO.setIcon(imagenn);
        }
        if (i == 5) {
            ImageIcon imagenn = new ImageIcon(getClass().getResource("/DINERO/50quetzales.JPG"));
            imagenn = new ImageIcon(imagenn.getImage().getScaledInstance(EFECTIVO.getWidth(), EFECTIVO.getHeight(), Image.SCALE_AREA_AVERAGING));
            EFECTIVO.setIcon(imagenn);
        }


    }//GEN-LAST:event_EFECTIVOMousePressed

    private void EFECTIVOMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EFECTIVOMouseDragged
        EFECTIVO.setLocation(EFECTIVO.getLocation().x + evt.getX() - EFECTIVO.getWidth() / 2,
                EFECTIVO.getLocation().y + evt.getY() - EFECTIVO.getHeight() / 2);        // TODO add your handling code here:
    }//GEN-LAST:event_EFECTIVOMouseDragged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton2.setEnabled(false);
        INGRESAR.setEnabled(true);
        MENSAJES.setText("");

        PRECIOS.setSelectedIndex(0);

        sumatoria = 0;
        sumatoriamonedas = 0;

        EFECTIVO.setIcon(null);
        MONEDA.setIcon(null);
        ENTREGAPRODUCTO.setIcon(null);
        ImageIcon automataa = new ImageIcon(getClass().getResource("/automas/q1.JPG"));
        automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
        AUTOMATA.setIcon(automataa);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void MONEDAMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MONEDAMouseDragged
        MONEDA.setLocation(MONEDA.getLocation().x + evt.getX() - MONEDA.getWidth() / 2,
                MONEDA.getLocation().y + evt.getY() - MONEDA.getHeight() / 2);      // TODO add your handling code here:
    }//GEN-LAST:event_MONEDAMouseDragged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (sumatoria >= PRECIOPRODUCTO) {
            if (PRECIOPRODUCTO == 5 && INDENTIFICADORPRODUCTO == 1) {
                String valor = precio.getText();
                int suma = Integer.parseInt(valor);
                int resultado = 0;
                resultado = suma - 1;
                precio.setText(resultado + "");
                //producto12
                if (suma == 0) {
                    precio.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No existen productos ");
                } else {
                ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMASH/1.PNG"));
                imagen1 = new ImageIcon(imagen1.getImage().getScaledInstance(ENTREGAPRODUCTO.getWidth(), ENTREGAPRODUCTO.getHeight(), Image.SCALE_AREA_AVERAGING));
                ENTREGAPRODUCTO.setIcon(imagen1);
                }

            }

            if (PRECIOPRODUCTO == 5 && INDENTIFICADORPRODUCTO == 2) {
                String valor = precio2.getText();
                int suma = Integer.parseInt(valor);
                int resultado = 0;
                resultado = suma - 1;
                precio2.setText(resultado + "");
                //producto12
                if (suma == 0) {
                    precio2.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No existen productos ");
                } else {
                ImageIcon imagen2 = new ImageIcon(getClass().getResource("/IMASH/2.PNG"));
                imagen2 = new ImageIcon(imagen2.getImage().getScaledInstance(ENTREGAPRODUCTO.getWidth(), ENTREGAPRODUCTO.getHeight(), Image.SCALE_AREA_AVERAGING));
                ENTREGAPRODUCTO.setIcon(imagen2);
                }
                //producto2

            }

            if (PRECIOPRODUCTO == 15 && INDENTIFICADORPRODUCTO == 3) {
                String valor = precio3.getText();
                int suma = Integer.parseInt(valor);
                int resultado = 0;
                resultado = suma - 1;
                precio3.setText(resultado + "");
                //producto12
                if (suma == 0) {
                    precio3.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No existen productos ");
                } else {
                ImageIcon imagen3 = new ImageIcon(getClass().getResource("/IMASH/3.PNG"));
                imagen3 = new ImageIcon(imagen3.getImage().getScaledInstance(ENTREGAPRODUCTO.getWidth(), ENTREGAPRODUCTO.getHeight(), Image.SCALE_AREA_AVERAGING));
                ENTREGAPRODUCTO.setIcon(imagen3);
                }

            }
            if (PRECIOPRODUCTO == 15 && INDENTIFICADORPRODUCTO == 4) {
                String valor = precio4.getText();
                int suma = Integer.parseInt(valor);
                int resultado = 0;
                resultado = suma - 1;
                precio4.setText(resultado + "");
                //producto12
                if (suma == 0) {
                    precio4.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No existen productos ");
                } else {
                ImageIcon imagen4 = new ImageIcon(getClass().getResource("/IMASH/4.PNG"));
                imagen4 = new ImageIcon(imagen4.getImage().getScaledInstance(ENTREGAPRODUCTO.getWidth(), ENTREGAPRODUCTO.getHeight(), Image.SCALE_AREA_AVERAGING));
                ENTREGAPRODUCTO.setIcon(imagen4);
                }


            }

            if (PRECIOPRODUCTO == 25 && INDENTIFICADORPRODUCTO == 5) {
                String valor = precio5.getText();
                int suma = Integer.parseInt(valor);
                int resultado = 0;
                resultado = suma - 1;
                precio5.setText(resultado + "");
                //producto12
                if (suma == 0) {
                    precio5.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No existen productos ");
                } else {
                ImageIcon imagen5 = new ImageIcon(getClass().getResource("/IMASH/5.PNG"));
                imagen5 = new ImageIcon(imagen5.getImage().getScaledInstance(ENTREGAPRODUCTO.getWidth(), ENTREGAPRODUCTO.getHeight(), Image.SCALE_AREA_AVERAGING));
                ENTREGAPRODUCTO.setIcon(imagen5);
                }
                //  PRODUCTO 5

            }

            if (PRECIOPRODUCTO == 25 && INDENTIFICADORPRODUCTO == 6) {
                String valor = precio6.getText();
                int suma = Integer.parseInt(valor);
                int resultado = 0;
                resultado = suma - 1;
                precio6.setText(resultado + "");
                //producto12
                if (suma == 0) {
                    precio6.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No existen productos ");
                } else {
                ImageIcon imagen6 = new ImageIcon(getClass().getResource("/IMASH/6.PNG"));
                imagen6 = new ImageIcon(imagen6.getImage().getScaledInstance(ENTREGAPRODUCTO.getWidth(), ENTREGAPRODUCTO.getHeight(), Image.SCALE_AREA_AVERAGING));
                ENTREGAPRODUCTO.setIcon(imagen6);
                }
                //  PRODUCTO 6

            }

            if (PRECIOPRODUCTO == 35 && INDENTIFICADORPRODUCTO == 7) {
                String valor = precio7.getText();
                int suma = Integer.parseInt(valor);
                int resultado = 0;
                resultado = suma - 1;
                precio7.setText(resultado + "");
                //producto12
                if (suma == 0) {
                    precio7.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No existen productos ");
                } else {
                ImageIcon imagen7 = new ImageIcon(getClass().getResource("/IMASH/7.PNG"));
                imagen7 = new ImageIcon(imagen7.getImage().getScaledInstance(ENTREGAPRODUCTO.getWidth(), ENTREGAPRODUCTO.getHeight(), Image.SCALE_AREA_AVERAGING));
                ENTREGAPRODUCTO.setIcon(imagen7);
                }
                //  PRODUCTO 7

            }
            if (PRECIOPRODUCTO == 35 && INDENTIFICADORPRODUCTO == 8) {
                String valor = precio8.getText();
                int suma = Integer.parseInt(valor);
                int resultado = 0;
                resultado = suma - 1;
                precio8.setText(resultado + "");
                //producto12
                if (suma == 0) {
                    precio8.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No existen productos ");
                } else {
                ImageIcon imagen8 = new ImageIcon(getClass().getResource("/IMASH/8.PNG"));
                imagen8 = new ImageIcon(imagen8.getImage().getScaledInstance(ENTREGAPRODUCTO.getWidth(), ENTREGAPRODUCTO.getHeight(), Image.SCALE_AREA_AVERAGING));
                ENTREGAPRODUCTO.setIcon(imagen8);
                }
                //  PRODUCTO 8

            }
            if (PRECIOPRODUCTO == 45 && INDENTIFICADORPRODUCTO == 9) {
                String valor = precio9.getText();
                int suma = Integer.parseInt(valor);
                int resultado = 0;
                resultado = suma - 1;
                precio9.setText(resultado + "");
                //producto12
                if (suma == 0) {
                    precio9.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No existen productos ");
                } else {
                ImageIcon imagen9 = new ImageIcon(getClass().getResource("/IMASH/9.PNG"));
                imagen9 = new ImageIcon(imagen9.getImage().getScaledInstance(ENTREGAPRODUCTO.getWidth(), ENTREGAPRODUCTO.getHeight(), Image.SCALE_AREA_AVERAGING));
                ENTREGAPRODUCTO.setIcon(imagen9);
                }


            }

            if (PRECIOPRODUCTO == 45 && INDENTIFICADORPRODUCTO == 10) {
                String valor = precio10.getText();
                int suma = Integer.parseInt(valor);
                int resultado = 0;
                resultado = suma - 1;
                precio10.setText(resultado + "");
                //producto12
                if (suma == 0) {
                    precio10.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No existen productos ");
                } else {
                ImageIcon imagen10 = new ImageIcon(getClass().getResource("/IMASH/10.PNG"));
                imagen10 = new ImageIcon(imagen10.getImage().getScaledInstance(ENTREGAPRODUCTO.getWidth(), ENTREGAPRODUCTO.getHeight(), Image.SCALE_AREA_AVERAGING));
                ENTREGAPRODUCTO.setIcon(imagen10);
                }
                //  PRODUCTO 10

            }
            if (PRECIOPRODUCTO == 45 && INDENTIFICADORPRODUCTO == 11) {
                String valor = precio11.getText();
                int suma = Integer.parseInt(valor);
                int resultado = 0;
                resultado = suma - 1;
                precio11.setText(resultado + "");
                //producto12
                if (suma == 0) {
                    precio11.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No existen productos ");
                } else {
                ImageIcon imagen11 = new ImageIcon(getClass().getResource("/IMASH/11.PNG"));
                imagen11 = new ImageIcon(imagen11.getImage().getScaledInstance(ENTREGAPRODUCTO.getWidth(), ENTREGAPRODUCTO.getHeight(), Image.SCALE_AREA_AVERAGING));
                ENTREGAPRODUCTO.setIcon(imagen11);
                }
                //producto11

            }
            if (PRECIOPRODUCTO == 45 && INDENTIFICADORPRODUCTO == 12) {
                String valor = precio12.getText();
                int suma = Integer.parseInt(valor);
                int resultado = 0;
                resultado = suma - 1;
                precio12.setText(resultado + "");
                //producto12
                if (suma == 0) {
                    precio12.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No existen productos ");
                } else {
                    ImageIcon imagen12 = new ImageIcon(getClass().getResource("/IMASH/12.PNG"));
                    imagen12 = new ImageIcon(imagen12.getImage().getScaledInstance(ENTREGAPRODUCTO.getWidth(), ENTREGAPRODUCTO.getHeight(), Image.SCALE_AREA_AVERAGING));
                    ENTREGAPRODUCTO.setIcon(imagen12);
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "no existen creditos suficientes para generar el producto solicitado");
        }

        // TODO add your handling code here:
        if (sumatoriamonedas == 1) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/automas/q1-E.JPG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (auxiliar == 0 && sumatoriamonedas == 5 && PRECIOPRODUCTO == 5) {
            if (sumatoriamonedas == 5 && PRECIOPRODUCTO == 5) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/Q1,5/8.PNG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            }
        }
        if (auxiliar == 1) {
            if (sumatoriamonedas == 5 && sumatoriamonedas == 5) {
                ImageIcon automataa = new ImageIcon(getClass().getResource("/Q1,5/8,1.JPG"));
                automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
                AUTOMATA.setIcon(automataa);
            }
        }
        if (conver == 5 && PRECIOPRODUCTO == 5) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/B5/4.PNG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }

        if (conver == 5 && PRECIOPRODUCTO == 1) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/5-1/3.PNG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }

        if (conver == 10 && PRECIOPRODUCTO == 1) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/B1-10/3.PNG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (conver == 20 && PRECIOPRODUCTO == 1) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/B1-20/3.PNG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (conver == 50 && PRECIOPRODUCTO == 1) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/B1-50/3.PNG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (conver == 10 && PRECIOPRODUCTO == 5) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/D5-10/3.JPG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        } else if (conver == 5 && PRECIOPRODUCTO == 5 && auxiliar == 1) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/D5-5L/3.PNG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }

        if (conver == 10 && PRECIOPRODUCTO == 5 && auxiliar == 1) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/D5-10L/2.PNG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (conver == 20 && PRECIOPRODUCTO == 5) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/D20-5L/6.PNG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (conver == 20 && PRECIOPRODUCTO == 5 && auxiliar == 1) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/D20-5L/3.PNG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (conver == 50 && PRECIOPRODUCTO == 5) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/D50-5L/3.PNG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (conver == 50 && PRECIOPRODUCTO == 5 && auxiliar == 1) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/D50-5L/5.PNG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (sumatoriamonedas == 3 && conver == 5) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D8/3.JPG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        } else if (PRECIOPRODUCTO == 10 && sumatoria == 10 && conver == 5) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/D8/D85.JPG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        } else if (PRECIOPRODUCTO == 8 && conver == 10) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/D8/D810,3.JPG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (PRECIOPRODUCTO == 9 && conver != 20 && conver != 50) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/3.JPG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        } else if (PRECIOPRODUCTO == 9 && conver == 20) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/D10/3.JPG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        } else if (PRECIOPRODUCTO == 9 && conver == 50) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide76.JPG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        } else if (PRECIOPRODUCTO == 12 && sumatoria == 12 && sumatoriamonedas != 5) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide85.JPG"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (PRECIOPRODUCTO == 12 && sumatoria == 15 && conver == 5) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide87.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);

        }
        if (PRECIOPRODUCTO == 12 && conver == 50) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide96.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);

        }
        if (PRECIOPRODUCTO == 10 && sumatoriamonedas == 5 && conver == 5) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide98.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);

        }
        if (PRECIOPRODUCTO == 10 && conver == 5 && sumatoria == 10) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide101.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);

        }
        if (PRECIOPRODUCTO == 10 && conver == 20) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide104.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }

        if (PRECIOPRODUCTO == 10 && conver == 50) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide106.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }

        if (PRECIOPRODUCTO == 15 && sumatoriamonedas == 5 && sumatoria == 15) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide109.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);

        }

        if (PRECIOPRODUCTO == 15 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 15 && PRECIOPRODUCTO != 5) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide114.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);

        }
        if (PRECIOPRODUCTO == 15 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 15 && contando == 3) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide117.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);

        }
        if (PRECIOPRODUCTO == 15 && conver == 20) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide119.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }

        if (PRECIOPRODUCTO == 15 && conver == 50) {

            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide121.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (PRECIOPRODUCTO == 20 && sumatoriamonedas == 4 || sumatoriamonedas == 5 && PRECIOPRODUCTO != 5 && PRECIOPRODUCTO != 10) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide124.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (PRECIOPRODUCTO == 10 && sumatoriamonedas == 5 && sumatoria == 10) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide98.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (PRECIOPRODUCTO == 20 && sumatoriamonedas == 0 && conver == 5 && sumatoria == 20 && prod != 4) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide129.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }

        if (PRECIOPRODUCTO == 20 && prod == 4) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide132.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);
        }
        if (PRECIOPRODUCTO == 20 && conver == 20) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide134.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);

        }
        if (PRECIOPRODUCTO == 20 && conver == 50) {
            ImageIcon automataa = new ImageIcon(getClass().getResource("/D9/Slide139.jpg"));
            automataa = new ImageIcon(automataa.getImage().getScaledInstance(AUTOMATA.getWidth(), AUTOMATA.getHeight(), Image.SCALE_AREA_AVERAGING));
            AUTOMATA.setIcon(automataa);

        }

        MENSAJES.setText("SU CAMBIO ES >>>> " + (sumatoria - PRECIOPRODUCTO));

    }//GEN-LAST:event_jButton2ActionPerformed

    private void PROD9UMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD9UMousePressed
        INDENTIFICADORPRODUCTO = 9;
        TOTALPROD9 = 5;
        PRECIOPRODUCTO = 5;
        auxiliar = 1;
// TODO add your handling code here:

        MENSAJES.setText("HAS SELECCIONADO MAJIN BOO ".trim());
    }//GEN-LAST:event_PROD9UMousePressed

    private void PROD8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PROD8MousePressed

    private void PROD7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD7MousePressed
        INDENTIFICADORPRODUCTO = 7;
        TOTALPROD7 = 5;
        PRECIOPRODUCTO = 35;
        MENSAJES.setText("HAS SELECCIONADO SHENLOG ".trim());// TODO add your handling code here:
    }//GEN-LAST:event_PROD7MousePressed

    private void PROD6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD6MousePressed
        INDENTIFICADORPRODUCTO = 6;
        TOTALPROD6 = 5;
        PRECIOPRODUCTO = 25;
        MENSAJES.setText("HAS SELECCIONADO GOKU SUPER SAYAJIN ".trim());// TODO add your handling code here:
    }//GEN-LAST:event_PROD6MousePressed

    private void PROD5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD5MousePressed
        INDENTIFICADORPRODUCTO = 5;
        TOTALPROD5 = 5;
        PRECIOPRODUCTO = 25;
        MENSAJES.setText("HAS SELECCIONADO AL MAESTRO KARIN ".trim());// TODO add your handling code here:

    }//GEN-LAST:event_PROD5MousePressed

    private void PROD4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD4MousePressed
        INDENTIFICADORPRODUCTO = 4;
        TOTALPROD4 = 5;
        PRECIOPRODUCTO = 15;
        MENSAJES.setText("HAS SELECCIONADO A PICCOLO".trim());// TODO add your handling code here:

    }//GEN-LAST:event_PROD4MousePressed

    private void PROD3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD3MousePressed
        INDENTIFICADORPRODUCTO = 3;
        TOTALPROD3 = 5;
        PRECIOPRODUCTO = 15;
        MENSAJES.setText("HAS SELECCIONADO A GOHAN ".trim());// TODO add your handling code here:
    }//GEN-LAST:event_PROD3MousePressed

    private void PRODMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRODMousePressed
        INDENTIFICADORPRODUCTO = 1;
        TOTALPROD1 = 5;
        PRECIOPRODUCTO = 5;
        MENSAJES.setText("HAS SELECCIONADO MISTER SATAN ".trim());
    }//GEN-LAST:event_PRODMousePressed

    private void PRODMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRODMouseClicked


    }//GEN-LAST:event_PRODMouseClicked

    private void PROD2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD2MousePressed
        INDENTIFICADORPRODUCTO = 2;
        TOTALPROD2 = 5;
        PRECIOPRODUCTO = 5;
        MENSAJES.setText("HAS SELECCIONADO GOTEN ".trim());// TODO add your handling code here:
    }//GEN-LAST:event_PROD2MousePressed

    private void PROD8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD8MouseClicked
        INDENTIFICADORPRODUCTO = 8;
        TOTALPROD8 = 5;
        PRECIOPRODUCTO = 35;
        MENSAJES.setText("HAS SELECCIONADO TRUNKS ".trim()); // TODO add your handling code here:
    }//GEN-LAST:event_PROD8MouseClicked

    private void PROD9UMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD9UMouseClicked
        INDENTIFICADORPRODUCTO = 9;
        TOTALPROD9 = 5;
        PRECIOPRODUCTO = 35;
        MENSAJES.setText("HAS SELECCIONADO MAJIN BOO ".trim());
    }//GEN-LAST:event_PROD9UMouseClicked

    private void PROD10UMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD10UMouseClicked
        INDENTIFICADORPRODUCTO = 10;
        TOTALPROD10 = 5;
        PRECIOPRODUCTO = 45;
        MENSAJES.setText("HAS SELECCIONADO VEGUETA ".trim()); // TODO add your handling code here:
    }//GEN-LAST:event_PROD10UMouseClicked

    private void PROD10UMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD10UMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PROD10UMousePressed

    private void PROD11UMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD11UMouseClicked
        INDENTIFICADORPRODUCTO = 11;
        TOTALPROD11 = 5;
        PRECIOPRODUCTO = 45;
        MENSAJES.setText("HAS SELECCIONADO FREEZER ".trim()); // TODO add your handling code here:
    }//GEN-LAST:event_PROD11UMouseClicked

    private void PROD11UMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD11UMousePressed
        INDENTIFICADORPRODUCTO = 11;
        TOTALPROD11 = 5;
        PRECIOPRODUCTO = 45;
        MENSAJES.setText("HAS SELECCIONADO FREEZER ".trim());// TODO add your handling code here:
    }//GEN-LAST:event_PROD11UMousePressed

    private void PROD12UMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD12UMouseClicked
        INDENTIFICADORPRODUCTO = 12;
        TOTALPROD12 = 5;
        PRECIOPRODUCTO = 45;
        MENSAJES.setText("HAS SELECCIONADO GOKU ".trim());   // TODO add your handling code here:
    }//GEN-LAST:event_PROD12UMouseClicked

    private void PROD12UMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROD12UMousePressed
        INDENTIFICADORPRODUCTO = 12;
        TOTALPROD12 = 5;
        PRECIOPRODUCTO = 45;
        MENSAJES.setText("HAS SELECCIONADO GOKU ".trim());   // TODO add your handling code here:
    }//GEN-LAST:event_PROD12UMousePressed

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
            java.util.logging.Logger.getLogger(PRODUCTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRODUCTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRODUCTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRODUCTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PRODUCTOS().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ANUNCIOS;
    private javax.swing.JLabel AUTOMATA;
    public static javax.swing.JLabel EFECTIVO;
    private static javax.swing.JLabel ENTREGAPRODUCTO;
    private javax.swing.JButton INGRESAR;
    private javax.swing.JTextArea MENSAJES;
    private javax.swing.JLabel MONEDA;
    protected static javax.swing.JComboBox<String> PRECIOS;
    public javax.swing.JLabel PROD;
    private javax.swing.JLabel PROD10U;
    private javax.swing.JLabel PROD11U;
    private javax.swing.JLabel PROD12U;
    private javax.swing.JLabel PROD2;
    private javax.swing.JLabel PROD3;
    private javax.swing.JLabel PROD4;
    private javax.swing.JLabel PROD5;
    private javax.swing.JLabel PROD6;
    private javax.swing.JLabel PROD7;
    private javax.swing.JLabel PROD8;
    private javax.swing.JLabel PROD9U;
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q11;
    private javax.swing.JLabel Q13;
    private javax.swing.JLabel Q14;
    private javax.swing.JLabel Q15;
    private javax.swing.JLabel Q16;
    private javax.swing.JLabel Q17;
    private javax.swing.JLabel Q18;
    private javax.swing.JLabel Q19;
    private javax.swing.JLabel Q20;
    private javax.swing.JLabel Q21;
    private javax.swing.JLabel Q5;
    private javax.swing.JLabel espejo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel precio10;
    private javax.swing.JLabel precio11;
    private javax.swing.JLabel precio12;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel precio4;
    private javax.swing.JLabel precio5;
    private javax.swing.JLabel precio6;
    private javax.swing.JLabel precio7;
    private javax.swing.JLabel precio8;
    private javax.swing.JLabel precio9;
    // End of variables declaration//GEN-END:variables
}
