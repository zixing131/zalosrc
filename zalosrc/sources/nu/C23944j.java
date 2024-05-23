package nu;

import java.util.Calendar;
import p428pu.AbstractC24910b;

/* renamed from: nu.j */
/* loaded from: classes4.dex */
public class C23944j extends C23943i {

    /* renamed from: m */
    public int f115917m;

    public C23944j(String str, String str2, int i11, int i12) {
        super(str, str2, i11, i12);
        this.f115917m = 1;
    }

    @Override // nu.C23943i
    /* renamed from: b */
    public boolean mo125302b(C23939e c23939e) {
        if (c23939e.f115891j == null) {
            long j11 = this.f115911g;
            if (c23939e.f115884c != null) {
                return AbstractC24910b.m129573d(c23939e.f115883b, j11);
            }
            int i11 = this.f115917m;
            if (i11 == 1) {
                C23941g c23941g = c23939e.f115890i;
                if (c23941g != null && (j11 < c23941g.f115911g || j11 > c23941g.f115912h)) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(j11);
                    calendar.add(5, c23939e.f115890i.f115898m);
                    j11 = calendar.getTimeInMillis();
                }
                if (c23939e.f115888g != null) {
                    return AbstractC24910b.m129573d(c23939e.f115883b, j11);
                }
                if (c23939e.f115890i != null || c23939e.f115889h == null) {
                    return true;
                }
                return AbstractC24910b.m129573d(c23939e.f115883b, j11);
            }
            if (i11 != 2 || c23939e.f115887f != null || c23939e.f115890i != null) {
                return false;
            }
            if (c23939e.f115888g != null) {
                return AbstractC24910b.m129572c(c23939e.f115883b, j11);
            }
            if (c23939e.f115889h == null) {
                return true;
            }
            return AbstractC24910b.m129573d(c23939e.f115883b, j11);
        }
        return false;
    }

    @Override // nu.C23943i
    /* renamed from: e */
    public void mo125303e(int i11, int i12) {
        long m129571b = AbstractC24910b.m129571b(i11, i12);
        this.f115911g = m129571b;
        this.f115912h = m129571b;
    }

    @Override // nu.C23943i
    /* renamed from: f */
    public boolean mo125304f(String str) {
        if (!str.trim().isEmpty() && !str.trim().equalsIgnoreCase("ngày")) {
            return false;
        }
        return true;
    }

    @Override // nu.C23943i
    /* renamed from: h */
    public C23939e mo125305h(C23939e c23939e) {
        c23939e.f115891j = this;
        if (c23939e.f115897p) {
            C23941g c23941g = c23939e.f115890i;
            if (c23941g != null) {
                long j11 = this.f115911g;
                if (j11 >= c23941g.f115911g && j11 <= c23941g.f115912h) {
                    c23939e.f115883b = j11;
                } else {
                    Calendar calendar = Calendar.getInstance();
                    if (c23939e.f115883b > 0) {
                        calendar.setTimeInMillis(this.f115911g);
                        calendar.add(5, c23939e.f115890i.f115898m);
                        c23939e.f115883b = calendar.getTimeInMillis();
                    } else {
                        calendar.setTimeInMillis(c23939e.f115890i.f115911g);
                        while (true) {
                            if (calendar.getTimeInMillis() > c23939e.f115890i.f115912h) {
                                break;
                            }
                            if (AbstractC24910b.m129573d(this.f115911g, calendar.getTimeInMillis())) {
                                c23939e.f115883b = calendar.getTimeInMillis();
                                break;
                            }
                            calendar.add(5, 1);
                        }
                    }
                }
            } else {
                c23939e.f115883b = this.f115911g;
            }
        }
        int i11 = c23939e.f115893l;
        int i12 = this.f115908d;
        if (i11 > i12 || i11 == -1) {
            c23939e.f115893l = i12;
        }
        int i13 = c23939e.f115894m;
        int i14 = this.f115909e;
        if (i13 < i14 || i13 == -1) {
            c23939e.f115894m = i14;
        }
        return c23939e;
    }
}
