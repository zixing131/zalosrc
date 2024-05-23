package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import p632x4.AbstractC29321g;

/* renamed from: com.google.android.gms.common.internal.q */
/* loaded from: classes.dex */
public class C4211q {

    /* renamed from: a */
    private final Resources f16646a;

    /* renamed from: b */
    private final String f16647b;

    public C4211q(Context context) {
        AbstractC4205o.m19722k(context);
        Resources resources = context.getResources();
        this.f16646a = resources;
        this.f16647b = resources.getResourcePackageName(AbstractC29321g.common_google_play_services_unknown_issue);
    }

    /* renamed from: a */
    public String m19742a(String str) {
        int identifier = this.f16646a.getIdentifier(str, "string", this.f16647b);
        if (identifier == 0) {
            return null;
        }
        return this.f16646a.getString(identifier);
    }
}
