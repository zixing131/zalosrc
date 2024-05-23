package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
public final class cw2 {

    /* renamed from: a */
    private final String f19004a = (String) AbstractC5000sy.f28057b.m24091e();

    /* renamed from: a */
    public final String m21185a(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.f19004a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
