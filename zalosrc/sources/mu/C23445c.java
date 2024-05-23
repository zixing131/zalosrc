package mu;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nu.C23936b;
import nu.C23939e;
import nu.C23941g;
import nu.C23942h;
import nu.C23943i;
import nu.C23944j;
import p404ou.C24555a;
import p428pu.AbstractC24910b;

/* renamed from: mu.c */
/* loaded from: classes4.dex */
public class C23445c extends C23444b {

    /* renamed from: l */
    private static C23445c f113893l = null;

    /* renamed from: m */
    static int f113894m = 550;

    private C23445c() {
    }

    /* renamed from: r */
    public static C23445c m123122r() {
        if (f113893l == null) {
            f113893l = new C23445c();
        }
        return f113893l;
    }

    /* renamed from: t */
    private String m123123t(String str) {
        char c11;
        int length = str.length() - 1;
        char[] charArray = str.toCharArray();
        for (int i11 = 0; i11 < length; i11++) {
            if (charArray[i11] == ':') {
                int i12 = i11 + 1;
                if (charArray[i12] == '3' && (i11 == 0 || (c11 = charArray[i11 - 1]) == ' ' || (i11 > 1 && c11 == '3' && charArray[i11 - 2] == ':'))) {
                    charArray[i11] = '-';
                    charArray[i12] = '-';
                }
            }
        }
        return new String(charArray);
    }

