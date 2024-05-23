package com.zing.zalo.feed.components;

import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.feed.components.C8273f3;
import com.zing.zalo.feed.components.C8291h3;
import com.zing.zalo.p077ui.widget.C13814x1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p304ks.C21912a;
import p398oo.C24380u;
import p425po.C24881c;
import p615wn.C29106b;

/* loaded from: classes4.dex */
public final class FeedItemOptionModuleView extends FeedItemBaseModuleView implements C8273f3.a, C8291h3.b {

    /* renamed from: f0 */
    private boolean f44556f0;

    /* renamed from: g0 */
    private boolean f44557g0;

    /* renamed from: h0 */
    private boolean f44558h0;

    /* renamed from: i0 */
    private boolean f44559i0;

    /* renamed from: j0 */
    private C8273f3 f44560j0;

    /* renamed from: k0 */
    private C16719g f44561k0;

    /* renamed from: l0 */
    private C16716d f44562l0;

    /* renamed from: m0 */
    private C16716d f44563m0;

    /* renamed from: n0 */
    private C16716d f44564n0;

    /* renamed from: o0 */
    private ArrayList f44565o0;

    /* renamed from: p0 */
    private InterfaceC2259a f44566p0;

    /* renamed from: q0 */
    private int f44567q0;

    /* renamed from: r0 */
    private int f44568r0;

