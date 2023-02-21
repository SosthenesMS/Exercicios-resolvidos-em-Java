Algoritmo "NotasTurma"

Var

 estudantesNome: vetor [1..10] de caracter
 estudantesNota: vetor [1..10] de real
 i, j: inteiro
 media, soma: real

Inicio

 Para i de 1 ate 10 faca
        Escreval("")
        Escreval("--- Digite o nome do aluno numero: ", i)
        Leia(estudantesNome[i])
        Escreval("--- Digite a nota de ", estudantesNome[i])
        Leia(estudantesNota[i])
        soma <- soma + estudantesNota[i]

   FimPara

escreval("")
media <- soma/10
    
 para j de 1 ate 10 faca
      escreval("Índice: ", j , "  Aluno: ", estudantesNome[j], "  Nota: ", estudantesNota[j])
 fimpara
 
 escreval("A média da turma é: ", media)

Fimalgoritmo
