package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.core.app.c */
/* loaded from: classes2.dex */
public abstract class AbstractC1327c {

    /* renamed from: androidx.core.app.c$a */
    /* loaded from: classes2.dex */
    private static class a extends AbstractC1327c {

        /* renamed from: a */
        private final ActivityOptions f5893a;

        a(ActivityOptions activityOptions) {
            this.f5893a = activityOptions;
        }

        @Override // androidx.core.app.AbstractC1327c
        /* renamed from: b */
        public Bundle mo6661b() {
            return this.f5893a.toBundle();
        }
    }

    /* renamed from: androidx.core.app.c$b */
    /* loaded from: classes2.dex */
    static class b {
        /* renamed from: a */
        static ActivityOptions m6662a(Context context, int i11, int i12) {
            return ActivityOptions.makeCustomAnimation(context, i11, i12);
        }

        /* renamed from: b */
        static ActivityOptions m6663b(View view, int i11, int i12, int i13, int i14) {
            return ActivityOptions.makeScaleUpAnimation(view, i11, i12, i13, i14);
        }

        /* renamed from: c */
        static ActivityOptions m6664c(View view, Bitmap bitmap, int i11, int i12) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i11, i12);
        }
    }

    protected AbstractC1327c() {
    }

    /* renamed from: a */
    public static AbstractC1327c m6660a(Context context, int i11, int i12) {
        return new a(b.m6662a(context, i11, i12));
    }

    /* renamed from: b */
    public abstract Bundle mo6661b();
}
