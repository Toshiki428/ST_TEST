"""
ST31 Kotlin文法 Lesson1 Ex1
Python実行ファイル。

@author Shinzo SAITO
"""
import random

score = random.randint(0, 100)
print(f"あなたの点数: {score}")
# score = 35
if score >= 80:
    msg = "優です。"
elif score >= 70:
    msg = "良です。"
elif score >= 60:
    msg = "可です。"
else:
    msg = "不可です。"
print(msg)
# msg = 35
