package p276jt;

import ag.AbstractC0784d;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import eh0.AbstractC18432a;
import et.AbstractC18594a;
import p169fu.AbstractC19146a;
import se0.AbstractC26236a;

/* renamed from: jt.b */
/* loaded from: classes4.dex */
public class C21347b extends AbstractC0784d {

    /* renamed from: F */
    public int f103955F;

    /* renamed from: J */
    public float f103959J;

    /* renamed from: L */
    private Bitmap f103961L;

    /* renamed from: M */
    private Bitmap f103962M;

    /* renamed from: N */
    private Bitmap f103963N;

    /* renamed from: G */
    private int f103956G = -1;

    /* renamed from: H */
    private int f103957H = -1;

    /* renamed from: I */
    public int f103958I = -1;

    /* renamed from: K */
    private final Object f103960K = new Object();

    /* renamed from: O */
    private int[] f103964O = null;

    public C21347b(Resources resources, int i11) {
        this.f103955F = i11;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = 1;
        options.inSampleSize = 1;
        options.inScaled = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            this.f103961L = BitmapFactory.decodeResource(resources, AbstractC18432a.candy, options);
                            this.f103963N = BitmapFactory.decodeResource(resources, AbstractC18432a.candy_highlight, options);
                        }
                    } else {
                        this.f103961L = BitmapFactory.decodeResource(resources, AbstractC18432a.radial, options);
                    }
                } else {
                    this.f103961L = BitmapFactory.decodeResource(resources, AbstractC18432a.neon_highlight, options);
                    this.f103963N = AbstractC19146a.m100469h(BitmapFactory.decodeResource(resources, AbstractC18432a.neon, options), -1);
                }
            } else {
                this.f103961L = BitmapFactory.decodeResource(resources, AbstractC18432a.marker, options);
            }
        } else {
            this.f103961L = BitmapFactory.decodeResource(resources, AbstractC18432a.radial, options);
        }
        m110561d0(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        int i11 = this.f103956G;
        if (i11 != -1) {
            AbstractC26236a.m134898e(i11);
            this.f103956G = -1;
        }
        int i12 = this.f103957H;
        if (i12 != -1) {
            AbstractC26236a.m134898e(i12);
            this.f103957H = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        Bitmap bitmap;
        super.mo1889D();
        if (this.f103956G == -1 && (bitmap = this.f103962M) != null) {
            this.f103956G = AbstractC18594a.m98198e(bitmap, null);
        }
        Bitmap bitmap2 = this.f103963N;
        if (bitmap2 != null && this.f103957H == -1) {
            this.f103957H = AbstractC18594a.m98198e(bitmap2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0791k
    /* renamed from: E */
    public void mo1890E() {
        Bitmap bitmap;
        Bitmap bitmap2;
        super.mo1890E();
        int i11 = this.f103956G;
        if (i11 != -1 && (bitmap2 = this.f103962M) != null) {
            AbstractC26236a.m134914u(i11, bitmap2);
        }
        int i12 = this.f103957H;
        if (i12 != -1 && (bitmap = this.f103963N) != null) {
            AbstractC26236a.m134914u(i12, bitmap);
        }
    }

    @Override // ag.AbstractC0784d
    /* renamed from: R */
    protected void mo1909R() {
    }

    /* renamed from: a0 */
    public int m110558a0() {
        Bitmap bitmap = this.f103961L;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return 0;
    }

    /* renamed from: b0 */
    public int m110559b0() {
        Bitmap bitmap = this.f103961L;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return 0;
    }

    /* renamed from: c0 */
    public int m110560c0() {
        return this.f103957H;
    }

    /* renamed from: d0 */
    public void m110561d0(int i11) {
        if (this.f103958I == i11) {
            return;
        }
        synchronized (this.f103960K) {
            try {
                Bitmap bitmap = this.f103961L;
                if (bitmap == null) {
                    return;
                }
                this.f103958I = i11;
                if (this.f103962M == null) {
                    this.f103962M = Bitmap.createBitmap(bitmap.getWidth(), this.f103961L.getHeight(), Bitmap.Config.ARGB_8888);
                }
                int width = this.f103961L.getWidth() * this.f103961L.getHeight();
                if (this.f103964O == null) {
                    this.f103964O = new int[width];
                }
                Bitmap bitmap2 = this.f103961L;
                bitmap2.getPixels(this.f103964O, 0, bitmap2.getWidth(), 0, 0, this.f103961L.getWidth(), this.f103961L.getHeight());
                int i12 = i11 & 16777215;
                int i13 = 0;
                if (this.f103955F == 4) {
                    while (i13 < width) {
                        int[] iArr = this.f103964O;
                        iArr[i13] = iArr[i13] | i12;
                        i13++;
                    }
                } else {
                    while (i13 < width) {
                        int[] iArr2 = this.f103964O;
                        iArr2[i13] = (iArr2[i13] & (-16777216)) | i12;
                        i13++;
                    }
                }
                this.f103962M.setPixels(this.f103964O, 0, this.f103961L.getWidth(), 0, 0, this.f103961L.getWidth(), this.f103961L.getHeight());
                m1952U(new Runnable() { // from class: jt.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C21347b.this.m1996y();
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public int m110562l() {
        return this.f103956G;
    }
}
