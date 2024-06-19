$num1 = Read-Host "Pon el primer número:"
$num2 = Read-Host "Pon el segundo número:"
$num1 = [int]$num1
$num2 = [int]$num2

$suma = [int]($num1 + $num2)
$resta = [int]($num1 - $num2)
$multiplicacion = [int]($num1 * $num2)
$division = [int]($num1 / $num2)

Write-Host "Suma: $suma"
Write-Host "Resta: $resta"
Write-Host "Multiplicación: $multiplicacion"
Write-Host "División: $division"