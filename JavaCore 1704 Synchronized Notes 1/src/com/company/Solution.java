package com.company;

/*

1704 Synchronized Notes 2
The Note class will be used by threads. Therefore, make sure that all methods are synchronized.

Requirements:
1. The addNote () method should add notes to the notes list.
2. The removeNote () method should remove the note from the notes list.
3. The addNote () method must be synchronized.
4. The removeNote () method must be synchronized.


 */


import java.util.ArrayList;
import java.util.List;

/*
Синхронизированные заметки 2
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public synchronized void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public synchronized void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
}





