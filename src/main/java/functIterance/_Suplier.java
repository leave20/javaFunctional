package functIterance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Suplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSuplier.get());
        System.out.println(getDBConnectionUrlSuplierVtwo.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:4444/users";
    }

    static Supplier<List<String>> getDBConnectionUrlSuplier = ()
            -> Arrays.asList(
            "jdbc://localhost:4444/users",
            "jdbc://localhost:4444/users"
    );
    static Supplier<String> getDBConnectionUrlSuplierVtwo = ()
            -> "jdbc://localhost:4444/users";
}
