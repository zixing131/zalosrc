package com.zing.zalo.p077ui.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import me0.AbstractC23136l9;

/* loaded from: classes5.dex */
public class RevealView extends View {

    /* renamed from: p */
    Paint f61704p;

    /* renamed from: q */
    float f61705q;

    /* renamed from: r */
    float f61706r;

    /* renamed from: s */
    int f61707s;

    /* renamed from: t */
    int f61708t;

    /* renamed from: u */
    int f61709u;

    public RevealView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f61707s, this.f61708t, this.f61705q, this.f61704p);
    }

    public RevealView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RevealView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f61705q = 0.0f;
        this.f61706r = AbstractC23136l9.m118742r(80.0f);
        this.f61707s = 0;
        this.f61708t = 0;
        this.f61709u = -1;
        Paint paint = new Paint(1);
        this.f61704p = paint;
        paint.setStyle(Paint.Style.FILL);
    }
}
