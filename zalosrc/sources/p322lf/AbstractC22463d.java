package p322lf;

import android.app.Activity;
import android.content.Context;
import th.C26694o;
import zh0.AbstractC32212c;

/* renamed from: lf.d */
/* loaded from: classes3.dex */
public abstract class AbstractC22463d {
    /* renamed from: a */
    public static final boolean m116126a(Context context, int i11) {
        if (C26694o.f126493b) {
            if (!(context instanceof Activity)) {
                return AbstractC32212c.m155334d(i11);
            }
            if (((Activity) context).getResources().getConfiguration().orientation == 2) {
                return true;
            }
            return false;
        }
        return AbstractC32212c.m155334d(i11);
    }
}
