package b10;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;

/* renamed from: b10.b */
/* loaded from: classes5.dex */
public final class C2483b {

    /* renamed from: a */
    private final Integer f10134a;

    /* renamed from: b */
    private final String f10135b;

    /* renamed from: c */
    private final String f10136c;

    /* renamed from: d */
    private final String f10137d;

    /* renamed from: e */
    private final InterfaceC18494a f10138e;

    public C2483b(Integer num, String str, String str2, String str3, InterfaceC18494a interfaceC18494a) {
        this.f10134a = num;
        this.f10135b = str;
        this.f10136c = str2;
        this.f10137d = str3;
        this.f10138e = interfaceC18494a;
    }

    /* renamed from: a */
    public final InterfaceC18494a m12543a() {
        return this.f10138e;
    }

    /* renamed from: b */
    public final String m12544b() {
        return this.f10137d;
    }

    /* renamed from: c */
    public final Integer m12545c() {
        return this.f10134a;
    }

    /* renamed from: d */
    public final String m12546d() {
        return this.f10136c;
    }

    /* renamed from: e */
    public final String m12547e() {
        return this.f10135b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2483b)) {
            return false;
        }
        C2483b c2483b = (C2483b) obj;
        return AbstractC19074t.m100204b(this.f10134a, c2483b.f10134a) && AbstractC19074t.m100204b(this.f10135b, c2483b.f10135b) && AbstractC19074t.m100204b(this.f10136c, c2483b.f10136c) && AbstractC19074t.m100204b(this.f10137d, c2483b.f10137d) && AbstractC19074t.m100204b(this.f10138e, c2483b.f10138e);
    }

    /* renamed from: f */
    public final boolean m12548f() {
        String str;
        String str2;
        String str3;
        if (this.f10134a != null) {
            return false;
        }
        String str4 = this.f10137d;
        if (str4 != null && str4.length() != 0) {
            return false;
        }
        String str5 = this.f10136c;
        if ((str5 == null || str5.length() == 0 || ((str3 = this.f10135b) != null && str3.length() != 0)) && (((str = this.f10136c) != null && str.length() != 0) || (str2 = this.f10135b) == null || str2.length() == 0)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.f10134a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10135b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10136c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10137d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InterfaceC18494a interfaceC18494a = this.f10138e;
        return hashCode4 + (interfaceC18494a != null ? interfaceC18494a.hashCode() : 0);
    }

    public String toString() {
        return "InformComment(iconRes=" + this.f10134a + ", title=" + this.f10135b + ", message=" + this.f10136c + ", actionSrc=" + this.f10137d + ", actionOpt=" + this.f10138e + ")";
    }
}
