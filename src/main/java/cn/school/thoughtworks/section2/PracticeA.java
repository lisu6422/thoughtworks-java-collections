package cn.school.thoughtworks.section2;

import cn.school.thoughtworks.Utils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        return Utils.countKey(collection1);
    }
}
