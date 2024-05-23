package com.zing.zalo.social.controls;

import android.content.Context;
import com.zing.zalo.AbstractC16801x;

/* renamed from: com.zing.zalo.social.controls.u */
/* loaded from: classes5.dex */
public class C10882u extends C10866e {

    /* renamed from: g0 */
    private final Context f54983g0;

    public C10882u(Context context, String str, int i11, int i12) {
        super(str, i11, i12);
        this.f54983g0 = context;
    }

    @Override // com.zing.zalo.social.controls.C10866e
    /* renamed from: D */
    public void mo56361D(String str, Context context) {
    }

    @Override // com.zing.zalo.social.controls.C10866e
    /* renamed from: f */
    public void mo56388f(String str) {
        if (str.startsWith("cmd://EditDescription/")) {
            this.f54853p = "";
            this.f54854q = 10001;
            m56376T(this.f54983g0.getResources().getColor(AbstractC16801x.primary_link_color));
            return;
        }
        super.mo56388f(str);
    }
}
