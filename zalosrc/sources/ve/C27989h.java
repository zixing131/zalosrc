package ve;

import ag0.AbstractC0837p0;
import android.graphics.Bitmap;
import au.C2365p;
import com.zing.zalo.cameradecor.view.ImageDecorView;
import java.lang.ref.WeakReference;
import p169fu.AbstractC19146a;
import ru.C25978a;
import u30.AbstractRunnableC27007b;
import zh0.AbstractC32212c;

/* renamed from: ve.h */
/* loaded from: classes3.dex */
public class C27989h extends AbstractRunnableC27007b {

    /* renamed from: r */
    private final WeakReference f130484r;

    /* renamed from: s */
    private final a f130485s;

    /* renamed from: ve.h$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo39367a(Bitmap bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ve.h$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        final boolean f130486a;

        /* renamed from: b */
        final boolean f130487b;

        /* renamed from: c */
        final int f130488c;

        /* renamed from: d */
        final boolean f130489d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
            this.f130486a = false;
            this.f130487b = false;
            this.f130488c = 0;
            this.f130489d = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(boolean z11, boolean z12, int i11, boolean z13) {
            this.f130486a = z11;
            this.f130487b = z12;
            this.f130488c = i11;
            this.f130489d = z13;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C27989h(ImageDecorView imageDecorView, a aVar) {
        super(AbstractC0837p0.m2224e());
        this.f130484r = new WeakReference(imageDecorView);
        this.f130485s = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u30.AbstractRunnableC27007b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Bitmap mo116138b(b... bVarArr) {
        Bitmap screenBitmap;
        ImageDecorView imageDecorView = (ImageDecorView) this.f130484r.get();
        if (imageDecorView != null && bVarArr.length > 0) {
            b bVar = bVarArr[0];
            if (bVar.f130486a) {
                screenBitmap = imageDecorView.m39765W(bVar.f130487b);
            } else {
                screenBitmap = imageDecorView.getScreenBitmap();
            }
            if (screenBitmap != null) {
                if (bVar.f130488c != 0) {
                    screenBitmap = AbstractC19146a.m100466e(screenBitmap, AbstractC32212c.m155331a(imageDecorView.getContext()) - bVar.f130488c);
                }
                if (bVar.f130489d) {
                    return C2365p.m12377i(C25978a.m133807a()).m12382h(480.0f).m12381f(screenBitmap);
                }
                return screenBitmap;
            }
            return screenBitmap;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u30.AbstractRunnableC27007b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo116143d(Bitmap bitmap) {
        super.mo116143d(bitmap);
        a aVar = this.f130485s;
        if (aVar != null) {
            aVar.mo39367a(bitmap);
        }
    }
}
