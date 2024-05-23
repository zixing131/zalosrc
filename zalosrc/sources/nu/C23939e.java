package nu;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mu.C23444b;
import p404ou.C24556b;
import p428pu.AbstractC24910b;

/* renamed from: nu.e */
/* loaded from: classes4.dex */
public class C23939e {

    /* renamed from: b */
    public long f115883b = 0;

    /* renamed from: a */
    public String f115882a = "";

    /* renamed from: c */
    public C23936b f115884c = null;

    /* renamed from: d */
    public C23942h f115885d = null;

    /* renamed from: e */
    public C23937c f115886e = null;

    /* renamed from: g */
    public C23941g f115888g = null;

    /* renamed from: h */
    public C23941g f115889h = null;

    /* renamed from: i */
    public C23941g f115890i = null;

    /* renamed from: f */
    public C23941g f115887f = null;

    /* renamed from: j */
    public C23944j f115891j = null;

    /* renamed from: l */
    public int f115893l = -1;

    /* renamed from: m */
    public int f115894m = -1;

    /* renamed from: n */
    public int f115895n = 12;

    /* renamed from: o */
    public int f115896o = 0;

    /* renamed from: p */
    public boolean f115897p = true;

    /* renamed from: k */
    public ArrayList f115892k = new ArrayList();

