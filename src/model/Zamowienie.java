/**
 *
 * @author Marcin Świerkocki
 */
 
public class Zamowienie {
    
    private int uid;

    private Klient klient;

    public static final String PROP_KLIENT = "klient";

    /**
     * Get the value of klient
     *
     * @return the value of klient
     */
    public Klient getKlient() {
        return klient;
    }

    /**
     * Set the value of klient
     *
     * @param klient new value of klient
     */
    public void setKlient(Klient klient) {
        Klient oldKlient = this.klient;
        this.klient = klient;
        propertyChangeSupport.firePropertyChange(PROP_KLIENT, oldKlient, klient);
    }

    private int filmID;

    public static final String PROP_FILMID = "filmID";

    /**
     * Get the value of filmID
     *
     * @return the value of filmID
     */
    public int getFilmID() {
        return filmID;
    }

    /**
     * Set the value of filmID
     *
     * @param filmID new value of filmID
     */
    public void setFilmID(int filmID) {
        int oldFilmID = this.filmID;
        this.filmID = filmID;
        propertyChangeSupport.firePropertyChange(PROP_FILMID, oldFilmID, filmID);
    }

    private int klientID;

    /**
     * Get the value of klientID
     *
     * @return the value of klientID
     */
    public int getKlientID() {
        return klientID;
    }

    /**
     * Set the value of klientID
     *
     * @param klientID new value of klientID
     */
    public void setKlientID(int klientID) {
        this.klientID = klientID;
    }

    public Zamowienie(int uid, int filmID, int klientID, boolean CzyZwrocone, Date odKiedy, Date doKiedy,String f,String k) {
        this.uid = uid;
        this.filmID = filmID;
        this.klientID = klientID;
        this.CzyZwrocone = CzyZwrocone;
        this.odKiedy = odKiedy;
        this.doKiedy = doKiedy;
        this.klient = new Klient(klientID, k, k);
        this.film = new Film(k, k, filmID, null, k);
    }

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

    private boolean CzyZwrocone;

    public static final String PROP_CZYZWROCONE = "CzyZwrocone";

    /**
     * Get the value of CzyZwrocone
     *
     * @return the value of CzyZwrocone
     */
    public boolean isCzyZwrocone() {
        return CzyZwrocone;
    }

    /**
     * Set the value of CzyZwrocone
     *
     * @param CzyZwrocone new value of CzyZwrocone
     */
    public void setCzyZwrocone(boolean CzyZwrocone) {
        boolean oldCzyZwrocone = this.CzyZwrocone;
        this.CzyZwrocone = CzyZwrocone;
        propertyChangeSupport.firePropertyChange(PROP_CZYZWROCONE, oldCzyZwrocone, CzyZwrocone);
    }

    private Date odKiedy;

    public static final String PROP_ODKIEDY = "odKiedy";

    /**
     * Get the value of odKiedy
     *
     * @return the value of odKiedy
     */
    public Date getOdKiedy() {
        return odKiedy;
    }

    /**
     * Set the value of odKiedy
     *
     * @param odKiedy new value of odKiedy
     */
    public void setOdKiedy(Date odKiedy) {
        Date oldOdKiedy = this.odKiedy;
        this.odKiedy = odKiedy;
        propertyChangeSupport.firePropertyChange(PROP_ODKIEDY, oldOdKiedy, odKiedy);
    }

    private Date doKiedy;

    public static final String PROP_DOKIEDY = "doKiedy";

    /**
     * Get the value of doKiedy
     *
     * @return the value of doKiedy
     */
    public Date getDoKiedy() {
        return doKiedy;
    }

    /**
     * Set the value of doKiedy
     *
     * @param doKiedy new value of doKiedy
     */
    public void setDoKiedy(Date doKiedy) {
        Date oldDoKiedy = this.doKiedy;
        this.doKiedy = doKiedy;
        propertyChangeSupport.firePropertyChange(PROP_DOKIEDY, oldDoKiedy, doKiedy);
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
