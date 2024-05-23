package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p227i3.C20217u;

/* loaded from: classes2.dex */
public final class uz0 implements n80 {

    /* renamed from: a */
    private final Context f29096a;

    /* renamed from: b */
    private final C4730lp f29097b;

    /* renamed from: c */
    private final PowerManager f29098c;

    public uz0(Context context, C4730lp c4730lp) {
        this.f29096a = context;
        this.f29097b = c4730lp;
        this.f29098c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.n80
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(xz0 xz0Var) {
        JSONObject jSONObject;
        Integer valueOf;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C4842op c4842op = xz0Var.f30694f;
        if (c4842op == null) {
            jSONObject = new JSONObject();
        } else if (this.f29097b.m24340d() != null) {
            boolean z11 = c4842op.f25726a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f29097b.m24338b()).put("activeViewJSON", this.f29097b.m24340d()).put("timestamp", xz0Var.f30692d).put("adFormat", this.f29097b.m24337a()).put("hashCode", this.f29097b.m24339c()).put("isMraid", false).put("isStopped", false).put("isPaused", xz0Var.f30690b).put("isNative", this.f29097b.m24341e()).put("isScreenOn", this.f29098c.isInteractive()).put("appMuted", zzt.zzr().zze()).put("appVolume", zzt.zzr().zza()).put("deviceVolume", zzab.zzb(this.f29096a.getApplicationContext()));
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21066N4)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f29096a.getApplicationContext().getSystemService("audio");
                if (audioManager == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(audioManager.getMode());
                }
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f29096a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", c4842op.f25727b).put("isAttachedToWindow", z11).put("viewBox", new JSONObject().put("top", c4842op.f25728c.top).put("bottom", c4842op.f25728c.bottom).put("left", c4842op.f25728c.left).put("right", c4842op.f25728c.right)).put("adBox", new JSONObject().put("top", c4842op.f25729d.top).put("bottom", c4842op.f25729d.bottom).put("left", c4842op.f25729d.left).put("right", c4842op.f25729d.right)).put("globalVisibleBox", new JSONObject().put("top", c4842op.f25730e.top).put("bottom", c4842op.f25730e.bottom).put("left", c4842op.f25730e.left).put("right", c4842op.f25730e.right)).put("globalVisibleBoxVisible", c4842op.f25731f).put("localVisibleBox", new JSONObject().put("top", c4842op.f25732g.top).put("bottom", c4842op.f25732g.bottom).put("left", c4842op.f25732g.left).put("right", c4842op.f25732g.right)).put("localVisibleBoxVisible", c4842op.f25733h).put("hitBox", new JSONObject().put("top", c4842op.f25734i.top).put("bottom", c4842op.f25734i.bottom).put("left", c4842op.f25734i.left).put("right", c4842op.f25734i.right)).put("screenDensity", this.f29096a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", xz0Var.f30689a);
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21268i1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = c4842op.f25736k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(xz0Var.f30693e)) {
                jSONObject3.put("doneReasonCode", C20217u.f99970o);
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
