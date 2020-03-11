/**
 *
 * @author Marcin Świerkocki
 */

public class LoadPracownicyTask extends BaseTask<List<Pracownik>, Void> {
    private Connection connection;
    private ObservableList<Pracownik> list;

    public LoadPracownicyTask(ObservableList<Pracownik> list, Connection c) {
        this.list = list;
        this.connection = c;
    }
    
    @Override
    protected List<Pracownik> doInBackground() throws Exception {
   
        JdbcTemplate jdbc = new JdbcTemplate();
        String q = "select * from Pracownicy";

        return jdbc.query(connection, q, new ResultSetHandler<Pracownik>() {

            @Override
            public Pracownik handle(ResultSet rs) throws SQLException {
  
                
                return new Pracownik(rs.getInt("uid"), rs.getString("identyfikator"), rs.getString("nazwa"), rs.getInt("Grupy"));
            }
        });
        
       
    }

    @Override
    protected void succeeded(List<Pracownik> result) {
        super.succeeded(result);
        list.addAll(result);
        
    }
    
    
}
