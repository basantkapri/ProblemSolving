package problem

object ValidParanth {
    fun isValid(s: String): Boolean {
        val symbols = mutableListOf<String>()
        var isValid = true
        for (it in s) {
            val key = "$it"
            if (key == "[" || key == "{" || key == "(") symbols.add(key)
            else {
                val top = if(symbols.size > 0)symbols.last() else ""
                if (top == "{" && key == "}") symbols.removeAt(symbols.size - 1)
                else if (top == "[" && key == "]") symbols.removeAt(symbols.size - 1)
                else if (top == "(" && key == ")") symbols.removeAt(symbols.size - 1)
                else {
                    isValid = false
                    break
                }
            }
        }
        return isValid && symbols.isEmpty()
    }
}