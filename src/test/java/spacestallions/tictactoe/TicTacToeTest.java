
package spacestallions.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest
{
	@Test
	public void greetResultsInWelcome(){
		TicTacToe ttt = new TicTacToe();
		assertEquals("Welcome to TicTacToe!",ttt.greet());
	}
}
