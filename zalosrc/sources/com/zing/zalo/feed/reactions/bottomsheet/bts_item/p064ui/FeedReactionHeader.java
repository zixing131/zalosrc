package com.zing.zalo.feed.reactions.bottomsheet.bts_item.p064ui;

import android.content.Context;
import android.util.AttributeSet;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import l80.C22126c0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26707f;

/* loaded from: classes4.dex */
public final class FeedReactionHeader extends ModulesView {

    /* renamed from: K */
    private C22126c0 f47229K;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeedReactionHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
        m47210W();
    }

    /* renamed from: W */
    private final void m47210W() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C26703b m137293a = C26705d.m137293a(context, AbstractC2814h.t_small);
        C22126c0 c22126c0 = new C22126c0(getContext());
        this.f47229K = c22126c0;
        c22126c0.m89106L().m89041Y(AbstractC23222t7.f112586t);
        C22126c0 c22126c02 = this.f47229K;
        C22126c0 c22126c03 = null;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("headerTitle");
            c22126c02 = null;
        }
        new C26707f(c22126c02).m137318a(m137293a);
        C22126c0 c22126c04 = this.f47229K;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("headerTitle");
            c22126c04 = null;
        }
        c22126c04.m111962J1(C23212s8.m119606n(AbstractC2807a.text_tertiary));
        setBackgroundColor(C23212s8.m119606n(AbstractC2807a.bottom_sheet_container));
        C22126c0 c22126c05 = this.f47229K;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("headerTitle");
        } else {
            c22126c03 = c22126c05;
        }
        mo69681L(c22126c03);
    }

    /* renamed from: V */
    public final void m47211V(String str) {
        AbstractC19074t.m100208f(str, "text");
        C22126c0 c22126c0 = this.f47229K;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("headerTitle");
            c22126c0 = null;
        }
        c22126c0.m111959G1(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedReactionHeader(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        m47210W();
    }
}
