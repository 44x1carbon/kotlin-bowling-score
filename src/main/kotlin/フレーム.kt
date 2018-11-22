package ボウリング

sealed class フレーム {}

object ストライク : フレーム() {
    val 一投目: Int = 10
}
data class スペア(val 一投目: Int): フレーム() {
    val 二投目: Int = 10 - 一投目
}
data class 通常(val 一投目: Int, val 二投目: Int): フレーム()