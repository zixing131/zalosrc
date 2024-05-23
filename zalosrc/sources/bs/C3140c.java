package bs;

import ag0.AbstractC0837p0;
import android.graphics.Bitmap;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.uicontrol.C16673w;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import me0.C23055e5;
import mm0.AbstractC23352g;
import p098dc.InterfaceC17872f;
import p516t3.C26469c;
import p536u3.AbstractC27005l;
import p566v3.C27508p;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import tg.C26657h;
import tg.C26674y;
import vg.C28092i5;
import vg.C28181s2;

/* renamed from: bs.c */
/* loaded from: classes4.dex */
public final class C3140c {

    /* renamed from: a */
    public static final C3140c f13243a = new C3140c();

    /* renamed from: b */
    private static final Object f13244b = new Object();

    /* renamed from: c */
    private static final Map f13245c = new LinkedHashMap();

    /* renamed from: d */
    private static final Object f13246d = new Object();

    /* renamed from: e */
    private static final Map f13247e = new a();

    /* renamed from: bs.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends LinkedHashMap {
        a() {
        }

        /* renamed from: a */
        public /* bridge */ boolean m15799a(String str) {
            return super.containsKey(str);
        }

        /* renamed from: b */
        public /* bridge */ boolean m15800b(C27508p c27508p) {
            return super.containsValue(c27508p);
        }

        /* renamed from: c */
        public /* bridge */ C27508p m15801c(String str) {
            return (C27508p) super.get(str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return m15799a((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof C27508p)) {
                return false;
            }
            return m15800b((C27508p) obj);
        }

        /* renamed from: e */
        public /* bridge */ Set m15802e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return m15802e();
        }

        /* renamed from: f */
        public /* bridge */ Set m15803f() {
            return super.keySet();
        }

