package ar.adriano.bdadospacientescovid

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaPacientes(db: SQLiteDatabase?) {
    private val  db: SQLiteDatabase? = db
    fun criaTabelas() {
        // Criar tabelas dentro da base de Dados
     db?.execSQL("CREATE TABLE TPaciente(_id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT UNIQUE)")

    }

}
