package com.zing.zalo.zqrcode;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class QRCodeManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    public static final native Result nativeDecodeBitmap(Bitmap bitmap, boolean z11);

    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    public static final native Result nativeDecodeDataY(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, int i15);

    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    public static final native Result nativeDecodeDataYUV(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    public static final native Bitmap nativeEncodeString(byte[] bArr, int i11, int i12, char c11, int i13, int i14, int i15, String str);
}
