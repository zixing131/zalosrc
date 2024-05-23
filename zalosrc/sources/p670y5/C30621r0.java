package p670y5;

import java.util.Map;

/* renamed from: y5.r0 */
/* loaded from: classes2.dex */
final class C30621r0 extends AbstractC30393f0 {

    /* renamed from: p */
    private final Object f141704p;

    /* renamed from: q */
    private int f141705q;

    /* renamed from: r */
    final /* synthetic */ C30659t0 f141706r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30621r0(C30659t0 c30659t0, int i11) {
        this.f141706r = c30659t0;
        Object[] objArr = c30659t0.f141809r;
        objArr.getClass();
        this.f141704p = objArr[i11];
        this.f141705q = i11;
    }

    /* renamed from: a */
    private final void m149615a() {
        int m149640t;
        int i11 = this.f141705q;
        if (i11 != -1 && i11 < this.f141706r.size()) {
            Object obj = this.f141704p;
            C30659t0 c30659t0 = this.f141706r;
            int i12 = this.f141705q;
            Object[] objArr = c30659t0.f141809r;
            objArr.getClass();
            if (AbstractC30506l.m149562a(obj, objArr[i12])) {
                return;
            }
        }
        m149640t = this.f141706r.m149640t(this.f141704p);
        this.f141705q = m149640t;
    }

    @Override // p670y5.AbstractC30393f0, java.util.Map.Entry
    public final Object getKey() {
        return this.f141704p;
    }

    @Override // p670y5.AbstractC30393f0, java.util.Map.Entry
    public final Object getValue() {
        Map m149646k = this.f141706r.m149646k();
        if (m149646k != null) {
            return m149646k.get(this.f141704p);
        }
        m149615a();
        int i11 = this.f141705q;
        if (i11 == -1) {
            return null;
        }
        Object[] objArr = this.f141706r.f141810s;
        objArr.getClass();
        return objArr[i11];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map m149646k = this.f141706r.m149646k();
        if (m149646k != null) {
            return m149646k.put(this.f141704p, obj);
        }
        m149615a();
        int i11 = this.f141705q;
        if (i11 == -1) {
            this.f141706r.put(this.f141704p, obj);
            return null;
        }
        Object[] objArr = this.f141706r.f141810s;
        objArr.getClass();
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }
}
