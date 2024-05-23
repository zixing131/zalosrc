package com.zing.zalo.p077ui.maintab.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class MainTabChildView extends BaseZaloView {

    /* renamed from: com.zing.zalo.ui.maintab.widget.MainTabChildView$a */
    /* loaded from: classes5.dex */
    class C12264a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ Runnable f63923p;

        C12264a(Runnable runnable) {
            this.f63923p = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Runnable runnable = this.f63923p;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: HJ */
    public AnimatorSet mo39022HJ(boolean z11, Runnable runnable) {
        if (z11 && m92676n2() != null && !m92676n2().mo35576n3()) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(m92656bJ(), "alpha", 0.0f, 1.0f));
            animatorSet.addListener(new C12264a(runnable));
            animatorSet.setDuration(150L);
            return animatorSet;
        }
        return super.mo39022HJ(z11, runnable);
    }

    /* renamed from: dM */
    public String m68758dM(String str, String str2, int i11) {
        if (str.equals("action.open.mp")) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                jSONObject.put("sourceOpen", i11);
                return jSONObject.toString();
            } catch (Exception unused) {
                return str2;
            }
        }
        return str2;
    }
}
