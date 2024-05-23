package p633x5;

import java.util.Set;

/* renamed from: x5.y */
/* loaded from: classes2.dex */
public abstract class AbstractC29380y {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m146520a(Set set) {
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
