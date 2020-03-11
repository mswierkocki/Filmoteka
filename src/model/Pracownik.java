/**
 *
 * @author Marcin Świerkocki
 */

public class Pracownik {
    private int permissions = 0;

    public Pracownik(int permissions, String Nazwa) {
        this.permissions = permissions;
        this.Nazwa = Nazwa;
    }
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private String Identyfikator;
    public static final String PROP_IDENTYFIKATOR = "Identyfikator";

    @Override
    public String toString() {
        return "Pracownik{" + "permissions=" + permissions + ", Identyfikator=" + Identyfikator + ", Nazwa=" + Nazwa + '}';
    }

    public Pracownik(String Identyfikator, String Haslo) {
        this.Identyfikator = Identyfikator;
        this.Haslo = Haslo;
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


    /**
     * Get the value of Identyfikator
     *
     * @return the value of Identyfikator
     */
    public String getIdentyfikator() {
        return Identyfikator;
    }

    private String Haslo;

    public static final String PROP_HASLO = "Haslo";

    /**
     * Get the value of Haslo
     *
     * @return the value of Haslo
     */
    
    public Pracownik( int id,String Identyfikator, String Nazwa, int grupy) {
        this.Identyfikator = Identyfikator;
        this.id = id;
        this.Nazwa = Nazwa;
        this.permissions = grupy;
    }

    
    public String getHaslo() {
        return Haslo;
    }


    private String Nazwa;

    public static final String PROP_NAZWA = "Nazwa";

    /**
     * Get the value of Nazwa
     *
     * @return the value of Nazwa
     */
    public String getNazwa() {
        return Nazwa;
    }

    public interface IPersmisions {

 public static final int BRAK = 1 << 0;
 public static final int DODAWANIE_FILMOW       = 1 << 1;
 public static final int USUWANIE_FILMOW        = 1 << 2;
 public static final int MODYFIKOWANIE_FILMOW   = 1 << 3;
 public static final int DODAWANIE_MAGAZYN        = 1 << 4;
 public static final int USUWANIE_MAGAZYN = 1 << 5;
 public static final int MODYFIKOWANIE_MAGAZYN = 1 << 6;
 public static final int DODAWANIE_KLIENTOW = 1 << 7;
 public static final int USUWANIE_KLIENTOW = 1 << 8;
 public static final int MODYFIKOWANIE_KLIENTOW = 1 << 9;
 public static final int DODAWANIE_ZAMOWIEN = 1 << 10;
 public static final int USUWANIE_ZAMOWIEN = 1 << 11;
 public static final int MODYFIKOWANIE_ZAMOWIEN = 1 << 12;
 public static final int DODAWANIE_PRACOWNIKOW = 1 << 13;
 public static final int ZMIANA_PRACOWNIKOW = 1 << 14;
 public static final int WYPOZYCZANIE = 1 << 15;
 public static final int ZWROTY = 1 << 16;
 public static final int KLIENCI = 1 << 17;
 public static final int FILMY = 1 << 18;
 public static final int MAGAZYN = 1 << 19;
 public static final int PRACOWNICY = 1 << 20;
  public static final int HZAMOWIEN = 1 << 21;
 
 
}
    public interface IPermisionGroup extends IPersmisions {

  public static final int RMW_FILMOW = DODAWANIE_FILMOW;
  public static final int RMW_MAGAZYN = DODAWANIE_FILMOW;
  public static final int RMW_KLIENTOW = DODAWANIE_FILMOW;
  public static final int RMW_ZAMOWIEN = DODAWANIE_FILMOW;
   
  public static final int KASJER = WYPOZYCZANIE|ZWROTY|DODAWANIE_KLIENTOW|FILMY;
  public static final int MANAGER = KASJER|DODAWANIE_FILMOW|MODYFIKOWANIE_FILMOW|USUWANIE_FILMOW|MAGAZYN;
  public static final int KIEROWNIK = MANAGER|PRACOWNICY|HZAMOWIEN|KLIENCI|MODYFIKOWANIE_MAGAZYN;

  
  

}
    
    public boolean checkPermission(int permission) {
        return (permissions & permission) != 0;
    }
    public void addPermission(int permission) {
            permissions = (permissions | permission);
    }
    public void removePermission(int permission) {
        permissions = (permissions & ~permission);
    }
    

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
    public int getPerm(){
        return this.permissions;
    }
}
