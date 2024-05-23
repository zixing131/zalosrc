package vi0;

import bn0.AbstractC2941j;
import bn0.AbstractC2942k;
import bn0.C2936e;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import mm0.AbstractC23350e;
import nn0.AbstractC23906o;
import nn0.InterfaceC23898g;
import on0.AbstractC24341v;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import sm0.AbstractC26327c;
import wi0.C29051a;
import wi0.C29052b;

/* renamed from: vi0.b */
/* loaded from: classes7.dex */
public final class C28264b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static volatile C28264b f131794a;

    /* renamed from: b */
    private static b f131795b;

    /* renamed from: vi0.b$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28264b m142373a() {
            if (C28264b.f131794a == null) {
                synchronized (this) {
                    try {
                        if (C28264b.f131794a == null) {
                            C28264b.f131794a = new C28264b();
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            C28264b c28264b = C28264b.f131794a;
            AbstractC19074t.m100205c(c28264b);
            return c28264b;
        }
    }

    /* renamed from: vi0.b$b */
    /* loaded from: classes7.dex */
    public interface b {
        /* renamed from: a */
        int mo142374a();

        /* renamed from: b */
        C28263a mo142375b(EnumC28265c enumC28265c);
    }

    /* renamed from: vi0.b$c */
    /* loaded from: classes7.dex */
    public static final class c implements b {

        /* renamed from: a */
        public static final c f131796a = new c();

        private c() {
        }

        @Override // vi0.C28264b.b
        /* renamed from: a */
        public int mo142374a() {
            return 70;
        }

        @Override // vi0.C28264b.b
        /* renamed from: b */
        public C28263a mo142375b(EnumC28265c enumC28265c) {
            AbstractC19074t.m100208f(enumC28265c, "cacheType");
            return enumC28265c.m142380d();
        }
    }

    /* renamed from: vi0.b$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ File f131797q;

        /* renamed from: r */
        final /* synthetic */ C19055h0 f131798r;

        /* renamed from: s */
        final /* synthetic */ long f131799s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(File file, C19055h0 c19055h0, long j11) {
            super(1);
            this.f131797q = file;
            this.f131798r = c19055h0;
            this.f131799s = j11;
        }

        /* renamed from: a */
        public final boolean m142376a(File file) {
            AbstractC19074t.m100208f(file, "it");
            if (AbstractC19074t.m100204b(file, this.f131797q)) {
                return false;
            }
            this.f131798r.f94931p++;
            if (file.lastModified() >= this.f131799s) {
                return false;
            }
            return true;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return Boolean.valueOf(m142376a((File) obj));
        }
    }

    /* renamed from: vi0.b$e */
    /* loaded from: classes7.dex */
    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            return m135478b;
        }
    }

    /* renamed from: vi0.b$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f f131800q = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m142377a(File file) {
            AbstractC19074t.m100208f(file, "it");
            return file.isFile();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return Boolean.valueOf(m142377a((File) obj));
        }
    }

    /* renamed from: e */
    private final void m142359e(File file, C28263a c28263a) {
        C2936e m13920g;
        InterfaceC23898g m125023l;
        long m142338g = c28263a.m142338g();
        if (m142338g <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - m142338g;
        C19055h0 c19055h0 = new C19055h0();
        m13920g = AbstractC2941j.m13920g(file, null, 1, null);
        m125023l = AbstractC23906o.m125023l(m13920g, new d(file, c19055h0, currentTimeMillis));
        Iterator it = m125023l.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11++;
            m142366p((File) it.next());
        }
        C29052b.m145094f("ZFileCache", "Check cutoff: Cleaned " + i11 + " files/folders");
    }

    /* renamed from: f */
    private final void m142360f(File file, EnumC28265c enumC28265c, C28263a c28263a) {
        long j11;
        int i11;
        C2936e m13920g;
        InterfaceC23898g m125023l;
        InterfaceC23898g<File> m125030s;
        long m142339h = c28263a.m142339h();
        if (m142339h <= 0) {
            return;
        }
        long m142371n = m142371n(enumC28265c);
        C29052b.m145094f("ZFileCache", "Check oversize: beforeSize=" + m142371n + ", maxSize=" + m142339h);
        int i12 = 0;
        if (m142371n >= m142339h) {
            float mo142374a = ((float) (m142339h * m142364l().mo142374a())) * 0.01f;
            m13920g = AbstractC2941j.m13920g(file, null, 1, null);
            m125023l = AbstractC23906o.m125023l(m13920g, f.f131800q);
            m125030s = AbstractC23906o.m125030s(m125023l, new e());
            j11 = m142371n;
            int i13 = 0;
            for (File file2 : m125030s) {
                i12++;
                if (((float) j11) <= mo142374a) {
                    break;
                }
                i13++;
                j11 -= file2.length();
                file2.delete();
            }
            i11 = i12;
            i12 = i13;
        } else {
            j11 = m142371n;
            i11 = 0;
        }
        C29052b.m145094f("ZFileCache", "Check oversize: Cleaned " + i12 + '/' + i11 + " files");
        C29052b.m145094f("ZFileCache", "Check oversize: Remaining " + j11 + '/' + m142371n + " (bytes)");
    }

    /* renamed from: i */
    private final boolean m142361i(File file) {
        try {
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return false;
                }
            }
            return true;
        } catch (IOException e11) {
            AbstractC23350e.m122776f("ZFileCache", e11);
            return false;
        }
    }

    /* renamed from: j */
    public static final C28264b m142362j() {
        return Companion.m142373a();
    }

    /* renamed from: k */
    private final File m142363k(EnumC28265c enumC28265c) {
        String path = C29051a.f134591a.m145088h().getPath();
        AbstractC19074t.m100205c(path);
        return new File(path, enumC28265c.m142379c());
    }

    /* renamed from: l */
    private final b m142364l() {
        b bVar = f131795b;
        if (bVar == null) {
            return c.f131796a;
        }
        return bVar;
    }

    /* renamed from: m */
    private final long m142365m(File file) {
        long m142365m;
        File[] listFiles = file.listFiles();
        long j11 = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    m142365m = file2.length();
                } else {
                    AbstractC19074t.m100207e(file2, "file");
                    m142365m = m142365m(file2);
                }
                j11 += m142365m;
            }
        }
        return j11;
    }

    /* renamed from: p */
    private final void m142366p(File file) {
        Object m129218b;
        boolean m13925l;
        try {
            C24861r.a aVar = C24861r.f119264q;
            if (!file.isFile()) {
                m13925l = AbstractC2942k.m13925l(file);
            } else {
                m13925l = file.delete();
            }
            m129218b = C24861r.m129218b(Boolean.valueOf(m13925l));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129221e(m129218b) != null) {
            C29052b.m145094f("ZFileCache", AbstractC19074t.m100216n("safeDelete(): Failed to delete ", file.getAbsolutePath()));
        }
    }

    /* renamed from: c */
    public final File m142367c(EnumC28265c enumC28265c) {
        AbstractC19074t.m100208f(enumC28265c, "cacheType");
        try {
            File m142363k = m142363k(enumC28265c);
            if (!m142361i(m142363k)) {
                C29052b.m145094f("ZFileCache", AbstractC19074t.m100216n("Failed to create cache directory: ", m142363k.getAbsolutePath()));
                return null;
            }
            return m142363k;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZFileCache", e11);
            return null;
        }
    }

    /* renamed from: d */
    public final void m142368d() {
        long currentTimeMillis;
        StringBuilder sb2;
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            try {
                EnumC28265c[] values = EnumC28265c.values();
                int length = values.length;
                int i11 = 0;
                while (i11 < length) {
                    EnumC28265c enumC28265c = values[i11];
                    i11++;
                    File m142363k = m142363k(enumC28265c);
                    if (m142363k.exists()) {
                        C28263a mo142375b = m142364l().mo142375b(enumC28265c);
                        m142359e(m142363k, mo142375b);
                        m142360f(m142363k, enumC28265c, mo142375b);
                    }
                }
                currentTimeMillis = System.currentTimeMillis();
                sb2 = new StringBuilder();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZFileCache", e11);
                currentTimeMillis = System.currentTimeMillis();
                sb2 = new StringBuilder();
            }
            sb2.append("checkAndClean(): Elapsed ");
            sb2.append(currentTimeMillis - currentTimeMillis2);
            sb2.append(" ms");
            C29052b.m145094f("ZFileCache", sb2.toString());
        } catch (Throwable th2) {
            C29052b.m145094f("ZFileCache", "checkAndClean(): Elapsed " + (System.currentTimeMillis() - currentTimeMillis2) + " ms");
            throw th2;
        }
    }

    /* renamed from: g */
    public final long m142369g() {
        long m142372o = m142372o();
        C29051a.f134591a.m145085a();
        return m142372o;
    }

    /* renamed from: h */
    public final void m142370h() {
        String m127130z;
        String m127130z2;
        StringBuilder sb2 = new StringBuilder();
        m127130z = AbstractC24341v.m127130z("─", 39);
        sb2.append(m127130z);
        sb2.append("\nPath: ");
        sb2.append(C29051a.f134591a.m145086f());
        sb2.append("\nSize: ");
        sb2.append(C29052b.m145089a(m142372o()));
        sb2.append(" MB\n");
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        sb2.append(m127130z2);
        AbstractC20110a.f98889a.m104564x("ZFileCache").mo104556o(8, sb2.toString(), new Object[0]);
    }

    /* renamed from: n */
    public final long m142371n(EnumC28265c enumC28265c) {
        AbstractC19074t.m100208f(enumC28265c, "cacheType");
        File m142363k = m142363k(enumC28265c);
        if (!m142363k.exists()) {
            return 0L;
        }
        return m142365m(m142363k);
    }

    /* renamed from: o */
    public final long m142372o() {
        long j11 = 0;
        for (EnumC28265c enumC28265c : EnumC28265c.values()) {
            j11 += m142371n(enumC28265c);
        }
        return j11;
    }
}
