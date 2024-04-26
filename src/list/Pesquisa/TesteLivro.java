package list.Pesquisa;

public class TesteLivro {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Hábitos Atômicos", "James Clear", 2024 );
        catalogoLivros.adicionarLivro("Café com Deus", "Júnior Rostirola", 2024 );
        catalogoLivros.adicionarLivro("A Biblioteca da Meia Noite", "Adriana Fidalgo", 2024 );
        catalogoLivros.adicionarLivro("Como Capturar um Duende", "Narcisio Santos", 2023 );
        catalogoLivros.adicionarLivro("Espirais Coloridas", "Narcisio Santos", 2022 );
        catalogoLivros.adicionarLivro("Tempos Interessantes", "Bruna Beber", 2022 );

        System.out.println(catalogoLivros.pesquisarPorAutor("Bruna Beber"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Café com Deus"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2022, 2023));



    }
}