    /* renamed from: u */
    private ArrayList m123124u(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C23943i c23943i = (C23943i) arrayList.get(size);
            if ((c23943i instanceof C23941g) && ((C23941g) c23943i).f115900o == -1) {
                arrayList.remove(size);
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public ArrayList m123125q(String str) {
        int i11;
        C23943i c23943i;
        int i12;
        int i13;
        int i14 = 0;
        ArrayList m123117b = C23444b.m123108d().m123117b(str, 0);
        ArrayList arrayList = new ArrayList();
        int i15 = 1;
        arrayList.add(Pair.create("\\btới\\b", 1));
        arrayList.add(Pair.create("\\bnày\\b", 0));
        int i16 = -1;
        arrayList.add(Pair.create("\\btrước\\b", -1));
        arrayList.add(Pair.create("\\bsau\\b", 1));
        arrayList.add(Pair.create("\\bvừa rồi\\b", -1));
        arrayList.add(Pair.create("\\bvừa qua\\b", -1));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Matcher matcher = Pattern.compile((String) pair.first).matcher(str);
            int i17 = 0;
            while (matcher.find(i17)) {
                String group = matcher.group();
                ArrayList arrayList2 = new ArrayList();
                int groupCount = matcher.groupCount();
                for (int i18 = 1; i18 <= groupCount; i18++) {
                    arrayList2.add(new C24555a(matcher.group(i18), matcher.start(i18)));
                }
                C23941g c23941g = new C23941g("neartime_vn", matcher.group(), matcher.start(), -1);
                c23941g.f115900o = -1;
                long intValue = ((Integer) pair.second).intValue();
                c23941g.f115911g = intValue;
                c23941g.f115912h = intValue;
                c23941g.f115910f = new ArrayList();
                m123117b.add(this.f113892j.m123132c(c23941g, 0));
                i17 = group.length() + matcher.start();
            }
        }
        ArrayList m123120o = m123120o(m123121p(m123117b));
        int size = m123120o.size() - 1;
        while (size >= i15) {
            C23943i c23943i2 = (C23943i) m123120o.get(size);
            if ((c23943i2 instanceof C23941g) && ((C23941g) c23943i2).f115900o == i16) {
                int i19 = size - 1;
                C23943i c23943i3 = (C23943i) m123120o.get(i19);
                String substring = str.substring(c23943i3.f115909e, c23943i2.f115908d);
                if (c23943i2.mo125304f(substring) && (c23943i3 instanceof C23941g)) {
                    C23941g c23941g2 = (C23941g) c23943i3;
                    if (c23941g2.f115900o == 3) {
                        c23941g2.f115900o = i14;
                        long j11 = c23943i2.f115911g;
                        if (j11 < 0) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTimeInMillis(c23943i3.f115911g);
                            calendar.add(5, (int) (c23943i2.f115911g * 7));
                            long timeInMillis = calendar.getTimeInMillis();
                            c23943i3.f115911g = timeInMillis;
                            c23943i3.f115912h = timeInMillis;
                        } else if (j11 == 0) {
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTimeInMillis(System.currentTimeMillis());
                            if (calendar2.get(7) == 1) {
                                i13 = 0;
                            } else {
                                i13 = 8 - calendar2.get(7);
                            }
                            calendar2.add(5, i13);
                            long timeInMillis2 = calendar2.getTimeInMillis();
                            calendar2.add(5, -6);
                            calendar2.setTimeInMillis(calendar2.getTimeInMillis());
                            while (true) {
                                if (calendar2.getTimeInMillis() > timeInMillis2) {
                                    break;
                                }
                                if (AbstractC24910b.m129573d(calendar2.getTimeInMillis(), c23943i3.f115911g)) {
                                    long timeInMillis3 = calendar2.getTimeInMillis();
                                    c23943i3.f115911g = timeInMillis3;
                                    c23943i3.f115912h = timeInMillis3;
                                    break;
                                }
                                calendar2.add(5, 1);
                            }
                        } else {
                            i11 = size;
                            if (AbstractC24910b.m129574e(System.currentTimeMillis(), c23943i3.f115911g)) {
                                Calendar calendar3 = Calendar.getInstance();
                                calendar3.setTimeInMillis(c23943i3.f115911g);
                                calendar3.add(5, (int) (c23943i2.f115911g * 7));
                                long timeInMillis4 = calendar3.getTimeInMillis();
                                c23943i3.f115911g = timeInMillis4;
                                c23943i3.f115912h = timeInMillis4;
                            }
                            int i21 = c23943i2.f115909e;
                            c23943i3.f115909e = i21;
                            c23943i3.f115907c = str.substring(c23943i3.f115908d, i21);
                            m123120o.set(i19, c23943i3);
                            m123120o.remove(i11);
                        }
                        i11 = size;
                        int i212 = c23943i2.f115909e;
                        c23943i3.f115909e = i212;
                        c23943i3.f115907c = str.substring(c23943i3.f115908d, i212);
                        m123120o.set(i19, c23943i3);
                        m123120o.remove(i11);
                    }
                }
                i11 = size;
                if (c23943i2.mo125304f(substring) && (c23943i3 instanceof C23944j)) {
                    long j12 = c23943i2.f115911g;
                    if (j12 < 0) {
                        Calendar calendar4 = Calendar.getInstance();
                        calendar4.setTimeInMillis(c23943i3.f115911g);
                        calendar4.add(5, -7);
                        long timeInMillis5 = calendar4.getTimeInMillis();
                        c23943i3.f115911g = timeInMillis5;
                        c23943i3.f115912h = timeInMillis5;
                    } else {
                        if (j12 == 0) {
                            Calendar calendar5 = Calendar.getInstance();
                            calendar5.setTimeInMillis(System.currentTimeMillis());
                            if (calendar5.get(7) == 1) {
                                i12 = 0;
                            } else {
                                i12 = 8 - calendar5.get(7);
                            }
                            calendar5.add(5, i12);
                            long timeInMillis6 = calendar5.getTimeInMillis();
                            calendar5.add(5, -6);
                            calendar5.setTimeInMillis(calendar5.getTimeInMillis());
                            while (true) {
                                if (calendar5.getTimeInMillis() <= timeInMillis6) {
                                    c23943i = c23943i2;
                                    if (AbstractC24910b.m129573d(calendar5.getTimeInMillis(), c23943i3.f115911g)) {
                                        long timeInMillis7 = calendar5.getTimeInMillis();
                                        c23943i3.f115911g = timeInMillis7;
                                        c23943i3.f115912h = timeInMillis7;
                                        break;
                                    }
                                    calendar5.add(5, 1);
                                    c23943i2 = c23943i;
                                } else {
                                    c23943i = c23943i2;
                                    break;
                                }
                            }
                        } else {
                            c23943i = c23943i2;
                            if (AbstractC24910b.m129573d(c23943i3.f115911g, System.currentTimeMillis())) {
                                Calendar calendar6 = Calendar.getInstance();
                                calendar6.setTimeInMillis(c23943i3.f115911g);
                                c23943i2 = c23943i;
                                calendar6.add(5, (int) (c23943i2.f115911g * 7));
                                long timeInMillis8 = calendar6.getTimeInMillis();
                                c23943i3.f115911g = timeInMillis8;
                                c23943i3.f115912h = timeInMillis8;
                            }
                        }
                        c23943i2 = c23943i;
                    }
                    int i22 = c23943i2.f115909e;
                    c23943i3.f115909e = i22;
                    c23943i3.f115907c = str.substring(c23943i3.f115908d, i22);
                    ((C23944j) c23943i3).f115917m = 2;
                    m123120o.set(i19, c23943i3);
                }
                m123120o.remove(i11);
            } else {
                i11 = size;
            }
            size = i11 - 1;
            i14 = 0;
            i15 = 1;
            i16 = -1;
        }
        return m123124u(m123120o);
    }

