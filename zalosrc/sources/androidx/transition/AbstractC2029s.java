package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: androidx.transition.s */
/* loaded from: classes2.dex */
abstract class AbstractC2029s {

    /* renamed from: a */
    private static final boolean f8609a;

    /* renamed from: b */
    private static final boolean f8610b;

    /* renamed from: c */
    private static final boolean f8611c;

    /* renamed from: androidx.transition.s$a */
    /* loaded from: classes2.dex */
    static class a implements TypeEvaluator {

        /* renamed from: a */
        final float[] f8612a = new float[9];

        /* renamed from: b */
        final float[] f8613b = new float[9];

        /* renamed from: c */
        final Matrix f8614c = new Matrix();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f11, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f8612a);
            matrix2.getValues(this.f8613b);
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f8613b;
                float f12 = fArr[i11];
                float f13 = this.f8612a[i11];
                fArr[i11] = f13 + ((f12 - f13) * f11);
            }
            this.f8614c.setValues(this.f8613b);
            return this.f8614c;
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        f8609a = true;
        f8610b = true;
        f8611c = i11 >= 28;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static View m11029a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        AbstractC2004b0.m10976j(view, matrix);
        AbstractC2004b0.m10977k(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap m11030b = m11030b(view, matrix, rectF, viewGroup);
        if (m11030b != null) {
            imageView.setImageBitmap(m11030b);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap m11030b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z11;
        boolean z12;
        boolean z13;
        ViewGroup viewGroup2;
        int i11;
        int round;
        int round2;
        if (f8609a) {
            z11 = !view.isAttachedToWindow();
            if (viewGroup != null) {
                z12 = viewGroup.isAttachedToWindow();
                z13 = f8610b;
                Bitmap bitmap = null;
                if (!z13 && z11) {
                    if (!z12) {
                        return null;
                    }
                    viewGroup2 = (ViewGroup) view.getParent();
                    i11 = viewGroup2.indexOfChild(view);
                    viewGroup.getOverlay().add(view);
                } else {
                    viewGroup2 = null;
                    i11 = 0;
                }
                round = Math.round(rectF.width());
                round2 = Math.round(rectF.height());
                if (round > 0 && round2 > 0) {
                    float min = Math.min(1.0f, 1048576.0f / (round * round2));
                    int round3 = Math.round(round * min);
                    int round4 = Math.round(round2 * min);
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    matrix.postScale(min, min);
                    if (!f8611c) {
                        Picture picture = new Picture();
                        Canvas beginRecording = picture.beginRecording(round3, round4);
                        beginRecording.concat(matrix);
                        view.draw(beginRecording);
                        picture.endRecording();
                        bitmap = Bitmap.createBitmap(picture);
                    } else {
                        bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmap);
                        canvas.concat(matrix);
                        view.draw(canvas);
                    }
                }
                if (z13 && z11) {
                    viewGroup.getOverlay().remove(view);
                    viewGroup2.addView(view, i11);
                }
                return bitmap;
            }
        } else {
            z11 = false;
        }
        z12 = false;
        z13 = f8610b;
        Bitmap bitmap2 = null;
        if (!z13) {
        }
        viewGroup2 = null;
        i11 = 0;
        round = Math.round(rectF.width());
        round2 = Math.round(rectF.height());
        if (round > 0) {
            float min2 = Math.min(1.0f, 1048576.0f / (round * round2));
            int round32 = Math.round(round * min2);
            int round42 = Math.round(round2 * min2);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min2, min2);
            if (!f8611c) {
            }
        }
        if (z13) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i11);
        }
        return bitmap2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Animator m11031c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
