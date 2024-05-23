package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;

/* renamed from: com.google.android.gms.internal.ads.we */
/* loaded from: classes2.dex */
public final class C5129we extends AbstractCallableC4316ag {

    /* renamed from: i */
    private final Activity f29893i;

    /* renamed from: j */
    private final View f29894j;

    public C5129we(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12, View view, Activity activity) {
        super(c4719le, "uJ6tafbdnitpIiJcEDt3zh4lzBZEYeFsW45S60suhbKyZNy2K2MuNEbuksualim4", "Cv/m6MvBjdOit7tT7cC+xPCpFEqovwYj4XIOcXUxCMs=", c4939ra, i11, 62);
        this.f29894j = view;
        this.f29893i = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        if (this.f29894j == null) {
            return;
        }
        boolean booleanValue = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21249g2)).booleanValue();
        Object[] objArr = (Object[]) this.f17025f.invoke(null, this.f29894j, this.f29893i, Boolean.valueOf(booleanValue));
        synchronized (this.f17024e) {
            try {
                this.f17024e.m26028f0(((Long) objArr[0]).longValue());
                this.f17024e.m26030h0(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f17024e.m26029g0((String) objArr[2]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
