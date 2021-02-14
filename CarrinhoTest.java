package carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.carrinho.Produto;

public class CarrinhoTest {
	
	Carrinho carrinho;
	Produto livro;
	
	@BeforeEach
	public void inicializa() {
		livro = new Produto("Biografia Steve Jobs, 69.00);
	}
	
	@BeforeEach
	public void inicializa() {
		carrinho = new Carrinho();
	}
	
	@BeforeEach
	public void addItem(livro)
	
	
	
	@Test
	public void assertionComHamcrestMatcher() {
		assertThat(carrinho.getValorTotal(), equalTo(69.00));
		assertThat(carrinho.getQtdeItems(), equalTo(1));
		
	}

}
