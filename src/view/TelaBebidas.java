package view;

import interfac.Att;
import classes.Drink;

/**
 *
 * @author Bruno Henrique <bhenriquecg@gmail.com>
 * <161080391>
 */
public class TelaBebidas extends javax.swing.JFrame implements Att{

    /**
     * Creates new form TelaBebidas
     */
    public TelaBebidas() {
        initComponents();
    }
    int valor,valoruva,valorcaja,valorlaranja,valorcoca,valorfantauva,valorsprite,valorwhisky,valorcerveja,valorvinho,valoragua;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        caja = new javax.swing.JCheckBox();
        agua = new javax.swing.JCheckBox();
        coca = new javax.swing.JCheckBox();
        fanta = new javax.swing.JCheckBox();
        vinho = new javax.swing.JCheckBox();
        laranja = new javax.swing.JCheckBox();
        cerveja = new javax.swing.JCheckBox();
        sprite = new javax.swing.JCheckBox();
        whisky = new javax.swing.JCheckBox();
        uva = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        spincaja = new javax.swing.JSpinner();
        spinuva = new javax.swing.JSpinner();
        spinlaranja = new javax.swing.JSpinner();
        spincoca = new javax.swing.JSpinner();
        spinfantauva = new javax.swing.JSpinner();
        spinsprite = new javax.swing.JSpinner();
        spinwhisky = new javax.swing.JSpinner();
        spincerveja = new javax.swing.JSpinner();
        spinvinho = new javax.swing.JSpinner();
        spinagua = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        valortotal = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bebidas");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        caja.setText("Suco de cajá");
        caja.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cajaItemStateChanged(evt);
            }
        });

        agua.setText("Água");
        agua.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aguaItemStateChanged(evt);
            }
        });

        coca.setText("Coca-cola");
        coca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cocaItemStateChanged(evt);
            }
        });

        fanta.setText("Fanta uva");
        fanta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fantaItemStateChanged(evt);
            }
        });

        vinho.setText("Vinho");
        vinho.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                vinhoItemStateChanged(evt);
            }
        });

        laranja.setText("Suco de laranja");
        laranja.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                laranjaItemStateChanged(evt);
            }
        });

        cerveja.setText("Cerveja");
        cerveja.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cervejaItemStateChanged(evt);
            }
        });

        sprite.setText("Sprite");
        sprite.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                spriteItemStateChanged(evt);
            }
        });

        whisky.setText("Whisky ");
        whisky.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                whiskyItemStateChanged(evt);
            }
        });

        uva.setText("Suco de uva");
        uva.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                uvaItemStateChanged(evt);
            }
        });

        jLabel2.setText("R$ 5.00");

        jLabel3.setText("R$ 5.00");

        jLabel4.setText("R$ 5.00");

        jLabel5.setText("R$ 8.00");

        jLabel6.setText("R$ 7.00");

        jLabel7.setText("R$ 7.00");

        jLabel8.setText("R$ 150.00");

        jLabel9.setText("R$ 5.00");

        jLabel10.setText("R$ 120.00");

        jLabel11.setText("R$ 4.00");

        spincaja.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spincaja.setEnabled(false);
        spincaja.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spincajaStateChanged(evt);
            }
        });

        spinuva.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spinuva.setEnabled(false);
        spinuva.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinuvaStateChanged(evt);
            }
        });

        spinlaranja.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spinlaranja.setEnabled(false);
        spinlaranja.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinlaranjaStateChanged(evt);
            }
        });

        spincoca.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spincoca.setEnabled(false);
        spincoca.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spincocaStateChanged(evt);
            }
        });

        spinfantauva.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spinfantauva.setEnabled(false);
        spinfantauva.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinfantauvaStateChanged(evt);
            }
        });

        spinsprite.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spinsprite.setEnabled(false);
        spinsprite.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinspriteStateChanged(evt);
            }
        });

        spinwhisky.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spinwhisky.setEnabled(false);
        spinwhisky.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinwhiskyStateChanged(evt);
            }
        });

        spincerveja.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spincerveja.setEnabled(false);
        spincerveja.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spincervejaStateChanged(evt);
            }
        });

        spinvinho.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spinvinho.setEnabled(false);

        spinagua.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spinagua.setEnabled(false);

        jLabel12.setText("Quant.");

        jLabel13.setText("Valor unid.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(laranja)
                            .addComponent(coca)
                            .addComponent(fanta)
                            .addComponent(sprite)
                            .addComponent(whisky)
                            .addComponent(cerveja)
                            .addComponent(vinho)
                            .addComponent(agua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(spincerveja)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(spinwhisky)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(spinsprite)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(spinfantauva)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(spincoca)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(spinlaranja)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spinagua)
                                    .addComponent(spinvinho))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(uva)
                                    .addGap(18, 18, 18)
                                    .addComponent(spinuva))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(caja)
                                    .addGap(18, 18, 18)
                                    .addComponent(spincaja, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uva)
                    .addComponent(spinuva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja)
                    .addComponent(spincaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laranja)
                    .addComponent(jLabel4)
                    .addComponent(spinlaranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coca)
                    .addComponent(jLabel5)
                    .addComponent(spincoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fanta)
                    .addComponent(jLabel6)
                    .addComponent(spinfantauva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sprite)
                    .addComponent(jLabel7)
                    .addComponent(spinsprite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whisky)
                    .addComponent(jLabel8)
                    .addComponent(spinwhisky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cerveja)
                    .addComponent(jLabel9)
                    .addComponent(spincerveja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vinho)
                    .addComponent(jLabel10)
                    .addComponent(spinvinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agua)
                    .addComponent(jLabel11)
                    .addComponent(spinagua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("bebidas");
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 10, 100, 30);

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok-icon.png"))); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor total"));

        valortotal.setEditable(false);
        valortotal.setText("0.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(valortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(valortotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(ok)
                        .addGap(51, 51, 51)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ok)
                    .addComponent(jButton1))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        Drink d = new Drink();
        TelaEscolhaRestaurante res = new TelaEscolhaRestaurante();
        d.setValorBebida(valor);
        res.Bebidas(d);
        this.dispose();
        
    }//GEN-LAST:event_okActionPerformed

    private void vinhoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vinhoItemStateChanged
        Vinho();
        atualizar();
    }//GEN-LAST:event_vinhoItemStateChanged

    private void cervejaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cervejaItemStateChanged
        Cerveja();
        atualizar();
    }//GEN-LAST:event_cervejaItemStateChanged

    private void aguaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aguaItemStateChanged
        Agua();
        atualizar();
    }//GEN-LAST:event_aguaItemStateChanged

    private void spriteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_spriteItemStateChanged
        Sprite();
        atualizar();
    }//GEN-LAST:event_spriteItemStateChanged

    private void whiskyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_whiskyItemStateChanged
        Whisky();
        atualizar();
    }//GEN-LAST:event_whiskyItemStateChanged

    private void cocaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cocaItemStateChanged
        Coca();
        atualizar();
    }//GEN-LAST:event_cocaItemStateChanged

    private void fantaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fantaItemStateChanged
        Fanta();
        atualizar();
    }//GEN-LAST:event_fantaItemStateChanged

    private void laranjaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_laranjaItemStateChanged
        Laranja();
        atualizar();
    }//GEN-LAST:event_laranjaItemStateChanged

    private void cajaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cajaItemStateChanged
        Caja();
        atualizar();
    }//GEN-LAST:event_cajaItemStateChanged

    private void uvaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_uvaItemStateChanged
        Uva();
        atualizar();
    }//GEN-LAST:event_uvaItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void spinuvaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinuvaStateChanged
         int x = (int)spinuva.getValue();
            valoruva =5*x;
            atualizar();
    }//GEN-LAST:event_spinuvaStateChanged

    private void spincajaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spincajaStateChanged
        int x = (int)spincaja.getValue();    
        valorcaja = 5*x;
        atualizar();
    }//GEN-LAST:event_spincajaStateChanged

    private void spinlaranjaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinlaranjaStateChanged
        int x = (int)spinlaranja.getValue();
            valorlaranja =5*x;
            atualizar();
    }//GEN-LAST:event_spinlaranjaStateChanged

    private void spincocaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spincocaStateChanged
        int x = (int)spincoca.getValue();
            valorcoca =8*x;
            atualizar();
    }//GEN-LAST:event_spincocaStateChanged

    private void spinfantauvaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinfantauvaStateChanged
        int x = (int)spinfantauva.getValue();
            valorfantauva =7*x;
            atualizar();
    }//GEN-LAST:event_spinfantauvaStateChanged

    private void spinspriteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinspriteStateChanged
        int x = (int)spinsprite.getValue();
            valorsprite =7*x;
            atualizar();
    }//GEN-LAST:event_spinspriteStateChanged

    private void spinwhiskyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinwhiskyStateChanged
        int x = (int)spinwhisky.getValue();
            valorwhisky =150*x;
            atualizar();
    }//GEN-LAST:event_spinwhiskyStateChanged

    private void spincervejaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spincervejaStateChanged
        int x = (int)spincerveja.getValue();
            valorcerveja =5*x;
            atualizar();
    }//GEN-LAST:event_spincervejaStateChanged
    public void atualizar() {
        valor = valoruva+valorcaja+valorlaranja+valorcoca+valorfantauva+valorsprite+valorwhisky+valorcerveja+valorvinho+valoragua;
        valortotal.setText(String.valueOf(valor));

    }
    public void Uva(){
        if(uva.isSelected()){
            spinuva.setEnabled(true);
        }else{
            spinuva.setEnabled(false);
            valoruva=0;
        }
    }
