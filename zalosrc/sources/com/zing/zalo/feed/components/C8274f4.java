package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.C10880s;
import com.zing.zalo.social.controls.C10887z;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Iterator;
import kd0.C21697g;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p716zh.C31839a6;
import vg.C28100j3;

/* renamed from: com.zing.zalo.feed.components.f4 */
/* loaded from: classes4.dex */
public final class C8274f4 extends C16716d {

    /* renamed from: M0 */
    private C22126c0 f45346M0;

    /* renamed from: N0 */
    private C22126c0 f45347N0;

    /* renamed from: O0 */
    private C8362q0 f45348O0;

    /* renamed from: P0 */
    private C16719g f45349P0;

    /* renamed from: Q0 */
    private C16719g f45350Q0;

    /* renamed from: R0 */
    private int f45351R0;

    /* renamed from: S0 */
    private final int f45352S0;

    public C8274f4(Context context) {
        super(context);
        this.f45352S0 = AbstractC23136l9.m118742r(16.0f);
    }

    /* renamed from: q1 */
    private final void m44675q1() {
        C16719g c16719g = new C16719g(this.f84786r);
        this.f45350Q0 = c16719g;
        c16719g.m89106L().m89028L(-1, -1);
        C16719g c16719g2 = this.f45350Q0;
        C16719g c16719g3 = null;
        if (c16719g2 == null) {
            AbstractC19074t.m100223u("viewOverlay");
            c16719g2 = null;
        }
        c16719g2.mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.feed_overlay));
        C16719g c16719g4 = this.f45350Q0;
        if (c16719g4 == null) {
            AbstractC19074t.m100223u("viewOverlay");
            c16719g4 = null;
        }
        c16719g4.mo44614b1(8);
        C16719g c16719g5 = this.f45350Q0;
        if (c16719g5 == null) {
            AbstractC19074t.m100223u("viewOverlay");
            c16719g5 = null;
        }
        c16719g5.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.e4
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g6) {
                C8274f4.m44676r1(c16719g6);
            }
        });
        C16719g c16719g6 = this.f45350Q0;
        if (c16719g6 == null) {
            AbstractC19074t.m100223u("viewOverlay");
        } else {
            c16719g3 = c16719g6;
        }
        m89001g1(c16719g3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m44676r1(C16719g c16719g) {
    }

    /* renamed from: t1 */
    private final void m44677t1(C22126c0 c22126c0, float f11) {
        if (c22126c0 != null) {
            Paint.FontMetrics m111969i1 = c22126c0.m111969i1();
            c22126c0.m111984z1(AbstractC23136l9.m118742r(f11) - ((int) (m111969i1.descent - m111969i1.ascent)), 1.0f);
        }
    }

    /* renamed from: v1 */
    private final void m44678v1(C3000l0 c3000l0) {
        boolean z11;
        int i11 = 0;
        if (c3000l0 != null && c3000l0.m14285C0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C16719g c16719g = this.f45350Q0;
        if (c16719g == null) {
            AbstractC19074t.m100223u("viewOverlay");
            c16719g = null;
        }
        if (!z11) {
            i11 = 8;
        }
        c16719g.mo44614b1(i11);
    }

    /* renamed from: p1 */
    public final void m44679p1(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        this.f45351R0 = i11;
        this.f45348O0 = new C8362q0(context);
        this.f45347N0 = new C22126c0(context);
        C8362q0 c8362q0 = this.f45348O0;
        C16719g c16719g = null;
        if (c8362q0 == null) {
            AbstractC19074t.m100223u("feedBgView");
            c8362q0 = null;
        }
        c8362q0.m89101I0(AbstractC6918a0.bg_feed_view);
        C8362q0 c8362q02 = this.f45348O0;
        if (c8362q02 == null) {
            AbstractC19074t.m100223u("feedBgView");
            c8362q02 = null;
        }
        c8362q02.m89106L().m89060k0(-1).m89030N(-2).m89036T(AbstractC23136l9.m118742r(16.0f));
        C8362q0 c8362q03 = this.f45348O0;
        if (c8362q03 == null) {
            AbstractC19074t.m100223u("feedBgView");
            c8362q03 = null;
        }
        m89001g1(c8362q03);
        C8362q0 c8362q04 = this.f45348O0;
        if (c8362q04 == null) {
            AbstractC19074t.m100223u("feedBgView");
            c8362q04 = null;
        }
        c8362q04.m44801F1(2);
        C8362q0 c8362q05 = this.f45348O0;
        if (c8362q05 == null) {
            AbstractC19074t.m100223u("feedBgView");
            c8362q05 = null;
        }
        C22126c0 m44809s1 = c8362q05.m44809s1();
        AbstractC19074t.m100207e(m44809s1, "getViewRender(...)");
        this.f45346M0 = m44809s1;
        if (m44809s1 == null) {
            AbstractC19074t.m100223u("tvMessage");
            m44809s1 = null;
        }
        m44677t1(m44809s1, 20.0f);
        int m118742r = AbstractC23136l9.m118742r(12.0f);
        C8362q0 c8362q06 = this.f45348O0;
        if (c8362q06 == null) {
            AbstractC19074t.m100223u("feedBgView");
            c8362q06 = null;
        }
        c8362q06.m44800E1(m118742r, 0, m118742r, 0);
        AbstractC20826v0.k kVar = AbstractC20826v0.k.Feed_Header_Caption;
        C22126c0 c22126c0 = this.f45347N0;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("tvTagAndLocation");
            c22126c0 = null;
        }
        AbstractC20826v0.m108823n(kVar, c22126c0);
        C22126c0 c22126c02 = this.f45347N0;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("tvTagAndLocation");
            c22126c02 = null;
        }
        c22126c02.m89101I0(AbstractC6918a0.tvTagAndLocation);
        C22126c0 c22126c03 = this.f45347N0;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("tvTagAndLocation");
            c22126c03 = null;
        }
        C16718f m89030N = c22126c03.m89106L().m89060k0(-1).m89030N(-2);
        C8362q0 c8362q07 = this.f45348O0;
        if (c8362q07 == null) {
            AbstractC19074t.m100223u("feedBgView");
            c8362q07 = null;
        }
        m89030N.m89023G(c8362q07).m89032P(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right), 0);
        C22126c0 c22126c04 = this.f45347N0;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("tvTagAndLocation");
            c22126c04 = null;
        }
        c22126c04.mo44614b1(8);
        C22126c0 c22126c05 = this.f45347N0;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("tvTagAndLocation");
            c22126c05 = null;
        }
        c22126c05.m111984z1(AbstractC23136l9.m118655I(AbstractC16802y.feed_linespacing_extra), 1.0f);
        C22126c0 c22126c06 = this.f45347N0;
        if (c22126c06 == null) {
            AbstractC19074t.m100223u("tvTagAndLocation");
            c22126c06 = null;
        }
        c22126c06.m111953A1(2);
        C22126c0 c22126c07 = this.f45347N0;
        if (c22126c07 == null) {
            AbstractC19074t.m100223u("tvTagAndLocation");
            c22126c07 = null;
        }
        c22126c07.m111980v1(TextUtils.TruncateAt.END);
        C22126c0 c22126c08 = this.f45347N0;
        if (c22126c08 == null) {
            AbstractC19074t.m100223u("tvTagAndLocation");
            c22126c08 = null;
        }
        m89001g1(c22126c08);
        C16719g c16719g2 = new C16719g(context);
        this.f45349P0 = c16719g2;
        c16719g2.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        C16719g c16719g3 = this.f45349P0;
        if (c16719g3 == null) {
            AbstractC19074t.m100223u("bottomLine");
            c16719g3 = null;
        }
        C16718f m89028L = c16719g3.m89106L().m89028L(-1, 1);
        C22126c0 c22126c09 = this.f45347N0;
        if (c22126c09 == null) {
            AbstractC19074t.m100223u("tvTagAndLocation");
            c22126c09 = null;
        }
        m89028L.m89023G(c22126c09);
        C16719g c16719g4 = this.f45349P0;
        if (c16719g4 == null) {
            AbstractC19074t.m100223u("bottomLine");
            c16719g4 = null;
        }
        c16719g4.m89106L().f84720p = this.f45352S0;
        C16719g c16719g5 = this.f45349P0;
        if (c16719g5 == null) {
            AbstractC19074t.m100223u("bottomLine");
            c16719g5 = null;
        }
        c16719g5.m89106L().f84722r = this.f45352S0;
        C16719g c16719g6 = this.f45349P0;
        if (c16719g6 == null) {
            AbstractC19074t.m100223u("bottomLine");
            c16719g6 = null;
        }
        c16719g6.m89106L().f84721q = this.f45352S0;
        C16719g c16719g7 = this.f45349P0;
        if (c16719g7 == null) {
            AbstractC19074t.m100223u("bottomLine");
        } else {
            c16719g = c16719g7;
        }
        m89001g1(c16719g);
        m44675q1();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0148 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:6:0x0018, B:9:0x002e, B:10:0x0036, B:13:0x003c, B:15:0x004b, B:17:0x004f, B:18:0x0053, B:20:0x0059, B:22:0x0066, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:29:0x0089, B:32:0x0094, B:35:0x009d, B:37:0x00a1, B:38:0x00a5, B:40:0x00ab, B:47:0x00bd, B:43:0x00c6, B:50:0x00cf, B:52:0x00d3, B:55:0x00da, B:57:0x00e4, B:58:0x010b, B:60:0x0115, B:61:0x0119, B:63:0x0129, B:64:0x013a, B:65:0x013e, B:67:0x0148, B:69:0x0159, B:71:0x015d, B:72:0x0161, B:74:0x0167, B:76:0x0184, B:79:0x01a9, B:80:0x01ad, B:82:0x01b5, B:83:0x01bb, B:87:0x017f, B:88:0x0104), top: B:5:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9 A[Catch: Exception -> 0x0033, TRY_ENTER, TryCatch #0 {Exception -> 0x0033, blocks: (B:6:0x0018, B:9:0x002e, B:10:0x0036, B:13:0x003c, B:15:0x004b, B:17:0x004f, B:18:0x0053, B:20:0x0059, B:22:0x0066, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:29:0x0089, B:32:0x0094, B:35:0x009d, B:37:0x00a1, B:38:0x00a5, B:40:0x00ab, B:47:0x00bd, B:43:0x00c6, B:50:0x00cf, B:52:0x00d3, B:55:0x00da, B:57:0x00e4, B:58:0x010b, B:60:0x0115, B:61:0x0119, B:63:0x0129, B:64:0x013a, B:65:0x013e, B:67:0x0148, B:69:0x0159, B:71:0x015d, B:72:0x0161, B:74:0x0167, B:76:0x0184, B:79:0x01a9, B:80:0x01ad, B:82:0x01b5, B:83:0x01bb, B:87:0x017f, B:88:0x0104), top: B:5:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:6:0x0018, B:9:0x002e, B:10:0x0036, B:13:0x003c, B:15:0x004b, B:17:0x004f, B:18:0x0053, B:20:0x0059, B:22:0x0066, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:29:0x0089, B:32:0x0094, B:35:0x009d, B:37:0x00a1, B:38:0x00a5, B:40:0x00ab, B:47:0x00bd, B:43:0x00c6, B:50:0x00cf, B:52:0x00d3, B:55:0x00da, B:57:0x00e4, B:58:0x010b, B:60:0x0115, B:61:0x0119, B:63:0x0129, B:64:0x013a, B:65:0x013e, B:67:0x0148, B:69:0x0159, B:71:0x015d, B:72:0x0161, B:74:0x0167, B:76:0x0184, B:79:0x01a9, B:80:0x01ad, B:82:0x01b5, B:83:0x01bb, B:87:0x017f, B:88:0x0104), top: B:5:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:6:0x0018, B:9:0x002e, B:10:0x0036, B:13:0x003c, B:15:0x004b, B:17:0x004f, B:18:0x0053, B:20:0x0059, B:22:0x0066, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:29:0x0089, B:32:0x0094, B:35:0x009d, B:37:0x00a1, B:38:0x00a5, B:40:0x00ab, B:47:0x00bd, B:43:0x00c6, B:50:0x00cf, B:52:0x00d3, B:55:0x00da, B:57:0x00e4, B:58:0x010b, B:60:0x0115, B:61:0x0119, B:63:0x0129, B:64:0x013a, B:65:0x013e, B:67:0x0148, B:69:0x0159, B:71:0x015d, B:72:0x0161, B:74:0x0167, B:76:0x0184, B:79:0x01a9, B:80:0x01ad, B:82:0x01b5, B:83:0x01bb, B:87:0x017f, B:88:0x0104), top: B:5:0x0018 }] */
    /* renamed from: s1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m44680s1(C3020p0 c3020p0, C21697g c21697g, C21697g c21697g2, C8362q0 c8362q0, boolean z11, boolean z12, Context context, InterfaceC10867f interfaceC10867f, int i11) {
        C22126c0 c22126c0;
        CharSequence m108615L;
        C22126c0 c22126c02;
        C22126c0 c22126c03;
        C22126c0 c22126c04;
        ArrayList arrayList;
        boolean z13;
        AbstractC19074t.m100208f(c21697g2, "textViewExtraInfo");
        if (c21697g == null) {
            return;
        }
        try {
            c21697g.m111959G1("");
            c21697g.mo44614b1(8);
            AbstractC19074t.m100205c(c8362q0);
            c8362q0.mo44614b1(8);
            C16719g c16719g = this.f45349P0;
            if (c16719g == null) {
                AbstractC19074t.m100223u("bottomLine");
                c16719g = null;
            }
            c16719g.mo44614b1(8);
            if (c3020p0 == null) {
                return;
            }
            boolean m108641e0 = AbstractC20814p0.m108641e0(i11);
            CharSequence m108605G = AbstractC20814p0.m108605G(c3020p0, z11, m108641e0, c21697g);
            if (!TextUtils.isEmpty(m108605G)) {
                ArrayList arrayList2 = c3020p0.f12029I;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C10866e c10866e = (C10866e) it.next();
                        c10866e.m56371O(z12);
                        c10866e.m56369M(interfaceC10867f);
                    }
                }
                ArrayList arrayList3 = c3020p0.f12030J;
                if (arrayList3 != null) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        C10866e c10866e2 = (C10866e) it2.next();
                        c10866e2.m56371O(z12);
                        c10866e2.m56369M(interfaceC10867f);
                        if (c3020p0.m14498b0()) {
                            c10866e2.m56372P(1);
                            c10866e2.m56374R(c3020p0.f12058q);
                        } else {
                            c10866e2.m56372P(0);
                            c10866e2.m56374R(c3020p0.f12058q);
                        }
                    }
                }
                ArrayList arrayList4 = c3020p0.f12031K;
                if (arrayList4 != null) {
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        C10866e c10866e3 = (C10866e) it3.next();
                        c10866e3.m56371O(z12);
                        c10866e3.m56369M(interfaceC10867f);
                        if (c3020p0.m14498b0()) {
                            c10866e3.m56372P(1);
                            c10866e3.m56374R(c3020p0.f12058q);
                        } else {
                            c10866e3.m56372P(0);
                            c10866e3.m56374R(c3020p0.f12058q);
                        }
                    }
                }
                C3025q0 c3025q0 = c3020p0.f12023C;
                if (c3025q0 != null && c3025q0.f12096E != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                CharSequence m152970f = C31839a6.m152970f(m108605G, c3020p0.m14531w(z11, m108641e0), z13, interfaceC10867f);
                if (z12) {
                    c21697g.m111955C1(C10887z.m56529k());
                    C28100j3 c28100j3 = new C28100j3(1);
                    c28100j3.m141567a(c3020p0.f12057p, c3020p0.m14465A());
                    c21697g.setTag(AbstractC6918a0.tag_callback_span_listener, interfaceC10867f);
                    c21697g.setTag(AbstractC6918a0.tag_callback_span_data, c28100j3);
                } else {
                    c21697g.m111955C1(C10880s.m56519f());
                }
                c21697g.mo44614b1(0);
                c8362q0.mo44614b1(0);
                C16719g c16719g2 = this.f45349P0;
                if (c16719g2 == null) {
                    AbstractC19074t.m100223u("bottomLine");
                    c16719g2 = null;
                }
                c16719g2.mo44614b1(0);
                c21697g.m111959G1(m152970f);
                if (!TextUtils.isEmpty(c3020p0.f12023C.f12110a)) {
                    AbstractC20814p0.m108662p(context, c21697g, c3020p0.f12023C.f12110a.toString(), c3020p0.f12029I);
                } else {
                    c22126c0 = null;
                    c21697g.m89111N0(null);
                    m108615L = AbstractC20814p0.m108615L(c3020p0, interfaceC10867f);
                    if (TextUtils.isEmpty(m108615L)) {
                        c21697g2.m111955C1(C10880s.m56519f());
                        c21697g2.mo44614b1(0);
                        c21697g2.m111959G1(m108615L);
                        C3003l3 c3003l3 = c3020p0.f12059r;
                        if (c3003l3 != null && (arrayList = c3003l3.f11959d) != null) {
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                C10866e.m56359e((C10866e) it4.next(), c3020p0.f12057p, c3020p0.f12022B.f12280b, c3020p0.f12059r.f11956a, c3020p0.f12058q, interfaceC10867f);
                            }
                        }
                    } else {
                        c21697g2.mo44614b1(8);
                    }
                    c21697g.m111984z1(0.8f, 1.0f);
                    c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85297f4));
                    c21697g.m111962J1(C23212s8.m119607o(c21697g.getContext(), AbstractC21196a.TextColor1));
                    c22126c02 = this.f45346M0;
                    if (c22126c02 == null) {
                        AbstractC19074t.m100223u("tvMessage");
                        c22126c02 = c22126c0;
                    }
                    CharSequence m111973m1 = c22126c02.m111973m1();
                    c22126c03 = this.f45346M0;
                    if (c22126c03 != null) {
                        AbstractC19074t.m100223u("tvMessage");
                        c22126c04 = c22126c0;
                    } else {
                        c22126c04 = c22126c03;
                    }
                    AbstractC20814p0.m108678x(m111973m1, c22126c04);
                    AbstractC20814p0.m108618M0(c3020p0);
                }
            }
            c22126c0 = null;
            m108615L = AbstractC20814p0.m108615L(c3020p0, interfaceC10867f);
            if (TextUtils.isEmpty(m108615L)) {
            }
            c21697g.m111984z1(0.8f, 1.0f);
            c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85297f4));
            c21697g.m111962J1(C23212s8.m119607o(c21697g.getContext(), AbstractC21196a.TextColor1));
            c22126c02 = this.f45346M0;
            if (c22126c02 == null) {
            }
            CharSequence m111973m12 = c22126c02.m111973m1();
            c22126c03 = this.f45346M0;
            if (c22126c03 != null) {
            }
            AbstractC20814p0.m108678x(m111973m12, c22126c04);
            AbstractC20814p0.m108618M0(c3020p0);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: u1 */
    public final void m44681u1(C3000l0 c3000l0, int i11, Context context, InterfaceC10867f interfaceC10867f) {
        C22126c0 c22126c0;
        C22126c0 c22126c02;
        C8362q0 c8362q0;
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return;
            }
            m14324b0.f12037Q = 1;
            C22126c0 c22126c03 = this.f45346M0;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("tvMessage");
                c22126c0 = null;
            } else {
                c22126c0 = c22126c03;
            }
            C22126c0 c22126c04 = this.f45347N0;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("tvTagAndLocation");
                c22126c02 = null;
            } else {
                c22126c02 = c22126c04;
            }
            C8362q0 c8362q02 = this.f45348O0;
            if (c8362q02 == null) {
                AbstractC19074t.m100223u("feedBgView");
                c8362q0 = null;
            } else {
                c8362q0 = c8362q02;
            }
            m44680s1(m14324b0, c22126c0, c22126c02, c8362q0, true, true, context, interfaceC10867f, this.f45351R0);
            m44678v1(c3000l0);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
