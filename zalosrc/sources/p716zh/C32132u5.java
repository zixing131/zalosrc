package p716zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import i40.AbstractC20276f;

/* renamed from: zh.u5 */
/* loaded from: classes3.dex */
public class C32132u5 {

    /* renamed from: a */
    public ImageView f148204a;

    /* renamed from: b */
    int f148205b;

    /* renamed from: f */
    private Runnable f148209f;

    /* renamed from: g */
    public boolean f148210g;

    /* renamed from: c */
    public float f148206c = 2.0f;

    /* renamed from: d */
    public long f148207d = 1200;

    /* renamed from: e */
    public long f148208e = 500;

    /* renamed from: h */
    public boolean f148211h = false;

    /* renamed from: i */
    Animator.AnimatorListener f148212i = new a();

    /* renamed from: zh.u5$a */
    /* loaded from: classes3.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                C32132u5 c32132u5 = C32132u5.this;
                c32132u5.f148211h = false;
                if (c32132u5.f148210g) {
                    c32132u5.f148204a.clearColorFilter();
                    C32132u5.this.f148210g = false;
                }
                if (C32132u5.this.f148209f != null) {
                    C32132u5.this.f148209f.run();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            try {
                C32132u5 c32132u5 = C32132u5.this;
                c32132u5.f148204a.setColorFilter(c32132u5.f148205b);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C32132u5(ImageView imageView, int i11) {
        this.f148204a = imageView;
        this.f148205b = i11;
    }

    /* renamed from: b */
    public void m155101b(boolean z11, Runnable runnable) {
        this.f148210g = z11;
        this.f148209f = runnable;
        ImageView imageView = this.f148204a;
        if (imageView != null && !this.f148211h) {
            this.f148211h = true;
            AbstractC20276f.m105888a(imageView, this.f148206c, this.f148207d, this.f148208e, this.f148212i);
        }
    }
}
