package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.th */
/* loaded from: classes2.dex */
public abstract class AbstractC5020th {

    /* renamed from: a */
    private static final int[] f28326a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f28327b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f28328c = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: d */
    public static final /* synthetic */ int f28329d = 0;

    /* renamed from: a */
    public static int m26611a(ByteBuffer byteBuffer) {
        int i11 = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i11 = f28326a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i11 * 256;
    }

    /* renamed from: b */
    public static zzasw m26612b(C4655jo c4655jo, String str, String str2, zzauv zzauvVar) {
        int i11 = f28327b[(c4655jo.m23671g() & 192) >> 6];
        int m23671g = c4655jo.m23671g();
        int i12 = f28328c[(m23671g & 56) >> 3];
        if ((m23671g & 4) != 0) {
            i12++;
        }
        return zzasw.m28679g(str, "audio/ac3", null, -1, -1, i12, i11, null, zzauvVar, 0, str2);
    }

    /* renamed from: c */
    public static zzasw m26613c(C4655jo c4655jo, String str, String str2, zzauv zzauvVar) {
        c4655jo.m23687w(2);
        int i11 = f28327b[(c4655jo.m23671g() & 192) >> 6];
        int m23671g = c4655jo.m23671g();
        int i12 = f28328c[(m23671g & 14) >> 1];
        if ((m23671g & 1) != 0) {
            i12++;
        }
        return zzasw.m28679g(str, "audio/eac3", null, -1, -1, i12, i11, null, zzauvVar, 0, str2);
    }
}
