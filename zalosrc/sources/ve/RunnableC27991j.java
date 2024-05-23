package ve;

import ag0.AbstractC0837p0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.zing.zalo.cameradecor.view.ImageDecorView;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import qm0.AbstractC25358n;
import ve.C27989h;
import zh0.AbstractC32212c;

/* renamed from: ve.j */
/* loaded from: classes3.dex */
public final class RunnableC27991j implements Runnable {

    /* renamed from: p */
    private final byte[] f130492p;

    /* renamed from: q */
    private final int f130493q;

    /* renamed from: r */
    private final boolean f130494r;

    /* renamed from: s */
    private final C27989h.a f130495s;

    /* renamed from: t */
    private final WeakReference f130496t;

    public RunnableC27991j(ImageDecorView imageDecorView, byte[] bArr, int i11, boolean z11, C27989h.a aVar) {
        AbstractC19074t.m100208f(imageDecorView, "imageDecorView");
        AbstractC19074t.m100208f(bArr, "jpegData");
        AbstractC19074t.m100208f(aVar, "callback");
        this.f130492p = bArr;
        this.f130493q = i11;
        this.f130494r = z11;
        this.f130495s = aVar;
        this.f130496t = new WeakReference(imageDecorView);
    }

    /* renamed from: b */
    private final Matrix m141022b(int i11, boolean z11) {
        boolean m131390w;
        Matrix matrix = new Matrix();
        int i12 = i11 % 360;
        m131390w = AbstractC25358n.m131390w(new Integer[]{0, 90, 180, 270}, Integer.valueOf(i12));
        if (m131390w) {
            matrix.postRotate(i12);
            if (z11) {
                matrix.preScale(-1.0f, 1.0f);
            }
            return matrix;
        }
        throw new IllegalArgumentException("pictureRotation must be 0, 90, 180 or 270");
    }

    /* renamed from: c */
    private final int m141023c(int i11, int i12, boolean z11) {
        int i13;
        if (z11) {
            i13 = 360 - ((i11 + i12) % 360);
        } else {
            i13 = (i11 + 360) - i12;
        }
        return i13 % 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m141024e(RunnableC27991j runnableC27991j, C19059j0 c19059j0) {
        AbstractC19074t.m100208f(runnableC27991j, "this$0");
        AbstractC19074t.m100208f(c19059j0, "$capturedBitmap");
        runnableC27991j.f130495s.mo39367a((Bitmap) c19059j0.f94941p);
    }

    /* renamed from: d */
    public final void m141025d() {
        AbstractC0837p0.Companion.m2236a().mo2040a(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        final C19059j0 c19059j0 = new C19059j0();
        ImageDecorView imageDecorView = (ImageDecorView) this.f130496t.get();
        if (imageDecorView != null) {
            int m155331a = AbstractC32212c.m155331a(imageDecorView.getContext());
            int m141023c = m141023c(this.f130493q, m155331a, this.f130494r);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            AbstractC20110a.f98889a.mo104556o(8, "cameraRotation = %d & isFacingFront = %s & screenRotation = %d => pictureRotation = %d", Integer.valueOf(this.f130493q), Boolean.valueOf(this.f130494r), Integer.valueOf(m155331a), Integer.valueOf(m141023c));
            try {
                byte[] bArr = this.f130492p;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                if (decodeByteArray != null) {
                    c19059j0.f94941p = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), m141022b(m141023c, this.f130494r), true);
                }
            } catch (OutOfMemoryError unused) {
            }
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: ve.i
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC27991j.m141024e(RunnableC27991j.this, c19059j0);
            }
        });
    }
}
