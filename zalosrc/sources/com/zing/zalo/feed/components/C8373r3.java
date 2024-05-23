package com.zing.zalo.feed.components;

import android.content.Context;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: com.zing.zalo.feed.components.r3 */
/* loaded from: classes4.dex */
public final class C8373r3 extends C16716d {

    /* renamed from: M0 */
    private final C16719g f45655M0;

    /* renamed from: N0 */
    private final C16719g f45656N0;

    /* renamed from: O0 */
    private final C16716d f45657O0;

    /* renamed from: P0 */
    private final C11850a f45658P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8373r3(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f45655M0 = new C16719g(context);
        this.f45656N0 = new C16719g(context);
        this.f45657O0 = new C16716d(context);
        this.f45658P0 = new C11850a(context);
        m44855q1();
    }

    /* renamed from: o1 */
    private final void m44854o1(C16719g c16719g) {
        c16719g.mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.ProfileLineColor));
    }

    /* renamed from: q1 */
    private final void m44855q1() {
        m44854o1(this.f45655M0);
        this.f45655M0.m89106L().m89033Q(AbstractC23136l9.m118742r(8.0f)).m89028L(AbstractC23136l9.m118742r(1.0f), AbstractC23136l9.m118742r(48.0f)).m89034R(AbstractC23136l9.m118736p(AbstractC16802y.feed_profile_timebar_marginleft));
        m89001g1(this.f45655M0);
        this.f45658P0.m89106L().m89028L(-1, -2).m89025I(true).m89029M(15);
        this.f45658P0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_lock_solid_holllow_24));
        this.f45658P0.m65869e2(4);
        this.f45657O0.m89087B0(AbstractC16803z.feed_item_section_remind_limit_visible_timebar_icon_bg);
        this.f45657O0.m89106L().m89028L(AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(20.0f)).m89034R(AbstractC23136l9.m118742r(3.5f)).m89041Y(AbstractC23136l9.m118742r(4.0f)).m89023G(this.f45655M0);
        this.f45657O0.m89001g1(this.f45658P0);
        m89001g1(this.f45657O0);
        m44854o1(this.f45656N0);
        this.f45656N0.m89106L().m89028L(AbstractC23136l9.m118742r(1.0f), AbstractC23136l9.m118742r(28.0f)).m89034R(AbstractC23136l9.m118736p(AbstractC16802y.feed_profile_timebar_marginleft)).m89036T(AbstractC23136l9.m118742r(8.0f)).m89023G(this.f45657O0);
        m89001g1(this.f45656N0);
    }

    /* renamed from: p1 */
    public final C16719g m44856p1() {
        return this.f45657O0;
    }
}
