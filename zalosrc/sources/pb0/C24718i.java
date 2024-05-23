package pb0;

import ad0.InterfaceC0753o;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import bd0.C2771b;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import p471r3.C25630b;
import pb0.C24718i;
import vg.C28020b3;

/* renamed from: pb0.i */
/* loaded from: classes6.dex */
public class C24718i extends AbstractC24711b {

    /* renamed from: o */
    private Bitmap f118719o;

    /* renamed from: pb0.i$a */
    /* loaded from: classes6.dex */
    public static final class a implements C28020b3.c {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m128371c(C24718i c24718i) {
            AbstractC19074t.m100208f(c24718i, "this$0");
            InterfaceC0753o mo128320l = c24718i.mo128320l();
            if (mo128320l != null) {
                mo128320l.invalidate();
            }
        }

        @Override // vg.C28020b3.c
        /* renamed from: a */
        public void mo76556a(C25630b c25630b, Bitmap bitmap) {
            if (c25630b == null) {
                return;
            }
            InterfaceC0753o mo128320l = C24718i.this.mo128320l();
            if (mo128320l == null || mo128320l.mo1323C0(c25630b)) {
                C24718i.this.f118719o = bitmap;
                final C24718i c24718i = C24718i.this;
                AbstractC19444a.m101697e(new Runnable() { // from class: pb0.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        C24718i.a.m128371c(C24718i.this);
                    }
                });
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24718i(C2771b c2771b) {
        super(c2771b);
        AbstractC19074t.m100208f(c2771b, "args");
    }

    @Override // pb0.AbstractC24712c
    /* renamed from: e */
    public boolean mo128340e(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        Bitmap bitmap = this.f118719o;
        if (bitmap != null && !bitmap.isRecycled()) {
            m128341f(this.f118719o, canvas);
            return true;
        }
        return false;
    }

    @Override // pb0.AbstractC24711b
    /* renamed from: t */
    public void mo128329t(boolean z11) {
        Bitmap bitmap = this.f118719o;
        if (bitmap != null && !bitmap.isRecycled()) {
            return;
        }
        C28020b3.f130648a.m141204u(m128343n(), new a(), z11);
    }
}
