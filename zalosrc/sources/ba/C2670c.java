package ba;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: ba.c */
/* loaded from: classes3.dex */
final class C2670c extends AbstractC2669b {

    /* renamed from: d */
    private static Class f10690d;

    /* renamed from: b */
    private final Object f10691b = m13122d();

    /* renamed from: c */
    private final Field f10692c = m13121c();

    /* renamed from: c */
    private static Field m13121c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Object m13122d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f10690d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // ba.AbstractC2669b
    /* renamed from: b */
    public void mo13119b(AccessibleObject accessibleObject) {
        if (!m13123e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e11) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e11);
            }
        }
    }

    /* renamed from: e */
    boolean m13123e(AccessibleObject accessibleObject) {
        if (this.f10691b != null && this.f10692c != null) {
            try {
                f10690d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f10691b, accessibleObject, Long.valueOf(((Long) f10690d.getMethod("objectFieldOffset", Field.class).invoke(this.f10691b, this.f10692c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
