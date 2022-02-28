package creational.staticFactoryMethod

class NumberMaster {
    companion object {
        fun valueOf(numberInString: String) : Double = numberInString.toDouble()
    }
}