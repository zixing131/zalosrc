package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;

/* loaded from: classes2.dex */
public final class DynamicHeightSearchAdRequest {
    private final SearchAdRequest zza;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final zzb zza = new zzb();
        private final Bundle zzb = new Bundle();

        public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zza.zzb(cls, bundle);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zza.zzc(networkExtras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.zza.zzd(cls, bundle);
            return this;
        }

        public DynamicHeightSearchAdRequest build() {
            this.zza.zzd(AdMobAdapter.class, this.zzb);
            return new DynamicHeightSearchAdRequest(this, null);
        }

        public Builder setAdBorderSelectors(String str) {
            this.zzb.putString("csa_adBorderSelectors", str);
            return this;
        }

        public Builder setAdTest(boolean z11) {
            String str;
            Bundle bundle = this.zzb;
            if (true != z11) {
                str = "off";
            } else {
                str = "on";
            }
            bundle.putString("csa_adtest", str);
            return this;
        }

        public Builder setAdjustableLineHeight(int i11) {
            this.zzb.putString("csa_adjustableLineHeight", Integer.toString(i11));
            return this;
        }

        public Builder setAdvancedOptionValue(String str, String str2) {
            this.zzb.putString(str, str2);
            return this;
        }

        public Builder setAttributionSpacingBelow(int i11) {
            this.zzb.putString("csa_attributionSpacingBelow", Integer.toString(i11));
            return this;
        }

        public Builder setBorderSelections(String str) {
            this.zzb.putString("csa_borderSelections", str);
            return this;
        }

        public Builder setChannel(String str) {
            this.zzb.putString("csa_channel", str);
            return this;
        }

        public Builder setColorAdBorder(String str) {
            this.zzb.putString("csa_colorAdBorder", str);
            return this;
        }

        public Builder setColorAdSeparator(String str) {
            this.zzb.putString("csa_colorAdSeparator", str);
            return this;
        }

        public Builder setColorAnnotation(String str) {
            this.zzb.putString("csa_colorAnnotation", str);
            return this;
        }

        public Builder setColorAttribution(String str) {
            this.zzb.putString("csa_colorAttribution", str);
            return this;
        }

        public Builder setColorBackground(String str) {
            this.zzb.putString("csa_colorBackground", str);
            return this;
        }

        public Builder setColorBorder(String str) {
            this.zzb.putString("csa_colorBorder", str);
            return this;
        }

        public Builder setColorDomainLink(String str) {
            this.zzb.putString("csa_colorDomainLink", str);
            return this;
        }

        public Builder setColorText(String str) {
            this.zzb.putString("csa_colorText", str);
            return this;
        }

        public Builder setColorTitleLink(String str) {
            this.zzb.putString("csa_colorTitleLink", str);
            return this;
        }

        public Builder setCssWidth(int i11) {
            this.zzb.putString("csa_width", Integer.toString(i11));
            return this;
        }

        public Builder setDetailedAttribution(boolean z11) {
            this.zzb.putString("csa_detailedAttribution", Boolean.toString(z11));
            return this;
        }

        public Builder setFontFamily(String str) {
            this.zzb.putString("csa_fontFamily", str);
            return this;
        }

        public Builder setFontFamilyAttribution(String str) {
            this.zzb.putString("csa_fontFamilyAttribution", str);
            return this;
        }

        public Builder setFontSizeAnnotation(int i11) {
            this.zzb.putString("csa_fontSizeAnnotation", Integer.toString(i11));
            return this;
        }

        public Builder setFontSizeAttribution(int i11) {
            this.zzb.putString("csa_fontSizeAttribution", Integer.toString(i11));
            return this;
        }

        public Builder setFontSizeDescription(int i11) {
            this.zzb.putString("csa_fontSizeDescription", Integer.toString(i11));
            return this;
        }

        public Builder setFontSizeDomainLink(int i11) {
            this.zzb.putString("csa_fontSizeDomainLink", Integer.toString(i11));
            return this;
        }

        public Builder setFontSizeTitle(int i11) {
            this.zzb.putString("csa_fontSizeTitle", Integer.toString(i11));
            return this;
        }

        public Builder setHostLanguage(String str) {
            this.zzb.putString("csa_hl", str);
            return this;
        }

        public Builder setIsClickToCallEnabled(boolean z11) {
            this.zzb.putString("csa_clickToCall", Boolean.toString(z11));
            return this;
        }

        public Builder setIsLocationEnabled(boolean z11) {
            this.zzb.putString("csa_location", Boolean.toString(z11));
            return this;
        }

        public Builder setIsPlusOnesEnabled(boolean z11) {
            this.zzb.putString("csa_plusOnes", Boolean.toString(z11));
            return this;
        }

        public Builder setIsSellerRatingsEnabled(boolean z11) {
            this.zzb.putString("csa_sellerRatings", Boolean.toString(z11));
            return this;
        }

        public Builder setIsSiteLinksEnabled(boolean z11) {
            this.zzb.putString("csa_siteLinks", Boolean.toString(z11));
            return this;
        }

        public Builder setIsTitleBold(boolean z11) {
            this.zzb.putString("csa_titleBold", Boolean.toString(z11));
            return this;
        }

        public Builder setIsTitleUnderlined(boolean z11) {
            this.zzb.putString("csa_noTitleUnderline", Boolean.toString(!z11));
            return this;
        }

        public Builder setLocationColor(String str) {
            this.zzb.putString("csa_colorLocation", str);
            return this;
        }

        public Builder setLocationFontSize(int i11) {
            this.zzb.putString("csa_fontSizeLocation", Integer.toString(i11));
            return this;
        }

        public Builder setLongerHeadlines(boolean z11) {
            this.zzb.putString("csa_longerHeadlines", Boolean.toString(z11));
            return this;
        }

        public Builder setNumber(int i11) {
            this.zzb.putString("csa_number", Integer.toString(i11));
            return this;
        }

        public Builder setPage(int i11) {
            this.zzb.putString("csa_adPage", Integer.toString(i11));
            return this;
        }

        public Builder setQuery(String str) {
            this.zza.zze(str);
            return this;
        }

        public Builder setStyleId(String str) {
            this.zzb.putString("csa_styleId", str);
            return this;
        }

        public Builder setVerticalSpacing(int i11) {
            this.zzb.putString("csa_verticalSpacing", Integer.toString(i11));
            return this;
        }
    }

    /* synthetic */ DynamicHeightSearchAdRequest(Builder builder, zza zzaVar) {
        this.zza = new SearchAdRequest(builder.zza, null);
    }

    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zza.getCustomEventExtrasBundle(cls);
    }

    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zza.getNetworkExtrasBundle(cls);
    }

    public String getQuery() {
        return this.zza.getQuery();
    }

    public boolean isTestDevice(Context context) {
        return this.zza.isTestDevice(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdr zza() {
        return this.zza.zza();
    }
}
