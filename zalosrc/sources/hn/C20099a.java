package hn;

import ag0.AbstractC0837p0;
import ag0.InterfaceC0806b1;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import hn.C20099a;
import hu.C20131e;
import in.C20627a;
import in.InterfaceC20630d;
import java.io.File;
import me0.AbstractC23238v2;
import mm0.AbstractC23350e;
import p296kc.C21654a;
import p348mi.AbstractC23306f;
import p423pi.C24759a;
import pm0.C24848g0;

/* renamed from: hn.a */
/* loaded from: classes3.dex */
public final class C20099a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C24759a.c f98855a;

    /* renamed from: b */
    private final InterfaceC18494a f98856b;

    /* renamed from: c */
    private final InterfaceC18494a f98857c;

    /* renamed from: d */
    private final String f98858d;

    /* renamed from: e */
    private int f98859e;

    /* renamed from: hn.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: hn.a$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC20630d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18509p f98860a;

        b(InterfaceC18509p interfaceC18509p) {
            this.f98860a = interfaceC18509p;
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            this.f98860a.mo240pC(Boolean.TRUE, "Download whitelist domain patterns SUCCESS: path=" + str);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            this.f98860a.mo240pC(Boolean.FALSE, "Download whitelist domain patterns FAILED: errorCode=" + i11);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hn.a$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f98861q;

        /* renamed from: r */
        final /* synthetic */ File f98862r;

        /* renamed from: s */
        final /* synthetic */ C20099a f98863s;

        /* renamed from: t */
        final /* synthetic */ InterfaceC18505l f98864t;

        /* renamed from: u */
        final /* synthetic */ String f98865u;

        /* renamed from: v */
        final /* synthetic */ String f98866v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC18509p interfaceC18509p, File file, C20099a c20099a, InterfaceC18505l interfaceC18505l, String str, String str2) {
            super(2);
            this.f98861q = interfaceC18509p;
            this.f98862r = file;
            this.f98863s = c20099a;
            this.f98864t = interfaceC18505l;
            this.f98865u = str;
            this.f98866v = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m104514c(C20099a c20099a, String str, String str2, InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(c20099a, "this$0");
            AbstractC19074t.m100208f(str, "$path");
            AbstractC19074t.m100208f(str2, "$url");
            AbstractC19074t.m100208f(interfaceC18509p, "$onSuccess");
            AbstractC19074t.m100208f(interfaceC18505l, "$onError");
            C21654a.m111581h("WhitelistDomainPatternsDownloadTask", "Retry download whitelist: retryCount = " + c20099a.f98859e, null, false, 12, null);
            Thread.sleep(2000L);
            c20099a.m104511j(str, str2, interfaceC18509p, interfaceC18505l);
        }

        /* renamed from: b */
        public final void m104515b(boolean z11, String str) {
            AbstractC19074t.m100208f(str, "message");
            if (z11) {
                this.f98861q.mo240pC(this.f98862r, str);
                return;
            }
            if (this.f98863s.f98859e == 3) {
                this.f98864t.mo205i9(str);
                return;
            }
            this.f98863s.f98859e++;
            InterfaceC0806b1 m2237f = AbstractC0837p0.Companion.m2237f();
            final C20099a c20099a = this.f98863s;
            final String str2 = this.f98865u;
            final String str3 = this.f98866v;
            final InterfaceC18509p interfaceC18509p = this.f98861q;
            final InterfaceC18505l interfaceC18505l = this.f98864t;
            m2237f.mo2040a(new Runnable() { // from class: hn.b
                @Override // java.lang.Runnable
                public final void run() {
                    C20099a.c.m104514c(C20099a.this, str2, str3, interfaceC18509p, interfaceC18505l);
                }
            });
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m104515b(((Boolean) obj).booleanValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hn.a$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class d extends C19071q implements InterfaceC18509p {
        d(Object obj) {
            super(2, obj, C20099a.class, "onSuccess", "onSuccess(Ljava/io/File;Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m104516h(File file, String str) {
            AbstractC19074t.m100208f(file, "p0");
            AbstractC19074t.m100208f(str, "p1");
            ((C20099a) this.f94922q).m104510i(file, str);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m104516h((File) obj, (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hn.a$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class e extends C19071q implements InterfaceC18505l {
        e(Object obj) {
            super(1, obj, C20099a.class, "onError", "onError(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m104517h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((C20099a) this.f94922q).m104509h(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m104517h((String) obj);
            return C24848g0.f119245a;
        }
    }

    public C20099a(C24759a.c cVar, InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2) {
        AbstractC19074t.m100208f(cVar, "whitelistConfigs");
        AbstractC19074t.m100208f(interfaceC18494a, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18494a2, "onFailed");
        this.f98855a = cVar;
        this.f98856b = interfaceC18494a;
        this.f98857c = interfaceC18494a2;
        this.f98858d = C20131e.f99303a.m104945c() + "auto_download_whitelist_config";
    }

    /* renamed from: f */
    private final String m104507f(File file) {
        try {
            byte[] m119724i = AbstractC23238v2.m119724i(file);
            if (m119724i != null) {
                String m119725j = AbstractC23238v2.m119725j(m119724i);
                if (m119725j != null) {
                    return m119725j;
                }
                return "";
            }
            return "";
        } catch (Exception e11) {
            AbstractC23350e.m122776f("WhitelistDomainPatternsDownloadTask", e11);
            return "";
        }
    }

    /* renamed from: g */
    private final void m104508g(File file, String str, InterfaceC18509p interfaceC18509p) {
        C20627a c20627a = new C20627a(false);
        c20627a.m107419g0(new b(interfaceC18509p));
        c20627a.m107416d0(false);
        c20627a.m107420h0(file.getAbsolutePath());
        c20627a.m107488m(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m104509h(String str) {
        C21654a.m111581h("WhitelistDomainPatternsDownloadTask", str, C21654a.a.f105049r, false, 8, null);
        this.f98857c.mo12V4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m104510i(File file, String str) {
        C21654a.m111581h("WhitelistDomainPatternsDownloadTask", str, null, false, 12, null);
        try {
            AbstractC23306f.m120652d().m109886m0().m128661w().m128685h(m104507f(file));
            this.f98856b.mo12V4();
        } catch (Exception e11) {
            this.f98857c.mo12V4();
            C21654a.m111581h("WhitelistDomainPatternsDownloadTask", String.valueOf(e11.getMessage()), C21654a.a.f105049r, false, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m104511j(String str, String str2, InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l) {
        File file = new File(str);
        try {
            if (file.exists()) {
                file.delete();
            }
            m104508g(file, str2, new c(interfaceC18509p, file, this, interfaceC18505l, str, str2));
        } catch (Exception e11) {
            interfaceC18505l.mo205i9(String.valueOf(e11.getMessage()));
        }
    }

    /* renamed from: k */
    public final void m104512k() {
        C21654a.m111581h("WhitelistDomainPatternsDownloadTask", "Download whitelist domain patterns START: link=" + this.f98855a.m128680c() + ", checksum=" + this.f98855a.m128678a(), null, false, 12, null);
        m104511j(this.f98858d, this.f98855a.m128680c(), new d(this), new e(this));
    }
}
