package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.o00;
import com.google.android.gms.internal.ads.yk0;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes2.dex */
public final class NativeAdView extends FrameLayout {

    @NotOnlyInitialized
    private final FrameLayout zza;

    @NotOnlyInitialized
    private final o00 zzb;

    public NativeAdView(Context context) {
        super(context);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @RequiresNonNull({"overlayFrame"})
    private final o00 zze() {
        if (isInEditMode()) {
            return null;
        }
        return zzaw.zza().zzg(this.zza.getContext(), this, this.zza);
    }

    private final void zzf(String str, View view) {
        o00 o00Var = this.zzb;
        if (o00Var != null) {
            try {
                o00Var.zzbw(str, BinderC4273d.m19913I3(view));
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call setAssetView on delegate", e11);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        o00 o00Var = this.zzb;
        if (o00Var != null) {
            try {
                o00Var.zzc();
            } catch (RemoteException e11) {
                yk0.zzh("Unable to destroy native ad view", e11);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        o00 o00Var;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20994G2)).booleanValue() && (o00Var = this.zzb) != null) {
            try {
                o00Var.zzd(BinderC4273d.m19913I3(motionEvent));
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call handleTouchEvent on delegate", e11);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View zza = zza("3011");
        if (zza instanceof AdChoicesView) {
            return (AdChoicesView) zza;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return zza("3005");
    }

    public final View getBodyView() {
        return zza("3004");
    }

    public final View getCallToActionView() {
        return zza("3002");
    }

    public final View getHeadlineView() {
        return zza("3001");
    }

    public final View getIconView() {
        return zza("3003");
    }

    public final View getImageView() {
        return zza("3008");
    }

    public final MediaView getMediaView() {
        View zza = zza("3010");
        if (zza instanceof MediaView) {
            return (MediaView) zza;
        }
        if (zza != null) {
            yk0.zze("View is not an instance of MediaView");
            return null;
        }
        return null;
    }

    public final View getPriceView() {
        return zza("3007");
    }

    public final View getStarRatingView() {
        return zza("3009");
    }

    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        o00 o00Var = this.zzb;
        if (o00Var != null) {
            try {
                o00Var.zze(BinderC4273d.m19913I3(view), i11);
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call onVisibilityChanged on delegate", e11);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zzf("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        zzf("3005", view);
    }

    public final void setBodyView(View view) {
        zzf("3004", view);
    }

    public final void setCallToActionView(View view) {
        zzf("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        o00 o00Var = this.zzb;
        if (o00Var != null) {
            try {
                o00Var.zzbx(BinderC4273d.m19913I3(view));
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call setClickConfirmingView on delegate", e11);
            }
        }
    }

    public final void setHeadlineView(View view) {
        zzf("3001", view);
    }

    public final void setIconView(View view) {
        zzf("3003", view);
    }

    public final void setImageView(View view) {
        zzf("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        zzf("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzb(this));
        mediaView.zzb(new zzc(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.dynamic.b, java.lang.Object] */
    public void setNativeAd(NativeAd nativeAd) {
        o00 o00Var = this.zzb;
        if (o00Var != 0) {
            try {
                o00Var.zzbA(nativeAd.zza());
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call setNativeAd on delegate", e11);
            }
        }
    }

    public final void setPriceView(View view) {
        zzf("3007", view);
    }

    public final void setStarRatingView(View view) {
        zzf("3009", view);
    }

    public final void setStoreView(View view) {
        zzf("3006", view);
    }

    protected final View zza(String str) {
        o00 o00Var = this.zzb;
        if (o00Var != null) {
            try {
                InterfaceC4271b zzb = o00Var.zzb(str);
                if (zzb != null) {
                    return (View) BinderC4273d.m19914Q(zzb);
                }
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call getAssetView on delegate", e11);
            }
        }
        return null;
    }

    public final /* synthetic */ void zzb(MediaContent mediaContent) {
        o00 o00Var = this.zzb;
        if (o00Var == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzej) {
                o00Var.zzby(((zzej) mediaContent).zzb());
            } else if (mediaContent == null) {
                o00Var.zzby(null);
            } else {
                yk0.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e11) {
            yk0.zzh("Unable to call setMediaContent on delegate", e11);
        }
    }

    public final /* synthetic */ void zzc(ImageView.ScaleType scaleType) {
        o00 o00Var = this.zzb;
        if (o00Var != null && scaleType != null) {
            try {
                o00Var.zzbz(BinderC4273d.m19913I3(scaleType));
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call setMediaViewImageScaleType on delegate", e11);
            }
        }
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.zza = zzd(context);
        this.zzb = zze();
    }
}
