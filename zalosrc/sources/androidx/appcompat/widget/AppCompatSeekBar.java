package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p175g0.AbstractC19178a;

/* loaded from: classes2.dex */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: p */
    private final C1179j f4276p;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f4276p.m5573h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f4276p.m5574i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4276p.m5572g(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC1199p1.m5678a(this, getContext());
        C1179j c1179j = new C1179j(this);
        this.f4276p = c1179j;
        c1179j.mo5568c(attributeSet, i11);
    }
}
