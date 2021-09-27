package com.yyz.design.pattern.principle.ocp;

/**
 * 绘图使用方,遵守开闭原则
 * @Author: yyz
 * @Date: 2021/9/27 17:44
 */
public class GraphicEditor1 {

    public void drawShape(BaseShape1 baseShape){
        baseShape.drawShape();
    }
}
