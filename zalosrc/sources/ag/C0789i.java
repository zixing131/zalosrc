package ag;

import android.graphics.Bitmap;
import et.AbstractC18594a;
import se0.AbstractC26236a;

/* renamed from: ag.i */
/* loaded from: classes3.dex */
public class C0789i extends AbstractC0791k {

    /* renamed from: s */
    Bitmap f2723s;

    /* renamed from: t */
    int f2724t = -1;

    public C0789i(Bitmap bitmap) {
        this.f2723s = bitmap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        int i11 = this.f2724t;
        if (i11 != -1) {
            AbstractC26236a.m134898e(i11);
            this.f2724t = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        Bitmap bitmap = this.f2723s;
        if (bitmap != null) {
            this.f2724t = AbstractC18594a.m98198e(bitmap, null);
        }
    }

    /* renamed from: G */
    public int m1988G() {
        if (!mo1997z()) {
            m1995x();
        }
        return this.f2724t;
    }
}
