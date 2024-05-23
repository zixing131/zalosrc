package vg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* renamed from: vg.m2 */
/* loaded from: classes3.dex */
public abstract class AbstractC28127m2 {

    /* renamed from: a */
    public final String f131145a;

    /* renamed from: b */
    public String f131146b;

    /* renamed from: c */
    public final String f131147c;

    /* renamed from: d */
    long f131148d = System.currentTimeMillis();

    /* renamed from: vg.m2$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: b */
        static a f131149b;

        /* renamed from: a */
        final Map f131150a = new HashMap();

        /* renamed from: d */
        public static a m141609d() {
            if (f131149b == null) {
                f131149b = new a();
            }
            return f131149b;
        }

        /* renamed from: a */
        public void m141610a(String str, AbstractC28127m2 abstractC28127m2) {
            m141611b();
            this.f131150a.put(str, abstractC28127m2);
        }

        /* renamed from: b */
        void m141611b() {
            try {
                long currentTimeMillis = System.currentTimeMillis() - 300000;
                Iterator it = this.f131150a.values().iterator();
                while (it.hasNext()) {
                    if (((AbstractC28127m2) it.next()).f131148d < currentTimeMillis) {
                        it.remove();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: c */
        public String m141612c() {
            return UUID.randomUUID().toString();
        }

        /* renamed from: e */
        public AbstractC28127m2 m141613e(String str) {
            return (AbstractC28127m2) this.f131150a.get(str);
        }

        /* renamed from: f */
        public AbstractC28127m2 m141614f(String str) {
            return (AbstractC28127m2) this.f131150a.remove(str);
        }

        /* renamed from: g */
        public void m141615g(String str) {
            this.f131150a.remove(str);
            m141611b();
        }
    }

    public AbstractC28127m2(String str, String str2, String str3) {
        this.f131145a = str;
        this.f131146b = str2;
        this.f131147c = str3;
    }
}
