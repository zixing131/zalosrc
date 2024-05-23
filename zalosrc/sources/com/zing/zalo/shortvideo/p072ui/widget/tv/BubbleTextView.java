package com.zing.zalo.shortvideo.p072ui.widget.tv;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;
import s20.AbstractC26100b;
import s20.AbstractC26112n;
import v00.AbstractC27414i;

/* loaded from: classes5.dex */
public final class BubbleTextView extends AppCompatTextView {

    /* renamed from: t */
    private final Path f54702t;

    /* renamed from: u */
    private final Paint f54703u;

    /* renamed from: v */
    private float f54704v;

    /* renamed from: w */
    private int f54705w;

    /* renamed from: x */
    private int f54706x;

    /* renamed from: y */
    private int f54707y;

    /* renamed from: z */
    private final Runnable f54708z;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.tv.BubbleTextView$a */
    /* loaded from: classes5.dex */
    static final class C10843a extends AbstractC19075u implements InterfaceC18505l {
        C10843a() {
            super(1);
        }

        /* renamed from: a */
        public final void m56247a(TypedArray typedArray) {
            AbstractC19074t.m100208f(typedArray, "$this$obtain");
            BubbleTextView.this.f54704v = typedArray.getDimension(AbstractC27414i.BubbleView_border_radius, 0.0f);
            BubbleTextView.this.f54705w = typedArray.getInt(AbstractC27414i.BubbleView_arrow_anchor, 0);
            BubbleTextView.this.f54706x = typedArray.getInt(AbstractC27414i.BubbleView_arrow_alignment, 0);
            BubbleTextView.this.f54707y = typedArray.getColor(AbstractC27414i.BubbleView_fill_color, -1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m56247a((TypedArray) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BubbleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: m */
    private final void m56240m(Path path, float f11, float f12, float f13, float f14) {
        float f15 = this.f54704v;
        path.arcTo(f11 - f15, f12 - f15, f11 + f15, f12 + f15, f13, f14, false);
    }

    /* renamed from: q */
    private final void m56241q() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float cos = (float) Math.cos(0.5235987755982988d);
        float cos2 = (float) Math.cos(1.0471975511965976d);
        int i11 = this.f54705w;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int i12 = this.f54706x;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    Path path = this.f54702t;
                                    path.reset();
                                    path.moveTo(measuredWidth, measuredHeight);
                                    float f11 = this.f54704v;
                                    float f12 = measuredHeight + (cos2 * f11);
                                    m56240m(path, measuredWidth - (cos * f11), f12, -30.0f, -60.0f);
                                    float f13 = this.f54704v;
                                    float f14 = f12 - f13;
                                    path.lineTo(f13, f14);
                                    m56240m(path, f13, f14 - this.f54704v, 90.0f, 90.0f);
                                    float f15 = this.f54704v;
                                    path.lineTo(0.0f, f15);
                                    m56240m(path, this.f54704v + 0.0f, f15, 180.0f, 90.0f);
                                    float f16 = measuredWidth - this.f54704v;
                                    path.lineTo(f16, 0.0f);
                                    m56240m(path, f16, this.f54704v + 0.0f, -90.0f, 90.0f);
                                    path.close();
                                    return;
                                }
                                return;
                            }
                            Path path2 = this.f54702t;
                            path2.reset();
                            float f17 = 2;
                            float f18 = this.f54704v;
                            float f19 = (measuredWidth / f17) + (cos * f18);
                            float f21 = measuredHeight - (f18 * cos2);
                            path2.moveTo(f19, f21);
                            float f22 = f21 + this.f54704v;
                            m56240m(path2, f19, f22, -90.0f, -60.0f);
                            m56240m(path2, f19 - ((f17 * cos) * this.f54704v), f22, -30.0f, -60.0f);
                            float f23 = this.f54704v;
                            float f24 = f22 - f23;
                            path2.lineTo(f23, f24);
                            m56240m(path2, f23, f24 - this.f54704v, 90.0f, 90.0f);
                            float f25 = this.f54704v;
                            path2.lineTo(0.0f, f25);
                            m56240m(path2, this.f54704v + 0.0f, f25, 180.0f, 90.0f);
                            float f26 = measuredWidth - this.f54704v;
                            path2.lineTo(f26, 0.0f);
                            m56240m(path2, f26, this.f54704v + 0.0f, -90.0f, 90.0f);
                            float f27 = this.f54704v;
                            float f28 = (measuredHeight - (cos2 * f27)) - f27;
                            path2.lineTo(measuredWidth, f28);
                            m56240m(path2, measuredWidth - this.f54704v, f28, 0.0f, 90.0f);
                            path2.close();
                            return;
                        }
                        Path path3 = this.f54702t;
                        path3.reset();
                        float f29 = this.f54704v;
                        float f31 = cos * f29;
                        float f32 = measuredHeight - (f29 * cos2);
                        path3.moveTo(f31, f32);
                        m56240m(path3, f31, f32 + this.f54704v, -90.0f, -60.0f);
                        float f33 = this.f54704v;
                        path3.lineTo(0.0f, f33);
                        m56240m(path3, this.f54704v + 0.0f, f33, 180.0f, 90.0f);
                        float f34 = measuredWidth - this.f54704v;
                        path3.lineTo(f34, 0.0f);
                        m56240m(path3, f34, this.f54704v + 0.0f, -90.0f, 90.0f);
                        float f35 = this.f54704v;
                        float f36 = (measuredHeight - (cos2 * f35)) - f35;
                        path3.lineTo(measuredWidth, f36);
                        m56240m(path3, measuredWidth - this.f54704v, f36, 0.0f, 90.0f);
                        path3.close();
                        return;
                    }
                    return;
                }
                int i13 = this.f54706x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            Path path4 = this.f54702t;
                            path4.reset();
                            float f37 = this.f54704v;
                            float f38 = measuredWidth - (cos2 * f37);
                            float f39 = measuredHeight - (cos * f37);
                            path4.moveTo(f38, f39);
                            m56240m(path4, f38 + this.f54704v, f39, 180.0f, -60.0f);
                            float f41 = this.f54704v;
                            path4.lineTo(f41, measuredHeight);
                            m56240m(path4, f41, measuredHeight - this.f54704v, 90.0f, 90.0f);
                            float f42 = this.f54704v;
                            path4.lineTo(0.0f, f42);
                            m56240m(path4, this.f54704v + 0.0f, f42, 180.0f, 90.0f);
                            float f43 = this.f54704v;
                            float f44 = (measuredWidth - (cos2 * f43)) - f43;
                            path4.lineTo(f44, 0.0f);
                            m56240m(path4, f44, this.f54704v + 0.0f, -90.0f, 90.0f);
                            path4.close();
                            return;
                        }
                        return;
                    }
                    Path path5 = this.f54702t;
                    path5.reset();
                    float f45 = this.f54704v;
                    float f46 = measuredWidth - (cos2 * f45);
                    float f47 = 2;
                    float f48 = (measuredHeight / f47) - (f45 * cos);
                    path5.moveTo(f46, f48);
                    float f49 = f46 + this.f54704v;
                    m56240m(path5, f49, f48, 180.0f, -60.0f);
                    m56240m(path5, f49, f48 + (f47 * cos * this.f54704v), -120.0f, -60.0f);
                    float f51 = this.f54704v;
                    float f52 = f49 - f51;
                    float f53 = measuredHeight - f51;
                    path5.lineTo(f52, f53);
                    m56240m(path5, f52 - this.f54704v, f53, 0.0f, 90.0f);
                    float f54 = this.f54704v;
                    path5.lineTo(f54, measuredHeight);
                    m56240m(path5, f54, measuredHeight - this.f54704v, 90.0f, 90.0f);
                    float f55 = this.f54704v;
                    path5.lineTo(0.0f, f55);
                    m56240m(path5, this.f54704v + 0.0f, f55, 180.0f, 90.0f);
                    float f56 = this.f54704v;
                    float f57 = (measuredWidth - (cos2 * f56)) - f56;
                    path5.lineTo(f57, 0.0f);
                    m56240m(path5, f57, this.f54704v + 0.0f, -90.0f, 90.0f);
                    path5.close();
                    return;
                }
                Path path6 = this.f54702t;
                path6.reset();
                path6.moveTo(measuredWidth, 0.0f);
                float f58 = this.f54704v;
                float f59 = measuredWidth + (cos2 * f58);
                m56240m(path6, f59, (cos * f58) + 0.0f, -120.0f, -60.0f);
                float f61 = this.f54704v;
                float f62 = f59 - f61;
                float f63 = measuredHeight - f61;
                path6.lineTo(f62, f63);
                m56240m(path6, f62 - this.f54704v, f63, 0.0f, 90.0f);
                float f64 = this.f54704v;
                path6.lineTo(f64, measuredHeight);
                m56240m(path6, f64, measuredHeight - this.f54704v, 90.0f, 90.0f);
                float f65 = this.f54704v;
                path6.lineTo(0.0f, f65);
                m56240m(path6, this.f54704v + 0.0f, f65, 180.0f, 90.0f);
                path6.close();
                return;
            }
            int i14 = this.f54706x;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        Path path7 = this.f54702t;
                        path7.reset();
                        float f66 = this.f54704v;
                        float f67 = measuredWidth - (cos * f66);
                        float f68 = f66 * cos2;
                        path7.moveTo(f67, f68);
                        m56240m(path7, f67, f68 - this.f54704v, 90.0f, -60.0f);
                        float f69 = measuredHeight - this.f54704v;
                        path7.lineTo(measuredWidth, f69);
                        m56240m(path7, measuredWidth - this.f54704v, f69, 0.0f, 90.0f);
                        float f71 = this.f54704v;
                        path7.lineTo(f71, measuredHeight);
                        m56240m(path7, f71, measuredHeight - this.f54704v, 90.0f, 90.0f);
                        float f72 = this.f54704v;
                        float f73 = f72 + (cos2 * f72);
                        path7.lineTo(0.0f, f73);
                        m56240m(path7, this.f54704v + 0.0f, f73, 180.0f, 90.0f);
                        path7.close();
                        return;
                    }
                    return;
                }
                Path path8 = this.f54702t;
                path8.reset();
                float f74 = 2;
                float f75 = this.f54704v;
                float f76 = (measuredWidth / f74) - (cos * f75);
                float f77 = f75 * cos2;
                path8.moveTo(f76, f77);
                float f78 = f77 - this.f54704v;
                m56240m(path8, f76, f78, 90.0f, -60.0f);
                m56240m(path8, f76 + (f74 * cos * this.f54704v), f78, 150.0f, -60.0f);
                float f79 = this.f54704v;
                float f81 = measuredWidth - f79;
                float f82 = f78 + f79;
                path8.lineTo(f81, f82);
                m56240m(path8, f81, f82 + this.f54704v, -90.0f, 90.0f);
                float f83 = this.f54704v;
                float f84 = f81 + f83;
                float f85 = measuredHeight - f83;
                path8.lineTo(f84, f85);
                m56240m(path8, f84 - this.f54704v, f85, 0.0f, 90.0f);
                float f86 = this.f54704v;
                path8.lineTo(f86, measuredHeight);
                m56240m(path8, f86, measuredHeight - this.f54704v, 90.0f, 90.0f);
                float f87 = this.f54704v;
                float f88 = f87 + (cos2 * f87);
                path8.lineTo(0.0f, f88);
                m56240m(path8, this.f54704v + 0.0f, f88, 180.0f, 90.0f);
                path8.close();
                return;
            }
            Path path9 = this.f54702t;
            path9.reset();
            path9.moveTo(0.0f, 0.0f);
            float f89 = this.f54704v;
            float f91 = 0.0f - (cos2 * f89);
            m56240m(path9, (cos * f89) + 0.0f, f91, 150.0f, -60.0f);
            float f92 = this.f54704v;
            float f93 = measuredWidth - f92;
            float f94 = f91 + f92;
            path9.lineTo(f93, f94);
            m56240m(path9, f93, f94 + this.f54704v, -90.0f, 90.0f);
            float f95 = this.f54704v;
            float f96 = f93 + f95;
            float f97 = measuredHeight - f95;
            path9.lineTo(f96, f97);
            m56240m(path9, f96 - this.f54704v, f97, 0.0f, 90.0f);
            float f98 = this.f54704v;
            path9.lineTo(f98, measuredHeight);
            m56240m(path9, f98, measuredHeight - this.f54704v, 90.0f, 90.0f);
            path9.close();
            return;
        }
        int i15 = this.f54706x;
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 == 2) {
                    Path path10 = this.f54702t;
                    path10.reset();
                    path10.moveTo(0.0f, measuredHeight);
                    float f99 = this.f54704v;
                    float f100 = 0.0f - (cos2 * f99);
                    m56240m(path10, f100, measuredHeight - (cos * f99), 60.0f, -60.0f);
                    float f101 = this.f54704v;
                    float f102 = f100 + f101;
                    path10.lineTo(f102, f101);
                    m56240m(path10, f102 + this.f54704v, f101, 180.0f, 90.0f);
                    float f103 = measuredWidth - this.f54704v;
                    path10.lineTo(f103, 0.0f);
                    m56240m(path10, f103, this.f54704v + 0.0f, -90.0f, 90.0f);
                    float f104 = this.f54704v;
                    float f105 = f103 + f104;
                    float f106 = measuredHeight - f104;
                    path10.lineTo(f105, f106);
                    m56240m(path10, f105 - this.f54704v, f106, 0.0f, 90.0f);
                    path10.close();
                    return;
                }
                return;
            }
            Path path11 = this.f54702t;
            path11.reset();
            float f107 = this.f54704v;
            float f108 = cos2 * f107;
            float f109 = 2;
            float f110 = (measuredHeight / f109) + (f107 * cos);
            path11.moveTo(f108, f110);
            float f111 = f108 - this.f54704v;
            m56240m(path11, f111, f110, 0.0f, -60.0f);
            m56240m(path11, f111, f110 - ((f109 * cos) * this.f54704v), 60.0f, -60.0f);
            float f112 = this.f54704v;
            float f113 = f111 + f112;
            path11.lineTo(f113, f112);
            m56240m(path11, f113 + this.f54704v, f112, 180.0f, 90.0f);
            float f114 = measuredWidth - this.f54704v;
            path11.lineTo(f114, 0.0f);
            m56240m(path11, f114, this.f54704v + 0.0f, -90.0f, 90.0f);
            float f115 = this.f54704v;
            float f116 = f114 + f115;
            float f117 = measuredHeight - f115;
            path11.lineTo(f116, f117);
            m56240m(path11, f116 - this.f54704v, f117, 0.0f, 90.0f);
            float f118 = this.f54704v;
            float f119 = (cos2 * f118) + f118;
            path11.lineTo(f119, measuredHeight);
            m56240m(path11, f119, measuredHeight - this.f54704v, 90.0f, 90.0f);
            path11.close();
            return;
        }
        Path path12 = this.f54702t;
        path12.reset();
        float f120 = this.f54704v;
        float f121 = cos2 * f120;
        float f122 = cos * f120;
        path12.moveTo(f121, f122);
        m56240m(path12, f121 - this.f54704v, f122, 0.0f, -60.0f);
        float f123 = measuredWidth - this.f54704v;
        path12.lineTo(f123, 0.0f);
        m56240m(path12, f123, this.f54704v + 0.0f, -90.0f, 90.0f);
        float f124 = this.f54704v;
        float f125 = f123 + f124;
        float f126 = measuredHeight - f124;
        path12.lineTo(f125, f126);
        m56240m(path12, f125 - this.f54704v, f126, 0.0f, 90.0f);
        float f127 = this.f54704v;
        float f128 = (cos2 * f127) + f127;
        path12.lineTo(f128, measuredHeight);
        m56240m(path12, f128, measuredHeight - this.f54704v, 90.0f, 90.0f);
        path12.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m56242r(BubbleTextView bubbleTextView, View view) {
        AbstractC19074t.m100208f(bubbleTextView, "this$0");
        bubbleTextView.m56244n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m56243s(BubbleTextView bubbleTextView) {
        AbstractC19074t.m100208f(bubbleTextView, "this$0");
        AbstractC26112n.m134367H(bubbleTextView);
    }

    /* renamed from: n */
    public final void m56244n() {
        AbstractC26112n.m134367H(this);
        removeCallbacks(this.f54708z);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        canvas.drawPath(this.f54702t, this.f54703u);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.widget.tv.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BubbleTextView.m56242r(BubbleTextView.this, view);
            }
        });
        AbstractC26112n.m134367H(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        m56241q();
    }

    /* renamed from: p */
    public final boolean m56245p() {
        return AbstractC26112n.m134380U(this);
    }

    /* renamed from: u */
    public final void m56246u() {
        if (AbstractC26112n.m134380U(this)) {
            return;
        }
        AbstractC26112n.m134431w0(this);
        postDelayed(this.f54708z, 5000L);
    }

    public /* synthetic */ BubbleTextView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubbleTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f54702t = new Path();
        Paint paint = new Paint();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        this.f54703u = paint;
        this.f54708z = new Runnable() { // from class: com.zing.zalo.shortvideo.ui.widget.tv.b
            @Override // java.lang.Runnable
            public final void run() {
                BubbleTextView.m56243s(BubbleTextView.this);
            }
        };
        int[] iArr = AbstractC27414i.BubbleView;
        AbstractC19074t.m100207e(iArr, "BubbleView");
        AbstractC26100b.m134297c(attributeSet, context, iArr, new C10843a());
        int i12 = this.f54705w;
        if (i12 == 0) {
            AbstractC26112n.m134415o0(this, getPaddingLeft() * 2);
        } else if (i12 == 1) {
            AbstractC26112n.m134419q0(this, getPaddingTop() * 2);
        } else if (i12 == 2) {
            AbstractC26112n.m134417p0(this, getPaddingRight() * 2);
        } else if (i12 == 3) {
            AbstractC26112n.m134411m0(this, getPaddingBottom() * 2);
        }
        paint.setColor(this.f54707y);
    }
}
