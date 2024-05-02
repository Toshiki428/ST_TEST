package local.hal.st31.kotlin.lesson1.ex3

/**
 * ST31 Kotlin文法 Lesson1 Ex3
 *
 * 名前と年齢を保持するクラス。
 *
 * @author Shinzo SAITO
 */
class NameAndAge {
    /**
     * 名前を表すプロパティ。
     */
    var name: String = "名無し"
    /**
     * 年齢を表すプロパティ。
     */
    var age: Int = -1

    /**
     * 名前と年齢を表示するメソッド。
     */
    fun show() {
        var printStr = "${name}さんは"
        if(age == -1) {
            printStr += "年齢不詳です"
        }
        else {
            printStr += "${age}歳です"
        }
        println(printStr)
    }
}
