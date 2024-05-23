package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class za0 extends ja0 {

    /* renamed from: p */
    private final UnifiedNativeAdMapper f31423p;

    public za0(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f31423p = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    /* renamed from: E2 */
    public final void mo23147E2(InterfaceC4271b interfaceC4271b) {
        this.f31423p.handleClick((View) BinderC4273d.m19914Q(interfaceC4271b));
    }

    @Override // com.google.android.gms.internal.ads.ka0
    /* renamed from: K */
    public final void mo23148K(InterfaceC4271b interfaceC4271b) {
        this.f31423p.untrackView((View) BinderC4273d.m19914Q(interfaceC4271b));
    }

    @Override // com.google.android.gms.internal.ads.ka0
    /* renamed from: a */
    public final String mo23149a() {
        return this.f31423p.getStore();
    }

    @Override // com.google.android.gms.internal.ads.ka0
    /* renamed from: s4 */
    public final void mo23150s4(InterfaceC4271b interfaceC4271b, InterfaceC4271b interfaceC4271b2, InterfaceC4271b interfaceC4271b3) {
        this.f31423p.trackViews((View) BinderC4273d.m19914Q(interfaceC4271b), (HashMap) BinderC4273d.m19914Q(interfaceC4271b2), (HashMap) BinderC4273d.m19914Q(interfaceC4271b3));
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final boolean zzA() {
        return this.f31423p.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final boolean zzB() {
        return this.f31423p.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final double zze() {
        if (this.f31423p.getStarRating() != null) {
            return this.f31423p.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final float zzf() {
        return this.f31423p.getMediaContentAspectRatio();
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final float zzg() {
        return this.f31423p.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final float zzh() {
        return this.f31423p.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final Bundle zzi() {
        return this.f31423p.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final com.google.android.gms.ads.internal.client.zzdk zzj() {
        if (this.f31423p.zzb() != null) {
            return this.f31423p.zzb().zza();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final b00 zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final k00 zzl() {
        NativeAd.Image icon = this.f31423p.getIcon();
        if (icon != null) {
            return new BinderC5150wz(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final InterfaceC4271b zzm() {
        View adChoicesContent = this.f31423p.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return BinderC4273d.m19913I3(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final InterfaceC4271b zzn() {
        View zza = this.f31423p.zza();
        if (zza == null) {
            return null;
        }
        return BinderC4273d.m19913I3(zza);
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final InterfaceC4271b zzo() {
        Object zzc = this.f31423p.zzc();
        if (zzc == null) {
            return null;
        }
        return BinderC4273d.m19913I3(zzc);
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final String zzp() {
        return this.f31423p.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final String zzq() {
        return this.f31423p.getBody();
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final String zzr() {
        return this.f31423p.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final String zzs() {
        return this.f31423p.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final String zzt() {
        return this.f31423p.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final List zzv() {
        List<NativeAd.Image> images = this.f31423p.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new BinderC5150wz(image.getDrawable(), image.getUri(), image.getScale(), image.zzb(), image.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final void zzx() {
        this.f31423p.recordImpression();
    }
}
