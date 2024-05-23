package s20;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import fn0.AbstractC19074t;
import java.io.Serializable;

/* renamed from: s20.d */
/* loaded from: classes5.dex */
public abstract class AbstractC26102d {
    /* renamed from: a */
    public static final void m134326a(Bundle bundle, String str, Object obj) {
        AbstractC19074t.m100208f(bundle, "<this>");
        if (obj == null) {
            bundle.putString(str, null);
            return;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Byte) {
            bundle.putByte(str, ((Number) obj).byteValue());
            return;
        }
        if (obj instanceof Character) {
            bundle.putChar(str, ((Character) obj).charValue());
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Float) {
            bundle.putFloat(str, ((Number) obj).floatValue());
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
        if (obj instanceof Short) {
            bundle.putShort(str, ((Number) obj).shortValue());
            return;
        }
        if (obj instanceof Bundle) {
            bundle.putBundle(str, (Bundle) obj);
            return;
        }
        if (obj instanceof CharSequence) {
            bundle.putCharSequence(str, (CharSequence) obj);
            return;
        }
        if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
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
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            bundle.putFloatArray(str, (float[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            bundle.putShortArray(str, (short[]) obj);
            return;
        }
        if (obj instanceof Object[]) {
            Class<?> componentType = obj.getClass().getComponentType();
            AbstractC19074t.m100205c(componentType);
            if (Parcelable.class.isAssignableFrom(componentType)) {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                bundle.putParcelableArray(str, (Parcelable[]) obj);
                return;
            }
            if (String.class.isAssignableFrom(componentType)) {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                bundle.putStringArray(str, (String[]) obj);
                return;
            }
            if (CharSequence.class.isAssignableFrom(componentType)) {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                return;
            } else {
                if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                    return;
                }
                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + "\"");
            }
        }
        if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
            return;
        }
        if (obj instanceof IBinder) {
            bundle.putBinder(str, (IBinder) obj);
            return;
        }
        if (obj instanceof Size) {
            bundle.putSize(str, (Size) obj);
            return;
        }
        throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + "\"");
    }
}
