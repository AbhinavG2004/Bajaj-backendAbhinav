package com.abhinav;

import com.fasterxml.jackson.annotation.JsonProperty;

// Represents a User entity.
public class User {
    private String id;  // User ID
    private String name;  // User Name
    private String email;  // User Email

    // Constructor
    public User(@JsonProperty("id") String id, 
                @JsonProperty("name") String name, 
                @JsonProperty("email") String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}