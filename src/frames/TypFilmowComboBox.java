/**
 *
 * @author Marcin Świerkocki
 */
 
public class TypFilmowComboBox extends AbstractListModel implements ComboBoxModel {
  String[] ComputerComps = { "Monitor", "Key Board", "Mouse", "Joy Stick", "Modem", "CD ROM",
      "RAM Chip", "Diskette" };
    private ObservableList<TypFilmow> listaTypow = new ObservableCollections().observableList(new ArrayList<TypFilmow>());
    Map<Integer,String> example = new HashMap<Integer,String>();
    public static final String PROP_LISTATYPOW = "listaTypow";

    /**
     * Get the value of listaTypow
     *
     * @return the value of listaTypow
     */
    public ObservableList<TypFilmow> getListaTypow() {
        return listaTypow;
    }

    /**
     * Set the value of listaTypow
     *
     * @param listaTypow new value of listaTypow
     */
    public void setListaTypow(ObservableList<TypFilmow> listaTypow) {
        ObservableList oldListaTypow = this.listaTypow;
        this.listaTypow = listaTypow;
        propertyChangeSupport.firePropertyChange(PROP_LISTATYPOW, oldListaTypow, listaTypow);
    }
    
    

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public TypFilmowComboBox(GlowneOkno parent,int inx) {
       // LoadTypTask task = new LoadTypTask(listaTypow, parent.getPolaczenie().getConnection());
     //   task.execute();
        selection = listaTypow.get(inx);
        
    }

  TypFilmow selection = new TypFilmow(-1, "typ0");

  @Override
  public Object getElementAt(int index) {
    return listaTypow.get(index).toString();
  }

  @Override
  public int getSize() {
    return listaTypow.size();
  }

  @Override
  public void setSelectedItem(Object anItem) {
    selection = (TypFilmow) anItem; // to select and register an
  } // item from the pull-down list

  // Methods implemented from the interface ComboBoxModel
  @Override
  public Object getSelectedItem() {
    return selection; // to add the selection to the combo box
  }
  public TypFilmow getSelectedTyp(){
      return selection;
  }
}