package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import bo.C3020p0;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import p109ds.C18065d;

/* loaded from: classes4.dex */
public final class TimelineFeedFooterReactionDescription extends ModulesView {

    /* renamed from: K */
    private C18065d f45152K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFeedFooterReactionDescription(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attributeSet");
        C18065d c18065d = new C18065d(getContext(), 0);
        this.f45152K = c18065d;
        c18065d.m89106L().m89030N(-2).m89060k0(-1).m89073z(Boolean.TRUE).m89027K(true);
        this.f45152K.m96050t1();
        mo69681L(this.f45152K);
    }

    /* renamed from: V */
    public final void m44526V(C3020p0 c3020p0) {
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        this.f45152K.m96048C1(c3020p0);
    }

    public final C18065d getReactionStatusView() {
        return this.f45152K;
    }
}
