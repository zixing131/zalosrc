package nu;

import java.util.Calendar;
import p428pu.AbstractC24910b;

/* renamed from: nu.g */
/* loaded from: classes4.dex */
public class C23941g extends C23943i {

    /* renamed from: m */
    public int f115898m;

    /* renamed from: n */
    public boolean f115899n;

    /* renamed from: o */
    public int f115900o;

    public C23941g(String str, String str2, int i11, int i12) {
        super(str, str2, i11, i12);
        this.f115898m = 7;
        this.f115899n = true;
        this.f115900o = -1;
    }

    @Override // nu.C23943i
    /* renamed from: b */
    public boolean mo125302b(C23939e c23939e) {
        C23944j c23944j = c23939e.f115891j;
        if (c23944j != null && c23944j.f115917m == 2) {
            int i11 = this.f115900o;
            if (i11 == 2) {
                return AbstractC24910b.m129572c(c23939e.f115883b, this.f115911g);
            }
            if (i11 != 3) {
                return false;
            }
            return AbstractC24910b.m129573d(c23944j.f115911g, this.f115911g);
        }
        int i12 = this.f115900o;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3 || c23939e.f115889h != null || c23939e.f115887f != null) {
                        return false;
                    }
                    long j11 = c23939e.f115883b;
                    if (j11 == 0) {
                        return true;
                    }
                    if (AbstractC24910b.m129573d(j11, this.f115911g)) {
                        if (c23939e.f115883b < System.currentTimeMillis()) {
                            return false;
                        }
                        if (c23939e.f115888g == null) {
                            return true;
                        }
                        return AbstractC24910b.m129572c(c23939e.f115883b, this.f115911g);
                    }
                    C23941g c23941g = c23939e.f115888g;
                    if (c23941g != null) {
                        return AbstractC24910b.m129573d(c23941g.f115911g, this.f115911g);
                    }
                    C23944j c23944j2 = c23939e.f115891j;
                    if (c23944j2 != null) {
                        return AbstractC24910b.m129573d(c23944j2.f115911g, this.f115911g);
                    }
                    if (c23939e.f115890i != null) {
                        if (c23939e.f115884c == null) {
                            return true;
                        }
                        return AbstractC24910b.m129572c(c23939e.f115883b, this.f115911g);
                    }
                } else {
                    if (m125315j() || c23939e.f115888g != null) {
                        return false;
                    }
                    long j12 = c23939e.f115883b;
                    if (j12 == 0) {
                        return true;
                    }
                    return AbstractC24910b.m129572c(j12, this.f115911g);
                }
            } else {
                if (c23939e.f115890i != null || c23939e.f115887f != null) {
                    return false;
                }
                if (c23939e.f115883b == 0) {
                    return true;
                }
                C23941g c23941g2 = c23939e.f115888g;
                if (c23941g2 != null) {
                    long j13 = c23941g2.f115911g;
                    if (j13 < this.f115911g || j13 > this.f115912h) {
                        return false;
                    }
                    return true;
                }
                C23936b c23936b = c23939e.f115884c;
                if (c23936b != null) {
                    long j14 = c23936b.f115911g;
                    if (j14 < this.f115911g || j14 > this.f115912h) {
                        return false;
                    }
                    return true;
                }
                if (c23944j != null || c23939e.f115889h != null) {
                    return true;
                }
            }
        } else if (c23939e.f115887f == null && c23939e.f115890i == null && c23939e.f115889h == null) {
            long j15 = c23939e.f115883b;
            if (j15 == 0 || AbstractC24910b.m129572c(j15, this.f115911g)) {
                return true;
            }
            if (c23939e.f115889h == null && c23939e.f115890i == null) {
                if (c23939e.f115888g != null) {
                    return AbstractC24910b.m129572c(c23939e.f115883b, this.f115911g);
                }
                if (c23939e.f115884c != null) {
                    return AbstractC24910b.m129572c(c23939e.f115883b, this.f115911g);
                }
                C23944j c23944j3 = c23939e.f115891j;
                if (c23944j3 != null) {
                    return AbstractC24910b.m129573d(c23944j3.f115911g, this.f115911g);
                }
            }
        }
        return false;
    }

    @Override // nu.C23943i
    /* renamed from: f */
    public boolean mo125304f(String str) {
        boolean mo125304f = super.mo125304f(str);
        int i11 = this.f115900o;
        if (i11 != 0 && i11 != 3) {
            if (mo125304f || str.trim().isEmpty()) {
                return true;
            }
            return false;
        }
        if (mo125304f || str.trim().isEmpty() || str.trim().equalsIgnoreCase("ngày")) {
            return true;
        }
        return false;
    }

    @Override // nu.C23943i
    /* renamed from: h */
    public C23939e mo125305h(C23939e c23939e) {
        int i11 = this.f115900o;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        c23939e.f115889h = this;
                        if (c23939e.f115897p) {
                            C23941g c23941g = c23939e.f115890i;
                            if (c23941g != null) {
                                if (c23941g.f115911g < System.currentTimeMillis()) {
                                    c23939e.f115883b = -1L;
                                } else {
                                    c23939e.f115883b = this.f115911g;
                                    Calendar calendar = Calendar.getInstance();
                                    calendar.setTimeInMillis(this.f115911g);
                                    calendar.add(5, 7);
                                    if (calendar.getTimeInMillis() >= c23939e.f115890i.f115911g && calendar.getTimeInMillis() <= c23939e.f115890i.f115912h) {
                                        c23939e.f115883b = calendar.getTimeInMillis();
                                    }
                                }
                            } else {
                                c23939e.f115883b = this.f115911g;
                            }
                        }
                    }
                } else {
                    c23939e.f115888g = this;
                    if (c23939e.f115897p) {
                        c23939e.f115883b = this.f115911g;
                        c23939e.f115897p = false;
                    }
                }
            } else {
                c23939e.f115890i = this;
                if (c23939e.f115897p && (c23939e.f115889h != null || c23939e.f115891j != null)) {
                    if (this.f115911g < System.currentTimeMillis() && this.f115912h < System.currentTimeMillis()) {
                        c23939e.f115883b = -1L;
                    } else {
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTimeInMillis(this.f115911g);
                        while (true) {
                            if (calendar2.getTimeInMillis() > this.f115912h) {
                                break;
                            }
                            if (AbstractC24910b.m129573d(c23939e.f115883b, calendar2.getTimeInMillis())) {
                                c23939e.f115883b = calendar2.getTimeInMillis();
                                break;
                            }
                            calendar2.add(5, 1);
                        }
                    }
                }
            }
        } else {
            c23939e.f115887f = this;
            if (c23939e.f115897p) {
                c23939e.f115883b = this.f115911g;
                c23939e.f115897p = false;
            }
        }
        int i12 = c23939e.f115893l;
        int i13 = this.f115908d;
        if (i12 > i13 || i12 == -1) {
            c23939e.f115893l = i13;
        }
        int i14 = c23939e.f115894m;
        int i15 = this.f115909e;
        if (i14 < i15 || i14 == -1) {
            c23939e.f115894m = i15;
        }
        return c23939e;
    }

    /* renamed from: j */
    public boolean m125315j() {
        return false;
    }
}
