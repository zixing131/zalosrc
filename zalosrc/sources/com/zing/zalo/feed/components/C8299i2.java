package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.components.C8406v1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import is.AbstractC20826v0;
import kd0.C21694d;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p363nh.C23744a;
import tr.C26881e;

/* renamed from: com.zing.zalo.feed.components.i2 */
/* loaded from: classes4.dex */
public class C8299i2 extends C16716d implements C23744a.c {

    /* renamed from: M0 */
    private C16716d f45408M0;

    /* renamed from: N0 */
    private C8406v1.a f45409N0;

    /* renamed from: O0 */
    private C16716d f45410O0;

    /* renamed from: P0 */
    private C22126c0 f45411P0;

    /* renamed from: Q0 */
    private C22126c0 f45412Q0;

    /* renamed from: R0 */
    private C21694d f45413R0;

    /* renamed from: S0 */
    private C16719g f45414S0;

    /* renamed from: T0 */
    private boolean f45415T0;

    /* renamed from: U0 */
    private final int f45416U0;

    /* renamed from: V0 */
    private final int f45417V0;

    /* renamed from: W0 */
    C3000l0 f45418W0;

    /* renamed from: X0 */
    InterfaceC8427w6 f45419X0;

    /* renamed from: Y0 */
    Handler f45420Y0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.i2$a */
    /* loaded from: classes4.dex */
    public class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                int i11 = message.arg1;
                C3000l0 c3000l0 = C8299i2.this.f45418W0;
                if (c3000l0 != null) {
                    int m14339j0 = c3000l0.m14339j0();
                    if (m14339j0 != 1) {
                        if (m14339j0 != 2) {
                            if (m14339j0 == 3) {
                                C8299i2.this.m44710H1(100);
                                return;
                            } else if (m14339j0 != 4) {
                                if (m14339j0 != 5) {
                                    return;
                                }
                            }
                        }
                        C8299i2.this.m44709G1(0);
                        return;
                    }
                    C8299i2.this.m44710H1(i11);
                }
            }
        }
    }

    public C8299i2(Context context) {
        super(context);
        this.f45416U0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top);
        this.f45417V0 = Color.parseColor("#db342e");
        this.f45420Y0 = new a(Looper.getMainLooper());
    }

    /* renamed from: B1 */
    private void m44707B1(C3020p0 c3020p0) {
        int i11;
        int i12;
        if (this.f45418W0 == null) {
            return;
        }
        if (c3020p0.m14488S()) {
            i11 = AbstractC8020f0.str_feed_editing;
        } else {
            i11 = AbstractC8020f0.str_post_feed_posting_state;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        int m14339j0 = this.f45418W0.m14339j0();
        if (m14339j0 != 1) {
            if (m14339j0 != 2) {
                if (m14339j0 != 3) {
                    if (m14339j0 != 4) {
                        if (m14339j0 != 5) {
                            return;
                        }
                    }
                } else {
                    m44709G1(100);
                    C22126c0 c22126c0 = this.f45412Q0;
                    if (c22126c0 != null) {
                        c22126c0.mo44614b1(8);
                    }
                    C21694d c21694d = this.f45413R0;
                    if (c21694d != null) {
                        c21694d.mo44614b1(0);
                    }
                    C22126c0 c22126c02 = this.f45411P0;
                    if (c22126c02 != null) {
                        c22126c02.mo44614b1(0);
                        this.f45411P0.m111959G1(m118743r0);
                        this.f45411P0.m111962J1(C23212s8.m119607o(this.f84786r, AbstractC21196a.TextColor1));
                        return;
                    }
                    return;
                }
            }
            m44709G1(0);
            C3000l0 c3000l0 = this.f45418W0;
            C3000l0.w m108845y = AbstractC20826v0.m108845y(c3000l0.f11892o0, c3000l0.f11895q);
            C22126c0 c22126c03 = this.f45412Q0;
            if (c22126c03 != null) {
                c22126c03.mo44614b1(0);
            }
            C21694d c21694d2 = this.f45413R0;
            if (c21694d2 != null) {
                c21694d2.mo44614b1(8);
            }
            C22126c0 c22126c04 = this.f45411P0;
            if (c22126c04 != null) {
                c22126c04.mo44614b1(0);
                this.f45411P0.m111959G1(m108845y.f11951b + String.valueOf(Character.toChars(46)));
                this.f45411P0.m111962J1(this.f45417V0);
                return;
            }
            return;
        }
        C26881e.c m138507e = C26881e.m138493d().m138507e(this.f45418W0.f11895q);
        if (m138507e != null) {
            i12 = m138507e.f127238f;
        } else {
            i12 = 0;
        }
        m44709G1(i12);
        C22126c0 c22126c05 = this.f45412Q0;
        if (c22126c05 != null) {
            c22126c05.mo44614b1(8);
        }
        C21694d c21694d3 = this.f45413R0;
        if (c21694d3 != null) {
            c21694d3.mo44614b1(0);
        }
        C22126c0 c22126c06 = this.f45411P0;
        if (c22126c06 != null) {
            c22126c06.mo44614b1(0);
            this.f45411P0.m111959G1(m118743r0);
            this.f45411P0.m111962J1(C23212s8.m119607o(this.f84786r, AbstractC21196a.TextColor1));
        }
    }

    /* renamed from: C1 */
    private void m44708C1(int i11) {
        if (this.f45420Y0 != null) {
            Message message = new Message();
            message.what = 1;
            message.arg1 = i11;
            this.f45420Y0.sendMessage(message);
        }
    }

    /* renamed from: G1 */
    public void m44709G1(int i11) {
        C21694d c21694d = this.f45413R0;
        if (c21694d != null) {
            c21694d.m111938g1((i11 * 1.0f) / 100.0f, false);
        }
    }

    /* renamed from: H1 */
    public void m44710H1(int i11) {
        C21694d c21694d = this.f45413R0;
        if (c21694d != null) {
            c21694d.m111938g1((i11 * 1.0f) / 100.0f, true);
        }
    }

    /* renamed from: t1 */
    private void m44716t1() {
        boolean z11;
        InterfaceC8427w6 interfaceC8427w6;
        C3000l0 c3000l0 = this.f45418W0;
        boolean z12 = false;
        if (c3000l0 != null && c3000l0.m14285C0() && this.f45418W0.m14377z0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C22126c0 c22126c0 = this.f45412Q0;
        if (c22126c0 != null && c22126c0.m89144k0()) {
            z12 = true;
        }
        if (z11 && z12 && (interfaceC8427w6 = this.f45419X0) != null) {
            interfaceC8427w6.mo43802M2(this.f45418W0);
        }
    }

    /* renamed from: u1 */
    private void m44717u1() {
        mo89161z0(C23212s8.m119607o(this.f84786r, AbstractC16781w.ProfilePrimaryBackgroundColor));
        C16719g c16719g = new C16719g(getContext());
        c16719g.m89085A0(AbstractC23136l9.m118665N(this.f84786r, AbstractC16803z.bg_feed_profile_body));
        c16719g.m89106L().m89028L(-1, -1).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile));
        m89001g1(c16719g);
    }

    /* renamed from: w1 */
    public /* synthetic */ void m44718w1(C16719g c16719g) {
        m44716t1();
    }

    /* renamed from: x1 */
    public /* synthetic */ void m44719x1(C16719g c16719g) {
        InterfaceC8427w6 interfaceC8427w6 = this.f45419X0;
        if (interfaceC8427w6 != null) {
            interfaceC8427w6.mo43802M2(this.f45418W0);
        }
    }

    /* renamed from: y1 */
    public /* synthetic */ void m44720y1(C16719g c16719g) {
        m44716t1();
    }

    /* renamed from: A1 */
    public void m44721A1() {
        C23744a.m124114c().m124117e(this, 5050);
    }

    /* renamed from: D1 */
    public void m44722D1(C3000l0 c3000l0) {
        this.f45418W0 = c3000l0;
    }

    /* renamed from: E1 */
    public void m44723E1(int i11, C23528a c23528a, boolean z11) {
        C3020p0 c3020p0;
        try {
            C3000l0 c3000l0 = this.f45418W0;
            if (c3000l0 != null) {
                c3020p0 = c3000l0.m14324b0(i11);
            } else {
                c3020p0 = null;
            }
            if (c3020p0 == null) {
                return;
            }
            C8406v1.a aVar = this.f45409N0;
            if (aVar != null) {
                aVar.m44940r1(this.f45418W0, c3020p0);
            }
            m44707B1(c3020p0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: F1 */
    public void m44724F1(InterfaceC8427w6 interfaceC8427w6) {
        this.f45419X0 = interfaceC8427w6;
    }

    /* renamed from: v1 */
    public void m44725v1(Context context, boolean z11) {
        try {
            this.f45415T0 = z11;
            this.f45408M0 = new C16716d(context);
            this.f45409N0 = new C8406v1.a(context);
            this.f45410O0 = new C16716d(context);
            this.f45411P0 = new C22126c0(context);
            this.f45412Q0 = new C22126c0(context);
            this.f45413R0 = new C21694d(context);
            this.f45414S0 = new C16719g(context);
            m44717u1();
            this.f45408M0.m89106L().m89028L(-1, -1).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile));
            this.f45408M0.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.foreground_local_feed_item));
            this.f45409N0.m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_timebar_marginleft));
            this.f45410O0.m89106L().m89060k0(-1).m89030N(-2).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_avatar_margin_right)).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile_item)).m89036T(AbstractC23136l9.m118742r(2.0f));
            this.f45410O0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.f2
                public /* synthetic */ C8272f2() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C8299i2.this.m44718w1(c16719g);
                }
            });
            this.f45411P0.m89106L().m89060k0(-2).m89030N(-2).m89027K(true).m89035S(AbstractC23222t7.f112556e);
            this.f45411P0.m111982x1(false);
            this.f45411P0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85300f7));
            this.f45411P0.mo111965M1(1);
            this.f45412Q0.m89106L().m89060k0(-2).m89030N(-2).m89054h0(this.f45411P0).m89027K(true);
            this.f45412Q0.mo44614b1(8);
            this.f45412Q0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85300f7));
            this.f45412Q0.m111982x1(false);
            this.f45412Q0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.LinkColor));
            this.f45412Q0.mo111965M1(1);
            this.f45412Q0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_detail));
            this.f45412Q0.m89087B0(AbstractC23136l9.m118734o0(context, false));
            this.f45412Q0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.g2
                public /* synthetic */ C8281g2() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C8299i2.this.m44719x1(c16719g);
                }
            });
            this.f45413R0.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(4.0f)).m89054h0(this.f45411P0).m89027K(true);
            this.f45413R0.mo44614b1(8);
            this.f45413R0.m111939h1(C23212s8.m119607o(context, AbstractC16781w.ImagePlaceHolderColor));
            this.f45413R0.m111940i1(C23212s8.m119607o(context, AbstractC16781w.AppPrimaryColor));
            this.f45414S0.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(6.0f)).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile_item)).m89023G(this.f45410O0);
            this.f45414S0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.h2
                public /* synthetic */ C8290h2() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C8299i2.this.m44720y1(c16719g);
                }
            });
            m89001g1(this.f45409N0);
            this.f45410O0.m89001g1(this.f45411P0);
            this.f45410O0.m89001g1(this.f45413R0);
            this.f45410O0.m89001g1(this.f45412Q0);
            m89001g1(this.f45408M0);
            m89001g1(this.f45410O0);
            m89001g1(this.f45414S0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        C3020p0 m14322a0;
        if (i11 == 5050) {
            try {
                String str = (String) objArr[0];
                int intValue = ((Integer) objArr[1]).intValue();
                C3000l0 c3000l0 = this.f45418W0;
                if (c3000l0 != null && c3000l0.m14285C0() && (m14322a0 = this.f45418W0.m14322a0()) != null && TextUtils.equals(m14322a0.f12057p, str)) {
                    m44708C1(intValue);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: z1 */
    public void m44726z1() {
        C23744a.m124114c().m124115b(this, 5050);
    }
}
