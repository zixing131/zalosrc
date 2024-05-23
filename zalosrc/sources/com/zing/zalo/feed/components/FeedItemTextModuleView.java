package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.AbstractC16801x;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import p615wn.C29106b;

/* loaded from: classes4.dex */
public class FeedItemTextModuleView extends FeedItemBaseModuleView {
    public FeedItemTextModuleView(Context context) {
        super(context);
    }

    /* renamed from: m0 */
    private void m44149m0(Context context) {
        m43704i0(context, this.f44322M);
    }

    /* renamed from: n0 */
    private void m44150n0(Context context) {
        m43704i0(context, this.f44322M);
        this.f44326Q.mo89161z0(AbstractC23136l9.m118641B(context, AbstractC16801x.transparent));
    }

    /* renamed from: o0 */
    private void m44151o0(Context context) {
        m43704i0(context, this.f44322M);
    }

    /* renamed from: p0 */
    private void m44152p0(Context context) {
        try {
            m43702g0();
            m43704i0(context, 1);
            m43703h0(1);
            this.f44326Q.f45790f1.m44802G1(FeedItemBaseModuleView.f44318d0);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: W */
    public void mo43694W(C29106b c29106b) {
        setFeedContent(c29106b.f134937a);
        m43696Y(c29106b.f134937a, 0, c29106b.f134940d, c29106b.f134941e, c29106b.f134942f);
        mo43698b0(c29106b.f134937a, 0, c29106b.f134939c, c29106b.f134941e, c29106b.f134942f, true, c29106b.f134943g, c29106b.f134940d);
        m43700e0();
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: j0 */
    public void mo43705j0(Context context, int i11) {
        super.mo43705j0(context, i11);
        this.f44322M = i11;
        try {
            if (i11 == 1) {
                m44152p0(context);
            } else if (i11 == 4) {
                m44151o0(context);
            } else if (i11 == 6) {
                m44150n0(context);
            } else if (i11 == 11) {
                m44149m0(context);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    public FeedItemTextModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
