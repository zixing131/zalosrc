package p620wt;

import android.os.Bundle;
import android.os.Parcelable;
import fn0.AbstractC19074t;
import java.io.Serializable;

/* renamed from: wt.b */
/* loaded from: classes4.dex */
public abstract class AbstractC29227b {
    /* renamed from: a */
    public static final void m145978a(Bundle bundle, String str, Object obj, Object obj2) {
        AbstractC19074t.m100208f(bundle, "<this>");
        if (obj != null && !AbstractC19074t.m100204b(obj, obj2)) {
            if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
                return;
            }
            if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
                return;
            }
            if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
                return;
            }
            if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
                return;
            }
            if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
                return;
            }
            if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
                return;
            }
            if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
                return;
            }
            if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
                return;
            }
            if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else {
                if (obj instanceof long[]) {
                    bundle.putLongArray(str, (long[]) obj);
                    return;
                }
                throw new IllegalArgumentException(AbstractC19074t.m100216n("Unsupported type ", obj.getClass()));
            }
        }
    }

    /* renamed from: b */
    public static final void m145979b(Bundle bundle, String str, String str2) {
        AbstractC19074t.m100208f(bundle, "<this>");
        if (str2 != null && str2.length() != 0) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: c */
    public static final void m145980c(Bundle bundle, String str, Object obj) {
        AbstractC19074t.m100208f(bundle, "<this>");
        m145978a(bundle, str, obj, null);
    }
}
