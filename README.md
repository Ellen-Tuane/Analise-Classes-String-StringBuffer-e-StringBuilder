# ANÁLISE E COMPARAÇÃO DE TEMPO DE ARMAZENAMENTO DAS ESTRUTURAS DE DADOS STRING, STRINGBUFFER E STRINGBUILDER

Resumo

A performance de dispositivos eletrônicos é medida pelo desempenho do aparelho em relação a aplicação utilizada, tornando-se assim um fator de importância na estruturação das aplicações. Concatenação de strings via “+” realizada pela classe String, pode ser conveniente para programadores, porém essa prática pode ser custosa em termos de memória e performance. Classes de estruturas de dados como StringBuffer e StringBuilder em Java, realizam funções similares ao que se refere a concatenação de strings, mas em suas diferenças tornam-se úteis para situações divergentes. Utilizando as estruturas de dados citadas, apresentamos uma análise e comparação de tempo de armazenamento das variadas formas de concatenação de strings. Refletindo uma aplicação real, o experimento demonstra semelhanças e divergências entre as variáveis utilizadas devido às suas maneiras de utilização da memória. 

Resultados

As figuras  logo abaixo, mostram a disposição do tempo de execução para as concentrações de 100.000 a 1.000.000 vezes, para strings de 1, 2, 3 e 4 bytes. Ao final das concatenações, as variáveis strings atingiram o tamanho de 1, 2, 3 e 4 megabyte respectivamente.

Figura 2
![newplot(5)](https://user-images.githubusercontent.com/75332447/186675536-b73ef919-8725-44c3-8acc-d90e91a94b43.png)

Figura 3
![newplot(7)](https://user-images.githubusercontent.com/75332447/186675425-56dfdcd9-b770-487c-a269-c979e5487413.png)

Na tabela 1 são dispostas medidas estatísticas que representam cada classe. Importante ressaltar que os dados da classe String são apresentados na escala de minutos, enquanto que os dados das outras duas classes em milissegundos. Partindo disso, é possível então apontar a principal diferença entre os resultados, a classe String tem mediana de 1.37 minutos, as classes StringBuffer e StringBuilder apresentam mediana de 12.5 milissegundos. Embora a média, mediana e desvio padrão das classes StringBuffer e StringBuilder apresentam resultados próximos, há uma diferença de 4.94 milissegundos na variância  entre ambos. 

![tabela](https://user-images.githubusercontent.com/75332447/186676900-903ab917-e2aa-4540-9300-8d33506e67c2.png)

Discussão

O primeiro comportamento observado e esperado em comum para as três classes é que o tempo, apesar haver alguns valores atípicos, seguem uma crescente à medida que há um aumento no número de concatenações e de tamanho em bytes. O segundo, é que a partir da observação das figuras 2 e 3 é possível notar que há uma diferença considerável em relação ao tempo de concatenação da classe String em relação às outras duas classes. Uma evidência disso é que o tempo final está na escala de minutos, visto que se mantido em milissegundos  os valores finais de tempo dificultariam a leitura e análise. Comparando uma amostra, 600.000 concatenações de 4 bytes na classe String leva aproximadamente 8 minutos, enquanto que para as classes StringBuilder e StringBuffer o tempo para o mesmo tamanho é de 30 e 15 milissegundos respectivamente. A justificativa para este resultado é que a classe String (possui um comportamento estático) é imutável, ou seja, o valor não pode ser mudado após a primeira atribuição. Desta maneira, ao concatenar strings com diversas novas áreas de alocação de memória são criadas e as strings antigas perdem referência, mas continuam ocupando o espaço na memória em sua reminiscência. Portanto, a concatenação dessa forma é considerada prejudicial à performance da aplicação.
Ao realizar a comparação dos resultados entre as classes StringBuffer e StringBuilder, podemos observar que a execução da mesma função, o Stringbuilder apresenta uma ligeira rapidez sendo evidenciada na média de 13.3 milissegundos contra 13.4 milisegundos da Stringbuffer, mas apresenta medianas idênticas. Porém, a StringBuffer apresenta uma vantagem quando analisada a variância do tempo na tabela 1, 68.40 milissegundos contra 73.34 milissegundos da StringBuilder. Estatisticamente, essa diferença de 4.94 milisegundo indica o que os resultados dos experimentos da classe StringBuffer mantém-se mais próximo à média. E tecnicamente, a principal diferença entre as duas classes é que o StringBuffer é sincronizado em relação a classe StringBuilder, possibilitando assim maior eficiência na aplicação quando há diversas leituras ou modificação na mesma string. Portanto, a partir dessas evidências, pode-se dizer que a classe StringBuffer apresenta melhor desempenho quanto a concatenação de string.

Conclusão

O estudo contempla uma breve abordagem de comparação de consumo de tempo de concatenação utilizando as classes String, StringBuffer e StringBuilder em Java, visando a performance da aplicação. O experimento mostra a importância de otimizar a concentração de strings utilizando as classes em Java corretamente e com eficácia. Análises estatísticas foram combinadas junto com a disposição dos dados do experimento para providenciar informações importantes para a discussão do experimento e assim provar que os resultados experimentais mostram que a utilização da classe correta apresenta uma estratégia de otimização. O tempo de execução dos experimentos possibilitou também entender a importância da redução na alocação de memória dado à classe utilizada. Portanto, quanto à performance e otimização dos recursos de memória, os resultados encorajam a utilização da classe StringBuffer no uso direto de concatenação de strings.

O artigo completo pode ser consultado em: 

UNIVAP - Universidade do Vale do Paraíba

Engenharia da Computação

Alunas: Amanda Evangelista e Ellen Tuane

Prof. Wagner dos Santos C. de Jesus 
