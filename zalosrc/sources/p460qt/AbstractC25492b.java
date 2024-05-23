package p460qt;

import ag0.AbstractC0837p0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import et.C18607n;
import java.io.IOException;
import me0.AbstractC23009a3;
import u30.AbstractRunnableC27007b;

/* renamed from: qt.b */
/* loaded from: classes4.dex */
public abstract class AbstractC25492b extends AbstractRunnableC27007b {

    /* renamed from: r */
    private C18607n f122117r;

    /* renamed from: s */
    private int f122118s;

    /* renamed from: t */
    private int f122119t;

    /* renamed from: u */
    protected int f122120u;

    /* renamed from: v */
    protected int f122121v;

    public AbstractC25492b(C18607n c18607n, int i11, int i12) {
        super(AbstractC0837p0.m2225f());
        this.f122118s = -1;
        this.f122119t = -1;
        this.f122120u = 0;
        this.f122121v = 0;
        this.f122117r = c18607n;
        this.f122118s = Math.max(i11, AbstractC23009a3.f111958b);
        this.f122119t = Math.max(i12, AbstractC23009a3.f111959c);
    }

    /* renamed from: g */
    protected abstract Bitmap mo132064g(BitmapFactory.Options options);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u30.AbstractRunnableC27007b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Bitmap mo116138b(Void... voidArr) {
        C18607n c18607n = this.f122117r;
        if (c18607n != null && c18607n.m98295i1() == 0) {
            try {
                synchronized (this.f122117r.f93521P) {
                    this.f122117r.f93521P.wait(3000L);
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }
        return m132068j(this.f122118s, this.f122119t);
    }

    /* renamed from: i */
    protected abstract int mo132065i();

    /* renamed from: j */
    Bitmap m132068j(int i11, int i12) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        mo132064g(options);
        int i13 = options.outWidth;
        this.f122120u = i13;
        int i14 = options.outHeight;
        this.f122121v = i14;
        int m117958i = AbstractC23009a3.m117958i(i13, i14, i11, i12);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.outWidth = this.f122120u;
        options2.outHeight = this.f122121v;
        options2.inSampleSize = m117958i;
        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options2.inTempStorage = new byte[32768];
        Bitmap mo132064g = mo132064g(options2);
        if (mo132064g == null) {
            return null;
        }
        return m132069k(mo132064g);
    }

    /* renamed from: k */
    Bitmap m132069k(Bitmap bitmap) {
        Bitmap bitmap2;
        IOException e11;
        int mo132065i;
        if (bitmap == null) {
            return null;
        }
        try {
            mo132065i = mo132065i();
        } catch (IOException e12) {
            bitmap2 = bitmap;
            e11 = e12;
        }
        if (mo132065i != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(mo132065i);
            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            try {
                bitmap.recycle();
            } catch (IOException e13) {
                e11 = e13;
                e11.printStackTrace();
                return bitmap2;
            }
            return bitmap2;
        }
        return bitmap;
    }
}
