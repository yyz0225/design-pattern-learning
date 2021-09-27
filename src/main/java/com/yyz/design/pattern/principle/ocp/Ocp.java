package com.yyz.design.pattern.principle.ocp;

/**
 * @Author: yyz
 * @Date: 2021/9/27 17:55
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Triangle());

        // 遵守开闭原则
        GraphicEditor1 editor1 = new GraphicEditor1();
        editor1.drawShape(new Circle1());
        editor1.drawShape(new Rectangle1());
        editor1.drawShape(new Triangle1());
    }
}
