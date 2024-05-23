package x30;

import android.text.TextUtils;
import com.adtima.Adtima;
import com.zing.zalo.MainApplication;
import com.zing.zalocore.CoreUtility;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import p248iy.AbstractC20887g;

/* renamed from: x30.c */
/* loaded from: classes5.dex */
public class C29308c {

    /* renamed from: a */
    private final Object f135765a;

    /* renamed from: b */
    private final Hashtable f135766b;

    /* renamed from: c */
    private final b f135767c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x30.c$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        private static final C29308c f135768a = new C29308c();
    }

    /* renamed from: x30.c$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo146420a(int i11, C29306a c29306a);
    }

    /* synthetic */ C29308c(AbstractC29309d abstractC29309d) {
        this();
    }

    /* renamed from: d */
    private void m146422d(InterfaceC29310e interfaceC29310e) {
        synchronized (this.f135765a) {
            try {
                if (interfaceC29310e == null) {
                    return;
                }
                LinkedList linkedList = (LinkedList) this.f135766b.remove(Integer.valueOf(interfaceC29310e.getType()));
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    interfaceC29310e.mo146432b((C29306a) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static C29308c m146423e() {
        return a.f135768a;
    }

    /* renamed from: f */
    public static void m146424f(int i11, String str) {
        AbstractC20887g.m109240r(i11, str);
        AbstractC20887g.m109231i(CoreUtility.f89233i, i11, str, System.currentTimeMillis(), 124000, CoreUtility.f89236l);
    }

    /* renamed from: g */
    public static void m146425g(int i11) {
        AbstractC20887g.m109245w(i11);
    }

    /* renamed from: h */
    public void m146426h(int i11, C29306a c29306a) {
        synchronized (this.f135765a) {
            try {
                LinkedList linkedList = (LinkedList) this.f135766b.get(Integer.valueOf(i11));
                if (linkedList == null) {
                    linkedList = new LinkedList();
                    this.f135766b.put(Integer.valueOf(i11), linkedList);
                }
                linkedList.add(c29306a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public C29311f m146427b(String str, int i11, InterfaceC29310e interfaceC29310e, String str2) {
        if (TextUtils.isEmpty(str)) {
            m146424f(124005, "zoneId is empty");
            return null;
        }
        return new C29311f(str, i11, interfaceC29310e, this.f135767c, str2);
    }

    /* renamed from: c */
    public C29312g m146428c(String str, int i11, InterfaceC29310e interfaceC29310e, String str2) {
        if (TextUtils.isEmpty(str)) {
            m146424f(124005, "zoneId is empty");
            return null;
        }
        return new C29312g(str, i11, interfaceC29310e, this.f135767c, str2);
    }

    /* renamed from: i */
    public void m146429i(InterfaceC29310e interfaceC29310e) {
        m146422d(interfaceC29310e);
    }

    private C29308c() {
        this.f135765a = new Object();
        this.f135766b = new Hashtable();
        this.f135767c = new b() { // from class: x30.b
            public /* synthetic */ C29307b() {
            }

            @Override // x30.C29308c.b
            /* renamed from: a */
            public final void mo146420a(int i11, C29306a c29306a) {
                C29308c.this.m146426h(i11, c29306a);
            }
        };
        Adtima.initSdk(MainApplication.getAppContext(), "402");
    }
}
