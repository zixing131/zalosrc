package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3047v0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.C20801j;
import is.C20832y0;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import on0.AbstractC24342w;
import p304ks.AbstractC21935u;
import ui0.C27280g;

/* renamed from: com.zing.zalo.feed.components.h3 */
/* loaded from: classes4.dex */
public final class C8291h3 extends C16716d {
    public static final a Companion = new a(null);

    /* renamed from: M0 */
    private final Context f45384M0;

    /* renamed from: N0 */
    private int f45385N0;

    /* renamed from: O0 */
    private C22122a0 f45386O0;

    /* renamed from: P0 */
    private C22126c0 f45387P0;

    /* renamed from: Q0 */
    private int f45388Q0;

    /* renamed from: R0 */
    private b f45389R0;

    /* renamed from: S0 */
    private final int f45390S0;

    /* renamed from: T0 */
    private final int f45391T0;

    /* renamed from: com.zing.zalo.feed.components.h3$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.h3$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo43899a(int i11);
    }

    public C8291h3(Context context) {
        super(context);
        this.f45384M0 = context;
        this.f45388Q0 = -1;
        this.f45386O0 = new C22122a0(context);
        this.f45387P0 = new C22126c0(context);
        this.f45390S0 = AbstractC23136l9.m118742r(14.0f);
        this.f45391T0 = AbstractC23136l9.m118742r(16.0f);
    }

    /* renamed from: q1 */
    private final void m44693q1(C3000l0 c3000l0, int i11) {
        String str;
        String m127192u0;
        this.f45386O0.mo44614b1(0);
        this.f45387P0.mo44614b1(0);
        Context context = this.f45384M0;
        if (context != null) {
            this.f45386O0.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_posts_hide_line_24, AbstractC2807a.icon_02));
        }
        C3020p0 m14324b0 = c3000l0.m14324b0(i11);
        if (m14324b0 != null) {
            C3047v0 c3047v0 = m14324b0.f12022B;
            str = AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
        } else {
            str = "";
        }
        String str2 = str;
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_hide_user_feed_confirm_desc, str2);
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        m127192u0 = AbstractC24342w.m127192u0(m118746s0, "?");
        C20832y0 c20832y0 = C20832y0.f102396a;
        C20832y0.a aVar = new C20832y0.a(m127192u0, m44698v1(), null, 4, null);
        AbstractC19074t.m100205c(str2);
        this.f45387P0.m111959G1(c20832y0.m108877e(aVar, str2, m44697u1(c3000l0), 2, C20832y0.b.f102402q));
    }

    /* renamed from: r1 */
    private final void m44694r1(C3000l0 c3000l0, int i11) {
        String str;
        this.f45386O0.mo44614b1(0);
        this.f45387P0.mo44614b1(0);
        Context context = this.f45384M0;
        if (context != null) {
            this.f45386O0.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_posts_move_line_24, AbstractC2807a.icon_02));
        }
        C3020p0 m14324b0 = c3000l0.m14324b0(i11);
        String str2 = "";
        if (m14324b0 == null) {
            str = "";
        } else {
            C3047v0 c3047v0 = m14324b0.f12022B;
            str = AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
        }
        int i12 = c3000l0.f11896q0;
        if (i12 != 0) {
            if (i12 == 1) {
                str2 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_feed_item_option_item_move_to_tab_main_title, str);
            }
        } else {
            str2 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_feed_item_option_item_move_to_tab_other_title, str);
        }
        String str3 = str2;
        AbstractC19074t.m100205c(str3);
        C20832y0 c20832y0 = C20832y0.f102396a;
        C20832y0.a aVar = new C20832y0.a(str3, m44698v1(), null, 4, null);
        AbstractC19074t.m100205c(str);
        this.f45387P0.m111959G1(c20832y0.m108877e(aVar, str, m44697u1(c3000l0), 2, C20832y0.b.f102402q));
    }

    /* renamed from: s1 */
    private final void m44695s1(C3000l0 c3000l0, int i11) {
        String str;
        this.f45386O0.mo44614b1(0);
        this.f45387P0.mo44614b1(0);
        Context context = this.f45384M0;
        if (context != null) {
            this.f45386O0.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_posts_block_line_24, AbstractC2807a.icon_02));
        }
        C3020p0 m14324b0 = c3000l0.m14324b0(i11);
        if (m14324b0 != null) {
            C3047v0 c3047v0 = m14324b0.f12022B;
            str = AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
        } else {
            str = "";
        }
        String str2 = str;
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_feed_item_option_item_blocked_user, str2);
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        C20832y0 c20832y0 = C20832y0.f102396a;
        C20832y0.a aVar = new C20832y0.a(m118746s0, m44698v1(), null, 4, null);
        AbstractC19074t.m100205c(str2);
        this.f45387P0.m111959G1(c20832y0.m108877e(aVar, str2, m44697u1(c3000l0), 2, C20832y0.b.f102402q));
    }

    /* renamed from: t1 */
    private final void m44696t1() {
        this.f45386O0.mo44614b1(8);
        this.f45387P0.mo44614b1(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* renamed from: u1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m44697u1(C3000l0 c3000l0) {
        int m118742r;
        int i11;
        int i12;
        int m118725l0;
        int i13 = this.f45388Q0;
        int i14 = 0;
        if (i13 != 0) {
            if (i13 != 12) {
                i11 = 0;
                i12 = this.f45388Q0;
                if (i12 != 0 || i12 == 1 || i12 == 12) {
                    i14 = AbstractC23136l9.m118742r(6.0f) * 2;
                }
                int m118742r2 = (this.f45391T0 * 2) + AbstractC23136l9.m118742r(24.0f);
                int i15 = this.f45391T0;
                if (this.f45388Q0 != 1) {
                    m118725l0 = C20801j.m108536d(c3000l0);
                } else {
                    m118725l0 = AbstractC23136l9.m118725l0(this.f45384M0);
                }
                return (((m118725l0 - i11) - i14) - m118742r2) - i15;
            }
            m118742r = AbstractC23136l9.m118742r(10.0f);
        } else {
            m118742r = AbstractC23136l9.m118742r(16.0f);
        }
        i11 = m118742r * 2;
        i12 = this.f45388Q0;
        if (i12 != 0) {
        }
        i14 = AbstractC23136l9.m118742r(6.0f) * 2;
        int m118742r22 = (this.f45391T0 * 2) + AbstractC23136l9.m118742r(24.0f);
        int i152 = this.f45391T0;
        if (this.f45388Q0 != 1) {
        }
        return (((m118725l0 - i11) - i14) - m118742r22) - i152;
    }

    /* renamed from: v1 */
    private final float m44698v1() {
        return this.f45390S0 * C13778s1.m76962c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m44699y1(C8291h3 c8291h3, int i11, C16719g c16719g) {
        AbstractC19074t.m100208f(c8291h3, "this$0");
        b bVar = c8291h3.f45389R0;
        if (bVar != null) {
            bVar.mo43899a(i11);
        }
    }

    /* renamed from: A1 */
    public final void m44700A1(b bVar) {
        this.f45389R0 = bVar;
    }

    /* renamed from: p1 */
    public final void m44701p1(C3000l0 c3000l0, int i11) {
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        int i12 = this.f45385N0;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        m44694r1(c3000l0, i11);
                        return;
                    }
                    return;
                }
                m44695s1(c3000l0, i11);
                return;
            }
            m44693q1(c3000l0, i11);
            return;
        }
        m44696t1();
    }

    /* renamed from: w1 */
    public final int m44702w1() {
        return this.f45385N0;
    }

    /* renamed from: x1 */
    public final void m44703x1(final int i11) {
        this.f45385N0 = i11;
        m89106L().m89039W(AbstractC23136l9.m118742r(56.0f));
        m89003j1();
        mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.g3
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                C8291h3.m44699y1(C8291h3.this, i11, c16719g);
            }
        });
        int i12 = this.f45391T0;
        C22122a0 c22122a0 = new C22122a0(this.f45384M0);
        this.f45386O0 = c22122a0;
        c22122a0.m89106L().m89060k0(AbstractC23136l9.m118742r(24.0f)).m89030N(AbstractC23136l9.m118742r(25.0f)).m89034R(i12).m89027K(true);
        C22126c0 c22126c0 = new C22126c0(this.f45384M0);
        this.f45387P0 = c22126c0;
        c22126c0.m89106L().m89060k0(-1).m89030N(-2).m89027K(true).m89034R((i12 * 2) + AbstractC23136l9.m118742r(24.0f)).m89035S(i12);
        this.f45387P0.mo111964L1(this.f45390S0);
        this.f45387P0.m111962J1(C23212s8.m119607o(this.f45384M0, AbstractC2807a.text_01));
        this.f45387P0.m111953A1(2);
        this.f45387P0.m111980v1(TextUtils.TruncateAt.END);
        m89001g1(this.f45386O0);
        m89001g1(this.f45387P0);
    }

    /* renamed from: z1 */
    public final void m44704z1(int i11) {
        this.f45388Q0 = i11;
    }
}
