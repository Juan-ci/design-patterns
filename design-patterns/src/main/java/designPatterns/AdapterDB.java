package designPatterns;

public class AdapterDB implements IConexionSQL {

    private IConexionNoSQL noSql;
    
    public AdapterDB(IConexionNoSQL noSql) {
        this.noSql = noSql;
    }
    
    @Override
    public void conexion() {
        this.noSql.conexion();
    }

    @Override
    public String runQuery() {
        return this.noSql.executeSentence();
    }
    
}
