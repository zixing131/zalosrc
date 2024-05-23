package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;
import p289k5.C21472e;

/* loaded from: classes2.dex */
public final class jv1 {

    /* renamed from: a */
    private final Context f23002a;

    /* renamed from: b */
    private final ApplicationInfo f23003b;

    /* renamed from: e */
    private String f23006e = "";

    /* renamed from: c */
    private final int f23004c = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21109R7)).intValue();

    /* renamed from: d */
    private final int f23005d = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21119S7)).intValue();

    public jv1(Context context) {
        this.f23002a = context;
        this.f23003b = context.getApplicationInfo();
    }

    /* renamed from: a */
    public final JSONObject m23758a() {
        Drawable drawable;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", C21472e.m111067a(this.f23002a).m111062d(this.f23003b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f23003b.packageName);
        zzt.zzp();
        jSONObject.put("adMobAppId", zzs.zzo(this.f23002a));
        if (this.f23006e.isEmpty()) {
            try {
                drawable = (Drawable) C21472e.m111067a(this.f23002a).m111063e(this.f23003b.packageName).f6375b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f23004c, this.f23005d);
                Bitmap createBitmap = Bitmap.createBitmap(this.f23004c, this.f23005d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f23006e = encodeToString;
        }
        if (!this.f23006e.isEmpty()) {
            jSONObject.put("icon", this.f23006e);
            jSONObject.put("iconWidthPx", this.f23004c);
            jSONObject.put("iconHeightPx", this.f23005d);
        }
        return jSONObject;
    }
}
