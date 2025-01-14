package lab2.sqlQueryGenerator;
import lab2.annotations.FieldColumn;
import lab2.annotations.FieldMapping;
@FieldMapping(fieldToColumn = {
        @FieldColumn(field = "name", column = "user_name"),
        @FieldColumn(field = "age", column = "user_age")
})
public class SQLQueryGeneratorDemo {
    private String name;
    private int age;
    public SQLQueryGeneratorDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void runDemo() {
        SqlQueryGenerator sqlGen = new SqlQueryGenerator();
        SQLQueryGeneratorDemo obj = new SQLQueryGeneratorDemo("John", 25);
        System.out.println("CREATE query: " + sqlGen.create(obj));
        System.out.println("READ query: " + sqlGen.read(obj));
        System.out.println("UPDATE query: " + sqlGen.update(obj));
        System.out.println("DELETE query: " + sqlGen.delete(obj));
    }
}
