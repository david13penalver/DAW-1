$oracion = Read-Host "Escribe una oración"

$palabras = $oracion -split '\s+'

$encontrado = $false
foreach ($palabra in $palabras) {
    if ($palabra -like '*de*') {
        $encontrado = $true
        break
    }
}
Write-Host $encontrado