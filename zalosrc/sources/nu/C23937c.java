package nu;

import java.util.Calendar;

/* renamed from: nu.c */
/* loaded from: classes4.dex */
public class C23937c extends C23943i {

    /* renamed from: m */
    public int f115868m;

    public C23937c(String str, String str2, int i11, int i12) {
        super(str, str2, i11, i12);
    }

    @Override // nu.C23943i
    /* renamed from: b */
    public boolean mo125302b(C23939e c23939e) {
        if (c23939e.f115886e == null) {
            return true;
        }
        return false;
    }

    @Override // nu.C23943i
    /* renamed from: d */
    public void mo125299d(int i11) {
        this.f115868m = i11;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            calendar.set(11, 21);
                            calendar.set(12, 0);
                            this.f115911g = calendar.getTimeInMillis();
                            calendar.add(5, 1);
                            calendar.set(11, 3);
                            calendar.set(12, 59);
                            this.f115912h = calendar.getTimeInMillis();
                            return;
                        }
                        return;
                    }
                    calendar.set(11, 17);
                    calendar.set(12, 0);
                    this.f115911g = calendar.getTimeInMillis();
                    calendar.set(11, 23);
                    calendar.set(12, 59);
                    this.f115912h = calendar.getTimeInMillis();
                    return;
                }
                calendar.set(11, 12);
                calendar.set(12, 0);
                this.f115911g = calendar.getTimeInMillis();
                calendar.set(11, 19);
                calendar.set(12, 59);
                this.f115912h = calendar.getTimeInMillis();
                return;
            }
            calendar.set(11, 10);
            calendar.set(12, 0);
            this.f115911g = calendar.getTimeInMillis();
            calendar.set(11, 14);
            calendar.set(12, 59);
            this.f115912h = calendar.getTimeInMillis();
            return;
        }
        calendar.set(11, 7);
        calendar.set(12, 0);
        this.f115911g = calendar.getTimeInMillis();
        calendar.set(11, 12);
        calendar.set(12, 59);
        this.f115912h = calendar.getTimeInMillis();
    }

    @Override // nu.C23943i
    /* renamed from: f */
    public boolean mo125304f(String str) {
        if (!str.trim().isEmpty() && !str.trim().equalsIgnoreCase("buổi")) {
            return false;
        }
        return true;
    }

    @Override // nu.C23943i
    /* renamed from: h */
    public C23939e mo125305h(C23939e c23939e) {
        c23939e.f115886e = this;
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

    /* renamed from: j */
    public boolean m125306j(C23942h c23942h) {
        if (!c23942h.m125320m()) {
            return false;
        }
        int i11 = c23942h.f115901m;
        int i12 = this.f115868m;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return false;
                        }
                        if (c23942h.f115903o) {
                            if (i11 < 0 || i11 > 3) {
                                return false;
                            }
                            return true;
                        }
                        if (c23942h.f115904p) {
                            if (i11 < 9 || i11 > 11) {
                                return false;
                            }
                            return true;
                        }
                        if ((i11 < 0 || i11 > 3) && ((i11 < 9 || i11 > 12) && (i11 < 21 || i11 > 23))) {
                            return false;
                        }
                        return true;
                    }
                    if (c23942h.f115903o) {
                        return false;
                    }
                    if (c23942h.f115904p) {
                        if (i11 < 5 || i11 > 11) {
                            return false;
                        }
                        return true;
                    }
                    if (i11 >= 5 && i11 <= 11) {
                        i11 += 12;
                    }
                    if (i11 < 17 || i11 > 23) {
                        return false;
                    }
                    return true;
                }
                if (c23942h.f115903o) {
                    if (i11 != 12) {
                        return false;
                    }
                    return true;
                }
                if (c23942h.f115904p) {
                    if (i11 < 1 || i11 > 7) {
                        return false;
                    }
                    return true;
                }
                if (i11 >= 1 && i11 <= 7) {
                    i11 += 12;
                }
                if (i11 < 12 || i11 > 19) {
                    return false;
                }
                return true;
            }
            if (c23942h.f115903o) {
                if (i11 < 10 || i11 > 12) {
                    return false;
                }
                return true;
            }
            if (c23942h.f115904p) {
                if (i11 < 1 || i11 > 2) {
                    return false;
                }
                return true;
            }
            if (i11 >= 1 && i11 <= 2) {
                i11 += 12;
            }
            if (i11 < 10 || i11 > 14) {
                return false;
            }
            return true;
        }
        if (i11 < 0 || i11 > 12 || c23942h.f115904p) {
            return false;
        }
        return true;
    }
}
