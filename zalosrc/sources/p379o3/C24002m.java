package p379o3;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3978k;
import com.androidquery.util.InterfaceC3968a;
import ho0.AbstractC20110a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import mm0.AbstractC23350e;

/* renamed from: o3.m */
/* loaded from: classes2.dex */
public class C24002m extends AbstractRunnableC23992c {

    /* renamed from: w0 */
    private static final HashMap f116256w0 = new HashMap();

    /* renamed from: x0 */
    private static final Map f116257x0 = Collections.synchronizedMap(new C3978k());

    /* renamed from: v0 */
    private WeakReference f116258v0;

    public C24002m(int i11) {
        ((C24002m) ((C24002m) ((C24002m) ((C24002m) m125628s1(File.class)).m125615k1(i11)).m125602Z(true)).m125596P0(true)).m125635v1("");
    }

    /* renamed from: D1 */
    private void m125820D1(String str, InterfaceC3968a interfaceC3968a) {
        HashMap hashMap = f116256w0;
        WeakHashMap weakHashMap = (WeakHashMap) hashMap.get(str);
        if (weakHashMap == null) {
            if (hashMap.containsKey(str)) {
                WeakHashMap weakHashMap2 = new WeakHashMap();
                weakHashMap2.put(interfaceC3968a, this);
                hashMap.put(str, weakHashMap2);
                return;
            }
            hashMap.put(str, null);
            return;
        }
        weakHashMap.put(interfaceC3968a, this);
    }

    /* renamed from: G1 */
    private void m125821G1(C24002m c24002m, String str, InterfaceC3968a interfaceC3968a, File file, C23995f c23995f) {
        if (interfaceC3968a != null && c24002m != null) {
            if (str.equals(interfaceC3968a.getTag(1090453509))) {
                c24002m.mo16457E1(str, interfaceC3968a, file, c23995f);
            }
            m125619m1(false);
        }
    }

