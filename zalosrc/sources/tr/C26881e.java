package tr;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p363nh.C23744a;

/* renamed from: tr.e */
/* loaded from: classes4.dex */
public class C26881e {

    /* renamed from: i */
    private static volatile C26881e f127219i;

    /* renamed from: b */
    Handler f127221b;

    /* renamed from: c */
    HandlerThread f127222c;

    /* renamed from: e */
    float f127224e;

    /* renamed from: f */
    float f127225f;

    /* renamed from: g */
    float f127226g;

    /* renamed from: h */
    float f127227h;

    /* renamed from: d */
    private final Object f127223d = new Object();

    /* renamed from: a */
    Map f127220a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tr.e$a */
    /* loaded from: classes4.dex */
    public class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11;
            int i12;
            Bundle data = message.getData();
            String str = "";
            if (data != null) {
                str = data.getString("feedId", "");
            }
            String str2 = str;
            long j11 = -1;
            if (data != null) {
                j11 = data.getLong("startTime", -1L);
            }
            long j12 = j11;
            if (data != null) {
                i11 = data.getInt("startProgress");
            } else {
                i11 = 0;
            }
            if (data != null) {
                i12 = data.getInt("endProgress");
            } else {
                i12 = 0;
            }
            int i13 = message.what;
            if (i13 == 1) {
                C26881e.this.m138504t(str2, j12, i11, i12);
            } else if (i13 == 2) {
                C26881e.this.m138499n(str2, j12, i11, i12);
            }
        }
    }

    /* renamed from: tr.e$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        public String f127229a;

        /* renamed from: b */
        public long f127230b;

        /* renamed from: c */
        public int f127231c;

        /* renamed from: d */
        public int f127232d;
    }

    /* renamed from: tr.e$c */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a */
        public int f127233a;

        /* renamed from: b */
        public int f127234b;

        /* renamed from: c */
        public int f127235c;

        /* renamed from: d */
        public int f127236d;

        /* renamed from: e */
        public boolean f127237e;

        /* renamed from: f */
        public int f127238f;
    }

    private C26881e() {
        m138495g();
        m138494f();
    }

    /* renamed from: d */
    public static C26881e m138493d() {
        if (f127219i == null) {
            synchronized (C26881e.class) {
                try {
                    if (f127219i == null) {
                        f127219i = new C26881e();
                    }
                } finally {
                }
            }
        }
        return f127219i;
    }

    /* renamed from: f */
    private void m138494f() {
        this.f127224e = -0.0033333334f;
        this.f127225f = (float) (((-0.0033333334f) * 0.5f * Math.pow(3000.0d, 2.0d)) + 30000.0d);
        this.f127226g = -0.0014285714f;
        this.f127227h = (float) (((-0.0014285714f) * 0.5f * Math.pow(7000.0d, 2.0d)) + 70000.0d);
    }

    /* renamed from: g */
    private void m138495g() {
        HandlerThread handlerThread = new HandlerThread("Z:ProgressPostFeedHelper");
        this.f127222c = handlerThread;
        handlerThread.start();
        this.f127221b = new a(this.f127222c.getLooper());
    }

    /* renamed from: h */
    private boolean m138496h(int i11) {
        return i11 == 6 || i11 == 5;
    }

    /* renamed from: i */
    private void m138497i(String str, int i11) {
        C23744a.m124114c().m124116d(5050, str, Integer.valueOf(i11));
    }

    /* renamed from: l */
    private void m138498l(b bVar, int i11, long j11) {
        Message message = new Message();
        message.what = i11;
        Bundle bundle = new Bundle();
        if (bVar != null) {
            bundle.putString("feedId", bVar.f127229a);
            bundle.putLong("startTime", bVar.f127230b);
            bundle.putInt("startProgress", bVar.f127231c);
            bundle.putInt("endProgress", bVar.f127232d);
        }
        message.setData(bundle);
        this.f127221b.sendMessageDelayed(message, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m138499n(String str, long j11, int i11, int i12) {
        if (!TextUtils.isEmpty(str) && j11 != -1) {
            synchronized (this.f127223d) {
                try {
                    c cVar = (c) this.f127220a.get(str);
                    long currentTimeMillis = System.currentTimeMillis() - j11;
                    if (cVar != null && cVar.f127234b == 1 && cVar.f127235c < i12) {
                        if (((float) currentTimeMillis) < 7000.0f) {
                            int pow = ((int) ((((float) ((r4 * 10.0f) + ((this.f127226g * 0.5f) * Math.pow(currentTimeMillis, 2.0d)))) * (i12 - i11)) / this.f127227h)) + i11;
                            cVar.f127235c = pow;
                            int max = Math.max(cVar.f127238f, pow);
                            cVar.f127238f = max;
                            m138497i(str, max);
                            b bVar = new b();
                            bVar.f127229a = str;
                            bVar.f127230b = j11;
                            bVar.f127231c = i11;
                            bVar.f127232d = i12;
                            m138498l(bVar, 2, 100L);
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: p */
    private void m138500p(String str, int i11, int i12) {
        c cVar;
        if (!TextUtils.isEmpty(str) && (cVar = (c) this.f127220a.get(str)) != null) {
            cVar.f127234b = i11;
            cVar.f127235c = i12;
            if (!m138496h(i11)) {
                i12 = Math.max(cVar.f127238f, cVar.f127235c);
            }
            cVar.f127238f = i12;
            m138497i(str, i12);
        }
    }

    /* renamed from: q */
    private void m138501q(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f127223d) {
            try {
                c cVar = (c) this.f127220a.get(str);
                if (cVar != null && cVar.f127236d == 17) {
                    cVar.f127237e = true;
                    b bVar = new b();
                    bVar.f127229a = str;
                    bVar.f127230b = System.currentTimeMillis();
                    bVar.f127231c = 10;
                    bVar.f127232d = 30;
                    m138500p(str, 1, 10);
                    m138498l(bVar, 2, 0L);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    private void m138502r(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f127223d) {
            try {
                c cVar = (c) this.f127220a.get(str);
                if (cVar != null) {
                    b bVar = new b();
                    bVar.f127229a = str;
                    bVar.f127230b = System.currentTimeMillis();
                    bVar.f127232d = 90;
                    int i11 = cVar.f127236d;
                    if (i11 != 1) {
                        if (i11 != 2 && i11 != 3) {
                            if (i11 != 6 && i11 != 7) {
                                if (i11 != 17) {
                                    if (i11 != 24) {
                                    }
                                }
                            }
                        }
                        bVar.f127231c = 80;
                        m138500p(str, 3, 80);
                        m138498l(bVar, 1, 0L);
                    }
                    bVar.f127231c = 10;
                    m138500p(str, 3, 10);
                    m138498l(bVar, 1, 0L);
                }
            } finally {
            }
        }
    }

    /* renamed from: s */
    private void m138503s(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f127223d) {
            try {
                c cVar = (c) this.f127220a.get(str);
                if (cVar != null) {
                    int i11 = cVar.f127236d;
                    int i12 = 10;
                    if (i11 != 2 && i11 != 3) {
                        if (i11 == 17) {
                            if (cVar.f127237e) {
                                i12 = 30;
                            }
                            m138500p(str, 2, i12);
                        }
                    } else {
                        m138500p(str, 2, 10);
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m138504t(String str, long j11, int i11, int i12) {
        if (!TextUtils.isEmpty(str) && j11 != -1) {
            synchronized (this.f127223d) {
                try {
                    c cVar = (c) this.f127220a.get(str);
                    long currentTimeMillis = System.currentTimeMillis() - j11;
                    if (cVar != null && cVar.f127234b == 3) {
                        if (cVar.f127235c < i12) {
                            if (((float) currentTimeMillis) < 3000.0f) {
                                int pow = ((int) ((((float) ((r4 * 10.0f) + ((this.f127224e * 0.5f) * Math.pow(currentTimeMillis, 2.0d)))) * (i12 - i11)) / this.f127225f)) + i11;
                                cVar.f127235c = pow;
                                int max = Math.max(cVar.f127238f, pow);
                                cVar.f127238f = max;
                                m138497i(str, max);
                                b bVar = new b();
                                bVar.f127229a = str;
                                bVar.f127230b = j11;
                                bVar.f127231c = i11;
                                bVar.f127232d = i12;
                                m138498l(bVar, 1, 100L);
                            }
                        }
                        m138500p(str, 4, 90);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: v */
    private void m138505v(String str, long j11, int i11) {
        c cVar = (c) this.f127220a.get(str);
        if (cVar != null) {
            int i12 = i11 + ((((int) j11) * (80 - i11)) / 100);
            cVar.f127235c = i12;
            int max = Math.max(cVar.f127238f, i12);
            cVar.f127238f = max;
            m138497i(str, max);
        }
    }

    /* renamed from: c */
    public void m138506c(String str, int i11, int i12) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f127223d) {
            try {
                if (!this.f127220a.containsKey(str)) {
                    c cVar = new c();
                    cVar.f127233a = i11;
                    cVar.f127234b = 0;
                    cVar.f127235c = 10;
                    cVar.f127238f = 10;
                    cVar.f127236d = i12;
                    this.f127220a.put(str, cVar);
                    m138497i(str, cVar.f127238f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public c m138507e(String str) {
        c cVar;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f127223d) {
                cVar = (c) this.f127220a.get(str);
            }
            return cVar;
        }
        return null;
    }

    /* renamed from: j */
    public void m138508j() {
        synchronized (this.f127223d) {
            this.f127220a.clear();
        }
    }

    /* renamed from: k */
    public void m138509k(String str) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f127223d) {
                this.f127220a.remove(str);
            }
        }
    }

    /* renamed from: m */
    public void m138510m(String str, int i11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f127223d) {
            try {
                c cVar = (c) this.f127220a.get(str);
                if (cVar != null) {
                    cVar.f127233a = i11;
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 5) {
                            }
                        } else {
                            m138500p(str, 5, 100);
                        }
                    }
                    m138500p(str, 6, 0);
                }
            } finally {
            }
        }
    }

    /* renamed from: o */
    public void m138511o(int i11, String str) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m138501q(str);
                    return;
                }
                return;
            }
            m138502r(str);
            return;
        }
        m138503s(str);
    }

    /* renamed from: u */
    public void m138512u(String str, long j11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f127223d) {
            try {
                c cVar = (c) this.f127220a.get(str);
                if (cVar != null) {
                    int i11 = cVar.f127236d;
                    int i12 = 10;
                    if (i11 != 2 && i11 != 3) {
                        if (i11 == 17) {
                            if (cVar.f127237e) {
                                i12 = 30;
                            }
                            m138505v(str, j11, i12);
                        }
                    } else {
                        m138505v(str, j11, 10);
                    }
                }
            } finally {
            }
        }
    }
}
