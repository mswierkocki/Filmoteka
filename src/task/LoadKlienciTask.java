/**
 *
 * @author Marcin Świerkocki
 */

public class LoadKlienciTask extends BaseTask<List<Klient>, Void> {
    private Connection connection;
    private ObservableList<Klient> list;

    public LoadKlienciTask(ObservableList<Klient> list, Connection c) {
        this.list = list;
        this.connection = c;
    }
    
    @Override
    protected List<Klient> doInBackground() throws Exception {
   
        
        JdbcTemplate jdbc = new JdbcTemplate();
        return jdbc.query(connection, "select * from Klienci", new ResultSetHandler<Klient>() {

            @Override
            public Klient handle(ResultSet rs) throws SQLException {
                return new Klient(rs.getInt("uid"), rs.getString("nazwa"), rs.getString("dane"));
            }
        });
        
       
    }

    @Override
    protected void succeeded(List<Klient> result) {
        super.succeeded(result); 
        list.addAll(result);
        
    }
    
    
}
