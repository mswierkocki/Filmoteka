/**
 *
 * @author Marcin Świerkocki
 */
 
public class Klient {
    
    private String nazwa;

    public static final String PROP_NAZWA = "nazwa";

    /**
     * Get the value of nazwa
     *
     * @return the value of nazwa
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * Set the value of nazwa
     *
     * @param nazwa new value of nazwa
     */
    public void setNazwa(String nazwa) {
        String oldNazwa = this.nazwa;
        this.nazwa = nazwa;
        propertyChangeSupport.firePropertyChange(PROP_NAZWA, oldNazwa, nazwa);
    }

    private String Dane;

    public static final String PROP_DANE = "Dane";

    /**
     * Get the value of Dane
     *
     * @return the value of Dane
     */
    public String getDane() {
        return Dane;
    }

    /**
     * Set the value of Dane
     *
     * @param Dane new value of Dane
     */
    public void setDane(String Dane) {
        String oldDane = this.Dane;
        this.Dane = Dane;
        propertyChangeSupport.firePropertyChange(PROP_DANE, oldDane, Dane);
    }

    public Klient() {
    }

    @Override
    public String toString() {
        return "Klient{" + "nazwa=" + nazwa + ", Dane=" + Dane + ", id=" + id + '}';
    }

    public Klient(int id,String nazwa, String Dane) {
        this.nazwa = nazwa;
        this.Dane = Dane;
        this.id = id;
    }

    private int id;

    public static final String PROP_ID = "id";

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        int oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldId, id);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
