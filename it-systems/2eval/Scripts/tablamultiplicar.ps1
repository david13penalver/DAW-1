$numero = Read-Host "Introduce un número"
// $numero = [int]$numero

for ($i = 0; $i -le 10; $i++) {
    $resultado = $numero * $i
    Write-Host "$numero x $i = $resultado"
}