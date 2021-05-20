package ar.adriano.bdadospacientescovid

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BDPCovidOpenHelper(  context: Context?)
    : SQLiteOpenHelper(context, NOME_BASE_DADOS, null, MINHA_VERSAO_BD) {

    override fun onCreate(db: SQLiteDatabase?) {
        if (db != null) {
            TabelaPacientes(db).criaTabelas()
            TabelaPacinttesInfPorDia(db).criaTabelas()
        }
    }
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    companion object{

        const val  NOME_BASE_DADOS = "Pacientes_Covid.db"
        const val MINHA_VERSAO_BD = 1
    }
}