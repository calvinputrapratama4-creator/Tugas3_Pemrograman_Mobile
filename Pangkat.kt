inline fun pangkat(basis: Int, eksponen: Int): Long {
    var hasil = 1L
    for (i in 1..eksponen) {
        hasil *= basis
    }
    return hasil
}

fun main() {
    // Contoh pemanggilan sesuai permintaan
    println("4 pangkat 3 = ${pangkat(4, 3)}")
    
    // Contoh lain
    println("5 pangkat 4 = ${pangkat(5, 4)}")
}