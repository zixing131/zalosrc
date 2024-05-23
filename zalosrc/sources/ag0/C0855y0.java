package ag0;

import java.util.HashMap;

/* renamed from: ag0.y0 */
/* loaded from: classes6.dex */
public class C0855y0 {

    /* renamed from: a */
    private HashMap f3105a;

    /* renamed from: b */
    private HashMap f3106b;

    public C0855y0() {
        this.f3105a = null;
        this.f3106b = null;
        this.f3105a = new HashMap();
        this.f3106b = new HashMap();
    }

    /* renamed from: a */
    public void m2383a() {
        HashMap hashMap = this.f3105a;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap hashMap2 = this.f3106b;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
    }

    /* renamed from: b */
    public HashMap m2384b() {
        return new HashMap(this.f3106b);
    }

    /* renamed from: c */
    public HashMap m2385c() {
        return new HashMap(this.f3105a);
    }

    /* renamed from: d */
    public void m2386d(HashMap hashMap) {
        this.f3105a = new HashMap(hashMap);
    }

    /* renamed from: e */
    public void m2387e(HashMap hashMap) {
        this.f3106b = new HashMap(hashMap);
    }
}
