package zw;

import android.text.TextUtils;
import mx.AbstractC23477n;

/* renamed from: zw.c */
/* loaded from: classes4.dex */
public class C32563c extends AbstractC32562b {

    /* renamed from: f */
    private byte f150501f;

    /* renamed from: g */
    private byte f150502g;

    /* renamed from: h */
    private String f150503h;

    /* renamed from: i */
    private String f150504i;

    /* renamed from: j */
    private long f150505j;

    public C32563c(byte b11, byte b12, String str, String str2, long j11, long j12, String str3, int i11) {
        this.f150501f = b11;
        this.f150502g = b12;
        this.f150503h = str;
        this.f150504i = AbstractC23477n.m123260h(str2);
        this.f150496a = j11;
        this.f150505j = j12;
        this.f150498c = str3;
        this.f150497b = i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f150496a);
        sb2.append("\t");
        sb2.append(this.f150497b);
        sb2.append("\t");
        sb2.append(this.f150498c);
        sb2.append("\t");
        sb2.append((int) this.f150501f);
        sb2.append("\t");
        sb2.append((int) this.f150502g);
        sb2.append("\t");
        sb2.append(this.f150503h);
        if (!TextUtils.isEmpty(this.f150504i)) {
            sb2.append("\t");
            sb2.append(this.f150504i);
        }
        sb2.append("\t");
        sb2.append(this.f150505j);
        sb2.append("\n");
        return sb2.toString();
    }
}
