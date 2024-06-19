$numero1 = Read-Host "Pon el primer número"
$numero2 = Read-Host "Pon el segundo número"


if ($numero1 -eq $numero2) {
    $iguales = $true
} else {
    $iguales = $false
}
return $iguales