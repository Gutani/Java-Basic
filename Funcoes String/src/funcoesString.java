
public class funcoesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		String s01 = original.toLowerCase(); // Transforma tudo em minusculo
		String s02 = original.toUpperCase(); // Transforma tudo em maiusculo
		String s03 = original.trim(); // Remove espa�os no inicio e final da senten�a
		String s04 = original.substring(2); // Gera uma nova string removendo a quantidade de caracteres selecionados 
		String s05 = original.substring(2, 9); // Recorta a string criando uma nova senten�a com o recorte
		String s06 = original.replace('a', 'x'); // troca toda string selecionada pela outra escolhida
		String s07 = original.replace("abc", "xy"); //
		int i = original.indexOf("bc"); // mostra a posi��o da string selecionada
		int j = original.lastIndexOf("bc"); // mostra a ultima posi�ao da string selecionada
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
	}

}
