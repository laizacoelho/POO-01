package Polimorfismo;

public enum TipoDano {
    PERFURANTE("Ataque perfurante"),
    FOGO("Ataque de fogo"),
    PANCADA( "Ataque de pancada");

    private String descricao;

    TipoDano(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
