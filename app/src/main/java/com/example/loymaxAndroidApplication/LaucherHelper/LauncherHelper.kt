package com.example.loymaxAndroidApplication.LaucherHelper

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

class LauncherHelper {
    fun launchHelper(coroutineScope: CoroutineScope,
                     catchBlock: (Exception) -> Unit,
                     finallyBlock: () -> Unit,
                     context: CoroutineContext = EmptyCoroutineContext,
                     start: CoroutineStart = CoroutineStart.DEFAULT,
                     block: suspend CoroutineScope.() -> Unit
    ): Job {
        return coroutineScope.launch(context, start) {
            withContext(Dispatchers.IO) {
                try {
                    block()
                } catch (e: Exception) {
                    catchBlock(e)
                } finally {
                    finallyBlock()
                }
            }
        }
    }
}