public void Caja(){
        if(caja.isSelected()){
              spincaja.setEnabled(true);
        }else{
            spincaja.setEnabled(false);
            valorcaja=0;
        }
    }
public void Laranja(){
        if(laranja.isSelected()){
              spinlaranja.setEnabled(true);
        }else{
            spinlaranja.setEnabled(false);
            valorlaranja=0;
        }
    }
public void Coca(){
        if(coca.isSelected()){
              spincoca.setEnabled(true);
        }else{
            spincoca.setEnabled(false);
            valorcoca=0;
        }
    }
public void Fanta(){
        if(fanta.isSelected()){
              spinfantauva.setEnabled(true);
        }else{
            spinfantauva.setEnabled(false);
            valorfantauva=0;
        }
    }
public void Sprite(){
        if(sprite.isSelected()){
             spinsprite.setEnabled(true);
        }else{
            spinsprite.setEnabled(false);
            valorsprite=0;
        }
    }
public void Whisky(){
        if(whisky.isSelected()){
              spinwhisky.setEnabled(true);
        }else{
            spinwhisky.setEnabled(false);
            valorwhisky=0;
        }
    }
public void Cerveja(){
        if(cerveja.isSelected()){
             spincerveja.setEnabled(true);
        }else{
             spincerveja.setEnabled(false);
            valorcerveja=0;
        }
    }
