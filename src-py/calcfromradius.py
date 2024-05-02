"""
ST31 Kotlin文法 Lesson1 Ex4

Python実行ファイル。

@author Shinzo SAITO
"""
from calccircleandball import CalcCircleAndBall

rList = [1.0, 3.0, 5.0, 7.0, 9.0]
for radius in rList:
	calc = CalcCircleAndBall(radius)
	print(f"■■■ 半径{radius}の計算結果")
	print(f"円周: {calc.get_circle()}")
	print(f" | 円面積: {calc.get_area()}")
	print(f" | 球面積: {calc.get_surface()}")
	print(f" | 球体積: {calc.get_volume()}")
