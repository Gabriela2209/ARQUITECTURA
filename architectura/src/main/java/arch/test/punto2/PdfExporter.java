package arch.test.punto2;

public class PdfExporter extends DocumentExporter {
    @Override
    protected Document createDocument() {
        return new PdfDocument();
    }
}
