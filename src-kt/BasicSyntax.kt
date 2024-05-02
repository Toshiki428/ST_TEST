package local.hal.st31.kotlin.lesson1.ex1

/**
 * ST31 Kotlin文法 Lesson1 Ex1
 *
 * Kotlin実行ファイル。
 *
 * @author Shinzo SAITO
 */
fun main() {
    val score = (0..100).random()
//  score = 35
    println("あなたの点数: ${score}")
    var msg = ""
//  var msg: String
//  msg = null
    msg = if(score >= 80) {
        "優です。"
    }
    else if(score >= 70) {
        "良です。"
    }
    else if(score >= 60) {
        "可です。"
    }
    else {
        "不可です。"
    }
    println(msg)
//  msg = 35
}
