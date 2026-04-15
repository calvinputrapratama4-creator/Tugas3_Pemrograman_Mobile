class Barang(
    var nama: String = "Tanpa Nama",
    var harga: Double = 0.0,
    var jumlah: Int = 0,
    var diskon: Double = 0.1
) {
    
    fun tampil() {
        println("--- Detail Barang ---")
        println("Nama   : $nama")
        println("Harga  : Rp$harga")
        println("Jumlah : $jumlah")
        println("Diskon : ${diskon * 100}%")
        println("---------------------")
    }

    fun hitungTotal(): Double {
        val totalKotor = harga * jumlah
        val potongan = totalKotor * diskon
        return totalKotor - potongan
    }
}

fun main() {
    val barang1 = Barang("Laptop Gaming", 15000000.0, 1, 0.1)
    barang1.tampil()
    println("Total yang harus dibayar: Rp${barang1.hitungTotal()}")

    println()

    val barang2 = Barang(nama = "Mouse Wireless", harga = 200000.0, jumlah = 2)
    barang2.tampil()
    println("Total yang harus dibayar: Rp${barang2.hitungTotal()}")
}
