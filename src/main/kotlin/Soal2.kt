fun main() {
    var beratbadan = 56
    var tinggibadan = 165
    var rumus = tinggibadan - 110

    if(rumus == beratbadan) {
        println("Ideal")
    } else if(rumus > beratbadan) {
        println("Kurus")
    } else {
        println("Gemuk")
    }
}