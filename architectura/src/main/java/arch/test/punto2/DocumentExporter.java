package arch.test.punto2;

public abstract class DocumentExporter {
    public void export() {
        Document document = createDocument();
        document.render();
    }

    protected abstract Document createDocument();
}
