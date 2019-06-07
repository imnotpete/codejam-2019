import java.io.File
import java.math.BigInteger

fun main(args: Array<String>) {
	val cases = readFile("foregone.dat").drop(1)

	cases.forEachIndexed(::process)
}

fun process(index: Int, number: String) {
	if (!number.contains('4')) {
		return
	}
	
	var a = ""
	var b = ""

	number.chunked(1).forEach {
		if (it.equals("4")) {
			a += '2'
			b += '2'
		} else {
			a += it
			b += '0'
		}
	}
	
	val aNum = BigInteger(a)
	val bNum = BigInteger(b)

	println("Case #${index+1}: $aNum $bNum")
}

fun readFile(fileName: String): List<String> = File(fileName).readLines()
