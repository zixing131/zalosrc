package com.zing.zalo.feed.components;

import android.content.Context;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import is.AbstractC20814p0;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: com.zing.zalo.feed.components.i1 */
/* loaded from: classes4.dex */
public class C8298i1 extends C16716d {

    /* renamed from: M0 */
    private C8289h1 f45406M0;

    /* renamed from: N0 */
    private C16719g f45407N0;

    public C8298i1(Context context) {
        super(context);
    }

    /* renamed from: o1 */
    public void m44705o1() {
        this.f45406M0 = new C8289h1(getContext());
        this.f45407N0 = new C16719g(getContext());
        this.f45406M0.m89106L().m89060k0(-2).m89030N(-2).m89048d0(AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding)).m89044a0(AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding));
        this.f45406M0.mo44614b1(8);
        this.f45406M0.mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        this.f45407N0.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(1.0f)).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.oa_padding)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.oa_padding)).m89023G(this.f45406M0);
        this.f45407N0.mo44614b1(8);
        this.f45407N0.mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.ItemSeparatorColor));
        m89001g1(this.f45406M0);
        m89001g1(this.f45407N0);
    }

    /* renamed from: p1 */
    public void m44706p1(C3000l0 c3000l0, boolean z11, InterfaceC2259a interfaceC2259a) {
        int i11;
        if (c3000l0 != null) {
            try {
                if (c3000l0.m14322a0() != null) {
                    C3020p0 m14322a0 = c3000l0.m14322a0();
                    C16719g c16719g = this.f45407N0;
                    if (c16719g != null) {
                        if (m14322a0.m14479H()) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        c16719g.mo44614b1(i11);
                    }
                    C8289h1 c8289h1 = this.f45406M0;
                    if (c8289h1 != null) {
                        AbstractC20814p0.m108647h0(c3000l0, 0, c8289h1, z11, interfaceC2259a);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
