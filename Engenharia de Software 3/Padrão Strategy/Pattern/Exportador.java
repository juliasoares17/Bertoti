public class Exportador {
    private EstrategiaExportacao estrategia;

    public void setEstrategia(EstrategiaExportacao estrategia) {
        this.estrategia = estrategia;
    }

    public void exportarConteudo(String conteudo) {
        if (estrategia == null) {
            System.out.println("Nenhuma estratégia de exportação definida.");
            return;
        }
        
        if (conteudo == null || conteudo.trim().isEmpty()) {
            System.out.println("Nenhum conteúdo para exportar.");
            return;
        }

        estrategia.exportar(conteudo);
    }
}
