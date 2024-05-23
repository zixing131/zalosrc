package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.vectordrawable.graphics.drawable.b */
/* loaded from: classes2.dex */
public interface InterfaceC2038b extends Animatable {

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$a */
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: a */
        Animatable2.AnimationCallback f8648a;

        /* renamed from: androidx.vectordrawable.graphics.drawable.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C32640a extends Animatable2.AnimationCallback {
            C32640a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                a.this.mo11042b(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                a.this.m11043c(drawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public Animatable2.AnimationCallback m11041a() {
            if (this.f8648a == null) {
                this.f8648a = new C32640a();
            }
            return this.f8648a;
        }

        /* renamed from: b */
        public void mo11042b(Drawable drawable) {
        }

        /* renamed from: c */
        public void m11043c(Drawable drawable) {
        }
    }

    /* renamed from: a */
    void mo11040a(a aVar);
}
