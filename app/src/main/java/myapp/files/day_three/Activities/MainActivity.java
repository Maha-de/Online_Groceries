package myapp.files.day_three.Activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import myapp.files.day_three.R;

public class MainActivity extends AppCompatActivity {

    private TextView txt_vege_name, txt_vege_price, txt_qty, txt_vege_name1, txt_vege_price1, txt_qty1,
            txt_view, txt_view1,
            txt_vege_name2, txt_vege_price2, txt_qty2, txt_view2,
            txt_vege_name3, txt_vege_price3, txt_qty3, txt_view3,
            txt_vege_name4, txt_vege_price4, txt_qty4, txt_view4;
    private ImageButton imageButton2, imageButton, imageButton1, imageButton4, imageButton3, imageButton5,
            imageButton6, imageButton7, imageButton8,
            imageButton9, imageButton10, imageButton11,
            imageButton12, imageButton13, imageButton14;
    private ImageView img_pepper, img_pepper1, img_pepper2, img_pepper3, img_pepper4;
    private Button btn;
    private int qty, qty1, qty2, qty3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_vege_name = findViewById(R.id.txt_vege_name);
        txt_vege_price = findViewById(R.id.txt_vege_price);
        txt_qty = findViewById(R.id.txt_qty);
        txt_vege_name1 = findViewById(R.id.txt_vege_name1);
        txt_vege_price1 = findViewById(R.id.txt_vege_price1);
        txt_qty1 = findViewById(R.id.txt_qty1);
        txt_vege_name2 = findViewById(R.id.txt_vege_name2);
        txt_vege_price2 = findViewById(R.id.txt_vege_price2);
        txt_qty2 = findViewById(R.id.txt_qty2);
        txt_vege_name3 = findViewById(R.id.txt_vege_name3);
        txt_vege_price3 = findViewById(R.id.txt_vege_price3);
        txt_qty3 = findViewById(R.id.txt_qty3);
        img_pepper = findViewById(R.id.img_pepper);
        img_pepper1 = findViewById(R.id.img_pepper1);
        img_pepper2 = findViewById(R.id.img_pepper2);
        img_pepper3 = findViewById(R.id.img_pepper3);
        imageButton = findViewById(R.id.imageButton);
        imageButton1 = findViewById(R.id.imageButton1);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton4 = findViewById(R.id.imageButton4);
        imageButton3 = findViewById(R.id.imageButton3);
        imageButton5 = findViewById(R.id.imageButton5);
        imageButton6 = findViewById(R.id.imageButton6);
        imageButton7 = findViewById(R.id.imageButton7);
        imageButton8 = findViewById(R.id.imageButton8);
        imageButton9 = findViewById(R.id.imageButton9);
        imageButton10 = findViewById(R.id.imageButton10);
        imageButton11 = findViewById(R.id.imageButton11);
        txt_view = findViewById(R.id.txt_view);
        txt_view1 = findViewById(R.id.txt_view1);
        txt_view2 = findViewById(R.id.txt_view2);
        txt_view3 = findViewById(R.id.txt_view3);
        btn = findViewById(R.id.btn);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qty ++;
                txt_qty.setText(qty + "");
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qty --;
                txt_qty.setText(qty + "");
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qty2 ++;
                txt_qty2.setText(qty2 + "");
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qty2 --;
                txt_qty2.setText(qty2 + "");
            }
        });
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qty3 ++;
                txt_qty3.setText(qty3 + "");
            }
        });
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qty3 --;
                txt_qty3.setText(qty3 + "");
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qty1 ++;
                txt_qty1.setText(qty1 + "");
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qty1 --;
                txt_qty1.setText(qty1 + "");
            }
        });
    }

    public void GotoCheckout(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Go to Checkout");
        builder.setMessage("Are you sure you want to continue");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void back(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View v = getLayoutInflater().inflate(R.layout.custom_dialog,null);
        builder.setView(v);
        builder.setPositiveButton("Stay Here", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.setNegativeButton("Go to Homepage", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {


            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

//        Button nbutton = alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE);
//        nbutton.setBackgroundColor(Color.CYAN);
//        Button pbutton = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);
//        pbutton.setBackgroundColor(Color.CYAN);
    }
}