package if0;

import ae.C0757b;
import ag0.AbstractC0837p0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import bg0.C2797c;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import if0.InterfaceC20544q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import me0.C23055e5;
import od0.C24226d;
import od0.C24230h;
import od0.InterfaceC24232j;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p239ih.C20556f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import rd0.AbstractC25752r;
import td0.C26638a;

/* renamed from: if0.p */
/* loaded from: classes5.dex */
public final class C20543p {

    /* renamed from: a */
    public static final C20543p f100876a = new C20543p();

    /* renamed from: b */
    private static final HashMap f100877b = new HashMap();

    /* renamed from: c */
    private static final HashMap f100878c = new HashMap();

    /* renamed from: d */
    private static final InterfaceC24854k f100879d;

    /* renamed from: e */
    private static final Handler f100880e;

    /* renamed from: if0.p$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f100881q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2797c mo12V4() {
            return new C2797c(AbstractC0837p0.Companion.m2237f());
        }
    }

    /* renamed from: if0.p$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C20545r f100882a;

        b(C20545r c20545r) {
            this.f100882a = c20545r;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C20543p.f100876a.m106739u(c20096c, this.f100882a);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "res");
            C20543p.f100876a.m106741w(obj, this.f100882a);
        }
    }

    /* renamed from: if0.p$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC24232j {

        /* renamed from: a */
        final /* synthetic */ C20545r f100883a;

