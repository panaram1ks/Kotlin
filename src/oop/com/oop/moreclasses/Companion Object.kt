fun main(args: Array<String>){
    println( Car4.getDrivingInstructions())

    val course = KotlinCourse()
    course.getCourseInfo()

    KotlinCourse.getCourseMetaInfo()
}

class Car4 {
    companion object {
        fun getDrivingInstructions(): String {
            return "Drive safe"
        }
    }
}

class KotlinCourse {
    fun getCourseInfo(){
        println("Kotlin is a Java based development language")
    }

    companion object {
        fun getCourseMetaInfo(){
            println("Kotlin is not a difficult language to learn")
        }
    }
}