package com.zing.zalo.zqrcode;

import fn0.AbstractC19074t;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class YuvImageHelperKt {
    /* renamed from: a */
    public static final void m92588a(ByteBuffer byteBuffer, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14) {
        AbstractC19074t.m100208f(byteBuffer, "src");
        AbstractC19074t.m100208f(byteBuffer2, "dst");
        int i15 = i13 / 2;
        int i16 = i13 * i14;
        int i17 = (i14 / 2) * i15;
        int i18 = (i17 * 2) + i16;
        if (byteBuffer2.capacity() >= i18) {
            byteBuffer2.position(0);
            ByteBuffer slice = byteBuffer2.slice();
            byteBuffer2.position(i16);
            ByteBuffer slice2 = byteBuffer2.slice();
            byteBuffer2.position(i17 + i16);
            ByteBuffer slice3 = byteBuffer2.slice();
            int i19 = i11 / 2;
            int i21 = i12 * i11;
            int i22 = ((i12 / 2) * i19) + i21;
            byteBuffer.position(0);
            ByteBuffer slice4 = byteBuffer.slice();
            byteBuffer.position(i21);
            ByteBuffer slice5 = byteBuffer.slice();
            byteBuffer.position(i22);
            ByteBuffer slice6 = byteBuffer.slice();
            AbstractC19074t.m100207e(slice4, "srcY");
            AbstractC19074t.m100207e(slice5, "srcU");
            AbstractC19074t.m100207e(slice6, "srcV");
            AbstractC19074t.m100207e(slice, "dstY");
            AbstractC19074t.m100207e(slice2, "dstU");
            AbstractC19074t.m100207e(slice3, "dstV");
            nativeI420Scale(slice4, i11, slice5, i19, slice6, i19, i11, i12, slice, i13, slice2, i15, slice3, i15, i13, i14);
            return;
        }
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i18 + " was " + byteBuffer2.capacity());
    }

    /* renamed from: b */
    public static final void m92589b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i11, int i12) {
        AbstractC19074t.m100208f(byteBuffer, "src");
        AbstractC19074t.m100208f(byteBuffer2, "dst");
        int i13 = i11 / 2;
        int i14 = i11 * i12;
        int i15 = (i12 / 2) * i13;
        int i16 = (i15 * 2) + i14;
        if (byteBuffer2.capacity() >= i16) {
            byteBuffer2.position(0);
            ByteBuffer slice = byteBuffer2.slice();
            byteBuffer2.position(i14);
            ByteBuffer slice2 = byteBuffer2.slice();
            int i17 = i15 + i14;
            byteBuffer.position(0);
            ByteBuffer slice3 = byteBuffer.slice();
            byteBuffer.position(i14);
            ByteBuffer slice4 = byteBuffer.slice();
            byteBuffer.position(i17);
            ByteBuffer slice5 = byteBuffer.slice();
            AbstractC19074t.m100207e(slice3, "srcY");
            AbstractC19074t.m100207e(slice4, "srcU");
            AbstractC19074t.m100207e(slice5, "srcV");
            AbstractC19074t.m100207e(slice, "dstY");
            AbstractC19074t.m100207e(slice2, "dstUV");
            nativeI420ToNV21(slice3, i11, slice4, i13, slice5, i13, slice, i11, slice2, i13 * 2, i11, i12);
            return;
        }
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i16 + " was " + byteBuffer2.capacity());
    }

    /* renamed from: c */
    public static final void m92590c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i11, int i12) {
        AbstractC19074t.m100208f(byteBuffer, "src");
        AbstractC19074t.m100208f(byteBuffer2, "dst");
        int i13 = i11 / 2;
        int i14 = i11 * i12;
        int i15 = (i12 / 2) * i13;
        int i16 = (i15 * 2) + i14;
        if (byteBuffer2.capacity() >= i16) {
            byteBuffer.position(0);
            ByteBuffer slice = byteBuffer.slice();
            byteBuffer.position(i14);
            ByteBuffer slice2 = byteBuffer.slice();
            byteBuffer2.position(0);
            ByteBuffer slice3 = byteBuffer2.slice();
            byteBuffer2.position(i14);
            ByteBuffer slice4 = byteBuffer2.slice();
            byteBuffer2.position(i15 + i14);
            ByteBuffer slice5 = byteBuffer2.slice();
            AbstractC19074t.m100207e(slice, "srcY");
            AbstractC19074t.m100207e(slice2, "srcUV");
            AbstractC19074t.m100207e(slice3, "dstY");
            AbstractC19074t.m100207e(slice4, "dstU");
            AbstractC19074t.m100207e(slice5, "dstV");
            nativeNV21ToI420(slice, i11, slice2, i13 * 2, slice3, i11, slice4, i13, slice5, i13, i11, i12);
            return;
        }
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i16 + " was " + byteBuffer2.capacity());
    }

    private static final native void nativeI420Rotate(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, ByteBuffer byteBuffer6, int i16, int i17, int i18, int i19);

    private static final native void nativeI420Scale(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, int i14, int i15, ByteBuffer byteBuffer4, int i16, ByteBuffer byteBuffer5, int i17, ByteBuffer byteBuffer6, int i18, int i19, int i21);

    private static final native void nativeI420ToABGR(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16);

    private static final native void nativeI420ToARGB(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16);

    private static final native void nativeI420ToNV21(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, int i16, int i17);

    private static final native void nativeNV21ToI420(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, int i16, int i17);
}
