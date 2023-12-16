package expressions

interface Expression {
    fun value(): Expression

    operator fun plus(other: Expression) = Sum(this, other)
    operator fun times(other: Expression) = Product(this, other)
}