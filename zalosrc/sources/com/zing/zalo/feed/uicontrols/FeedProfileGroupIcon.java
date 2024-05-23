package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes4.dex */
public class FeedProfileGroupIcon extends View {

    /* renamed from: A */
    private final RectF f47340A;

    /* renamed from: p */
    private final boolean f47341p;

    /* renamed from: q */
    public int f47342q;

    /* renamed from: r */
    public boolean f47343r;

    /* renamed from: s */
    public int f47344s;

    /* renamed from: t */
    public int f47345t;

    /* renamed from: u */
    public Bitmap f47346u;

    /* renamed from: v */
    private int f47347v;

    /* renamed from: w */
    private int f47348w;

    /* renamed from: x */
    private int f47349x;

    /* renamed from: y */
    private int f47350y;

    /* renamed from: z */
    private final Paint f47351z;

    public FeedProfileGroupIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47341p = false;
        this.f47343r = false;
        this.f47351z = new Paint();
        this.f47340A = new RectF();
        m47309a();
    }

    /* renamed from: a */
    private void m47309a() {
        int i11 = (int) getResources().getDisplayMetrics().density;
        this.f47348w = i11;
        this.f47349x = (int) (i11 * 1.0f);
        this.f47350y = (int) (i11 * 4.0f);
        this.f47344s = C23212s8.m119607o(getContext(), AbstractC16781w.ProfileLineColor);
        this.f47345t = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.cProfileDot);
        this.f47347v = C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        System.currentTimeMillis();
        int width = getWidth() / 2;
        int i11 = this.f47342q;
        if (i11 <= 0) {
            i11 = width - this.f47350y;
        }
        this.f47351z.setAntiAlias(true);
        this.f47351z.setStyle(Paint.Style.FILL);
        this.f47351z.setColor(this.f47344s);
        float f11 = width;
        canvas.drawCircle(f11, f11, f11, this.f47351z);
        int sqrt = (int) Math.sqrt((i11 * i11) / 2);
        Bitmap bitmap = this.f47346u;
        if (bitmap != null) {
            int width2 = bitmap.getWidth();
            int height = this.f47346u.getHeight();
            float f12 = (sqrt * 2) - (this.f47348w * 2);
            float f13 = width2;
            float f14 = height;
            float max = Math.max(f12 / f13, f12 / f14);
            float f15 = f13 * max;
            float f16 = max * f14;
            float f17 = f11 - (f15 / 2.0f);
            float f18 = f11 - (f16 / 2.0f);
            this.f47340A.set(f17, f18, f15 + f17, f16 + f18);
            try {
                Bitmap bitmap2 = this.f47346u;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, (Rect) null, this.f47340A, (Paint) null);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
