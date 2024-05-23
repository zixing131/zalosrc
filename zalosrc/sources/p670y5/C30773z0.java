package p670y5;

import java.io.Serializable;

/* renamed from: y5.z0 */
/* loaded from: classes2.dex */
final class C30773z0 extends AbstractC30393f0 implements Serializable {

    /* renamed from: p */
    final Object f142073p;

    /* renamed from: q */
    final Object f142074q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30773z0(Object obj, Object obj2) {
        this.f142073p = obj;
        this.f142074q = obj2;
    }

    @Override // p670y5.AbstractC30393f0, java.util.Map.Entry
    public final Object getKey() {
        return this.f142073p;
    }

    @Override // p670y5.AbstractC30393f0, java.util.Map.Entry
    public final Object getValue() {
        return this.f142074q;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
