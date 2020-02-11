package com.cursmysql;


import java.util.Arrays;
import java.util.List;

public class MainMySQL {

    public static void main(String[] args)  {
//        Students.createStudentsTable();
        if(args.length>0 ){
            String[] comenzi = new String[]{"studenti", "profesori", "insert","select","update","delete"};
            // Convert String Array to List
            List<String> list = Arrays.asList(comenzi);
            if(list.contains(args[0]) && args[0].compareTo("studenti")==0){
                System.out.println("Tabela aleasa este : "+args[0]);
//                Students.createStudentsTable();
                if( args[1].compareTo("insert")==0){
                    Students student = new Students("4MMFDD", "Muntean2", "Maria2", "5910608832342","1991-06-08");
                    Students.insertStudents(student);

                }
                if(args[1].compareTo("update")==0){
                    Students student2 = new Students("1IV","Ionescu","Ion Andrei","1234567899876","1999-12-11");
                    Students.updateStudents(student2);
                }
                if(args[1].compareTo("delete")==0){
                    Students student2 = new Students("1IV");
                    Students.deleteStudents(student2);
                }
                Students.showStudents();
            }
            else if(list.contains(args[0]) && args[0].compareTo("profesori")==0){
                System.out.println("Tabela aleasa este : "+args[0]);
                //Teachers.createTeachersTable();
            }

        }

        DbConnector.closeConnection();
    }
}
