package ar.adriano.bdadospacientescovid

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class TestarBDados {

    private fun getContex() = InstrumentationRegistry.getInstrumentation().targetContext

    @Test
    fun AbrirBDPacientes(){
       val AbrirBD=  BDPCovidOpenHelper(getContex())
         val db = AbrirBD.readableDatabase
        assert(db.isOpen)
        db.close()
    }
}