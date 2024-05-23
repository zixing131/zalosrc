package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3047v0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p304ks.AbstractC21935u;
import p688yo.EnumC31036b;
import ui0.C27280g;

/* renamed from: com.zing.zalo.feed.components.f3 */
/* loaded from: classes4.dex */
public final class C8273f3 extends C16716d {

    /* renamed from: M0 */
    public C22122a0 f45342M0;

    /* renamed from: N0 */
    public C22126c0 f45343N0;

    /* renamed from: O0 */
    private a f45344O0;

    /* renamed from: P0 */
    private int f45345P0;

    /* renamed from: com.zing.zalo.feed.components.f3$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: r */
        void mo43905r();
    }

    public C8273f3(Context context) {
        super(context);
        this.f45345P0 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m44663t1(C8273f3 c8273f3, C16719g c16719g) {
        AbstractC19074t.m100208f(c8273f3, "this$0");
        a aVar = c8273f3.f45344O0;
        if (aVar != null) {
            aVar.mo43905r();
        }
    }

    /* renamed from: p1 */
    public final void m44664p1(C3000l0 c3000l0, int i11) {
        String str;
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        C3020p0 m14324b0 = c3000l0.m14324b0(i11);
        if (m14324b0 != null) {
            C3047v0 c3047v0 = m14324b0.f12022B;
            str = AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
        } else {
            str = "";
        }
        m44669v1().m111959G1(new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_feed_item_option_deleted_title, str)));
    }

    /* renamed from: q1 */
    public final void m44665q1(C3000l0 c3000l0, int i11) {
        String str;
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        C3020p0 m14324b0 = c3000l0.m14324b0(i11);
        if (m14324b0 != null) {
            C3047v0 c3047v0 = m14324b0.f12022B;
            str = AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
        } else {
            str = "";
        }
        m44669v1().m111959G1(new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_feed_item_option_hided_title, str)));
    }

    /* renamed from: r1 */
    public final void m44666r1(C3000l0 c3000l0, int i11) {
        String str;
        int i12;
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        C3020p0 m14324b0 = c3000l0.m14324b0(i11);
        if (m14324b0 != null) {
            C3047v0 c3047v0 = m14324b0.f12022B;
            str = AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
        } else {
            str = "";
        }
        C22126c0 m44669v1 = m44669v1();
        if (c3000l0.f11896q0 == EnumC31036b.f143137p.m150864c()) {
            i12 = AbstractC8020f0.str_feed_item_option_moved_tab_other_title;
        } else {
            i12 = AbstractC8020f0.str_feed_item_option_moved_tab_main_title;
        }
        m44669v1.m111959G1(AbstractC23136l9.m118746s0(i12, str));
    }

    /* renamed from: s1 */
    public final void m44667s1() {
        m89003j1();
        m89106L().m89039W(AbstractC23136l9.m118742r(56.0f));
        int m118742r = AbstractC23136l9.m118742r(5.0f);
        m44670w1(new C22122a0(getContext()));
        m44668u1().m89106L().m89027K(true).m89017A(Boolean.TRUE).m89035S(AbstractC23136l9.m118742r(17.0f)).m89060k0(AbstractC23136l9.m118742r(22.0f)).m89030N(AbstractC23136l9.m118742r(23.0f)).m89041Y(m118742r);
        C22122a0 m44668u1 = m44668u1();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        m44668u1.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_close_line_16, AbstractC2807a.icon_01));
        m44668u1().mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.e3
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                C8273f3.m44663t1(C8273f3.this, c16719g);
            }
        });
        m44673z1(new C22126c0(getContext()));
        m44669v1().m89106L().m89060k0(-1).m89030N(-2).m89027K(true).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(56.0f));
        m44669v1().m111953A1(2);
        m44669v1().m111980v1(TextUtils.TruncateAt.END);
        m44669v1().mo111964L1(AbstractC23136l9.m118742r(15.0f) * 1.0f);
        m44669v1().m111962J1(C23212s8.m119607o(getContext(), AbstractC2807a.text_02));
        m89001g1(m44668u1());
        m89001g1(m44669v1());
    }

    /* renamed from: u1 */
    public final C22122a0 m44668u1() {
        C22122a0 c22122a0 = this.f45342M0;
        if (c22122a0 != null) {
            return c22122a0;
        }
        AbstractC19074t.m100223u("closeButton");
        return null;
    }

    /* renamed from: v1 */
    public final C22126c0 m44669v1() {
        C22126c0 c22126c0 = this.f45343N0;
        if (c22126c0 != null) {
            return c22126c0;
        }
        AbstractC19074t.m100223u("titleTextView");
        return null;
    }

    /* renamed from: w1 */
    public final void m44670w1(C22122a0 c22122a0) {
        AbstractC19074t.m100208f(c22122a0, "<set-?>");
        this.f45342M0 = c22122a0;
    }

    /* renamed from: x1 */
    public final void m44671x1(int i11) {
        this.f45345P0 = i11;
    }

    /* renamed from: y1 */
    public final void m44672y1(a aVar) {
        this.f45344O0 = aVar;
    }

    /* renamed from: z1 */
    public final void m44673z1(C22126c0 c22126c0) {
        AbstractC19074t.m100208f(c22126c0, "<set-?>");
        this.f45343N0 = c22126c0;
    }
}
