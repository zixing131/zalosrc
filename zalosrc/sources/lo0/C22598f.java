package lo0;

/* renamed from: lo0.f */
/* loaded from: classes7.dex */
public class C22598f {

    /* renamed from: a */
    public boolean f110659a = false;

    /* renamed from: b */
    public boolean f110660b = false;

    /* renamed from: c */
    public boolean f110661c = false;

    /* renamed from: d */
    public boolean f110662d = true;

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C22598f.class) {
            C22598f c22598f = (C22598f) obj;
            if (c22598f.f110661c == this.f110661c && c22598f.f110659a == this.f110659a && c22598f.f110660b == this.f110660b && c22598f.f110662d == this.f110662d) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.f110659a;
        boolean z12 = z11;
        if (this.f110660b) {
            z12 = (z11 ? 1 : 0) | 2;
        }
        ?? r02 = z12;
        if (this.f110661c) {
            r02 = (z12 ? 1 : 0) | 4;
        }
        return this.f110662d ? r02 | 8 : r02;
    }
}
