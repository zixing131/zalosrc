package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3047v0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import kd0.C21693c;
import l30.AbstractC22055v0;
import l80.C22124b0;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import p266jg.AbstractC21244b;
import p304ks.AbstractC21935u;
import p615wn.C29106b;

/* loaded from: classes4.dex */
public class FeedItemHeaderSubMenuModuleView extends FeedItemBaseModuleView {

    /* renamed from: l0 */
    public static final int f44416l0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_header_bar_submenu_height_profile);

    /* renamed from: m0 */
    public static final int f44417m0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_header_bar_submenu_empty_height_profile);

    /* renamed from: n0 */
    public static final int f44418n0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_header_bar_submenu_empty_height_profile_high_padding);

    /* renamed from: o0 */
    public static final int f44419o0 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: p0 */
    public static final int f44420p0 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: f0 */
    private C21693c f44421f0;

    /* renamed from: g0 */
    private C22124b0 f44422g0;

    /* renamed from: h0 */
    private C16719g f44423h0;

    /* renamed from: i0 */
    private boolean f44424i0;

    /* renamed from: j0 */
    private C22129e f44425j0;

    /* renamed from: k0 */
    private C22126c0 f44426k0;

    public FeedItemHeaderSubMenuModuleView(Context context) {
        super(context);
    }

    private int getOverlayBackgroundProfileResID() {
        return AbstractC16803z.bg_feed_profile_upper_overlay;
    }

    /* renamed from: m0 */
    private void m43759m0() {
        this.f44425j0 = new C22129e(this.f84675p, AbstractC23136l9.m118655I(AbstractC16802y.ava1));
        this.f44426k0 = new C22126c0(this.f84675p);
        this.f44425j0.m89101I0(AbstractC6918a0.imvAvatar);
        this.f44425j0.m89106L().m89060k0(-2).m89030N(-2).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile_item)).m89036T(f44419o0).m89033Q(f44420p0).m89070w(this.f44333a0);
        this.f44425j0.m115428B1(AbstractC23136l9.m118742r(1.0f), AbstractC23136l9.m118742r(1.0f));
        this.f44425j0.m115427A1(AbstractC22055v0.m115162v(this.f84675p));
        mo69681L(this.f44425j0);
        AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Name, this.f44426k0);
        this.f44426k0.m89101I0(AbstractC6918a0.tvUserName);
        this.f44426k0.m89106L().m89060k0(-2).m89030N(-2).m89070w(this.f44425j0).m89054h0(this.f44425j0).m89034R(AbstractC23136l9.m118742r(8.0f));
        this.f44426k0.mo111965M1(0);
        this.f44426k0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85300f7));
        this.f44426k0.m111980v1(TextUtils.TruncateAt.END);
        this.f44426k0.m111957E1(true);
        mo69681L(this.f44426k0);
    }

    /* renamed from: n0 */
    private void m43760n0() {
        m43765x0(null);
    }

    /* renamed from: p0 */
    private void m43761p0() {
        C16719g c16719g = new C16719g(this.f84675p);
        this.f44423h0 = c16719g;
        c16719g.m89106L().m89060k0(-1).m89030N(-1).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile)).m89020D(this.f44333a0);
        this.f44423h0.m89087B0(getOverlayBackgroundProfileResID());
        mo69681L(this.f44423h0);
    }

    /* renamed from: q0 */
    private boolean m43762q0(C3000l0 c3000l0, C3020p0 c3020p0) {
        if (!c3020p0.m14493X() && !c3000l0.m14297H0()) {
            return false;
        }
        return true;
    }

    /* renamed from: u0 */
    private boolean m43763u0(C3020p0 c3020p0) {
        boolean z11;
        boolean z12;
        if (c3020p0 == null) {
            return false;
        }
        int i11 = c3020p0.f12058q;
        if (i11 != 2 && i11 != 3 && i11 != 17 && i11 != 24 && i11 != 7 && i11 != 22) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!c3020p0.m14482K() && !c3020p0.m14477G() && TextUtils.isEmpty(c3020p0.m14527t())) {
            z12 = false;
        } else {
            z12 = true;
        }
        if ((!z11 || z12) && (!c3020p0.m14486Q() || c3020p0.m14482K() || c3020p0.m14477G())) {
            return false;
        }
        return true;
    }

    /* renamed from: v0 */
    private void m43764v0(C3000l0 c3000l0, C3020p0 c3020p0, InterfaceC2259a interfaceC2259a) {
        String str;
        try {
            C3047v0 c3047v0 = c3020p0.f12022B;
            String m114542i = AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
            C22126c0 c22126c0 = this.f44426k0;
            if (c22126c0 != null) {
                c22126c0.m111959G1(m114542i);
            }
            if (this.f44425j0 != null) {
                ContactProfile m118084d = AbstractC23028c0.m118084d(c3020p0.f12022B.f12280b);
                if (m118084d != null) {
                    ContactProfile m40356w = ContactProfile.m40356w(m118084d);
                    if (!TextUtils.isEmpty(m40356w.f42446v) && CoreUtility.f89233i.equals(m40356w.f42434r)) {
                        str = m40356w.f42446v;
                    } else {
                        str = c3020p0.f12022B.f12283e;
                    }
                    m40356w.f42446v = str;
                    this.f44425j0.m115433q1(m40356w);
                } else {
                    this.f44425j0.m115434r1(c3020p0.f12022B.f12283e);
                }
                this.f44425j0.m115429C1(AbstractC22055v0.m115116F(c3020p0.f12022B.f12280b, AbstractC21244b.m110054d(getContext())), AbstractC22055v0.m115115E(c3020p0.f12022B.f12280b, AbstractC21244b.m110054d(getContext())));
                this.f44425j0.m115442z1(AbstractC22055v0.m115112B(c3020p0.f12022B.f12280b));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x0 */
    private void m43765x0(C3020p0 c3020p0) {
        boolean z11;
        int i11;
        if (!m43769r0() && !m43771t0() && !m43770s0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (m43763u0(c3020p0)) {
                i11 = f44418n0;
            } else {
                i11 = f44417m0;
            }
        } else {
            i11 = -2;
        }
        setLayoutParams(new FrameLayout.LayoutParams(-1, i11));
    }

    /* renamed from: y0 */
    private void m43766y0(C3000l0 c3000l0) {
        boolean z11;
        int i11 = 0;
        if (c3000l0 != null && c3000l0.m14285C0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C16719g c16719g = this.f44423h0;
        if (!z11) {
            i11 = 8;
        }
        c16719g.mo44614b1(i11);
    }

    /* renamed from: z0 */
    private void m43767z0(C3000l0 c3000l0, C3020p0 c3020p0) {
        int i11;
        C21693c c21693c = this.f44421f0;
        if (c21693c != null) {
            if (m43762q0(c3000l0, c3020p0)) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            c21693c.mo44614b1(i11);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: W */
    public void mo43694W(C29106b c29106b) {
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    int getBackgroundProfileResID() {
        return AbstractC16803z.bg_feed_profile_upper;
    }

    /* renamed from: o0 */
    public void m43768o0(Context context, int i11, boolean z11) {
        this.f44322M = i11;
        this.f44424i0 = z11;
        try {
            m43760n0();
            m43706k0();
            m43701f0();
            if (z11) {
                m43759m0();
            }
            m43761p0();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: r0 */
    boolean m43769r0() {
        C22124b0 c22124b0 = this.f44422g0;
        if (c22124b0 != null && c22124b0.m89136d0() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s0 */
    boolean m43770s0() {
        C22129e c22129e = this.f44425j0;
        if (c22129e != null && c22129e.m89136d0() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    public void setOnFeedMenuClickListener(C16719g.c cVar) {
        C21693c c21693c = this.f44421f0;
        if (c21693c != null) {
            c21693c.mo89109M0(cVar);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    public void setOnProfileClickListener(C16719g.c cVar) {
        C22129e c22129e = this.f44425j0;
        if (c22129e != null) {
            c22129e.mo89109M0(cVar);
        }
        C22126c0 c22126c0 = this.f44426k0;
        if (c22126c0 != null) {
            c22126c0.mo89109M0(cVar);
        }
    }

    /* renamed from: t0 */
    boolean m43771t0() {
        C21693c c21693c = this.f44421f0;
        if (c21693c != null && c21693c.m89136d0() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w0 */
    public void m43772w0(C3000l0 c3000l0, int i11, InterfaceC2259a interfaceC2259a) {
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return;
            }
            if (this.f44424i0) {
                m43764v0(c3000l0, m14324b0, interfaceC2259a);
            }
            m43767z0(c3000l0, m14324b0);
            m43765x0(m14324b0);
            m43766y0(c3000l0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
