package com.example.testarquitecture2023.addtasks.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.testarquitecture2023.addtasks.ui.model.TaskModel

@Composable
fun TaskScreen(taskViewModel: TaskViewModel) {
    val showDialog by taskViewModel.showDialog.observeAsState(initial = false)
    Box(modifier = Modifier.fillMaxSize()) {
        AddTaskDialog(show = showDialog, onDismiss = {taskViewModel.dialogClose()}, onTaskAdded = {taskViewModel.onTaskCreated(TaskModel(task = it))})
        TaskList(taskViewModel = taskViewModel)
        FabDialog(modifier = Modifier.align(Alignment.BottomEnd), taskViewModel)
    }
}

@Composable
fun TaskList(taskViewModel: TaskViewModel) {
    val myTasks: List<TaskModel> = taskViewModel.task
    LazyColumn{
        items(myTasks, key = {it.id}) { task ->
            ItemTask(taskModel = task, taskViewModel = taskViewModel)
        }
    }
}

@Composable
fun ItemTask(taskModel: TaskModel, taskViewModel: TaskViewModel) {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp), border = BorderStroke(2.dp, Color.Magenta)) {
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Text(text = taskModel.task, modifier = Modifier
                .weight(1f)
                .padding(horizontal = 10.dp))
            Checkbox(checked = taskModel.selected, onCheckedChange = {taskViewModel.onCheckBoxSelected(taskModel)})
        }
    }

}

@Composable
fun FabDialog(modifier: Modifier, taskViewModel: TaskViewModel) {
    FloatingActionButton(onClick = {
        taskViewModel.onShowDialogClick()
    }, modifier = modifier) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "")
    }
}

@Composable
fun AddTaskDialog(show: Boolean, onDismiss: () -> Unit, onTaskAdded:(String) -> Unit) {
    var myTask by remember {
        mutableStateOf("")
    }
    if (show) {
        Dialog(onDismissRequest = {onDismiss()}) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(15.dp)) {
                Text(text = "Añade tu tarea")
                Spacer(modifier = Modifier.size(16.dp))
                TextField(value = myTask, onValueChange = {myTask = it}, singleLine = true)
                Button(onClick = {
                    onTaskAdded(myTask)
                    myTask = ""
                }) {
                    Text(text = "Create task")
                }
            }
        }
    }
}