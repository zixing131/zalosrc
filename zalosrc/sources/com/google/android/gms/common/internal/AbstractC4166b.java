package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4166b {
    /* renamed from: a */
    public static ApiException m19628a(Status status) {
        if (status.m19222K()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
