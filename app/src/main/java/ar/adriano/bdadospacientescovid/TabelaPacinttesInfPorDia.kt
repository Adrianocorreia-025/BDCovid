package ar.adriano.bdadospacientescovid

import android.database.sqlite.SQLiteDatabase

class TabelaPacinttesInfPorDia(db: SQLiteDatabase?) {
    private val  db: SQLiteDatabase? = db
    fun criaTabelas() {
        // Criar tabelas dentro da base de Dados
        db?.execSQL("CREATE TABLE TPacienteSInfectPorDia(_id INTEGER PRIMARY KEY AUTOINCREMENT, PacientesInfectados TEXT UNIQUE,NomePaciente TEXT UNIQUE,id_TPaciente INTEGER NOT NULL, FOREIGN KEY(id_TPaciente) REFERENCES TPaciente)")

    }

}
