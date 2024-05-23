package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class pc0 extends qc0 implements c40 {

    /* renamed from: c */
    private final zq0 f26153c;

    /* renamed from: d */
    private final Context f26154d;

    /* renamed from: e */
    private final WindowManager f26155e;

    /* renamed from: f */
    private final C4887pw f26156f;

    /* renamed from: g */
    DisplayMetrics f26157g;

    /* renamed from: h */
    private float f26158h;

    /* renamed from: i */
    int f26159i;

    /* renamed from: j */
    int f26160j;

    /* renamed from: k */
    private int f26161k;

    /* renamed from: l */
    int f26162l;

    /* renamed from: m */
    int f26163m;

    /* renamed from: n */
    int f26164n;

    /* renamed from: o */
    int f26165o;

    public pc0(zq0 zq0Var, Context context, C4887pw c4887pw) {
        super(zq0Var, "");
        this.f26159i = -1;
        this.f26160j = -1;
        this.f26162l = -1;
        this.f26163m = -1;
        this.f26164n = -1;
        this.f26165o = -1;
        this.f26153c = zq0Var;
        this.f26154d = context;
        this.f26156f = c4887pw;
        this.f26155e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* synthetic */ void mo19973a(Object obj, Map map) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        JSONObject jSONObject;
        this.f26157g = new DisplayMetrics();
        Display defaultDisplay = this.f26155e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f26157g);
        this.f26158h = this.f26157g.density;
        this.f26161k = defaultDisplay.getRotation();
        zzaw.zzb();
        DisplayMetrics displayMetrics = this.f26157g;
        this.f26159i = rk0.m26113w(displayMetrics, displayMetrics.widthPixels);
        zzaw.zzb();
        DisplayMetrics displayMetrics2 = this.f26157g;
        this.f26160j = rk0.m26113w(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzk = this.f26153c.zzk();
        if (zzk != null && zzk.getWindow() != null) {
            zzt.zzp();
            int[] zzN = zzs.zzN(zzk);
            zzaw.zzb();
            this.f26162l = rk0.m26113w(this.f26157g, zzN[0]);
            zzaw.zzb();
            this.f26163m = rk0.m26113w(this.f26157g, zzN[1]);
        } else {
            this.f26162l = this.f26159i;
            this.f26163m = this.f26160j;
        }
        if (this.f26153c.mo22517p().m25539i()) {
            this.f26164n = this.f26159i;
            this.f26165o = this.f26160j;
        } else {
            this.f26153c.measure(0, 0);
        }
        m25685e(this.f26159i, this.f26160j, this.f26162l, this.f26163m, this.f26158h, this.f26161k);
        oc0 oc0Var = new oc0();
        C4887pw c4887pw = this.f26156f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        oc0Var.m25152e(c4887pw.m25560a(intent));
        C4887pw c4887pw2 = this.f26156f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        oc0Var.m25150c(c4887pw2.m25560a(intent2));
        oc0Var.m25148a(this.f26156f.m25561b());
        oc0Var.m25151d(this.f26156f.m25562c());
        oc0Var.m25149b(true);
        z11 = oc0Var.f25586a;
        z12 = oc0Var.f25587b;
        z13 = oc0Var.f25588c;
        z14 = oc0Var.f25589d;
        z15 = oc0Var.f25590e;
        zq0 zq0Var = this.f26153c;
        try {
            jSONObject = new JSONObject().put("sms", z11).put("tel", z12).put("calendar", z13).put("storePicture", z14).put("inlineVideo", z15);
        } catch (JSONException e11) {
            yk0.zzh("Error occurred while obtaining the MRAID capabilities.", e11);
            jSONObject = null;
        }
        zq0Var.mo23555n("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.f26153c.getLocationOnScreen(iArr);
        m25425h(zzaw.zzb().m26117d(this.f26154d, iArr[0]), zzaw.zzb().m26117d(this.f26154d, iArr[1]));
        if (yk0.zzm(2)) {
            yk0.zzi("Dispatching Ready Event.");
        }
        m25684d(this.f26153c.zzp().f32030p);
    }

    /* renamed from: h */
    public final void m25425h(int i11, int i12) {
        int i13;
        int i14 = 0;
        if (this.f26154d instanceof Activity) {
            zzt.zzp();
            i13 = zzs.zzO((Activity) this.f26154d)[0];
        } else {
            i13 = 0;
        }
        if (this.f26153c.mo22517p() == null || !this.f26153c.mo22517p().m25539i()) {
            int width = this.f26153c.getWidth();
            int height = this.f26153c.getHeight();
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21081P)).booleanValue()) {
                if (width == 0) {
                    if (this.f26153c.mo22517p() != null) {
                        width = this.f26153c.mo22517p().f26324c;
                    } else {
                        width = 0;
                    }
                }
                if (height == 0) {
                    if (this.f26153c.mo22517p() != null) {
                        i14 = this.f26153c.mo22517p().f26323b;
                    }
                    this.f26164n = zzaw.zzb().m26117d(this.f26154d, width);
                    this.f26165o = zzaw.zzb().m26117d(this.f26154d, i14);
                }
            }
            i14 = height;
            this.f26164n = zzaw.zzb().m26117d(this.f26154d, width);
            this.f26165o = zzaw.zzb().m26117d(this.f26154d, i14);
        }
        m25682b(i11, i12 - i13, this.f26164n, this.f26165o);
        this.f26153c.zzP().mo23376l(i11, i12);
    }
}
