package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;

/* loaded from: classes6.dex */
public class EmojiView extends View {

    /* renamed from: p */
    TextPaint f69213p;

    /* renamed from: q */
    Paint f69214q;

    /* renamed from: r */
    Paint f69215r;

    /* renamed from: s */
    Paint f69216s;

    /* renamed from: t */
    private final float f69217t;

    /* renamed from: u */
    StaticLayout f69218u;

    /* renamed from: v */
    public boolean f69219v;

    public EmojiView(Context context) {
        super(context);
        this.f69217t = AbstractC23136l9.m118742r(1.75f);
        this.f69219v = false;
        TextPaint textPaint = new TextPaint(1);
        this.f69213p = textPaint;
        textPaint.setTextSize(AbstractC23136l9.m118742r(15.0f));
    }

    /* renamed from: a */
    public void m75699a() {
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(new float[]{0.33f, 0.33f, 0.33f, 0.0f, 100.0f, 0.33f, 0.33f, 0.33f, 0.0f, 100.0f, 0.33f, 0.33f, 0.33f, 0.0f, 100.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        Paint paint = new Paint();
        this.f69214q = paint;
        paint.setColorFilter(colorMatrixColorFilter);
        invalidate();
    }

    /* renamed from: b */
    public void m75700b() {
        this.f69214q = null;
        invalidate();
    }

    /* renamed from: c */
    public void m75701c(int i11, int i12) {
        if (this.f69215r == null) {
            Paint paint = new Paint();
            this.f69215r = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f69215r.setFlags(1);
        }
        if (this.f69216s == null) {
            Paint paint2 = new Paint();
            this.f69216s = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.f69216s.setFlags(1);
            this.f69216s.setStrokeWidth(this.f69217t);
        }
        this.f69215r.setColor(i11);
        this.f69216s.setColor(i12);
        this.f69219v = true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f69219v) {
            if (this.f69215r != null) {
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float min = Math.min(getWidth(), getHeight()) / 2;
                canvas.drawCircle(width, height, min, this.f69215r);
                canvas.drawCircle(width, height, min - (this.f69217t / 2.0f), this.f69216s);
            } else {
                AbstractC11531v0.m62166L1().setBounds(0, 0, getWidth(), getHeight());
                AbstractC11531v0.m62166L1().draw(canvas);
            }
        }
        Paint paint = this.f69214q;
        if (paint != null) {
            canvas.saveLayer(null, paint);
        }
        StaticLayout staticLayout = this.f69218u;
        if (staticLayout != null) {
            int lineWidth = (int) staticLayout.getLineWidth(0);
            int height2 = this.f69218u.getHeight();
            canvas.save();
            canvas.translate((getWidth() - lineWidth) / 2, (getHeight() - height2) / 2);
            this.f69218u.draw(canvas);
            canvas.restore();
        }
        if (this.f69214q != null) {
            canvas.restore();
        }
    }

    public void setData(String str) {
        this.f69218u = AbstractC23214t.m119631r(str, this.f69213p);
    }

    public void setEmojiSize(int i11) {
        this.f69213p.setTextSize(i11);
    }
}
