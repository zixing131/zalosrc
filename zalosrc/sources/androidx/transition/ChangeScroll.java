package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class ChangeScroll extends Transition {

    /* renamed from: Z */
    private static final String[] f8419Z = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: r0 */
    private void m10851r0(C2030t c2030t) {
        c2030t.f8615a.put("android:changeScroll:x", Integer.valueOf(c2030t.f8616b.getScrollX()));
        c2030t.f8615a.put("android:changeScroll:y", Integer.valueOf(c2030t.f8616b.getScrollY()));
    }

    @Override // androidx.transition.Transition
    /* renamed from: I */
    public String[] mo10817I() {
        return f8419Z;
    }

    @Override // androidx.transition.Transition
    /* renamed from: i */
    public void mo10818i(C2030t c2030t) {
        m10851r0(c2030t);
    }

    @Override // androidx.transition.Transition
    /* renamed from: l */
    public void mo10819l(C2030t c2030t) {
        m10851r0(c2030t);
    }

    @Override // androidx.transition.Transition
    /* renamed from: p */
    public Animator mo10820p(ViewGroup viewGroup, C2030t c2030t, C2030t c2030t2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (c2030t == null || c2030t2 == null) {
            return null;
        }
        View view = c2030t2.f8616b;
        int intValue = ((Integer) c2030t.f8615a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) c2030t2.f8615a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) c2030t.f8615a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) c2030t2.f8615a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return AbstractC2029s.m11031c(objectAnimator, objectAnimator2);
    }
}
