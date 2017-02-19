package com.example.raman365.i7437763;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;


import java.util.Arrays;
import java.util.Random;


public class NetwalkView1 extends View {
    NetwalkGrid View = new NetwalkGrid(4,4);

    private GestureDetector mGestureDetector;
    private int width, height;
    private int cellContent;
    private int move = 0;

    int [] connectedArray;


    Bitmap n1,n2,n3,n4,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14;

    Paint mGridPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public NetwalkView1(Context context) {
        super(context);
        init();

        mGestureDetector = new GestureDetector(context, new MyGestureListener());
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);



        width = canvas.getWidth() / (View.getColumns()); //  Gets the width of screen and columns to find each cell width/*

        height = (canvas.getHeight() -400) / (View.getRows()); //  Gets the width of screen and columns to find each cell width/*


        //  Start the loop for the columns and rows/*
        for (int i = 0; i < View.getColumns(); i++) {
            for (int j = 0; j < View.getRows(); j++) {

                //  Draws the grid and text onto the canvas/*
                canvas.drawLine(0, j * height,getWidth(),j * height,mGridPaint);
                canvas.drawLine(i * width,0,i * width,(getHeight()-400),mGridPaint);
                canvas.drawText("Moves: "+move,300,1400,mGridPaint);
                mGridPaint.setTextSize(100);


                //  Declare a variable that equals to the value for the particular grid element/*
                cellContent = View.getGridElem(j,i);

                if (cellContent == 40 ){

                    canvas.drawBitmap(n1, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);


                }

                if (cellContent == 36){

                    canvas.drawBitmap(n2, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 34){

                    canvas.drawBitmap(n3, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 33){

                    canvas.drawBitmap(n4, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 3) {

                    canvas.drawBitmap(p1, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 10){

                    canvas.drawBitmap(p2, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 6){

                    canvas.drawBitmap(p3, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 14){

                    canvas.drawBitmap(p4, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 9){

                    canvas.drawBitmap(p5, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 5){

                    canvas.drawBitmap(p6, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 13){

                    canvas.drawBitmap(p7, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 12){

                    canvas.drawBitmap(p8, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 11){

                    canvas.drawBitmap(p9, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 7){

                    canvas.drawBitmap(p10, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 88){

                    canvas.drawBitmap(s1, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 84){

                    canvas.drawBitmap(s2, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 92){

                    canvas.drawBitmap(s3, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }
                if (cellContent == 82){

                    canvas.drawBitmap(s4, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 90){

                    canvas.drawBitmap(s5, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 86){

                    canvas.drawBitmap(s6, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 94){

                    canvas.drawBitmap(s7, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 81){

                    canvas.drawBitmap(s8, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 89){

                    canvas.drawBitmap(s9, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 85){

                    canvas.drawBitmap(s10, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 93){

                    canvas.drawBitmap(s11, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 83){

                    canvas.drawBitmap(s12, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 91){

                    canvas.drawBitmap(s13, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }

                if (cellContent == 87){

                    canvas.drawBitmap(s14, null, new Rect(j * width, i * height, j * width+width, i * height+height), null);
                }


            }
        }

    }



    // onTouchEvent() method of the View class gets called each time you perform any
    // touch event with screen

    public boolean onTouchEvent(MotionEvent ev)    {
        // The line below passes the event to the onTouchEvent method of the GestureDetector class.
        // This analyzes the event and if applicable triggers the appropriate callbacks in the
        // GestureDetector.OnSimpleGestureListener class.


        this.mGestureDetector.onTouchEvent(ev);

        return super.onTouchEvent(ev);
    }




    // This GestureListener class is enclosed within the GameView class


    class MyGestureListener extends GestureDetector.SimpleOnGestureListener {

        // You should always include onDown() and it should always return true.
        // Otherwise the GestureListener may ignore other events.


        public boolean onDown(MotionEvent ev) {
            return true;
        }

        public void onLongPress(MotionEvent ev) {
            move = move + 1;

            // Get location of touch, calculate the column and row that has been clicked.

            int x = (int) ev.getX();

            int y = (int) ev.getY();

            int touchedX = (x / width);
            int touchedY = (y / height);
            // Use touched location and rotate the image 90 degrees to the right.
            View.rotateRight(touchedX, touchedY);

            // Use if statement to compare completed array with the scrambled array.
            if (Arrays.equals(connectedArray, View.mGrid))

            {

                AlertDialog.Builder message = new AlertDialog.Builder(Medium.mDialogContext);
                message.setTitle("Congratulations it took " + move + " moves, Do you want to play again?");
                message.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Intent I = new Intent(getContext(), Difficulty.class);
                        getContext().startActivity(I);
                    }
                });
                message.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Intent I = new Intent(getContext(), MainActivity.class);
                        getContext().startActivity(I);


                    }


                });
                message.show();

            }
            // Use invalidate() to cause view to be redrawn.
            invalidate();

        }

    }  // End of MyGestureListener class




    public void init() {
        mGridPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mGridPaint.setColor(Color.BLACK);

        connectedArray = View.mGrid.clone();

        n1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.n1);

        n2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.n2);

        n3 = BitmapFactory.decodeResource(this.getResources(), R.drawable.n3);

        n4 = BitmapFactory.decodeResource(this.getResources(), R.drawable.n4);

        p1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.p1);

        p2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.p2);

        p3 = BitmapFactory.decodeResource(this.getResources(), R.drawable.p3);

        p4 = BitmapFactory.decodeResource(this.getResources(), R.drawable.p4);

        p5 = BitmapFactory.decodeResource(this.getResources(), R.drawable.p5);

        p6 = BitmapFactory.decodeResource(this.getResources(), R.drawable.p6);

        p7 = BitmapFactory.decodeResource(this.getResources(), R.drawable.p7);

        p8 = BitmapFactory.decodeResource(this.getResources(), R.drawable.p8);

        p9 = BitmapFactory.decodeResource(this.getResources(), R.drawable.p9);

        p10 = BitmapFactory.decodeResource(this.getResources(), R.drawable.p10);

        s1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s1);

        s2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s2);

        s3 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s3);

        s4 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s4);

        s5 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s5);

        s6 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s6);

        s7 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s7);

        s8 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s8);

        s9 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s9);

        s10 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s10);

        s11 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s11);

        s12 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s12);

        s13 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s13);

        s14 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s14);


        for (int i = 0; i < View.getColumns(); i++) {
            for (int j = 0; j < View.getRows(); j++) {

                Random rand = new Random(1-3);
                for (int twist = 1; twist < rand.nextInt(); twist ++)
                {
                    View.rotateRight(i,j);
                }

            }}
    }

}