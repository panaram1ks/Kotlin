fun main(args: Array<String>){
    val key = Key().apply {
        secretCode = "123"
        carve()
    }
    Lock().unlock(key)

}

class Lock {
    fun unlock(key: Key){
        println("Unlock lock with key $key")
    }
}

class Key {
    var secretCode = ""
    fun carve(){
        println("Carving the key with code $secretCode")
    }
}