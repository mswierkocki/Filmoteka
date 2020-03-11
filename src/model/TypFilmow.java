/**
 *
 * @author Marcin Świerkocki
 */

public class TypFilmow {
    
    private int id;

    public static final String PROP_ID = "id";

    public int getId() {
        return id;
    }
    private String Typ;

    public static final String PROP_TYP = "Typ";


    public String getTyp() {
        return Typ;
    }

    public TypFilmow(int id, String Typ) {
        this.id = id;
        this.Typ = Typ;
    }

    public void setTyp(String Typ) {
        String oldTyp = this.Typ;
        this.Typ = Typ;
        propertyChangeSupport.firePropertyChange(PROP_TYP, oldTyp, Typ);
    }

    @Override
    public String toString() {
        return Typ;
    }


    public void setId(int id) {
        int oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldId, id);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
