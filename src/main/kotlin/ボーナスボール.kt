package ボウリング

sealed class ボーナスボール

object ボーナスなし: ボーナスボール()
data class 一回ボーナス(val 一投目: Int): ボーナスボール()
data class 二回ボーナス(val 一投目: Int, val 二投目: Int): ボーナスボール()