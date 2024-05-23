package com.zing.zalo.uicontrol.voice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.uicontrol.voice.C16672b;
import com.zing.zalo.zdesign.component.Button;
import fi0.C18955b;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes4.dex */
public final class BoardRecordButton extends FrameLayout implements C16672b.a {

    /* renamed from: p */
    private final Button f84519p;

    /* renamed from: q */
    private final int f84520q;

    /* renamed from: r */
    private final int f84521r;

    /* renamed from: s */
    private final int f84522s;

    /* renamed from: t */
    private float f84523t;

    /* renamed from: u */
    private float f84524u;

    /* renamed from: v */
    private float f84525v;

    /* renamed from: w */
    private final C16672b f84526w;

    /* renamed from: x */
    private final int f84527x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardRecordButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        int m118641B = AbstractC23136l9.m118641B(context, AbstractC2808b.f150821b60);
        this.f84521r = m118641B;
        this.f84522s = C23212s8.m119607o(context, AbstractC2807a.button_primary_danger_background);
        C16672b c16672b = new C16672b(context, this);
        this.f84526w = c16672b;
        this.f84527x = c16672b.m88861i();
        int i11 = AbstractC8915g0.ButtonLargeVoice_Primary_Default;
        this.f84520q = C18955b.m99467a(context, i11).m99451b();
        Button m88821c = m88821c(context, i11);
        this.f84519p = m88821c;
        addView(m88821c);
        setWillNotDraw(false);
        c16672b.m88863k(m118641B);
    }

    /* renamed from: c */
    private final Button m88821c(Context context, int i11) {
        Button button = new Button(context);
        button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        button.setSupportiveIcon(AbstractC16803z.ic_mic_voice_32);
        button.m90539c(i11);
        return button;
    }

    @Override // com.zing.zalo.uicontrol.voice.C16672b.a
    /* renamed from: a */
    public void mo88822a() {
        invalidate();
    }

    /* renamed from: b */
    public final void m88823b(int i11) {
        int i12;
        this.f84519p.m90539c(i11);
        if (i11 == AbstractC8915g0.ButtonLargeVoice_Primary_Red) {
            i12 = this.f84522s;
        } else {
            i12 = this.f84521r;
        }
        this.f84526w.m88863k(i12);
    }

    /* renamed from: d */
    public final void m88824d() {
        this.f84526w.m88862j();
    }

    /* renamed from: e */
    public final void m88825e() {
        this.f84526w.m88864l();
    }

    /* renamed from: f */
    public final void m88826f(int i11) {
        this.f84526w.m88865m(i11);
    }

    public final Button getInnerButton() {
        return this.f84519p;
    }

    public final int getMaxPadding() {
        return this.f84527x;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m88824d();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        this.f84526w.m88860h(canvas, this.f84523t, this.f84524u, this.f84525v);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = (i13 - i11) / 2;
        int i16 = (i14 - i12) / 2;
        int measuredWidth = this.f84519p.getMeasuredWidth() / 2;
        this.f84523t = i15;
        this.f84524u = i16;
        this.f84525v = measuredWidth;
        this.f84519p.layout(i15 - measuredWidth, i16 - measuredWidth, i15 + measuredWidth, i16 + measuredWidth);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f84520q, 1073741824);
        this.f84519p.measure(makeMeasureSpec, makeMeasureSpec);
        setMeasuredDimension(View.resolveSize(this.f84519p.getMeasuredWidth() + (this.f84526w.m88861i() * 2), i11), View.resolveSize(this.f84519p.getMeasuredHeight() + (this.f84526w.m88861i() * 2), i12));
    }

    public final void setSupportiveIcon(Drawable drawable) {
        this.f84519p.setSupportiveIcon(drawable);
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardRecordButton(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }
}
