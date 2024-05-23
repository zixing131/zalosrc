package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzblo extends RelativeLayout {

    /* renamed from: q */
    private static final float[] f31892q = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: p */
    private AnimationDrawable f31893p;

    public zzblo(Context context, BinderC5075uz binderC5075uz, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        AbstractC4205o.m19722k(binderC5075uz);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f31892q, null, null));
        shapeDrawable.getPaint().setColor(binderC5075uz.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(binderC5075uz.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(binderC5075uz.zzg());
            textView.setTextColor(binderC5075uz.zze());
            textView.setTextSize(binderC5075uz.m27100Q());
            zzaw.zzb();
            int m26115y = rk0.m26115y(context, 4);
            zzaw.zzb();
            textView.setPadding(m26115y, 0, rk0.m26115y(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List m27099I3 = binderC5075uz.m27099I3();
        if (m27099I3 != null && m27099I3.size() > 1) {
            this.f31893p = new AnimationDrawable();
            Iterator it = m27099I3.iterator();
            while (it.hasNext()) {
                try {
                    this.f31893p.addFrame((Drawable) BinderC4273d.m19914Q(((BinderC5150wz) it.next()).zzf()), binderC5075uz.zzb());
                } catch (Exception e11) {
                    yk0.zzh("Error while getting drawable.", e11);
                }
            }
            imageView.setBackground(this.f31893p);
        } else if (m27099I3.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) BinderC4273d.m19914Q(((BinderC5150wz) m27099I3.get(0)).zzf()));
            } catch (Exception e12) {
                yk0.zzh("Error while getting drawable.", e12);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f31893p;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
