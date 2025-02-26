package com.andrespelaezp.personaltaskplanningapp.ui.screens.dashboard

import com.andrespelaezp.datasourcecompiler.data.Task

data class DashboardViewState(
    val tasks: List<Task> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)