package pattern.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User implements Cloneable {

    private String name;
    private final String login;
    private final String password;

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

}