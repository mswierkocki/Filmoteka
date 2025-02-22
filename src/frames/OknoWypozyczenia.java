/**
 *
 * @author Marcin Świerkocki
 */
 
public class OknoWypozyczenia extends javax.swing.JPanel {

    GlowneOkno parent;
    private int idFilmu;

    public static final String PROP_IDFILMU = "idFilmu";

    /**
     * Get the value of idFilmu
     *
     * @return the value of idFilmu
     */
    public int getIdFilmu() {
        return idFilmu;
    }

    /**
     * Set the value of idFilmu
     *
     * @param idFilmu new value of idFilmu
     */
    public void setIdFilmu(int idFilmu) {
        int oldIdFilmu = this.idFilmu;
        this.idFilmu = idFilmu;
        firePropertyChange(PROP_IDFILMU, oldIdFilmu, idFilmu);
    }

    private String idKlienta;

    public static final String PROP_IDKLIENTA = "idKlienta";

    /**
     * Get the value of idKlienta
     *
     * @return the value of idKlienta
     */
    public String getIdKlienta() {
        return idKlienta;
    }

    /**
     * Set the value of idKlienta
     *
     * @param idKlienta new value of idKlienta
     */
    public void setIdKlienta(String idKlienta) {
        String oldIdKlienta = this.idKlienta;
        this.idKlienta = idKlienta;
        firePropertyChange(PROP_IDKLIENTA, oldIdKlienta, idKlienta);
    }

    /**
     * Creates new form OknoWypozyczenia
     */
    public OknoWypozyczenia(GlowneOkno p) {
        this.parent = p;
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Id Filmu");

        jLabel2.setText("Id Klienta");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 ", "2", "3 ", "5" }));
        jComboBox1.setSelectedIndex(2);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${ileDni}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jButton1.setText("Wypożycz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Na ile dni");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${idFilmu}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${idKlienta}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setText("Wróć");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(15, 15, 15)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2))))
                .addContainerGap(298, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Statement statement = null;
        ResultSet rs = null;
        String sql,tmp=null;
        
                    
        if(jTextField1.getText().isEmpty()||jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pola id nie moga być puste!", "Blad", 1);
            } else try{
                statement = parent.getPolaczenie().getConnection().createStatement();
                
                try{
                    sql = " SELECT nazwa from Klienci where uid = "+idKlienta;
                    rs = statement.executeQuery(sql);
                   rs.next();
                    
                   tmp = rs.getString("nazwa");
                    //System.out.print(rs.getRow());
                    if(tmp!=null){
                         sql = " SELECT currentCount from Magazyn where filmid = "+idFilmu;
                    //    
                        //System.out.println(sql);
                        rs = statement.executeQuery(sql);
                        rs.next();
                        int CC = rs.getInt("CurrentCount");
                        if(CC>0){
                        
                       // sql = "Insert Into Filmy values (default,'"+film.getTytul()+"','"+film.getOpis()+"','"+film.getZdjecie()+"','"+film.getTyp().getId()+"');";
                        //sql = "Insert Into Zamowienia values (default,"+idKlienta+","+idFilmu+","+java.sql.Date()+","+"asd"+",0);";
                        sql = " insert into Zamowienia(uid,klient,filmy,odKiedy,doKiedy,zwrocone)"
                                + "Values(0,?,?,?,?,?);";
                        PreparedStatement ps = null;
                        ps = parent.getPolaczenie().getConnection().prepareStatement(sql);
                        //ps.setNull(1, Types.NULL);
                        ps.setString(1, idKlienta);
                        ps.setString(2, String.valueOf(idFilmu));
                        ps.setDate(3, new java.sql.Date((new Date(System.currentTimeMillis())).getTime()));
                        
                        ps.setDate(4, new java.sql.Date((new Date(System.currentTimeMillis())).getTime()+(999 * 60 * 60 * Integer.valueOf(ileDni.charAt(0)))));
                        ps.setBoolean(5, false);
                       
                        sql = "Update Magazyn SET currentCount = "+String.valueOf(CC-1)+" Where uid = "+idFilmu ;
                        ps.executeUpdate();
                        statement.executeUpdate(sql);
                            JOptionPane.showMessageDialog(this, "Wypozyczone!", "OK", 0);
                        }
                        else
                            JOptionPane.showMessageDialog(this, "Nie ma filmu w magazynie o id="+idFilmu, "Blad", 1);
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Nie ma klienta o id="+idKlienta, "Blad", 1);
               
                }catch (SQLException ex) {
                    System.out.println(ex.getLocalizedMessage());
                }
            } catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }        // TODO add your handling code here:
            
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private String ileDni;
    
    public static final String PROP_ILEDNI = "ileDni";

    /**
     * Get the value of ileDni
     *
     * @return the value of ileDni
     */
    public String getIleDni() {
        return ileDni;
    }

    /**
     * Set the value of ileDni
     *
     * @param ileDni new value of ileDni
     */
    public void setIleDni(String ileDni) {
        String oldIleDni = this.ileDni;
        this.ileDni = ileDni;
        firePropertyChange(PROP_ILEDNI, oldIleDni, ileDni);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //parent.remove(this);
        this.getParent().remove(this);
        parent.przywrocGlowneOkno();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
