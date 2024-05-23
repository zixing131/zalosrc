package p361nb;

import android.text.TextUtils;

/* renamed from: nb.g */
/* loaded from: classes3.dex */
public class C23650g {

    /* renamed from: a */
    private String f114579a;

    /* renamed from: b */
    private String f114580b;

    /* renamed from: c */
    private int f114581c;

    /* renamed from: d */
    private int f114582d;

    /* renamed from: e */
    private int f114583e;

    /* renamed from: f */
    private int f114584f;

    /* renamed from: g */
    private int f114585g;

    /* renamed from: h */
    private String f114586h;

    public C23650g(String str, String str2) {
        this.f114579a = str;
        this.f114580b = str2;
    }

    /* renamed from: a */
    public String m123945a() {
        return this.f114579a;
    }

    /* renamed from: b */
    public int m123946b() {
        return this.f114583e;
    }

    /* renamed from: c */
    public int m123947c() {
        return this.f114582d;
    }

    /* renamed from: d */
    public int m123948d() {
        return this.f114585g;
    }

    /* renamed from: e */
    public int m123949e() {
        return this.f114584f;
    }

    /* renamed from: f */
    public String m123950f() {
        return this.f114586h;
    }

    /* renamed from: g */
    public String m123951g() {
        return this.f114580b;
    }

    /* renamed from: h */
    public int m123952h() {
        return this.f114581c;
    }

    /* renamed from: i */
    public void m123953i(int i11) {
        this.f114583e = i11;
    }

    /* renamed from: j */
    public void m123954j(int i11) {
        this.f114582d = i11;
    }

    /* renamed from: k */
    public void m123955k(int i11) {
        this.f114585g = i11;
    }

    /* renamed from: l */
    public void m123956l(int i11) {
        this.f114584f = i11;
    }

    /* renamed from: m */
    public void m123957m(String str) {
        this.f114586h = str;
    }

    /* renamed from: n */
    public void m123958n(int i11) {
        this.f114581c = i11;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f114579a);
        sb2.append(" ");
        if (TextUtils.isEmpty(this.f114580b)) {
            str = "null";
        } else {
            str = this.f114580b;
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f114581c);
        sb2.append(" ");
        sb2.append(this.f114582d);
        sb2.append(" ");
        sb2.append(this.f114583e);
        sb2.append(" ");
        sb2.append(this.f114584f);
        sb2.append(" ");
        sb2.append(this.f114585g);
        sb2.append(" ");
        sb2.append(this.f114586h);
        return sb2.toString();
    }
}
