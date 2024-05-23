package p012a6;

import java.io.Serializable;

/* renamed from: a6.l0 */
/* loaded from: classes2.dex */
final class C0354l0 extends AbstractC0448q implements Serializable {

    /* renamed from: p */
    final Object f1576p;

    /* renamed from: q */
    final Object f1577q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0354l0(Object obj, Object obj2) {
        this.f1576p = obj;
        this.f1577q = obj2;
    }

    @Override // p012a6.AbstractC0448q, java.util.Map.Entry
    public final Object getKey() {
        return this.f1576p;
    }

    @Override // p012a6.AbstractC0448q, java.util.Map.Entry
    public final Object getValue() {
        return this.f1577q;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
