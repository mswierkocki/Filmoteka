/**
 *
 * @author Marcin Świerkocki
 */
 
public class FilmMagazyn{
    
    private int uid;

    private Film film;

    public static final String PROP_FILM = "film";

    /**
     * Get the value of film
     *
     * @return the value of film
     */
    public Film getFilm() {
        return film;
    }

    /**
     * Set the value of film
     *
     * @param film new value of film
     */
    public void setFilm(Film film) {
        Film oldFilm = this.film;
        this.film = film;
        propertyChangeSupport.firePropertyChange(PROP_FILM, oldFilm, film);
    }

    private int aktualnaIlosc;

    public static final String PROP_AKTUALNAILOSC = "aktualnaIlosc";



    /**
     * Get the value of aktualnaIlosc
     *
     * @return the value of aktualnaIlosc
     */
    public int getAktualnaIlosc() {
        return aktualnaIlosc;
    }

    /**
     * Set the value of aktualnaIlosc
     *
     * @param aktualnaIlosc new value of aktualnaIlosc
     */
    public void setAktualnaIlosc(int aktualnaIlosc) {
        int oldAktualnaIlosc = this.aktualnaIlosc;
        this.aktualnaIlosc = aktualnaIlosc;
        propertyChangeSupport.firePropertyChange(PROP_AKTUALNAILOSC, oldAktualnaIlosc, aktualnaIlosc);
    }

    private int maxIlosc;

    public static final String PROP_MAXILOSC = "maxIlosc";

    /**
     * Get the value of maxIlosc
     *
     * @return the value of maxIlosc
     */
    public int getMaxIlosc() {
        return maxIlosc;
    }

    /**
     * Set the value of maxIlosc
     *
     * @param maxIlosc new value of maxIlosc
     */
    public void setMaxIlosc(int maxIlosc) {
        int oldMaxIlosc = this.maxIlosc;
        this.maxIlosc = maxIlosc;
        propertyChangeSupport.firePropertyChange(PROP_MAXILOSC, oldMaxIlosc, maxIlosc);
    }

    public static final String PROP_UID = "uid";

    /**
     * Get the value of uid
     *
     * @return the value of uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * Set the value of uid
     *
     * @param uid new value of uid
     */
    public void setUid(int uid) {
        int oldUid = this.uid;
        this.uid = uid;
        propertyChangeSupport.firePropertyChange(PROP_UID, oldUid, uid);
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
