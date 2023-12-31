package Study.Architecture.Seminars.Seminar_06.notes.presentation.queries.views;



import Study.Architecture.Seminars.Seminar_06.notes.application.interfaces.NotesPresenter;
import Study.Architecture.Seminars.Seminar_06.notes.domain.Note;

import java.util.Collection;

public class NotesConsolePresenter implements NotesPresenter {
    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note: notes) {
            System.out.println(note);
        }
    }
}
