package my;

import android.graphics.Bitmap;
import fn0.AbstractC19074t;

/* renamed from: my.c */
/* loaded from: classes4.dex */
public final class C23480c extends AbstractC23482e {

    /* renamed from: d */
    private final Bitmap f114007d;

    /* renamed from: e */
    private final String f114008e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23480c(Bitmap bitmap, String str, float f11, long j11, long j12) {
        super(f11, j11, j12, null);
        AbstractC19074t.m100208f(bitmap, "bitmap");
        AbstractC19074t.m100208f(str, "path");
        this.f114007d = bitmap;
        this.f114008e = str;
    }

    /* renamed from: d */
    public final Bitmap m123261d() {
        return this.f114007d;
    }

    /* renamed from: e */
    public final String m123262e() {
        return this.f114008e;
    }
}
