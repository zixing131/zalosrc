package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.AbstractC17466e;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes4.dex */
public class FeedItemHeaderBarModuleView extends ModulesView {

    /* renamed from: K */
    protected int f44413K;

    /* renamed from: L */
    C8406v1 f44414L;

    /* renamed from: M */
    C8254d2 f44415M;

    public FeedItemHeaderBarModuleView(Context context) {
        super(context);
    }

    /* renamed from: V */
    private void m43755V(Context context, int i11, boolean z11) {
        C8406v1 c8406v1 = new C8406v1(context);
        this.f44414L = c8406v1;
        c8406v1.m89106L().m89060k0(-1).m89030N(-2);
        this.f44414L.m44915A1(context, i11);
        this.f44414L.m44930d2(z11);
        C8254d2 c8254d2 = new C8254d2(context);
        this.f44415M = c8254d2;
        c8254d2.m89106L().m89060k0(-1).m89030N(-2);
        this.f44415M.m44652o1(context, i11, z11);
        mo69681L(this.f44414L);
        mo69681L(this.f44415M);
    }

    /* renamed from: X */
    private void m43756X(Context context, int i11) {
        int i12 = this.f44413K;
        if (i12 != 2 && i12 != 3) {
            if (i12 != 13) {
                setBackground(AbstractC23136l9.m118665N(context, AbstractC17466e.white));
                return;
            } else {
                setBackground(AbstractC23136l9.m118665N(context, AbstractC17466e.transparent));
                return;
            }
        }
        setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.ProfilePrimaryBackgroundColor));
    }

    /* renamed from: W */
    public void m43757W(Context context, int i11, boolean z11) {
        this.f44413K = i11;
        try {
            m43756X(context, i11);
            m43755V(context, i11, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Y */
    public void m43758Y(boolean z11) {
        int i11;
        C8406v1 c8406v1 = this.f44414L;
        int i12 = 0;
        if (c8406v1 != null) {
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            c8406v1.mo44614b1(i11);
        }
        C8254d2 c8254d2 = this.f44415M;
        if (c8254d2 != null) {
            if (!z11) {
                i12 = 8;
            }
            c8254d2.mo44614b1(i12);
        }
    }

    public C8406v1 getHeaderBarModule() {
        return this.f44414L;
    }

    public C8254d2 getLocalHeaderBarModule() {
        return this.f44415M;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8254d2 c8254d2 = this.f44415M;
        if (c8254d2 != null) {
            c8254d2.m44653r1();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C8406v1 c8406v1 = this.f44414L;
        if (c8406v1 != null) {
            c8406v1.m44922U1();
        }
        C8254d2 c8254d2 = this.f44415M;
        if (c8254d2 != null) {
            c8254d2.m44654s1();
        }
    }

    public void setOnAvatarClickListener(C16719g.c cVar) {
        C8406v1 c8406v1 = this.f44414L;
        if (c8406v1 != null) {
            c8406v1.m44933g2(cVar);
        }
        C8254d2 c8254d2 = this.f44415M;
        if (c8254d2 != null) {
            c8254d2.m44659x1(cVar);
        }
    }

    public FeedItemHeaderBarModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
