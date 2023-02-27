package classe;

import java.text.DecimalFormat;

public class ProdutoTeste {
	public static void main(String [] args) {
		
// tipo objeto nome = novo objeto();
		Produto p1 = new Produto("Notebook");
//		p1.nome = "Notebook";
		p1.preco = 4356.89;
				
/* mesmo chamando de var, ao instanciar o objeto
ele entende qual tipo objeto é*/
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
//		Produto.desconto = 0.29;

		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		// import para formatar casas decimais de um numero
		DecimalFormat df = new DecimalFormat("##,###.##");
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.println(df.format(precoFinal1));
		System.out.println(df.format(precoFinal2));
		System.out.print("Media do carrinho: R$ " + df.format(mediaCarrinho));
		
	}
	
}
