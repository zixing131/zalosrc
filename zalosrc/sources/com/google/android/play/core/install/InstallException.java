package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import p124e7.AbstractC18274a;

/* loaded from: classes.dex */
public class InstallException extends ApiException {
    public InstallException(int i11) {
        super(new Status(i11, String.format(Locale.getDefault(), "Install Error(%d): %s", Integer.valueOf(i11), AbstractC18274a.m97107a(i11))));
        if (i11 != 0) {
        } else {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
