package com.magalhaes.reactive_github.entity;

import java.util.List;

public class GithubUser {

    String name;
    String bio;
    Integer publicRepos;
    Integer followers;
    Integer following;

    List<GithubRepository> repos;

}
