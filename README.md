<h1 align="center">ANÁLISE ESTATÍSTICA E COMPARAÇÃO DE TEMPO DE ARMAZENAMENTO DAS ESTRUTURAS DE DADOS STRING, STRINGBUFFER E STRINGBUILDER </h1>


Resumo

<p align="justify">A performance de dispositivos eletrônicos é medida pelo desempenho do aparelho em relação a aplicação utilizada, tornando-se assim um fator de importância na estruturação das aplicações. Concatenação de strings via “+” realizada pela classe String, pode ser conveniente para programadores, porém essa prática pode ser custosa em termos de memória e performance. Classes de estruturas de dados como StringBuffer e StringBuilder em Java, realizam funções similares ao que se refere a concatenação de strings, mas em suas diferenças tornam-se úteis para situações divergentes. Utilizando as estruturas de dados citadas, apresentamos uma análise e comparação de tempo de armazenamento das variadas formas de concatenação de strings. Refletindo uma aplicação real, o experimento demonstra semelhanças e divergências entre as variáveis utilizadas devido às suas maneiras de utilização da memória.</p>

![Tabela 1- Resultados Estatísticos das Classes](https://user-images.githubusercontent.com/75332447/195992960-79820b4c-b780-4bec-939f-8dd75491f8d8.png)

<p align="justify">Ao realizar a comparação dos resultados entre as classes StringBuffer e StringBuilder, podemos
observar que na execução da mesma função, o Stringbuilder apresenta uma ligeira rapidez sendo
evidenciada na média de 13.3 milissegundos contra 13.4 milissegundos da Stringbuffer, mas
apresenta medianas idênticas, o que impossibilita a comparação entre ambas neste caso. Portanto,
como citado anteriormente na seção dos resultados, sendo média sensível a valores extremos,
considerando o desvio padrão, a StringBuffer apresenta uma vantagem, 68.40 contra 73.34 da
StringBuilder. Estatisticamente, presumindo os dados do experimento como um todo, essa diferença
de 0.29 indica que a classe StringBuffer variou menos em tempo para a concatenação das strings.
Tecnicamente explicando essa pequena variação, a principal diferença entre as duas classes é que o
StringBuffer opera seus métodos de modo sincronizado em relação a classe StringBuilder, em
específico o método "append''' sempre adiciona esses caracteres no final do buffer, em um momento
especificado, possibilitando assim maior eficiência na aplicação quando há diversas leituras ou
modificação na mesma string. Portanto, a partir dessas evidências, pode-se dizer que a classe
StringBuffer apresenta melhor desempenho quanto a concatenação de string.</p>


O artigo completo pode ser consultado em: [ANÁLISE E COMPARAÇÃO DE TEMPO DE ARMAZENAMENTO DAS ESTRUTURAS DE DADOS STRING, STRINGBUFFER E STRINGBUILDER](https://github.com/Ellen-Tuane/Analise-Classes-String-StringBuffer-e-StringBuilder/blob/main/AN%C3%81LISE%20E%20COMPARA%C3%87%C3%83O%20DE%20TEMPO%20DE%20ARMAZENAMENTO%20DAS%20ESTRUTURAS%20DE%20DADOS%20STRING%2C%20STRINGBUFFER%20E%20STRINGBUILDER.docx.pdf)

</p>
UNIVAP - Universidade do Vale do Paraíba

Engenharia da Computação

Alunas: Amanda Evangelista e Ellen Tuane

Prof. Wagner dos Santos C. de Jesus 
