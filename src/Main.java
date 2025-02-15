import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Vinil produto1 = new Vinil("Taylor Swift", "Taylor Swift (Debut)", 2006, 430 );
        Vinil produto2 = new Vinil("Taylor Swift", "Fearless", 2008, 439 );
        Vinil produto3 = new Vinil("Taylor Swift", "Speak Now", 2010, 321 );
        Vinil produto4 = new Vinil("Taylor Swift", "Red", 2012, 439 );
        Vinil produto5 = new Vinil("Taylor Swift", "1989", 2014, 449 );
        Vinil produto6 = new Vinil("Taylor Swift", "Reputation", 2017, 444);
        Vinil produto7 = new Vinil("Taylor Swift", "Lover", 2019, 499 );
        Vinil produto8 = new Vinil("Taylor Swift", "Folklore", 2020, 499);
        Vinil produto9 = new Vinil("Taylor Swift", "Evermore", 2020, 499 );
        Vinil produto10 = new Vinil("Taylor Swift", "Midnights", 2022, 229 );
        Vinil produto11 = new Vinil("Taylor Swift", "The Tortured Poets Department", 2024, 429 );
        Vinil produto12 = new Vinil("Taylor Swift", "Fearless (Taylor's Version)", 2021, 599 );
        Vinil produto13 = new Vinil("Taylor Swift", "Red (Taylor's Version)", 2021, 479 );
        Vinil produto14 = new Vinil("Taylor Swift", "Speak Now (Taylor's Version)", 2023, 475 );
        Vinil produto15 = new Vinil("Taylor Swift", "1989 (Taylor's Version)", 2023, 498 );


        System.out.println("\n***** INFORMAÇÕES DOS VINIS DISPONÍVEIS ******\n");
        System.out.println("Nome do artista: " + produto1.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto1.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto1.getAnoLancamento());
        System.out.println("Preço: R$ " + produto1.getPreco());

        System.out.println("\nNome do artista: " + produto2.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto2.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto2.getAnoLancamento());
        System.out.println("Preço: R$ " + produto2.getPreco());

        System.out.println("\nNome do artista: " + produto3.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto3.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto3.getAnoLancamento());
        System.out.println("Preço: R$ " + produto3.getPreco());

        System.out.println("\nNome do artista: " + produto4.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto4.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto4.getAnoLancamento());
        System.out.println("Preço: R$ " + produto4.getPreco());

        System.out.println("\nNome do artista: " + produto5.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto5.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto5.getAnoLancamento());
        System.out.println("Preço: R$ " + produto5.getPreco());

        System.out.println("\nNome do artista: " + produto6.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto6.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto6.getAnoLancamento());
        System.out.println("Preço: R$ " + produto6.getPreco());

        System.out.println("\nNome do artista: " + produto7.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto7.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto7.getAnoLancamento());
        System.out.println("Preço: R$ " + produto7.getPreco());

        System.out.println("\nNome do artista: " + produto8.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto8.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto8.getAnoLancamento());
        System.out.println("Preço: R$ " + produto8.getPreco());

        System.out.println("\nNome do artista: " + produto9.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto9.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto9.getAnoLancamento());
        System.out.println("Preço: R$ " + produto9.getPreco());

        System.out.println("\nNome do artista: " + produto10.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto10.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto10.getAnoLancamento());
        System.out.println("Preço: R$ " + produto10.getPreco());

        System.out.println("\nNome do artista: " + produto11.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto11.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto11.getAnoLancamento());
        System.out.println("Preço: R$ " + produto11.getPreco());

        System.out.println("\nNome do artista: " + produto12.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto12.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto12.getAnoLancamento());
        System.out.println("Preço: R$ " + produto12.getPreco());

        System.out.println("\nNome do artista: " + produto13.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto13.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto13.getAnoLancamento());
        System.out.println("Preço: R$ " + produto13.getPreco());

        System.out.println("\nNome do artista: " + produto14.getNomeArtista());
        System.out.println("Nome do vinil/álbum: " + produto14.getNomeVinil());
        System.out.println("Ano de Lançamento: " + produto14.getAnoLancamento());
        System.out.println("Preço: R$ " + produto14.getPreco());


        ArrayList<Vinil> listaprodutos = new ArrayList<>();
        listaprodutos.add(produto1);
        listaprodutos.add(produto2);
        listaprodutos.add(produto3);
        listaprodutos.add(produto4);
        listaprodutos.add(produto5);
        listaprodutos.add(produto6);
        listaprodutos.add(produto7);
        listaprodutos.add(produto8);
        listaprodutos.add(produto9);
        listaprodutos.add(produto10);
        listaprodutos.add(produto11);
        listaprodutos.add(produto12);
        listaprodutos.add(produto13);
        listaprodutos.add(produto14);
        listaprodutos.add(produto15);


        double somaPrecos = 0;
        for (Vinil produto : listaprodutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaprodutos.size();
        System.out.println("\nPreço médio dos produtos: R$ " + precoMedio);

    }
}