fun main() {
    var pembeli1 = 625_000
    var member = 'Y'

    if (pembeli1 >= 500_000) {
        if(member == 'Y') {
            var diskon = pembeli1 * 15 / 100
            var hargaakhir = pembeli1 - diskon
            println("Pembeli 1 mendapat diskon 15% dari $pembeli1, jadi total nya: $pembeli1 - $diskon = $hargaakhir")
        } else {
            var diskon = pembeli1 * 10 / 100
            var hargaakhir = pembeli1 - diskon
            println("Pembeli 1 mendapat diskon 10% dari $pembeli1, jadi total nya: $pembeli1 - $diskon = $hargaakhir")
        }
    } else {
        if(member == 'T') {
            var diskon = pembeli1 * 10 / 100
            var hargaakhir = pembeli1 - diskon
            println("Pembeli 1 mendapat diskon 10% dari $pembeli1, jadi total nya: $pembeli1 - $diskon = $hargaakhir")
        } else {
            var diskon = pembeli1 * 5 / 100
            var hargaakhir = pembeli1 - diskon
            println("Pembeli 1 mendapat diskon 5% dari $pembeli1, jadi total nya: $pembeli1 - $diskon = $hargaakhir")
        }
    }
}