package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.AbstractC2029s;
import java.util.Map;

/* loaded from: classes2.dex */
public class ChangeImageTransform extends Transition {

    /* renamed from: Z */
    private static final String[] f8415Z = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: a0 */
    private static final TypeEvaluator f8416a0 = new C1970a();

    /* renamed from: b0 */
    private static final Property f8417b0 = new C1971b(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.ChangeImageTransform$a */
    /* loaded from: classes2.dex */
    static class C1970a implements TypeEvaluator {
        C1970a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f11, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$b */
    /* loaded from: classes2.dex */
    static class C1971b extends Property {
        C1971b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            AbstractC2019j.m11016a(imageView, matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.ChangeImageTransform$c */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C1972c {

        /* renamed from: a */
        static final /* synthetic */ int[] f8418a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f8418a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8418a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: r0 */
    private void m10842r0(C2030t c2030t) {
        View view = c2030t.f8616b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map map = c2030t.f8615a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeImageTransform:matrix", m10844t0(imageView));
        }
    }

    /* renamed from: s0 */
    private static Matrix m10843s0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f11 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f12 = intrinsicHeight;
        float max = Math.max(width / f11, height / f12);
        int round = Math.round((width - (f11 * max)) / 2.0f);
        int round2 = Math.round((height - (f12 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(round, round2);
        return matrix;
    }

    /* renamed from: t0 */
    private static Matrix m10844t0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i11 = C1972c.f8418a[imageView.getScaleType().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return m10843s0(imageView);
                }
            } else {
                return m10847w0(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    /* renamed from: u0 */
    private ObjectAnimator m10845u0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) f8417b0, new AbstractC2029s.a(), matrix, matrix2);
    }

    /* renamed from: v0 */
    private ObjectAnimator m10846v0(ImageView imageView) {
        Property property = f8417b0;
        TypeEvaluator typeEvaluator = f8416a0;
        Matrix matrix = AbstractC2021k.f8589a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, typeEvaluator, matrix, matrix);
    }

    /* renamed from: w0 */
    private static Matrix m10847w0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // androidx.transition.Transition
    /* renamed from: I */
    public String[] mo10817I() {
        return f8415Z;
    }

    @Override // androidx.transition.Transition
    /* renamed from: i */
    public void mo10818i(C2030t c2030t) {
        m10842r0(c2030t);
    }

    @Override // androidx.transition.Transition
    /* renamed from: l */
    public void mo10819l(C2030t c2030t) {
        m10842r0(c2030t);
    }

    @Override // androidx.transition.Transition
    /* renamed from: p */
    public Animator mo10820p(ViewGroup viewGroup, C2030t c2030t, C2030t c2030t2) {
        boolean z11;
        if (c2030t == null || c2030t2 == null) {
            return null;
        }
        Rect rect = (Rect) c2030t.f8615a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) c2030t2.f8615a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) c2030t.f8615a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) c2030t2.f8615a.get("android:changeImageTransform:matrix");
        if ((matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rect.equals(rect2) && z11) {
            return null;
        }
        ImageView imageView = (ImageView) c2030t2.f8616b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            if (matrix == null) {
                matrix = AbstractC2021k.f8589a;
            }
            if (matrix2 == null) {
                matrix2 = AbstractC2021k.f8589a;
            }
            f8417b0.set(imageView, matrix);
            return m10845u0(imageView, matrix, matrix2);
        }
        return m10846v0(imageView);
    }
}