    /* renamed from: a */
    public C23939e m125308a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (m125312e()) {
            this.f115883b = currentTimeMillis;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.f115883b);
        int i11 = 0;
        calendar.set(11, 0);
        int i12 = 12;
        calendar.set(12, 0);
        calendar.set(13, 0);
        int i13 = 14;
        calendar.set(14, 0);
        C23937c c23937c = this.f115886e;
        if (c23937c != null) {
            int i14 = c23937c.f115868m;
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 != 5) {
                                i13 = 0;
                            } else {
                                i13 = 23;
                            }
                        } else {
                            i13 = 19;
                        }
                    }
                } else {
                    i13 = 12;
                }
            } else {
                i13 = 8;
            }
            C23942h c23942h = this.f115885d;
            if (c23942h != null) {
                int m125318k = c23942h.m125318k(i14);
                int m125319l = this.f115885d.m125319l();
                calendar.set(11, m125318k);
                calendar.set(12, m125319l);
                if (this.f115886e.m125306j(this.f115885d)) {
                    if (calendar.getTimeInMillis() < currentTimeMillis && (m125312e() || m125311d())) {
                        calendar.add(5, 1);
                    }
                    if (this.f115886e.f115868m != 5 || m125318k != 12 || m125319l != 0) {
                        i11 = m125318k;
                    }
                    calendar.set(11, i11);
                    calendar.set(12, m125319l);
                } else {
                    calendar.setTimeInMillis(0L);
                }
            } else {
                calendar.set(11, i13);
                calendar.set(12, 0);
                if (calendar.getTimeInMillis() < currentTimeMillis) {
                    int i15 = this.f115886e.f115868m;
                    if (i15 != 1) {
                        if (i15 != 3) {
                            if (i15 == 4) {
                                i12 = 23;
                            }
                        } else {
                            i12 = 17;
                        }
                    }
                    calendar.set(11, i12);
                }
                i12 = i13;
                calendar.set(11, i12);
            }
        } else {
            C23942h c23942h2 = this.f115885d;
            if (c23942h2 != null) {
                int m125317j = c23942h2.m125317j();
                int m125319l2 = this.f115885d.m125319l();
                if (m125317j >= 1 && m125317j <= 5) {
                    m125317j += 12;
                } else if (m125317j == 0 && m125312e()) {
                    m125317j = 24;
                }
                calendar.set(11, m125317j);
                calendar.set(12, m125319l2);
                if (calendar.getTimeInMillis() < currentTimeMillis) {
                    if (m125312e()) {
                        int m125317j2 = this.f115885d.m125317j();
                        int m125319l3 = this.f115885d.m125319l();
                        if (m125317j2 >= 1 && m125317j2 <= 5) {
                            m125317j2 += 12;
                        }
                        calendar.set(11, m125317j2);
                        calendar.set(12, m125319l3);
                        C23942h c23942h3 = this.f115885d;
                        if (!c23942h3.f115903o && !c23942h3.f115904p && m125317j2 < 12) {
                            if (currentTimeMillis - calendar.getTimeInMillis() > 43200000) {
                                calendar.add(5, 1);
                            } else {
                                calendar.add(11, 12);
                            }
                        } else {
                            calendar.add(5, 1);
                        }
                    } else if (this.f115886e == null) {
                        C23942h c23942h4 = this.f115885d;
                        if (!c23942h4.f115904p && !c23942h4.f115903o && c23942h4.f115901m < 12) {
                            int m125317j3 = c23942h4.m125317j();
                            int m125319l4 = this.f115885d.m125319l();
                            calendar.set(11, m125317j3 + 12);
                            calendar.set(12, m125319l4);
                        }
                    }
                }
            } else {
                calendar.set(11, 12);
                calendar.set(12, 0);
            }
        }
        this.f115883b = calendar.getTimeInMillis();
        return this;
    }

    /* renamed from: b */
    public boolean m125309b(String str) {
        boolean z11;
        if (this.f115883b > System.currentTimeMillis()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = C23444b.m123108d().f113891i;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((C24556b) arrayList.get(i11)).f118241b.equals("single")) {
                if (this.f115892k.size() == 1) {
                    ArrayList arrayList2 = ((C24556b) arrayList.get(i11)).f118240a;
                    int size2 = arrayList2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        Matcher matcher = Pattern.compile((String) arrayList2.get(i12)).matcher(((C23943i) this.f115892k.get(0)).f115907c.toLowerCase());
                        if (matcher.find()) {
                            if (z11 && !((C23943i) this.f115892k.get(0)).f115907c.toLowerCase().trim().equals(matcher.group().toLowerCase().trim())) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                    }
                }
            } else if (((C24556b) arrayList.get(i11)).f118241b.equals("single_not_prefix") && this.f115892k.size() == 1) {
                ArrayList arrayList3 = ((C24556b) arrayList.get(i11)).f118240a;
                int size3 = arrayList3.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    Matcher matcher2 = Pattern.compile((String) arrayList3.get(i13)).matcher(((C23943i) this.f115892k.get(0)).f115907c.toLowerCase());
                    if (matcher2.find() && ((C23943i) this.f115892k.get(0)).f115907c.toLowerCase().trim().equals(matcher2.group().toLowerCase().trim())) {
                        String substring = str.substring(0, ((C23943i) this.f115892k.get(0)).f115908d);
                        if (z11 && TextUtils.isEmpty(substring.trim())) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                }
            }
        }
        return z11;
    }

    /* renamed from: c */
    public int m125310c(C23943i c23943i) {
        for (int i11 = 0; i11 < this.f115892k.size(); i11++) {
            C23943i c23943i2 = (C23943i) this.f115892k.get(i11);
            if (((c23943i2 instanceof C23936b) && (c23943i instanceof C23936b)) || (((c23943i2 instanceof C23942h) && (c23943i instanceof C23942h)) || (((c23943i2 instanceof C23937c) && (c23943i instanceof C23937c)) || ((c23943i2 instanceof C23944j) && (c23943i instanceof C23944j))))) {
                return i11;
            }
            if ((c23943i2 instanceof C23941g) && (c23943i instanceof C23941g) && ((C23941g) c23943i2).f115900o == ((C23941g) c23943i).f115900o) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public boolean m125311d() {
        C23941g c23941g;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(11);
        C23937c c23937c = this.f115886e;
        if (c23937c != null && c23937c.f115868m == 5 && (c23941g = this.f115888g) != null && AbstractC24910b.m129572c(c23941g.f115911g, System.currentTimeMillis()) && i11 >= 4) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m125312e() {
        return this.f115885d != null && this.f115884c == null && this.f115891j == null && this.f115888g == null && this.f115889h == null && this.f115887f == null;
    }

    /* renamed from: f */
    public boolean m125313f() {
        return (this.f115884c == null && this.f115885d == null && this.f115891j == null && this.f115888g == null && this.f115889h == null && this.f115887f == null) ? false : true;
    }

    /* renamed from: g */
    public boolean m125314g(String str, C23943i c23943i) {
        int i11;
        if (this.f115892k.size() > 0) {
            i11 = this.f115892k.size() - 1;
        } else {
            i11 = -1;
        }
        if (i11 < 0) {
            return true;
        }
        return c23943i.mo125304f(str.substring(((C23943i) this.f115892k.get(i11)).f115909e, c23943i.f115908d));
    }
}
