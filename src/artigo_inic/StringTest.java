package artigo_inic;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringTest {
	
	private static final String DELIMITER = ",";
	private static final String SEPARATOR = "\n";
	private static final String HEADER = "concat_qdt, String_tipo, tempo, letras_qtd";
	 
	public static String createRandomWord(int len) {
        String name = "";
        for (int i = 0; i < len; i++) {
            int v = 1 + (int) (Math.random() * 26);
            char c = (char) (v + (i == 0 ? 'A' : 'a') - 1);
            name += c;
        }
        
        return name;
    }
	
	public static void main(String[] args) {
		int letras_qtd = 2;
		int concat_qdt = 100000;
		String csv = "Concatenacao_100000_2.csv";
		
		String strFinal = "";
        
		long tStart = System.currentTimeMillis();

        for(int i = 0; i < concat_qdt; i ++){
        	String randomWord = createRandomWord(letras_qtd);
            strFinal += randomWord;
        }

        long tEnd = System.currentTimeMillis();
        long tResult = tEnd - tStart;
        
        strFinal = "";
        
        Concatenacao string_normal = new Concatenacao(concat_qdt, "String", tResult, letras_qtd);

        ///System.out.println("Concatenação de 100.000 \"a\" com String - Tempo de Execução = "+tResult+" ms");
        System.out.println(strFinal.length());        
        
        
        StringBuilder strBuilder = new StringBuilder();
        tStart = System.currentTimeMillis();
        
        for(int i = 0; i < concat_qdt; i ++){
        	String randomWord = createRandomWord(letras_qtd);
            strBuilder.append(randomWord);
        }
        
        tEnd = System.currentTimeMillis();
        tResult = tEnd - tStart;
        
        strBuilder.delete(0, concat_qdt);
        
        Concatenacao string_builder = new Concatenacao(concat_qdt, "StringBuilder", tResult, letras_qtd);
        
        ///System.out.println("Concatenação de 100.000 \"a\" com StringBuilder - Tempo de Execução = "+tResult+" ms");
        System.out.println(strBuilder.length()); 
        
        
        
        StringBuffer strBuffer = new StringBuffer();
        tStart = System.currentTimeMillis();
        for(int i = 0; i < concat_qdt; i ++){
        	String randomWord = createRandomWord(letras_qtd);
            strBuffer.append(randomWord);
        }
        tEnd = System.currentTimeMillis();
        tResult = tEnd - tStart;
        strBuffer.delete(0, concat_qdt);
        Concatenacao string_buffer = new Concatenacao(concat_qdt, "StringBuffer", tResult, letras_qtd);
        
        ///System.out.println("Concatenação de 100.000 \"a\" com StringBuffer - Tempo de Execução  = "+tResult+" ms");
        System.out.println(strBuilder.length());
        
        
        List<Concatenacao> conc_list = new ArrayList<Concatenacao>();
        conc_list.add(string_normal);
        conc_list.add(string_builder);
        conc_list.add(string_buffer);
        
        FileWriter file = null;
        
        try
        {
          file = new FileWriter(csv);
          //Add header
          file.append(HEADER);
          //Add a new line after the header
          file.append(SEPARATOR);
          //Iterate through bookList
          Iterator it = conc_list.iterator();
          while(it.hasNext())
          {
            Concatenacao c = (Concatenacao)it.next();
            file.append(String.valueOf(c.getConcat_qdt()));
            file.append(DELIMITER);
            file.append(c.getString_tipo());
            file.append(DELIMITER);
            file.append(String.valueOf(c.getTempo()));
            file.append(DELIMITER);
            file.append(String.valueOf(c.getLetras_qtd()));
            file.append(SEPARATOR);
          }
        
          file.close();
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
        System.out.println("************FIM************");
  }
        

}

