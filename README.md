<h1 align="center">ANÁLISE E COMPARAÇÃO DE TEMPO DE ARMAZENAMENTO DAS ESTRUTURAS DE DADOS STRING, STRINGBUFFER E STRINGBUILDER </h1>


Resumo

<p align="justify">A performance de dispositivos eletrônicos é medida pelo desempenho do aparelho em relação a aplicação utilizada, tornando-se assim um fator de importância na estruturação das aplicações. Concatenação de strings via “+” realizada pela classe String, pode ser conveniente para programadores, porém essa prática pode ser custosa em termos de memória e performance. Classes de estruturas de dados como StringBuffer e StringBuilder em Java, realizam funções similares ao que se refere a concatenação de strings, mas em suas diferenças tornam-se úteis para situações divergentes. Utilizando as estruturas de dados citadas, apresentamos uma análise e comparação de tempo de armazenamento das variadas formas de concatenação de strings. Refletindo uma aplicação real, o experimento demonstra semelhanças e divergências entre as variáveis utilizadas devido às suas maneiras de utilização da memória.</p>

Resultados

<p align="justify">As figuras  logo abaixo, mostram a disposição do tempo de execução para as concentrações de 100.000 a 1.000.000 vezes, para strings de 1, 2, 3 e 4 bytes. Ao final das concatenações, as variáveis strings atingiram o tamanho de 1, 2, 3 e 4 megabyte respectivamente.</p>

Figura 2
<h1 align="center">![newplot(5)](https://user-images.githubusercontent.com/75332447/186675536-b73ef919-8725-44c3-8acc-d90e91a94b43.png)</h1>

Figura 3
<h1 align="center">![newplot(7)](https://user-images.githubusercontent.com/75332447/186675425-56dfdcd9-b770-487c-a269-c979e5487413.png)</h1>

<p align="justify">Na tabela 1 são dispostas medidas estatísticas que representam cada classe. Importante ressaltar que os dados da classe String são apresentados na escala de minutos, enquanto que os dados das outras duas classes em milissegundos. Partindo disso, é possível então apontar a principal diferença entre os resultados, a classe String tem mediana de 1.37 minutos, as classes StringBuffer e StringBuilder apresentam mediana de 12.5 milissegundos. Embora a média, mediana e desvio padrão das classes StringBuffer e StringBuilder apresentam resultados próximos, há uma diferença de 4.94 milissegundos na variância  entre ambos.</p>

<h1 align="center">![tabela](https://user-images.githubusercontent.com/75332447/186676900-903ab917-e2aa-4540-9300-8d33506e67c2.png)</h1>

Conclusão

<p align="justify">O estudo contempla uma breve abordagem de comparação de consumo de tempo de concatenação utilizando as classes String, StringBuffer e StringBuilder em Java, visando a performance da aplicação. O experimento mostra a importância de otimizar a concentração de strings utilizando as classes em Java corretamente e com eficácia. Análises estatísticas foram combinadas junto com a disposição dos dados do experimento para providenciar informações importantes para a discussão do experimento e assim provar que os resultados experimentais mostram que a utilização da classe correta apresenta uma estratégia de otimização. O tempo de execução dos experimentos possibilitou também entender a importância da redução na alocação de memória dado à classe utilizada. Portanto, quanto à performance e otimização dos recursos de memória, os resultados encorajam a utilização da classe StringBuffer no uso direto de concatenação de strings.</p>



O artigo completo pode ser consultado em: [ANÁLISE E COMPARAÇÃO DE TEMPO DE ARMAZENAMENTO DAS ESTRUTURAS DE DADOS STRING, STRINGBUFFER E STRINGBUILDER](https://github.com/Ellen-Tuane/Analise-Classes-String-StringBuffer-e-StringBuilder/blob/main/AN%C3%81LISE%20E%20COMPARA%C3%87%C3%83O%20DE%20TEMPO%20DE%20ARMAZENAMENTO%20DAS%20ESTRUTURAS%20DE%20DADOS%20STRING%2C%20STRINGBUFFER%20E%20STRINGBUILDER%20Ellen_Amanda.docx.pdf)

</p>
UNIVAP - Universidade do Vale do Paraíba

Engenharia da Computação

Alunas: Amanda Evangelista e Ellen Tuane

Prof. Wagner dos Santos C. de Jesus 
