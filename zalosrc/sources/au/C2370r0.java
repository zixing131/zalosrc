package au;

import java.lang.ref.WeakReference;

/* renamed from: au.r0 */
/* loaded from: classes4.dex */
public class C2370r0 {

    /* renamed from: a */
    private WeakReference f9915a;

    public C2370r0(Object obj) {
        this.f9915a = new WeakReference(obj);
    }

    /* renamed from: a */
    public Object m12394a() {
        WeakReference weakReference = this.f9915a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public void m12395b(Object obj) {
        this.f9915a = new WeakReference(obj);
    }
}
