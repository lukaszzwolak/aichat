package pl.lukaszwolak.AIchat.etenties;


import jakarta.persistence.*;

@Entity
public class Question extends Message {
    public Question() {
    }

    public Question(ApplicationUser owner, String content) {
        super(owner, content);
    }
}
