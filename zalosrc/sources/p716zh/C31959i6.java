package p716zh;

import android.animation.Animator;
import android.view.animation.DecelerateInterpolator;
import com.zing.zalo.p077ui.chat.C11621p0;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.widget.recyclerview.TouchListView;

/* renamed from: zh.i6 */
/* loaded from: classes3.dex */
public class C31959i6 {

    /* renamed from: b */
    private final ChatView f146873b;

    /* renamed from: c */
    private boolean f146874c;

    /* renamed from: d */
    private boolean f146875d;

    /* renamed from: a */
    private int f146872a = 0;

    /* renamed from: f */
    private final Animator.AnimatorListener f146877f = new a();

    /* renamed from: e */
    private final Animator.AnimatorListener f146876e = new b();

    /* renamed from: zh.i6$a */
    /* loaded from: classes3.dex */
    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C31959i6.this.m153660f();
            C31959i6.this.f146874c = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C31959i6.this.m153660f();
            C31959i6.this.f146874c = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C31959i6.this.f146874c = true;
        }
    }

    /* renamed from: zh.i6$b */
    /* loaded from: classes3.dex */
    class b implements Animator.AnimatorListener {
        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C31959i6.this.f146875d = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C31959i6.this.f146875d = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C31959i6.this.f146875d = true;
        }
    }

    public C31959i6(ChatView chatView) {
        this.f146873b = chatView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m153660f() {
        C11621p0 c11621p0;
        ChatView chatView = this.f146873b;
        if (chatView != null && (c11621p0 = chatView.f56793R1) != null && c11621p0.f60408d != null && chatView.m59974dQ() != null) {
            this.f146873b.f56793R1.f60408d.setListMsgTranslateY(this.f146872a);
            this.f146873b.m59974dQ().requestLayout();
        }
    }

    /* renamed from: d */
    public void m153661d() {
        ChatView chatView = this.f146873b;
        if (chatView != null && chatView.m59974dQ() != null) {
            TouchListView m59974dQ = this.f146873b.m59974dQ();
            if (!this.f146875d) {
                m59974dQ.animate().cancel();
                this.f146872a = 0;
                m153660f();
                m59974dQ.animate().setInterpolator(new DecelerateInterpolator()).translationY(this.f146872a).setListener(this.f146876e).setDuration(200L).start();
            }
        }
    }

    /* renamed from: e */
    public void m153662e(int i11) {
        ChatView chatView = this.f146873b;
        if (chatView != null && chatView.m59974dQ() != null) {
            TouchListView m59974dQ = this.f146873b.m59974dQ();
            if (!this.f146874c && i11 != 0) {
                m59974dQ.animate().cancel();
                this.f146872a = i11;
                m59974dQ.animate().setInterpolator(new DecelerateInterpolator()).translationY(this.f146872a).setListener(this.f146877f).setDuration(300L).start();
            }
        }
    }
}
