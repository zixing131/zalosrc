package dj;

import dj.C17985n1;
import fn0.AbstractC19074t;

/* renamed from: dj.m1 */
/* loaded from: classes3.dex */
public final class C17982m1 extends C17985n1 {
    public C17982m1(boolean z11, C17985n1.b bVar) {
        super(z11, bVar);
    }

    @Override // dj.C17985n1
    /* renamed from: d */
    public int mo95629d(C17945a0 c17945a0, int i11) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (c17945a0.m95143g7()) {
            return (int) (5 + (i11 * 0.95f));
        }
        if (c17945a0.m95121e7() && m95641k() > 0) {
            return 100;
        }
        return 0;
    }

    @Override // dj.C17985n1
    /* renamed from: e */
    public int mo95630e(C17945a0 c17945a0, int i11, int i12, int i13, boolean z11) {
        float f11;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (c17945a0.m95152h7()) {
            float f12 = 10;
            float f13 = i12;
            if (z11) {
                f11 = 0.05f;
            } else {
                f11 = 0.0f;
            }
            return (int) (f12 + (f13 * (0.9f - f11)));
        }
        if (c17945a0.m95199m7() && m95641k() > 0) {
            return 100;
        }
        return 0;
    }
}
