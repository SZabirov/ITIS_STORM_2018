package ru.kpfu.itis.poll;

public class Option {
    int id;
    String text;
    int pollId;
    int votesCount;

    public Option() {
    }

    public Option(int id, String text, int pollId, int votesCount) {
        this.id = id;
        this.text = text;
        this.pollId = pollId;
        this.votesCount = votesCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPollId() {
        return pollId;
    }

    public void setPollId(int pollId) {
        this.pollId = pollId;
    }

    public int getVotesCount() {
        return votesCount;
    }

    public void setVotesCount(int votesCount) {
        this.votesCount = votesCount;
    }

    @Override
    public String toString() {
        return "Option{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", pollId=" + pollId +
                ", votesCount=" + votesCount +
                '}';
    }
}
