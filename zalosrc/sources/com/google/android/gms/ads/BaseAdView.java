package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC5149wy;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.yk0;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes2.dex */
public abstract class BaseAdView extends ViewGroup {

    @NotOnlyInitialized
    protected final zzdu zza;

    public BaseAdView(Context context, int i11) {
        super(context);
        this.zza = new zzdu(this, i11);
    }

    public void destroy() {
        AbstractC4554gx.m22622c(getContext());
        if (((Boolean) AbstractC5149wy.f30257e.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21030J8)).booleanValue()) {
                nk0.f25222b.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    public /* synthetic */ zze() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.zza.zzk();
                        } catch (IllegalStateException e11) {
                            se0.m26287c(baseAdView.getContext()).mo26290b(e11, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzk();
    }

    public AdListener getAdListener() {
        return this.zza.zza();
    }

    public AdSize getAdSize() {
        return this.zza.zzb();
    }

    public String getAdUnitId() {
        return this.zza.zzj();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzc();
    }

    public ResponseInfo getResponseInfo() {
        return this.zza.zzd();
    }

    public boolean isLoading() {
        return this.zza.zzA();
    }

    public void loadAd(AdRequest adRequest) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        AbstractC4554gx.m22622c(getContext());
        if (((Boolean) AbstractC5149wy.f30258f.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                nk0.f25222b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzc
                    public final /* synthetic */ AdRequest zzb;

                    public /* synthetic */ zzc(AdRequest adRequest2) {
                        r2 = adRequest2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.zza.zzm(r2.zza());
                        } catch (IllegalStateException e11) {
                            se0.m26287c(baseAdView.getContext()).mo26290b(e11, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzm(adRequest2.zza());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i15 = ((i13 - i11) - measuredWidth) / 2;
            int i16 = ((i14 - i12) - measuredHeight) / 2;
            childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        AdSize adSize;
        int i13;
        int i14 = 0;
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i11, i12);
            i14 = childAt.getMeasuredWidth();
            i13 = childAt.getMeasuredHeight();
        } else {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e11) {
                yk0.zzh("Unable to retrieve ad size.", e11);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i13 = adSize.getHeightInPixels(context);
                i14 = widthInPixels;
            } else {
                i13 = 0;
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i14, getSuggestedMinimumWidth()), i11), View.resolveSize(Math.max(i13, getSuggestedMinimumHeight()), i12));
    }

    public void pause() {
        AbstractC4554gx.m22622c(getContext());
        if (((Boolean) AbstractC5149wy.f30259g.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21040K8)).booleanValue()) {
                nk0.f25222b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    public /* synthetic */ zzd() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.zza.zzn();
                        } catch (IllegalStateException e11) {
                            se0.m26287c(baseAdView.getContext()).mo26290b(e11, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzn();
    }

    public void resume() {
        AbstractC4554gx.m22622c(getContext());
        if (((Boolean) AbstractC5149wy.f30260h.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21020I8)).booleanValue()) {
                nk0.f25222b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    public /* synthetic */ zzf() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.zza.zzp();
                        } catch (IllegalStateException e11) {
                            se0.m26287c(baseAdView.getContext()).mo26290b(e11, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AdListener adListener) {
        this.zza.zzr(adListener);
        if (adListener == 0) {
            this.zza.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            this.zza.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zza.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(String str) {
        this.zza.zzu(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zza.zzx(onPaidEventListener);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet);
        this.zza = new zzdu(this, attributeSet, false, i11);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        this.zza = new zzdu(this, attributeSet, false, i12);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i11, int i12, boolean z11) {
        super(context, attributeSet, i11);
        this.zza = new zzdu(this, attributeSet, z11, i12);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, boolean z11) {
        super(context, attributeSet);
        this.zza = new zzdu(this, attributeSet, z11);
    }
}
