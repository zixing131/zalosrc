package zw;

import mx.AbstractC23477n;

/* renamed from: zw.j */
/* loaded from: classes4.dex */
public class C32570j extends AbstractC32562b {

    /* renamed from: f */
    private String f150538f;

    /* renamed from: g */
    private int f150539g;

    /* renamed from: h */
    private String f150540h = "";

    /* renamed from: i */
    private long f150541i;

    /* renamed from: j */
    private long f150542j;

    /* renamed from: k */
    private boolean f150543k;

    /* renamed from: l */
    private String f150544l;

    /* renamed from: h */
    public static C32570j m157705h(long j11, int i11, String str, long j12, long j13, String str2, int i12, String str3, boolean z11, String str4) {
        C32570j c32570j = new C32570j();
        c32570j.m157708k(str3);
        c32570j.m157674e(j11);
        c32570j.m157712o(i11);
        c32570j.m157707j(AbstractC23477n.m123260h(str));
        c32570j.m157710m(j12);
        c32570j.m157709l(j13);
        c32570j.m157675f(i12);
        c32570j.m157676g(str2);
        c32570j.m157706i(z11);
        c32570j.m157711n(str4);
        return c32570j;
    }

    /* renamed from: i */
    public void m157706i(boolean z11) {
        this.f150543k = z11;
    }

    /* renamed from: j */
    public void m157707j(String str) {
        this.f150540h = AbstractC23477n.m123260h(str);
    }

    /* renamed from: k */
    public void m157708k(String str) {
        this.f150538f = str;
    }

    /* renamed from: l */
    public void m157709l(long j11) {
        this.f150542j = j11;
    }

    /* renamed from: m */
    public void m157710m(long j11) {
        this.f150541i = j11;
    }

    /* renamed from: n */
    public void m157711n(String str) {
        this.f150544l = str;
    }

    /* renamed from: o */
    public void m157712o(int i11) {
        this.f150539g = i11;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f150538f);
        sb2.append("\t");
        sb2.append(this.f150496a);
        sb2.append("\t");
        sb2.append(this.f150497b);
        sb2.append("\t");
        sb2.append(this.f150498c);
        sb2.append("\t");
        sb2.append(this.f150539g);
        sb2.append("\t");
        sb2.append(this.f150540h);
        sb2.append("\t");
        sb2.append(this.f150541i);
        sb2.append("\t");
        sb2.append(this.f150542j);
        sb2.append("\t");
        if (this.f150543k) {
            str = "1";
        } else {
            str = "0";
        }
        sb2.append(str);
        sb2.append("\t");
        String str2 = this.f150544l;
        if (str2 == null) {
            str2 = "-";
        }
        sb2.append(str2);
        sb2.append("\n");
        return sb2.toString();
    }
}
