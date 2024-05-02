/**
 * ST31 Kotlin文法 Lesson1 Ex3
 * 
 * 名前と年齢を保持するクラス。
 * 
 * @author Shinzo SAITO
 */
export default class NameAndAge {
	/**
	 * 名前を表すプロパティ。
	 */
	name = "名無し";
	/**
	 * 年齢を表すプロパティ。
	 */
	age = -1;

	/**
	 * 名前と年齢を表示するメソッド。
	 */
	show() {
		let printStr = `${this.name}さんは`
		if(this.age === -1) {
			printStr += "年齢不詳です"
		}
		else {
			printStr += `${this.age}歳です`
		}
		console.log(printStr)
	}
}