    /* renamed from: s0 */
    private boolean f44569s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemOptionModuleView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f44565o0 = new ArrayList();
        this.f44568r0 = -1;
        this.f44569s0 = true;
        this.f44560j0 = new C8273f3(context);
        this.f44561k0 = new C16719g(context);
        this.f44562l0 = new C16716d(context);
        this.f44563m0 = new C16716d(context);
        this.f44564n0 = new C16716d(context);
        this.f44569s0 = AbstractC0924m0.m4045n9();
    }

    /* renamed from: v0 */
    private final boolean m43898v0(C3000l0 c3000l0, int i11) {
        C3020p0 m14324b0 = c3000l0.m14324b0(i11);
        if (m14324b0 != null) {
            return C21912a.m114159g().m114169j(m14324b0.f12022B.f12280b);
        }
        return false;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: W */
    public void mo43694W(C29106b c29106b) {
    }

    @Override // com.zing.zalo.feed.components.C8291h3.b
    /* renamed from: a */
    public void mo43899a(int i11) {
        InterfaceC2259a interfaceC2259a;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3 && (interfaceC2259a = this.f44566p0) != null) {
                    interfaceC2259a.mo11935T7(this.f44331V, this.f44567q0);
                    return;
                }
                return;
            }
            InterfaceC2259a interfaceC2259a2 = this.f44566p0;
            if (interfaceC2259a2 != null) {
                interfaceC2259a2.mo11976xz(this.f44331V, this.f44567q0);
                return;
            }
            return;
        }
        InterfaceC2259a interfaceC2259a3 = this.f44566p0;
        if (interfaceC2259a3 != null) {
            interfaceC2259a3.mo11921HA(this.f44331V, this.f44567q0);
        }
    }

    public final C16716d getBackgroundView() {
        return this.f44564n0;
    }

    public final C16716d getContentContainerView() {
        return this.f44563m0;
    }

    public final C16716d getContentView() {
        return this.f44562l0;
    }

    public final C16719g getDividerView() {
        return this.f44561k0;
    }

    public final boolean getEnable() {
        return this.f44556f0;
    }

    public final boolean getEnableHide() {
        return this.f44557g0;
    }

    public final boolean getEnableMove() {
        return this.f44559i0;
    }

    public final boolean getEnableRestrict() {
        return this.f44558h0;
    }

    public final InterfaceC2259a getFeedCallback() {
        return this.f44566p0;
    }

    public final int getFeedIndex() {
        return this.f44567q0;
    }

    public final int getFeedLayoutMode() {
        return this.f44568r0;
    }

    public final C8273f3 getHeaderView() {
        return this.f44560j0;
    }

    public final ArrayList<C8291h3> getOptionList() {
        return this.f44565o0;
    }

    /* renamed from: m0 */
    public final void m43900m0(C3000l0 c3000l0, int i11) {
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        m43910w0(c3000l0, i11);
        this.f44567q0 = i11;
        if (!this.f44557g0 && !this.f44559i0 && !this.f44558h0) {
            if (this.f44556f0) {
                this.f44560j0.mo44614b1(0);
                this.f44561k0.mo44614b1(8);
                this.f44562l0.mo44614b1(8);
                m43901n0(this.f44560j0, c3000l0, i11);
                return;
            }
            this.f44560j0.mo44614b1(8);
            this.f44561k0.mo44614b1(8);
            this.f44562l0.mo44614b1(8);
            return;
        }
        this.f44560j0.mo44614b1(0);
        this.f44561k0.mo44614b1(0);
        this.f44562l0.mo44614b1(0);
        m43901n0(this.f44560j0, c3000l0, i11);
        for (C8291h3 c8291h3 : this.f44565o0) {
            if ((c8291h3.m44702w1() == 1 && this.f44557g0) || ((c8291h3.m44702w1() == 2 && this.f44558h0) || (c8291h3.m44702w1() == 3 && this.f44559i0))) {
                c8291h3.mo44614b1(0);
                c8291h3.m44701p1(c3000l0, i11);
            } else {
                c8291h3.mo44614b1(8);
            }
        }
    }

    /* renamed from: n0 */
    public final void m43901n0(C8273f3 c8273f3, C3000l0 c3000l0, int i11) {
        AbstractC19074t.m100208f(c8273f3, "<this>");
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        if (c3000l0.f11896q0 == 0) {
            if (!this.f44557g0) {
                c8273f3.m44665q1(c3000l0, i11);
                return;
            } else if (!this.f44559i0 && C24380u.f117739a.m127514g() && c3000l0.f11893p != 1) {
                c8273f3.m44666r1(c3000l0, i11);
                return;
            } else {
                c8273f3.m44664p1(c3000l0, i11);
                return;
            }
        }
        if (!this.f44557g0) {
            c8273f3.m44665q1(c3000l0, i11);
        } else {
            c8273f3.m44664p1(c3000l0, i11);
        }
    }

    /* renamed from: o0 */
    public final void m43902o0() {
        C16716d c16716d = new C16716d(getContext());
        this.f44564n0 = c16716d;
        int i11 = this.f44568r0;
        if (i11 == 0) {
            c16716d.m89106L().m89031O(AbstractC23136l9.m118742r(16.0f));
        } else if (i11 == 12) {
            c16716d.m89106L().m89032P(AbstractC23136l9.m118742r(10.0f), 0, AbstractC23136l9.m118742r(10.0f), 0);
        }
        Drawable m77073c = new C13814x1("515151", 255, 0, new float[]{24.0f, 24.0f, 24.0f, 24.0f, 24.0f, 24.0f, 24.0f, 24.0f}, C13814x1.Companion.m77075a()).m77073c();
        int i12 = this.f44568r0;
        if (i12 == 0) {
            if (C23212s8.m119603k() && m77073c != null) {
                this.f44564n0.m89085A0(m77073c);
                return;
            } else {
                this.f44564n0.m89085A0(null);
                return;
            }
        }
        if (i12 == 1 || i12 == 12) {
            if (C23212s8.m119603k() && m77073c != null) {
                this.f44564n0.m89085A0(m77073c);
            } else {
                this.f44564n0.m89085A0(null);
            }
        }
    }

    /* renamed from: p0 */
    public final void m43903p0() {
        this.f44563m0 = new C16716d(getContext());
        int m118742r = AbstractC23136l9.m118742r(6.0f);
        int i11 = this.f44568r0;
        if (i11 == 0) {
            this.f44563m0.m89106L().m89031O(m118742r);
        } else if (i11 == 12) {
            this.f44563m0.m89106L().m89032P(m118742r, 0, m118742r, m118742r);
        } else if (i11 == 1) {
            this.f44563m0.m89106L().m89032P(m118742r, 0, m118742r, m118742r);
        }
        int i12 = this.f44568r0;
        if (i12 == 0) {
            this.f44563m0.m89087B0(AbstractC16803z.background_feed_item_option);
        } else if (i12 == 1 || i12 == 12) {
            this.f44563m0.m89087B0(AbstractC16803z.background_feed_item_option_timeline_group);
        }
    }

    /* renamed from: q0 */
    public final void m43904q0() {
        C16716d c16716d = new C16716d(getContext());
        this.f44562l0 = c16716d;
        c16716d.m89106L().m89060k0(-1).m89023G(this.f44561k0);
        this.f44565o0.add(m43909u0(3));
        this.f44565o0.add(m43909u0(1));
        Iterator it = this.f44565o0.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            C8291h3 c8291h3 = (C8291h3) it.next();
            c8291h3.m89106L().m89060k0(-1);
            if (i11 > 0) {
                Object obj = this.f44565o0.get(i11 - 1);
                AbstractC19074t.m100207e(obj, "get(...)");
                c8291h3.m89106L().m89023G((C8291h3) obj);
            }
            c8291h3.m44700A1(this);
            this.f44562l0.m89001g1(c8291h3);
            i11 = i12;
        }
    }

    @Override // com.zing.zalo.feed.components.C8273f3.a
    /* renamed from: r */
    public void mo43905r() {
        InterfaceC2259a interfaceC2259a = this.f44566p0;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11961kq(this.f44331V, this.f44567q0);
        }
    }

    /* renamed from: r0 */
    public final void m43906r0() {
        C16719g c16719g = new C16719g(getContext());
        this.f44561k0 = c16719g;
        c16719g.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(0.5f)).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(16.0f)).m89023G(this.f44560j0);
        this.f44561k0.mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.ItemSeparatorColor));
    }

    /* renamed from: s0 */
    public final void m43907s0() {
        C8273f3 c8273f3 = new C8273f3(getContext());
        this.f44560j0 = c8273f3;
        c8273f3.m44671x1(this.f44568r0);
        this.f44560j0.m89106L().m89060k0(-1);
        this.f44560j0.m44667s1();
        this.f44560j0.m44672y1(this);
    }

    public final void setBackgroundView(C16716d c16716d) {
        AbstractC19074t.m100208f(c16716d, "<set-?>");
        this.f44564n0 = c16716d;
    }

    public final void setContentContainerView(C16716d c16716d) {
        AbstractC19074t.m100208f(c16716d, "<set-?>");
        this.f44563m0 = c16716d;
    }

    public final void setContentView(C16716d c16716d) {
        AbstractC19074t.m100208f(c16716d, "<set-?>");
        this.f44562l0 = c16716d;
    }

    public final void setDividerView(C16719g c16719g) {
        AbstractC19074t.m100208f(c16719g, "<set-?>");
        this.f44561k0 = c16719g;
    }

    public final void setEnable(boolean z11) {
        this.f44556f0 = z11;
    }

    public final void setEnableBanOption(boolean z11) {
        this.f44569s0 = z11;
    }

    public final void setEnableHide(boolean z11) {
        this.f44557g0 = z11;
    }

    public final void setEnableMove(boolean z11) {
        this.f44559i0 = z11;
    }

    public final void setEnableRestrict(boolean z11) {
        this.f44558h0 = z11;
    }

    public final void setFeedCallback(InterfaceC2259a interfaceC2259a) {
        this.f44566p0 = interfaceC2259a;
    }

    public final void setFeedIndex(int i11) {
        this.f44567q0 = i11;
    }

    public final void setFeedLayoutMode(int i11) {
        this.f44568r0 = i11;
    }

    public final void setHeaderView(C8273f3 c8273f3) {
        AbstractC19074t.m100208f(c8273f3, "<set-?>");
        this.f44560j0 = c8273f3;
    }

    public final void setOptionList(ArrayList<C8291h3> arrayList) {
        AbstractC19074t.m100208f(arrayList, "<set-?>");
        this.f44565o0 = arrayList;
    }

    /* renamed from: t0 */
    public final void m43908t0(int i11) {
        this.f44568r0 = i11;
        mo44090O();
        this.f44565o0.clear();
        if (this.f44568r0 == 12) {
            setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        }
        m43902o0();
        m43907s0();
        m43906r0();
        m43904q0();
        m43903p0();
        this.f44563m0.m89001g1(this.f44560j0);
        this.f44563m0.m89001g1(this.f44561k0);
        this.f44563m0.m89001g1(this.f44562l0);
        this.f44564n0.m89001g1(this.f44563m0);
        mo69681L(this.f44564n0);
    }

    /* renamed from: u0 */
    public final C8291h3 m43909u0(int i11) {
        C8291h3 c8291h3 = new C8291h3(getContext());
        c8291h3.m44704z1(this.f44568r0);
        c8291h3.m44703x1(i11);
        return c8291h3;
    }

    /* renamed from: w0 */
    public final void m43910w0(C3000l0 c3000l0, int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        C24881c c24881c;
        C24881c c24881c2;
        C24881c c24881c3;
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        C3020p0 m14324b0 = c3000l0.m14324b0(i11);
        boolean z14 = false;
        if (m14324b0 != null) {
            z11 = m14324b0.m14489T();
        } else {
            z11 = false;
        }
        this.f44556f0 = z11;
        if (m14324b0 != null && (c24881c3 = m14324b0.f12021A) != null) {
            z12 = c24881c3.m129382b();
        } else {
            z12 = false;
        }
        this.f44557g0 = z12;
        if (m14324b0 != null && (c24881c2 = m14324b0.f12021A) != null && c24881c2.m129384d() && c3000l0.f11896q0 == 1 && !m43898v0(c3000l0, this.f44567q0) && this.f44569s0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f44558h0 = z13;
        if (m14324b0 != null && (c24881c = m14324b0.f12021A) != null && c24881c.m129383c() && c3000l0.f11896q0 == 0 && C24380u.f117739a.m127514g() && c3000l0.f11893p != 1) {
            z14 = true;
        }
        this.f44559i0 = z14;
    }
}
