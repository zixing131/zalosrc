package me0;

import android.system.ErrnoException;
import android.system.OsConstants;

/* renamed from: me0.u1 */
/* loaded from: classes4.dex */
public abstract class AbstractC23227u1 {
    /* renamed from: a */
    public static boolean m119701a(Exception exc) {
        if (!(exc.getCause() instanceof ErrnoException) || ((ErrnoException) exc.getCause()).errno != OsConstants.ENOSPC) {
            return false;
        }
        return true;
    }
}
