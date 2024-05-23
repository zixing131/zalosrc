package com.google.android.gms.internal.ads;

import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzfs extends zzfq {

    /* renamed from: s */
    public final int f32132s;

    /* renamed from: t */
    public final String f32133t;

    /* renamed from: u */
    public final Map f32134u;

    /* renamed from: v */
    public final byte[] f32135v;

    public zzfs(int i11, String str, IOException iOException, Map map, wo2 wo2Var, byte[] bArr) {
        super("Response code: " + i11, iOException, wo2Var, ZAbstractBase.ZVU_PROCESS_HLS_TO_MP4, 1);
        this.f32132s = i11;
        this.f32133t = str;
        this.f32134u = map;
        this.f32135v = bArr;
    }
}
