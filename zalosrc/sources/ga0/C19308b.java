package ga0;

import android.os.Build;
import android.text.TextUtils;
import b40.C2526d;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import dj.C17969i0;
import dj.C18013y0;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.File;
import me0.AbstractC23238v2;
import me0.C23272y6;
import mm0.AbstractC23350e;
import p056cj.AbstractC3552t;
import p056cj.C3549q;
import p164fn.C19028b;
import p239ih.C20556f;
import p363nh.C23744a;
import p612wk.AbstractC29069a;
import p698yz.AbstractC31111g;
import vg.C28023b6;

/* renamed from: ga0.b */
/* loaded from: classes6.dex */
public final class C19308b extends AbstractRunnableC19355q1 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final C18316b f95895s;

    /* renamed from: t */
    private final String f95896t;

    /* renamed from: ga0.b$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19308b(InterfaceC18319c interfaceC18319c, C18316b c18316b, String str) {
        super(interfaceC18319c);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(c18316b, "action");
        AbstractC19074t.m100208f(str, "query");
        this.f95895s = c18316b;
        this.f95896t = str;
    }

    /* renamed from: l */
    private final void m101060l(AbstractC29069a.a aVar) {
        C18013y0 c18013y0;
        C17945a0 m145141e = aVar.m145141e();
        if (m145141e == null) {
            m145141e = C23272y6.f112780a.m120053d(MessageId.Companion.m41063a(aVar.m145142f().m18037d().m18052a(), aVar.m145142f().m18037d().m18053b(), aVar.m145142f().m18037d().m18055d(), aVar.m145142f().m18037d().m18056e()));
            aVar.m145155s(m145141e);
            if (m145141e == null) {
                m101440g(new C18316b("HandleActionCompactMessageItem:ACTION_SHOW_ERROR_GENERAL_MESSAGE", null, null, null, 14, null));
                return;
            }
        }
        C17969i0 m94929K2 = m145141e.m94929K2();
        if (m94929K2 instanceof C18013y0) {
            c18013y0 = (C18013y0) m94929K2;
        } else {
            c18013y0 = null;
        }
        if (c18013y0 == null) {
            m101440g(new C18316b("HandleActionCompactMessageItem:ACTION_SHOW_ERROR_GENERAL_MESSAGE", null, null, null, 14, null));
        } else if (AbstractC19074t.m100204b(c18013y0.f91016u, "recommened.user")) {
            m101440g(new C18316b("HandleActionCompactMessageItem:ACTION_OPEN_RECOMMENED_CONTACT", aVar, c18013y0.f91017v, null, 8, null));
        } else {
            m101440g(new C18316b("HandleActionCompactMessageItem:ACTION_SHOW_ERROR_GENERAL_MESSAGE", null, null, null, 14, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:            if (p698yz.AbstractC31111g.m151130k(r1) != false) goto L108;     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m101061m(AbstractC29069a.a aVar, AbstractC3552t abstractC3552t) {
        boolean z11;
        C17945a0 m145141e = aVar.m145141e();
        if (m145141e == null) {
            m145141e = C23272y6.f112780a.m120053d(MessageId.Companion.m41063a(aVar.m145142f().m18037d().m18052a(), aVar.m145142f().m18037d().m18053b(), aVar.m145142f().m18037d().m18055d(), aVar.m145142f().m18037d().m18056e()));
            if (m145141e != null) {
                aVar.m145155s(m145141e);
            } else {
                m145141e = null;
            }
            if (m145141e == null) {
                m101440g(new C18316b("HandleActionCompactMessageItem:ACTION_SHOW_ERROR_GENERAL_MESSAGE", null, null, null, 14, null));
                return;
            }
        }
        try {
            String m94983Q3 = m145141e.m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            if (m145141e.m95107d3() == 5 && m94983Q3.length() > 0 && m145141e.m94893G1(m145141e.m94983Q3())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (Build.VERSION.SDK_INT < 29) {
                if (!z11) {
                    m94983Q3 = m145141e.m95283w2(false, false);
                    AbstractC19074t.m100207e(m94983Q3, "genDownloadFilePath(...)");
                    if (!TextUtils.isEmpty(m94983Q3) && !AbstractC19074t.m100204b(m94983Q3, m145141e.m94983Q3()) && m145141e.m94893G1(m94983Q3)) {
                        z11 = true;
                    }
                    z11 = false;
                } else if (AbstractC31111g.m151130k(m94983Q3)) {
                    String m95283w2 = m145141e.m95283w2(false, false);
                    if (!TextUtils.isEmpty(m95283w2) && !AbstractC19074t.m100204b(m95283w2, m94983Q3) && m145141e.m94893G1(m95283w2)) {
                        AbstractC19074t.m100205c(m95283w2);
                    } else {
                        if (AbstractC23238v2.m119718c(new File(m145141e.m94983Q3()), new File(m94983Q3))) {
                            AbstractC19074t.m100205c(m95283w2);
                        }
                        z11 = false;
                    }
                    m94983Q3 = m95283w2;
                    z11 = true;
                }
            } else if (z11) {
            }
            if (!z11) {
                C2526d c2526d = C2526d.f10270a;
                MessageId m95029V3 = m145141e.m95029V3();
                AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                String mo95039W2 = m145141e.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                c2526d.m12729v(m95029V3, -1, "global_search", c2526d.m12733y(mo95039W2));
                m145141e.m95214o2(false, true);
                mo205i9(new C18316b("HandleActionCompactMessageItem:ACTION_DISPATCH_DOWNLOAD_FILE_PROGRESS", 0, aVar, m145141e.m95029V3()));
                m145141e.m94891Fa(true);
                m145141e.m94980Pb(C19028b.a.m100098b(C19028b.Companion, C19028b.b.f94843p, false, false, 6, null), true);
                return;
            }
            if (m145141e.m95147gc(m94983Q3, false, false)) {
                C23744a.Companion.m124119a().m124116d(6, m145141e.m95029V3(), m145141e.mo95039W2());
            }
            mo205i9(new C18316b("HandleActionCompactMessageItem:ACTION_DISPATCH_DOWNLOAD_FILE_PROGRESS", 100, aVar, m145141e.m95029V3()));
            m101440g(new C18316b("HandleActionCompactMessageItem:ACTION_OPEN_FILE", aVar, abstractC3552t, new C20556f(m145141e.m94983Q3())));
            C28023b6.m141250h0().m141301M(m145141e.m95029V3().m41044h());
            C2526d c2526d2 = C2526d.f10270a;
            String mo95039W22 = m145141e.mo95039W2();
            AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
            c2526d2.m12705b0(m145141e, -1, "global_search", c2526d2.m12733y(mo95039W22));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        String m97246b = this.f95895s.m97246b();
        if (AbstractC19074t.m100204b(m97246b, "HandleActionCompactMessageItem:ACTION_CHECK_DOWNLOAD_AND_OPEN_FILE")) {
            if ((this.f95895s.m97245a() instanceof AbstractC29069a.a) && (this.f95895s.m97247c() instanceof C3549q)) {
                m101061m((AbstractC29069a.a) this.f95895s.m97245a(), (AbstractC3552t) this.f95895s.m97247c());
                return;
            }
            return;
        }
        if (AbstractC19074t.m100204b(m97246b, "HandleActionCompactMessageItem:ACTION_CHECK_AND_OPEN_RECOMMENED_CONTACT") && (this.f95895s.m97245a() instanceof AbstractC29069a.a)) {
            m101060l((AbstractC29069a.a) this.f95895s.m97245a());
        }
    }
}
