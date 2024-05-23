package p704z4;

import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.internal.AbstractC4199m;

/* renamed from: z4.b */
/* loaded from: classes2.dex */
public final class C31218b {

    /* renamed from: a */
    private final int f144241a;

    /* renamed from: b */
    private final C4071a f144242b;

    /* renamed from: c */
    private final C4071a.d f144243c;

    /* renamed from: d */
    private final String f144244d;

    private C31218b(C4071a c4071a, C4071a.d dVar, String str) {
        this.f144242b = c4071a;
        this.f144243c = dVar;
        this.f144244d = str;
        this.f144241a = AbstractC4199m.m19702b(c4071a, dVar, str);
    }

    /* renamed from: a */
    public static C31218b m152100a(C4071a c4071a, C4071a.d dVar, String str) {
        return new C31218b(c4071a, dVar, str);
    }

    /* renamed from: b */
    public final String m152101b() {
        return this.f144242b.m19229d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C31218b)) {
            return false;
        }
        C31218b c31218b = (C31218b) obj;
        if (!AbstractC4199m.m19701a(this.f144242b, c31218b.f144242b) || !AbstractC4199m.m19701a(this.f144243c, c31218b.f144243c) || !AbstractC4199m.m19701a(this.f144244d, c31218b.f144244d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f144241a;
    }
}
