package com.zing.zalo.camera.colorpalette.customview;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;

/* loaded from: classes3.dex */
public class ColorButton extends View {
    public static final C7578a Companion = new C7578a(null);

    /* renamed from: u */
    private static final int f41044u = AbstractC23222t7.f112598z;

    /* renamed from: v */
    private static final int f41045v = AbstractC23222t7.f112550b;

    /* renamed from: p */
    private boolean f41046p;

    /* renamed from: q */
    private int f41047q;

    /* renamed from: r */
    private int f41048r;

    /* renamed from: s */
    private int f41049s;

    /* renamed from: t */
    private Paint f41050t;

    /* renamed from: com.zing.zalo.camera.colorpalette.customview.ColorButton$a */
    /* loaded from: classes3.dex */
    public static final class C7578a {
        private C7578a() {
        }

        public /* synthetic */ C7578a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorButton(Context context) {
        super(context);
        int i11;
        AbstractC19074t.m100208f(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AbstractC23136l9.m118742r(2.0f));
        if (this.f41046p) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        paint.setColor(i11);
        this.f41050t = paint;
        this.f41047q = f41044u;
        this.f41048r = f41045v;
    }

    /* renamed from: a */
    public final boolean m39182a() {
        return this.f41046p;
    }

    public final Paint getPaintStroke() {
        return this.f41050t;
    }

    public final int getRadius() {
        return this.f41047q;
    }

    public final int getStrokePadding() {
        return this.f41048r;
    }

    public final int getViewSize() {
        return this.f41049s;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec(this.f41049s, 1073741824));
    }

    public final void setButtonSelected(boolean z11) {
        this.f41046p = z11;
    }

    protected final void setPaintStroke(Paint paint) {
        AbstractC19074t.m100208f(paint, "<set-?>");
        this.f41050t = paint;
    }

    protected final void setRadius(int i11) {
        this.f41047q = i11;
    }

    public final void setSize(int i11) {
        this.f41049s = i11;
        this.f41047q = i11 / 2;
    }

    protected final void setStrokePadding(int i11) {
        this.f41048r = i11;
    }

    protected final void setViewSize(int i11) {
        this.f41049s = i11;
    }
}