public void Vinho(){
        if(vinho.isSelected()){
              spinvinho.setEnabled(true);
        }else{
            valorvinho=0;
            spinvinho.setEnabled(false);
        }
    }
public void Agua(){
        if(agua.isSelected()){
              spinagua.setEnabled(true);
        }else{
            spinagua.setEnabled(false);
            valoragua=0;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agua;
    private javax.swing.JCheckBox caja;
    private javax.swing.JCheckBox cerveja;
    private javax.swing.JCheckBox coca;
    private javax.swing.JCheckBox fanta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox laranja;
    private javax.swing.JButton ok;
    private javax.swing.JSpinner spinagua;
    private javax.swing.JSpinner spincaja;
    private javax.swing.JSpinner spincerveja;
    private javax.swing.JSpinner spincoca;
    private javax.swing.JSpinner spinfantauva;
    private javax.swing.JSpinner spinlaranja;
    private javax.swing.JSpinner spinsprite;
    private javax.swing.JSpinner spinuva;
    private javax.swing.JSpinner spinvinho;
    private javax.swing.JSpinner spinwhisky;
    private javax.swing.JCheckBox sprite;
    private javax.swing.JCheckBox uva;
    private javax.swing.JFormattedTextField valortotal;
    private javax.swing.JCheckBox vinho;
    private javax.swing.JCheckBox whisky;
    // End of variables declaration//GEN-END:variables
}