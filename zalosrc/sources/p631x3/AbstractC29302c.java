package p631x3;

import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import p566v3.C27498f;

/* renamed from: x3.c */
/* loaded from: classes2.dex */
public abstract class AbstractC29302c {
    /* renamed from: a */
    public static boolean m146399a(List list) {
        if (list != null && list.size() != 0) {
            HashSet hashSet = new HashSet(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Integer valueOf = Integer.valueOf(((C27498f) list.get(i11)).m140608c());
                if (hashSet.contains(valueOf)) {
                    return false;
                }
                hashSet.add(valueOf);
            }
        }
        return true;
    }

    /* renamed from: b */
    public static Object m146400b(Object obj, boolean z11, String str) {
        if (z11) {
            return obj;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Illegal argument for %s.", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:            r7 = r7 + 1;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m146401c(float[][][] fArr, int i11) {
        if (i11 <= 1 && (fArr == null || fArr.length == 0)) {
            return true;
        }
        if (i11 - 1 != fArr.length) {
            return false;
        }
        int i12 = 0;
        while (i12 < fArr.length) {
            if (fArr[i12].length != 2) {
                return false;
            }
            int i13 = 0;
            while (true) {
                float[][] fArr2 = fArr[i12];
                if (i13 < fArr2.length) {
                    if (fArr2[i13].length != 2) {
                        return false;
                    }
                    i13++;
                }
            }
        }
        return true;
    }
}
