package arch.test.punto2;

public class CsvDocument implements Document {
    @Override
    public void render() {
        System.out.println("[CSV] user,book,daysLate");
        System.out.println("u1,book9,3");
    }
}