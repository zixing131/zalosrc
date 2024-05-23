package p212hj;

import com.zing.zalo.location.C8967m;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import dj.C17945a0;
import dj.C17949b1;
import dj.C17969i0;
import dj.C18015z0;
import en0.InterfaceC18494a;
import fj.C18961d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19666x0;
import java.util.Map;
import n60.C23594g;
import p019aj.C0872f;
import p056cj.InterfaceC3534b;
import p207he.C20012f;
import p263jc.C21216s;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p445qe.C25244a;
import p471r3.C25630b;
import p588vw.C28644j;
import p716zh.C31986k3;
import p716zh.C32068pb;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vg.C28020b3;
import xd0.C29585a;

/* renamed from: hj.c */
/* loaded from: classes3.dex */
public final class C20072c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0872f f98685a;

    /* renamed from: b */
    private final C18961d f98686b;

    /* renamed from: c */
    private final C21216s f98687c;

    /* renamed from: d */
    private final InterfaceC24854k f98688d;

    /* renamed from: hj.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: hj.c$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f98689q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29585a mo12V4() {
            return AbstractC23306f.m120644b();
        }
    }

    public C20072c(C0872f c0872f, C18961d c18961d, C21216s c21216s) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c0872f, "chatRepo");
        AbstractC19074t.m100208f(c18961d, "chatNotiManager");
        AbstractC19074t.m100208f(c21216s, "autoDownloadController");
        this.f98685a = c0872f;
        this.f98686b = c18961d;
        this.f98687c = c21216s;
        m129210a = AbstractC24856m.m129210a(b.f98689q);
        this.f98688d = m129210a;
    }

    /* renamed from: a */
    private final void m104326a(C17945a0 c17945a0, C25630b c25630b) {
        if (c25630b.m132446x().length() == 0) {
            String m143232X = C28644j.m143232X();
            AbstractC19074t.m100207e(m143232X, "getDomainStickerUrl(...)");
            c25630b.m132419b(m143232X, C28644j.m143248i0());
        }
        C28020b3.f130648a.m141187P(c17945a0.m95029V3().m41044h());
    }

    /* renamed from: b */
    private final C29585a m104327b() {
        return (C29585a) this.f98688d.getValue();
    }

    /* renamed from: c */
    private final boolean m104328c(C17945a0 c17945a0) {
        if (!c17945a0.m95110d8() && !c17945a0.m95015T7() && !c17945a0.m95208n8()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final void m104329e(C17945a0 c17945a0) {
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        if (c17945a0.m94974P4() > this.f98685a.m2565w(mo95039W2)) {
            this.f98685a.m2520N(mo95039W2, c17945a0.m94974P4());
        }
    }

    /* renamed from: f */
    private final void m104330f(C17945a0 c17945a0) {
        C31986k3.f147083a.m154136o0(c17945a0);
    }

    /* renamed from: g */
    private final void m104331g(C17945a0 c17945a0) {
        C8967m.m47867E().m47926m0(c17945a0);
    }

    /* renamed from: h */
    private final void m104332h(C17945a0 c17945a0) {
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        Map map = AbstractC23304d.f113448v2;
        AbstractC19074t.m100207e(map, "mapUsersLiveStreaming");
        map.put(mo95039W2, c17945a0);
        C23744a.Companion.m124119a().m124116d(29, new Object[0]);
    }

    /* renamed from: i */
    private final void m104333i(C17945a0 c17945a0) {
        if (!c17945a0.m95032V6()) {
            C23594g.f114421a.m123702p(c17945a0);
        }
    }

    /* renamed from: j */
    private final void m104334j(C17945a0 c17945a0) {
        if (!(c17945a0.m94929K2() instanceof C17949b1)) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("processStickerMsg(): Wrong type rich content ");
            sb2.append(m94929K2);
            return;
        }
        C17969i0 m94929K22 = c17945a0.m94929K2();
        AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentSticker");
        C25630b m95397g = ((C17949b1) m94929K22).m95397g();
        if (m95397g != null) {
            m104326a(c17945a0, m95397g);
        }
        if (c17945a0.m95032V6() && c17945a0.m95180k8()) {
            C23744a.Companion.m124119a().m124116d(ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444, m95397g);
        }
    }

    /* renamed from: k */
    private final void m104335k(C17945a0 c17945a0, InterfaceC3534b interfaceC3534b) {
        C18015z0 c18015z0;
        boolean z11;
        if (AbstractC19074t.m100204b(interfaceC3534b, InterfaceC3534b.f.f14898a) && AbstractC23309i.m120751Ae()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C18015z0) {
                c18015z0 = (C18015z0) m94929K2;
            } else {
                c18015z0 = null;
            }
            boolean z12 = true;
            if (c18015z0 == null || !c18015z0.m95799g()) {
                c17945a0.m95087b2();
                c17945a0.m95257t1();
                int m121939gc = AbstractC23309i.m121939gc();
                if (AbstractC23309i.m121258O3() && (m121939gc != 2 || c17945a0.m95032V6())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int m121901fc = AbstractC23309i.m121901fc();
                if (!AbstractC23309i.m121221N3() || (m121901fc == 2 && (m121939gc != 2 || !c17945a0.m95032V6()))) {
                    z12 = false;
                }
                if (z11 || z12) {
                    c17945a0.m95078a2(z11, z12);
                }
            }
        }
    }

    /* renamed from: l */
    private final void m104336l(C17945a0 c17945a0) {
        C32068pb.m154702b().m154704c(c17945a0.mo95039W2());
    }

    /* renamed from: m */
    private final void m104337m(C17945a0 c17945a0) {
        C21927m.m114302u().m114368y0(c17945a0.m94862C4(), c17945a0.m94974P4());
    }

    /* renamed from: d */
    public final void m104338d(String str, C17945a0 c17945a0, InterfaceC3534b interfaceC3534b) {
        AbstractC19074t.m100208f(str, "currentUserUid");
        AbstractC19074t.m100208f(c17945a0, "msg");
        AbstractC19074t.m100208f(interfaceC3534b, "entry");
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        if (interfaceC3534b instanceof InterfaceC3534b.d) {
            C23744a.Companion.m124119a().m124116d(51, mo95039W2, c17945a0);
            this.f98686b.m99492f(c17945a0);
            if (c17945a0.m95021U5()) {
                C19666x0.Companion.m103117a().m103108d(c17945a0);
            }
            if (AbstractC19074t.m100204b(interfaceC3534b, InterfaceC3534b.f.f14898a)) {
                m104336l(c17945a0);
            }
            if (!c17945a0.m95005S6()) {
                m104337m(c17945a0);
            }
            if (m104328c(c17945a0)) {
                m104327b().m101509a(new C29585a.a(c17945a0));
            }
            if (c17945a0.m95134f8()) {
                this.f98687c.m109875b1(str, c17945a0);
            }
            if (c17945a0.m95208n8()) {
                m104335k(c17945a0, interfaceC3534b);
            } else if (c17945a0.m95110d8()) {
                m104334j(c17945a0);
            } else if (c17945a0.m94941L6()) {
                m104331g(c17945a0);
            } else if (c17945a0.m95298x8()) {
                m104332h(c17945a0);
            } else if (c17945a0.m95031V5()) {
                m104329e(c17945a0);
            } else if (c17945a0.m94856B6()) {
                C20012f.f98380a.m103864r(c17945a0);
            } else if (c17945a0.m95082a7()) {
                C25244a.m130616D(mo95039W2);
            } else if (c17945a0.m95276v6()) {
                m104333i(c17945a0);
            }
            m104330f(c17945a0);
        }
    }
}
