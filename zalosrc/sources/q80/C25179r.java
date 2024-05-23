package q80;

import ai.InterfaceC0861a;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import cd0.C3431j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ga0.C19322f1;
import gw.AbstractC19646n0;
import gw.C19636i1;
import kd0.C21693c;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.AbstractC23217t2;
import me0.C23212s8;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p461qu.AbstractC25495a;
import p612wk.AbstractC29069a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: q80.r */
/* loaded from: classes6.dex */
public final class C25179r extends C16716d {

    /* renamed from: M0 */
    private C23528a f120790M0;

    /* renamed from: N0 */
    private InterfaceC18319c f120791N0;

    /* renamed from: O0 */
    private final C16716d f120792O0;

    /* renamed from: P0 */
    private final C22129e f120793P0;

    /* renamed from: Q0 */
    private final C22126c0 f120794Q0;

    /* renamed from: R0 */
    private final C21693c f120795R0;

    /* renamed from: S0 */
    private final C22126c0 f120796S0;

    /* renamed from: T0 */
    private final C22126c0 f120797T0;

    /* renamed from: U0 */
    private final C16716d f120798U0;

    /* renamed from: V0 */
    private final C21693c f120799V0;

    /* renamed from: W0 */
    private final int f120800W0;

    /* renamed from: X0 */
    private final int f120801X0;

    /* renamed from: Y0 */
    private final int f120802Y0;

