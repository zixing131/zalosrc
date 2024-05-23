package p706z6;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: z6.a */
/* loaded from: classes3.dex */
public final class C31682a implements InterfaceC31684c {

    /* renamed from: a */
    private final float f145529a;

    public C31682a(float f11) {
        this.f145529a = f11;
    }

    @Override // p706z6.InterfaceC31684c
    /* renamed from: a */
    public float mo152392a(RectF rectF) {
        return this.f145529a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C31682a) && this.f145529a == ((C31682a) obj).f145529a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f145529a)});
    }
}
