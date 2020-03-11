/**
 *
 * @author Marcin Świerkocki
 */
 
public class Film {
   
    private String Opis;

    public Film() {
    }

    public static final String PROP_OPIS = "Opis";

    private String Zdjecie;

    public Film(String Opis, String Zdjecie, int ID, TypFilmow Typ, String Tytul) {
        this.Opis = Opis;
        this.Zdjecie = Zdjecie;
        this.ID = ID;
        this.Typ = Typ;
        this.Tytul = Tytul;
    }

    public static final String PROP_ZDJECIE = "Zdjecie";

    /**
     * Get the value of Zdjecie
     *
     * @return the value of Zdjecie
     */
    public String getZdjecie() {
        return Zdjecie;
    }

    /**
     * Set the value of Zdjecie
     *
     * @param Zdjecie new value of Zdjecie
     */
    public void setZdjecie(String Zdjecie) {
        String oldZdjecie = this.Zdjecie;
        this.Zdjecie = Zdjecie;
        propertyChangeSupport.firePropertyChange(PROP_ZDJECIE, oldZdjecie, Zdjecie);
    }

    private int ID;

    public static final String PROP_ID = "ID";

    /**
     * Get the value of ID
     *
     * @return the value of ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Set the value of ID
     *
     * @param ID new value of ID
     */
    public void setID(int ID) {
        int oldID = this.ID;
        this.ID = ID;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldID, ID);
    }

    private TypFilmow Typ = new TypFilmow(-1,"DontUseMe");

    public static final String PROP_TYP = "Typ";

    /**
     * Get the value of Typ
     *
     * @return the value of Typ
     */
    public TypFilmow getTyp() {
        return Typ;
    }

    /**
     * Set the value of Typ
     *
     * @param Typ new value of Typ
     */
    public void setTyp(TypFilmow Typ) {
        TypFilmow oldTyp = this.Typ;
        this.Typ = Typ;
        propertyChangeSupport.firePropertyChange(PROP_TYP, oldTyp, Typ);
    }

    /**
     * Get the value of Opis
     *
     * @return the value of Opis
     */
    public String getOpis() {
        return Opis;
    }

    /**
     * Set the value of Opis
     *
     * @param Opis new value of Opis
     */
    public void setOpis(String Opis) {
        String oldOpis = this.Opis;
        this.Opis = Opis;
        propertyChangeSupport.firePropertyChange(PROP_OPIS, oldOpis, Opis);
    }
 
    private String Tytul;

    public static final String PROP_TYTUL = "Tytul";

    /**
     * Get the value of Tytul
     *
     * @return the value of Tytul
     */
    public String getTytul() {
        return Tytul;
    }

    /**
     * Set the value of Tytul
     *
     * @param Tytul new value of Tytul
     */
    public void setTytul(String Tytul) {
        String oldTytul = this.Tytul;
        this.Tytul = Tytul;
        propertyChangeSupport.firePropertyChange(PROP_TYTUL, oldTytul, Tytul);
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

    @Override
    public String toString() {
        return Tytul ;
    }

}
