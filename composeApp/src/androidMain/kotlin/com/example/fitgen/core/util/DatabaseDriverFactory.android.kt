package com.example.fitgen.core.util

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.example.fitgen.data.local.FitGenDatabase

actual class DatabaseDriverFactory(
    private val context: Context
) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(
            schema = FitGenDatabase.Schema,
            context = context,
            name = "fitgen.db"
        )
    }
}