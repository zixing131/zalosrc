package vg;

import am.AbstractC0924m0;
import android.text.TextUtils;
import com.zing.zalo.uicontrol.C16673w;
import hu.C20128b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import me0.AbstractC23193r0;
import p098dc.InterfaceC17872f;
import p536u3.AbstractC27005l;
import p566v3.C27508p;

/* renamed from: vg.k4 */
/* loaded from: classes3.dex */
public class C28111k4 {

    /* renamed from: a */
    private final Map f131086a;

    /* renamed from: b */
    private final Object f131087b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.k4$a */
    /* loaded from: classes3.dex */
    public class a extends LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            C27508p c27508p;
            if (size() > 5) {
                if (entry != null) {
                    c27508p = (C27508p) entry.getValue();
                } else {
                    c27508p = null;
                }
                if (c27508p != null) {
                    c27508p.m140646a();
                    return true;
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: vg.k4$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        static C28111k4 f131089a = new C28111k4();
    }

    /* synthetic */ C28111k4(AbstractC28120l4 abstractC28120l4) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C27508p m141586b(String str, String str2) {
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
                        e.printStackTrace();
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

    /* renamed from: c */
    private InterfaceC17872f m141587c(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            return C28181s2.f131306a.m141726k(str2, str);
        }
        return null;
    }

    /* renamed from: d */
    public static C28111k4 m141588d() {
        return b.f131089a;
    }

    /* renamed from: g */
    private C27508p m141589g(String str, String str2) {
        C27508p m141586b;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && m141595i() && (m141586b = m141586b(str, str2)) != null) {
            m141591k(str, m141586b);
            return new C27508p(m141586b);
        }
        return null;
    }

    /* renamed from: h */
    private String m141590h(String str, InterfaceC17872f interfaceC17872f) {
        if ((interfaceC17872f instanceof C16673w) && !TextUtils.isEmpty(str)) {
            return str + "/" + ((C16673w) interfaceC17872f).m88866f();
        }
        return "";
    }

    /* renamed from: k */
    private void m141591k(String str, C27508p c27508p) {
        if (!m141595i()) {
            return;
        }
        synchronized (this.f131087b) {
            try {
                if (this.f131086a != null && !TextUtils.isEmpty(str) && c27508p != null) {
                    C27508p m141594f = m141594f(str);
                    if (m141594f != null && m141594f != c27508p) {
                        m141594f.m140646a();
                    }
                    this.f131086a.put(str, c27508p);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public void m141592a() {
        Iterator it;
        synchronized (this.f131087b) {
            try {
                Map map = this.f131086a;
                if (map != null) {
                    it = map.entrySet().iterator();
                } else {
                    it = null;
                }
                while (it != null && it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (entry != null) {
                        C27508p c27508p = (C27508p) entry.getValue();
                        if (c27508p != null) {
                            c27508p.m140646a();
                        }
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public C27508p m141593e(String str, String str2) {
        if (!m141595i() || TextUtils.isEmpty(str)) {
            return null;
        }
        C27508p m141594f = m141594f(str);
        if (m141594f != null) {
            return new C27508p(m141594f);
        }
        return m141589g(str, str2);
    }

    /* renamed from: f */
    public C27508p m141594f(String str) {
        if (!m141595i()) {
            return null;
        }
        synchronized (this.f131087b) {
            try {
                if (this.f131086a == null || TextUtils.isEmpty(str)) {
                    return null;
                }
                return (C27508p) this.f131086a.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public boolean m141595i() {
        if (AbstractC0924m0.m3075G9() && AbstractC23193r0.m119505n() > 3072 && C20128b.m104770q() >= 4) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m141596j(String str, String str2) {
        if (!TextUtils.isEmpty(str2) || (!TextUtils.isEmpty(str) && m141595i())) {
            String m141590h = m141590h(str2, m141587c(str, str2));
            if (!TextUtils.isEmpty(m141590h) && m141594f(m141590h) == null) {
                m141589g(m141590h, str2);
            }
        }
    }

    /* renamed from: l */
    public void m141597l(String str) {
        synchronized (this.f131087b) {
            try {
                if (this.f131086a != null && !TextUtils.isEmpty(str)) {
                    Iterator it = this.f131086a.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey()) && ((String) entry.getKey()).contains(str)) {
                            C27508p c27508p = (C27508p) entry.getValue();
                            if (c27508p != null) {
                                c27508p.m140646a();
                            }
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private C28111k4() {
        this.f131087b = new Object();
        this.f131086a = new a();
    }
}
