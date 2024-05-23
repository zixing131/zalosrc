package p467r;

import p562v.AbstractC27392e;

/* renamed from: r.j */
/* loaded from: classes2.dex */
public class C25587j {

    /* renamed from: a */
    private final String f122313a;

    /* renamed from: b */
    private final String f122314b;

    private C25587j(String str, String str2) {
        this.f122313a = str;
        this.f122314b = str2;
    }

    /* renamed from: b */
    public static C25587j m132153b(String str, String str2) {
        AbstractC27392e.m140338d(str, "Name is null or empty");
        AbstractC27392e.m140338d(str2, "Version is null or empty");
        return new C25587j(str, str2);
    }

    /* renamed from: a */
    public String m132154a() {
        return this.f122313a;
    }

    /* renamed from: c */
    public String m132155c() {
        return this.f122314b;
    }
}
