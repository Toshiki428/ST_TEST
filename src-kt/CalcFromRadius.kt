package local.hal.st31.kotlin.lesson1.ex4

/**
 * ST31 Kotlin文法 Lesson1 Ex4
 *
 * Kotlin実行ファイル。
 *
 * @author Shinzo SAITO
 */
fun main() {
    val rList: Array<Double> = arrayOf(1.0, 3.0, 5.0, 7.0, 9.0)
    for(radius in rList) {
        val calc = CalcCircleAndBall(radius)
        println("■■■ 半径${radius}の計算結果")
        print("円周: ${calc.getCircle()}")
        print(" | 円面積: ${calc.getArea()}")
        print(" | 球面積: ${calc.getSurface()}")
        println(" | 球体積: ${calc.getVolume()}")
    }
}
