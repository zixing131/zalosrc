package p587vv;

import android.net.Uri;
import com.zing.zalo.media.server.C9026a;
import mm0.AbstractC23350e;

/* renamed from: vv.a */
/* loaded from: classes4.dex */
public class C28631a {

    /* renamed from: c */
    private static final String f132730c = "a";

    /* renamed from: d */
    private static C28631a f132731d;

    /* renamed from: a */
    private C9026a f132732a;

    /* renamed from: b */
    private int f132733b;

    C28631a() {
        this.f132733b = 0;
        this.f132733b = m143199f();
    }

    /* renamed from: b */
    private Uri m143195b(String str, int i11) {
        return Uri.parse("http://127.0.0.1:" + i11 + "/video?downloadId=" + str);
    }

    /* renamed from: c */
    public static C28631a m143196c() {
        synchronized (C28631a.class) {
            try {
                if (f132731d == null) {
                    f132731d = new C28631a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f132731d;
    }

    /* renamed from: d */
    public static boolean m143197d() {
        boolean z11;
        synchronized (C28631a.class) {
            if (f132731d == null) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    /* renamed from: e */
    public static void m143198e() {
        synchronized (C28631a.class) {
            try {
                C28631a c28631a = f132731d;
                if (c28631a != null) {
                    c28631a.m143200g();
                    f132731d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    private int m143199f() {
        m143200g();
        for (int i11 = 8670; i11 < 8770; i11++) {
            try {
                this.f132732a = new C9026a(i11);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Successfully created media server on port ");
                sb2.append(i11);
                this.f132732a.m48186o();
                return i11;
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f132730c, e11);
            }
        }
        return 0;
    }

    /* renamed from: g */
    private void m143200g() {
        if (this.f132732a != null) {
            this.f132732a.m48187p();
            this.f132732a = null;
        }
    }

    /* renamed from: a */
    public Uri m143201a(String str) {
        return m143195b(str, this.f132733b);
    }
}
