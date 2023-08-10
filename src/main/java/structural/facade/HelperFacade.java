package structural.facade;

import com.sun.jdi.connect.spi.Connection;

public class HelperFacade {
    public static void generateReport(DBTypes dbTypes, ReportTypes reportTypes, String tableName){
        Connection connection = null;
        switch (dbTypes) {
            case MYSQL:
                connection = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportTypes) {
                    case HTML:
                        mySqlHelper.generateMySqlHTMLReport(tableName, connection);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName, connection);
                        break;
                }
                break;
            case ORACLE:
                connection = OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportTypes) {
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName, connection);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName, connection);
                        break;
                }
                break;
        }
    }
}
