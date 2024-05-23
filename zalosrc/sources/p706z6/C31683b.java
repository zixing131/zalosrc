package p706z6;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: z6.b */
/* loaded from: classes3.dex */
public final class C31683b implements InterfaceC31684c {

    /* renamed from: a */
    private final InterfaceC31684c f145530a;

    /* renamed from: b */
    private final float f145531b;

    public C31683b(float f11, InterfaceC31684c interfaceC31684c) {
        while (interfaceC31684c instanceof C31683b) {
            interfaceC31684c = ((C31683b) interfaceC31684c).f145530a;
            f11 += ((C31683b) interfaceC31684c).f145531b;
        }
        this.f145530a = interfaceC31684c;
        this.f145531b = f11;
    }

    @Override // p706z6.InterfaceC31684c
    /* renamed from: a */
    public float mo152392a(RectF rectF) {
        return Math.max(0.0f, this.f145530a.mo152392a(rectF) + this.f145531b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31683b)) {
            return false;
        }
        C31683b c31683b = (C31683b) obj;
        if (this.f145530a.equals(c31683b.f145530a) && this.f145531b == c31683b.f145531b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f145530a, Float.valueOf(this.f145531b)});
    }
}
