package bo;

import java.util.List;

/* renamed from: bo.k3 */
/* loaded from: classes4.dex */
public class C2998k3 {

    /* renamed from: a */
    public List f11845a;

    /* renamed from: b */
    public int f11846b;

    public C2998k3(List list, int i11) {
        this.f11845a = list;
        this.f11846b = i11;
    }

    /* renamed from: a */
    public boolean m14233a() {
        List list = this.f11845a;
        if (list != null && !list.isEmpty()) {
            for (C3000l0 c3000l0 : this.f11845a) {
                if (c3000l0 != null && c3000l0.m14302J0()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m14234b() {
        List list = this.f11845a;
        if (list != null && !list.isEmpty()) {
            for (C3000l0 c3000l0 : this.f11845a) {
                if (c3000l0 != null && c3000l0.m14304K0()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m14235c() {
        List list = this.f11845a;
        if (list != null && !list.isEmpty() && this.f11846b >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m14236d() {
        List list = this.f11845a;
        if (list != null && !list.isEmpty()) {
            for (C3000l0 c3000l0 : this.f11845a) {
                if (c3000l0 != null && c3000l0.m14306L0()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
