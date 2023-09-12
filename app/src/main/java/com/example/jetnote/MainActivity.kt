package com.example.jetnote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetnote.screen.NoteScreen
import com.example.jetnote.screen.NoteViewModel
import com.example.jetnote.ui.theme.JetNoteTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetNoteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val noteViewModel: NoteViewModel by viewModels()

                    NotesApp(noteViewModel)
                } }
        } }
}

@Composable
fun NotesApp(noteViewModel: NoteViewModel) {

    val noteList = noteViewModel.noteList.collectAsState().value

    NoteScreen(
        note = noteList,
        onRemoveNote = { noteViewModel.deleteNote(it) },
        onAddNote = { noteViewModel.addNote(it) })

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetNoteTheme {
    }
}