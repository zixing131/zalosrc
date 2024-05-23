package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.internal.ads.u00;
import com.google.android.gms.internal.ads.yk0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes2.dex */
public final class NativeAdViewHolder {
    public static WeakHashMap zza = new WeakHashMap();

    @NotOnlyInitialized
    private u00 zzb;
    private WeakReference zzc;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        AbstractC4205o.m19723l(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            yk0.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        if (zza.get(view) != null) {
            yk0.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        zza.put(view, this);
        this.zzc = new WeakReference(view);
        this.zzb = zzaw.zza().zzh(view, zza(map), zza(map2));
    }

    private static final HashMap zza(Map map) {
        if (map == null) {
            return new HashMap();
        }
        return new HashMap(map);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzb.zzb(BinderC4273d.m19913I3(view));
        } catch (RemoteException e11) {
            yk0.zzh("Unable to call setClickConfirmingView on delegate", e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.dynamic.b, java.lang.Object] */
    public void setNativeAd(NativeAd nativeAd) {
        View view;
        ?? zza2 = nativeAd.zza();
        WeakReference weakReference = this.zzc;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (view == null) {
            yk0.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zza.containsKey(view)) {
            zza.put(view, this);
        }
        u00 u00Var = this.zzb;
        if (u00Var != 0) {
            try {
                u00Var.zzc(zza2);
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call setNativeAd on delegate", e11);
            }
        }
    }

    public void unregisterNativeAd() {
        View view;
        u00 u00Var = this.zzb;
        if (u00Var != null) {
            try {
                u00Var.zzd();
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call unregisterNativeAd on delegate", e11);
            }
        }
        WeakReference weakReference = this.zzc;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (view != null) {
            zza.remove(view);
        }
    }
}
