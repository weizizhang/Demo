package com.example.app.demo.tree;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TreeJson {
    private String id;
    private String name;
    private String parentId;
    private List<TreeJson> children = new ArrayList<>();
    private List<TreeJson> parents = new ArrayList<>();
}