    /* renamed from: s */
    public ArrayList m123126s(String str) {
        String lowerCase = m123123t(str.substring(0, Math.min(str.length(), f113894m))).replaceAll("\n", " ").toLowerCase();
        ArrayList m123125q = m123125q(lowerCase);
        int size = m123125q.size();
        boolean[] zArr = new boolean[size];
        for (int i11 = 0; i11 < size; i11++) {
            zArr[i11] = true;
        }
        ArrayList arrayList = new ArrayList();
        int size2 = m123125q.size() * 2;
        C23939e c23939e = null;
        int i12 = 0;
        boolean z11 = true;
        while (!m123125q.isEmpty()) {
            int i13 = i12 + 1;
            if (i12 >= size2) {
                break;
            }
            if (z11) {
                c23939e = new C23939e();
                z11 = false;
            }
            C23943i c23943i = (C23943i) m123125q.get(0);
            m123125q.remove(0);
            if (c23943i.mo125302b(c23939e) && c23939e.m125314g(lowerCase, c23943i)) {
                c23939e = c23943i.mo125305h(c23939e);
                c23939e.f115892k.add(c23943i);
            } else {
                boolean z12 = c23943i instanceof C23936b;
                if ((z12 || (c23943i instanceof C23942h)) && c23943i.f115911g != -1) {
                    m123125q.add(0, c23943i);
                } else if (!z12 && !(c23943i instanceof C23942h) && (!(c23943i instanceof C23941g) || !((C23941g) c23943i).m125315j())) {
                    m123125q.add(0, c23943i);
                }
                if (c23939e.m125313f()) {
                    C23941g c23941g = c23939e.f115890i;
                    if (c23941g != null) {
                        int m125310c = c23939e.m125310c(c23941g);
                        if (c23939e.f115891j == null && c23939e.f115889h == null) {
                            c23939e.f115884c = null;
                            c23939e.f115885d = null;
                            c23939e.f115886e = null;
                            c23939e.f115888g = null;
                            c23939e.f115889h = null;
                            c23939e.f115891j = null;
                            if (m125310c == 0) {
                                c23939e.f115892k.remove(0);
                            } else {
                                for (int size3 = c23939e.f115892k.size() - 1; size3 >= m125310c; size3--) {
                                    m123125q.add(0, (C23943i) c23939e.f115892k.get(size3));
                                    c23939e.f115892k.remove(size3);
                                }
                            }
                            C23939e c23939e2 = new C23939e();
                            for (int i14 = 0; i14 < c23939e.f115892k.size(); i14++) {
                                c23939e2 = ((C23943i) c23939e.f115892k.get(i14)).mo125305h(c23939e2);
                                c23939e2.f115892k.add((C23943i) c23939e.f115892k.get(i14));
                            }
                            if (c23939e2.m125313f()) {
                                c23939e2.f115893l = ((C23943i) c23939e2.f115892k.get(0)).f115908d;
                                ArrayList arrayList2 = c23939e2.f115892k;
                                c23939e2.f115894m = ((C23943i) arrayList2.get(arrayList2.size() - 1)).f115909e;
                            }
                            c23939e = c23939e2;
                        }
                    }
                    arrayList.add(c23939e);
                }
                z11 = true;
            }
            if (m123125q.isEmpty() && !z11 && c23939e.m125313f()) {
                C23941g c23941g2 = c23939e.f115890i;
                if (c23941g2 != null) {
                    int m125310c2 = c23939e.m125310c(c23941g2);
                    if (c23939e.f115891j == null && c23939e.f115889h == null) {
                        c23939e.f115884c = null;
                        c23939e.f115885d = null;
                        c23939e.f115886e = null;
                        c23939e.f115888g = null;
                        c23939e.f115889h = null;
                        c23939e.f115887f = null;
                        c23939e.f115891j = null;
                        if (m125310c2 == 0) {
                            c23939e.f115892k.remove(0);
                        } else {
                            for (int size4 = c23939e.f115892k.size() - 1; size4 >= m125310c2; size4--) {
                                m123125q.add(0, (C23943i) c23939e.f115892k.get(size4));
                                c23939e.f115892k.remove(size4);
                            }
                        }
                        C23939e c23939e3 = new C23939e();
                        for (int i15 = 0; i15 < c23939e.f115892k.size(); i15++) {
                            c23939e3 = ((C23943i) c23939e.f115892k.get(i15)).mo125305h(c23939e3);
                            c23939e3.f115892k.add((C23943i) c23939e.f115892k.get(i15));
                        }
                        if (c23939e3.m125313f()) {
                            c23939e3.f115893l = ((C23943i) c23939e3.f115892k.get(0)).f115908d;
                            ArrayList arrayList3 = c23939e3.f115892k;
                            c23939e3.f115894m = ((C23943i) arrayList3.get(arrayList3.size() - 1)).f115909e;
                        }
                        c23939e = c23939e3;
                        z11 = true;
                    }
                }
                arrayList.add(c23939e);
            }
            i12 = i13;
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((C23939e) arrayList.get(i16)).m125308a();
            ((C23939e) arrayList.get(i16)).f115882a = lowerCase.substring(((C23939e) arrayList.get(i16)).f115893l, ((C23939e) arrayList.get(i16)).f115894m);
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            if (!((C23939e) arrayList.get(size5)).m125309b(lowerCase)) {
                arrayList.remove(size5);
            }
        }
        return arrayList;
    }
}
