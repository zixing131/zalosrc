package p440q8;

import java.util.HashMap;

/* renamed from: q8.c */
/* loaded from: classes.dex */
public class C25159c implements InterfaceC25160d {

    /* renamed from: a */
    private final int f120730a;

    public C25159c(int i11) {
        this.f120730a = i11;
    }

    /* renamed from: b */
    private static boolean m130300b(StackTraceElement[] stackTraceElementArr, int i11, int i12) {
        int i13 = i12 - i11;
        if (i12 + i13 > stackTraceElementArr.length) {
            return false;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (!stackTraceElementArr[i11 + i14].equals(stackTraceElementArr[i12 + i14])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static StackTraceElement[] m130301c(StackTraceElement[] stackTraceElementArr, int i11) {
        int i12;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i13 = 0;
        int i14 = 0;
        int i15 = 1;
        while (i13 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i13];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null && m130300b(stackTraceElementArr, num.intValue(), i13)) {
                int intValue = i13 - num.intValue();
                if (i15 < i11) {
                    System.arraycopy(stackTraceElementArr, i13, stackTraceElementArr2, i14, intValue);
                    i14 += intValue;
                    i15++;
                }
                i12 = (intValue - 1) + i13;
            } else {
                stackTraceElementArr2[i14] = stackTraceElementArr[i13];
                i14++;
                i12 = i13;
                i15 = 1;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i13));
            i13 = i12 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i14];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i14);
        return stackTraceElementArr3;
    }

    @Override // p440q8.InterfaceC25160d
    /* renamed from: a */
    public StackTraceElement[] mo130299a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] m130301c = m130301c(stackTraceElementArr, this.f120730a);
        if (m130301c.length < stackTraceElementArr.length) {
            return m130301c;
        }
        return stackTraceElementArr;
    }
}
