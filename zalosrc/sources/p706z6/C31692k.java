package p706z6;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: z6.k */
/* loaded from: classes3.dex */
public final class C31692k implements InterfaceC31684c {

    /* renamed from: a */
    private final float f145584a;

    public C31692k(float f11) {
        this.f145584a = f11;
    }

    @Override // p706z6.InterfaceC31684c
    /* renamed from: a */
    public float mo152392a(RectF rectF) {
        return this.f145584a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C31692k) && this.f145584a == ((C31692k) obj).f145584a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f145584a)});
    }
}
