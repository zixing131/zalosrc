package au;

import android.text.TextUtils;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Map;
import mm0.AbstractC23350e;
import pm0.C24848g0;

/* renamed from: au.e */
/* loaded from: classes4.dex */
public final class C2343e {

    /* renamed from: a */
    public static final C2343e f9847a = new C2343e();

    /* renamed from: b */
    private static final String f9848b = C2343e.class.getSimpleName();

    /* renamed from: c */
    private static final int[] f9849c = {-6234498, -9251331, -8211969, -16712451, -12950, -30626, -211293, -2055437};

    /* renamed from: d */
    private static final int[] f9850d = {-11220120, -13984015, -10067969, -11875123, -22436, -44694, -1084364, -2725395};

    /* renamed from: e */
    private static final Map f9851e = new HashMap();

    private C2343e() {
    }

    /* renamed from: a */
    public static final int m12307a(String str, boolean z11) {
        return m12308b(str, z11, false);
    }

    /* renamed from: b */
    public static final int m12308b(String str, boolean z11, boolean z12) {
        int i11;
        try {
            if (TextUtils.isEmpty(str)) {
                return -6234498;
            }
            int i12 = 0;
            if (str != null) {
                i11 = str.hashCode();
            } else {
                i11 = 0;
            }
            int abs = Math.abs(i11);
            int[] iArr = f9849c;
            int length = (abs % iArr.length) + (z12 ? 1 : 0);
            if (length < iArr.length) {
                i12 = length;
            }
            return iArr[i12];
        } catch (Exception e11) {
            AbstractC23350e.m122774d(f9848b, e11.toString());
            return -6234498;
        }
    }

    /* renamed from: c */
    public static final int m12309c(int i11) {
        try {
            Map map = f9851e;
            if (map.isEmpty()) {
                synchronized (map) {
                    try {
                        if (map.isEmpty()) {
                            int length = f9849c.length;
                            for (int i12 = 0; i12 < length; i12++) {
                                f9851e.put(Integer.valueOf(f9849c[i12]), Integer.valueOf(f9850d[i12]));
                            }
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } finally {
                    }
                }
            }
            Map map2 = f9851e;
            if (map2.containsKey(Integer.valueOf(i11))) {
                Object obj = map2.get(Integer.valueOf(i11));
                AbstractC19074t.m100205c(obj);
                return ((Number) obj).intValue();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d(f9848b, e11.toString());
        }
        return 0;
    }
}
