package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class gs1 implements j04 {

    /* renamed from: a */
    private final w04 f20805a;

    /* renamed from: b */
    private final w04 f20806b;

    /* renamed from: c */
    private final w04 f20807c;

    /* renamed from: d */
    private final w04 f20808d;

    public gs1(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f20805a = w04Var;
        this.f20806b = w04Var2;
        this.f20807c = w04Var3;
        this.f20808d = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String m21743a = ((ek2) this.f20805a).m21743a();
        Context m20710a = ((bt0) this.f20806b).m20710a();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        Map zzb = ((n04) this.f20808d).zzb();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21191a4)).booleanValue()) {
            C4808ns c4808ns = new C4808ns(new C5031ts(m20710a));
            c4808ns.m24993b(new InterfaceC4771ms() { // from class: com.google.android.gms.internal.ads.hs1
                @Override // com.google.android.gms.internal.ads.InterfaceC4771ms
                /* renamed from: a */
                public final void mo20788a(C4514fu c4514fu) {
                    c4514fu.m22179y(m21743a);
                }
            });
            emptySet = Collections.singleton(new if1(new js1(c4808ns, zzb), uc3Var));
        } else {
            emptySet = Collections.emptySet();
        }
        r04.m25935b(emptySet);
        return emptySet;
    }
}
