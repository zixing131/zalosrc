package p012a6;

import java.util.Map;

/* renamed from: a6.d0 */
/* loaded from: classes2.dex */
final class C0202d0 extends AbstractC0448q {

    /* renamed from: p */
    private final Object f963p;

    /* renamed from: q */
    private int f964q;

    /* renamed from: r */
    final /* synthetic */ C0240f0 f965r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0202d0(C0240f0 c0240f0, int i11) {
        this.f965r = c0240f0;
        Object[] objArr = c0240f0.f1111r;
        objArr.getClass();
        this.f963p = objArr[i11];
        this.f964q = i11;
    }

    /* renamed from: a */
    private final void m655a() {
        int m704t;
        int i11 = this.f964q;
        if (i11 != -1 && i11 < this.f965r.size()) {
            Object obj = this.f963p;
            C0240f0 c0240f0 = this.f965r;
            int i12 = this.f964q;
            Object[] objArr = c0240f0.f1111r;
            objArr.getClass();
            if (AbstractC0466qh.m859a(obj, objArr[i12])) {
                return;
            }
        }
        m704t = this.f965r.m704t(this.f963p);
        this.f964q = m704t;
    }

    @Override // p012a6.AbstractC0448q, java.util.Map.Entry
    public final Object getKey() {
        return this.f963p;
    }

    @Override // p012a6.AbstractC0448q, java.util.Map.Entry
    public final Object getValue() {
        Map m710k = this.f965r.m710k();
        if (m710k != null) {
            return m710k.get(this.f963p);
        }
        m655a();
        int i11 = this.f964q;
        if (i11 == -1) {
            return null;
        }
        Object[] objArr = this.f965r.f1112s;
        objArr.getClass();
        return objArr[i11];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map m710k = this.f965r.m710k();
        if (m710k != null) {
            return m710k.put(this.f963p, obj);
        }
        m655a();
        int i11 = this.f964q;
        if (i11 == -1) {
            this.f965r.put(this.f963p, obj);
            return null;
        }
        Object[] objArr = this.f965r.f1112s;
        objArr.getClass();
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }
}
