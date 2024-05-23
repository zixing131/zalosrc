package pb0;

import ad0.AbstractC0740b;
import ad0.C0751m;
import ad0.C0752n;
import ad0.InterfaceC0744f;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import bd0.C2771b;
import com.zing.zalo.p077ui.widget.C13700o2;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p471r3.C25630b;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: pb0.d */
/* loaded from: classes6.dex */
public class C24713d extends AbstractC24710a {

    /* renamed from: o */
    private final C2771b f118700o;

    /* renamed from: p */
    private final InterfaceC24854k f118701p;

    /* renamed from: pb0.d$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f118702a;

        static {
            int[] iArr = new int[C13700o2.c.values().length];
            try {
                iArr[C13700o2.c.f70827q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f118702a = iArr;
        }
    }

    /* renamed from: pb0.d$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0744f mo12V4() {
            return C24713d.this.m128352C();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24713d(C2771b c2771b) {
        super(c2771b);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c2771b, "args");
        this.f118700o = c2771b;
        m129210a = AbstractC24856m.m129210a(new b());
        this.f118701p = m129210a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final InterfaceC0744f m128352C() {
        InterfaceC0744f c0752n;
        AbstractC0740b.c cVar = new AbstractC0740b.c(m128343n(), this.f118700o.m13328g(), this.f118700o.m13323b(), this.f118700o.m13327f(), this.f118700o.m13322a());
        C13700o2.c m13324c = this.f118700o.m13324c();
        if (m13324c != null && a.f118702a[m13324c.ordinal()] == 1) {
            c0752n = new C0751m(cVar);
        } else {
            c0752n = new C0752n(cVar);
        }
        c0752n.mo1261t(mo128320l());
        return c0752n;
    }

    @Override // pb0.AbstractC24710a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public InterfaceC0744f mo128323t() {
        return (InterfaceC0744f) this.f118701p.getValue();
    }

    @Override // pb0.AbstractC24712c
    /* renamed from: e */
    public boolean mo128340e(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        Bitmap mo1256h = mo128323t().mo1256h();
        if (mo1256h != null && !mo1256h.isRecycled()) {
            m128341f(mo1256h, canvas);
            return true;
        }
        return false;
    }

    @Override // pb0.AbstractC24712c
    /* renamed from: s */
    public void mo128345s(C25630b c25630b) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        super.mo128345s(c25630b);
        mo128323t().mo1253f(c25630b);
    }
}
