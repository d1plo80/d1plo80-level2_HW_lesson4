module ru.gb.study.java.andrey.level2_hw_lesson4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.study.java.andrey.level2_hw_lesson4 to javafx.fxml;
    exports ru.gb.study.java.andrey.level2_hw_lesson4;
}