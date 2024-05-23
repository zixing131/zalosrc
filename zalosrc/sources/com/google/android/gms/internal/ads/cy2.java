package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;

/* loaded from: classes2.dex */
abstract class cy2 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m21241b(Throwable th2) {
        if ((th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES) {
            return true;
        }
        return false;
    }
}
