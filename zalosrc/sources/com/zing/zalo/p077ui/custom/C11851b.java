package com.zing.zalo.p077ui.custom;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import l80.C22122a0;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.ui.custom.b */
/* loaded from: classes5.dex */
public class C11851b extends C22122a0 {

    /* renamed from: f1 */
    private boolean f61736f1;

    /* renamed from: g1 */
    private int f61737g1;

    /* renamed from: h1 */
    private final int f61738h1;

    /* renamed from: i1 */
    private int f61739i1;

    /* renamed from: j1 */
    private final int f61740j1;

    /* renamed from: k1 */
    private int f61741k1;

    /* renamed from: l1 */
    private final ShapeDrawable f61742l1;

    public C11851b(Context context) {
        super(context);
        this.f61736f1 = true;
        this.f61737g1 = -1;
        this.f61738h1 = Color.parseColor("#fffafafa");
        this.f61739i1 = 48;
        this.f61740j1 = 128;
        this.f61741k1 = (int) (AbstractC23136l9.m118698c0().getDisplayMetrics().density * 2.0f);
        this.f61742l1 = new ShapeDrawable();
        m65872X1();
    }

    /* renamed from: X1 */
    private void m65872X1() {
        int i11;
        int i12;
        this.f61742l1.setShape(new OvalShape());
        this.f61742l1.getPaint().setAntiAlias(true);
        Paint paint = this.f61742l1.getPaint();
        if (this.f61736f1) {
            i11 = this.f61737g1;
        } else {
            i11 = this.f61738h1;
        }
        paint.setColor(i11);
        Paint paint2 = this.f61742l1.getPaint();
        if (this.f61736f1) {
            i12 = this.f61739i1;
        } else {
            i12 = 128;
        }
        paint2.setAlpha(i12);
        m89106L().m89041Y(this.f61741k1);
        m89085A0(new LayerDrawable(new Drawable[]{this.f61742l1}));
        requestLayout();
    }

    /* renamed from: Y1 */
    public void m65873Y1(int i11) {
        if (this.f61741k1 != i11) {
            this.f61741k1 = i11;
            m65872X1();
        }
    }

    /* renamed from: Z1 */
    public void m65874Z1(int i11, int i12) {
        if (this.f61737g1 != i11 || this.f61739i1 != i11) {
            this.f61737g1 = i11;
            this.f61739i1 = i12;
            m65872X1();
        }
    }
}
