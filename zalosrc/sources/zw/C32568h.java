package zw;

import android.text.TextUtils;
import mx.AbstractC23477n;

/* renamed from: zw.h */
/* loaded from: classes4.dex */
public class C32568h extends AbstractC32562b {

    /* renamed from: f */
    private String f150524f = "";

    /* renamed from: g */
    private int f150525g;

    /* renamed from: h */
    private int f150526h;

    /* renamed from: i */
    private int f150527i;

    /* renamed from: j */
    private byte f150528j;

    /* renamed from: k */
    private String f150529k;

    /* renamed from: l */
    private byte f150530l;

    /* renamed from: h */
    public static C32568h m157689h(long j11, int i11, int i12, String str, int i13, int i14, int i15, byte b11, String str2, String str3, byte b12) {
        C32568h c32568h = new C32568h();
        c32568h.m157674e(j11);
        c32568h.m157692k(AbstractC23477n.m123260h(str));
        c32568h.m157696o(i11);
        c32568h.m157695n(i12);
        c32568h.m157694m(i13);
        c32568h.m157672c(i14);
        c32568h.m157675f(i15);
        c32568h.m157690i(b11);
        c32568h.m157676g(str2);
        c32568h.m157693l(AbstractC23477n.m123260h(str3));
        c32568h.m157691j(b12);
        return c32568h;
    }

    /* renamed from: i */
    public void m157690i(byte b11) {
        this.f150528j = b11;
    }

    /* renamed from: j */
    public void m157691j(byte b11) {
        this.f150530l = b11;
    }

    /* renamed from: k */
    public void m157692k(String str) {
        this.f150524f = AbstractC23477n.m123260h(str);
    }

    /* renamed from: l */
    public void m157693l(String str) {
        this.f150529k = AbstractC23477n.m123260h(str);
    }

    /* renamed from: m */
    public void m157694m(int i11) {
        this.f150527i = i11;
    }

    /* renamed from: n */
    public void m157695n(int i11) {
        this.f150526h = i11;
    }

    /* renamed from: o */
    public void m157696o(int i11) {
        this.f150525g = i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f150496a);
        sb2.append("\t");
        sb2.append(this.f150497b);
        sb2.append("\t");
        sb2.append(this.f150498c);
        sb2.append("\t");
        sb2.append(this.f150524f);
        sb2.append("\t");
        sb2.append(this.f150525g);
        sb2.append("\t");
        sb2.append(this.f150526h);
        sb2.append("\t");
        sb2.append(this.f150527i);
        sb2.append("\t");
        sb2.append(this.f150499d);
        sb2.append("\t");
        sb2.append((int) this.f150528j);
        if (!TextUtils.isEmpty(this.f150529k)) {
            sb2.append("\t");
            sb2.append(this.f150529k);
        } else {
            sb2.append("\t");
            sb2.append("-");
        }
        sb2.append("\t");
        sb2.append((int) this.f150530l);
        sb2.append("\n");
        return sb2.toString();
    }
}
