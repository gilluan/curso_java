import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TesteStream {
	
	//Alt + Shift + R = Renomear alguma coisa
	
	static final Collection< Task > tasks = Arrays.asList(
			new Task( Status.OPEN, 5 ),
			new Task( Status.OPEN, 13 ),
			new Task( Status.CLOSED, 8 )
			);

	public static void main(String[] args) {
		
		Stream<Task> tarefas = tasks.stream().parallel();
		
		List<Task> tarefasAbertas = tarefas
						.filter( task -> task.getStatus() == Status.OPEN )
						.collect(Collectors.toList());
		
		List<Integer> listaDePontos = tarefasAbertas
						.stream()
						.map(task -> task.getPoints())
						.collect(Collectors.toList());

		int resultado = listaDePontos.stream().reduce(1, (a, b) -> a * b);
	
		System.out.println( "Total de pontos: "
				+ resultado );
		
	}
}








