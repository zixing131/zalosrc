package p705z5;

import java.util.Set;

/* renamed from: z5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC31309b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m152216a(Set set) {
        int i11;
        int i12 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i11 = obj.hashCode();
            } else {
                i11 = 0;
            }
            i12 += i11;
        }
        return i12;
    }
}
