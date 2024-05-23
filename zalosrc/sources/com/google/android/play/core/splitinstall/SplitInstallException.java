package com.google.android.play.core.splitinstall;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p317l7.AbstractC22104a;

/* loaded from: classes3.dex */
public class SplitInstallException extends ApiException {
    public SplitInstallException(int i11) {
        super(new Status(i11, String.format("Split Install Error(%d): %s", Integer.valueOf(i11), AbstractC22104a.m115324b(i11))));
        if (i11 != 0) {
        } else {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    /* renamed from: c */
    public int m33386c() {
        return super.m19216b();
    }
}
