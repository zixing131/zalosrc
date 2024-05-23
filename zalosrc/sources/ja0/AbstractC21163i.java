package ja0;

import android.content.Context;
import android.view.ViewGroup;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.custom.C11874v;
import com.zing.zalo.p077ui.moduleview.search.C12458a;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import dj.C17945a0;
import ea0.C18333g1;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ia0.AbstractC20484a;
import id0.C20518d;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23024b7;
import me0.C23250w4;
import me0.C23278z2;
import p056cj.AbstractC3552t;
import p056cj.C3548p;
import p056cj.C3549q;
import p056cj.C3551s;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29080l;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import vg.AbstractC28236y3;
import vg.AbstractRunnableC28185s6;
import w50.C28770b;

/* renamed from: ja0.i */
/* loaded from: classes6.dex */
public abstract class AbstractC21163i extends AbstractC20484a implements AbstractRunnableC28185s6.b {

    /* renamed from: J */
    private final InterfaceC18319c f103251J;

    /* renamed from: K */
    private AbstractC29069a.a f103252K;

    /* renamed from: L */
    private boolean f103253L;

    /* renamed from: M */
    private final InterfaceC24854k f103254M;

    /* renamed from: N */
    private final InterfaceC24854k f103255N;

    /* renamed from: O */
    private final InterfaceC24854k f103256O;

    /* renamed from: P */
    private final InterfaceC24854k f103257P;

    /* renamed from: Q */
    private final InterfaceC24854k f103258Q;

    /* renamed from: R */
    private final InterfaceC24854k f103259R;

    /* renamed from: ja0.i$a */
    /* loaded from: classes6.dex */
    public static final class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C11874v f103260l1;

        /* renamed from: m1 */
        final /* synthetic */ C12458a f103261m1;

        /* renamed from: n1 */
        final /* synthetic */ boolean f103262n1;

