package com.example.prudhvi.a9menmorris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class game extends AppCompatActivity {

    private int blueToPlace=9;
    private int redToPlace=9;
    private int blueOnBoard=0;
    private int redOnBoard=0;
    private int blueInDadi=0;
    private int redInDadi=0;
    private int t1[]={0,0};
    private int t2[]={0,0};
    private int t3[]={0,0};
    private int b1[]={0,0};
    private int b2[]={0,0};
    private int b3[]={0,0};
    private int ml[]={0,0};
    private int mr[]={0,0};
    private int l1[]={0,0};
    private int l2[]={0,0};
    private int l3[]={0,0};
    private int r1[]={0,0};
    private int r2[]={0,0};
    private int r3[]={0,0};
    private int mt[]={0,0};
    private int mb[]={0,0};
    private int t1lInDadi;
    private int t1mInDadi;
    private int t1rInDadi;
    private int t2lInDadi;
    private int t2mInDadi;
    private int t2rInDadi;
    private int t3lInDadi;
    private int t3mInDadi;
    private int t3rInDadi;
    private int b1lInDadi;
    private int b1mInDadi;
    private int b1rInDadi;
    private int b2lInDadi;
    private int b2mInDadi;
    private int b2rInDadi;
    private int b3lInDadi;
    private int b3mInDadi;
    private int b3rInDadi;
    private int llInDadi;
    private int lmInDadi;
    private int lrInDadi;
    private int rlInDadi;
    private int rmInDadi;
    private int rrInDadi;
    private StringBuilder t1c=new StringBuilder("");
    private StringBuilder t2c=new StringBuilder("");
    private StringBuilder t3c=new StringBuilder("");
    private StringBuilder b1c=new StringBuilder("");
    private StringBuilder b2c=new StringBuilder("");
    private StringBuilder b3c=new StringBuilder("");
    private StringBuilder mlc=new StringBuilder("");
    private StringBuilder mrc=new StringBuilder("");
    private StringBuilder l1c=new StringBuilder("");
    private StringBuilder l2c=new StringBuilder("");
    private StringBuilder l3c=new StringBuilder("");
    private StringBuilder r1c=new StringBuilder("");
    private StringBuilder r2c=new StringBuilder("");
    private StringBuilder r3c=new StringBuilder("");
    private StringBuilder mtc=new StringBuilder("");
    private StringBuilder mbc=new StringBuilder("");
    private Button t1l;
    private Button t1m;
    private Button t1r;
    private Button t2l;
    private Button t2m;
    private Button t2r;
    private Button t3l;
    private Button t3m;
    private Button t3r;
    private Button b1l;
    private Button b1m;
    private Button b1r;
    private Button b2l;
    private Button b2m;
    private Button b2r;
    private Button b3l;
    private Button b3m;
    private Button b3r;
    private Button ll;
    private Button lm;
    private Button lr;
    private Button rl;
    private Button rm;
    private Button rr;
    private StringBuilder t1lc=new StringBuilder("");
    private StringBuilder t1mc=new StringBuilder("");
    private StringBuilder t1rc=new StringBuilder("");
    private StringBuilder t2lc=new StringBuilder("");
    private StringBuilder t2mc=new StringBuilder("");
    private StringBuilder t2rc=new StringBuilder("");
    private StringBuilder t3lc=new StringBuilder("");
    private StringBuilder t3mc=new StringBuilder("");
    private StringBuilder t3rc=new StringBuilder("");
    private StringBuilder b1lc=new StringBuilder("");
    private StringBuilder b1mc=new StringBuilder("");
    private StringBuilder b1rc=new StringBuilder("");
    private StringBuilder b2lc=new StringBuilder("");
    private StringBuilder b2mc=new StringBuilder("");
    private StringBuilder b2rc=new StringBuilder("");
    private StringBuilder b3lc=new StringBuilder("");
    private StringBuilder b3mc=new StringBuilder("");
    private StringBuilder b3rc=new StringBuilder("");
    private StringBuilder llc=new StringBuilder("");
    private StringBuilder lmc=new StringBuilder("");
    private StringBuilder lrc=new StringBuilder("");
    private StringBuilder rlc=new StringBuilder("");
    private StringBuilder rmc=new StringBuilder("");
    private StringBuilder rrc=new StringBuilder("");
    private String move="b";
    private String validTopButton="";
    private String validBottomButton="";
    private String validRightButton="";
    private String validLeftButton="";
    private Button previousButton=null;
    private StringBuilder previousButtonColor=new StringBuilder("");
    private TextView blueDadi=null;
    private TextView redDadi=null;
    private TextView theMove=null;
    private TextView blueBoard=null;
    private TextView bluePlace=null;
    private TextView redPlace=null;
    private TextView redBoard=null;

    public void updateAfterRows(){
        if( (t1lc.toString()).equals(t1mc.toString()) && (t1mc.toString()).equals(t1rc.toString()) && (t1lc.toString().equals("b") || t1lc.toString().equals("r")) ){
            t1[1]=1;
            t1lInDadi=1;
            t1mInDadi=1;
            t1rInDadi=1;
            t1c.delete(0,t1c.length());
            t1c.append(t1lc.toString());
        }
        else{
            t1[1]=0;
            t1c.delete(0,t1c.length());
            t1c.append("");
        }
        if( (t2lc.toString()).equals(t2mc.toString()) && (t2mc.toString()).equals(t2rc.toString()) && (t2lc.toString().equals("b") || t2lc.toString().equals("r")) ){
            t2[1]=1;
            t2lInDadi=1;
            t2mInDadi=1;
            t2rInDadi=1;
            t2c.delete(0,t2c.length());
            t2c.append(t2lc.toString());
        }
        else{
            t2[1]=0;
            t2c.delete(0,t2c.length());
            t2c.append("");
        }
        if( (t3lc.toString()).equals(t3mc.toString()) && (t3mc.toString()).equals(t3rc.toString()) && (t3lc.toString().equals("b") || t3lc.toString().equals("r")) ){
            t3[1]=1;
            t3lInDadi=1;
            t3mInDadi=1;
            t3rInDadi=1;
            t3c.delete(0,t3c.length());
            t3c.append(t3lc.toString());
        }
        else{
            t3[1]=0;
            t3c.delete(0,t3c.length());
            t3c.append("");
        }

        // bottom

        if( (b1lc.toString()).equals(b1mc.toString()) && (b1mc.toString()).equals(b1rc.toString()) && (b1lc.toString().equals("b") || b1lc.toString().equals("r")) ){
            b1[1]=1;
            b1lInDadi=1;
            b1mInDadi=1;
            b1rInDadi=1;
            b1c.delete(0,b1c.length());
            b1c.append(b1lc.toString());
        }
        else{
            b1[1]=0;
            b1c.delete(0,b1c.length());
            b1c.append("");
        }
        if( (b2lc.toString()).equals(b2mc.toString()) && (b2mc.toString()).equals(b2rc.toString()) && (b2lc.toString().equals("b") || b2lc.toString().equals("r")) ){
            b2[1]=1;
            b2lInDadi=1;
            b2mInDadi=1;
            b2rInDadi=1;
            b2c.delete(0,b2c.length());
            b2c.append(b2lc.toString());
        }
        else{
            b2[1]=0;
            b2c.delete(0,b2c.length());
            b2c.append("");
        }
        if( (b3lc.toString()).equals(b3mc.toString()) && (b3mc.toString()).equals(b3rc.toString()) && (b3lc.toString().equals("b") || b3lc.toString().equals("r")) ){
            b3[1]=1;
            b3lInDadi=1;
            b3mInDadi=1;
            b3rInDadi=1;
            b3c.delete(0,b3c.length());
            b3c.append(b3lc.toString());
        }
        else{
            b3[1]=0;
            b3c.delete(0,b3c.length());
            b3c.append("");
        }

        // center

        if( (llc.toString()).equals(lmc.toString()) && (lmc.toString()).equals(lrc.toString()) && (llc.toString().equals("b") || llc.toString().equals("r")) ){
            ml[1]=1;
            llInDadi=1;
            lmInDadi=1;
            lrInDadi=1;
            mlc.delete(0,mlc.length());
            mlc.append(llc.toString());
        }
        else{
            ml[1]=0;
            mlc.delete(0,mlc.length());
            mlc.append("");
        }
        if( (rlc.toString()).equals(rmc.toString()) && (rmc.toString()).equals(rrc.toString()) && (rlc.toString().equals("b") || rlc.toString().equals("r")) ){
            mr[1]=1;
            rlInDadi=1;
            rmInDadi=1;
            rrInDadi=1;
            mrc.delete(0,mrc.length());
            mrc.append(rlc.toString());
        }
        else{
            mr[1]=0;
            mrc.delete(0,mrc.length());
            mrc.append("");
        }
    }

    public void updateAfterColumns(){
        if( (t1lc.toString()).equals(llc.toString()) && (llc.toString()).equals(b3lc.toString()) && (t1lc.toString().equals("b") || t1lc.toString().equals("r")) ){
            l1[1]=1;
            t1lInDadi=1;
            llInDadi=1;
            b3lInDadi=1;
            l1c.delete(0,l1c.length());
            l1c.append(t1lc.toString());
        }
        else{
            l1[1]=0;
            l1c.delete(0,l1c.length());
            l1c.append("");
        }
        if( (t2lc.toString()).equals(lmc.toString()) && (lmc.toString()).equals(b2lc.toString()) && (t2lc.toString().equals("b") || t2lc.toString().equals("r")) ){
            l2[1]=1;
            t2lInDadi=1;
            lmInDadi=1;
            b2lInDadi=1;
            l2c.delete(0,l2c.length());
            l2c.append(t2lc.toString());
        }
        else{
            l2[1]=0;
            l2c.delete(0,l2c.length());
            l2c.append("");
        }
        if( (t3lc.toString()).equals(lrc.toString()) && (lrc.toString()).equals(b1lc.toString()) && (t3lc.toString().equals("b") || t3lc.toString().equals("r")) ){
            l3[1]=1;
            t3lInDadi=1;
            lrInDadi=1;
            b1lInDadi=1;
            l3c.delete(0,l3c.length());
            l3c.append(t3lc.toString());
        }
        else{
            l3[1]=0;
            l3c.delete(0,l3c.length());
            l3c.append("");
        }

        // right

        if( (t3rc.toString()).equals(rlc.toString()) && (rlc.toString()).equals(b1rc.toString()) && (t3rc.toString().equals("b") || t3rc.toString().equals("r")) ){
            r1[1]=1;
            t3rInDadi=1;
            rlInDadi=1;
            b1rInDadi=1;
            r1c.delete(0,r1c.length());
            r1c.append(t3rc.toString());
        }
        else{
            r1[1]=0;
            r1c.delete(0,r1c.length());
            r1c.append("");
        }
        if( (t2rc.toString()).equals(rmc.toString()) && (rmc.toString()).equals(b2rc.toString()) && (t2rc.toString().equals("b") || t2rc.toString().equals("r")) ){
            r2[1]=1;
            t2rInDadi=1;
            r2c.delete(0,r2c.length());
            r2c.append(t2rc.toString());
        }
        else{
            r2[1]=0;
            r2c.delete(0,r2c.length());
            r2c.append("");
        }
        if( (t1rc.toString()).equals(rrc.toString()) && (rrc.toString()).equals(b3rc.toString()) && (t1rc.toString().equals("b") || t1rc.toString().equals("r")) ){
            r3[1]=1;
            t1rInDadi=1;
            rrInDadi=1;
            b3rInDadi=1;
            r3c.delete(0,r3c.length());
            r3c.append(t1rc.toString());
        }
        else{
            r3[1]=0;
            r3c.delete(0,r3c.length());
            r3c.append("");
        }

        // center

        if( (t1mc.toString()).equals(t2mc.toString()) && (t2mc.toString()).equals(t3mc.toString()) && (t1mc.toString().equals("b") || t1mc.toString().equals("r")) ){
            mt[1]=1;
            t1mInDadi=1;
            t2mInDadi=1;
            t3mInDadi=1;
            mtc.delete(0,mtc.length());
            mtc.append(t1mc.toString());
        }
        else{
            mt[1]=0;
            mtc.delete(0,mtc.length());
            mtc.append("");
        }
        if( (b1mc.toString()).equals(b2mc.toString()) && (b2mc.toString()).equals(b3mc.toString()) && (b1mc.toString().equals("b") || b1mc.toString().equals("r")) ){
            mb[1]=1;
            b1mInDadi=1;
            b2mInDadi=1;
            b3mInDadi=1;
            mbc.delete(0,mbc.length());
            mbc.append(b1mc.toString());
        }
        else{
            mb[1]=0;
            mbc.delete(0,mbc.length());
            mbc.append("");
        }
    }

    public void updateAfter(){
        t1lInDadi=t1mInDadi=t1rInDadi=t2lInDadi=t2mInDadi=t2rInDadi=t3lInDadi=t3mInDadi=t3rInDadi=0;
        b1lInDadi=b1mInDadi=b1rInDadi=b2lInDadi=b2mInDadi=b2rInDadi=b3lInDadi=b3mInDadi=b3rInDadi=0;
        llInDadi=lmInDadi=lrInDadi=rlInDadi=rmInDadi=rrInDadi=0;
        updateAfterRows();
        updateAfterColumns();
    }

    public void updateBefore(){
        t1[0]=t1[1];t1[1]=0;
        t2[0]=t2[1];t2[1]=0;
        t3[0]=t3[1];t3[1]=0;
        b1[0]=b1[1];b1[1]=0;
        b2[0]=b2[1];b2[1]=0;
        b3[0]=b3[1];b3[1]=0;
        ml[0]=ml[1];ml[1]=0;
        mr[0]=mr[1];mr[1]=0;
        l1[0]=l1[1];l1[1]=0;
        l2[0]=l2[1];l2[1]=0;
        l3[0]=l3[1];l3[1]=0;
        r1[0]=r1[1];r1[1]=0;
        r2[0]=r2[1];r2[1]=0;
        r3[0]=r3[1];r3[1]=0;
        mt[0]=mt[1];mt[1]=0;
        mb[0]=mb[1];mb[1]=0;
    }

    public int checkForDadi(){
        if( (t1[0]==0 && t1[1]==1) || (t2[0]==0 && t2[1]==1) || (t3[0]==0 && t3[1]==1) ){
            return 1;
        }
        else if( (b1[0]==0 && b1[1]==1) || (b2[0]==0 && b2[1]==1) || (b3[0]==0 && b3[1]==1) ){
            return 1;
        }
        else if( (ml[0]==0 && ml[1]==1) || (mr[0]==0 && mr[1]==1) ){
            return 1;
        }
        else if( (l1[0]==0 && l1[1]==1) || (l2[0]==0 && l2[1]==1) || (l3[0]==0 && l3[1]==1) ){
            return 1;
        }
        else if( (r1[0]==0 && r1[1]==1) || (r2[0]==0 && r2[1]==1) || (r3[0]==0 && r3[1]==1) ){
            return 1;
        }
        else if( (mt[0]==0 && mt[1]==1) || (mb[0]==0 && mb[1]==1) ){
            return 1;
        }
        else {
            return 0;
        }
    }

    public void clickAction(Button b, StringBuilder x, String move, int temp, String topButton, String bottomButton, String rightButton, String leftButton){
        //Toast.makeText(getApplicationContext(),"clicked button is "+b.getTag(),Toast.LENGTH_SHORT).show();
        if(move.equals("b")){
            if(blueToPlace!=0) {
                switch (x.toString()) {
                    case "":
                        b.setBackgroundResource(R.drawable.circular_button_blue);
                        blueToPlace = blueToPlace - 1;
                        blueOnBoard = blueOnBoard + 1;
                        this.move = "r";
                        x.delete(0,x.length());
                        x.append("b");
                        break;
                    case "b":
                        b.setBackgroundResource(R.drawable.circular_button_blue);
                        this.move = "b";
                        x.delete(0,x.length());
                        x.append("b");
                        break;
                    case "r":
                        b.setBackgroundResource(R.drawable.circular_button_red);
                        this.move = "b";
                        x.delete(0,x.length());
                        x.append("r");
                        break;
                }
            }
            else{
                switch(x.toString()){
                    case "":
                        b.setBackgroundResource(R.drawable.circular_button);
                        x.delete(0,x.length());
                        x.append("");
                        validTopButton="";
                        validBottomButton="";
                        validRightButton="";
                        validLeftButton="";
                        previousButton=null;
                        previousButtonColor=null;
                        //Toast.makeText(getApplicationContext(), "b now the validTopBotton is " + validTopButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "b now the validBottomBotton is " + validBottomButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "b now the validRightBotton is " + validRightButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "b now the validLeftBotton is " + validLeftButton, Toast.LENGTH_SHORT).show();
                        this.move="b";
                        break;
                    case "b":
                        b.setBackgroundResource(R.drawable.circular_button_blue);
                        x.delete(0,x.length());
                        x.append("b");
                        if(topButton!=null){
                            validTopButton=topButton;
                        }
                        else{
                            validTopButton="";
                        }
                        if(bottomButton!=null) {
                            validBottomButton = bottomButton;
                        }
                        else{
                            validBottomButton="";
                        }
                        if(rightButton!=null) {
                            validRightButton = rightButton;
                        }
                        else{
                            validRightButton="";
                        }
                        if(leftButton!=null) {
                            validLeftButton = leftButton;
                        }
                        else{
                            validLeftButton="";
                        }
                        previousButton=b;
                        previousButtonColor=x;
                        //Toast.makeText(getApplicationContext(), "b b now the validTopBotton is " + validTopButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "b b now the validBottomBotton is " + validBottomButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "b b now the validRightBotton is " + validRightButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "b b now the validLeftBotton is " + validLeftButton, Toast.LENGTH_SHORT).show();
                        this.move="bMove";
                        break;
                    case "r":
                        b.setBackgroundResource(R.drawable.circular_button_red);
                        x.delete(0,x.length());
                        x.append("r");
                        validTopButton="";
                        validBottomButton="";
                        validRightButton="";
                        validLeftButton="";
                        previousButton=null;
                        previousButtonColor=null;
                        //Toast.makeText(getApplicationContext(), "b r now the validTopBotton is " + validTopButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "b r now the validBottomBotton is " + validBottomButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "b r now the validRightBotton is " + validRightButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "b r now the validLeftBotton is " + validLeftButton, Toast.LENGTH_SHORT).show();
                        this.move="b";
                        break;
                }
            }
        }
        else if(move.equals("r")){
            if(redToPlace!=0) {
                switch (x.toString()) {
                    case "":
                        b.setBackgroundResource(R.drawable.circular_button_red);
                        redToPlace = redToPlace - 1;
                        redOnBoard = redOnBoard + 1;
                        this.move = "b";
                        x.delete(0,x.length());
                        x.append("r");
                        break;
                    case "b":
                        b.setBackgroundResource(R.drawable.circular_button_blue);
                        this.move = "r";
                        x.delete(0,x.length());
                        x.append("b");
                        break;
                    case "r":
                        b.setBackgroundResource(R.drawable.circular_button_red);
                        this.move = "r";
                        x.delete(0,x.length());
                        x.append("r");
                        break;
                }
            }
            else{
                switch(x.toString()){
                    case "":
                        b.setBackgroundResource(R.drawable.circular_button);
                        x.delete(0,x.length());
                        x.append("");
                        validTopButton="";
                        validBottomButton="";
                        validRightButton="";
                        validLeftButton="";
                        previousButton=null;
                        previousButtonColor=null;
                        //Toast.makeText(getApplicationContext(), "r now the validTopBotton is " + validTopButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "r now the validBottomBotton is " + validBottomButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "r now the validRightBotton is " + validRightButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "r now the validLeftBotton is " + validLeftButton, Toast.LENGTH_SHORT).show();
                        this.move="r";
                        break;
                    case "b":
                        b.setBackgroundResource(R.drawable.circular_button_blue);
                        x.delete(0,x.length());
                        x.append("b");
                        validTopButton="";
                        validBottomButton="";
                        validRightButton="";
                        validLeftButton="";
                        previousButton=null;
                        previousButtonColor=null;
                        //Toast.makeText(getApplicationContext(), "r b now the validTopBotton is " + validTopButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "r b now the validBottomBotton is " + validBottomButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "r b now the validRightBotton is " + validRightButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "r b now the validLeftBotton is " + validLeftButton, Toast.LENGTH_SHORT).show();
                        this.move="r";
                        break;
                    case "r":
                        b.setBackgroundResource(R.drawable.circular_button_red);
                        x.delete(0,x.length());
                        x.append("r");
                        if(topButton!=null){
                            validTopButton=topButton;
                        }
                        else{
                            validTopButton="";
                        }
                        if(bottomButton!=null) {
                            validBottomButton = bottomButton;
                        }
                        else{
                            validBottomButton="";
                        }
                        if(rightButton!=null) {
                            validRightButton = rightButton;
                        }
                        else{
                            validRightButton="";
                        }
                        if(leftButton!=null) {
                            validLeftButton = leftButton;
                        }
                        else{
                            validLeftButton="";
                        }
                        previousButton=b;
                        previousButtonColor=x;
                        //Toast.makeText(getApplicationContext(), "r r now the validTopBotton is " + validTopButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "r r now the validBottomBotton is " + validBottomButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "r r now the validRightBotton is " + validRightButton, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "r r now the validLeftBotton is " + validLeftButton, Toast.LENGTH_SHORT).show();
                        this.move="rMove";
                        break;
                }
            }
        }
        else if(move.equals("bRemove")){
            switch(x.toString()){
                case "":
                    b.setBackgroundResource(R.drawable.circular_button);
                    x.delete(0,x.length());
                    x.append("");
                    this.move="bRemove";
                    break;
                case "b":
                    if(temp==0){
                        b.setBackgroundResource(R.drawable.circular_button);
                        x.delete(0,x.length());
                        x.append("");
                        blueOnBoard=blueOnBoard-1;
                        this.move="b";
                    }
                    else{
                        b.setBackgroundResource(R.drawable.circular_button_blue);
                        x.delete(0,x.length());
                        x.append("b");
                        this.move="bRemove";
                    }
                    break;
                case "r":
                    b.setBackgroundResource(R.drawable.circular_button_red);
                    x.delete(0,x.length());
                    x.append("r");
                    this.move="bRemove";
                    break;
            }
        }
        else if(move.equals("rRemove")){
            switch(x.toString()){
                case "":
                    b.setBackgroundResource(R.drawable.circular_button);
                    x.delete(0,x.length());
                    x.append("");
                    this.move="rRemove";
                    break;
                case "b":
                    b.setBackgroundResource(R.drawable.circular_button_blue);
                    x.delete(0,x.length());
                    x.append("b");
                    this.move="rRemove";
                    break;
                case "r":
                    if(temp==0){
                        b.setBackgroundResource(R.drawable.circular_button);
                        x.delete(0,x.length());
                        x.append("");
                        redOnBoard=redOnBoard-1;
                        this.move="r";
                    }
                    else{
                        b.setBackgroundResource(R.drawable.circular_button_red);
                        x.delete(0,x.length());
                        x.append("r");
                        this.move="rRemove";
                    }
                    break;
            }
        }
        else if(move.equals("bMove")){
            String s= b.getTag().toString();
            if(blueOnBoard>3){
                if(x.toString().equals("") && (s.equals(validTopButton) || s.equals(validBottomButton) || s.equals(validRightButton) || s.equals(validLeftButton)) ){
                    b.setBackgroundResource(R.drawable.circular_button_blue);
                    x.delete(0,x.length());
                    x.append("b");
                    previousButton.setBackgroundResource(R.drawable.circular_button);
                    previousButtonColor.delete(0,previousButtonColor.length());
                    previousButtonColor.append("");
                    this.move="r";
                    validTopButton="";
                    validLeftButton="";
                    validRightButton="";
                    validLeftButton="";
                    previousButton=null;
                    previousButtonColor=null;
                }
                else{
                    this.move="b";
                    validTopButton="";
                    validLeftButton="";
                    validRightButton="";
                    validLeftButton="";
                    previousButton=null;
                    previousButtonColor=null;
                }
            }
            else if(blueOnBoard==3){
                if(x.toString().equals("")){
                    b.setBackgroundResource(R.drawable.circular_button_blue);
                    x.delete(0,x.length());
                    x.append("b");
                    previousButton.setBackgroundResource(R.drawable.circular_button);
                    previousButtonColor.delete(0,previousButtonColor.length());
                    previousButtonColor.append("");
                    this.move="r";
                    validTopButton="";
                    validLeftButton="";
                    validRightButton="";
                    validLeftButton="";
                    previousButton=null;
                    previousButtonColor=null;
                }
                else{
                    this.move="b";
                    validTopButton="";
                    validLeftButton="";
                    validRightButton="";
                    validLeftButton="";
                    previousButton=null;
                    previousButtonColor=null;
                }
            }
        }
        else if(move.equals("rMove")){
            String s= b.getTag().toString();
            if(redOnBoard>3){
                if(x.toString().equals("") && (s.equals(validTopButton) || s.equals(validBottomButton) || s.equals(validRightButton) || s.equals(validLeftButton)) ){
                    b.setBackgroundResource(R.drawable.circular_button_red);
                    x.delete(0,x.length());
                    x.append("r");
                    previousButton.setBackgroundResource(R.drawable.circular_button);
                    previousButtonColor.delete(0,previousButtonColor.length());
                    previousButtonColor.append("");
                    this.move="b";
                    validTopButton="";
                    validLeftButton="";
                    validRightButton="";
                    validLeftButton="";
                    previousButton=null;
                    previousButtonColor=null;
                }
                else{
                    this.move="r";
                    validTopButton="";
                    validLeftButton="";
                    validRightButton="";
                    validLeftButton="";
                    previousButton=null;
                    previousButtonColor=null;
                }
            }
            else if(redOnBoard==3){
                if(x.toString().equals("")){
                    b.setBackgroundResource(R.drawable.circular_button_red);
                    x.delete(0,x.length());
                    x.append("r");
                    previousButton.setBackgroundResource(R.drawable.circular_button);
                    previousButtonColor.delete(0,previousButtonColor.length());
                    previousButtonColor.append("");
                    this.move="b";
                    validTopButton="";
                    validLeftButton="";
                    validRightButton="";
                    validLeftButton="";
                    previousButton=null;
                    previousButtonColor=null;
                }
                else{
                    this.move="r";
                    validTopButton="";
                    validLeftButton="";
                    validRightButton="";
                    validLeftButton="";
                    previousButton=null;
                    previousButtonColor=null;
                }
            }
        }
    }

    public void blueWinsPage(){
        Intent i = new Intent(this,blueWins.class);
        startActivity(i);
    }

    public void redWinsPage(){
        Intent i = new Intent(this,redWins.class);
        startActivity(i);
    }

    public void drawPage(){
        Intent i = new Intent(this,draw.class);
        startActivity(i);
    }

    public void calculateCountersInDadi(){
        blueInDadi=0;
        redInDadi=0;
        if(t1lInDadi==1){
            if(t1lc.toString().equals("b"))
                blueInDadi = blueInDadi + 1;
            else if(t1lc.toString().equals("r"))
                redInDadi = redInDadi + 1;
        }
        if(t1mInDadi==1){
            if(t1mc.toString().equals("b"))
                blueInDadi = blueInDadi + 1;
            else if(t1mc.toString().equals("r"))
                redInDadi = redInDadi + 1;
        }
        if(t1rInDadi==1){
            if(t1rc.toString().equals("b"))
                blueInDadi = blueInDadi + 1;
            else if(t1rc.toString().equals("r"))
                redInDadi = redInDadi + 1;
        }
        if(t2lInDadi==1){
            if(t2lc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(t2lc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(t2mInDadi==1){
            if(t2mc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(t2mc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(t2rInDadi==1){
            if(t2rc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(t2rc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(t3lInDadi==1){
            if(t3lc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(t3lc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(t3mInDadi==1){
            if(t3mc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(t3mc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(t3rInDadi==1){
            if(t3rc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(t3rc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(b1lInDadi==1){
            if(b1lc.toString().equals("b"))
                blueInDadi = blueInDadi + 1;
            else if(b1lc.toString().equals("r"))
                redInDadi = redInDadi + 1;
        }
        if(b1mInDadi==1){
            if(b1mc.toString().equals("b"))
                blueInDadi = blueInDadi + 1;
            else if(b1mc.toString().equals("r"))
                redInDadi = redInDadi + 1;
        }
        if(b1rInDadi==1){
            if(b1rc.toString().equals("b"))
                blueInDadi = blueInDadi + 1;
            else if(b1rc.toString().equals("r"))
                redInDadi = redInDadi + 1;
        }
        if(b2lInDadi==1){
            if(b2lc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(b2lc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(b2mInDadi==1){
            if(b2mc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(b2mc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(b2rInDadi==1){
            if(b2rc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(b2rc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(b3lInDadi==1){
            if(b3lc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(b3lc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(b3mInDadi==1){
            if(b3mc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(b3mc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(b3rInDadi==1){
            if(b3rc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(b3rc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(llInDadi==1){
            if(llc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(llc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(lmInDadi==1){
            if(lmc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(lmc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(lrInDadi==1){
            if(lrc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(lrc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(rlInDadi==1){
            if(rlc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(rlc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(rmInDadi==1){
            if(rmc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(rmc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
        if(rrInDadi==1){
            if(rrc.toString().equals("b"))
                blueInDadi=blueInDadi+1;
            else if(rrc.toString().equals("r"))
                redInDadi=redInDadi+1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        final Animation animTranstitionToRight = AnimationUtils.loadAnimation(this, R.anim.anim_transition_to_right);

        move="b";
        blueOnBoard=0;
        redOnBoard=0;
        blueToPlace=9;
        redToPlace=9;

        t1l=(Button)findViewById(R.id.t1l);
        t1m=(Button)findViewById(R.id.t1m);
        t1r=(Button)findViewById(R.id.t1r);
        t2l=(Button)findViewById(R.id.t2l);
        t2m=(Button)findViewById(R.id.t2m);
        t2r=(Button)findViewById(R.id.t2r);
        t3l=(Button)findViewById(R.id.t3l);
        t3m=(Button)findViewById(R.id.t3m);
        t3r=(Button)findViewById(R.id.t3r);
        b1l=(Button)findViewById(R.id.b1l);
        b1m=(Button)findViewById(R.id.b1m);
        b1r=(Button)findViewById(R.id.b1r);
        b2l=(Button)findViewById(R.id.b2l);
        b2m=(Button)findViewById(R.id.b2m);
        b2r=(Button)findViewById(R.id.b2r);
        b3l=(Button)findViewById(R.id.b3l);
        b3m=(Button)findViewById(R.id.b3m);
        b3r=(Button)findViewById(R.id.b3r);
        ll=(Button)findViewById(R.id.ll);
        lm=(Button)findViewById(R.id.lm);
        lr=(Button)findViewById(R.id.lr);
        rl=(Button)findViewById(R.id.rl);
        rm=(Button)findViewById(R.id.rm);
        rr=(Button)findViewById(R.id.rr);
        blueDadi=(TextView)findViewById(R.id.blueDadi);
        redDadi=(TextView)findViewById(R.id.redDadi);
        theMove=(TextView)findViewById(R.id.theMove);
        blueBoard=(TextView)findViewById(R.id.blueBoard);
        bluePlace=(TextView)findViewById(R.id.bluePlace);
        redPlace=(TextView)findViewById(R.id.redPlace);
        redBoard=(TextView)findViewById(R.id.redBoard);

        t1l.setTag("t1l");
        t1m.setTag("t1m");
        t1r.setTag("t1r");
        t2l.setTag("t2l");
        t2m.setTag("t2m");
        t2r.setTag("t2r");
        t3l.setTag("t3l");
        t3m.setTag("t3m");
        t3r.setTag("t3r");
        b1l.setTag("b1l");
        b1m.setTag("b1m");
        b1r.setTag("b1r");
        b2l.setTag("b2l");
        b2m.setTag("b2m");
        b2r.setTag("b2r");
        b3l.setTag("b3l");
        b3m.setTag("b3m");
        b3r.setTag("b3r");
        ll.setTag("ll");
        lm.setTag("lm");
        lr.setTag("lr");
        rl.setTag("rl");
        rm.setTag("rm");
        rr.setTag("rr");


        t1l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(t1l,t1lc,move,t1lInDadi,null,"ll","t1m",null);
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                                break;
                        case"r":move="rRemove";
                                break;
                        case"bRemove":move="bRemove";
                                        break;
                        case"rRemove":move="rRemove";
                                        break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();

            }
        });

        t1m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(t1m,t1mc,move,t1mInDadi,null,"t2m","t1r","t1l");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        t1r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(t1r,t1rc,move,t1rInDadi,null,"rr",null,"t1m");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        t2l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(t2l,t2lc,move,t2lInDadi,null,"lm","t2m",null);
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        t2m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(t2m,t2mc,move,t2mInDadi,"t1m","t3m","t2r","t2l");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        t2r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(t2r,t2rc,move,t2rInDadi,null,"rm",null,"t2m");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        t3l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(t3l,t3lc,move,t3lInDadi,null,"lr","t3m",null);
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        t3m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(t3m,t3mc,move,t3mInDadi,"t2m",null,"t3r","t3l");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        t3r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(t3r,t3rc,move,t3rInDadi,null,"rl",null,"t3m");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        b1l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(b1l,b1lc,move,b1lInDadi,"lr",null,"b1m",null);
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        b1m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(b1m,b1mc,move,b1mInDadi,null,"b2m","b1r","b1l");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        b1r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(b1r,b1rc,move,b1rInDadi,"rl",null,null,"b1m");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        b2l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(b2l,b2lc,move,b2lInDadi,"lm",null,"b2m",null);
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        b2m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(b2m,b2mc,move,b2mInDadi,"b1m","b3m","b2r","b2l");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        b2r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(b2r,b2rc,move,b2rInDadi,"rm",null,null,"b2m");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        b3l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(b3l,b3lc,move,b3lInDadi,"ll",null,"b3m",null);
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        b3m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(b3m,b3mc,move,b3mInDadi,"b2m",null,"b3r","b3l");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        b3r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(b3r,b3rc,move,b3rInDadi,"rr",null,null,"b3m");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(ll,llc,move,llInDadi,"t1l","b3l","lm",null);
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        lm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(lm,lmc,move,lmInDadi,"t2l","b2l","lr","ll");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        lr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(lr,lrc,move,lrInDadi,"t3l","b1l",null,"lm");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(rl,rlc,move,rlInDadi,"t3r","b1r","rm",null);
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        rm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(rm,rmc,move,rmInDadi,"t2r","b2r","rr","rl");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

        rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animScale);
                clickAction(rr,rrc,move,rrInDadi,"t1r","b3r",null,"rm");
                updateAfter();
                if(checkForDadi()==1) {
                    calculateCountersInDadi();
                    if(blueToPlace==0 && redToPlace==0){
                        if(blueInDadi==blueOnBoard || redInDadi==redOnBoard) {
                            if (blueInDadi > redInDadi) {
                                blueWinsPage();
                            } else if (redInDadi > blueInDadi) {
                                redWinsPage();
                            } else if (redInDadi == blueInDadi) {
                                if (blueOnBoard > redOnBoard)
                                    blueWinsPage();
                                else if (redOnBoard > blueOnBoard)
                                    redWinsPage();
                                else
                                    drawPage();
                            }
                        }
                    }
                    switch (move){
                        case"b":move="bRemove";
                            break;
                        case"r":move="rRemove";
                            break;
                        case"bRemove":move="bRemove";
                            break;
                        case"rRemove":move="rRemove";
                            break;
                    }
                }
                if(blueToPlace==0 && blueOnBoard==2 && redToPlace==0 && redOnBoard>blueOnBoard){
                    redWinsPage();
                }
                else if(redToPlace==0 && redOnBoard==2 && blueToPlace==0 && blueOnBoard>redOnBoard){
                    blueWinsPage();
                }
                else {
                    blueDadi.startAnimation(animRotate);
                    blueDadi.setText("" + blueInDadi);
                    redDadi.startAnimation(animRotate);
                    redDadi.setText("" + redInDadi);
                    theMove.startAnimation(animTranstitionToRight);
                    theMove.setText("" + move);
                    blueBoard.setAnimation(animRotate);
                    blueBoard.setText("" + blueOnBoard);
                    bluePlace.startAnimation(animRotate);
                    bluePlace.setText("" + blueToPlace);
                    redPlace.startAnimation(animRotate);
                    redPlace.setText("" + redToPlace);
                    redBoard.startAnimation(animRotate);
                    redBoard.setText("" + redOnBoard);
                }
                updateBefore();
            }
        });

    }
}
