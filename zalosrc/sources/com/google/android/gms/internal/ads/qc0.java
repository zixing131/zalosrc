package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class qc0 {

    /* renamed from: a */
    private final zq0 f26713a;

    /* renamed from: b */
    private final String f26714b;

    public qc0(zq0 zq0Var, String str) {
        this.f26713a = zq0Var;
        this.f26714b = str;
    }

    /* renamed from: b */
    public final void m25682b(int i11, int i12, int i13, int i14) {
        try {
            this.f26713a.mo23555n("onDefaultPositionReceived", new JSONObject().put("x", i11).put("y", i12).put("width", i13).put("height", i14));
        } catch (JSONException e11) {
            yk0.zzh("Error occurred while dispatching default position.", e11);
        }
    }

    /* renamed from: c */
    public final void m25683c(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f26714b);
            zq0 zq0Var = this.f26713a;
            if (zq0Var != null) {
                zq0Var.mo23555n("onError", put);
            }
        } catch (JSONException e11) {
            yk0.zzh("Error occurred while dispatching error event.", e11);
        }
    }

    /* renamed from: d */
    public final void m25684d(String str) {
        try {
            this.f26713a.mo23555n("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e11) {
            yk0.zzh("Error occurred while dispatching ready Event.", e11);
        }
    }

    /* renamed from: e */
    public final void m25685e(int i11, int i12, int i13, int i14, float f11, int i15) {
        try {
            this.f26713a.mo23555n("onScreenInfoChanged", new JSONObject().put("width", i11).put("height", i12).put("maxSizeWidth", i13).put("maxSizeHeight", i14).put("density", f11).put("rotation", i15));
        } catch (JSONException e11) {
            yk0.zzh("Error occurred while obtaining screen information.", e11);
        }
    }

    /* renamed from: f */
    public final void m25686f(int i11, int i12, int i13, int i14) {
        try {
            this.f26713a.mo23555n("onSizeChanged", new JSONObject().put("x", i11).put("y", i12).put("width", i13).put("height", i14));
        } catch (JSONException e11) {
            yk0.zzh("Error occurred while dispatching size change.", e11);
        }
    }

    /* renamed from: g */
    public final void m25687g(String str) {
        try {
            this.f26713a.mo23555n("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e11) {
            yk0.zzh("Error occurred while dispatching state change.", e11);
        }
    }
}
