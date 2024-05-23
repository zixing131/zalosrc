package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.impl.C4008R;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.yk0;
import p229i5.AbstractC20295p;

/* loaded from: classes2.dex */
public final class zzr extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzad zzb;

    public zzr(Context context, zzq zzqVar, zzad zzadVar) {
        super(context);
        zzp zzpVar;
        this.zzb = zzadVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzaw.zzb();
        int m26115y = rk0.m26115y(context, zzqVar.zza);
        zzaw.zzb();
        int m26115y2 = rk0.m26115y(context, 0);
        zzaw.zzb();
        int m26115y3 = rk0.m26115y(context, zzqVar.zzb);
        zzaw.zzb();
        imageButton.setPadding(m26115y, m26115y2, m26115y3, rk0.m26115y(context, zzqVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzaw.zzb();
        int m26115y4 = rk0.m26115y(context, zzqVar.zzd + zzqVar.zza + zzqVar.zzb);
        zzaw.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(m26115y4, rk0.m26115y(context, zzqVar.zzd + zzqVar.zzc), 17));
        long longValue = ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21151W0)).longValue();
        if (longValue <= 0) {
            return;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21160X0)).booleanValue()) {
            zzpVar = new zzp(this);
        } else {
            zzpVar = null;
        }
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzpVar);
    }

    private final void zzc() {
        String str = (String) zzay.zzc().m21823b(AbstractC4554gx.f21142V0);
        if (AbstractC20295p.m105952f() && !TextUtils.isEmpty(str) && !"default".equals(str)) {
            Resources m22933d = com.google.android.gms.ads.internal.zzt.zzo().m22933d();
            if (m22933d != null) {
                Drawable drawable = null;
                try {
                    if ("white".equals(str)) {
                        drawable = m22933d.getDrawable(C4008R.drawable.admob_close_button_white_circle_black_cross);
                    } else if ("black".equals(str)) {
                        drawable = m22933d.getDrawable(C4008R.drawable.admob_close_button_black_circle_white_cross);
                    }
                } catch (Resources.NotFoundException unused) {
                    yk0.zze("Close button resource not found, falling back to default.");
                }
                if (drawable == null) {
                    this.zza.setImageResource(R.drawable.btn_dialog);
                    return;
                } else {
                    this.zza.setImageDrawable(drawable);
                    this.zza.setScaleType(ImageView.ScaleType.CENTER);
                    return;
                }
            }
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        this.zza.setImageResource(R.drawable.btn_dialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzad zzadVar = this.zzb;
        if (zzadVar != null) {
            zzadVar.zzbJ();
        }
    }

    public final void zzb(boolean z11) {
        if (z11) {
            this.zza.setVisibility(8);
            if (((Long) zzay.zzc().m21823b(AbstractC4554gx.f21151W0)).longValue() > 0) {
                this.zza.animate().cancel();
                this.zza.clearAnimation();
                return;
            }
            return;
        }
        this.zza.setVisibility(0);
    }
}
