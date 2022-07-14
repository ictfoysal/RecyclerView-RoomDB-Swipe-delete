package com.foysaltech.RoomDbswipeDelete.async;


import android.os.AsyncTask;

import com.foysaltech.RoomDbswipeDelete.models.Note;
import com.foysaltech.RoomDbswipeDelete.persistence.NoteDao;

public class DeleteAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public DeleteAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.delete(notes);
        return null;
    }

}