package p314l4;

import android.util.SparseArray;
import java.util.HashMap;
import p668y3.EnumC30278d;

/* renamed from: l4.a */
/* loaded from: classes.dex */
public abstract class AbstractC22060a {

    /* renamed from: a */
    private static SparseArray f108655a = new SparseArray();

    /* renamed from: b */
    private static HashMap f108656b;

    static {
        HashMap hashMap = new HashMap();
        f108656b = hashMap;
        hashMap.put(EnumC30278d.DEFAULT, 0);
        f108656b.put(EnumC30278d.VERY_LOW, 1);
        f108656b.put(EnumC30278d.HIGHEST, 2);
        for (EnumC30278d enumC30278d : f108656b.keySet()) {
            f108655a.append(((Integer) f108656b.get(enumC30278d)).intValue(), enumC30278d);
        }
    }

    /* renamed from: a */
    public static int m115180a(EnumC30278d enumC30278d) {
        Integer num = (Integer) f108656b.get(enumC30278d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC30278d);
    }

    /* renamed from: b */
    public static EnumC30278d m115181b(int i11) {
        EnumC30278d enumC30278d = (EnumC30278d) f108655a.get(i11);
        if (enumC30278d != null) {
            return enumC30278d;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i11);
    }
}
