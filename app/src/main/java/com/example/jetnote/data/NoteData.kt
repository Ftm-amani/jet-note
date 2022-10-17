package com.example.jetnote.data

import com.example.jetnote.model.Note

class NotesDataSource {
	fun loadNotes() : List<Note> {
		return listOf(
			Note(title="hi", description = "Hallo wie gehts?"),
			Note(title="hi", description = "Hallo wie gehts?"),
			Note(title="hi", description = "Hallo wie gehts?"),
			Note(title="hi", description = "Hallo wie gehts?"),
			Note(title="hi", description = "Hallo wie gehts?"),
			Note(title="hi", description = "Hallo wie gehts?"),
			Note(title="hi", description = "Hallo wie gehts?"),
			Note(title="hi", description = "Hallo wie gehts?"),
			Note(title="hi", description = "Hallo wie gehts?"),
			Note(title="hi", description = "Hallo wie gehts?"),
			Note(title="hi", description = "Hallo wie gehts?"),
			Note(title="hi", description = "Hallo wie gehts?"),
			Note(title="hi", description = "Hallo wie gehts?"),
			Note(title="hi", description = "Hallo wie gehts?")
		)
	}
}