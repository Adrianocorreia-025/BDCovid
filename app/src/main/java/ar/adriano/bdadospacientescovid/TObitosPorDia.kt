package ar.adriano.bdadospacientescovid

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TObitosPorDia(db: SQLiteDatabase) {
    private val db: SQLiteDatabase = db
    fun criaTabelas() {
        // Criar tabelas dentro da base de Dados
        db.execSQL("CREATE TABLE " + NOME_TABLE + "(" +
                BaseColumns._ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                CABECALHO + " TEXT UNIQUE," +
                NOME_PACIENTE + " TEXT UNIQUE," +
                DATA_OBITO + " INTEGER NOT NULL," +
                ID_TPACINTE + " INTEGER NOT NULL," +
                " FOREIGN KEY" +  ID_TPACINTE +
                " REFERENCES " + TabelaPacientes.NOME_TABLE +
                ")")

    }

    fun insert(values: ContentValues): Long {
        return db.insert(TabelaPacientes.NOME_TABLE, null, values)
    }

    fun update(values: ContentValues, whereClause: String, whereArgs: Array<String>): Int {
        return db.update(TabelaPacientes.NOME_TABLE, values, whereClause, whereArgs)
    }

    fun delete(whereClause: String, whereArgs: Array<String>): Int {
        return db.delete(TabelaPacientes.NOME_TABLE, whereClause, whereArgs)
    }

    fun query(
        columns: Array<String>,
        selection: String,
        selectionArgs: Array<String>,
        groupBy: String,
        having: String,
        orderBy: String
    ): Cursor? {
        return db.query(TabelaPacientes.NOME_TABLE, columns, selection, selectionArgs, groupBy, having, orderBy)
    }



    companion object
    {
        const val NOME_TABLE="TPacienteSInfectPorDia"
        const val  CABECALHO = " PacientesInfectados"
        const val NOME_PACIENTE = "NomePaciente"
        const val ID_TPACINTE =  "id_TPaciente"
        const val DATA_OBITO = "OBITO"

    }

}
