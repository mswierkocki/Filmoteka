/**
 *
 * @author Marcin Świerkocki
 */
 
public class OknoZwrotu extends javax.swing.JPanel {
GlowneOkno parent;
    /**
     * Creates new form OknoZwrotu
     */
    public OknoZwrotu(GlowneOkno parent) {
        this.parent = parent;
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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("Fragment nazwy klienta");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${szukanaNazwa}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Szukaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Id Zamowienia");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${idZwrotu}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jButton2.setText("Zwroc");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Wróć");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextField1))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //parent.remove(this);
        this.getParent().remove(this);
        parent.przywrocGlowneOkno();
    }//GEN-LAST:event_jButton3ActionPerformed

    private String szukanaNazwa;

    public static final String PROP_SZUKANANAZWA = "szukanaNazwa";

    /**
     * Get the value of szukanaNazwa
     *
     * @return the value of szukanaNazwa
     */
    public String getSzukanaNazwa() {
        return szukanaNazwa;
    }

    /**
     * Set the value of szukanaNazwa
     *
     * @param szukanaNazwa new value of szukanaNazwa
     */
    public void setSzukanaNazwa(String szukanaNazwa) {
        String oldSzukanaNazwa = this.szukanaNazwa;
        this.szukanaNazwa = szukanaNazwa;
        firePropertyChange(PROP_SZUKANANAZWA, oldSzukanaNazwa, szukanaNazwa);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jTextArea1.setText("");
        Statement statement;
         try{
         
             statement = parent.getPolaczenie().getConnection().createStatement();
            String sql = "SELECT Klienci.nazwa, Filmy.tytul,`Zamowienia`.*\n" +
"FROM `Zamowienia`\n" +
" LEFT JOIN `gargelia_filmy`.`Klienci` ON `Zamowienia`.`klient` = `Klienci`.`uid` \n" +
" LEFT JOIN `gargelia_filmy`.`Filmy` ON `Zamowienia`.`filmy` = `Filmy`.`uid` \n" +
"WHERE (`Klienci`.`nazwa` like '"+szukanaNazwa+"%')\n" +
"        ";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
               String a = "Id zamowienia->"+String.valueOf(rs.getInt("uid"))+"Nazwa Klienta-> "+rs.getString("klienci.Nazwa")+"Tytułfilmu-> "+rs.getString("filmy.tytul")+"\n";
                jTextArea1.append(a);
                //jTextArea1.append(rs.getString(8));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Statement statement;
         try{
         
             statement = parent.getPolaczenie().getConnection().createStatement();
            String sql = "Select * From Zamowienia where uid="+idZwrotu.toString()+";";
            ResultSet rs = statement.executeQuery(sql);
            rs.next();
            if(rs.getBoolean("zwrocone"))
                JOptionPane.showMessageDialog(this, "Nie można zwrócić zwróconego zamówienia!", "Błąd!", 0);
            
            else {    
                if(rs.getDate("doKiedy").before(new java.util.Date()))
                JOptionPane.showMessageDialog(this, "Po terminie!", "Uwaga!", 1);
            sql = "Update Zamowienia SET zwrocone = 1 Where uid = "+idZwrotu.toString() ;
            
            String idFilmu = String.valueOf(rs.getInt("filmy"));
            statement.executeUpdate(sql);      
            //
            sql = " SELECT currentCount from Magazyn where filmid = "+idFilmu;
            rs = statement.executeQuery(sql);
            rs.next();
            int CC = rs.getInt("CurrentCount");
            sql = "Update Magazyn SET currentCount = "+String.valueOf(CC+1)+" Where uid = "+idFilmu ;
            statement.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(this, "Potwierdzam zwrócenie", "Zwrócono!", 1);
                    }
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private String idZwrotu;

    public static final String PROP_IDZWROTU = "idZwrotu";

    /**
     * Get the value of idZwrotu
     *
     * @return the value of idZwrotu
     */
    public String getIdZwrotu() {
        return idZwrotu;
    }

    /**
     * Set the value of idZwrotu
     *
     * @param idZwrotu new value of idZwrotu
     */
    public void setIdZwrotu(String idZwrotu) {
        String oldIdZwrotu = this.idZwrotu;
        this.idZwrotu = idZwrotu;
        firePropertyChange(PROP_IDZWROTU, oldIdZwrotu, idZwrotu);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
