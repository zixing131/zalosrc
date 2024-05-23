package p382o6;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: o6.f */
/* loaded from: classes3.dex */
public class C24046f extends Property {

    /* renamed from: a */
    private final Matrix f116367a;

    public C24046f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f116367a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f116367a.set(imageView.getImageMatrix());
        return this.f116367a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
