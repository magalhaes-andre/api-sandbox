package com.magalhaes.reactive_github.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.enterprise.inject.Model;

@Model
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class GithubRepository {

    String name;
    String description;
    String url;
}
