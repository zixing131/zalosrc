package bm0;

import android.graphics.Bitmap;
import fn0.AbstractC19074t;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p385oa.C24141a;

/* renamed from: bm0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC2849c implements Closeable {
    /* renamed from: d */
    public static /* synthetic */ Object m13734d(AbstractC2849c abstractC2849c, Bitmap bitmap, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return abstractC2849c.m13735a(bitmap, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: process");
    }

    /* renamed from: a */
    public final Object m13735a(Bitmap bitmap, int i11) {
        AbstractC19074t.m100208f(bitmap, "bitmap");
        C24141a m126114a = C24141a.m126114a(bitmap, i11);
        AbstractC19074t.m100207e(m126114a, "fromBitmap(bitmap, rotationDegree)");
        return mo13738f(m126114a);
    }

    /* renamed from: b */
    public final Object m13736b(ByteBuffer byteBuffer, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(byteBuffer, "yuvBuffer");
        C24141a m126116c = C24141a.m126116c(byteBuffer, i11, i12, i13, 17);
        AbstractC19074t.m100207e(m126116c, "fromByteBuffer(yuvBuffer…tImage.IMAGE_FORMAT_NV21)");
        return mo13738f(m126116c);
    }

    /* renamed from: c */
    public final Object m13737c(byte[] bArr, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(bArr, "yuvData");
        C24141a m126115b = C24141a.m126115b(bArr, i11, i12, i13, 17);
        AbstractC19074t.m100207e(m126115b, "fromByteArray(yuvData, w…tImage.IMAGE_FORMAT_NV21)");
        return mo13738f(m126115b);
    }

    /* renamed from: f */
    protected abstract Object mo13738f(C24141a c24141a);
}
