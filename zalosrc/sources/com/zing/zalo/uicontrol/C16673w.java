package com.zing.zalo.uicontrol;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.IOException;
import me0.AbstractC23041d2;
import org.json.JSONException;
import org.json.JSONObject;
import p098dc.InterfaceC17872f;

/* renamed from: com.zing.zalo.uicontrol.w */
/* loaded from: classes4.dex */
public class C16673w implements InterfaceC17872f {

    /* renamed from: a */
    private int f84572a;

    public C16673w(File file) {
        this.f84572a = 0;
        long currentTimeMillis = System.currentTimeMillis();
        if (file.isDirectory()) {
            String str = file.getAbsolutePath() + "/metadata";
            if (AbstractC23041d2.m118194A(str)) {
                String m118197D = AbstractC23041d2.m118197D(str);
                if (!TextUtils.isEmpty(m118197D)) {
                    try {
                        this.f84572a = new JSONObject(m118197D).optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    } catch (JSONException e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
            }
            String.format("STICKER FRAMES INIT TIME: %s", (System.currentTimeMillis() - currentTimeMillis) + "");
            return;
        }
        throw new IOException(file.getAbsolutePath() + " is not Directory!");
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: a */
    public void mo88374a() {
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: b */
    public int mo88375b() {
        return 0;
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: c */
    public int mo88376c(int i11) {
        return 16;
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: d */
    public Bitmap mo88377d(int i11) {
        return null;
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: e */
    public Bitmap mo88378e(int i11, boolean z11) {
        return null;
    }

    /* renamed from: f */
    public String m88866f() {
        return "script_kf.json";
    }

    /* renamed from: g */
    public String m88867g() {
        return "script_kf_flip.json";
    }

    @Override // p098dc.InterfaceC17872f
    public int getType() {
        return this.f84572a;
    }
}
