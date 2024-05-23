package com.zing.zalo.media.download;

import com.zing.zalo.media.download.AbstractC9003a;
import hu.AbstractC20130d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import p239ih.C20556f;
import p587vv.C28631a;

/* renamed from: com.zing.zalo.media.download.h */
/* loaded from: classes4.dex */
public abstract class AbstractC9010h {

    /* renamed from: a */
    static final String f48229a = "h";

    /* renamed from: b */
    static final Map f48230b = new HashMap();

    /* renamed from: c */
    static final Map f48231c = new HashMap();

    /* renamed from: com.zing.zalo.media.download.h$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        String f48232a;

        /* renamed from: b */
        b f48233b;

        /* renamed from: c */
        C20556f f48234c;

        /* renamed from: d */
        C20556f f48235d;

        /* renamed from: e */
        AbstractC9003a.a f48236e;

        /* renamed from: g */
        long f48238g;

        /* renamed from: j */
        AbstractC9007e f48241j;

        /* renamed from: f */
        int f48237f = 0;

        /* renamed from: h */
        int f48239h = 0;

        /* renamed from: i */
        AtomicBoolean f48240i = new AtomicBoolean(false);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.media.download.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C32714a extends AbstractC9007e {
            C32714a(String str, String str2, String str3) {
                super(str, str2, str3);
            }

            @Override // com.zing.zalo.media.download.AbstractC9007e
            /* renamed from: l */
            protected void mo48139l(int i11) {
                a.this.f48238g = i11;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.media.download.h$a$b */
        /* loaded from: classes4.dex */
        public class b implements AbstractC9003a.a {
            b() {
            }

            @Override // com.zing.zalo.media.download.AbstractC9003a.a
            /* renamed from: a */
            public void mo48123a(int i11) {
                AbstractC9003a.a aVar = a.this.f48236e;
                if (aVar != null) {
                    aVar.mo48123a(i11);
                }
                a.this.f48240i.set(false);
                a.this.f48237f = 0;
            }

            @Override // com.zing.zalo.media.download.InterfaceC9009g
            /* renamed from: b */
            public void mo48147b(int i11) {
                String str = AbstractC9010h.f48229a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("transferred:");
                sb2.append(i11);
                a aVar = a.this;
                if (i11 > aVar.f48237f) {
                    aVar.f48237f = i11;
                }
                AbstractC9003a.a aVar2 = aVar.f48236e;
                if (aVar2 != null) {
                    aVar2.mo48147b(i11);
                }
            }

            @Override // com.zing.zalo.media.download.AbstractC9003a.a
            /* renamed from: c */
            public void mo48124c() {
                String str = AbstractC9010h.f48229a;
                AbstractC9003a.a aVar = a.this.f48236e;
                if (aVar != null) {
                    aVar.mo48124c();
                }
                a.this.f48240i.set(false);
                a.this.f48237f = 100;
            }
        }

        public a(String str, String str2, String str3, b bVar) {
            this.f48232a = str;
            this.f48233b = bVar;
            if (m48162i()) {
                this.f48234c = new C20556f(str);
                this.f48235d = new C20556f(str);
                this.f48238g = this.f48234c.m106845r();
                return;
            }
            this.f48234c = new C20556f(str2 + "/" + str3);
            this.f48235d = m48154c(str);
            if (m48161h()) {
                this.f48238g = this.f48234c.m106845r();
            }
        }

        /* renamed from: b */
        static boolean m48153b(String str, String str2, String str3) {
            boolean z11;
            C20556f c20556f = new C20556f(str2 + "/" + str3);
            C20556f m48154c = m48154c(str);
            boolean z12 = true;
            if (!m48155j(str) && m48154c.m106830b()) {
                z11 = m48154c.m106829a();
            } else {
                z11 = true;
            }
            if (c20556f.m106830b()) {
                if (!z11 || !c20556f.m106829a()) {
                    z12 = false;
                }
                return z12;
            }
            return z11;
        }

        /* renamed from: c */
        static C20556f m48154c(String str) {
            return new C20556f(AbstractC20130d.m104884n0() + "/" + AbstractC23352g.m122788d(str));
        }

        /* renamed from: j */
        static boolean m48155j(String str) {
            if (!str.startsWith("/") && !str.startsWith("file://")) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public boolean m48156a() {
            boolean z11;
            boolean z12 = true;
            if (!m48162i() && this.f48235d.m106830b()) {
                z11 = this.f48235d.m106829a();
            } else {
                z11 = true;
            }
            if (this.f48234c.m106830b()) {
                if (!z11 || !this.f48234c.m106829a()) {
                    z12 = false;
                }
                return z12;
            }
            return z11;
        }

        /* renamed from: d */
        public String m48157d() {
            return this.f48235d.m106842o();
        }

        /* renamed from: e */
        public String m48158e() {
            return this.f48234c.m106842o();
        }

        /* renamed from: f */
        public long m48159f() {
            return this.f48238g;
        }

        /* renamed from: g */
        void m48160g() {
            if (!m48162i() && !this.f48240i.get()) {
                String str = AbstractC9010h.f48229a;
                C32714a c32714a = new C32714a(this.f48232a, m48158e(), m48157d());
                this.f48241j = c32714a;
                int i11 = c32714a.f48195c;
                this.f48239h = i11;
                AbstractC9010h.f48231c.put(Integer.valueOf(i11), this);
                this.f48237f = 0;
                b bVar = new b();
                this.f48241j.m48142o(bVar);
                AbstractC9003a.m48119c().mo48122d(this.f48241j, this.f48233b, bVar);
                this.f48240i.set(true);
            }
        }

        /* renamed from: h */
        public boolean m48161h() {
            C20556f c20556f = this.f48234c;
            if ((c20556f != null && c20556f.m106830b() && this.f48234c.m106845r() > 0) || this.f48232a.startsWith("/")) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        boolean m48162i() {
            return m48155j(this.f48232a);
        }

        /* renamed from: k */
        public void m48163k(AbstractC9003a.a aVar) {
            this.f48236e = aVar;
        }
    }

    /* renamed from: com.zing.zalo.media.download.h$b */
    /* loaded from: classes4.dex */
    public enum b {
        VIDEO("mp4"),
        PHOTO("jpg"),
        FILE("");


        /* renamed from: p */
        String f48248p;

        b(String str) {
            this.f48248p = str;
        }
    }

    /* renamed from: a */
    public static void m48148a(String str) {
        try {
            Map map = f48230b;
            synchronized (map) {
                try {
                    a aVar = (a) map.get(str);
                    if (aVar == null) {
                        a.m48153b(str, AbstractC20130d.m104904x0().getPath(), AbstractC23352g.m122788d(str) + ".mp4");
                    } else {
                        if (aVar.f48241j != null) {
                            AbstractC9003a.m48119c().mo48120a(aVar.f48241j);
                        }
                        aVar.m48156a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f48229a, e11);
        }
    }

    /* renamed from: b */
    static a m48149b(String str, String str2, String str3, b bVar, AbstractC9003a.a aVar) {
        a aVar2;
        Map map = f48230b;
        synchronized (map) {
            try {
                aVar2 = (a) map.get(str);
                if (aVar2 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("init download:");
                    sb2.append(str);
                    aVar2 = new a(str, str2, str3, bVar);
                    map.put(str, aVar2);
                }
                if (!aVar2.m48161h() && aVar != null) {
                    aVar2.m48163k(aVar);
                }
                if (!aVar2.m48161h() && !str.startsWith("http://127.0.0.1:")) {
                    aVar2.m48160g();
                    map.put(C28631a.m143196c().m143201a(String.valueOf(aVar2.f48239h)).toString(), aVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar2;
    }

    /* renamed from: c */
    public static a m48150c(String str, AbstractC9003a.a aVar) {
        return m48149b(str, AbstractC20130d.m104904x0().getPath(), AbstractC23352g.m122788d(str) + ".mp4", b.VIDEO, aVar);
    }

    /* renamed from: d */
    public static a m48151d(int i11) {
        a aVar;
        synchronized (f48230b) {
            aVar = (a) f48231c.get(Integer.valueOf(i11));
        }
        return aVar;
    }

    /* renamed from: e */
    public static void m48152e() {
        List<AbstractC9007e> mo48121b = AbstractC9003a.m48119c().mo48121b(b.VIDEO);
        synchronized (f48230b) {
            if (mo48121b != null) {
                try {
                    for (AbstractC9007e abstractC9007e : mo48121b) {
                        f48230b.remove(abstractC9007e.m48134g());
                        f48231c.remove(Integer.valueOf(abstractC9007e.m48133f()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
