#!/bin/bash

# para podermos pegar diretorios que tem espaço no seu nome
# (e.g. Downloads/Telegram Desktop)
OLDIFS=$IFS
IFS=$'\n'
#dir recebe diretorio atual
dir=$(pwd)
files=()
#itera pelo diretorio procurando arquivos modificados a menos de 1 dia
while IFS=  read -r -d $'\0'; do
    files+=("$REPLY")
done < <(find $dir -mtime -1 -type f -print0)
#comprime arquivos modificados a menos de um dia no arquivo .tar.gz
#formato do nome: dia-mes-ano-HORAeMINUTOS (2 digitos)
tar cvf `(date +%d-%m-%y-%He%M)`.tar.gz ${files[@]}
exit 0
