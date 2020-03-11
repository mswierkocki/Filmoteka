/**
 *
 * @author Marcin Świerkocki
 */

public class LoadFilmTask extends BaseTask<List<Film>, Void> {
    private Connection connection;
    private ObservableList<Film> list;

    public LoadFilmTask(ObservableList<Film> list, Connection c) {
        this.list = list;
        this.connection = c;
    }
    
    @Override
    protected List<Film> doInBackground() throws Exception {
   
        
        JdbcTemplate jdbc = new JdbcTemplate();
        return jdbc.query(connection, "select Filmy.* , `TypFilmow`.`Typ`, `TypFilmow`.`uid` as Tuid from Filmy LEFT JOIN `gargelia_filmy`.`TypFilmow` ON `Filmy`.`Typ` = `TypFilmow`.`uid`;", new ResultSetHandler<Film>() {

            @Override
            public Film handle(ResultSet rs) throws SQLException {
                
                Film film = new Film();
                TypFilmow tf = new TypFilmow(rs.getInt("tuid"), rs.getString("typ"));
                film.setTytul(rs.getString("tytul"));
                film.setOpis(rs.getString("opis"));
                film.setZdjecie(rs.getString("Zdjecie"));
                film.setID(rs.getInt("uid"));
                film.setTyp(tf);
                
                return film;            }
        });
        
       
    }

    @Override
    protected void succeeded(List<Film> result) {
        super.succeeded(result); 
        list.addAll(result);
        
    }
    
    
}
