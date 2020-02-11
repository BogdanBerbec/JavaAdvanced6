package com.cursmysql;

//STEP 1. Import required packages
import java.sql.*;

public class Teachers {
    private String cod_profesor;
    private String nume;
    private String prenume;
    private String cnp;
    private String data_nasterii;
    private String grad_didactic;

    public String getCod_profesor() {
        return cod_profesor;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public String getData_nasterii() {
        return data_nasterii;
    }

    public String getGrad_didactic() {
        return grad_didactic;
    }

    public void setCod_profesor(String cod_profesor) {
        this.cod_profesor = cod_profesor;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setData_nasterii(String data_nasterii) {
        this.data_nasterii = data_nasterii;
    }

    public void setGrad_didactic(String grad_didactic) {
        this.grad_didactic = grad_didactic;
    }

    public static void createTeachersTable(){
        String tableName = "profesori";
        String sql = "CREATE TABLE IF NOT EXISTS "+tableName+"(" +
                "`id` int(10) unsigned NOT NULL AUTO_INCREMENT," +
                "`cod_profesor` varchar(10) NOT NULL," +
                "`nume` varchar(45) NOT NULL," +
                "`prenume` varchar(45) DEFAULT NULL," +
                "`adresa` text," +
                "`cnp` char(13) NOT NULL," +
                "`data_nasterii` date DEFAULT NULL," +
                "`grad_didactic` enum('I','II','III') DEFAULT NULL," +
                "PRIMARY KEY (`id`)," +
                "UNIQUE KEY `cnp_UNIQUE` (`cnp`)," +
                "UNIQUE KEY `cod_profesor_UNIQUE` (`cod_profesor`)" +
                ")ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_general_ci;";
        Connection connection = DbConnector.getDbConnection();
        Statement statement;
        System.out.println(sql);
        try {
            statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Created table successfully...");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
