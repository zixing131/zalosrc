package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p175g0.AbstractC19178a;

/* loaded from: classes2.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: p */
    private final C1176i f4275p;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        Bitmap m5567b = this.f4275p.m5567b();
        if (m5567b != null) {
            setMeasuredDimension(View.resolveSizeAndState(m5567b.getWidth() * getNumStars(), i11, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC1199p1.m5678a(this, getContext());
        C1176i c1176i = new C1176i(this);
        this.f4275p = c1176i;
        c1176i.mo5568c(attributeSet, i11);
    }
}
