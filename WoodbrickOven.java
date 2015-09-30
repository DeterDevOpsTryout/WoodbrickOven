import static spark.Spark.*;

public class WoodbrickOven {
    public static void main(String[] args) {
        get("/cook", (req, res) -> {
          Thread.sleep(3);
          return "done";
        });
    }
}
