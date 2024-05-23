package bo;

import android.text.TextUtils;
import ik0.InterfaceC20578a0;
import lk0.InterfaceC22508f;

/* renamed from: bo.x1 */
/* loaded from: classes4.dex */
public class C3056x1 {

    /* renamed from: a */
    public String f12354a;

    /* renamed from: b */
    public int f12355b;

    /* renamed from: c */
    public int f12356c;

    /* renamed from: d */
    public C2952b2 f12357d;

    /* renamed from: e */
    public C3052w1 f12358e;

    /* renamed from: a */
    public static String m14695a(String str, int i11) {
        if (!TextUtils.isEmpty(str)) {
            return str + i11;
        }
        return "";
    }

    /* renamed from: b */
    public String m14696b() {
        return m14695a(this.f12354a, this.f12356c);
    }

    /* renamed from: c */
    public InterfaceC22508f m14697c() {
        C3052w1 c3052w1;
        int i11 = this.f12356c;
        if (i11 == 0) {
            C2952b2 c2952b2 = this.f12357d;
            if (c2952b2 == null) {
                return null;
            }
            return c2952b2.m13978h();
        }
        if (i11 != 1 || (c3052w1 = this.f12358e) == null) {
            return null;
        }
        return c3052w1.m14639a();
    }

    /* renamed from: d */
    public String m14698d() {
        InterfaceC22508f m14701g = m14701g();
        if (m14701g != null) {
            return m14701g.getZinstantDataId();
        }
        return "";
    }

    /* renamed from: e */
    public String m14699e() {
        InterfaceC22508f m14697c = m14697c();
        if (m14697c != null) {
            return m14697c.getZinstantDataId();
        }
        return "";
    }

    /* renamed from: f */
    public InterfaceC20578a0 m14700f() {
        C2952b2 c2952b2 = this.f12357d;
        if (c2952b2 != null) {
            return c2952b2.f11651e;
        }
        return null;
    }

    /* renamed from: g */
    public InterfaceC22508f m14701g() {
        C2952b2 c2952b2 = this.f12357d;
        if (c2952b2 != null) {
            return c2952b2.m13980j();
        }
        return null;
    }

    /* renamed from: h */
    public boolean m14702h() {
        return this.f12355b == 0;
    }

    /* renamed from: i */
    public boolean m14703i() {
        C3052w1 c3052w1;
        int i11 = this.f12356c;
        if (i11 == 0) {
            C2952b2 c2952b2 = this.f12357d;
            if (c2952b2 == null || !c2952b2.m13982l()) {
                return false;
            }
            return true;
        }
        if (i11 != 1 || (c3052w1 = this.f12358e) == null || !c3052w1.m14641c()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void m14704j(InterfaceC20578a0 interfaceC20578a0) {
        C2952b2 c2952b2 = this.f12357d;
        if (c2952b2 != null) {
            c2952b2.m13983m(interfaceC20578a0);
        }
    }
}
