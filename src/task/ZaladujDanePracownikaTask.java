/**
 *
 * @author Marcin Świerkocki
 */

public class ZaladujDanePracownikaTask extends BaseTask<Pracownik, Void> {
    private Connection connection;
    private Pracownik pracownik;

    public ZaladujDanePracownikaTask(Connection connection, Pracownik pracownik) {
        this.connection = connection;
        this.pracownik = pracownik;
    }
    @Override
    protected Pracownik doInBackground() throws Exception {
        //JdbcTemplate jdbc = new JdbcTemplate();
        Statement statement = null;

try{
    statement = connection.createStatement();
    ResultSet result    = null;
    if (pracownik != null) 
      try{
        String sql = "select * from Pracownicy where Identyfikator=\""+pracownik.getIdentyfikator()+"\" ";
        result = statement.executeQuery(sql);
        result.next();
            String name = result.getString("Nazwa");
            String tmpHaslo = result.getString("Haslo");
            int   grupy  = result.getInt("Grupy");
            System.out.println("Sukcess!\n"+pracownik);
            if(tmpHaslo==pracownik.getHaslo())
                pracownik = new Pracownik(grupy, name);
                return pracownik;
      }catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        } finally {
        if(result != null) result.close();
        }
    } finally {
        if(statement != null) statement.close();
    }
    return pracownik;
  
    }

    @Override
    protected void succeeded(Pracownik result) {
        super.succeeded(result);
        pracownik = result;
    }
    
    
}
