package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4199m;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public abstract class zk0 {
    /* renamed from: a */
    public static boolean m28532a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj != null && obj2 != null) {
                    if (obj instanceof Bundle) {
                        if (!(obj2 instanceof Bundle) || !m28532a((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if (obj.getClass().isArray()) {
                        int length = Array.getLength(obj);
                        if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                            return false;
                        }
                        for (int i11 = 0; i11 < length; i11++) {
                            if (!AbstractC4199m.m19701a(Array.get(obj, i11), Array.get(obj2, i11))) {
                                return false;
                            }
                        }
                    } else if (!obj.equals(obj2)) {
                        return false;
                    }
                } else {
                    if (obj == null && obj2 == null) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }
        if (bundle == null && bundle2 == null) {
            return true;
        }
        return false;
    }
}
