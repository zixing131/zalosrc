package p399op;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;
import java.util.List;
import p426pp.C24898a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25356m;
import sm0.AbstractC26327c;

/* renamed from: op.p */
/* loaded from: classes4.dex */
public final class C24404p extends AbstractC24389a implements InterfaceC24395g {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private final InterfaceC24394f f117821r;

    /* renamed from: s */
    private final InterfaceC24854k f117822s;

    /* renamed from: op.p$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: op.p$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private long f117823a = AbstractC0924m0.m4129q3();

        /* renamed from: a */
        public final long m127641a() {
            return this.f117823a;
        }

        /* renamed from: b */
        public final void m127642b(long j11) {
            this.f117823a = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.p$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f117824q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final b mo12V4() {
            return new b();
        }
    }

    /* renamed from: op.p$d */
    /* loaded from: classes4.dex */
    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            return m135478b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24404p(InterfaceC24394f interfaceC24394f) {
        super(200, null, 2, null);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(interfaceC24394f, "musicHelper");
        this.f117821r = interfaceC24394f;
        m129210a = AbstractC24856m.m129210a(c.f117824q);
        this.f117822s = m129210a;
    }

    /* renamed from: C */
    private final b m127636C() {
        return (b) this.f117822s.getValue();
    }

    /* renamed from: D */
    public final void m127637D() {
        List m131320c;
        List<File> m131177E0;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - m127636C().m127641a() >= 604800000) {
                m127636C().m127642b(currentTimeMillis);
                AbstractC0924m0.m4176rk(currentTimeMillis);
                File[] listFiles = new File(this.f117821r.mo127597a()).listFiles(new FileFilter() { // from class: op.o
                    public /* synthetic */ C24403o() {
                    }

                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        boolean m127638E;
                        m127638E = C24404p.m127638E(C24404p.this, file);
                        return m127638E;
                    }
                });
                if (listFiles != null && listFiles.length > 200) {
                    m131320c = AbstractC25356m.m131320c(listFiles);
                    m131177E0 = AbstractC25332a0.m131177E0(m131320c, new d());
                    long j11 = 0;
                    for (File file : m131177E0) {
                        if (listFiles.length - j11 > 200) {
                            try {
                                AbstractC20130d.m104887p(file);
                                j11++;
                            } catch (Exception e11) {
                                AbstractC20110a.f98889a.mo104552e(e11);
                            }
                        }
                    }
                }
            }
        } catch (Exception e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
        }
    }

    /* renamed from: E */
    public static final boolean m127638E(C24404p c24404p, File file) {
        AbstractC19074t.m100208f(c24404p, "this$0");
        if (file.isFile()) {
            InterfaceC24394f interfaceC24394f = c24404p.f117821r;
            String name = file.getName();
            AbstractC19074t.m100207e(name, "getName(...)");
            if (interfaceC24394f.mo127598b(name)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public /* bridge */ boolean m127640B(C24898a c24898a) {
        return super.containsValue(c24898a);
    }

    @Override // p399op.AbstractC24389a, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C24898a)) {
            return false;
        }
        return m127640B((C24898a) obj);
    }

    @Override // p399op.InterfaceC24395g
    /* renamed from: n */
    public void mo127602n(C24898a c24898a) {
        AbstractC19074t.m100208f(c24898a, "lyric");
        put(c24898a.m129467c(), c24898a);
    }

    @Override // p399op.InterfaceC24395g
    /* renamed from: o */
    public void mo127603o() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: op.n
            public /* synthetic */ RunnableC24402n() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C24404p.this.m127637D();
            }
        });
    }

    @Override // p399op.InterfaceC24395g
    /* renamed from: q */
    public C24898a mo127604q(String str) {
        AbstractC19074t.m100208f(str, "idSong");
        return (C24898a) get(str);
    }

    public /* synthetic */ C24404p(InterfaceC24394f interfaceC24394f, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24401m.f117816a : interfaceC24394f);
    }
}
