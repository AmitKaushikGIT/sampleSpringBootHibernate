package amitkaushikgit.github.io.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by kaushik on 30/11/17.
 */
@Entity
public class SampleModel {
    @Id
    private String string;

    public SampleModel(){
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
