package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* loaded from: classes2.dex */
public final class oc4 implements fd4 {

    /* renamed from: b */
    private final a63 f25599b;

    /* renamed from: c */
    private final a63 f25600c;

    public oc4(int i11, boolean z11) {
        mc4 mc4Var = new mc4(i11);
        nc4 nc4Var = new nc4(i11);
        this.f25599b = mc4Var;
        this.f25600c = nc4Var;
    }

    /* renamed from: a */
    public static /* synthetic */ HandlerThread m25154a(int i11) {
        String m25692l;
        m25692l = qc4.m25692l(i11, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(m25692l);
    }

    /* renamed from: b */
    public static /* synthetic */ HandlerThread m25155b(int i11) {
        String m25692l;
        m25692l = qc4.m25692l(i11, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(m25692l);
    }

    /* renamed from: c */
    public final qc4 m25156c(ed4 ed4Var) {
        MediaCodec mediaCodec;
        String str = ed4Var.f19593a.f21638a;
        qc4 qc4Var = null;
        try {
            int i11 = g92.f20474a;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                qc4 qc4Var2 = new qc4(mediaCodec, m25154a(((mc4) this.f25599b).f24464p), m25155b(((nc4) this.f25600c).f25130p), false, null);
                try {
                    Trace.endSection();
                    qc4.m25691k(qc4Var2, ed4Var.f19594b, ed4Var.f19596d, null, 0);
                    return qc4Var2;
                } catch (Exception e11) {
                    e = e11;
                    qc4Var = qc4Var2;
                    if (qc4Var == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        qc4Var.zzl();
                    }
                    throw e;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            mediaCodec = null;
        }
    }
}
