package p327lm;

import android.app.Application;
import android.content.Context;
import hh0.AbstractC20064b;
import hh0.AbstractC20066d;
import hh0.C20063a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lh0.EnumC22487b;
import mh0.C23299a;
import mm.InterfaceC23345a;
import om.C24309b;
import om.C24310c;
import p327lm.C22523c;

/* renamed from: lm.h */
/* loaded from: classes.dex */
public class C22528h {

    /* renamed from: i */
    private static C22528h f110277i = new C22528h();

    /* renamed from: a */
    private boolean f110278a;

    /* renamed from: c */
    private C24309b f110280c;

    /* renamed from: d */
    private InterfaceC23345a f110281d;

    /* renamed from: e */
    private Application f110282e;

    /* renamed from: h */
    private boolean f110285h;

    /* renamed from: b */
    private C22522b f110279b = null;

    /* renamed from: f */
    private boolean f110283f = true;

    /* renamed from: g */
    private List f110284g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lm.h$a */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a */
        String f110286a;

        /* renamed from: b */
        Map f110287b;

        a(String str, Map map) {
            this.f110286a = str;
            this.f110287b = map;
        }
    }

    private C22528h() {
    }

    /* renamed from: d */
    private void m116532d(Map map) {
        try {
            HashMap hashMap = new HashMap();
            C24310c m104264n = AbstractC20064b.m104264n(this.f110282e.getApplicationContext());
            if (m104264n != null) {
                hashMap.put("preloadDefault", C20063a.m104244m(this.f110282e.getApplicationContext()));
                hashMap.put("preload", m104264n.f117392a);
                if (!m104264n.m126955c()) {
                    hashMap.put("preloadFailed", m104264n.f117393b);
                }
            }
            hashMap.put("wakeupInfo", AbstractC20066d.m104299r(this.f110282e.getApplicationContext()));
            map.putAll(hashMap);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public static C22528h m116533g() {
        return f110277i;
    }

    /* renamed from: a */
    public void m116534a(String str, Map map) {
        synchronized (this) {
            try {
                if (!this.f110278a) {
                    this.f110284g.add(new a(str, map));
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m116532d(map);
                    this.f110281d.mo116526e(str, map);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public void m116535b(EnumC22487b enumC22487b, Map map) {
        m116534a(enumC22487b.m116273c(), map);
    }

    /* renamed from: c */
    public void m116536c() {
        if (this.f110278a) {
            this.f110281d.mo116524c();
        } else {
            this.f110285h = true;
        }
    }

    /* renamed from: e */
    public String m116537e() {
        return C22523c.m116498g().m116503d();
    }

    /* renamed from: f */
    public void m116538f(C22523c.a aVar) {
        C22523c.m116498g().m116504e(aVar);
    }

    public void finalize() {
        f110277i = null;
    }

    /* renamed from: h */
    public C22528h m116539h(Application application) {
        String m104233b = C20063a.m104233b(application);
        if (m104233b == null) {
            m104233b = "";
        }
        return m116540i(application, m104233b);
    }

    /* renamed from: i */
    public C22528h m116540i(Application application, String str) {
        synchronized (this) {
            try {
                if (this.f110278a) {
                    return this;
                }
                this.f110282e = application;
                Context applicationContext = application.getApplicationContext();
                this.f110279b = new C22522b(applicationContext);
                this.f110280c = new C24309b(applicationContext);
                boolean m104249r = C20063a.m104249r(application.getApplicationContext());
                this.f110283f = m104249r;
                if (m104249r) {
                    C23299a.f113233c.m120495a(application);
                }
                C22524d c22524d = new C22524d(applicationContext, this.f110279b, this.f110280c, C22523c.m116498g(), str);
                this.f110281d = c22524d;
                c22524d.mo116523b(C22524d.f110247E);
                this.f110281d.mo116525d(C22524d.f110248F);
                this.f110281d.mo116522a(C22524d.f110249G);
                for (a aVar : this.f110284g) {
                    if (aVar.f110287b == null) {
                        aVar.f110287b = new HashMap();
                    }
                    m116532d(aVar.f110287b);
                    this.f110281d.mo116526e(aVar.f110286a, aVar.f110287b);
                }
                if (this.f110285h) {
                    this.f110281d.mo116524c();
                }
                this.f110278a = true;
                return this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public void m116541j(Context context, AbstractC20064b.b bVar) {
        AbstractC20064b.m104265o(context, bVar);
    }
}
