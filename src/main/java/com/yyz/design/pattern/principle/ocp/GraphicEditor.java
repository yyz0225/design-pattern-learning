package com.yyz.design.pattern.principle.ocp;

/**
 * 绘图使用方,通过不同的type画出不同的图形,如果要新增新的图形需要修改使用方代码,违反了开闭原则
 * @Author: yyz
 * @Date: 2021/9/27 17:44
 */
public class GraphicEditor {

    public void drawShape(BaseShape baseShape){
        if(baseShape.m_type == 1){
            drawRectangle(baseShape);
        }else if (baseShape.m_type == 2){
            drawCircle(baseShape);
        }else if(baseShape.m_type == 3){
            drawTriangle(baseShape);
        }
    }

    /**
     * 画三角形
     * @param baseShape baseShape
     */
    private void drawTriangle(BaseShape baseShape) {
        System.out.println("画三角形...");
    }

    /**
     * 画圆形
     * @param baseShape baseShape
     */
    private void drawCircle(BaseShape baseShape) {
        System.out.println("画圆形...");
    }

    /**
     * 画矩形
     * @param baseShape baseShape
     */
    private void drawRectangle(BaseShape baseShape) {
        System.out.println("画矩形...");
    }
}
