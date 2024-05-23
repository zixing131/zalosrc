package tn;

import android.text.TextUtils;
import ik0.InterfaceC20578a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lk0.InterfaceC22508f;
import tn.HandlerThreadC26753i0;

/* renamed from: tn.j0 */
/* loaded from: classes4.dex */
public class C26755j0 {

    /* renamed from: e */
    private static volatile C26755j0 f126924e;

    /* renamed from: c */
    Object f126927c = new Object();

    /* renamed from: d */
    d f126928d = new c();

    /* renamed from: a */
    private final Map f126925a = Collections.synchronizedMap(new a());

    /* renamed from: b */
    private final Map f126926b = Collections.synchronizedMap(new HashMap());

    /* renamed from: tn.j0$a */
    /* loaded from: classes4.dex */
    class a extends LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 40) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tn.j0$b */
    /* loaded from: classes4.dex */
    public class b implements HandlerThreadC26753i0.c {
        b() {
        }

        @Override // tn.HandlerThreadC26753i0.c
        /* renamed from: a */
        public void mo137711a(String str) {
            C26755j0.this.m137719j(str);
        }

        @Override // tn.HandlerThreadC26753i0.c
        /* renamed from: b */
        public void mo137712b(String str, InterfaceC20578a0 interfaceC20578a0) {
            if (interfaceC20578a0 != null) {
                C26755j0.this.m137720k(str, interfaceC20578a0);
            } else {
                C26755j0.this.m137719j(str);
            }
        }
    }

    /* renamed from: tn.j0$c */
    /* loaded from: classes4.dex */
    class c implements d {
        c() {
        }

        @Override // tn.C26755j0.d
        /* renamed from: a */
        public void mo137688a(String str) {
        }

        @Override // tn.C26755j0.d
        /* renamed from: b */
        public void mo137689b(String str, InterfaceC20578a0 interfaceC20578a0) {
        }
    }

    /* renamed from: tn.j0$d */
    /* loaded from: classes4.dex */
    public interface d {
        /* renamed from: a */
        void mo137688a(String str);

        /* renamed from: b */
        void mo137689b(String str, InterfaceC20578a0 interfaceC20578a0);
    }

    private C26755j0() {
    }

    /* renamed from: c */
    public static String m137715c(String str, String str2, int i11) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && i11 > 0) {
            return str + "_" + str2 + "_" + i11;
        }
        return "";
    }

    /* renamed from: d */
    public static C26755j0 m137716d() {
        if (f126924e == null) {
            synchronized (C26755j0.class) {
                try {
                    if (f126924e == null) {
                        f126924e = new C26755j0();
                    }
                } finally {
                }
            }
        }
        return f126924e;
    }

    /* renamed from: f */
    private void m137717f(String str, InterfaceC22508f interfaceC22508f, int i11) {
        HandlerThreadC26753i0 handlerThreadC26753i0 = new HandlerThreadC26753i0("MemoryZinstantLoader" + System.currentTimeMillis());
        handlerThreadC26753i0.start();
        handlerThreadC26753i0.m137710q(i11);
        handlerThreadC26753i0.m137709p(3);
        handlerThreadC26753i0.m137707n(str);
        handlerThreadC26753i0.m137708o(new b());
        handlerThreadC26753i0.m137706j(interfaceC22508f);
    }

    /* renamed from: i */
    private void m137718i(String str, InterfaceC22508f interfaceC22508f, int i11, d dVar) {
        boolean z11;
        synchronized (this.f126927c) {
            try {
                z11 = false;
                if (this.f126926b.containsKey(str)) {
                    List list = (List) this.f126926b.get(str);
                    if (list != null && list.size() > 0) {
                        list.add(dVar);
                        z11 = true;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(dVar);
                        this.f126926b.put(str, arrayList);
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(dVar);
                    this.f126926b.put(str, arrayList2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11) {
            m137717f(str, interfaceC22508f, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m137719j(String str) {
        synchronized (this.f126927c) {
            try {
                List<d> list = (List) this.f126926b.remove(str);
                if (list != null) {
                    for (d dVar : list) {
                        if (dVar != null) {
                            dVar.mo137688a(str);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m137720k(String str, InterfaceC20578a0 interfaceC20578a0) {
        synchronized (this.f126927c) {
            try {
                this.f126925a.put(str, interfaceC20578a0);
                List<d> list = (List) this.f126926b.remove(str);
                if (list != null) {
                    for (d dVar : list) {
                        if (dVar != null) {
                            dVar.mo137689b(str, interfaceC20578a0);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public InterfaceC20578a0 m137721e(String str) {
        InterfaceC20578a0 interfaceC20578a0;
        synchronized (this.f126927c) {
            try {
                if (this.f126925a.containsKey(str)) {
                    interfaceC20578a0 = (InterfaceC20578a0) this.f126925a.get(str);
                } else {
                    interfaceC20578a0 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC20578a0;
    }

    /* renamed from: g */
    public void m137722g(String str, InterfaceC22508f interfaceC22508f, int i11) {
        m137723h(str, interfaceC22508f, i11, this.f126928d);
    }

    /* renamed from: h */
    public void m137723h(String str, InterfaceC22508f interfaceC22508f, int i11, d dVar) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f126925a.containsKey(str)) {
                if (dVar != null) {
                    dVar.mo137689b(str, (InterfaceC20578a0) this.f126925a.get(str));
                    return;
                }
                return;
            } else {
                if (dVar == null) {
                    dVar = this.f126928d;
                }
                m137718i(str, interfaceC22508f, i11, dVar);
                return;
            }
        }
        if (dVar != null) {
            dVar.mo137688a(str);
        }
    }

    /* renamed from: l */
    public void m137724l(String str) {
        synchronized (this.f126927c) {
            this.f126925a.remove(str);
        }
    }

    /* renamed from: m */
    public void m137725m() {
        synchronized (this.f126927c) {
            this.f126926b.clear();
            this.f126925a.clear();
        }
    }

    /* renamed from: n */
    public void m137726n(String str, InterfaceC20578a0 interfaceC20578a0) {
        synchronized (this.f126927c) {
            try {
                if (!TextUtils.isEmpty(str) && interfaceC20578a0 != null) {
                    this.f126925a.put(str, interfaceC20578a0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
