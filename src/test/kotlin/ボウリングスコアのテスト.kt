package ボウリング

import org.amshove.kluent.`should be equal to`
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.data_driven.data
import org.jetbrains.spek.data_driven.on

class ボウリングスコアのテスト : Spek({
    describe("スコアシートのトータルスコアを求めるは") {
        on("%sのスコアシートを計算した場合",
                data("X|X|X|X|X|X|X|X|X|X||XX", expected = 300),
                data("9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||", expected = 90),
                data("5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5", expected = 150),
                data("X|7/|9-|X|-8|8/|-6|X|X|X||81", expected = 167)
        ) { スコア文字列, expected ->
            it("トータルスコアは$expected 点になる") {
                スコアシート(スコア文字列).トータルスコアを求める() `should be equal to` expected
            }
        }
    }
})