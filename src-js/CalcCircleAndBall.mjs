/**
 * ST31 Kotlin文法 Lesson1 Ex4
 * 
 * 円球計算クラス。
 * 
 * @author Shinzo SAITO
 */
export default class CalcCircleAndBall {
	/**
	 * 半径を表すプロパティ。
	 */
	radius = 0;
	/**
	 * 円周率を表すプロパティ。
	 */
	#pi = 3.14;

	/**
	 * コンストラクタ。
	 * @param {number} radius 半径
	 */
	constructor(radius) {
		this.radius = radius;
	}

	/**
	 * 円周を得るメソッド。
	 */
	getCircle() {
		return 2 * this.#pi * this.radius;
	}

	/**
	 * 円の面積を得るメソッド。
	 */
	getArea() {
		return this.#pi * this.radius * this.radius;
	}

	/**
	 * 球の表面積を得るメソッド。
	 */
	getSurface() {
		return 4 * this.#pi * this.radius * this.radius;
	}

	/**
	 * 球の体積を得るメソッド。
	 */
	getVolume() {
		return 4 * this.#pi * this.radius * this.radius * this.radius / 3;
	}
}
