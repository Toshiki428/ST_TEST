package local.hal.st31.kotlin.lesson1.ex3

/**
 * ST31 Kotlin文法 Lesson1 Ex3
 *
 * Kotling実行ファイル。
 *
 * @author Shinzo SAITO
 */
fun main() {
    val nanashi = NameAndAge()
    nanashi.show()
    val taro = NameAndAge()
    taro.name = "田中太郎"
    taro.age = 28
    taro.show()
}