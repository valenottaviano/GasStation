package programacion2.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import programacion2.db.PostgreSQL;
import programacion2.logic.Oil;


public class Menu extends javax.swing.JFrame {
    
    public ArrayList<Oil> oils;
    public PostgreSQL db;
    
    public Menu() {

        this.db = new PostgreSQL();
        this.oils = db.updateTanks();
        initComponents();
        setGraphValues();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lateralPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ventaBtn1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ventaBtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        registrosBtn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        updateBtn = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        chart_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(225, 225, 225));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lateralPanel.setBackground(new java.awt.Color(69, 123, 157));
        lateralPanel.setForeground(new java.awt.Color(69, 123, 157));

        jLabel1.setFont(new java.awt.Font("Source Sans Pro", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Principal");

        ventaBtn1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(69, 123, 157));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Carga Depósito");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventaBtn1Layout = new javax.swing.GroupLayout(ventaBtn1);
        ventaBtn1.setLayout(ventaBtn1Layout);
        ventaBtn1Layout.setHorizontalGroup(
            ventaBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );
        ventaBtn1Layout.setVerticalGroup(
            ventaBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        ventaBtn.setBackground(new java.awt.Color(255, 255, 255));
        ventaBtn.setAutoscrolls(true);
        ventaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ventaBtn.setPreferredSize(new java.awt.Dimension(149, 47));
        ventaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventaBtnMouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(69, 123, 157));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Carga Auto");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventaBtnLayout = new javax.swing.GroupLayout(ventaBtn);
        ventaBtn.setLayout(ventaBtnLayout);
        ventaBtnLayout.setHorizontalGroup(
            ventaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        ventaBtnLayout.setVerticalGroup(
            ventaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        registrosBtn.setBackground(new java.awt.Color(255, 255, 255));
        registrosBtn.setAutoscrolls(true);
        registrosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrosBtn.setPreferredSize(new java.awt.Dimension(149, 47));
        registrosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrosBtnMouseClicked(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(69, 123, 157));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ver Registros");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout registrosBtnLayout = new javax.swing.GroupLayout(registrosBtn);
        registrosBtn.setLayout(registrosBtnLayout);
        registrosBtnLayout.setHorizontalGroup(
            registrosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        registrosBtnLayout.setVerticalGroup(
            registrosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout lateralPanelLayout = new javax.swing.GroupLayout(lateralPanel);
        lateralPanel.setLayout(lateralPanelLayout);
        lateralPanelLayout.setHorizontalGroup(
            lateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lateralPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(lateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ventaBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lateralPanelLayout.createSequentialGroup()
                        .addGroup(lateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registrosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ventaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        lateralPanelLayout.setVerticalGroup(
            lateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lateralPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addComponent(registrosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ventaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ventaBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        bg.add(lateralPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 620));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateBtn.setBackground(new java.awt.Color(69, 123, 157));
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ACTUALIZAR");

        javax.swing.GroupLayout updateBtnLayout = new javax.swing.GroupLayout(updateBtn);
        updateBtn.setLayout(updateBtnLayout);
        updateBtnLayout.setHorizontalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        );
        updateBtnLayout.setVerticalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 15, -1, -1));

        chart_panel.setPreferredSize(new java.awt.Dimension(460, 420));

        javax.swing.GroupLayout chart_panelLayout = new javax.swing.GroupLayout(chart_panel);
        chart_panel.setLayout(chart_panelLayout);
        chart_panelLayout.setHorizontalGroup(
            chart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        chart_panelLayout.setVerticalGroup(
            chart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(chart_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 730, 400));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 850, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setGraphValues(){
        this.oils = this.db.updateTanks();
        graphBars(this.oils);
        repaint();
        pack();
    }
    
    private void graphBars(ArrayList<Oil> oils){
        ChartFactory.setChartTheme(StandardChartTheme.createLegacyTheme());
        this.chart_panel.removeAll();
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        for(Oil oil : oils){
            datos.setValue(oil.getAvailable()*100/10000, "Disponibilidad", oil.getOilId());
        }
        JFreeChart barChart = ChartFactory.createBarChart(
                "Disponibilidad de Combustible", 
                "Combustibles", "% en tanque", datos);
        
        ChartPanel barChartPanel = new ChartPanel(barChart);
        barChartPanel.setMouseWheelEnabled(true);
        barChartPanel.setPreferredSize(new Dimension(730,400));
        CategoryPlot plot = (CategoryPlot) barChart.getPlot();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setRange(0, 100);
        
        this.chart_panel.setLayout(new BorderLayout());
        this.chart_panel.add(barChartPanel, BorderLayout.NORTH);
    }
    
    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        setGraphValues();
    }//GEN-LAST:event_updateBtnMouseClicked

    private void ventaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventaBtnMouseClicked
    }//GEN-LAST:event_ventaBtnMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Venta v = new Venta();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Compra c = new Compra();
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Registros registros = new Registros();
        registros.setLocationRelativeTo(null);
        registros.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void registrosBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrosBtnMouseClicked
    }//GEN-LAST:event_registrosBtnMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel chart_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel lateralPanel;
    private javax.swing.JPanel registrosBtn;
    private javax.swing.JPanel updateBtn;
    private javax.swing.JPanel ventaBtn;
    private javax.swing.JPanel ventaBtn1;
    // End of variables declaration//GEN-END:variables
}