        a(C11874v c11874v, C12458a c12458a, boolean z11) {
            this.f103260l1 = c11874v;
            this.f103261m1 = c12458a;
            this.f103262n1 = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (AbstractC19074t.m100204b(this.f103260l1.m89133b0(), str) && c3979l != null) {
                    this.f103261m1.m69930r1().m69939o1().setImageInfo(c3979l, false);
                    if (this.f103262n1) {
                        this.f103260l1.mo111924u1(c3979l.m18839c());
                    } else {
                        this.f103260l1.mo111924u1(c3979l.m18839c());
                        this.f103260l1.m89135c1(new C20518d().m106593j(200L));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: ja0.i$b */
    /* loaded from: classes6.dex */
    public static final class b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C11874v f103263l1;

        /* renamed from: m1 */
        final /* synthetic */ C12458a f103264m1;

        /* renamed from: n1 */
        final /* synthetic */ boolean f103265n1;

        b(C11874v c11874v, C12458a c12458a, boolean z11) {
            this.f103263l1 = c11874v;
            this.f103264m1 = c12458a;
            this.f103265n1 = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (AbstractC19074t.m100204b(this.f103263l1.m89133b0(), str) && c3979l != null) {
                    this.f103264m1.m69932t1().m69944o1().setImageInfo(c3979l, false);
                    if (this.f103265n1) {
                        this.f103263l1.mo111924u1(c3979l.m18839c());
                    } else {
                        this.f103263l1.mo111924u1(c3979l.m18839c());
                        this.f103263l1.m89135c1(new C20518d().m106593j(200L));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: ja0.i$c */
    /* loaded from: classes6.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(AbstractC21163i.this.f7784p.getContext(), 1.0f));
        }
    }

    /* renamed from: ja0.i$d */
    /* loaded from: classes6.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f103267q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.chat_file_download_noti_content);
        }
    }

    /* renamed from: ja0.i$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {
        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(AbstractC21163i.this.f7784p.getContext(), 4.0f));
        }
    }

    /* renamed from: ja0.i$f */
    /* loaded from: classes6.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f103269q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C28770b mo12V4() {
            return new C28770b();
        }
    }

    /* renamed from: ja0.i$g */
    /* loaded from: classes6.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f103270q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_msg_file_open);
        }
    }

    /* renamed from: ja0.i$h */
    /* loaded from: classes6.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f103271q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(C23250w4.f112644a.m119820F());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ja0.i$i */
    /* loaded from: classes6.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f103273r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(1);
            this.f103273r = str;
        }

        /* renamed from: a */
        public final void m109686a(String str) {
            AbstractC19074t.m100208f(str, "uid");
            AbstractC29069a.a aVar = AbstractC21163i.this.f103252K;
            if (aVar != null) {
                String str2 = this.f103273r;
                AbstractC21163i abstractC21163i = AbstractC21163i.this;
                if (AbstractC19074t.m100204b(str, aVar.m145143g())) {
                    C23024b7.f111993a.m118058U(aVar, str2);
                    abstractC21163i.m109643A0((C12458a) abstractC21163i.m106522i0(), aVar);
                    abstractC21163i.m109677z0((C12458a) abstractC21163i.m106522i0(), aVar, abstractC21163i.f103253L);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m109686a((String) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ AbstractC21163i(ViewGroup viewGroup, C23528a c23528a, InterfaceC18319c interfaceC18319c, boolean z11, boolean z12, AbstractC19060k abstractC19060k) {
        this(viewGroup, c23528a, interfaceC18319c, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public final void m109643A0(C12458a c12458a, AbstractC29069a.a aVar) {
        c12458a.m69934v1().m111959G1(aVar.m145150n());
    }

    /* renamed from: B0 */
    private final void m109644B0(C12458a c12458a, C3549q c3549q) {
        AbstractC29069a.a aVar;
        AbstractC29069a.a aVar2;
        CharSequence m18040c;
        String str;
        InterfaceC18319c interfaceC18319c;
        C17945a0 m145141e;
        InterfaceC18319c interfaceC18319c2 = this.f103251J;
        if (interfaceC18319c2 != null) {
        }
        AbstractC29069a.a aVar3 = this.f103252K;
        if (aVar3 != null && (m145141e = aVar3.m145141e()) != null) {
            AbstractC29069a.a aVar4 = this.f103252K;
            if (aVar4 != null) {
                aVar4.m145161y(m109678R0(m145141e));
            }
        } else {
            AbstractC29069a.a aVar5 = this.f103252K;
            if (aVar5 != null) {
                aVar5.m145161y(0);
            }
        }
        AbstractC29069a.a aVar6 = this.f103252K;
        if (((aVar6 != null && aVar6.m145149m() == 1) || (((aVar = this.f103252K) != null && aVar.m145149m() == 4) || ((aVar2 = this.f103252K) != null && aVar2.m145149m() == 3))) && (interfaceC18319c = this.f103251J) != null) {
        }
        if (c3549q != null) {
            C12458a.a m69930r1 = c12458a.m69930r1();
            if (m69930r1 != null) {
                C22126c0 m69940p1 = m69930r1.m69940p1();
                AbstractC29069a.a aVar7 = this.f103252K;
                if (aVar7 == null || (m18040c = aVar7.m145144h()) == null) {
                    m18040c = c3549q.m18040c();
                }
                m69940p1.m111959G1(m18040c);
                C22126c0 c22126c0 = m69930r1.m69941q1().f108888M0;
                AbstractC29069a.a aVar8 = this.f103252K;
                String str2 = null;
                if (aVar8 != null) {
                    str = m109653K0(aVar8);
                } else {
                    str = null;
                }
                AbstractC29069a.a aVar9 = this.f103252K;
                if (aVar9 != null) {
                    str2 = m109649G0(aVar9);
                }
                c22126c0.m111959G1(str + str2);
                m69930r1.mo44614b1(0);
                return;
            }
            return;
        }
        C12458a.a m69930r12 = c12458a.m69930r1();
        if (m69930r12 != null) {
            m69930r12.mo44614b1(8);
        }
    }

    /* renamed from: C0 */
    private final void m109645C0(C12458a c12458a, C3551s c3551s) {
        int i11;
        CharSequence charSequence;
        CharSequence m18048c;
        int i12 = 8;
        if (c3551s != null) {
            C12458a.b m69932t1 = c12458a.m69932t1();
            if (m69932t1 != null) {
                m69932t1.m69945p1().m111959G1(c3551s.m18047b());
                C22126c0 m69945p1 = m69932t1.m69945p1();
                if (c3551s.m18047b().length() > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                m69945p1.mo44614b1(i11);
                AbstractC29069a.a aVar = this.f103252K;
                if (aVar == null || (charSequence = aVar.m145146j()) == null) {
                    if (c3551s.m18050e().length() > 0) {
                        charSequence = c3551s.m18050e();
                    } else if (c3551s.m18051f().length() > 0) {
                        charSequence = c3551s.m18051f();
                    } else {
                        charSequence = "Link";
                    }
                }
                m69932t1.m69946q1().m111959G1(charSequence);
                if (AbstractC19074t.m100204b(c3551s.m18046a(), "recommened.user")) {
                    m69932t1.m69947r1().mo44614b1(0);
                } else {
                    m69932t1.m69947r1().mo44614b1(8);
                }
                C22126c0 m69948s1 = m69932t1.m69948s1();
                AbstractC29069a.a aVar2 = this.f103252K;
                if (aVar2 == null || (m18048c = aVar2.m145147k()) == null) {
                    m18048c = c3551s.m18048c();
                    if (m18048c.length() == 0) {
                        m18048c = "";
                    }
                }
                m69948s1.m111959G1(m18048c);
                C22126c0 m69948s12 = m69932t1.m69948s1();
                if (c3551s.m18048c().length() > 0) {
                    i12 = 0;
                }
                m69948s12.mo44614b1(i12);
                m69932t1.mo44614b1(0);
                return;
            }
            return;
        }
        C12458a.b m69932t12 = c12458a.m69932t1();
        if (m69932t12 != null) {
            m69932t12.mo44614b1(8);
        }
    }

    /* renamed from: D0 */
    private final void m109646D0(C12458a c12458a, AbstractC29069a.a aVar, boolean z11) {
        C11874v m69949t1;
        C11874v m69942r1;
        C3549q c3549q;
        C12458a.a m69930r1 = c12458a.m69930r1();
        C3551s c3551s = null;
        if (m69930r1 != null && (m69942r1 = m69930r1.m69942r1()) != null) {
            AbstractC3552t m18034a = aVar.m145142f().m18034a();
            if (m18034a instanceof C3549q) {
                c3549q = (C3549q) m18034a;
            } else {
                c3549q = null;
            }
            if (c3549q != null) {
                if (c3549q.m18043f().length() > 0) {
                    m69942r1.m111929z1(5);
                    m69942r1.mo111926w1(AbstractC16803z.chat_icloud_default);
                    m69942r1.m89087B0(AbstractC16803z.ic_link_placeholder);
                    boolean m125696L2 = C23999j.m125696L2(c3549q.m18043f(), C23278z2.m120126f0());
                    m69942r1.m89129Y0(c3549q.m18043f());
                    m69942r1.m89106L().m89041Y(m109648F0());
                    if (m125696L2 || !z11) {
                        ((C23528a) c12458a.m69927o1().m123612r(c12458a.m69930r1().m69939o1())).m123579C(c3549q.m18043f(), C23278z2.m120126f0(), new a(m69942r1, c12458a, m125696L2));
                    }
                } else {
                    m69942r1.m111929z1(0);
                    m69942r1.m89106L().m89041Y(0);
                    m69942r1.m89085A0(null);
                    if (c3549q.m18042e() == 2) {
                        m69942r1.mo111926w1(AbstractC16803z.icn_folder);
                    } else {
                        m69942r1.mo111925v1(AbstractC28236y3.m142197h(m69942r1.getContext(), c3549q.m18038a()));
                    }
                }
                Integer m18039b = c3549q.m18039b();
                if (m18039b != null && m18039b.intValue() == 1) {
                    if (c3549q.m18043f().length() > 0) {
                        c12458a.m69930r1().m69943s1().mo111926w1(AbstractC16803z.icn_file_filetype_pdf);
                        c12458a.m69930r1().m69943s1().mo44614b1(0);
                    } else {
                        c12458a.m69930r1().m69943s1().mo44614b1(8);
                    }
                } else if (m18039b != null && m18039b.intValue() == 0) {
                    if (c3549q.m18043f().length() > 0) {
                        c12458a.m69930r1().m69943s1().mo111926w1(AbstractC16803z.icn_file_thumb_vid);
                        c12458a.m69930r1().m69943s1().mo44614b1(0);
                    } else {
                        c12458a.m69930r1().m69943s1().mo44614b1(8);
                    }
                } else if (m18039b != null && m18039b.intValue() == -1) {
                    c12458a.m69930r1().m69943s1().mo111925v1(null);
                    c12458a.m69930r1().m69943s1().mo44614b1(8);
                } else {
                    c12458a.m69930r1().m69943s1().mo111925v1(null);
                    c12458a.m69930r1().m69943s1().mo44614b1(8);
                }
            }
        }
        C12458a.b m69932t1 = c12458a.m69932t1();
        if (m69932t1 != null && (m69949t1 = m69932t1.m69949t1()) != null) {
            AbstractC3552t m18035b = aVar.m145142f().m18035b();
            if (m18035b instanceof C3551s) {
                c3551s = (C3551s) m18035b;
            }
            if (c3551s != null) {
                m69949t1.mo111926w1(AbstractC16803z.ic_link_broken);
                if (c3551s.m18049d().length() > 0) {
                    m69949t1.m89106L().m89041Y(0);
                    boolean m125696L22 = C23999j.m125696L2(c3551s.m18049d(), C23278z2.m120126f0());
                    m69949t1.m89129Y0(c3551s.m18049d());
                    if (m125696L22 || !z11 || C23250w4.f112644a.m119843q()) {
                        ((C23528a) c12458a.m69927o1().m123612r(c12458a.m69932t1().m69944o1())).m123579C(c3551s.m18049d(), C23278z2.m120126f0(), new b(m69949t1, c12458a, m125696L22));
                        return;
                    }
                    return;
                }
                if (c3551s.m18047b().length() > 0) {
                    m69949t1.m89106L().m89041Y(0);
                    C16640q2.d mo88407a = C16640q2.m88404a().mo88408b().mo88409c().mo88407a();
                    String substring = c3551s.m18047b().substring(0, 1);
                    AbstractC19074t.m100207e(substring, "substring(...)");
                    m69949t1.mo111925v1(mo88407a.mo88410d(substring, m109655M0(), m109651I0()));
                }
            }
        }
    }

    /* renamed from: E0 */
    private final void m109647E0(C12458a c12458a, AbstractC29069a.a aVar, AbstractC29080l abstractC29080l) {
        int i11;
        CharSequence m145151o = aVar.m145151o();
        if (m145151o != null) {
            c12458a.m69937y1().m111959G1(m145151o);
            C22126c0 m69937y1 = c12458a.m69937y1();
            if (m145151o.length() == 0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            m69937y1.mo44614b1(i11);
        } else {
            c12458a.m69937y1().mo44614b1(8);
        }
        c12458a.m69938z1().m111959G1(aVar.m145191c());
        c12458a.m69938z1().mo44614b1(0);
        if (aVar.m145142f().m18036c() > 1) {
            ((C12458a) m106522i0()).m69935w1().m69950o1().m111959G1(aVar.m145145i());
            ((C12458a) m106522i0()).m69929q1().m89106L().m89044a0(0);
            c12458a.m69935w1().mo44614b1(0);
        } else {
            c12458a.m69935w1().mo44614b1(8);
            ((C12458a) m106522i0()).m69929q1().m89106L().m89044a0(AbstractC23136l9.m118712h(c12458a.getContext(), 16.0f));
        }
        C18333g1.f92667a.m97293j(c12458a.m69928p1(), c12458a.m69933u1(), aVar, abstractC29080l);
    }

    /* renamed from: F0 */
    private final int m109648F0() {
        return ((Number) this.f103254M.getValue()).intValue();
    }

    /* renamed from: G0 */
    private final String m109649G0(AbstractC29069a.a aVar) {
        Integer num;
        int m145149m = aVar.m145149m();
        if (m145149m != 1) {
            if (m145149m != 2) {
                if (m145149m != 3) {
                    return "";
                }
            } else {
                return " • " + m109654L0();
            }
        }
        if (aVar.m145141e() != null) {
            String m109650H0 = m109650H0();
            C17945a0 m145141e = aVar.m145141e();
            if (m145141e != null) {
                num = Integer.valueOf(m145141e.m94982Q2());
            } else {
                num = null;
            }
            String str = " • " + m109650H0 + " (" + num + "%)";
            if (str != null) {
                return str;
            }
        }
        return " • " + m109650H0();
    }

    /* renamed from: H0 */
    private final String m109650H0() {
        return (String) this.f103258Q.getValue();
    }

    /* renamed from: I0 */
    private final int m109651I0() {
        return ((Number) this.f103255N.getValue()).intValue();
    }

    /* renamed from: J0 */
    private final C28770b m109652J0() {
        return (C28770b) this.f103259R.getValue();
    }

    /* renamed from: K0 */
    private final String m109653K0(AbstractC29069a.a aVar) {
        C3549q c3549q;
        Object m129218b;
        String str;
        AbstractC3552t m18034a = aVar.m145142f().m18034a();
        if (m18034a instanceof C3549q) {
            c3549q = (C3549q) m18034a;
        } else {
            c3549q = null;
        }
        if (c3549q == null) {
            return "";
        }
        if (aVar.m145148l() == null) {
            try {
                C24861r.a aVar2 = C24861r.f119264q;
                if (c3549q.m18041d() < 1024) {
                    str = c3549q.m18041d() + " B";
                } else if (c3549q.m18041d() < 1048576) {
                    str = (c3549q.m18041d() / 1024) + " KB";
                } else {
                    str = (c3549q.m18041d() / ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) + " MB";
                }
                m129218b = C24861r.m129218b(str);
            } catch (Throwable th2) {
                C24861r.a aVar3 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            if (C24861r.m129223g(m129218b)) {
                m129218b = "";
            }
            aVar.m145160x((String) m129218b);
        }
        String m145148l = aVar.m145148l();
        if (m145148l == null) {
            return "";
        }
        return m145148l;
    }

    /* renamed from: L0 */
    private final String m109654L0() {
        return (String) this.f103257P.getValue();
    }

    /* renamed from: M0 */
    private final int m109655M0() {
        return ((Number) this.f103256O.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public static final void m109656N0(AbstractC21163i abstractC21163i, C16719g c16719g) {
        AbstractC3552t abstractC3552t;
        C3548p m145142f;
        AbstractC19074t.m100208f(abstractC21163i, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC21163i.f103251J;
        if (interfaceC18319c != null) {
            AbstractC29069a.a aVar = abstractC21163i.f103252K;
            Integer valueOf = Integer.valueOf(abstractC21163i.m9929A());
            AbstractC29069a.a aVar2 = abstractC21163i.f103252K;
            if (aVar2 != null && (m145142f = aVar2.m145142f()) != null) {
                abstractC3552t = m145142f.m18034a();
            } else {
                abstractC3552t = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public static final void m109657O0(AbstractC21163i abstractC21163i, C16719g c16719g) {
        AbstractC3552t abstractC3552t;
        C3548p m145142f;
        AbstractC19074t.m100208f(abstractC21163i, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC21163i.f103251J;
        if (interfaceC18319c != null) {
            AbstractC29069a.a aVar = abstractC21163i.f103252K;
            Integer valueOf = Integer.valueOf(abstractC21163i.m9929A());
            AbstractC29069a.a aVar2 = abstractC21163i.f103252K;
            if (aVar2 != null && (m145142f = aVar2.m145142f()) != null) {
                abstractC3552t = m145142f.m18034a();
            } else {
                abstractC3552t = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public static final void m109658P0(AbstractC21163i abstractC21163i, C16719g c16719g) {
        AbstractC3552t abstractC3552t;
        C3548p m145142f;
        AbstractC19074t.m100208f(abstractC21163i, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC21163i.f103251J;
        if (interfaceC18319c != null) {
            AbstractC29069a.a aVar = abstractC21163i.f103252K;
            Integer valueOf = Integer.valueOf(abstractC21163i.m9929A());
            AbstractC29069a.a aVar2 = abstractC21163i.f103252K;
            if (aVar2 != null && (m145142f = aVar2.m145142f()) != null) {
                abstractC3552t = m145142f.m18035b();
            } else {
                abstractC3552t = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public static final void m109659Q0(AbstractC21163i abstractC21163i, C16719g c16719g) {
        AbstractC3552t abstractC3552t;
        C3548p m145142f;
        AbstractC19074t.m100208f(abstractC21163i, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC21163i.f103251J;
        if (interfaceC18319c != null) {
            AbstractC29069a.a aVar = abstractC21163i.f103252K;
            Integer valueOf = Integer.valueOf(abstractC21163i.m9929A());
            AbstractC29069a.a aVar2 = abstractC21163i.f103252K;
            if (aVar2 != null && (m145142f = aVar2.m145142f()) != null) {
                abstractC3552t = m145142f.m18035b();
            } else {
                abstractC3552t = null;
            }
        }
    }

    /* renamed from: S0 */
    private final int m109660S0(C17945a0 c17945a0) {
        int i11;
        int m95107d3;
        int i12 = 0;
        try {
            if (c17945a0.m95032V6()) {
                if (c17945a0.m95089b4() == 1) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 0;
            }
        } catch (Exception e11) {
            e = e11;
        }
        if (i11 != 4) {
            try {
                m95107d3 = c17945a0.m95107d3();
            } catch (Exception e12) {
                e = e12;
                i12 = i11;
                e.printStackTrace();
                return i12;
            }
            if (m95107d3 != 2) {
                if (m95107d3 != 3) {
                    if (m95107d3 == 4) {
                        return 1;
                    }
                    if (m95107d3 != 5) {
                        if (m95107d3 == 6) {
                            return 6;
                        }
                    } else {
                        return 2;
                    }
                } else {
                    return 5;
                }
            } else {
                if (c17945a0.m95032V6()) {
                    if (!c17945a0.m95180k8()) {
                        i12 = 2;
                    }
                }
                return i12;
            }
        }
        return i11;
    }

    /* renamed from: T0 */
    private final void m109661T0(AbstractC29069a.a aVar) {
        String m145143g = aVar.m145143g();
        if (aVar.m145150n().length() == 0) {
            C18333g1.f92667a.m97300y(this, m145143g, new i(m145143g));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public static final void m109669q0(AbstractC21163i abstractC21163i, C16719g c16719g) {
        AbstractC19074t.m100208f(abstractC21163i, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC21163i.f103251J;
        if (interfaceC18319c != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m109670r0(AbstractC21163i abstractC21163i, C16719g c16719g) {
        AbstractC19074t.m100208f(abstractC21163i, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC21163i.f103251J;
        if (interfaceC18319c != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m109671s0(AbstractC21163i abstractC21163i, C16719g c16719g) {
        AbstractC19074t.m100208f(abstractC21163i, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC21163i.f103251J;
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m109676y0(AbstractC21163i abstractC21163i, AbstractC29069a.a aVar, AbstractC29080l abstractC29080l, boolean z11, Object obj, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 8) != 0) {
                obj = null;
            }
            abstractC21163i.m109679x0(aVar, abstractC29080l, z11, obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public final void m109677z0(C12458a c12458a, AbstractC29069a.a aVar, boolean z11) {
        int i11;
        c12458a.m69931s1().f108931U0 = z11;
        c12458a.m69931s1().m115435s1(aVar.m145143g(), aVar.m145140d(), aVar.m145150n());
        C21693c m69936x1 = c12458a.m69936x1();
        if (aVar.m145153q()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        m69936x1.mo44614b1(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:            if (m109652J0().m143918k() == false) goto L18;     */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m109678R0(C17945a0 c17945a0) {
        int i11;
        AbstractC19074t.m100208f(c17945a0, "message");
        try {
            i11 = m109660S0(c17945a0);
        } catch (Exception e11) {
            e = e11;
            i11 = 0;
        }
        try {
            if (i11 != 2) {
                if (i11 == 3) {
                    if (m109652J0().m143919l() && m109652J0().m143921n()) {
                        i11 = 1;
                    }
                    i11 = 5;
                }
            }
        } catch (Exception e12) {
            e = e12;
            e.printStackTrace();
            return i11;
        }
        return i11;
    }

    @Override // vg.AbstractRunnableC28185s6.b
    public Object getTag(int i11) {
        Object tag = this.f7784p.getTag(i11);
        AbstractC19074t.m100207e(tag, "getTag(...)");
        return tag;
    }

    @Override // vg.AbstractRunnableC28185s6.b
    public void setTag(int i11, Object obj) {
        this.f7784p.setTag(i11, obj);
    }

    /* renamed from: x0 */
    public final void m109679x0(AbstractC29069a.a aVar, AbstractC29080l abstractC29080l, boolean z11, Object obj) {
        C3549q c3549q;
        AbstractC19074t.m100208f(aVar, "data");
        this.f103252K = aVar;
        this.f103253L = z11;
        m109661T0(aVar);
        C12458a c12458a = (C12458a) m106522i0();
        if (obj == null) {
            m109643A0(c12458a, aVar);
            m109647E0(c12458a, aVar, abstractC29080l);
            AbstractC3552t m18034a = aVar.m145142f().m18034a();
            C3551s c3551s = null;
            if (m18034a instanceof C3549q) {
                c3549q = (C3549q) m18034a;
            } else {
                c3549q = null;
            }
            m109644B0(c12458a, c3549q);
            AbstractC3552t m18035b = aVar.m145142f().m18035b();
            if (m18035b instanceof C3551s) {
                c3551s = (C3551s) m18035b;
            }
            m109645C0(c12458a, c3551s);
        }
        if (obj == null || AbstractC19074t.m100204b(obj, "PAYLOAD_SCROLL_STATE_CHANGED")) {
            m109677z0(c12458a, aVar, z11);
            m109646D0(c12458a, aVar, z11);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC21163i(ViewGroup viewGroup, C23528a c23528a, InterfaceC18319c interfaceC18319c, boolean z11, boolean z12) {
        super(viewGroup, new C12458a(r1, c23528a, z11, z12));
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f103251J = interfaceC18319c;
        m129210a = AbstractC24856m.m129210a(new c());
        this.f103254M = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new e());
        this.f103255N = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(h.f103271q);
        this.f103256O = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(g.f103270q);
        this.f103257P = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(d.f103267q);
        this.f103258Q = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(f.f103269q);
        this.f103259R = m129210a6;
        ((C12458a) m106522i0()).mo89109M0(new C16719g.c() { // from class: ja0.b
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                AbstractC21163i.m109669q0(AbstractC21163i.this, c16719g);
            }
        });
        ((C12458a) m106522i0()).m89111N0(new C16719g.d() { // from class: ja0.c
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                AbstractC21163i.m109670r0(AbstractC21163i.this, c16719g);
            }
        });
        ((C12458a) m106522i0()).m69935w1().mo89109M0(new C16719g.c() { // from class: ja0.d
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                AbstractC21163i.m109671s0(AbstractC21163i.this, c16719g);
            }
        });
        C12458a.a m69930r1 = ((C12458a) m106522i0()).m69930r1();
        if (m69930r1 != null) {
            m69930r1.mo89109M0(new C16719g.c() { // from class: ja0.e
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    AbstractC21163i.m109656N0(AbstractC21163i.this, c16719g);
                }
            });
            m69930r1.m89111N0(new C16719g.d() { // from class: ja0.f
                @Override // com.zing.zalo.uidrawing.C16719g.d
                /* renamed from: f */
                public final void mo942f(C16719g c16719g) {
                    AbstractC21163i.m109657O0(AbstractC21163i.this, c16719g);
                }
            });
        }
        C12458a.b m69932t1 = ((C12458a) m106522i0()).m69932t1();
        if (m69932t1 != null) {
            m69932t1.mo89109M0(new C16719g.c() { // from class: ja0.g
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    AbstractC21163i.m109658P0(AbstractC21163i.this, c16719g);
                }
            });
            m69932t1.m89111N0(new C16719g.d() { // from class: ja0.h
                @Override // com.zing.zalo.uidrawing.C16719g.d
                /* renamed from: f */
                public final void mo942f(C16719g c16719g) {
                    AbstractC21163i.m109659Q0(AbstractC21163i.this, c16719g);
                }
            });
        }
    }
}
