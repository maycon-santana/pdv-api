package br.com.mayconinforgames.pdv.model.enums;

public enum Categoria {

    PADARIA(0, "PADARIA"),
    CEREAIS_GRAOS(1, "CEREAIS_GRAOS"),
    CONGELADOS_FRIOS(2, "CONGELADOS_FRIOS"),
    HORTIFRUTI(3, "HORTIFRUTI"),
    LIMPEZA(4, "LIMPEZA"),
    HIGIENE_PESSOAL(5, "HIGIENE_PESSOAL"),
    BEBIDAS(6, "BEBIDAS"),
    PAPELARIA(7, "PAPELARIA");

    private Integer codigo;
    private String descricao;

    private Categoria(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Categoria toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (Categoria x : Categoria.values()) {
            if (cod.equals(x.getCodigo())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Categoria inválida");
    }

}
