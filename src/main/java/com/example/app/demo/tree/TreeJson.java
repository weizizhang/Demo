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
    private String parentid;
    private List<TreeJson> children = new ArrayList<TreeJson>();
    private List<TreeJson> parents = new ArrayList<TreeJson>();
}
