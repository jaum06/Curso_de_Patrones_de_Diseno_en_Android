package com.cristianvillamil.platziwallet.ui.commands

import android.content.Context
import android.util.Log
import java.io.IOException
import java.io.OutputStreamWriter

class SaveCommand : FileCommand {
    override fun execute(context: Context, fileName: String, vararg arguments: String) {
        try {
            var argumentsString = ""
            val outputStreamWriter =
                OutputStreamWriter(context.openFileOutput(fileName, Context.MODE_PRIVATE))

            arguments.forEach { argumentsString = argumentsString + "\n" + it }
            outputStreamWriter.write(argumentsString)
            outputStreamWriter.close()
        } catch (exception: IOException) {
            Log.e("SaveCommand", "File write failed: $exception")
        }
    }
}