package p670y5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y5.yf */
/* loaded from: classes2.dex */
public final class C30769yf extends AbstractC30390eg {

    /* renamed from: a */
    private String f142068a;

    /* renamed from: b */
    private boolean f142069b;

    /* renamed from: c */
    private int f142070c;

    /* renamed from: d */
    private byte f142071d;

    @Override // p670y5.AbstractC30390eg
    /* renamed from: a */
    public final AbstractC30390eg mo149497a(boolean z11) {
        this.f142069b = true;
        this.f142071d = (byte) (1 | this.f142071d);
        return this;
    }

    @Override // p670y5.AbstractC30390eg
    /* renamed from: b */
    public final AbstractC30390eg mo149498b(int i11) {
        this.f142070c = 1;
        this.f142071d = (byte) (this.f142071d | 2);
        return this;
    }

    @Override // p670y5.AbstractC30390eg
    /* renamed from: c */
    public final AbstractC30409fg mo149499c() {
        String str;
        if (this.f142071d == 3 && (str = this.f142068a) != null) {
            return new C30313ag(str, this.f142069b, this.f142070c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f142068a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f142071d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f142071d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    /* renamed from: d */
    public final AbstractC30390eg m149734d(String str) {
        this.f142068a = str;
        return this;
    }
}