        c(C20545r c20545r) {
            this.f100883a = c20545r;
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            AbstractC19074t.m100208f(bVar, "uploadSuccess");
            C20543p.f100876a.m106744z(this.f100883a, bVar);
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            AbstractC19074t.m100208f(aVar, "uploadFailure");
            C20543p.f100876a.m106742x(this.f100883a, aVar);
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f100881q);
        f100879d = m129210a;
        f100880e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: if0.h
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m106737r;
                m106737r = C20543p.m106737r(message);
                return m106737r;
            }
        });
    }

    private C20543p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m106707A(C20545r c20545r, AbstractC25752r.b bVar) {
        String mo106683a;
        AbstractC19074t.m100208f(c20545r, "$content");
        AbstractC19074t.m100208f(bVar, "$uploadSuccess");
        try {
            if (!c20545r.m106765p()) {
                return;
            }
            c20545r.m106771v(null);
            c20545r.m106773x(false);
            InterfaceC20546s m106761l = c20545r.m106761l();
            if (m106761l != null && (mo106683a = m106761l.mo106683a(c20545r, bVar.m132889b())) != null) {
                c20545r.m106774y(mo106683a);
                c20545r.m106768s(f100876a.m106732m());
            }
            if (c20545r.m106762m().length() > 0) {
                f100876a.m106738s(c20545r);
            } else {
                c20545r.m106766q(InterfaceC20544q.a.f100884p);
                f100876a.m106713G(f100880e, 101, c20545r);
            }
        } catch (Exception e11) {
            c20545r.m106766q(InterfaceC20544q.a.f100884p);
            f100876a.m106713G(f100880e, 101, c20545r);
            AbstractC20110a.f98889a.m104564x("VoiceToTextController").mo104552e(e11);
        }
    }

    /* renamed from: B */
    private final void m106708B(final Runnable runnable, long j11) {
        AbstractC19444a.m101694b(new Runnable() { // from class: if0.k
            @Override // java.lang.Runnable
            public final void run() {
                C20543p.m106709C(runnable);
            }
        }, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m106709C(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "$r");
        f100876a.m106712F(runnable);
    }

    /* renamed from: D */
    private final int m106710D(int i11, int i12) {
        int i13 = 1;
        for (int i14 = 0; i14 < i12; i14++) {
            i13 *= i11;
        }
        return i13;
    }

    /* renamed from: E */
    private final InterfaceC20544q.a m106711E(C20545r c20545r) {
        if (c20545r.m106763n()) {
            if (c20545r.m106762m().length() == 0) {
                if (!C20534g.f100864a.m106696j(c20545r.m106752c())) {
                    return InterfaceC20544q.a.f100885q;
                }
                return null;
            }
            if (!C20534g.f100864a.m106697k(c20545r.m106762m())) {
                return InterfaceC20544q.a.f100885q;
            }
            return null;
        }
        if (c20545r.m106762m().length() == 0) {
            return InterfaceC20544q.a.f100889u;
        }
        if (!C20534g.f100864a.m106697k(c20545r.m106762m())) {
            return InterfaceC20544q.a.f100885q;
        }
        return null;
    }

    /* renamed from: F */
    private final void m106712F(Runnable runnable) {
        m106733n().mo13474a(runnable);
    }

    /* renamed from: G */
    private final void m106713G(Handler handler, int i11, C20545r c20545r) {
        handler.sendMessage(handler.obtainMessage(i11, c20545r));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m106714I(C20545r c20545r) {
        AbstractC19074t.m100208f(c20545r, "$content");
        try {
            if (c20545r.m106763n() && c20545r.m106762m().length() == 0) {
                f100876a.m106718N(c20545r, 60000L);
            } else {
                f100876a.m106738s(c20545r);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("VoiceToTextController").mo104552e(e11);
            c20545r.m106766q(InterfaceC20544q.a.f100884p);
            f100876a.m106713G(f100880e, 101, c20545r);
        }
    }

    /* renamed from: J */
    private final void m106715J(C20545r c20545r, InterfaceC24232j interfaceC24232j, long j11) {
        if (c20545r.m106765p()) {
            return;
        }
        c20545r.m106773x(true);
        if (c20545r.m106752c().length() == 0 || !new C20556f(c20545r.m106752c()).m106830b()) {
            interfaceC24232j.mo14380b(new AbstractC25752r.a(C26638a.f126094a.m136735d(), null, 0, 6, null));
            return;
        }
        if (!C23055e5.m118273h(false, 1, null)) {
            interfaceC24232j.mo14380b(new AbstractC25752r.a(C26638a.f126094a.m136732a(), null, 0, 6, null));
            return;
        }
        InterfaceC20546s m106761l = c20545r.m106761l();
        if (m106761l != null) {
            m106761l.mo106685c(c20545r);
        }
        C24226d.b bVar = C24226d.Companion;
        C24230h m126433h = C24226d.b.m126433h(bVar, c20545r.m106759j(), c20545r.m106758i(), c20545r.m106752c(), null, null, null, j11, c20545r.m106763n(), 56, null);
        m126433h.m126505h(interfaceC24232j);
        m126433h.m126482B0(c20545r.m106757h());
        m126433h.m126512k0(true);
        bVar.m126442j(m126433h);
        c20545r.m106771v(m126433h);
    }

    /* renamed from: L */
    private final void m106716L(final C20545r c20545r) {
        m106712F(new Runnable() { // from class: if0.i
            @Override // java.lang.Runnable
            public final void run() {
                C20543p.m106717M(C20545r.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m106717M(C20545r c20545r) {
        AbstractC19074t.m100208f(c20545r, "$content");
        try {
            if (!c20545r.m106765p()) {
                return;
            }
            C24230h m106760k = c20545r.m106760k();
            if (m106760k != null) {
                m106760k.m126507i();
            }
            c20545r.m106771v(null);
            c20545r.m106773x(false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("VoiceToTextController").mo104552e(e11);
        }
    }

    /* renamed from: N */
    private final void m106718N(final C20545r c20545r, final long j11) {
        final c cVar = new c(c20545r);
        m106712F(new Runnable() { // from class: if0.l
            @Override // java.lang.Runnable
            public final void run() {
                C20543p.m106719O(C20545r.this, cVar, j11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m106719O(C20545r c20545r, c cVar, long j11) {
        AbstractC19074t.m100208f(c20545r, "$content");
        AbstractC19074t.m100208f(cVar, "$listener");
        try {
            f100876a.m106715J(c20545r, cVar, j11);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("VoiceToTextController").mo104552e(e11);
            f100876a.m106742x(c20545r, new AbstractC25752r.a(C26638a.f126094a.m136734c(), null, 0, 6, null));
        }
    }

    /* renamed from: m */
    private final long m106732m() {
        return System.currentTimeMillis();
    }

    /* renamed from: n */
    private final C2797c m106733n() {
        return (C2797c) f100879d.getValue();
    }

    /* renamed from: o */
    private final long m106734o(C20545r c20545r) {
        return m106710D(2, c20545r.m106755f() - 1) * 250;
    }

    /* renamed from: p */
    private final void m106735p(C20545r c20545r) {
        if (m106747t(c20545r.m106751b())) {
            f100878c.remove(Long.valueOf(c20545r.m106751b()));
            InterfaceC20544q m106753d = c20545r.m106753d();
            if (m106753d != null) {
                m106753d.mo106674a(c20545r.m106750a());
            }
        }
    }

    /* renamed from: q */
    private final void m106736q(C20545r c20545r) {
        String m106756g = c20545r.m106756g();
        if (m106756g != null) {
            f100877b.put(Long.valueOf(c20545r.m106751b()), m106756g);
            if (f100876a.m106747t(c20545r.m106751b())) {
                f100878c.remove(Long.valueOf(c20545r.m106751b()));
                InterfaceC20544q m106753d = c20545r.m106753d();
                if (m106753d != null) {
                    m106753d.onSuccess(m106756g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final boolean m106737r(Message message) {
        C20545r c20545r;
        AbstractC19074t.m100208f(message, "msg");
        try {
            Object obj = message.obj;
            if (obj instanceof C20545r) {
                c20545r = (C20545r) obj;
            } else {
                c20545r = null;
            }
            if (c20545r == null) {
                return false;
            }
            int i11 = message.what;
            if (i11 != 100) {
                if (i11 == 101) {
                    f100876a.m106735p(c20545r);
                    return true;
                }
                return true;
            }
            f100876a.m106736q(c20545r);
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("VoiceToTextController").mo104552e(e11);
            return true;
        }
    }

    /* renamed from: s */
    private final void m106738s(C20545r c20545r) {
        C0757b c0757b = new C0757b();
        c0757b.m1341j(new b(c20545r));
        c0757b.m1352s(c20545r.m106762m(), c20545r.m106751b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m106739u(C20096c c20096c, final C20545r c20545r) {
        try {
            if (c20096c.m104491c() == 404) {
                if (c20545r.m106764o() && c20545r.m106754e() <= 0) {
                    c20545r.m106769t(0);
                    m106718N(c20545r, 60000L);
                    return;
                } else if (c20545r.m106755f() <= 5) {
                    c20545r.m106769t(Math.max(0, c20545r.m106755f()) + 1);
                    m106708B(new Runnable() { // from class: if0.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20543p.m106740v(C20545r.this);
                        }
                    }, m106734o(c20545r));
                    return;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (c20096c.m104491c() == 50001) {
            c20545r.m106766q(InterfaceC20544q.a.f100887s);
        } else {
            c20545r.m106766q(InterfaceC20544q.a.f100884p);
        }
        m106713G(f100880e, 101, c20545r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m106740v(C20545r c20545r) {
        AbstractC19074t.m100208f(c20545r, "$content");
        try {
            f100876a.m106738s(c20545r);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("VoiceToTextController").mo104552e(e11);
            c20545r.m106766q(InterfaceC20544q.a.f100884p);
            f100876a.m106713G(f100880e, 101, c20545r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final void m106741w(Object obj, C20545r c20545r) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        CharSequence m127168X0;
        try {
            Long l11 = null;
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONObject2 = jSONObject.optJSONObject("data");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 == null) {
                return;
            }
            Long valueOf = Long.valueOf(jSONObject2.optLong("cliFileId", -1L));
            if (valueOf.longValue() >= 0) {
                l11 = valueOf;
            }
            if (l11 == null || l11.longValue() != c20545r.m106751b()) {
                return;
            }
            String optString = jSONObject2.optString("text", "");
            AbstractC19074t.m100207e(optString, "optString(...)");
            m127168X0 = AbstractC24342w.m127168X0(optString);
            c20545r.m106770u(m127168X0.toString());
            m106713G(f100880e, 100, c20545r);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("VoiceToTextController").mo104552e(e11);
            c20545r.m106766q(InterfaceC20544q.a.f100884p);
            m106713G(f100880e, 101, c20545r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m106742x(final C20545r c20545r, final AbstractC25752r.a aVar) {
        m106712F(new Runnable() { // from class: if0.n
            @Override // java.lang.Runnable
            public final void run() {
                C20543p.m106743y(C20545r.this, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m106743y(C20545r c20545r, AbstractC25752r.a aVar) {
        InterfaceC20544q.a aVar2;
        AbstractC19074t.m100208f(c20545r, "$content");
        AbstractC19074t.m100208f(aVar, "$uploadFailure");
        try {
            if (!c20545r.m106765p()) {
                return;
            }
            Integer num = null;
            c20545r.m106771v(null);
            c20545r.m106773x(false);
            InterfaceC20546s m106761l = c20545r.m106761l();
            if (m106761l != null) {
                m106761l.mo106684b(c20545r, aVar.m132886a());
            }
            C20096c m132886a = aVar.m132886a();
            if (m132886a != null) {
                num = Integer.valueOf(m132886a.m104491c());
            }
            if (num != null && num.intValue() == 19006) {
                aVar2 = InterfaceC20544q.a.f100886r;
                c20545r.m106766q(aVar2);
                f100876a.m106713G(f100880e, 101, c20545r);
            }
            if (num.intValue() == 50001) {
                aVar2 = InterfaceC20544q.a.f100887s;
                c20545r.m106766q(aVar2);
                f100876a.m106713G(f100880e, 101, c20545r);
            }
            aVar2 = InterfaceC20544q.a.f100884p;
            c20545r.m106766q(aVar2);
            f100876a.m106713G(f100880e, 101, c20545r);
        } catch (Exception e11) {
            c20545r.m106766q(InterfaceC20544q.a.f100884p);
            f100876a.m106713G(f100880e, 101, c20545r);
            AbstractC20110a.f98889a.m104564x("VoiceToTextController").mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final void m106744z(final C20545r c20545r, final AbstractC25752r.b bVar) {
        m106712F(new Runnable() { // from class: if0.o
            @Override // java.lang.Runnable
            public final void run() {
                C20543p.m106707A(C20545r.this, bVar);
            }
        });
    }

    /* renamed from: H */
    public final void m106745H(final C20545r c20545r) {
        AbstractC19074t.m100208f(c20545r, "content");
        InterfaceC20544q.a m106711E = m106711E(c20545r);
        if (m106711E != null) {
            InterfaceC20544q m106753d = c20545r.m106753d();
            if (m106753d != null) {
                m106753d.mo106674a(m106711E);
                return;
            }
            return;
        }
        String str = (String) f100877b.get(Long.valueOf(c20545r.m106751b()));
        if (str != null) {
            InterfaceC20544q m106753d2 = c20545r.m106753d();
            if (m106753d2 != null) {
                m106753d2.onSuccess(str);
                return;
            }
            return;
        }
        HashMap hashMap = f100878c;
        if (hashMap.containsKey(Long.valueOf(c20545r.m106751b()))) {
            return;
        }
        hashMap.put(Long.valueOf(c20545r.m106751b()), c20545r);
        InterfaceC20544q m106753d3 = c20545r.m106753d();
        if (m106753d3 != null) {
            m106753d3.mo106675b();
        }
        m106708B(new Runnable() { // from class: if0.j
            @Override // java.lang.Runnable
            public final void run() {
                C20543p.m106714I(C20545r.this);
            }
        }, 300L);
    }

    /* renamed from: K */
    public final void m106746K() {
        Iterator it = f100878c.entrySet().iterator();
        while (it.hasNext()) {
            f100876a.m106716L((C20545r) ((Map.Entry) it.next()).getValue());
        }
        f100878c.clear();
    }

    /* renamed from: t */
    public final boolean m106747t(long j11) {
        return f100878c.containsKey(Long.valueOf(j11));
    }
}
