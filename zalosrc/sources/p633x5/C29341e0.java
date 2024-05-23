package p633x5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x5.e0 */
/* loaded from: classes2.dex */
public final class C29341e0 extends AbstractC29349i0 {

    /* renamed from: a */
    private String f135816a;

    /* renamed from: b */
    private boolean f135817b;

    /* renamed from: c */
    private int f135818c;

    /* renamed from: d */
    private byte f135819d;

    @Override // p633x5.AbstractC29349i0
    /* renamed from: a */
    public final AbstractC29349i0 mo146479a(boolean z11) {
        this.f135817b = true;
        this.f135819d = (byte) (1 | this.f135819d);
        return this;
    }

    @Override // p633x5.AbstractC29349i0
    /* renamed from: b */
    public final AbstractC29349i0 mo146480b(int i11) {
        this.f135818c = 1;
        this.f135819d = (byte) (this.f135819d | 2);
        return this;
    }

    @Override // p633x5.AbstractC29349i0
    /* renamed from: c */
    public final AbstractC29351j0 mo146481c() {
        String str;
        if (this.f135819d == 3 && (str = this.f135816a) != null) {
            return new C29345g0(str, this.f135817b, this.f135818c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f135816a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f135819d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f135819d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    /* renamed from: d */
    public final AbstractC29349i0 m146482d(String str) {
        this.f135816a = "common";
        return this;
    }
}
