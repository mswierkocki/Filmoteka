/**
 *
 * @author Marcin Świerkocki
 */

public class LoadTypTask extends BaseTask<List<TypFilmow>, Void> {
    private Connection connection;
    private ObservableList<TypFilmow> list;

    public LoadTypTask(ObservableList<TypFilmow> list, Connection c) {
        this.list = list;
        this.connection = c;
    }
    
    @Override
    protected List<TypFilmow> doInBackground() throws Exception {
   
        
        JdbcTemplate jdbc = new JdbcTemplate();
        return jdbc.query(connection, "SELECT * from TypFilmow", new ResultSetHandler<TypFilmow>() {

            @Override
            public TypFilmow handle(ResultSet rs) throws SQLException {
                
                                
                return new TypFilmow(rs.getInt("uid"), rs.getString("typ"));            }
        });
        
       
    }

    @Override
    protected void succeeded(List<TypFilmow> result) {
        super.succeeded(result); 
        list.addAll(result);
        
    }
    
    
}
