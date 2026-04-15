import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    // Kasus 1: t1(2,3) dan t2(8,7)
    val hasil1 = hitungJarak(2.0, 3.0, 8.0, 7.0)
    println("Jarak antara (2,3) dan (8,7) adalah: $hasil1")

    // Kasus 2: t1(5,3) dan t2(-8,-4)
    val hasil2 = hitungJarak(5.0, 3.0, -8.0, -4.0)
    println("Jarak antara (5,3) dan (-8,-4) adalah: $hasil2")
}

/**
 * Fungsi untuk menghitung jarak antara dua titik (x1, y1) dan (x2, y2)
 */
fun hitungJarak(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    val deltaX = x2 - x1
    val deltaY = y2 - y1
    
    // Menggunakan rumus akar dari (deltaX^2 + deltaY^2)
    return sqrt(deltaX.pow(2) + deltaY.pow(2))
}