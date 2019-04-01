package com.example.app.demo.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecursiveTreeMap {
    public static List<TreeJson> getTreeMap(List<TreeJson> treeList) {
        List<TreeJson> parentTreeList = new ArrayList<TreeJson>();
        List<TreeJson> childrenTreeList = new ArrayList<TreeJson>();
        Map<String, String> allIdMap = new HashMap<String, String>();
        if (treeList == null || treeList.size() == 0) {
            return parentTreeList;
        }
        for (TreeJson tree : treeList){
            allIdMap.put(tree.getId(), tree.getId());
        }
        //遍历找出所有的根节点和非根节点
        for (TreeJson tree : treeList) {
            if ("-1".equals(tree.getParentid()) || !allIdMap.containsKey(tree.getParentid())){
                parentTreeList.add(tree);
            }else{
                childrenTreeList.add(tree);
            }
        }
        //递归获取所有子节点
        if (parentTreeList != null && parentTreeList.size() > 0) {
            for (TreeJson tree : parentTreeList) {
                //添加所有子级
                List<TreeJson> children = getChildrenTreeList(childrenTreeList, tree.getId());
                tree.setChildren(children);
            }
        }
        return parentTreeList;
    }

    //递归查询子节点
    public static List<TreeJson> getChildrenTreeList(List<TreeJson> childrenList, String parentId) {
        List<TreeJson> parentTreeList = new ArrayList<TreeJson>();
        List<TreeJson> childrenTreeList = new ArrayList<TreeJson>();
        if (childrenList == null || childrenList.size() == 0) {
            return parentTreeList;
        }
        //找出所有的根节点和非根节点
        for (TreeJson tree : childrenList) {
            if (parentId.equals(tree.getParentid())) {
                parentTreeList.add(tree);
            } else {
                childrenTreeList.add(tree);
            }
        }
        //查询子节点
        if (parentTreeList != null && parentTreeList.size() > 0) {
            for (TreeJson tree : parentTreeList) {
                //递归查询子节点
                List<TreeJson> children = getChildrenTreeList(childrenTreeList, tree.getId());
                tree.setChildren(children);
            }
        }
        return parentTreeList;
    }
}
