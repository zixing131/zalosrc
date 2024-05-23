package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcyq extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: p */
    private final Context f32094p;

    /* renamed from: q */
    private View f32095q;

    private zzcyq(Context context) {
        super(context);
        this.f32094p = context;
    }

    /* renamed from: a */
    public static zzcyq m28807a(Context context, View view, iq2 iq2Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcyq zzcyqVar = new zzcyq(context);
        if (!iq2Var.f22350v.isEmpty() && (resources = zzcyqVar.f32094p.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f11 = ((jq2) iq2Var.f22350v.get(0)).f22952a;
            float f12 = displayMetrics.density;
            zzcyqVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f11 * f12), (int) (r1.f22953b * f12)));
        }
        zzcyqVar.f32095q = view;
        zzcyqVar.addView(view);
        zzt.zzx();
        xl0.m27929b(zzcyqVar, zzcyqVar);
        zzt.zzx();
        xl0.m27928a(zzcyqVar, zzcyqVar);
        JSONObject jSONObject = iq2Var.f22332j0;
        RelativeLayout relativeLayout = new RelativeLayout(zzcyqVar.f32094p);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcyqVar.m28809c(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcyqVar.m28809c(optJSONObject2, relativeLayout, 12);
        }
        zzcyqVar.addView(relativeLayout);
        return zzcyqVar;
    }

    /* renamed from: b */
    private final int m28808b(double d11) {
        zzaw.zzb();
        return rk0.m26115y(this.f32094p, (int) d11);
    }

    /* renamed from: c */
    private final void m28809c(JSONObject jSONObject, RelativeLayout relativeLayout, int i11) {
        TextView textView = new TextView(this.f32094p);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int m28808b = m28808b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, m28808b, 0, m28808b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, m28808b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i11);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f32095q.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f32095q.setY(-r0[1]);
    }
}
