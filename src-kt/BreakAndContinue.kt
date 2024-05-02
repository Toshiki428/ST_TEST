package local.hal.st31.kotlin.lesson1.ex2

/**
 * ST31 Kotlin文法 Lesson1 Ex2
 *
 * Kotlin実行ファイル。
 *
 * @author Shinzo SAITO
 */

/**
 * 配列に格納する数値の個数。
 */
const val NUM_COUNT = 5

/**
 * 実行関数。
 */
fun main() {
    val numes = IntArray(NUM_COUNT)
    val denomis = IntArray(NUM_COUNT)
    for(i in 0..(NUM_COUNT - 1)) {
        numes[i] = (0..10).random()
        denomis[i] = (0..10).random()
    }

    for(denomi in denomis) {
        println("■分母の値: ${denomi}")
        if(denomi == 0) {
            println("分母が0なので処理を中止します")
            break
        }
        for(nume in numes) {
            println("--分子の値: ${nume}")
            if(nume == 0) {
                println("→分子が0なので次の分子にスキップします")
                continue
            }
            val ans = nume.toDouble() / denomi
            println("→分数値: ${ans}")
        }
    }
}
