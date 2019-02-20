package test;



import java.sql.*;
import java.util.*;

    public class JDBCExample {
        public static void main(String[] args) throws SQLException {
         /*
        |student_id  |first_name |
        |27          |John       |
        |28          |Kim        |
        |29          |Lee        |
        */
            String oracleURL="jdbc:oracle:thin:@ec2-18-222-225-115.us-east-2.compute.amazonaws.com:1521:xe";
            String oracleUsername="hr";
            String oraclePassword="hr";

            // ec2-18-191-230-244.us-east-2.compute.amazonaws.com
            //port name--1521
            //hr
            //hr
            //xe
            Connection connection= DriverManager.getConnection(oracleURL,oracleUsername,oraclePassword);
            Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet=statement.executeQuery("select employee_id,first_name,last_name from employees");

            ResultSetMetaData metaData=resultSet.getMetaData();
            int columnCount=metaData.getColumnCount();
//            System.out.println("The column count is: "+columnCount);
//
//            System.out.println("The column name is: "+metaData.getColumnName(1));
//            System.out.println("The column name is: "+metaData.getColumnName(2));
//            System.out.println("The column name is: "+metaData.getColumnName(3));







//            resultSet.next();
//            resultSet.next();
//            resultSet.next();
//            resultSet.next();
//            resultSet.next();

            //display firstname and lastname

            List<Map<String,Object>>table=new ArrayList<>();

            while(resultSet.next()){

                Map<String,Object>map=new HashMap<>();



                for(int column=1;column<=columnCount;column++){

                    map.put(metaData.getColumnName(column),resultSet.getObject(column));

                   // System.out.print(metaData.getColumnName(column)+" -> "+resultSet.getObject(column)+" | ");
                }
               // System.out.println(resultSet.getObject(2)+" " + resultSet.getObject(3));
               // System.out.println();
                table.add(map);

            }
            for(Map<String,Object>emp:table){
                //System.out.println(emp.get("EMPLOYEE_ID"));
                System.out.println(emp);
            }


//            System.out.println("First row: "+resultSet.getObject("employee_id"));
//            System.out.println("First row: "+resultSet.getObject("first_name"));
//            System.out.println("First row: "+resultSet.getObject("last_name"));
//
//            System.out.println("First row: "+resultSet.getObject(1));
//            System.out.println("First row: "+resultSet.getObject(2));
//            System.out.println("First row: "+resultSet.getObject(3));
//
//            System.out.println("Get row number: "+resultSet.getRow());
//
//            resultSet.beforeFirst();
//            resultSet.next();
//
//            System.out.println("Get row number: "+resultSet.getRow());
//            System.out.println("First row: "+resultSet.getObject(1));
//            resultSet.last();
//
//            System.out.println("Number: "+resultSet.getRow());
//
//            System.out.println("Count Number "+metaData.getColumnCount());
//            System.out.println("Column Name "+metaData.getColumnName(1));


            resultSet.close();
            statement.close();
            connection.close();


        }
        public static List<Map<String, Object>> expectedResult () {


            List<Map<String, Object>> table = new ArrayList<>();
            Map<String, Object> m1 = new HashMap<>();
            m1.put("employee_id", 100);
            m1.put("first_name", "Steven");
            m1.put("last_name", "King");
            m1.put("salary", 24000);

            Map<String, Object> m2 = new HashMap<>();
            m2.put("employee_id", 101);
            m2.put("first_name", "Neen");
            m2.put("last_name", "Kochhar");
            m2.put("salary", 17000);

            Map<String, Object> m3 = new HashMap<>();
            m3.put("employee_id", 102);
            m3.put("first_name", "Lex");
            m3.put("last_name", "DE Haan");
            m3.put("salary", 17000);

            table.add(m1);
            table.add(m2);
            table.add(m3);
            return table;
        }
    }

