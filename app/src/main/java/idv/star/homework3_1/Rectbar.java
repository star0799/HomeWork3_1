package idv.star.homework3_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by STAR on 2015/7/2.
 */
public class Rectbar extends View {
    private Paint paint = new Paint();
    private Rect rect = new Rect();

    public Rectbar(Context context) {
        super(context);
    }

    public Rectbar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        rect.set(100, 100, 300, 300);
        canvas.drawRect(rect, paint);
    }

    class Bluerect extends View {
        private Paint paint = new Paint();
        private Rect rect = new Rect();

        public Bluerect(Context context) {
            super(context);
        }

        public Bluerect(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.FILL);
            rect.set(100, 100, 300, 300);
            canvas.drawRect(rect, paint);

        }


    }

    class RedCircle extends View {
        private Paint paint = new Paint();


        public RedCircle(Context context) {
            super(context);
        }

        public RedCircle(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(200, 200, 100, paint);

        }
    }
    class BlueCircle extends View {
        private Paint paint = new Paint();


        public BlueCircle(Context context) {
            super(context);
        }

        public BlueCircle(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(200,200,100,paint);

        }
    }
}