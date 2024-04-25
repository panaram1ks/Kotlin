import kotlin.random.Random

fun main(args: Array<String>) {
    for (i in 0..10) {
        println("$i.")
        val service: NetworkService = getNetworkService()
        (service as? FTPService)?.transferFile()
    }
}

open class NetworkService {

}

class FTPService : NetworkService() {
    fun transferFile() {
        println("Transferring a file via FTP")
    }
}

fun getNetworkService(): NetworkService {
    return if (Random.nextInt() % 2 == 0) {
        NetworkService()
    } else {
        FTPService()
    }
}