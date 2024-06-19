$fraseMayusculas = Read-Host "Pon una frase en mayúsculas"
$fraseMinusculas = $fraseMayusculas.ToLower()
Write-Host "La frase en minúsculas es: $fraseMinusculas"