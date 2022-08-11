package artigo_inic;

public class Concatenacao {
	private int concat_qdt;
	private String string_tipo;
	private Long tempo;
	private int letras_qtd;

	public int getConcat_qdt() {
		return concat_qdt;
	}

	public void setConcat_qdt(int concat_qdt) {
		this.concat_qdt = concat_qdt;
	}

	public String getString_tipo() {
		return string_tipo;
	}

	public void setString_tipo(String string_tipo) {
		this.string_tipo = string_tipo;
	}

	public Long getTempo() {
		return tempo;
	}

	public void setTempo(long tResult) {
		this.tempo = (long) tResult;
	}

	public int getLetras_qtd() {
		return letras_qtd;
	}

	public void setCaract_qtd(int letras_qtd) {
		this.letras_qtd= letras_qtd;
	}
	
	
	public Concatenacao(int concat_qdt, String string_tipo, long tResult, int letras_qtd) {
		this.setConcat_qdt(concat_qdt);
		this.setString_tipo(string_tipo);
		this.setTempo(tResult);
		this.setCaract_qtd(letras_qtd);
	}	
}
