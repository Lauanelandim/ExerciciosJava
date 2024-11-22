public class CaminhaoEncapsulamento {
    private String modelo;
    private double capacidadeCarga;
    
    //Construtor
    public CaminhaoEncapsulamento(String modelo, double capacidadeCarga) {
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
    }

    //Métodos públicos para acessar os dados
    public String getModelo() {
        return modelo;
    }

    public double getcapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setcapacidadeCarga(double capacidadeCarga) {
        if ( capacidadeCarga < 0) {
            throw new IllegalArgumentException("A capacidade de carga não pode ser negativa");
        }
        this.capacidadeCarga = capacidadeCarga;
    }

    //Método principal

    public static void main(String[] args) {
    //Criando um objeto caminhao
        CaminhaoEncapsulamento caminhao = new CaminhaoEncapsulamento("Volvo FH", 25.5);
    //Exibindo os dados do caminhão
    System.out.println("Modelo:" + caminhao.getModelo());
    System.out.println("Capacidade de Carga:" + caminhao.getcapacidadeCarga() + " toneladas");

    //Atualizando os dados do caminhão
    caminhao.setModelo("Scania R450");
    caminhao.setcapacidadeCarga(30.0);

    //Exibindo os dados atualizados
    System.out.println("Modelo atualizado:" + caminhao.getModelo());
    System.out.println("Capacidade de Carga atualizada:" + caminhao.getcapacidadeCarga() + " toneladas");
    }
}
