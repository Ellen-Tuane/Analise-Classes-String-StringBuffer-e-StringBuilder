package artigo_inic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVWriter;


public class StringTest {
	
	private static final String DELIMITER = ",";
	private static final String SEPARATOR = "\n";
	private static final String HEADER = "concat_qdt, String_tipo, tempo(ms), letras_qtd";
	 
	 
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
		int concat_qdt = 300000;
		String csv = "Concatenacao.csv";
		String randomWord = "aa";
		
		String strFinal = "";
        
		long tStart = System.currentTimeMillis();

        for(int i = 0; i < concat_qdt; i ++){
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
            strBuilder.append(randomWord);
        }
        
        tEnd = System.currentTimeMillis();
        tResult = tEnd - tStart;
        
        strBuilder.delete(0, strBuilder.length());
        
        Concatenacao string_builder = new Concatenacao(concat_qdt, "StringBuilder", tResult, letras_qtd);
        
        ///System.out.println("Concatenação de 100.000 \"a\" com StringBuilder - Tempo de Execução = "+tResult+" ms");
        System.out.println(strBuilder.length()); 

        StringBuffer strBuffer = new StringBuffer();
        tStart = System.currentTimeMillis();
        for(int i = 0; i < concat_qdt; i ++){
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
                
        try {
        	CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        	
        	Iterator it = conc_list.iterator();
            while(it.hasNext()) {
            	Concatenacao c = (Concatenacao)it.next();
            	
            	String[] record = (String.valueOf(c.getConcat_qdt()) +DELIMITER+ 
            			c.getString_tipo() +DELIMITER+ String.valueOf(c.getTempo())+DELIMITER+ 
            			String.valueOf(c.getLetras_qtd())).toString().split(",");
            	writer.writeNext(record);           		
            }
            writer.close();
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
        System.out.println("************FIM************");
  }
}

