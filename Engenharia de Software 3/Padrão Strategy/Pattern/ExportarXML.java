public class ExportarXML implements EstrategiaExportacao{
    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando conteúdo em XML: " + conteudo);
    }
}
