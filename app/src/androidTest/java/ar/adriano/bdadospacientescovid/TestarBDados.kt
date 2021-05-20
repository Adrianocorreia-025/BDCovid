package ar.adriano.bdadospacientescovid

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

// tesyat Base de dados se pode ou nao Abre
@RunWith(AndroidJUnit4::class)
class TestarBDados {

    private fun getContex() = InstrumentationRegistry.getInstrumentation().targetContext

    @Before

    fun cleanBD () {
        getContex().deleteDatabase(BDPCovidOpenHelper.NOME_BASE_DADOS)
    }
    @Test
    fun AbrirBDPacientes(){
       val AbrirBD=  BDPCovidOpenHelper(getContex())
         val db = AbrirBD.readableDatabase
        assert(db.isOpen)
        db.close()
    }

    @Test
    fun InserirBD(){

        val lerBD = BDPCovidOpenHelper(getContex())
        val db = lerBD.writableDatabase
        assert(db.isOpen)
        db.close()
    }
}