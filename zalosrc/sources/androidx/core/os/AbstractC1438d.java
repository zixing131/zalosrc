package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import fn0.AbstractC19074t;
import java.io.Serializable;
import pm0.C24860q;

/* renamed from: androidx.core.os.d */
/* loaded from: classes2.dex */
public abstract class AbstractC1438d {
    /* renamed from: a */
    public static final Bundle m7340a() {
        return new Bundle(0);
    }

    /* renamed from: b */
    public static final Bundle m7341b(C24860q... c24860qArr) {
        AbstractC19074t.m100208f(c24860qArr, "pairs");
        Bundle bundle = new Bundle(c24860qArr.length);
        for (C24860q c24860q : c24860qArr) {
            String str = (String) c24860q.m129213a();
            Object m129214b = c24860q.m129214b();
            if (m129214b == null) {
                bundle.putString(str, null);
            } else if (m129214b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) m129214b).booleanValue());
            } else if (m129214b instanceof Byte) {
                bundle.putByte(str, ((Number) m129214b).byteValue());
            } else if (m129214b instanceof Character) {
                bundle.putChar(str, ((Character) m129214b).charValue());
            } else if (m129214b instanceof Double) {
                bundle.putDouble(str, ((Number) m129214b).doubleValue());
            } else if (m129214b instanceof Float) {
                bundle.putFloat(str, ((Number) m129214b).floatValue());
            } else if (m129214b instanceof Integer) {
                bundle.putInt(str, ((Number) m129214b).intValue());
            } else if (m129214b instanceof Long) {
                bundle.putLong(str, ((Number) m129214b).longValue());
            } else if (m129214b instanceof Short) {
                bundle.putShort(str, ((Number) m129214b).shortValue());
            } else if (m129214b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) m129214b);
            } else if (m129214b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) m129214b);
            } else if (m129214b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) m129214b);
            } else if (m129214b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) m129214b);
            } else if (m129214b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) m129214b);
            } else if (m129214b instanceof char[]) {
                bundle.putCharArray(str, (char[]) m129214b);
            } else if (m129214b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) m129214b);
            } else if (m129214b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) m129214b);
            } else if (m129214b instanceof int[]) {
                bundle.putIntArray(str, (int[]) m129214b);
            } else if (m129214b instanceof long[]) {
                bundle.putLongArray(str, (long[]) m129214b);
            } else if (m129214b instanceof short[]) {
                bundle.putShortArray(str, (short[]) m129214b);
            } else if (m129214b instanceof Object[]) {
                Class<?> componentType = m129214b.getClass().getComponentType();
                AbstractC19074t.m100205c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    AbstractC19074t.m100206d(m129214b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) m129214b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    AbstractC19074t.m100206d(m129214b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) m129214b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    AbstractC19074t.m100206d(m129214b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) m129214b);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) m129214b);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (m129214b instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) m129214b);
            } else if (m129214b instanceof IBinder) {
                C1436b.m7337a(bundle, str, (IBinder) m129214b);
            } else if (m129214b instanceof Size) {
                C1437c.m7338a(bundle, str, (Size) m129214b);
            } else if (m129214b instanceof SizeF) {
                C1437c.m7339b(bundle, str, (SizeF) m129214b);
            } else {
                throw new IllegalArgumentException("Illegal value type " + m129214b.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }
}
