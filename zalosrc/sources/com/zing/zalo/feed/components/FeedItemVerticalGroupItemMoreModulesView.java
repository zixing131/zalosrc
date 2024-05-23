package com.zing.zalo.feed.components;

import android.content.Context;
import bo.C3000l0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes4.dex */
public class FeedItemVerticalGroupItemMoreModulesView extends ModulesView {

    /* renamed from: K */
    private C22126c0 f44837K;

    public FeedItemVerticalGroupItemMoreModulesView(Context context) {
        super(context);
    }

    /* renamed from: V */
    public void m44165V() {
        this.f44837K = new C22126c0(getContext());
        setPadding(0, 0, 0, AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_bottom));
        this.f44837K.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(44.0f)).m89036T(AbstractC23136l9.m118742r(-12.0f)).m89029M(15);
        this.f44837K.mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        this.f44837K.m111962J1(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.cLink1));
        this.f44837K.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        mo69681L(this.f44837K);
    }

    public void setFeedContent(C3000l0 c3000l0) {
        if (c3000l0 == null) {
            return;
        }
        if (c3000l0.f11911y) {
            this.f44837K.m111958F1(AbstractC8020f0.btn_collapse);
        } else {
            this.f44837K.m111958F1(AbstractC8020f0.btn_see_more);
        }
    }

    public void setOnActionClickListener(C16719g.c cVar) {
        C22126c0 c22126c0 = this.f44837K;
        if (c22126c0 != null) {
            c22126c0.mo89109M0(cVar);
        }
    }
}