    /* renamed from: K1 */
    public static boolean m125822K1(String str) {
        if (!TextUtils.isEmpty(str) && f116256w0.containsKey(str)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L1 */
    public static /* synthetic */ void m125823L1(String str) {
        AbstractC20110a.m104535d("UPDATE PRIORITY: %s", str);
        AbstractRunnableC23992c.m125577u1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M1 */
    public static /* synthetic */ void m125824M1(String str) {
        try {
            Thread.sleep(1000L);
            File m18745B = AbstractC3972e.m18745B(AbstractC3972e.m18807t(AbstractC3972e.m18812y(), 1), str);
            if (m18745B == null) {
                m18745B = AbstractC3972e.m18745B(AbstractC3972e.m18807t(AbstractC3972e.m18812y(), 0), str);
            }
            if (m18745B != null) {
                m18745B.delete();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: N1 */
    private static void m125825N1(String str) {
    }

    /* renamed from: E1 */
    protected void mo16457E1(String str, InterfaceC3968a interfaceC3968a, File file, C23995f c23995f) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:5:0x0003, B:7:0x0014, B:11:0x0027, B:12:0x002f, B:14:0x0035, B:17:0x0045, B:22:0x004f, B:27:0x001d), top: B:4:0x0003, outer: #1 }] */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: F1, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1932C(String str, File file, C23995f c23995f) {
        try {
            HashMap hashMap = f116256w0;
            synchronized (hashMap) {
                try {
                    WeakHashMap weakHashMap = (WeakHashMap) hashMap.remove(str);
                    InterfaceC3968a interfaceC3968a = (InterfaceC3968a) this.f116258v0.get();
                    if (weakHashMap != null) {
                        if (!weakHashMap.containsKey(interfaceC3968a)) {
                        }
                        if (weakHashMap != null) {
                            for (InterfaceC3968a interfaceC3968a2 : weakHashMap.keySet()) {
                                C24002m c24002m = (C24002m) weakHashMap.get(interfaceC3968a2);
                                if (c24002m != null) {
                                    c24002m.f116127C = c23995f;
                                    m125821G1(c24002m, str, interfaceC3968a2, file, c23995f);
                                }
                            }
                        }
                    }
                    m125821G1(this, str, interfaceC3968a, file, c23995f);
                    if (weakHashMap != null) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H1 */
    public void m125827H1() {
        C23995f c23995f;
        HashMap hashMap = f116256w0;
        synchronized (hashMap) {
            try {
                try {
                    m125825N1("clearTask:" + m125633u0());
                    WeakHashMap weakHashMap = (WeakHashMap) hashMap.get(m125633u0());
                    if (weakHashMap != null) {
                        ArrayList arrayList = new ArrayList();
                        for (InterfaceC3968a interfaceC3968a : weakHashMap.keySet()) {
                            C24002m c24002m = (C24002m) weakHashMap.get(interfaceC3968a);
                            if (c24002m != null && (c23995f = c24002m.f116127C) != null && c23995f.m125669t()) {
                            }
                            arrayList.add(interfaceC3968a);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            weakHashMap.remove((InterfaceC3968a) it.next());
                        }
                        if (weakHashMap.isEmpty()) {
                            f116256w0.remove(m125633u0());
                        }
                    } else {
                        hashMap.remove(m125633u0());
                    }
                } catch (Exception e11) {
                    f116256w0.remove(m125633u0());
                    AbstractC23350e.m122776f("BitmapAjaxCallback", e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: I */
    public final void mo125592I(final String str) {
        try {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: o3.l
                @Override // java.lang.Runnable
                public final void run() {
                    C24002m.m125824M1(str);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: I1, reason: merged with bridge method [inline-methods] */
    public File mo125604a0(String str, File file, C23995f c23995f) {
        File file2 = this.f116126B;
        if (file2 != null) {
            if (file2.exists()) {
                return this.f116126B;
            }
            return null;
        }
        return (File) super.mo125604a0(str, file, c23995f);
    }

    /* renamed from: J1 */
    public C24002m m125829J1(InterfaceC3968a interfaceC3968a) {
        this.f116258v0 = new WeakReference(interfaceC3968a);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: O1, reason: merged with bridge method [inline-methods] */
    public File mo125597Q0(String str) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f116126B != null) {
            return null;
        }
        String str2 = (String) f116257x0.get(str);
        if (!TextUtils.isEmpty(str2)) {
            File file = new File(str2);
            if (!file.exists()) {
                return null;
            }
            if (file.length() <= 0) {
                return null;
            }
            return file;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: P1, reason: merged with bridge method [inline-methods] */
    public void mo125598R0(String str, File file) {
        try {
            if (this.f116126B != null) {
                return;
            }
            f116257x0.put(str, file.getAbsolutePath());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: d0 */
    public void mo125606d0() {
        if (this.f116126B != null) {
            this.f116127C.m125647A(3);
            File mo125604a0 = mo125604a0(m125633u0(), this.f116126B, this.f116127C);
            this.f116166y = mo125604a0;
            if (mo125604a0 != null) {
                this.f116127C.m125649C(new Date(this.f116126B.lastModified())).m125654e();
                return;
            } else {
                if (this.f116126B.exists() && m125633u0().startsWith("http")) {
                    this.f116126B.delete();
                    return;
                }
                return;
            }
        }
        super.mo125606d0();
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: h0 */
    protected File mo125610h0(Context context, int i11) {
        return AbstractC3972e.m18750G(context, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: i0 */
    public File mo125612i0() {
        File file = this.f116126B;
        if (file != null) {
            return file;
        }
        return super.mo125612i0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:            ho0.AbstractC20110a.m104535d("REQUEST NOT START:%d %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r4.longValue()), r12);     */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo125623q(Context context) {
        final String m125633u0 = m125633u0();
        m125825N1("Async context : " + m125633u0);
        InterfaceC3968a interfaceC3968a = (InterfaceC3968a) this.f116258v0.get();
        if (m125633u0 == null) {
            m125619m1(false);
            return;
        }
        File mo125597Q0 = mo125597Q0(m125633u0);
        if (mo125597Q0 != null && mo125597Q0.exists() && mo125597Q0.length() > 0) {
            interfaceC3968a.setTag(1090453509, m125633u0);
            C23995f m125654e = new C23995f().m125647A(3).m125654e();
            this.f116127C = m125654e;
            mo1932C(m125633u0, mo125597Q0, m125654e);
            return;
        }
        if (!m125633u0.equals(interfaceC3968a.getTag(1090453509))) {
            interfaceC3968a.setTag(1090453509, m125633u0);
        }
        if (this.f116149Y.get()) {
            return;
        }
        HashMap hashMap = f116256w0;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(m125633u0)) {
                    m125820D1(m125633u0, interfaceC3968a);
                    super.mo125623q(interfaceC3968a.getContext());
                } else {
                    m125619m1(true);
                    m125820D1(m125633u0, interfaceC3968a);
                    if (URLUtil.isNetworkUrl(m125633u0)) {
                        Long l11 = (Long) AbstractRunnableC23992c.f116117n0.get(m125633u0);
                        if (l11 != null && System.currentTimeMillis() - l11.longValue() <= 60000) {
                            AbstractRunnableC23992c.m125537S(new Runnable() { // from class: o3.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C24002m.m125823L1(m125633u0);
                                }
                            });
                        }
                        AbstractC20110a.m104535d("REQUEST NOT START: %s", m125633u0);
                        super.mo125623q(interfaceC3968a.getContext());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: r0 */
    protected int mo125626r0() {
        return 0;
    }
}
