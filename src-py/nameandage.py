"""	
ST31 Kotlin文法 Lesson1 Ex3
	
NameAndAgeクラス定義ファイル。
	
@author Shinzo SAITO
"""	
class NameAndAge:
    """
	名前と年齢を保持するクラス。
	
	Attributes
	----------
	name: str
	    名前を表すインスタンス変数。
	age: int
	    年齢を表すインスタンス変数。
    """	
    
    def	__init__ (self):
        """コンストラクタ。"""
        self.name = "名無し"
        self.age = -1
    
    def	show(self):
        """名前と年齢を表示するメソッド。"""
        printStr = f"{self.name}さんは"
        if self.age == -1:
            printStr += "年齢不詳です"
        else:
            printStr += f"{self.age}歳です"
        print(printStr)
    