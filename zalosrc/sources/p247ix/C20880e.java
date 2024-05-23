package p247ix;

import com.zing.zalocore.CoreUtility;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ix.e */
/* loaded from: classes4.dex */
public class C20880e {

    /* renamed from: a */
    boolean f102572a;

    /* renamed from: b */
    int f102573b;

    /* renamed from: c */
    boolean f102574c;

    /* renamed from: d */
    String f102575d;

    /* renamed from: e */
    long f102576e = 0;

    /* renamed from: f */
    long f102577f = 0;

    public C20880e(boolean z11, int i11, boolean z12, String str) {
        this.f102572a = z11;
        this.f102573b = i11;
        this.f102574c = z12;
        this.f102575d = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        sb2.append("\t");
        sb2.append(15);
        sb2.append("\t");
        sb2.append(CoreUtility.f89233i);
        sb2.append("\t");
        sb2.append(!this.f102572a ? 1 : 0);
        sb2.append("\t");
        sb2.append(this.f102573b);
        sb2.append("\t");
        sb2.append(this.f102575d);
        sb2.append("\t");
        sb2.append(this.f102574c ? 1 : 0);
        if (this.f102574c) {
            sb2.append("\t");
            sb2.append(this.f102576e);
            sb2.append("\t");
            sb2.append(this.f102577f);
        }
        return sb2.toString();
    }
}
