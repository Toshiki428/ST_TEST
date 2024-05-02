package local.hal.st31.kotlin.lesson1.ex4

/**
 * ST31 Kotlin文法 Lesson1 Ex4
 *
 * 円球計算クラス。
 *
 * @author Shinzo SAITO
 *
 * @constructor コンストラクタ。半径の値を受け取り、プロパティに格納する。
 * @param radius 半径の値。この値がプロパティに格納される。
 */
class CalcCircleAndBall(radius: Double) {
    /**
     * 半径を表すプロパティ。
     */
    val radius: Double
    /**
     * 円周率を表すプロパティ。
     */
    private val _pi: Double = 3.14

    init {
        this.radius = radius
    }

    /**
     * 円周を得るメソッド。
     */
    fun getCircle(): Double {
        return 2 * _pi * radius
    }

    /**
     * 円の面積を得るメソッド。
     */
    fun getArea(): Double {
        return _pi * radius * radius
    }

    /**
     * 球の表面積を得るメソッド。
     */
    fun getSurface(): Double {
        return 4 * _pi * radius * radius
    }

    /**
     * 球の体積を得るメソッド。
     */
    fun getVolume(): Double {
        return 4 * _pi * radius * radius * radius / 3
    }
}
