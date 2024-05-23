package mx;

import android.content.Context;
import androidx.core.content.AbstractC1388a;

/* renamed from: mx.j */
/* loaded from: classes4.dex */
public abstract class AbstractC23473j {
    /* renamed from: a */
    public static boolean m123236a(Context context) {
        if (AbstractC1388a.m6959a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != -1) {
            return true;
        }
        return false;
    }
}
