package com.zing.zalo.feed.components;

import android.content.Context;
import bo.C3000l0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import is.AbstractC20814p0;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* renamed from: com.zing.zalo.feed.components.y4 */
/* loaded from: classes4.dex */
public class C8441y4 extends C16716d {

    /* renamed from: M0 */
    private C22126c0 f45882M0;

    /* renamed from: N0 */
    private C21693c f45883N0;

    public C8441y4(Context context) {
        super(context);
    }

    /* renamed from: o1 */
    public void m44971o1() {
        try {
            this.f45882M0 = new C22126c0(getContext());
            this.f45883N0 = new C21693c(getContext());
            this.f45882M0.m89106L().m89060k0(-1).m89030N(-2).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)).m89036T(AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding)).m89033Q(AbstractC23222t7.f112556e).m89049e0(this.f45883N0).m89029M(12);
            this.f45882M0.m111982x1(false);
            this.f45882M0.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            this.f45882M0.mo111964L1(AbstractC23136l9.m118742r(14.0f));
            this.f45883N0.m89106L().m89060k0(-2).m89030N(-2).m89017A(Boolean.TRUE).m89046b0(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)).m89048d0(AbstractC23136l9.m118742r(16.0f)).m89047c0(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right)).m89044a0(AbstractC23136l9.m118742r(16.0f));
            this.f45883N0.m89085A0(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_btn_postfeed));
            this.f45883N0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_more_feed));
            m89001g1(this.f45883N0);
            m89001g1(this.f45882M0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p1 */
    public void m44972p1(C3000l0 c3000l0, InterfaceC10867f interfaceC10867f, C16719g.c cVar) {
        AbstractC20814p0.m108649i0(c3000l0, this.f45882M0, interfaceC10867f);
        this.f45883N0.mo89109M0(cVar);
    }
}
