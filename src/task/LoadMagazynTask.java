/**
 *
 * @author Marcin Świerkocki
 */

public class LoadMagazynTask extends BaseTask<List<FilmMagazyn>, Void> {
    private Connection connection;
    private ObservableList<FilmMagazyn> list;

    public LoadMagazynTask(ObservableList<FilmMagazyn> list, Connection c) {
        this.list = list;
        this.connection = c;
    }
    
    @Override
    protected List<FilmMagazyn> doInBackground() throws Exception {
   
        JdbcTemplate jdbc = new JdbcTemplate();
        String q = "SELECT `Magazyn` . * , `Filmy`.`tytul`,`Filmy`.`opis`,`Filmy`.`zdjecie`,`Filmy`.`uid` as Fuid , `TypFilmow`.`Typ`, `TypFilmow`.`uid` as Tuid\n" +
"FROM `Magazyn`\n" +
"LEFT JOIN `gargelia_filmy`.`Filmy` ON `Magazyn`.`filmId` = `Filmy`.`uid`\n" +
"LEFT JOIN `gargelia_filmy`.`TypFilmow` ON `Filmy`.`Typ` = `TypFilmow`.`uid`";
        //System.out.print(q);
        return jdbc.query(connection, q, new ResultSetHandler<FilmMagazyn>() {

            @Override
            public FilmMagazyn handle(ResultSet rs) throws SQLException {
                  
  
                TypFilmow t = new TypFilmow(rs.getInt("Tuid"),rs.getString("Typ"));
                
                Film f = new Film(rs.getString("Opis"),rs.getString("zdjecie"),rs.getInt("Fuid"),t,rs.getString("tytul"));
                FilmMagazyn fm = new FilmMagazyn();
                fm.setFilm(f);
                fm.setUid(rs.getInt("uid"));
                
                fm.setAktualnaIlosc(rs.getInt("currentCount"));
                fm.setMaxIlosc(rs.getInt("maxCount"));
                
                return fm;
            }
        });
        
       
    }

    @Override
    protected void succeeded(List<FilmMagazyn> result) {
        super.succeeded(result); 
        list.addAll(result);
        
    }
    
    
}
