import isel.leic.utils.Time
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import kotlin.system.exitProcess

//const val WAIT_SELECTION = 5000L // ms
//data class Station(val price:Int, var counter:Int, val name:String)

class TUI() {

    private var originstation: Int? = null
    private var roundTrip = false
    private var finish = false

    fun init() {
        var lcdEmitter = LCD()
        lcdEmitter.init()

        var kbd = KBD()
        kbd.init()
    }
/*
    fun waitingScreen() {
        val dateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm")
        while (true) {
            finish = false
            lcd.clean()
            lcd.write("Ticket to Ride")
            lcd.newLine()
            //lcd.write("Press #")

            var currentDate = dateFormat.format(Date())
            lcd.write(currentDate.toString())

            while (!finish) {
                if (m.maintenanceActive()) {
                    //ScreenMaintenance()
                }
                if (kbd.getKey() == '#') {
                    ScreenSelectStation()
                }

                // Update the date label if it's different from the last date
                val newcurrentDate = dateFormat.format(Date())
                if (newcurrentDate != currentDate) {
                    lcd.newLine()
                    lcd.write(newcurrentDate.toString())
                    currentDate = newcurrentDate
                }

            }
        }
    }

    private fun ScreenSelectStation(){
        //inputSelection('0')
        finish = false
        while(!finish){
            when (val k = kbd.waitKey(WAIT_SELECTION)){
                KEY_NONE -> return
                //'*' -> alternateSelectionMode()
                //'#' -> ScreenPayTicket()
                // else -> inputSelection(k)
                //else -> selectionMode(k)
            }
        }
    }

*/
}