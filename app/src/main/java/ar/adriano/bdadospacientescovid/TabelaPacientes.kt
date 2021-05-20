package ar.adriano.bdadospacientescovid

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaPacientes(db: SQLiteDatabase?) {
    private val  db: SQLiteDatabase? = db
    fun criaTabelas() {
        // Criar tabelas dentro da base de Dados
     db?.execSQL("CREATE TABLE " + NOME_TABLE + "(" + BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + Nome +"TEXT UNIQUE" + ")")

    }


    companion object{

        const val NOME_TABLE = "TPaciente"
        const val Nome ="nome"
    }
}
