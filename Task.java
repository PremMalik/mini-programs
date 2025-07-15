package Todoapp;

public class Task {
    private String title;
    private boolean isDone;
    public Task(String title) {
        this.title = title;
        this.isDone = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String tile) {
        this.title = tile;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String toString(){
        return (isDone ? "[x] " : "[ ] ") + title;
    }



}
