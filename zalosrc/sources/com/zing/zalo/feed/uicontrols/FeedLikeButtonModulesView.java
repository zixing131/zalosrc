package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.feed.components.C8240b6;
import com.zing.zalo.uidrawing.ModulesView;

/* loaded from: classes4.dex */
public class FeedLikeButtonModulesView extends ModulesView {

    /* renamed from: K */
    C8240b6 f47339K;

    public FeedLikeButtonModulesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: V */
    public void m47306V(int i11, int i12, int i13) {
        C8240b6 c8240b6 = new C8240b6(getContext(), i11);
        this.f47339K = c8240b6;
        c8240b6.m89106L().m89028L(i12, i13).m89027K(true);
        this.f47339K.m44635B1();
        mo44090O();
        mo69681L(this.f47339K);
    }

    /* renamed from: W */
    public void m47307W(int i11, int i12) {
        C8240b6 c8240b6 = this.f47339K;
        if (c8240b6 != null) {
            c8240b6.m89106L().m89028L(i11, i12).m89027K(true);
        }
    }

    /* renamed from: X */
    public void m47308X(boolean z11, int i11) {
        C8240b6 c8240b6 = this.f47339K;
        if (c8240b6 != null) {
            c8240b6.m44636E1(z11, i11);
        }
    }
}
