package p631x3;

import java.util.List;
import p566v3.C27495c;

/* renamed from: x3.b */
/* loaded from: classes2.dex */
public abstract class AbstractC29301b {
    /* renamed from: a */
    public static C27495c m146398a(List list, C27495c.b bVar) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (((C27495c) list.get(i11)).m140599e() == bVar) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 == -1) {
            return null;
        }
        return (C27495c) list.remove(i11);
    }
}
