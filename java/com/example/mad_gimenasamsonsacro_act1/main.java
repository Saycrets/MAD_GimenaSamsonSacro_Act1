package com.example.mad_gimenasamsonsacro_act1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class main {
    private Button colorButton;
    private Button sizeButton;
    private TextView textView;
    private int currentSize = 24; // Initial text size in sp
    private int currentColor = Color.BLACK; // Initial text color

    protected void onCreate(Bundle savedInstanceState) throws CloneNotSupportedException {
        super.clone();
        setContentView(R.layout.main);

        colorButton = colorButton.findViewById(R.id.customColorButton);
        sizeButton = sizeButton.findViewById(R.id.customSizeButton);
        textView = textView.findViewById(R.id.customTextView);

        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor();
            }
        });

        sizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeSize();
            }
        });
    }

    private void setContentView(int main) {
    }

    private void changeColor() {
        currentColor = Color.rgb(
                (int) (Math.random() * 256),
                (int) (Math.random() * 256),
                (int) (Math.random() * 256)
        );
        textView.setTextColor(currentColor);
    }

    private void changeSize() {
        currentSize += 4; // Increase text size by 4 sp
        textView.setTextSize(currentSize);
    }

}
