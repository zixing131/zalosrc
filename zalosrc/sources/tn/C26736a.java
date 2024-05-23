package tn;

import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p363nh.C23744a;
import p645xh.C29630g;

/* renamed from: tn.a */
/* loaded from: classes4.dex */
public class C26736a {

    /* renamed from: c */
    private static final Map f126835c = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: d */
    private static final Map f126836d = new ConcurrentHashMap();

    /* renamed from: e */
    private static volatile C26736a f126837e;

    /* renamed from: a */
    private final int f126838a = 5;

    /* renamed from: b */
    private final c f126839b = new d();

    /* renamed from: tn.a$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f126840a;

        a(String str) {
            this.f126840a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42600z3(CoreUtility.f89233i, this.f126840a);
        }
    }

    /* renamed from: tn.a$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C10873l f126842a;

        b(C10873l c10873l) {
            this.f126842a = c10873l;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42600z3(CoreUtility.f89233i, this.f126842a.m56493u());
        }
    }

    /* renamed from: tn.a$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: a */
        void mo137543a(C26742d c26742d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tn.a$d */
    /* loaded from: classes4.dex */
    public final class d implements c {
        /* synthetic */ d(C26736a c26736a, AbstractC26738b abstractC26738b) {
            this();
        }

        @Override // tn.C26736a.c
        /* renamed from: a */
        public void mo137543a(C26742d c26742d) {
            C26736a.this.m137538d(c26742d);
            C26736a.this.m137542k();
        }

        private d() {
        }
    }

    private C26736a() {
    }

    /* renamed from: e */
    public static C26736a m137532e() {
        if (f126837e == null) {
            synchronized (C26736a.class) {
                try {
                    if (f126837e == null) {
                        f126837e = new C26736a();
                    }
                } finally {
                }
            }
        }
        return f126837e;
    }

    /* renamed from: h */
    public static void m137533h(String str) {
    }

    /* renamed from: i */
    private void m137534i(C10873l c10873l) {
        C23744a.m124114c().m124116d(55, c10873l.f54892H);
    }

    /* renamed from: a */
    public synchronized void m137535a(C10873l c10873l) {
        if (c10873l != null) {
            try {
                try {
                    C26742d c26742d = new C26742d(c10873l, this.f126839b);
                    Map map = f126835c;
                    if (!map.containsKey(c26742d.m137548d())) {
                        map.put(c26742d.m137548d(), c26742d);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m137542k();
    }

    /* renamed from: b */
    public void m137536b() {
        try {
            ArrayList<C10873l> m137557f = C26744e.m137551e().m137557f();
            if (m137557f != null && !m137557f.isEmpty()) {
                for (C10873l c10873l : m137557f) {
                    if (c10873l != null && c10873l.m56449O() && c10873l.m56448N()) {
                        m137537c(c10873l.m56493u());
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public synchronized void m137537c(String str) {
        C26742d c26742d;
        C10873l m137547c;
        try {
            try {
                Map map = f126835c;
                if (map.containsKey(str) && (c26742d = (C26742d) map.get(str)) != null && (m137547c = c26742d.m137547c()) != null) {
                    m137547c.m56432A0(5);
                }
                C26744e.m137551e().m137559i(str);
                C0824j.m2153b(new a(str));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d */
    synchronized void m137538d(C26742d c26742d) {
        try {
            try {
                int m56435C = c26742d.m137547c().m56435C();
                String m56493u = c26742d.m137547c().m56493u();
                c26742d.m137547c().m56487r();
                if (m56435C != 2) {
                    if (m56435C != 3) {
                        if (m56435C == 5) {
                            C26744e.m137551e().m137559i(m56493u);
                            m137534i(c26742d.m137547c());
                        }
                    } else {
                        C26744e.m137551e().m137559i(m56493u);
                        m137534i(c26742d.m137547c());
                    }
                } else {
                    m137534i(c26742d.m137547c());
                }
                f126835c.remove(c26742d.m137548d());
                f126836d.remove(c26742d.m137548d());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: f */
    public boolean m137539f() {
        if (C26744e.m137551e().m137558g() == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void m137540g() {
        try {
            C26744e.m137551e().m137554b();
            ArrayList<C10873l> m42081C5 = C7960e.m41971c6().m42081C5(CoreUtility.f89233i);
            if (m42081C5 != null && !m42081C5.isEmpty()) {
                C29630g.m147299E0().m147319V0();
                ArrayList arrayList = new ArrayList();
                for (C10873l c10873l : m42081C5) {
                    if (c10873l != null) {
                        if (c10873l.m56435C() == 3) {
                            C0824j.m2153b(new b(c10873l));
                        } else {
                            C26744e.m137551e().m137553a(c10873l);
                            if (c10873l.m56435C() == 1 || c10873l.m56435C() == 4) {
                                arrayList.add(c10873l);
                            }
                        }
                    }
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    m137535a((C10873l) arrayList.get(i11));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public void m137541j(String str) {
        C10873l m137556d;
        try {
            if (!TextUtils.isEmpty(str) && !f126835c.containsKey(str) && (m137556d = C26744e.m137551e().m137556d(str)) != null) {
                m137556d.m56438D0();
                m137535a(m137556d);
                m137534i(m137556d);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public synchronized void m137542k() {
        Map map;
        try {
            map = f126835c;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!map.isEmpty()) {
            Map map2 = f126836d;
            if (map2.size() <= 0) {
                C26742d c26742d = (C26742d) map.values().iterator().next();
                map2.put(c26742d.m137548d(), c26742d.m137548d());
                c26742d.m137550f();
            }
        }
    }
}
