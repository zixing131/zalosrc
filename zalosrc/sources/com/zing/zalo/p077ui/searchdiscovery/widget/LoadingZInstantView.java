package com.zing.zalo.p077ui.searchdiscovery.widget;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.util.AttributeSet;
import android.view.View;
import bi0.AbstractC2808b;
import com.zing.zalo.p077ui.searchdiscovery.widget.LoadingZInstantView;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import pm0.C24848g0;
import qm0.AbstractC25368s;

/* loaded from: classes6.dex */
public final class LoadingZInstantView extends ModulesView {

    /* renamed from: K */
    private ValueAnimator f67218K;

    public LoadingZInstantView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m73044W();
    }

    /* renamed from: W */
    private final void m73044W() {
        int i11;
        List m131506n;
        setClickable(true);
        setFocusable(true);
        m88987U(-1, -1);
        Context context = getContext();
        if (C23212s8.m119603k()) {
            i11 = AbstractC2808b.ng10;
        } else {
            i11 = AbstractC2808b.ng90;
        }
        int m118641B = AbstractC23136l9.m118641B(context, i11);
        float m118712h = AbstractC23136l9.m118712h(getContext(), 4.0f);
        int m118712h2 = AbstractC23136l9.m118712h(getContext(), 16.0f);
        int m118712h3 = AbstractC23136l9.m118712h(getContext(), 18.0f);
        int m118712h4 = AbstractC23136l9.m118712h(getContext(), 28.0f);
        int m118712h5 = AbstractC23136l9.m118712h(getContext(), 68.0f);
        int m118712h6 = AbstractC23136l9.m118712h(getContext(), 122.0f);
        PaintDrawable paintDrawable = new PaintDrawable(m118641B);
        paintDrawable.setCornerRadius(m118712h);
        C24848g0 c24848g0 = C24848g0.f119245a;
        PaintDrawable paintDrawable2 = new PaintDrawable(m118641B);
        paintDrawable2.setCornerRadius(m118712h);
        m131506n = AbstractC25368s.m131506n(paintDrawable, paintDrawable2);
        ArrayList arrayList = new ArrayList(3);
        int i12 = 0;
        for (int i13 = 3; i12 < i13; i13 = 3) {
            C16719g c16719g = new C16719g(getContext());
            c16719g.m89085A0((Drawable) m131506n.get(0));
            int i14 = m118712h6 * i12;
            c16719g.m89106L().m89028L(-1, m118712h3).m89032P(m118712h2, m118712h2 + i14, m118712h2, 0);
            mo69681L(c16719g);
            C16719g c16719g2 = new C16719g(getContext());
            c16719g2.m89085A0((Drawable) m131506n.get(1));
            c16719g2.m89106L().m89028L(-1, m118712h5).m89032P(m118712h2, m118712h2 + m118712h4 + i14, m118712h2, 0);
            mo69681L(c16719g2);
            arrayList.add(c16719g2);
            i12++;
        }
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: da0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23) {
                LoadingZInstantView.m73045X(LoadingZInstantView.this, view, i15, i16, i17, i18, i19, i21, i22, i23);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static final void m73045X(LoadingZInstantView loadingZInstantView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(loadingZInstantView, "this$0");
        if (view.getVisibility() == 0) {
            loadingZInstantView.m73046Y();
        } else {
            loadingZInstantView.m73047a0();
        }
    }

    /* renamed from: Y */
    private final void m73046Y() {
        ValueAnimator valueAnimator = this.f67218K;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            setAlpha(0.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.33f, 1.0f);
            if (ofFloat != null) {
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(2);
                ofFloat.setDuration(750L);
                if (ScanQRUIUtils.f49155a.m49639x()) {
                    setLayerType(2, null);
                }
                ofFloat.start();
            } else {
                ofFloat = null;
            }
            this.f67218K = ofFloat;
        }
    }

    /* renamed from: a0 */
    private final void m73047a0() {
        ValueAnimator valueAnimator = this.f67218K;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.f67218K = null;
    }

    public LoadingZInstantView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m73044W();
    }
}
