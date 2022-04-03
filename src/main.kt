fun main() {
    val age = 15
    if(age > 12){
        println("You are a teenager")
    }
    else{
        println("You are not a teenager")
    }
    println()
//You are a teenager


var nationality = "Ugandan"
if (nationality=="Kenyan"){
    println("Have you ever been to Nairobi?")
}
else if(nationality=="Ugandan"){
    println("Have you ever been to Kampala?")
}
else if(nationality=="Rwandese"){
    println("Have you ever been to Kigali?")
}
else {
    println("Have you ever been to East Africa?")


    var nationality = "Rwandese"
    when (nationality) {
        "Ugandan" -> println("Have you ever been to Kampala?")
        "Rwandese" -> println("Have you ever been to Kigali?")
        "Kenyan" -> println("Have you ever been to Nairobi?")
        else -> println("Have you ever been to East Africa?")
    }


    fun selectContainer(litres: Int) {
        when (litres) {
            1, 2, 3 -> println("Pour the water into a bottle")
            4, 5, 6, 7 -> println("Pour the water into a bucket")
            8, 9 -> println("Pour the water into a big bucket")
            else -> println("Pour the water into a jerrycan")
        }

                var languages = arrayOf("Kotlin", "Python", "Java", "Ruby")
            for (language in languages) {
                println(language)
                var name = "Alexandra"
                for (character in name){
                    println(character)
            }
        }
    }
}
}




