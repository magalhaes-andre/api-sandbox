package com.magalhaes.reactive_github.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.enterprise.inject.Model;
import java.util.List;

@Model
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class GithubUser {

    String name;
    String bio;
    Integer publicRepos;
    Integer followers;
    Integer following;

    List<GithubRepository> repos;
}
