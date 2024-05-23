package i40;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.zing.zalo.AbstractC10919t;

/* renamed from: i40.c */
/* loaded from: classes5.dex */
public abstract class AbstractC20273c {
    /* renamed from: a */
    public static boolean m105847a(View view) {
        if (view == null) {
            return false;
        }
        view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), AbstractC10919t.screen_shake));
        return true;
    }
}
