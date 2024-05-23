package nu;

import java.util.Calendar;
import p404ou.C24557c;
import p428pu.AbstractC24909a;

/* renamed from: nu.a */
/* loaded from: classes4.dex */
public class C23935a extends C23943i {
    public C23935a(String str, String str2, int i11, int i12) {
        super(str, str2, i11, i12);
    }

    @Override // nu.C23943i
    /* renamed from: a */
    public boolean mo125298a(C23938d c23938d) {
        if (c23938d.f115873e != null || c23938d.f115870b != null || c23938d.f115869a != null || c23938d.f115872d != null) {
            return false;
        }
        return true;
    }

    @Override // nu.C23943i
    /* renamed from: d */
    public void mo125299d(int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        C24557c c24557c = this.f115906b;
        if (c24557c != null) {
            int i12 = c24557c.f118242a;
            if (i12 == 0) {
                String[] split = c24557c.f118243b.split("/");
                if (split.length == 1) {
                    int i13 = calendar.get(2) + 1;
                    split = new String[]{split[0], "" + i13};
                }
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                calendar.set(5, parseInt);
                calendar.set(2, parseInt2 - 1);
                calendar.setTimeInMillis(C23943i.m125321i(calendar.getTimeInMillis(), i11, 1));
                this.f115911g = calendar.getTimeInMillis();
                String[] split2 = this.f115906b.f118244c.split("/");
                if (split2.length == 1) {
                    int i14 = calendar.get(2) + 1;
                    split2 = new String[]{split2[0], "" + i14};
                }
                int parseInt3 = Integer.parseInt(split2[0]);
                int parseInt4 = Integer.parseInt(split2[1]);
                calendar.set(5, parseInt3);
                calendar.set(2, parseInt4 - 1);
                if (calendar.getTimeInMillis() < this.f115911g) {
                    calendar.add(1, 1);
                }
                this.f115912h = calendar.getTimeInMillis();
                return;
            }
            if (i12 == 1) {
                String[] split3 = c24557c.f118243b.split("/");
                if (split3.length == 1) {
                    int[] m129563h = AbstractC24909a.m129563h(calendar.get(5), calendar.get(2) + 1, calendar.get(1), 7.0d);
                    if (m129563h[0] < Integer.parseInt(split3[0])) {
                        m129563h[1] = m129563h[1] + 1;
                    }
                    split3 = new String[]{split3[0], "" + m129563h[1]};
                }
                int parseInt5 = Integer.parseInt(split3[0]);
                int parseInt6 = Integer.parseInt(split3[1]);
                int i15 = calendar.get(1);
                int i16 = calendar.get(2) + 1;
                int i17 = calendar.get(5);
                int m125301j = m125301j(parseInt5, parseInt6, i11, i17, i16, i15);
                int[] m129562g = AbstractC24909a.m129562g(parseInt5, parseInt6, m125301j, 1, 7.0d);
                if (m129562g[0] == 0) {
                    m129562g = AbstractC24909a.m129562g(parseInt5, parseInt6, m125301j, 0, 7.0d);
                }
                calendar.set(5, m129562g[0]);
                calendar.set(2, m129562g[1] - 1);
                calendar.set(1, m129562g[2]);
                this.f115911g = calendar.getTimeInMillis();
                String[] split4 = this.f115906b.f118244c.split("/");
                if (split4.length == 1) {
                    int[] m129563h2 = AbstractC24909a.m129563h(calendar.get(5), calendar.get(2) + 1, calendar.get(1), 7.0d);
                    if (m129563h2[0] < Integer.parseInt(split4[0])) {
                        m129563h2[1] = m129563h2[1] + 1;
                    }
                    split4 = new String[]{split4[0], "" + m129563h2[1]};
                }
                int parseInt7 = Integer.parseInt(split4[0]);
                int parseInt8 = Integer.parseInt(split4[1]);
                int m125301j2 = m125301j(parseInt7, parseInt8, i11, i17, i16, i15);
                int[] m129562g2 = AbstractC24909a.m129562g(parseInt7, parseInt8, m125301j2, 1, 7.0d);
                if (m129562g2[0] == 0) {
                    m129562g2 = AbstractC24909a.m129562g(parseInt7, parseInt8, m125301j2, 0, 7.0d);
                }
                calendar.set(5, m129562g2[0]);
                calendar.set(2, m129562g2[1] - 1);
                calendar.set(1, m129562g2[2]);
                this.f115912h = calendar.getTimeInMillis();
            }
        }
    }

    @Override // nu.C23943i
    /* renamed from: g */
    public C23938d mo125300g(C23938d c23938d) {
        if (c23938d.f115871c != null) {
            int i11 = this.f115906b.f118242a;
            if (i11 == 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(this.f115911g);
                calendar.set(1, c23938d.f115871c.f115918m);
                c23938d.f115877i = calendar.getTimeInMillis();
                calendar.setTimeInMillis(this.f115912h);
                calendar.set(1, c23938d.f115871c.f115918m);
                if (calendar.getTimeInMillis() < c23938d.f115877i) {
                    calendar.add(1, 1);
                }
                c23938d.f115878j = calendar.getTimeInMillis();
            } else if (i11 == 1) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(this.f115911g);
                int[] iArr = {calendar2.get(5), calendar2.get(2) + 1, calendar2.get(1)};
                int[] m129563h = AbstractC24909a.m129563h(iArr[0], iArr[1], iArr[2], 7.0d);
                m129563h[2] = c23938d.f115871c.f115918m;
                calendar2.setTimeInMillis(this.f115912h);
                int[] iArr2 = {calendar2.get(5), calendar2.get(2) + 1, calendar2.get(1)};
                int[] m129563h2 = AbstractC24909a.m129563h(iArr2[0], iArr2[1], iArr2[2], 7.0d);
                m129563h2[2] = c23938d.f115871c.f115918m;
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
                calendar2.set(1, m129562g[2]);
                calendar2.set(2, m129562g[1] - 1);
                calendar2.set(5, m129562g[0]);
                c23938d.f115877i = calendar2.getTimeInMillis();
                calendar2.set(1, m129562g2[2]);
                calendar2.set(2, m129562g2[1] - 1);
                calendar2.set(5, m129562g2[0]);
                c23938d.f115878j = calendar2.getTimeInMillis();
            }
        } else {
            c23938d.f115877i = this.f115911g;
            c23938d.f115878j = this.f115912h;
        }
        c23938d.f115879k.add(this);
        c23938d.f115873e = this;
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

    /* renamed from: j */
    public int m125301j(int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        int[] m129563h = AbstractC24909a.m129563h(i14, i15, i16, 7.0d);
        int i19 = m129563h[1];
        if (i19 > i12) {
            if (i13 == 0) {
                return m129563h[2];
            }
            i18 = m129563h[2];
        } else if (i19 == i12) {
            int i21 = m129563h[0];
            if (i21 >= i11) {
                if (i13 == 0) {
                    return m129563h[2];
                }
                i18 = m129563h[2];
            } else {
                if (i21 < i11) {
                    if (i13 == 0) {
                        i17 = m129563h[2];
                        return i17 - 1;
                    }
                    return m129563h[2];
                }
                return 0;
            }
        } else {
            if (i19 < i12) {
                if (i13 == 0) {
                    i17 = m129563h[2];
                    return i17 - 1;
                }
                return m129563h[2];
            }
            return 0;
        }
        return i18 + 1;
    }
}
