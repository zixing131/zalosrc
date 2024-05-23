package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class sc0 extends NativeAd.AdChoicesInfo {

    /* renamed from: a */
    private final List f27612a = new ArrayList();

    /* renamed from: b */
    private String f27613b;

    public sc0(b00 b00Var) {
        k00 k00Var;
        try {
            this.f27613b = b00Var.zzg();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            this.f27613b = "";
        }
        try {
            for (Object obj : b00Var.zzh()) {
                if (obj instanceof IBinder) {
                    k00Var = j00.m23497N((IBinder) obj);
                } else {
                    k00Var = null;
                }
                if (k00Var != null) {
                    this.f27612a.add(new uc0(k00Var));
                }
            }
        } catch (RemoteException e12) {
            yk0.zzh("", e12);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.f27612a;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f27613b;
    }
}
