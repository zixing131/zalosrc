package com.vng.zing.vn.zrtc;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class UtilityJNI {
    public static final native void convert_nv21_to_i420(byte[] bArr, int i11, byte[] bArr2, int i12, int i13, int i14, ByteBuffer byteBuffer, int i15, ByteBuffer byteBuffer2, int i16, ByteBuffer byteBuffer3, int i17);

    public static final native void convert_nv21_to_i420_uv_plane_only(byte[] bArr, int i11, int i12, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
