package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c00 extends NativeAd.AdChoicesInfo {

    /* renamed from: a */
    private final b00 f18064a;

    /* renamed from: b */
    private final List f18065b = new ArrayList();

    /* renamed from: c */
    private String f18066c;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:            r4.f18065b.add(new com.google.android.gms.internal.ads.l00(r3));     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c00(b00 b00Var) {
        IBinder iBinder;
        this.f18064a = b00Var;
        try {
            this.f18066c = b00Var.zzg();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            this.f18066c = "";
        }
        try {
            for (Object obj : b00Var.zzh()) {
                k00 k00Var = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    k00Var = queryLocalInterface instanceof k00 ? (k00) queryLocalInterface : new i00(iBinder);
                }
            }
        } catch (RemoteException e12) {
            yk0.zzh("", e12);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.f18065b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f18066c;
    }
}
