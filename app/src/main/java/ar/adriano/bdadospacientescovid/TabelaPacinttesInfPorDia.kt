package ar.adriano.bdadospacientescovid

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaPacinttesInfPorDia(db: SQLiteDatabase?) {
    private val  db: SQLiteDatabase? = db
    fun criaTabelas() {
        // Criar tabelas dentro da base de Dados
        db?.execSQL("CREATE TABLE " + NOME_TABLE + "(" + BaseColumns._ID + "INTEGER PRIMARY KEY AUTOINCREMENT," + CABECALHO + " TEXT UNIQUE," + NOME_PACIENTE + " TEXT UNIQUE," + ID_TPACINTE + " INTEGER NOT NULL," + " FOREIGN KEY" + "(id_TPaciente)" + " REFERENCES TPaciente" + ")")

    }
    companion object
    {
        const val NOME_TABLE="TPacienteSInfectPorDia"
        const val  CABECALHO = " PacientesInfectados"
        const val NOME_PACIENTE = "NomePaciente"
        const val ID_TPACINTE =  "id_TPaciente"

    }

}
