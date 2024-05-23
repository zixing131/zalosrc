package com.zing.zalo.feed.components;

import ac.C0708i;
import android.content.Context;
import android.util.AttributeSet;
import ao.InterfaceC2259a;
import bo.AbstractC3059y0;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.AbstractC17466e;
import me0.AbstractC23136l9;

/* loaded from: classes4.dex */
public class FeedItemFooterActionBarModulesView extends ModulesView {

    /* renamed from: K */
    private C8289h1 f44394K;

    public FeedItemFooterActionBarModulesView(Context context) {
        super(context);
    }

    /* renamed from: V */
    private void m43744V(int i11) {
        int i12;
        if (AbstractC3059y0.m14707b(i11)) {
            i12 = 1;
        } else if (i11 == 4) {
            i12 = 2;
        } else {
            i12 = -1;
        }
        if (this.f44394K != null) {
            C0708i c0708i = new C0708i();
            c0708i.m1072c(ZinstantMetaConstant.IMPRESSION_META_TYPE, i12);
            this.f44394K.setTrackingExtraData(c0708i);
        }
    }

    /* renamed from: W */
    public void m43745W() {
        C8289h1 c8289h1 = new C8289h1(getContext());
        this.f44394K = c8289h1;
        c8289h1.m89106L().m89060k0(-1).m89030N(-2);
        setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC17466e.white));
        this.f44394K.setIdTracking("feed_footer");
        mo69681L(this.f44394K);
    }

    /* renamed from: X */
    public void m43746X(C3000l0 c3000l0, int i11, boolean z11, InterfaceC2259a interfaceC2259a, int i12, int i13) {
        C8289h1 c8289h1 = this.f44394K;
        if (c8289h1 != null) {
            c8289h1.m44689v1(c3000l0, i11, z11, interfaceC2259a, i13);
        }
        m43744V(i12);
    }

    /* renamed from: Y */
    public void m43747Y(C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, int i11, int i12) {
        C8289h1 c8289h1 = this.f44394K;
        if (c8289h1 != null) {
            c8289h1.m44690w1(c3020p0, interfaceC2259a, i12);
        }
        m43744V(i11);
    }

    public FeedItemFooterActionBarModulesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
