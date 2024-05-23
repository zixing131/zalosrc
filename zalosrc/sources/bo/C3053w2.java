package bo;

import p348mi.C23307g;

/* renamed from: bo.w2 */
/* loaded from: classes4.dex */
public class C3053w2 {

    /* renamed from: a */
    public long f12306a;

    /* renamed from: b */
    public C23307g f12307b;

    public C3053w2(long j11, C23307g c23307g) {
        this.f12306a = j11;
        this.f12307b = c23307g;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Server: ");
        sb2.append(this.f12306a);
        sb2.append("  ");
        if (this.f12307b == null) {
            str = "NULL";
        } else {
            str = this.f12307b.f113474a + " " + this.f12307b.f113475b;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
