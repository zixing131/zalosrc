package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.ye */
/* loaded from: classes2.dex */
public final class C5203ye extends AbstractCallableC4316ag {
    public C5203ye(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12) {
        super(c4719le, "6vt+8E5GP5AwoxquDM0Y7lVJzS23/VCjNo5D8xB8rgAaaF6IhToGZhlIAUkgigHl", "jx9F7EAIAhvEI8G+/hWsHBitt0z+K8moFRn7/w45eYc=", c4939ra, i11, 49);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        this.f17024e.m26021X(3);
        try {
            int i11 = 1;
            boolean booleanValue = ((Boolean) this.f17025f.invoke(null, this.f17021b.m24240b())).booleanValue();
            C4939ra c4939ra = this.f17024e;
            if (true == booleanValue) {
                i11 = 2;
            }
            c4939ra.m26021X(i11);
        } catch (InvocationTargetException e11) {
            if (e11.getTargetException() instanceof Settings.SettingNotFoundException) {
            } else {
                throw e11;
            }
        }
    }
}
