package arch.test.punto2;

public class CsvExporter extends DocumentExporter {
    @Override
    protected Document createDocument() {
        return new CsvDocument();
    }
}
