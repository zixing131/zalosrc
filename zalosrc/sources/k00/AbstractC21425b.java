package k00;

/* renamed from: k00.b */
/* loaded from: classes4.dex */
public abstract class AbstractC21425b {
    /* renamed from: a */
    public static final boolean m110929a(float f11, float f12, float f13) {
        if (f11 == f12) {
            return true;
        }
        float abs = Math.abs(f11 - f12);
        if (f11 != 0.0f && f12 != 0.0f && abs >= Float.MIN_NORMAL) {
            if (abs / (Math.abs(f11) + Math.abs(f12)) < f13) {
                return true;
            }
        } else if (abs < f13 * Float.MIN_NORMAL) {
            return true;
        }
        return false;
    }
}
