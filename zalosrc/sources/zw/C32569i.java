package zw;

import mx.AbstractC23477n;

/* renamed from: zw.i */
/* loaded from: classes4.dex */
public class C32569i extends AbstractC32562b {

    /* renamed from: f */
    private long f150531f;

    /* renamed from: g */
    private int f150532g;

    /* renamed from: h */
    private String f150533h = "";

    /* renamed from: i */
    private byte f150534i;

    /* renamed from: j */
    private byte f150535j;

    /* renamed from: k */
    private int f150536k;

    /* renamed from: l */
    private int f150537l;

    /* renamed from: h */
    public static C32569i m157697h(long j11, long j12, String str, int i11, int i12, String str2, byte b11, int i13, byte b12, C32561a c32561a, int i14, int i15) {
        C32569i c32569i = new C32569i();
        c32569i.m157674e(j11);
        c32569i.m157675f(i12);
        c32569i.m157702m(j12);
        c32569i.m157703n(i14);
        c32569i.m157700k(i15);
        if (str.endsWith("|")) {
            str = str.substring(0, str.length() - 1);
        }
        c32569i.m157701l(AbstractC23477n.m123260h(str));
        c32569i.m157704o(i11);
        c32569i.m157676g(str2);
        c32569i.m157698i(b11);
        c32569i.m157672c(i13);
        c32569i.m157699j(b12);
        if (c32561a != null) {
            c32569i.m157673d(c32561a);
        }
        return c32569i;
    }

    /* renamed from: i */
    public void m157698i(byte b11) {
        this.f150534i = b11;
    }

    /* renamed from: j */
    public void m157699j(byte b11) {
        this.f150535j = b11;
    }

    /* renamed from: k */
    public void m157700k(int i11) {
        this.f150537l = i11;
    }

    /* renamed from: l */
    public void m157701l(String str) {
        this.f150533h = AbstractC23477n.m123260h(str);
    }

    /* renamed from: m */
    public void m157702m(long j11) {
        this.f150531f = j11;
    }

    /* renamed from: n */
    public void m157703n(int i11) {
        this.f150536k = i11;
    }

    /* renamed from: o */
    public void m157704o(int i11) {
        this.f150532g = i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f150496a);
        sb2.append("\t");
        sb2.append(this.f150497b);
        sb2.append("\t");
        sb2.append(this.f150498c);
        sb2.append("\t");
        sb2.append(this.f150531f);
        sb2.append("\t");
        sb2.append(this.f150533h);
        sb2.append("\t");
        sb2.append(this.f150532g);
        sb2.append("\t");
        sb2.append((int) this.f150534i);
        sb2.append("\t");
        sb2.append(this.f150499d);
        sb2.append("\t");
        sb2.append((int) this.f150535j);
        if (this.f150500e != null) {
            sb2.append("\t");
            sb2.append(this.f150500e.f150491a);
            sb2.append("\t");
            sb2.append(this.f150500e.f150492b);
            sb2.append("\t");
            sb2.append(this.f150500e.f150493c);
            sb2.append("\t");
            sb2.append(this.f150500e.f150494d);
            sb2.append("\t");
            sb2.append(this.f150500e.f150495e);
        }
        sb2.append("\t");
        sb2.append(this.f150536k);
        sb2.append("\t");
        sb2.append(this.f150537l);
        sb2.append("\n");
        return sb2.toString();
    }
}
