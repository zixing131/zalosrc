package nu;

import java.util.Calendar;
import p428pu.AbstractC24909a;

/* renamed from: nu.k */
/* loaded from: classes4.dex */
public class C23945k extends C23943i {

    /* renamed from: m */
    public int f115918m;

    public C23945k(String str, String str2, int i11, int i12) {
        super(str, str2, i11, i12);
    }

    @Override // nu.C23943i
    /* renamed from: a */
    public boolean mo125298a(C23938d c23938d) {
        C23940f c23940f;
        if (c23938d.f115871c == null) {
            if (c23938d.f115872d != null) {
                return false;
            }
            return true;
        }
        C23936b c23936b = c23938d.f115869a;
        if ((c23936b == null || c23936b.f115910f.size() != 3) && (c23940f = c23938d.f115870b) != null) {
            c23940f.f115910f.size();
        }
        return false;
    }

    @Override // nu.C23943i
    /* renamed from: c */
    public void mo125316c() {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        this.f115918m = Integer.parseInt(this.f115907c.trim());
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.set(1, this.f115918m);
        calendar.set(2, 0);
        calendar.set(5, 1);
        this.f115911g = calendar.getTimeInMillis();
        calendar.set(2, 11);
        calendar.set(5, 31);
        this.f115912h = calendar.getTimeInMillis();
    }

    @Override // nu.C23943i
    /* renamed from: f */
    public boolean mo125304f(String str) {
        if (!super.mo125304f(str) && !str.trim().equalsIgnoreCase("năm")) {
            return false;
        }
        return true;
    }

    @Override // nu.C23943i
    /* renamed from: g */
    public C23938d mo125300g(C23938d c23938d) {
        if (c23938d.f115869a != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(c23938d.f115869a.f115911g);
            calendar.set(1, this.f115918m);
            long timeInMillis = calendar.getTimeInMillis();
            c23938d.f115877i = timeInMillis;
            c23938d.f115878j = timeInMillis;
        } else if (c23938d.f115870b != null) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(c23938d.f115870b.f115911g);
            calendar2.set(1, this.f115918m);
            c23938d.f115877i = calendar2.getTimeInMillis();
            calendar2.setTimeInMillis(c23938d.f115870b.f115912h);
            calendar2.set(1, this.f115918m);
            c23938d.f115878j = calendar2.getTimeInMillis();
        } else {
            C23935a c23935a = c23938d.f115873e;
            if (c23935a != null) {
                int i11 = c23935a.f115906b.f118242a;
                if (i11 == 0) {
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTimeInMillis(c23938d.f115873e.f115911g);
                    calendar3.set(1, this.f115918m);
                    c23938d.f115877i = calendar3.getTimeInMillis();
                    calendar3.setTimeInMillis(c23938d.f115873e.f115912h);
                    calendar3.set(1, this.f115918m);
                    if (calendar3.getTimeInMillis() < c23938d.f115877i) {
                        calendar3.add(1, 1);
                    }
                    c23938d.f115878j = calendar3.getTimeInMillis();
                } else if (i11 == 1) {
                    Calendar calendar4 = Calendar.getInstance();
                    calendar4.setTimeInMillis(c23938d.f115873e.f115911g);
                    int[] iArr = {calendar4.get(5), calendar4.get(2) + 1, calendar4.get(1)};
                    int[] m129563h = AbstractC24909a.m129563h(iArr[0], iArr[1], iArr[2], 7.0d);
                    m129563h[2] = this.f115918m;
                    calendar4.setTimeInMillis(c23938d.f115873e.f115912h);
                    int[] iArr2 = {calendar4.get(5), calendar4.get(2) + 1, calendar4.get(1)};
                    int[] m129563h2 = AbstractC24909a.m129563h(iArr2[0], iArr2[1], iArr2[2], 7.0d);
                    m129563h2[2] = this.f115918m;
                    if (AbstractC24909a.m129561f(m129563h, m129563h2) > 0) {
                        m129563h[2] = m129563h[2] - 1;
                    }
                    int[] m129562g = AbstractC24909a.m129562g(m129563h[0], m129563h[1], m129563h[2], 0, 7.0d);
                    if (m129562g[0] == 0) {
                        m129562g = AbstractC24909a.m129562g(m129563h[0], m129563h[1], m129563h[2], 1, 7.0d);
                    }
                    int[] m129562g2 = AbstractC24909a.m129562g(m129563h2[0], m129563h2[1], m129563h2[2], 0, 7.0d);
                    if (m129562g2[0] == 0) {
                        m129562g2 = AbstractC24909a.m129562g(m129563h2[0], m129563h2[1], m129563h2[2], 1, 7.0d);
                    }
                    calendar4.set(1, m129562g[2]);
                    calendar4.set(2, m129562g[1] - 1);
                    calendar4.set(5, m129562g[0]);
                    c23938d.f115877i = calendar4.getTimeInMillis();
                    calendar4.set(1, m129562g2[2]);
                    calendar4.set(2, m129562g2[1] - 1);
                    calendar4.set(5, m129562g2[0]);
                    c23938d.f115878j = calendar4.getTimeInMillis();
                }
            } else {
                c23938d.f115877i = this.f115911g;
                c23938d.f115878j = this.f115912h;
            }
        }
        c23938d.f115879k.add(this);
        c23938d.f115871c = this;
        int i12 = c23938d.f115874f;
        int i13 = this.f115908d;
        if (i12 > i13 || i12 == -1) {
            c23938d.f115874f = i13;
        }
        int i14 = c23938d.f115875g;
        int i15 = this.f115909e;
        if (i14 < i15 || i14 == -1) {
            c23938d.f115875g = i15;
        }
        return c23938d;
    }
}
