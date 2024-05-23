package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.ke0;
import com.google.android.gms.internal.ads.le0;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ReportingInfo {
    private final le0 zza;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final ke0 zza;

        public Builder(View view) {
            ke0 ke0Var = new ke0();
            this.zza = ke0Var;
            ke0Var.m23926b(view);
        }

        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        public Builder setAssetViews(Map<String, View> map) {
            this.zza.m23927c(map);
            return this;
        }
    }

    /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.zza = new le0(builder.zza);
    }

    public void recordClick(List<Uri> list) {
        this.zza.m24257a(list);
    }

    public void recordImpression(List<Uri> list) {
        this.zza.m24258b(list);
    }

    public void reportTouchEvent(MotionEvent motionEvent) {
        this.zza.m24259c(motionEvent);
    }

    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.m24260d(uri, updateClickUrlCallback);
    }

    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.m24261e(list, updateImpressionUrlsCallback);
    }
}
