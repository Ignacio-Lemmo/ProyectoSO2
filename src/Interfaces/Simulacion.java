package Interfaces;

import ProyectoSO2.CSVEL;
import ProyectoSO2.Main;
import javax.swing.JOptionPane;

public class Simulacion extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Simulacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        prioridad1 = new javax.swing.JLabel();
        ID1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cola11 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cola21 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        cola31 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        cola32 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        prioridad2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ID2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        cola12 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        cola22 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        mercado1 = new javax.swing.JLabel();
        desechados1 = new javax.swing.JLabel();
        mercado2 = new javax.swing.JLabel();
        desechados2 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        combates = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        copas1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        copas2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        estadoAI = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        evento = new javax.swing.JLabel();
        ver = new javax.swing.JButton();
        refuerzo1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        refuerzo = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        refuerzo2 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Planta1:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Tel??fonos lanzados al mercado:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Tel??fonos desechados:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Nuevo tel??fono creado:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("ID:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Prioridad:");

        prioridad1.setBackground(new java.awt.Color(255, 255, 255));
        prioridad1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        prioridad1.setText("0");

        ID1.setBackground(new java.awt.Color(255, 255, 255));
        ID1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ID1.setText("0");

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        cola11.setEditable(false);
        cola11.setColumns(1);
        cola11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(cola11);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Colas:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Prioridad 1:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Prioridad 2:");

        jScrollPane2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        cola21.setEditable(false);
        cola21.setColumns(1);
        cola21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cola21.setRows(5);
        jScrollPane2.setViewportView(cola21);

        jScrollPane3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        cola31.setEditable(false);
        cola31.setColumns(1);
        cola31.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cola31.setRows(5);
        jScrollPane3.setViewportView(cola31);

        jScrollPane4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        cola32.setEditable(false);
        cola32.setColumns(1);
        cola32.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cola32.setRows(5);
        jScrollPane4.setViewportView(cola32);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Prioridad:");

        prioridad2.setBackground(new java.awt.Color(255, 255, 255));
        prioridad2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        prioridad2.setText("0");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Prioridad 3:");

        ID2.setBackground(new java.awt.Color(255, 255, 255));
        ID2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ID2.setText("0");

        jScrollPane5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        cola12.setEditable(false);
        cola12.setColumns(1);
        cola12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cola12.setRows(5);
        jScrollPane5.setViewportView(cola12);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Colas:");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("Planta2:");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Prioridad 1:");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Tel??fonos lanzados al mercado:");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Prioridad 2:");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Tel??fonos desechados:");

        jScrollPane6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        cola22.setEditable(false);
        cola22.setColumns(1);
        cola22.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cola22.setRows(5);
        jScrollPane6.setViewportView(cola22);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Nuevo tel??fono creado:");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("ID:");

        mercado1.setBackground(new java.awt.Color(255, 255, 255));
        mercado1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mercado1.setText("0");

        desechados1.setBackground(new java.awt.Color(255, 255, 255));
        desechados1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        desechados1.setText("0");

        mercado2.setBackground(new java.awt.Color(255, 255, 255));
        mercado2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mercado2.setText("0");

        desechados2.setBackground(new java.awt.Color(255, 255, 255));
        desechados2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        desechados2.setText("0");

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        guardar.setText("Guardar Data");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        combates.setBackground(new java.awt.Color(255, 255, 255));
        combates.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        combates.setText("Ver Combates");
        combates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combatesActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 48)); // NOI18N
        jLabel22.setText("Sony Simulaci??n");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Copas:");

        copas1.setBackground(new java.awt.Color(255, 255, 255));
        copas1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        copas1.setText("0");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setText("Copas:");

        copas2.setBackground(new java.awt.Color(255, 255, 255));
        copas2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        copas2.setText("0");

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setText("Prioridad 3:");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Estado IA:");

        estadoAI.setBackground(new java.awt.Color(255, 255, 255));
        estadoAI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        estadoAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadoAI.setText("Esperando");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Evento:");

        evento.setBackground(new java.awt.Color(255, 255, 255));
        evento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        evento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        evento.setText("Esperando");

        ver.setBackground(new java.awt.Color(255, 255, 255));
        ver.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ver.setText("Ver Data");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });

        refuerzo1.setBackground(new java.awt.Color(255, 255, 255));
        refuerzo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refuerzo1.setText("Refuerzo:");

        jScrollPane8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        refuerzo.setEditable(false);
        refuerzo.setColumns(1);
        refuerzo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        refuerzo.setRows(5);
        jScrollPane8.setViewportView(refuerzo);

        jScrollPane9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        refuerzo2.setEditable(false);
        refuerzo2.setColumns(1);
        refuerzo2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        refuerzo2.setRows(5);
        jScrollPane9.setViewportView(refuerzo2);

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setText("Refuerzo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(400, 400, 400)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(mercado1)
                        .addGap(242, 242, 242)
                        .addComponent(jLabel16)
                        .addGap(6, 6, 6)
                        .addComponent(mercado2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(desechados1)
                        .addGap(242, 242, 242)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(desechados2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(314, 314, 314)
                        .addComponent(jLabel19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(359, 359, 359)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(prioridad1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(359, 359, 359)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(prioridad2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(copas1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(359, 359, 359)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(copas2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(380, 380, 380)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(refuerzo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(combates)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoAI, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evento, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(mercado1)
                    .addComponent(jLabel16)
                    .addComponent(mercado2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(desechados1)
                    .addComponent(jLabel18)
                    .addComponent(desechados2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel19))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ID1)
                    .addComponent(jLabel20)
                    .addComponent(ID2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(prioridad1)
                    .addComponent(jLabel11)
                    .addComponent(prioridad2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(copas1)
                    .addComponent(jLabel23)
                    .addComponent(copas2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(refuerzo1)
                    .addComponent(jLabel12)
                    .addComponent(jLabel27))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(combates))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(6, 6, 6)
                        .addComponent(estadoAI))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(6, 6, 6)
                        .addComponent(evento))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ver)
                        .addGap(6, 6, 6)
                        .addComponent(guardar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combatesActionPerformed
        Main.combates.setVisible(true);
    }//GEN-LAST:event_combatesActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if(Main.mercado1 != 0 || Main.mercado2 != 0){
            CSVEL.GuardarHistorico(String.valueOf(Main.mercado1), String.valueOf(Main.mercado2));
            Main.mercado1 = 0;
            Main.mercado2 = 0;
            JOptionPane.showMessageDialog(null, "Data guardada exitosamente.");
        }else{
            JOptionPane.showMessageDialog(null, "No hay data nueva para guardar.");
        } 
    }//GEN-LAST:event_guardarActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        Data data = new Data();
        data.setLocationRelativeTo(null);
        data.setVisible(true);
    }//GEN-LAST:event_verActionPerformed

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
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static volatile javax.swing.JLabel ID1;
    public static volatile javax.swing.JLabel ID2;
    public static volatile javax.swing.JTextArea cola11;
    public static volatile javax.swing.JTextArea cola12;
    public static volatile javax.swing.JTextArea cola21;
    public static volatile javax.swing.JTextArea cola22;
    public static volatile javax.swing.JTextArea cola31;
    public static volatile javax.swing.JTextArea cola32;
    private javax.swing.JButton combates;
    public static volatile javax.swing.JLabel copas1;
    public static volatile javax.swing.JLabel copas2;
    public static volatile javax.swing.JLabel desechados1;
    public static volatile javax.swing.JLabel desechados2;
    public static volatile javax.swing.JLabel estadoAI;
    public static volatile javax.swing.JLabel evento;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public static volatile javax.swing.JLabel mercado1;
    public static volatile javax.swing.JLabel mercado2;
    public static volatile javax.swing.JLabel prioridad1;
    public static volatile javax.swing.JLabel prioridad2;
    public static volatile javax.swing.JTextArea refuerzo;
    private javax.swing.JLabel refuerzo1;
    public static volatile javax.swing.JTextArea refuerzo2;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables
}
