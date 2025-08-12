public class Main {
    public static void main (String[] args) {
        Exportador exportador = new Exportador();
        String conteudo = "Relatório de vendas 2025";
        
        exportador.setEstrategia(new ExportarPDF());
        exportador.exportarConteudo(conteudo);

        exportador.setEstrategia(new ExportarCSV());
        exportador.exportarConteudo(conteudo);

        exportador.setEstrategia(new ExportarXML());
        exportador.exportarConteudo(conteudo);

        exportador.setEstrategia(null);
        exportador.exportarConteudo(conteudo);
    }
}
