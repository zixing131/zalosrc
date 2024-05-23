package qg0;

import com.zing.zalo.data.zalocloud.model.api.CloudKeyResponse;
import com.zing.zalo.data.zalocloud.model.api.Data;
import com.zing.zalo.data.zalocloud.model.api.SubmitCloudKeyResponse;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nl.C23870a;
import og0.C24252c;
import on0.AbstractC24341v;
import p348mi.AbstractC23306f;
import p479rc.C25724a;
import p479rc.C25725b;
import p487rl.C25820a;
import p645xh.C29628e;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import sg0.AbstractC26246b;
import sg0.C26245a;
import sl.C26317b;
import tg0.C26675a;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: qg0.c */
/* loaded from: classes7.dex */
public final class C25268c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC24854k f121170a;

    /* renamed from: b */
    private final InterfaceC24854k f121171b;

    /* renamed from: c */
    private final InterfaceC24854k f121172c;

    /* renamed from: d */
    private final InterfaceC24854k f121173d;

    /* renamed from: qg0.c$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C25268c m130771a() {
            return b.f121174a.m130772a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qg0.c$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f121174a = new b();

        /* renamed from: b */
        private static final C25268c f121175b = new C25268c(null);

        private b() {
        }

        /* renamed from: a */
        public final C25268c m130772a() {
            return f121175b;
        }
    }

    /* renamed from: qg0.c$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f121176q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC25269d mo12V4() {
            return AbstractC23306f.m120664g();
        }
    }

    /* renamed from: qg0.c$d */
    /* loaded from: classes7.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f121177q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25724a mo12V4() {
            return AbstractC23306f.m120668h();
        }
    }

    /* renamed from: qg0.c$e */
    /* loaded from: classes7.dex */
    static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        long f121178t;

        /* renamed from: u */
        int f121179u;

        /* renamed from: w */
        final /* synthetic */ int f121181w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, Continuation continuation) {
            super(2, continuation);
            this.f121181w = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f121181w, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            long currentTimeMillis;
            boolean z11;
            Object m130743D;
            Boolean m145339a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121179u;
            if (i11 != 0) {
                if (i11 == 1) {
                    long j11 = this.f121178t;
                    AbstractC24862s.m129228b(obj);
                    currentTimeMillis = j11;
                    m130743D = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                currentTimeMillis = System.currentTimeMillis();
                z11 = false;
                if (C25268c.m130748g(C25268c.this, 0, false, 3, null)) {
                    C25268c c25268c = C25268c.this;
                    int i12 = this.f121181w;
                    this.f121178t = currentTimeMillis;
                    this.f121179u = 1;
                    m130743D = c25268c.m130743D(i12, this);
                    if (m130743D == m142578e) {
                        return m142578e;
                    }
                }
                long j12 = currentTimeMillis;
                m145339a = AbstractC29094b.m145339a(z11);
                if (!m145339a.booleanValue()) {
                    C26675a.m136891O(C26675a.f126213a, 1504100, null, j12, 0L, 10, null);
                } else {
                    C26675a.m136890L(C26675a.f126213a, 1504100, -1, null, null, j12, 0L, 44, null);
                }
                return m145339a;
            }
            z11 = ((Boolean) m130743D).booleanValue();
            long j122 = currentTimeMillis;
            m145339a = AbstractC29094b.m145339a(z11);
            if (!m145339a.booleanValue()) {
            }
            return m145339a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg0.c$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        long f121182s;

        /* renamed from: t */
        /* synthetic */ Object f121183t;

        /* renamed from: v */
        int f121185v;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121183t = obj;
            this.f121185v |= Integer.MIN_VALUE;
            return C25268c.this.m130760h(null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg0.c$g */
    /* loaded from: classes7.dex */
    public static final class g extends AbstractC29096d {

        /* renamed from: s */
        Object f121186s;

        /* renamed from: t */
        Object f121187t;

        /* renamed from: u */
        int f121188u;

        /* renamed from: v */
        /* synthetic */ Object f121189v;

        /* renamed from: x */
        int f121191x;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121189v = obj;
            this.f121191x |= Integer.MIN_VALUE;
            return C25268c.this.m130749i(null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg0.c$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121192t;

        h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121192t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a m130755x = C25268c.this.m130755x();
                this.f121192t = 1;
                obj = m130755x.m124797Y(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C25820a c25820a = (C25820a) obj;
            if (c25820a != null) {
                str = c25820a.m133134a();
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg0.c$i */
    /* loaded from: classes7.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121194t;

        i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f121194t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a m130755x = C25268c.this.m130755x();
                this.f121194t = 1;
                obj = m130755x.m124797Y(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C25820a c25820a = (C25820a) obj;
            if (c25820a != null) {
                i11 = c25820a.m133135b();
            } else {
                i11 = 0;
            }
            return AbstractC29094b.m145341c(i11);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg0.c$j */
    /* loaded from: classes7.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121196t;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121196t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a m130755x = C25268c.this.m130755x();
                this.f121196t = 1;
                obj = m130755x.m124797Y(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C25820a c25820a = (C25820a) obj;
            if (c25820a != null) {
                str = c25820a.m133136c();
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg0.c$k */
    /* loaded from: classes7.dex */
    public static final class k extends AbstractC29096d {

        /* renamed from: s */
        Object f121198s;

        /* renamed from: t */
        /* synthetic */ Object f121199t;

        /* renamed from: v */
        int f121201v;

        k(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121199t = obj;
            this.f121201v |= Integer.MIN_VALUE;
            return C25268c.this.m130769w(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg0.c$l */
    /* loaded from: classes7.dex */
    public static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121202t;

        /* renamed from: u */
        final /* synthetic */ KeyPair f121203u;

        /* renamed from: v */
        final /* synthetic */ C25268c f121204v;

        /* renamed from: w */
        final /* synthetic */ int f121205w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(KeyPair keyPair, C25268c c25268c, int i11, Continuation continuation) {
            super(2, continuation);
            this.f121203u = keyPair;
            this.f121204v = c25268c;
            this.f121205w = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(this.f121203u, this.f121204v, this.f121205w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121202t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C26245a c26245a = C26245a.f124654a;
                byte[] encoded = this.f121203u.getPublic().getEncoded();
                AbstractC19074t.m100207e(encoded, "getEncoded(...)");
                String m134944b = c26245a.m134944b(encoded);
                AbstractC25269d m130754v = this.f121204v.m130754v();
                PrivateKey privateKey = this.f121203u.getPrivate();
                AbstractC19074t.m100207e(privateKey, "getPrivate(...)");
                String m134944b2 = c26245a.m134944b(m130754v.m130785d(privateKey));
                byte[] encoded2 = this.f121203u.getPrivate().getEncoded();
                AbstractC19074t.m100207e(encoded2, "getEncoded(...)");
                String m134942u = C26245a.m134942u(c26245a, encoded2, 0, 2, null);
                C26676b.m136955e("SMLZCloudKeyManager", "Import Cloud Key: version=" + this.f121205w + ", publicKey=" + m134944b, C26676b.b.f126331p);
                C23870a m130755x = this.f121204v.m130755x();
                C25820a c25820a = new C25820a(this.f121205w, m134944b, m134944b2, m134942u);
                this.f121202t = 1;
                if (m130755x.m124778L0(c25820a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg0.c$m */
    /* loaded from: classes7.dex */
    public static final class m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121206t;

        m(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new m(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121206t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a m130755x = C25268c.this.m130755x();
                this.f121206t = 1;
                obj = m130755x.m124784O0(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: qg0.c$n */
    /* loaded from: classes7.dex */
    static final class n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final n f121208q = new n();

        n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC25269d mo12V4() {
            return AbstractC23306f.m120683k2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg0.c$o */
    /* loaded from: classes7.dex */
    public static final class o extends AbstractC29096d {

        /* renamed from: s */
        Object f121209s;

        /* renamed from: t */
        Object f121210t;

        /* renamed from: u */
        int f121211u;

        /* renamed from: v */
        /* synthetic */ Object f121212v;

        /* renamed from: x */
        int f121214x;

        o(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121212v = obj;
            this.f121214x |= Integer.MIN_VALUE;
            return C25268c.this.m130743D(0, this);
        }
    }

    /* renamed from: qg0.c$p */
    /* loaded from: classes7.dex */
    static final class p extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final p f121215q = new p();

        p() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23870a mo12V4() {
            return AbstractC23306f.m120679j2();
        }
    }

    public /* synthetic */ C25268c(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: B */
    private final boolean m130741B(KeyPair keyPair) {
        AbstractC25269d m130752m = m130752m();
        PrivateKey privateKey = keyPair.getPrivate();
        AbstractC19074t.m100207e(privateKey, "getPrivate(...)");
        try {
            m130752m().mo130732c(m130752m.m130785d(privateKey));
            return true;
        } catch (Exception e11) {
            C26676b.m136953c(e11);
            C26676b.m136957g("SMLZCloudKeyManager", "Cloud Key is invalid with exception: " + e11, null, 4, null);
            return false;
        }
    }

    /* renamed from: C */
    private final void m130742C(long j11) {
        if (j11 <= 0) {
            return;
        }
        C26676b.m136957g("SMLZCloudKeyManager", "setSubmitCloudKeyTime(): " + j11, null, 4, null);
        m130755x().m124822o1(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m130743D(int i11, Continuation continuation) {
        o oVar;
        Object m142578e;
        int i12;
        boolean z11;
        String str;
        C25268c c25268c;
        SubmitCloudKeyResponse submitCloudKeyResponse;
        Long m41332a;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i13 = oVar.f121214x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                oVar.f121214x = i13 - Integer.MIN_VALUE;
                Object obj = oVar.f121212v;
                m142578e = AbstractC28298d.m142578e();
                i12 = oVar.f121214x;
                z11 = false;
                if (i12 == 0) {
                    if (i12 == 1) {
                        i11 = oVar.f121211u;
                        str = (String) oVar.f121210t;
                        c25268c = (C25268c) oVar.f121209s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    int m130765r = m130765r();
                    String m130768u = m130768u();
                    String m130762o = m130762o();
                    String m132706c = m130753n().m132697w().m132706c();
                    int m132665A = m130753n().m132665A();
                    if (m130768u.length() == 0 || m130762o.length() == 0) {
                        C26676b.m136955e("SMLZCloudKeyManager", "Invalid Cloud Key!", C26676b.b.f126335t);
                        return AbstractC29094b.m145339a(false);
                    }
                    C26676b.m136955e("SMLZCloudKeyManager", "Submit Cloud Key to server: optInFlag=" + i11 + ", keyVersion=" + m130765r + ", publicKey=" + m130768u + ", encryptedPrivateKey=" + m130762o, C26676b.b.f126331p);
                    C23870a m130755x = m130755x();
                    C26317b c26317b = new C26317b(m130765r, m130768u, m130762o, m132706c, m132665A, i11);
                    oVar.f121209s = this;
                    oVar.f121210t = m130768u;
                    oVar.f121211u = i11;
                    oVar.f121214x = 1;
                    Object m124830s1 = m130755x.m124830s1(c26317b, oVar);
                    if (m124830s1 == m142578e) {
                        return m142578e;
                    }
                    str = m130768u;
                    obj = m124830s1;
                    c25268c = this;
                }
                submitCloudKeyResponse = (SubmitCloudKeyResponse) obj;
                if (submitCloudKeyResponse.m41383b() == 0) {
                    z11 = true;
                }
                if (z11) {
                    C24252c.f117152a.m126603j(i11);
                    AbstractC23306f.m120643a2().m89844u(str);
                    Data m41382a = submitCloudKeyResponse.m41382a();
                    if (m41382a != null && (m41332a = m41382a.m41332a()) != null) {
                        c25268c.m130742C(m41332a.longValue());
                    }
                }
                return AbstractC29094b.m145339a(z11);
            }
        }
        oVar = new o(continuation);
        Object obj2 = oVar.f121212v;
        m142578e = AbstractC28298d.m142578e();
        i12 = oVar.f121214x;
        z11 = false;
        if (i12 == 0) {
        }
        submitCloudKeyResponse = (SubmitCloudKeyResponse) obj2;
        if (submitCloudKeyResponse.m41383b() == 0) {
        }
        if (z11) {
        }
        return AbstractC29094b.m145339a(z11);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m130748g(C25268c c25268c, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return c25268c.m130759f(i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m130749i(String str, int i11, Continuation continuation) {
        g gVar;
        Object m142578e;
        int i12;
        C25268c c25268c;
        CloudKeyResponse cloudKeyResponse;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i13 = gVar.f121191x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f121191x = i13 - Integer.MIN_VALUE;
                Object obj = gVar.f121189v;
                m142578e = AbstractC28298d.m142578e();
                i12 = gVar.f121191x;
                if (i12 == 0) {
                    if (i12 == 1) {
                        i11 = gVar.f121188u;
                        str = (String) gVar.f121187t;
                        c25268c = (C25268c) gVar.f121186s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    String m132684c = m130753n().m132684c(str, i11);
                    C26676b.m136955e("SMLZCloudKeyManager", "Fetch Cloud Key from Server: encryptKeyHash=" + m132684c + ", encryptType=" + i11, C26676b.b.f126331p);
                    C23870a m130755x = m130755x();
                    gVar.f121186s = this;
                    gVar.f121187t = str;
                    gVar.f121188u = i11;
                    gVar.f121191x = 1;
                    obj = m130755x.m124787Q(m132684c, i11, gVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c25268c = this;
                }
                cloudKeyResponse = (CloudKeyResponse) obj;
                if (cloudKeyResponse != null) {
                    return null;
                }
                if (cloudKeyResponse.m41287j()) {
                    return cloudKeyResponse;
                }
                c25268c.m130753n().m132675P(str, i11);
                c25268c.m130770z(cloudKeyResponse.m41282e(), cloudKeyResponse.m41285h(), cloudKeyResponse.m41280c(), cloudKeyResponse.m41279b());
                c25268c.m130742C(cloudKeyResponse.m41283f());
                return cloudKeyResponse;
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.f121189v;
        m142578e = AbstractC28298d.m142578e();
        i12 = gVar.f121191x;
        if (i12 == 0) {
        }
        cloudKeyResponse = (CloudKeyResponse) obj2;
        if (cloudKeyResponse != null) {
        }
    }

    /* renamed from: j */
    private final KeyPair m130750j() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        AbstractC19074t.m100207e(generateKeyPair, "generateKeyPair(...)");
        return generateKeyPair;
    }

    /* renamed from: l */
    public static final C25268c m130751l() {
        return Companion.m130771a();
    }

    /* renamed from: m */
    private final AbstractC25269d m130752m() {
        return (AbstractC25269d) this.f121171b.getValue();
    }

    /* renamed from: n */
    private final C25724a m130753n() {
        return (C25724a) this.f121172c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final AbstractC25269d m130754v() {
        return (AbstractC25269d) this.f121170a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final C23870a m130755x() {
        return (C23870a) this.f121173d.getValue();
    }

    /* renamed from: y */
    private final void m130756y(int i11, KeyPair keyPair) {
        BuildersKt__BuildersKt.m112536b(null, new l(keyPair, this, i11, null), 1, null);
    }

    /* renamed from: A */
    public final boolean m130757A() {
        Object m112536b;
        m112536b = BuildersKt__BuildersKt.m112536b(null, new m(null), 1, null);
        return ((Boolean) m112536b).booleanValue();
    }

    /* renamed from: e */
    public final Object m130758e(int i11, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new e(i11, null), continuation);
    }

    /* renamed from: f */
    public final boolean m130759f(int i11, boolean z11) {
        KeyPair m130750j;
        boolean m130741B;
        if (m130757A() && !z11) {
            return true;
        }
        C26676b.m136955e("SMLZCloudKeyManager", "Create Cloud Key: keyVersion=" + i11, C26676b.b.f126331p);
        int i12 = 0;
        do {
            try {
                m130750j = m130750j();
                m130741B = m130741B(m130750j);
                i12++;
                if (m130741B) {
                    break;
                }
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudKeyManager", e11);
                C26675a.m136890L(C26675a.f126213a, 1504101, -1, e11.getMessage(), null, 0L, 0L, 56, null);
                return false;
            }
        } while (i12 <= 20);
        if (m130741B) {
            m130756y(i11, m130750j);
            return true;
        }
        C26676b.m136955e("SMLZCloudKeyManager", "Cloud Key still invalid after retry " + i12 + " times", C26676b.b.f126335t);
        throw new RuntimeException("Unexpected error while generating Cloud Key");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m130760h(String str, int i11, Continuation continuation) {
        f fVar;
        Object m142578e;
        int i12;
        long j11;
        CloudKeyResponse cloudKeyResponse;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i13 = fVar.f121185v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f121185v = i13 - Integer.MIN_VALUE;
                Object obj = fVar.f121183t;
                m142578e = AbstractC28298d.m142578e();
                i12 = fVar.f121185v;
                if (i12 == 0) {
                    if (i12 == 1) {
                        long j12 = fVar.f121182s;
                        AbstractC24862s.m129228b(obj);
                        j11 = j12;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    fVar.f121182s = currentTimeMillis;
                    fVar.f121185v = 1;
                    obj = m130749i(str, i11, fVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    j11 = currentTimeMillis;
                }
                cloudKeyResponse = (CloudKeyResponse) obj;
                if (cloudKeyResponse == null && !cloudKeyResponse.m41287j()) {
                    C26675a.m136891O(C26675a.f126213a, 1504110, null, j11, 0L, 10, null);
                } else {
                    C26675a.m136890L(C26675a.f126213a, 1504110, -1, null, null, j11, 0L, 44, null);
                }
                return obj;
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f121183t;
        m142578e = AbstractC28298d.m142578e();
        i12 = fVar.f121185v;
        if (i12 == 0) {
        }
        cloudKeyResponse = (CloudKeyResponse) obj2;
        if (cloudKeyResponse == null) {
        }
        C26675a.m136890L(C26675a.f126213a, 1504110, -1, null, null, j11, 0L, 44, null);
        return obj2;
    }

    /* renamed from: k */
    public final String m130761k(int i11) {
        byte[] m127123s;
        String m127122r;
        C29628e m147249E0 = C29628e.m147249E0();
        m127123s = AbstractC24341v.m127123s(C26245a.f124654a.m134944b(AbstractC26246b.m134965d(m130766s())));
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        byte[] m93387O = m147249E0.m93387O(m127123s, Integer.parseInt(str), i11);
        AbstractC19074t.m100207e(m93387O, "nativeEncryptMsgE2ee(...)");
        m127122r = AbstractC24341v.m127122r(m93387O);
        return m127122r;
    }

    /* renamed from: o */
    public final String m130762o() {
        return C26245a.f124654a.m134944b(m130752m().m130785d(m130766s()));
    }

    /* renamed from: p */
    public final byte[] m130763p() {
        return C26245a.f124654a.m134943a(m130764q());
    }

    /* renamed from: q */
    public final String m130764q() {
        Object m112536b;
        m112536b = BuildersKt__BuildersKt.m112536b(null, new h(null), 1, null);
        return (String) m112536b;
    }

    /* renamed from: r */
    public final int m130765r() {
        Object m112536b;
        m112536b = BuildersKt__BuildersKt.m112536b(null, new i(null), 1, null);
        return ((Number) m112536b).intValue();
    }

    /* renamed from: s */
    public final Key m130766s() {
        return m130754v().m130784b(m130763p(), "RSA", 2);
    }

    /* renamed from: t */
    public final Key m130767t() {
        return C26245a.f124654a.m134945c(AbstractC26246b.m134964c(m130768u()), "RSA", 1);
    }

    /* renamed from: u */
    public final String m130768u() {
        Object m112536b;
        m112536b = BuildersKt__BuildersKt.m112536b(null, new j(null), 1, null);
        return (String) m112536b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m130769w(Continuation continuation) {
        k kVar;
        Object m142578e;
        int i11;
        C25268c c25268c;
        CloudKeyResponse cloudKeyResponse;
        long j11;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i12 = kVar.f121201v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                kVar.f121201v = i12 - Integer.MIN_VALUE;
                Object obj = kVar.f121199t;
                m142578e = AbstractC28298d.m142578e();
                i11 = kVar.f121201v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c25268c = (C25268c) kVar.f121198s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    long m124763D0 = m130755x().m124763D0();
                    if (m124763D0 > 0) {
                        return AbstractC29094b.m145342d(m124763D0);
                    }
                    C25725b m132697w = m130753n().m132697w();
                    int m132665A = m130753n().m132665A();
                    C23870a m130755x = m130755x();
                    String m132706c = m132697w.m132706c();
                    kVar.f121198s = this;
                    kVar.f121201v = 1;
                    obj = m130755x.m124787Q(m132706c, m132665A, kVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c25268c = this;
                }
                cloudKeyResponse = (CloudKeyResponse) obj;
                if (cloudKeyResponse == null) {
                    j11 = cloudKeyResponse.m41283f();
                } else {
                    j11 = -1;
                }
                c25268c.m130742C(j11);
                return AbstractC29094b.m145342d(j11);
            }
        }
        kVar = new k(continuation);
        Object obj2 = kVar.f121199t;
        m142578e = AbstractC28298d.m142578e();
        i11 = kVar.f121201v;
        if (i11 == 0) {
        }
        cloudKeyResponse = (CloudKeyResponse) obj2;
        if (cloudKeyResponse == null) {
        }
        c25268c.m130742C(j11);
        return AbstractC29094b.m145342d(j11);
    }

    /* renamed from: z */
    public final boolean m130770z(int i11, String str, String str2, int i12) {
        AbstractC19074t.m100208f(str, "publicKey");
        AbstractC19074t.m100208f(str2, "encryptedPrivateKey");
        C26676b.m136955e("SMLZCloudKeyManager", "importServerKey(): keyVersion=" + i11 + ", publicKey=" + str + ", encryptedPrivateKey=" + str2, C26676b.b.f126331p);
        try {
            C26245a c26245a = C26245a.f124654a;
            try {
                m130756y(i11, c26245a.m134946d(c26245a.m134943a(str), m130752m().mo130732c(c26245a.m134943a(str2)), "RSA"));
                return true;
            } catch (Exception e11) {
                e = e11;
                C26676b.m136954d("SMLZCloudKeyManager", e);
                C26675a.m136890L(C26675a.f126213a, 1504112, -1, e.getMessage(), null, 0L, 0L, 56, null);
                return false;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    private C25268c() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        m129210a = AbstractC24856m.m129210a(n.f121208q);
        this.f121170a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(c.f121176q);
        this.f121171b = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(d.f121177q);
        this.f121172c = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(p.f121215q);
        this.f121173d = m129210a4;
    }
}
