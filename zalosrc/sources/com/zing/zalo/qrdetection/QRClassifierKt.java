package com.zing.zalo.qrdetection;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class QRClassifierKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native void normalizePixelValue(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, float f11, float f12, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void normalizePixelValueFromBitmap(Bitmap bitmap, ByteBuffer byteBuffer, float f11, float f12);
}
