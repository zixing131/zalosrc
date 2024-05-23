package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.InterfaceC1417d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes2.dex */
public class C1176i {

    /* renamed from: c */
    private static final int[] f4640c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    private final ProgressBar f4641a;

    /* renamed from: b */
    private Bitmap f4642b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1176i(ProgressBar progressBar) {
        this.f4641a = progressBar;
    }

    /* renamed from: a */
    private Shape m5564a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private Drawable m5565d(Drawable drawable, boolean z11) {
        boolean z12;
        if (drawable instanceof InterfaceC1417d) {
            InterfaceC1417d interfaceC1417d = (InterfaceC1417d) drawable;
            Drawable mo7221a = interfaceC1417d.mo7221a();
            if (mo7221a != null) {
                interfaceC1417d.mo7222b(m5565d(mo7221a, z11));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    int id2 = layerDrawable.getId(i11);
                    Drawable drawable2 = layerDrawable.getDrawable(i11);
                    if (id2 != 16908301 && id2 != 16908303) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    drawableArr[i11] = m5565d(drawable2, z12);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i12 = 0; i12 < numberOfLayers; i12++) {
                    layerDrawable2.setId(i12, layerDrawable.getId(i12));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f4642b == null) {
                    this.f4642b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m5564a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z11) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }

    /* renamed from: e */
    private Drawable m5566e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                Drawable m5565d = m5565d(animationDrawable.getFrame(i11), true);
                m5565d.setLevel(10000);
                animationDrawable2.addFrame(m5565d, animationDrawable.getDuration(i11));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap m5567b() {
        return this.f4642b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5568c(AttributeSet attributeSet, int i11) {
        C1211t1 m5716v = C1211t1.m5716v(this.f4641a.getContext(), attributeSet, f4640c, i11, 0);
        Drawable m5724h = m5716v.m5724h(0);
        if (m5724h != null) {
            this.f4641a.setIndeterminateDrawable(m5566e(m5724h));
        }
        Drawable m5724h2 = m5716v.m5724h(1);
        if (m5724h2 != null) {
            this.f4641a.setProgressDrawable(m5565d(m5724h2, false));
        }
        m5716v.m5736w();
    }
}
