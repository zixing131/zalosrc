package nu;

import java.util.Calendar;
import p404ou.C24555a;
import p428pu.AbstractC24910b;

/* renamed from: nu.b */
/* loaded from: classes4.dex */
public class C23936b extends C23943i {

    /* renamed from: m */
    public int f115865m;

    /* renamed from: n */
    public int f115866n;

    /* renamed from: o */
    public int f115867o;

    public C23936b(String str, String str2, int i11, int i12) {
        super(str, str2, i11, i12);
    }

    @Override // nu.C23943i
    /* renamed from: a */
    public boolean mo125298a(C23938d c23938d) {
        if (!super.mo125298a(c23938d) || c23938d.f115869a != null || c23938d.f115873e != null || c23938d.f115870b != null || c23938d.f115872d != null) {
            return false;
        }
        if (c23938d.f115871c != null && this.f115910f.size() == 3) {
            return false;
        }
        return true;
    }

    @Override // nu.C23943i
    /* renamed from: b */
    public boolean mo125302b(C23939e c23939e) {
        long j11 = this.f115911g;
        if (j11 != -1 && c23939e.f115884c == null) {
            long j12 = c23939e.f115883b;
            if (j12 == 0 || AbstractC24910b.m129572c(j12, j11)) {
                return true;
            }
            C23941g c23941g = c23939e.f115888g;
            if (c23941g != null) {
                return AbstractC24910b.m129572c(c23941g.f115911g, this.f115911g);
            }
            if (c23939e.f115889h != null) {
                return AbstractC24910b.m129573d(c23939e.f115883b, this.f115911g);
            }
            C23944j c23944j = c23939e.f115891j;
            if (c23944j != null) {
                if (c23944j.f115917m == 2) {
                    return AbstractC24910b.m129572c(c23939e.f115883b, this.f115911g);
                }
                if (c23939e.f115890i != null) {
                    return AbstractC24910b.m129572c(c23939e.f115883b, this.f115911g);
                }
                return AbstractC24910b.m129573d(c23939e.f115883b, this.f115911g);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:            if (r2.get(1) == r10.f115867o) goto L97;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0146, code lost:            if (r2.get(1) == r10.f115867o) goto L97;     */
    @Override // nu.C23943i
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo125303e(int i11, int i12) {
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        if (this.f115910f.size() == 3) {
            this.f115865m = Integer.parseInt(((C24555a) this.f115910f.get(0)).f118238a.trim());
            if (i11 == -1) {
                i11 = Integer.parseInt(((C24555a) this.f115910f.get(1)).f118238a.trim()) - 1;
            }
            this.f115866n = i11;
            this.f115867o = Integer.parseInt(((C24555a) this.f115910f.get(2)).f118238a.trim());
            calendar.set(5, this.f115865m);
            calendar.set(2, this.f115866n);
            calendar.set(1, this.f115867o);
            if (calendar.get(5) == this.f115865m) {
                if (calendar.get(2) == this.f115866n) {
                }
            }
            j11 = -1;
        } else {
            if (this.f115910f.size() == 2) {
                this.f115916l = true;
                this.f115865m = Integer.parseInt(((C24555a) this.f115910f.get(0)).f118238a.trim());
                if (i11 == -1) {
                    i11 = Integer.parseInt(((C24555a) this.f115910f.get(1)).f118238a.trim()) - 1;
                }
                this.f115866n = i11;
                this.f115867o = calendar.get(1);
                calendar.set(2, this.f115866n);
                calendar.set(5, this.f115865m);
                calendar.set(11, 23);
                calendar.set(12, 59);
                calendar.set(13, 59);
                boolean m129572c = AbstractC24910b.m129572c(calendar.getTimeInMillis(), currentTimeMillis);
                if (calendar.get(5) != this.f115865m || calendar.get(2) != this.f115866n || calendar.get(1) != this.f115867o || ((i12 != 1 || calendar.getTimeInMillis() < currentTimeMillis) && (i12 != 0 || (calendar.getTimeInMillis() > currentTimeMillis && !m129572c)))) {
                    if (i12 == 1) {
                        this.f115867o++;
                    } else if (i12 == 0) {
                        this.f115867o--;
                    }
                }
                calendar.set(1, this.f115867o);
                calendar.set(2, this.f115866n);
                calendar.set(5, this.f115865m);
                if (calendar.get(5) == this.f115865m) {
                    if (calendar.get(2) == this.f115866n) {
                    }
                }
                j11 = -1;
            }
            j11 = calendar.getTimeInMillis();
        }
        this.f115911g = j11;
        this.f115912h = j11;
    }

    @Override // nu.C23943i
    /* renamed from: f */
    public boolean mo125304f(String str) {
        if (!super.mo125304f(str) && !str.trim().isEmpty() && !str.trim().equalsIgnoreCase("ngày") && !str.trim().equalsIgnoreCase(",") && !str.trim().equalsIgnoreCase(", ngày")) {
            return false;
        }
        return true;
    }

    @Override // nu.C23943i
    /* renamed from: g */
    public C23938d mo125300g(C23938d c23938d) {
        if (c23938d.f115871c != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.f115911g);
            int i11 = calendar.get(5);
            int i12 = calendar.get(2);
            calendar.setTimeInMillis(c23938d.f115877i);
            calendar.set(2, i12);
            calendar.set(5, i11);
            long timeInMillis = calendar.getTimeInMillis();
            c23938d.f115877i = timeInMillis;
            c23938d.f115878j = timeInMillis;
            c23938d.f115879k.add(this);
        } else {
            long j11 = this.f115911g;
            c23938d.f115877i = j11;
            c23938d.f115878j = j11;
        }
        c23938d.f115879k.add(this);
        c23938d.f115869a = this;
        int i13 = c23938d.f115874f;
        int i14 = this.f115908d;
        if (i13 > i14 || i13 == -1) {
            c23938d.f115874f = i14;
        }
        int i15 = c23938d.f115875g;
        int i16 = this.f115909e;
        if (i15 < i16 || i15 == -1) {
            c23938d.f115875g = i16;
        }
        return c23938d;
    }

    @Override // nu.C23943i
    /* renamed from: h */
    public C23939e mo125305h(C23939e c23939e) {
        c23939e.f115884c = this;
        if (c23939e.f115897p) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.f115911g);
            calendar.set(11, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            c23939e.f115883b = calendar.getTimeInMillis();
            c23939e.f115897p = false;
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
