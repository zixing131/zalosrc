package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.ArrayList;
import p665y0.C30239a;
import p704z4.C31218b;

/* loaded from: classes2.dex */
public class AvailabilityException extends Exception {

    /* renamed from: p */
    private final C30239a f16160p;

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z11 = true;
        for (C31218b c31218b : this.f16160p.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) AbstractC4205o.m19722k((ConnectionResult) this.f16160p.get(c31218b));
            z11 &= !connectionResult.m19187M();
            arrayList.add(c31218b.m152101b() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
