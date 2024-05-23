package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class k94 {

    /* renamed from: a */
    private static final AudioAttributes f23197a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    /* renamed from: a */
    public static int m23858a(int i11, int i12) {
        boolean isDirectPlaybackSupported;
        for (int i13 = 8; i13 > 0; i13--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i12).setChannelMask(g92.m22326T(i13)).build(), f23197a);
            if (isDirectPlaybackSupported) {
                return i13;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static int[] m23859b() {
        f83 f83Var;
        boolean isDirectPlaybackSupported;
        z73 m20826p = c83.m20826p();
        f83Var = l94.f23800e;
        ba3 mo20838k = f83Var.keySet().mo20838k();
        while (mo20838k.hasNext()) {
            int intValue = ((Integer) mo20838k.next()).intValue();
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f23197a);
            if (isDirectPlaybackSupported) {
                m20826p.m28452f(Integer.valueOf(intValue));
            }
        }
        m20826p.m28452f(2);
        Object[] array = m20826p.m28454h().toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = array[i11];
            obj.getClass();
            iArr[i11] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
