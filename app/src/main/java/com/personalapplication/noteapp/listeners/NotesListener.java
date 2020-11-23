package com.personalapplication.noteapp.listeners;

import com.personalapplication.noteapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
