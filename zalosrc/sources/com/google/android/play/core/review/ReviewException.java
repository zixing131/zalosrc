package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import p200h7.AbstractC19906a;

/* loaded from: classes3.dex */
public class ReviewException extends ApiException {
    public ReviewException(int i11) {
        super(new Status(i11, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i11), AbstractC19906a.m103593a(i11))));
    }
}
