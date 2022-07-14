package com.foysaltech.RoomDbswipeDelete.async;


import android.os.AsyncTask;

import com.foysaltech.RoomDbswipeDelete.models.Note;
import com.foysaltech.RoomDbswipeDelete.persistence.NoteDao;

public class UpdateAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.updateNotes(notes);
        return null;
    }

}