    /* renamed from: Z0 */
    private final InterfaceC24854k f120803Z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q80.r$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C3431j mo12V4() {
            C3431j m17231c = C3431j.m17231c(C25179r.this.f120798U0);
            m17231c.m17195b(3);
            return m17231c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25179r(Context context, C23528a c23528a, InterfaceC18319c interfaceC18319c) {
        super(context);
        C22126c0 c22126c0;
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c23528a, "aQ");
        this.f120790M0 = c23528a;
        this.f120791N0 = interfaceC18319c;
        int m119607o = C23212s8.m119607o(context, AbstractC16781w.SearchGlobalTitleItemSearch);
        this.f120800W0 = m119607o;
        int m118742r = AbstractC23136l9.m118742r(56.0f);
        this.f120801X0 = m118742r;
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.msg_item_padding_l_r);
        this.f120802Y0 = m118655I;
        m89106L().m89028L(-1, -2).m89046b0(m118655I).m89047c0(m118655I).m89048d0(m118655I).m89044a0(AbstractC23136l9.m118742r(4.0f));
        C16716d c16716d = new C16716d(context);
        this.f120792O0 = c16716d;
        c16716d.m89106L().m89028L(m118742r, m118742r).m89026J(true);
        C22129e c22129e = new C22129e(context, m118742r);
        this.f120793P0 = c22129e;
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.m115422R1();
        c22126c02.mo111965M1(1);
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(10.0f));
        c22126c02.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
        c22126c02.m89087B0(AbstractC16803z.stencils_bg_number_notif);
        C16718f m89039W = c22126c02.m89106L().m89028L(-2, -2).m89029M(15).m89040X(AbstractC23136l9.m118742r(16.0f)).m89039W(AbstractC23136l9.m118742r(16.0f));
        Boolean bool = Boolean.TRUE;
        m89039W.m89017A(bool).m89018B(bool);
        this.f120794Q0 = c22126c02;
        C21693c c21693c = new C21693c(context);
        c21693c.mo111926w1(AbstractC16803z.ic_banned);
        c21693c.m89106L().m89028L(-2, -2).m89017A(bool).m89072y(bool);
        this.f120795R0 = c21693c;
        c16716d.m89001g1(c22129e);
        c16716d.m89001g1(c22126c02);
        c16716d.m89001g1(c21693c);
        C16716d c16716d2 = new C16716d(context);
        this.f120798U0 = c16716d2;
        c16716d2.m89106L().m89028L(-2, -2).m89017A(bool).m89035S(AbstractC23136l9.m118742r(16.0f)).m89026J(true);
        c16716d2.mo44614b1(8);
        C21693c c21693c2 = new C21693c(context);
        c21693c2.mo44614b1(8);
        c21693c2.mo111926w1(AbstractC16803z.ic_oa_verify);
        c21693c2.m89106L().m89028L(-2, -2).m89046b0(m118655I).m89047c0(m118655I).m89027K(true).m89049e0(c16716d2);
        this.f120799V0 = c21693c2;
        C22126c0 c22126c03 = new C22126c0(context);
        c22126c03.m111953A1(2);
        c22126c03.m111980v1(TextUtils.TruncateAt.END);
        c22126c03.m111962J1(m119607o);
        c22126c03.mo111964L1(AbstractC23136l9.m118742r(15.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        c22126c03.m111961I1(alignment);
        c22126c03.m111954B1(2);
        c22126c03.m89106L().m89028L(-1, -2).m89023G(c16716d).m89026J(true).m89036T(AbstractC23136l9.m118742r(8.0f));
        this.f120796S0 = c22126c03;
        if (C19322f1.f95953d) {
            c22126c0 = new C22126c0(context);
            c22126c0.m111953A1(3);
            c22126c0.m111962J1(-1);
            c22126c0.mo111964L1(AbstractC23136l9.m118742r(10.0f));
            c22126c0.mo111965M1(1);
            c22126c0.m111961I1(alignment);
            c22126c0.m89087B0(AbstractC16803z.roundedcorneredview_male);
            c22126c0.m89106L().m89028L(-2, -2).m89023G(c22126c03).m89026J(true).m89042Z(AbstractC23136l9.m118742r(4.0f), 0, AbstractC23136l9.m118742r(4.0f), 0);
        } else {
            c22126c0 = null;
        }
        this.f120797T0 = c22126c0;
        m89001g1(c16716d);
        m89001g1(c16716d2);
        m89001g1(c21693c2);
        m89001g1(c22126c03);
        if (c22126c0 != null) {
            m89001g1(c22126c0);
        }
        m89087B0(AbstractC16803z.search_global_bg_rect_transparent_with_press_state);
        m129210a = AbstractC24856m.m129210a(new a());
        this.f120803Z0 = m129210a;
    }

    /* renamed from: s1 */
    public static final void m130330s1(C25179r c25179r, AbstractC29069a.o oVar, int i11, C16719g c16719g) {
        AbstractC19074t.m100208f(c25179r, "this$0");
        AbstractC19074t.m100208f(oVar, "$item");
        InterfaceC18319c interfaceC18319c = c25179r.f120791N0;
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: t1 */
    private final C3431j m130331t1() {
        Object value = this.f120803Z0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (C3431j) value;
    }

    /* renamed from: q1 */
    public final void m130332q1(AbstractC29069a.o oVar, boolean z11) {
        AbstractC19074t.m100208f(oVar, "item");
        C22129e c22129e = this.f120793P0;
        c22129e.f108931U0 = z11;
        c22129e.m115435s1(oVar.m145198e().mo2478b(), oVar.m145196c(), oVar.m145198e().mo2475c());
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x024a A[Catch: Exception -> 0x0013, TryCatch #1 {Exception -> 0x0013, blocks: (B:3:0x0007, B:5:0x0010, B:9:0x001a, B:11:0x0024, B:13:0x013c, B:15:0x014a, B:19:0x0160, B:20:0x0196, B:22:0x019c, B:23:0x01a3, B:24:0x01b4, B:26:0x01bc, B:28:0x01dc, B:30:0x01e4, B:31:0x01f9, B:34:0x0207, B:36:0x022f, B:41:0x0243, B:43:0x024a, B:44:0x0277, B:46:0x027d, B:48:0x028f, B:51:0x0283, B:52:0x0255, B:54:0x025b, B:56:0x026b, B:57:0x01fe, B:58:0x01f0, B:59:0x01ca, B:61:0x01d0, B:63:0x016c, B:65:0x0178, B:67:0x018b, B:68:0x01a9, B:69:0x01af, B:70:0x0032, B:72:0x0038, B:74:0x0044, B:77:0x0050, B:81:0x0067, B:96:0x007a, B:87:0x0080, B:92:0x0083, B:104:0x0091, B:108:0x00a6, B:141:0x00b9, B:114:0x00bf, B:119:0x00c2, B:134:0x0137, B:137:0x0134, B:122:0x00d1, B:124:0x00da, B:126:0x00eb, B:128:0x010d), top: B:2:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0255 A[Catch: Exception -> 0x0013, TryCatch #1 {Exception -> 0x0013, blocks: (B:3:0x0007, B:5:0x0010, B:9:0x001a, B:11:0x0024, B:13:0x013c, B:15:0x014a, B:19:0x0160, B:20:0x0196, B:22:0x019c, B:23:0x01a3, B:24:0x01b4, B:26:0x01bc, B:28:0x01dc, B:30:0x01e4, B:31:0x01f9, B:34:0x0207, B:36:0x022f, B:41:0x0243, B:43:0x024a, B:44:0x0277, B:46:0x027d, B:48:0x028f, B:51:0x0283, B:52:0x0255, B:54:0x025b, B:56:0x026b, B:57:0x01fe, B:58:0x01f0, B:59:0x01ca, B:61:0x01d0, B:63:0x016c, B:65:0x0178, B:67:0x018b, B:68:0x01a9, B:69:0x01af, B:70:0x0032, B:72:0x0038, B:74:0x0044, B:77:0x0050, B:81:0x0067, B:96:0x007a, B:87:0x0080, B:92:0x0083, B:104:0x0091, B:108:0x00a6, B:141:0x00b9, B:114:0x00bf, B:119:0x00c2, B:134:0x0137, B:137:0x0134, B:122:0x00d1, B:124:0x00da, B:126:0x00eb, B:128:0x010d), top: B:2:0x0007, inners: #0 }] */
    /* renamed from: r1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m130333r1(AbstractC29069a.o oVar, boolean z11, int i11) {
        ContactProfile contactProfile;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        boolean z14;
        int m118669P;
        AbstractC19074t.m100208f(oVar, "item");
        try {
            InterfaceC0861a m145198e = oVar.m145198e();
            if (m145198e instanceof ContactProfile) {
                contactProfile = (ContactProfile) m145198e;
            } else {
                contactProfile = null;
            }
            if (contactProfile == null) {
                return;
            }
            if ((!AbstractC25495a.m132084i(contactProfile.f42434r) || AbstractC19074t.m100204b(contactProfile.f42437s, AbstractC23136l9.m118743r0(AbstractC8020f0.title_strangermsg))) && (!contactProfile.m40372J0() || AbstractC19074t.m100204b(contactProfile.f42437s, AbstractC21935u.m114547n()))) {
                if (contactProfile.f42399a1.isEmpty()) {
                    C22126c0 c22126c0 = this.f120796S0;
                    String m40383Q = contactProfile.m40383Q(true, false);
                    AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
                    int length = m40383Q.length() - 1;
                    int i14 = 0;
                    boolean z15 = false;
                    while (i14 <= length) {
                        if (!z15) {
                            i13 = i14;
                        } else {
                            i13 = length;
                        }
                        if (AbstractC19074t.m100209g(m40383Q.charAt(i13), 32) <= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z15) {
                            if (!z13) {
                                z15 = true;
                            } else {
                                i14++;
                            }
                        } else if (!z13) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    c22126c0.m111959G1(m40383Q.subSequence(i14, length + 1).toString());
                } else {
                    String m40383Q2 = contactProfile.m40383Q(true, false);
                    AbstractC19074t.m100207e(m40383Q2, "getDpnPhoneContact(...)");
                    int length2 = m40383Q2.length() - 1;
                    int i15 = 0;
                    boolean z16 = false;
                    while (i15 <= length2) {
                        if (!z16) {
                            i12 = i15;
                        } else {
                            i12 = length2;
                        }
                        if (AbstractC19074t.m100209g(m40383Q2.charAt(i12), 32) <= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z16) {
                            if (!z12) {
                                z16 = true;
                            } else {
                                i15++;
                            }
                        } else if (!z12) {
                            break;
                        } else {
                            length2--;
                        }
                    }
                    SpannableString spannableString = new SpannableString(m40383Q2.subSequence(i15, length2 + 1).toString());
                    for (int i16 = 0; i16 < contactProfile.f42399a1.size() - 1; i16 += 2) {
                        try {
                            Object obj = contactProfile.f42399a1.get(i16);
                            AbstractC19074t.m100207e(obj, "get(...)");
                            if (((Number) obj).intValue() >= 0) {
                                int i17 = i16 + 1;
                                Object obj2 = contactProfile.f42399a1.get(i17);
                                AbstractC19074t.m100207e(obj2, "get(...)");
                                int intValue = ((Number) obj2).intValue();
                                Object obj3 = contactProfile.f42399a1.get(i16);
                                AbstractC19074t.m100207e(obj3, "get(...)");
                                if (intValue > ((Number) obj3).intValue()) {
                                    Object obj4 = contactProfile.f42399a1.get(i16);
                                    AbstractC19074t.m100207e(obj4, "get(...)");
                                    int intValue2 = ((Number) obj4).intValue();
                                    Object obj5 = contactProfile.f42399a1.get(i17);
                                    AbstractC19074t.m100207e(obj5, "get(...)");
                                    AbstractC23217t2.m119663o(spannableString, intValue2, ((Number) obj5).intValue(), 0);
                                }
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    this.f120796S0.m111959G1(spannableString);
                }
            }
            if (C21927m.m114302u().m114345m(contactProfile.f42434r)) {
                C19636i1 m102800a = C19636i1.Companion.m102800a();
                String str = contactProfile.f42434r;
                AbstractC19074t.m100207e(str, "uid");
                int m102746E = m102800a.m102746E(str);
                if (m102746E > 0) {
                    if (m102746E > 5) {
                        this.f120794Q0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_over_5));
                    } else {
                        this.f120794Q0.m111959G1(String.valueOf(m102746E));
                    }
                } else {
                    if (m102746E == 0) {
                        C19636i1 m120606O1 = AbstractC23306f.m120606O1();
                        String mo2478b = contactProfile.mo2478b();
                        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                        if (m120606O1.m102765V(mo2478b)) {
                            this.f120794Q0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_N_character));
                        }
                    }
                    this.f120794Q0.mo44614b1(8);
                }
                if (AbstractC19646n0.m103021r(contactProfile)) {
                    this.f120794Q0.m89087B0(AbstractC16803z.stencils_bg_number_notif_grey);
                }
                this.f120794Q0.mo44614b1(0);
            } else {
                this.f120794Q0.mo44614b1(8);
            }
            if ((AbstractC25495a.m132084i(contactProfile.f42434r) && !AbstractC19074t.m100204b(contactProfile.f42437s, AbstractC23136l9.m118743r0(AbstractC8020f0.title_strangermsg))) || (contactProfile.m40372J0() && !AbstractC19074t.m100204b(contactProfile.f42437s, AbstractC21935u.m114547n()))) {
                if (AbstractC25495a.m132084i(contactProfile.f42434r)) {
                    this.f120796S0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.title_strangermsg));
                } else {
                    this.f120796S0.m111959G1(AbstractC21935u.m114547n());
                }
            }
            C22126c0 c22126c02 = this.f120797T0;
            if (c22126c02 != null) {
                c22126c02.m111959G1(String.valueOf(contactProfile.f42387W));
            }
            m130332q1(oVar, z11);
            contactProfile.m40374K0();
            this.f120793P0.mo89109M0(null);
            mo89109M0(new C16719g.c() { // from class: q80.q

                /* renamed from: q */
                public final /* synthetic */ AbstractC29069a.o f120788q;

                /* renamed from: r */
                public final /* synthetic */ int f120789r;

                public /* synthetic */ C25178q(AbstractC29069a.o oVar2, int i112) {
                    r2 = oVar2;
                    r3 = i112;
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C25179r.m130330s1(C25179r.this, r2, r3, c16719g);
                }
            });
            this.f120795R0.mo44614b1(8);
            if (C21927m.m114302u().m114357s().m153137g(contactProfile.f42434r)) {
                boolean m40345C0 = ContactProfile.m40345C0(contactProfile.f42352K0);
                if (!AbstractC25495a.m132086k(contactProfile.f42434r) && !m40345C0) {
                    z14 = false;
                    m118669P = AbstractC23136l9.m118669P(z14, true);
                    if (m118669P == -1) {
                        this.f120795R0.mo111926w1(m118669P);
                        this.f120795R0.mo44614b1(0);
                    } else {
                        this.f120795R0.mo44614b1(8);
                    }
                }
                z14 = true;
                m118669P = AbstractC23136l9.m118669P(z14, true);
                if (m118669P == -1) {
                }
            } else if (C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r)) {
                this.f120795R0.mo111926w1(AbstractC16803z.ic_banned);
                this.f120795R0.mo44614b1(0);
            }
            if (contactProfile.m40359B0() || contactProfile.m40384Q0()) {
                this.f120795R0.mo111926w1(AbstractC16803z.ic_oa_verify);
                this.f120795R0.mo44614b1(0);
            }
            m130331t1().f14383p.mo44614b1(8);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: u1 */
    public final void m130334u1(InterfaceC18319c interfaceC18319c) {
        this.f120791N0 = interfaceC18319c;
    }

    public /* synthetic */ C25179r(Context context, C23528a c23528a, InterfaceC18319c interfaceC18319c, int i11, AbstractC19060k abstractC19060k) {
        this(context, c23528a, (i11 & 4) != 0 ? null : interfaceC18319c);
    }
}
