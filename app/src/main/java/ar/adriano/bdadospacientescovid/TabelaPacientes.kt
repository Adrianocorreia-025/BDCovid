package ar.adriano.bdadospacientescovid

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaPacientes(db: SQLiteDatabase) {
    private val db: SQLiteDatabase = db
    fun criaTabelas() {
        // Criar tabelas dentro da base de Dados
     db.execSQL("CREATE TABLE " + NOME_TABLE + "("
             + BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
             Nome +"TEXT UNIQUE" + ")")

    }


    fun insert(values: ContentValues): Long {
        return db.insert(NOME_TABLE, null, values)
    }

    fun update(values: ContentValues, whereClause: String, whereArgs: Array<String>): Int {
        return db.update(NOME_TABLE, values, whereClause, whereArgs)
    }

    fun delete(whereClause: String, whereArgs: Array<String>): Int {
        return db.delete(NOME_TABLE, whereClause, whereArgs)
    }

    fun query(
        columns: Array<String>,
        selection: String,
        selectionArgs: Array<String>,
        groupBy: String,
        having: String,
        orderBy: String
    ): Cursor? {
        return db.query(NOME_TABLE, columns, selection, selectionArgs, groupBy, having, orderBy)
    }


    companion object{

        const val NOME_TABLE = "TPaciente"
        const val Nome ="nome"
    }
}
