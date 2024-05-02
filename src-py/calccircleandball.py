"""
ST31 Kotlin文法 Lesson1 Ex4

CalcCircleAndBallクラス定義ファイル。

@author Shinzo SAITO
"""
class CalcCircleAndBall:
	"""
	円球計算クラス。

	Attributes
	----------
	radius: float
		半径を表すインスタンス変数。
	pi: float
		円周率を表すインスタンス変数。
	"""

	def __init__(self, radius):
		"""
		コンストラクタ。

		Parameters
		----------
		radius: float
			半径の値。
		"""
		self.radius = radius
		self.pi = 3.14

	def get_circle(self):
		"""円周を得るメソッド。"""
		return 2 * self.pi * self.radius

	def get_area(self):
		"""円の面積を得るメソッド。"""
		return self.pi * self.radius * self.radius

	def get_surface(self):
		"""球の表面積を得るメソッド。"""
		return 4 * self.pi * self.radius * self.radius

	def get_volume(self):
		"""球の体積を得るメソッド。"""
		return 4 * self.pi * self.radius * self.radius * self.radius / 3
