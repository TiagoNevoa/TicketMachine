import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.roundToInt

//const val WAIT_SELECTION = 5000L // ms
//data class Station(val price:Int, var counter:Int, val name:String)

object TUI {

    private var originstation: Int? = null
    private var roundTrip = false
    private var finish = false

    fun init() {
        LCD.init()
        KBD.init()
    }

    fun writeInitialMenuLCD() {
        val dateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm")
        finish = false
        LCD.clean()
        LCD.write("Ticket to Ride")
        //lcd.write("Press #")

        val currentDate = dateFormat.format(Date())
        writeDateLCD(currentDate.toString())
    }

    fun getKey(): Char {
        return KBD.getKey()
    }

    fun waitKey(time:Long):Char {
        return KBD.waitKey(time)
    }

    fun waitMaintenanceKey(time:Long):Char { // TESTE
        return KBD.waitKeyMaintenance(time)
    }

    fun writeDateLCD(newcurrentDate:String) {
        LCD.newLine()
        LCD.write(newcurrentDate.toString())
    }

    fun writeStationInfo(title:String, bottomLeft:String, bottomRight:String) {
        LCD.clean()
        LCD.write(title)
        LCD.newLine()
        LCD.write("${bottomLeft}           ${bottomRight}")
    }

    fun abortVendingLCD() {
        LCD.clean()
        LCD.write("Vending aborted")
    }

    fun payScreenLCD(title:String,roundtrip:Boolean,middle: String) {
        LCD.clean()
        LCD.write(title)
        LCD.newLine()
        var bottomLeft = ""
        if(roundtrip) bottomLeft = "1" else bottomLeft="0"
        LCD.write("${bottomLeft}      ${middle}")
    }

    fun writeTitleBottomLCD(title:String, bottomText:String) {
        LCD.clean()
        LCD.write(title)
        LCD.newLine()
        LCD.write(bottomText)
    }

    fun writemMaintenanceOptions(bottomText: String){
        LCD.clean()
        LCD.write("Maintenance Mode")
        LCD.newLine()
        LCD.write(bottomText)
    }

    fun WriteCoinInfo(coinValue : Int, amount :Int?, keyPressed: Char){
        LCD.clean()
        var number = String.format("%.2f", (coinValue.toFloat()).roundToInt() / 100.0)
        val centering1 = ((number+" euros").length + 16)/2-1
        LCD.cursor(0,centering1)
        LCD.write(number + " euros")
        LCD.newLine()
        LCD.write("0${keyPressed}")
        val centering2 = ("${amount}".length + 16)/2-1
        LCD.cursor(1,centering2)
        LCD.write("${amount}")
    }
}