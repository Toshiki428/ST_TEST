"""
ST31 Kotlin文法 Lesson1 Ex2

Python実行ファイル。

@author Shinzo SAITO
"""
import random

numes = []
denomis = []
for i in range(4):
    numes += [random.randint(0, 10)]
    denomis += [random.randint(0, 10)]

for denomi in denomis:
    print(f"■分母の値: {denomi}")
    if denomi == 0:
        print("分母が0なので処理を中止します")
        break
    for nume in numes:
        print(f"--分子の値: {nume}")
        if nume == 0:
            print("→分子が0なので次の分子にスキップします")
            continue
        ans = nume / denomi
        print(f"→分数値: {ans}")