        /* renamed from: g */
        public /* bridge */ C27508p m15804g(String str, C27508p c27508p) {
            return (C27508p) super.getOrDefault(str, c27508p);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return m15801c((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return m15804g((String) obj, (C27508p) obj2);
        }

        /* renamed from: h */
        public /* bridge */ int m15805h() {
            return super.size();
        }

        /* renamed from: i */
        public /* bridge */ Collection m15806i() {
            return super.values();
        }

        /* renamed from: k */
        public /* bridge */ C27508p m15807k(String str) {
            return (C27508p) super.remove(str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return m15803f();
        }

        /* renamed from: l */
        public /* bridge */ boolean m15808l(String str, C27508p c27508p) {
            return super.remove(str, c27508p);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return m15807k((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            AbstractC19074t.m100208f(entry, "eldest");
            if (size() > 10) {
                ((C27508p) entry.getValue()).m140646a();
                return true;
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return m15805h();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return m15806i();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof C27508p)) {
                return m15808l((String) obj, (C27508p) obj2);
            }
            return false;
        }
    }

    private C3140c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C27508p m15779d(String str, String str2) {
        FileInputStream fileInputStream;
        ?? r02 = 0;
        try {
            try {
                File file = new File(str);
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        C27508p m139132a = AbstractC27005l.m139132a(fileInputStream, str2);
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                        }
                        return m139132a;
                    } catch (IOException e11) {
                        e = e11;
                        AbstractC20110a.f98889a.mo104552e(e);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return null;
                    }
                }
            } catch (IOException e12) {
                e = e12;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (r02 != 0) {
                }
                throw th;
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r02 = str;
            if (r02 != 0) {
                try {
                    r02.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: e */
    private final InterfaceC17872f m15780e(String str, String str2) {
        if (str.length() > 0 && str2.length() > 0) {
            return C28181s2.f131306a.m141726k(str2, str);
        }
        return null;
    }

    /* renamed from: f */
    private final String m15781f(String str) {
        List m131496e;
        C26657h c26657h;
        File m136864s;
        File[] listFiles;
        boolean z11;
        String m104877k;
        C7960e m41971c6 = C7960e.m41971c6();
        m131496e = AbstractC25366r.m131496e(str);
        Map m42431j6 = m41971c6.m42431j6(m131496e);
        if (m42431j6 == null || !m42431j6.containsKey(str) || (c26657h = (C26657h) m42431j6.get(str)) == null) {
            return "";
        }
        if (c26657h.m136819a()) {
            m136864s = C26674y.m136863q(str);
        } else {
            m136864s = C26674y.m136864s(str);
        }
        AbstractC19074t.m100205c(m136864s);
        File file = new File(m136864s.toString() + "/" + AbstractC23352g.m122788d(c26657h.f126156a));
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            if (listFiles.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((!z11) && (m104877k = AbstractC20130d.m104877k(file)) != null && m104877k.length() != 0 && AbstractC19074t.m100204b(m104877k, c26657h.f126159d)) {
                String path = file.getPath();
                AbstractC19074t.m100207e(path, "getPath(...)");
                return path;
            }
        }
        return "";
    }

    /* renamed from: i */
    private final int m15782i(String str) {
        Integer num = (Integer) f13245c.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: j */
    private final C27508p m15783j(String str, String str2, String str3) {
        C27508p m15779d;
        if (str2.length() > 0 && str3.length() > 0 && (m15779d = m15779d(str2, str3)) != null) {
            m15792v(str, str2, m15779d);
            return new C27508p(m15779d);
        }
        return null;
    }

    /* renamed from: k */
    private final String m15784k(String str, InterfaceC17872f interfaceC17872f) {
        if ((interfaceC17872f instanceof C16673w) && str.length() > 0) {
            return str + "/" + ((C16673w) interfaceC17872f).m88866f();
        }
        return "";
    }

    /* renamed from: m */
    private final void m15785m(int i11, String str, String str2, InterfaceC18505l interfaceC18505l) {
        C27508p c27508p;
        if (i11 == 0) {
            c27508p = m15791u(str, str2);
        } else {
            c27508p = null;
        }
        if (i11 == 0 && c27508p != null) {
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(C28092i5.m141562c().m141565e(c27508p));
                return;
            }
            return;
        }
        m15786n(str, interfaceC18505l);
    }

    /* renamed from: n */
    private final void m15786n(String str, InterfaceC18505l interfaceC18505l) {
        m15787o(str);
        C27508p c27508p = null;
        if (!C23055e5.m118273h(false, 1, null)) {
            c27508p = m15791u(str, m15781f(str));
        }
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(C28092i5.m141562c().m141565e(c27508p));
        }
    }

    /* renamed from: o */
    private final void m15787o(String str) {
        int i11;
        synchronized (f13244b) {
            try {
                Map map = f13245c;
                Integer num = (Integer) map.get(str);
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                map.put(str, Integer.valueOf(i11 + 1));
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    private final boolean m15788p(String str) {
        boolean z11;
        synchronized (f13246d) {
            if (f13247e.get(str) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m15789s(String str, final InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(str, "$effectId");
        C26674y m136865t = C26674y.m136865t();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(currentTimeMillis);
        m136865t.m136878o(str, sb2.toString(), new C26674y.b() { // from class: bs.b
            @Override // tg.C26674y.b
            /* renamed from: a */
            public final void mo15759a(int i11, String str2, String str3, C26657h c26657h) {
                C3140c.m15790t(InterfaceC18505l.this, i11, str2, str3, c26657h);
            }
        }, false, (byte) 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m15790t(InterfaceC18505l interfaceC18505l, int i11, String str, String str2, C26657h c26657h) {
        AbstractC19074t.m100208f(str, "effectId1");
        C3140c c3140c = f13243a;
        if (str2 == null) {
            str2 = "";
        }
        c3140c.m15785m(i11, str, str2, interfaceC18505l);
    }

    /* renamed from: u */
    private final C27508p m15791u(String str, String str2) {
        if (str.length() > 0 && str2.length() > 0) {
            String m15784k = m15784k(str2, m15780e(str, str2));
            if (m15784k.length() > 0) {
                return m15783j(str, m15784k, str2);
            }
            return null;
        }
        return null;
    }

    /* renamed from: v */
    private final void m15792v(String str, String str2, C27508p c27508p) {
        synchronized (f13246d) {
            try {
                if (str.length() > 0 && str2.length() > 0) {
                    Map map = f13247e;
                    C27508p c27508p2 = (C27508p) map.get(str);
                    if (c27508p2 != null) {
                        c27508p2.m140646a();
                    }
                    map.put(str, c27508p);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m15793c() {
        synchronized (f13246d) {
            try {
                Iterator it = f13247e.entrySet().iterator();
                while (it.hasNext()) {
                    ((C27508p) ((Map.Entry) it.next()).getValue()).m140646a();
                    it.remove();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final C26469c m15794g(String str) {
        AbstractC19074t.m100208f(str, "effectId");
        C27508p m15795h = m15795h(str);
        if (m15795h != null) {
            return C28092i5.m141562c().m141565e(m15795h);
        }
        return null;
    }

    /* renamed from: h */
    public final C27508p m15795h(String str) {
        AbstractC19074t.m100208f(str, "effectId");
        return (C27508p) f13247e.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:            r0 = qm0.AbstractC25361o0.m131403h(r0);     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m15796l(C27508p c27508p) {
        String str;
        SortedMap m131403h;
        AbstractC19074t.m100208f(c27508p, "<this>");
        AbstractC19074t.m100207e(c27508p.m140648c(), "getBitmaps(...)");
        String str2 = "";
        if (!r0.isEmpty()) {
            Map m140648c = c27508p.m140648c();
            if (m140648c != null && m131403h != null) {
                str = (String) m131403h.firstKey();
            } else {
                str = null;
            }
            if (str != null) {
                str2 = str;
            }
        }
        return (Bitmap) c27508p.m140648c().get(str2);
    }

    /* renamed from: q */
    public final void m15797q(String str) {
        AbstractC19074t.m100208f(str, "effectId");
        m15798r(str, null);
    }

    /* renamed from: r */
    public final void m15798r(final String str, final InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(str, "effectId");
        if (m15788p(str)) {
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(C28092i5.m141562c().m141565e((C27508p) f13247e.get(str)));
            }
        } else if (str.length() > 0 && !m15788p(str) && m15782i(str) < 3) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: bs.a
                @Override // java.lang.Runnable
                public final void run() {
                    C3140c.m15789s(str, interfaceC18505l);
                }
            });
        }
    }
}
