/**
 *
 * @author Marcin Świerkocki
 */

public class LoadZamowienieTask extends BaseTask<List<Zamowienie>, Void> {
    private Connection connection;
    private ObservableList<Zamowienie> list;

    public LoadZamowienieTask(ObservableList<Zamowienie> list, Connection c) {
        this.list = list;
        this.connection = c;
    }
    
    @Override
    protected List<Zamowienie> doInBackground() throws Exception {

        JdbcTemplate jdbc = new JdbcTemplate();
        String q = "SELECT Zamowienia.*, Filmy.tytul, Klienci.nazwa From Zamowienia\n "
                + " LEFT JOIN Filmy on Zamowienia.filmy=Filmy.uid\n "
                + " LEFT JOIN Klienci on Zamowienia.klient =Klienci.uid; ";

        return jdbc.query(connection, q, new ResultSetHandler<Zamowienie>() {

            @Override
            public Zamowienie handle(ResultSet rs) throws SQLException {
                return new Zamowienie(rs.getInt("uid"),rs.getInt("filmy"),rs.getInt("klient"),rs.getBoolean("zwrocone"), rs.getDate("odKiedy"), rs.getDate("doKiedy"),rs.getString("Filmy.tytul"),rs.getString("Klienci.nazwa"));
            }
        });
        
       
    }

    @Override
    protected void succeeded(List<Zamowienie> result) {
        super.succeeded(result);
        list.addAll(result);
        
    }
    
    
}
