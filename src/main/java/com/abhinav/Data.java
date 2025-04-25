package com.abhinav;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

// Represents a collection of User objects.
public class Data {
    private List<User> users;

    @JsonProperty("users")
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}