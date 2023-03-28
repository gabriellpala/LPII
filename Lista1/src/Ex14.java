public class Ex14{
public static void main(String[] args) {
	String x = "Amanda";

	int total=0;

	for (int i=0;i<=x.length()-1;i++) {
		if (x.substring(i,i+1).equalsIgnoreCase("a"))
			total=total+1;
	}

	System.out.println(total);

}
}
