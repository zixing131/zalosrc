package com.google.android.gms.internal.ads;

import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public class zzfq extends zzey {

    /* renamed from: q */
    public final wo2 f32130q;

    /* renamed from: r */
    public final int f32131r;

    public zzfq(wo2 wo2Var, int i11, int i12) {
        super(m28816b(2008, 1));
        this.f32130q = wo2Var;
        this.f32131r = 1;
    }

    /* renamed from: a */
    public static zzfq m28815a(IOException iOException, wo2 wo2Var, int i11) {
        int i12;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i12 = ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP;
        } else if (iOException instanceof InterruptedIOException) {
            i12 = 1004;
        } else if (message != null && q43.m25656a(message).matches("cleartext.*not permitted.*")) {
            i12 = 2007;
        } else {
            i12 = ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4;
        }
        if (i12 == 2007) {
            return new zzfp(iOException, wo2Var);
        }
        return new zzfq(iOException, wo2Var, i12, i11);
    }

    /* renamed from: b */
    private static int m28816b(int i11, int i12) {
        return i11 == 2000 ? i12 != 1 ? ZAbstractBase.ZVU_PROCESS_FLUSH : ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4 : i11;
    }

    public zzfq(IOException iOException, wo2 wo2Var, int i11, int i12) {
        super(iOException, m28816b(i11, i12));
        this.f32130q = wo2Var;
        this.f32131r = i12;
    }

    public zzfq(String str, wo2 wo2Var, int i11, int i12) {
        super(str, m28816b(i11, i12));
        this.f32130q = wo2Var;
        this.f32131r = i12;
    }

    public zzfq(String str, IOException iOException, wo2 wo2Var, int i11, int i12) {
        super(str, iOException, m28816b(i11, i12));
        this.f32130q = wo2Var;
        this.f32131r = i12;
    }
}
