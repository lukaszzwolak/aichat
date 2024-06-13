package pl.lukaszwolak.AIchat.etenties;

import jakarta.persistence.*;

@Entity
public class Answer extends Message {
    public Answer() {

    }
    public Answer(ApplicationUser owner, String content) {
        super(owner, content);
    }
}
