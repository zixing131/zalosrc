package p458qr;

import android.util.LruCache;

/* renamed from: qr.d */
/* loaded from: classes4.dex */
public class C25471d {

    /* renamed from: c */
    private static volatile C25471d f122052c;

    /* renamed from: b */
    private final LruCache f122054b = new LruCache(10);

    /* renamed from: a */
    private int f122053a = 0;

    private C25471d() {
    }

    /* renamed from: c */
    public static C25471d m131951c() {
        if (f122052c == null) {
            synchronized (C25471d.class) {
                try {
                    if (f122052c == null) {
                        f122052c = new C25471d();
                    }
                } finally {
                }
            }
        }
        return f122052c;
    }

    /* renamed from: d */
    private void m131952d(String str) {
    }

    /* renamed from: a */
    public int m131953a(C25470c c25470c) {
        int i11;
        synchronized (this.f122054b) {
            this.f122053a++;
            m131952d("addToStore: " + this.f122053a);
            this.f122054b.put(Integer.valueOf(this.f122053a), c25470c);
            i11 = this.f122053a;
        }
        return i11;
    }

    /* renamed from: b */
    public C25470c m131954b(int i11) {
        C25470c c25470c;
        m131952d("getFromStore: " + i11);
        synchronized (this.f122054b) {
            c25470c = (C25470c) this.f122054b.get(Integer.valueOf(i11));
        }
        return c25470c;
    }
}
