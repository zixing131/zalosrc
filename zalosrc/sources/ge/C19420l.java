package ge;

import android.text.TextUtils;
import androidx.core.util.C1483e;
import ee.C18408p;
import ee.C18415w;
import ge.C19411c;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;

/* renamed from: ge.l */
/* loaded from: classes3.dex */
public class C19420l {

    /* renamed from: a */
    public long f96350a;

    /* renamed from: b */
    public long f96351b;

    /* renamed from: c */
    private final CopyOnWriteArrayList f96352c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private final CopyOnWriteArrayList f96353d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public boolean f96354e = false;

    /* renamed from: f */
    public boolean f96355f = false;

    public C19420l(long j11, long j12) {
        this.f96350a = j11;
        this.f96351b = j12;
    }

    /* renamed from: a */
    public void m101557a() {
        this.f96352c.clear();
        this.f96353d.clear();
    }

    /* renamed from: b */
    public String m101558b() {
        Iterator it = this.f96352c.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            C19411c c19411c = (C19411c) it.next();
            if (c19411c != null) {
                j11 += c19411c.f96268h;
            }
        }
        return j11 + "";
    }

    /* renamed from: c */
    public ArrayList m101559c() {
        return C18415w.m97592e(this.f96353d);
    }

    /* renamed from: d */
    public ArrayList m101560d(Comparator comparator) {
        ArrayList m101559c = m101559c();
        if (comparator != null) {
            Collections.sort(m101559c, comparator);
        }
        return m101559c;
    }

    /* renamed from: e */
    public ArrayList m101561e() {
        C19411c.a.d dVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f96353d.iterator();
        while (it.hasNext()) {
            C19411c c19411c = (C19411c) it.next();
            C19411c.a aVar = c19411c.f96281u;
            if (aVar != null && (dVar = aVar.f96292f) != null && dVar.f96303a) {
                arrayList.add(c19411c);
            }
        }
        return C18415w.m97592e(arrayList);
    }

    /* renamed from: f */
    public void m101562f(String str) {
        Iterator it = this.f96352c.iterator();
        while (it.hasNext()) {
            C19411c c19411c = (C19411c) it.next();
            if (c19411c.f96261a.equals(str)) {
                this.f96352c.remove(c19411c);
            }
        }
        Iterator it2 = this.f96353d.iterator();
        while (it2.hasNext()) {
            C19411c c19411c2 = (C19411c) it2.next();
            if (c19411c2.f96261a.equals(str)) {
                this.f96353d.remove(c19411c2);
            }
        }
    }

    /* renamed from: g */
    public ArrayList m101563g(long j11, long j12, int i11) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = this.f96352c.iterator();
            while (it.hasNext()) {
                C19411c c19411c = (C19411c) it.next();
                if (c19411c.f96259A < i11) {
                    long j13 = c19411c.f96262b;
                    if (j13 >= j11 && j13 <= j12) {
                        arrayList.add(new C1483e(c19411c.f96261a, Long.valueOf(j13)));
                        this.f96352c.remove(c19411c);
                    }
                }
            }
            Iterator it2 = this.f96353d.iterator();
            while (it2.hasNext()) {
                C19411c c19411c2 = (C19411c) it2.next();
                if (c19411c2.f96259A < i11) {
                    long j14 = c19411c2.f96262b;
                    if (j14 >= j11 && j14 <= j12) {
                        this.f96353d.remove(c19411c2);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: h */
    public void m101564h(String str) {
        Iterator it = this.f96352c.iterator();
        while (it.hasNext()) {
            C19411c c19411c = (C19411c) it.next();
            if (c19411c.f96278r.equals(str)) {
                this.f96352c.remove(c19411c);
            }
        }
        Iterator it2 = this.f96353d.iterator();
        while (it2.hasNext()) {
            C19411c c19411c2 = (C19411c) it2.next();
            if (c19411c2.f96278r.equals(str)) {
                this.f96353d.remove(c19411c2);
            }
        }
    }

    /* renamed from: i */
    public boolean m101565i(int i11, String str, int i12, int i13, boolean z11) {
        Iterator it = this.f96352c.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            C19411c c19411c = (C19411c) it.next();
            if (c19411c.f96277q == i11 && !c19411c.f96278r.isEmpty() && c19411c.f96278r.equals(str) && c19411c.f96279s == i12 && c19411c.m101526a(i13, z11)) {
                z12 = true;
            }
        }
        Iterator it2 = this.f96353d.iterator();
        while (it2.hasNext()) {
            C19411c c19411c2 = (C19411c) it2.next();
            if (c19411c2.f96277q == i11 && !c19411c2.f96278r.isEmpty() && c19411c2.f96278r.equals(str) && c19411c2.f96279s == i12 && c19411c2.m101526a(i13, z11)) {
                z12 = true;
            }
        }
        return z12;
    }

    /* renamed from: j */
    public ArrayList m101566j(ArrayList arrayList, int i11) {
        int i12;
        int i13;
        long[] jArr;
        this.f96352c.addAll(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(C18408p.m97471K());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeZone(C18408p.m97471K());
        for (int i14 = 0; i14 < arrayList.size(); i14 = i12 + 1) {
            C19411c c19411c = (C19411c) arrayList.get(i14);
            if (c19411c == null || TextUtils.isEmpty(c19411c.f96261a)) {
                i12 = i14;
            } else {
                C19411c.c cVar = c19411c.f96271k;
                if (cVar != null && (jArr = cVar.f96318a) != null) {
                    i12 = i14;
                    if (c19411c.f96265e - c19411c.f96264d < 86400000) {
                        int i15 = 0;
                        while (i15 < jArr.length) {
                            long j11 = jArr[i15];
                            long[] jArr2 = jArr;
                            if (j11 / 1000 != c19411c.f96262b / 1000) {
                                C19411c c19411c2 = new C19411c(c19411c.mo101533h());
                                c19411c2.f96262b = j11;
                                c19411c2.f96263c = (j11 + c19411c.f96265e) - c19411c.f96264d;
                                c19411c2.f96259A = i11;
                                arrayList2.add(c19411c2);
                            }
                            i15++;
                            jArr = jArr2;
                        }
                    }
                } else {
                    i12 = i14;
                }
                if (c19411c.f96265e - c19411c.f96264d >= 86400000) {
                    calendar.setTimeInMillis(c19411c.f96262b);
                    calendar2.setTimeInMillis(c19411c.f96265e);
                    int m119233a = AbstractC23160o0.m119233a(calendar, calendar2);
                    if (m119233a == -1) {
                        if (c19411c.f96262b == c19411c.f96264d) {
                            C19411c c19411c3 = new C19411c(c19411c.mo101533h());
                            c19411c3.f96259A = i11;
                            c19411c3.f96260B = 0;
                            c19411c3.f96262b = c19411c.f96264d;
                            i13 = 1;
                            calendar.add(5, 1);
                            AbstractC23160o0.m119301w1(calendar);
                            c19411c3.f96263c = calendar.getTimeInMillis() - 1;
                            arrayList2.add(c19411c3);
                        } else {
                            i13 = 1;
                            C19411c c19411c4 = new C19411c(c19411c.mo101533h());
                            c19411c4.f96259A = i11;
                            c19411c4.f96260B = 1;
                            AbstractC23160o0.m119301w1(calendar);
                            c19411c4.f96262b = calendar.getTimeInMillis();
                            calendar.add(5, 1);
                            c19411c4.f96263c = calendar.getTimeInMillis() - 1;
                            arrayList2.add(c19411c4);
                        }
                        calendar.setTimeInMillis(c19411c.f96262b);
                        calendar.add(6, i13);
                        AbstractC23160o0.m119301w1(calendar);
                        while (calendar.getTimeInMillis() <= c19411c.f96263c && AbstractC23160o0.m119233a(calendar, calendar2) == -1) {
                            C19411c c19411c5 = new C19411c(c19411c.mo101533h());
                            c19411c5.f96259A = i11;
                            c19411c5.f96260B = 1;
                            c19411c5.f96262b = calendar.getTimeInMillis();
                            calendar.add(6, 1);
                            c19411c5.f96263c = calendar.getTimeInMillis() - 1;
                            arrayList2.add(c19411c5);
                        }
                        if (c19411c.f96263c == c19411c.f96265e) {
                            C19411c c19411c6 = new C19411c(c19411c.mo101533h());
                            c19411c6.f96259A = i11;
                            c19411c6.f96260B = 2;
                            c19411c6.f96262b = calendar.getTimeInMillis();
                            c19411c6.f96263c = c19411c.f96265e;
                            arrayList2.add(c19411c6);
                        }
                    } else if (m119233a == 0) {
                        C19411c c19411c7 = new C19411c(c19411c.mo101533h());
                        c19411c7.f96259A = i11;
                        c19411c7.f96260B = 2;
                        AbstractC23160o0.m119301w1(calendar);
                        c19411c7.f96262b = calendar.getTimeInMillis();
                        c19411c7.f96263c = c19411c.f96265e;
                        arrayList2.add(c19411c7);
                    }
                } else {
                    arrayList2.add(new C19411c(c19411c.mo101533h()));
                }
            }
        }
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            C19411c c19411c8 = (C19411c) arrayList2.get(i16);
            if (c19411c8.f96266f == 1) {
                calendar.setTimeInMillis(c19411c8.f96262b);
                AbstractC23160o0.m119301w1(calendar);
                c19411c8.f96262b = calendar.getTimeInMillis();
                calendar.add(5, 1);
                c19411c8.f96263c = calendar.getTimeInMillis() - 1;
            }
            Iterator it = this.f96353d.iterator();
            while (it.hasNext()) {
                C19411c c19411c9 = (C19411c) it.next();
                if (c19411c9 != null && !TextUtils.isEmpty(c19411c9.f96261a)) {
                    if ((c19411c8.f96261a + c19411c8.f96262b).equals(c19411c9.f96261a + c19411c9.f96262b)) {
                        this.f96353d.remove(c19411c9);
                    }
                }
            }
        }
        this.f96353d.addAll(arrayList2);
        return arrayList2;
    }
}
