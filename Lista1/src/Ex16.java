import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main
{
	private static int Ocorrencia(String str, char ch) {

		Matcher matcher = Pattern.compile(String.valueOf(ch))
								.matcher(str);

		int cont = 0;
		while (matcher.find()) {
			cont++;
		}

		return cont;
	}

	public static void main(String[] args)
	{
		String str = "abracadabra";
		char ch = 'a';

		System.out.println(" Ocorrencia " + Ocorrencia(str, ch) + " vezes da letra a.");
	}
}