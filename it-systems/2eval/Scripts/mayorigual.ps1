$numero1 = Read-Host "Pon el primer número"
$numero2 = Read-Host "Pon el segundo número"

if ($numero1 -ge $numero2) {
    Write-Host "El primer número es mayor"
} else {
    Write-Host "El segundo número es mayor"
}