package p705z5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z5.kb */
/* loaded from: classes2.dex */
public final class C31447kb extends AbstractC31531qb {

    /* renamed from: a */
    private String f144882a;

    /* renamed from: b */
    private boolean f144883b;

    /* renamed from: c */
    private int f144884c;

    /* renamed from: d */
    private byte f144885d;

    @Override // p705z5.AbstractC31531qb
    /* renamed from: a */
    public final AbstractC31531qb mo152281a(boolean z11) {
        this.f144883b = true;
        this.f144885d = (byte) (1 | this.f144885d);
        return this;
    }

    @Override // p705z5.AbstractC31531qb
    /* renamed from: b */
    public final AbstractC31531qb mo152282b(int i11) {
        this.f144884c = 1;
        this.f144885d = (byte) (this.f144885d | 2);
        return this;
    }

    @Override // p705z5.AbstractC31531qb
    /* renamed from: c */
    public final AbstractC31545rb mo152283c() {
        String str;
        if (this.f144885d == 3 && (str = this.f144882a) != null) {
            return new C31489nb(str, this.f144883b, this.f144884c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f144882a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f144885d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f144885d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    /* renamed from: d */
    public final AbstractC31531qb m152284d(String str) {
        this.f144882a = "vision-common";
        return this;
    }
}
