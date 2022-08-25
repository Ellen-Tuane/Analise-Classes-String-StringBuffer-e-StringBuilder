# ANÁLISE E COMPARAÇÃO DE TEMPO DE ARMAZENAMENTO DAS ESTRUTURAS DE DADOS STRING, STRINGBUFFER E STRINGBUILDER

Resumo

A performance de dispositivos eletrônicos é medida pelo desempenho do aparelho em relação a aplicação utilizada, tornando-se assim um fator de importância na estruturação das aplicações. Concatenação de strings via “+” realizada pela classe String, pode ser conveniente para programadores, porém essa prática pode ser custosa em termos de memória e performance. Classes de estruturas de dados como StringBuffer e StringBuilder em Java, realizam funções similares ao que se refere a concatenação de strings, mas em suas diferenças tornam-se úteis para situações divergentes. Utilizando as estruturas de dados citadas, apresentamos uma análise e comparação de tempo de armazenamento das variadas formas de concatenação de strings. Refletindo uma aplicação real, o experimento demonstra semelhanças e divergências entre as variáveis utilizadas devido às suas maneiras de utilização da memória. 

Resultados

As figuras  logo abaixo, mostram a disposição do tempo de execução para as concentrações de 100.000 a 1.000.000 vezes, para strings de 1, 2, 3 e 4 bytes. Ao final das concatenações, as variáveis strings atingiram o tamanho de 1, 2, 3 e 4 megabyte respectivamente.


![newplot(5)](https://user-images.githubusercontent.com/75332447/186675536-b73ef919-8725-44c3-8acc-d90e91a94b43.png)

![newplot(7)](https://user-images.githubusercontent.com/75332447/186675425-56dfdcd9-b770-487c-a269-c979e5487413.png)

Na tabela 1 são dispostas medidas estatísticas que representam cada classe. Importante ressaltar que os dados da classe String são apresentados na escala de minutos, enquanto que os dados das outras duas classes em milissegundos. Partindo disso, é possível então apontar a principal diferença entre os resultados, a classe String tem mediana de 1.37 minutos, as classes StringBuffer e StringBuilder apresentam mediana de 12.5 milissegundos. Embora a média, mediana e desvio padrão das classes StringBuffer e StringBuilder apresentam resultados próximos, há uma diferença de 4.94 milissegundos na variância  entre ambos. 

![tabela](https://user-images.githubusercontent.com/75332447/186676900-903ab917-e2aa-4540-9300-8d33506e67c2.png)






UNIVAP - Universidade do Vale do Paraíba

Engenharia da Computação

Alunas: Amanda Evangelista e Ellen Tuane

Prof. Wagner dos Santos C. de Jesus 
