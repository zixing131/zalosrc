package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        m10814E0();
    }

    /* renamed from: E0 */
    private void m10814E0() {
        m10943B0(1);
        m10947t0(new Fade(2)).m10947t0(new ChangeBounds()).m10947t0(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10814E0();
    }
}
