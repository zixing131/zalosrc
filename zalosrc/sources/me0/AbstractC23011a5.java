package me0;

import ag0.C0804b;
import au.AbstractC2368q0;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p348mi.AbstractC23309i;
import p394oj.C24275a;
import p716zh.C31870c7;

/* renamed from: me0.a5 */
/* loaded from: classes4.dex */
public abstract class AbstractC23011a5 {

    /* renamed from: a */
    static ArrayList f111963a;

    static {
        ArrayList arrayList = new ArrayList(1);
        f111963a = arrayList;
        arrayList.add(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:            if (r5 != false) goto L12;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:            if (r6 != false) goto L12;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m117977a(String str, boolean z11, boolean z12) {
        boolean m121074J4 = AbstractC23309i.m121074J4();
        int m117978b = m117978b(str);
        boolean z13 = true;
        if (m117978b != 2) {
            if (m117978b != 3) {
                return false;
            }
            if (m121074J4) {
                if (!z11) {
                }
            }
            z13 = false;
        } else {
            if (m121074J4) {
            }
            z13 = false;
        }
        return z13;
    }

    /* renamed from: b */
    public static int m117978b(String str) {
        C24275a m2032f = C0804b.m2025g().m2032f(str);
        if (m2032f != null) {
            return m2032f.m126770g();
        }
        return 0;
    }

    /* renamed from: c */
    public static void m117979c(String str, List list, ArrayList arrayList, boolean z11, boolean z12) {
        ArrayList m153175a;
        if (list == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((C31870c7) it.next()).f146366b);
        }
        String lowerCase = str.replace('-', ' ').toLowerCase();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C31870c7 c31870c7 = (C31870c7) it2.next();
            if (c31870c7 != null && !hashSet.contains(c31870c7.f146366b) && (z12 || !c31870c7.f146366b.equals(CoreUtility.f89233i))) {
                String m153176b = c31870c7.m153176b();
                if (z11) {
                    m153175a = f111963a;
                } else {
                    m153175a = c31870c7.m153175a();
                }
                Iterator it3 = m153175a.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        int intValue = ((Integer) it3.next()).intValue();
                        for (int i11 = 0; i11 < lowerCase.length(); i11++) {
                            int i12 = intValue + i11;
                            if (i12 >= m153176b.length()) {
                                break;
                            }
                            char charAt = lowerCase.charAt(i11);
                            char charAt2 = m153176b.charAt(i12);
                            if (AbstractC2368q0.m12390e(charAt) == AbstractC2368q0.m12390e(charAt2) && ((AbstractC2368q0.m12389d(charAt) == 0 || AbstractC2368q0.m12389d(charAt) == AbstractC2368q0.m12389d(charAt2)) && (AbstractC2368q0.m12388c(charAt) == 0 || AbstractC2368q0.m12388c(charAt) == AbstractC2368q0.m12388c(charAt2)))) {
                            }
                        }
                        arrayList.add(c31870c7);
                        break;
                    }
                }
            }
        }
    }
}
