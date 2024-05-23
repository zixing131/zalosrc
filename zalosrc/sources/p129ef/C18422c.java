package p129ef;

import android.graphics.Bitmap;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.MainApplication;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.C23278z2;
import p129ef.C18422c;
import p160ff.C18903a;
import p276jt.C21354i;
import p276jt.InterfaceC21360o;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;

/* renamed from: ef.c */
/* loaded from: classes3.dex */
public final class C18422c extends C21354i implements InterfaceC21360o {

    /* renamed from: a0 */
    private C18903a f92902a0;

    /* renamed from: b0 */
    private String f92903b0;

    /* renamed from: c0 */
    private final C23528a f92904c0;

    /* renamed from: ef.c$a */
    /* loaded from: classes3.dex */
    public static final class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f92905l1;

        /* renamed from: m1 */
        final /* synthetic */ RecyclingImageView f92906m1;

        /* renamed from: n1 */
        final /* synthetic */ C18422c f92907n1;

        a(String str, RecyclingImageView recyclingImageView, C18422c c18422c) {
            this.f92905l1 = str;
            this.f92906m1 = recyclingImageView;
            this.f92907n1 = c18422c;
        }

        /* renamed from: H3 */
        public static final void m97635H3(C18422c c18422c, RecyclingImageView recyclingImageView) {
            AbstractC19074t.m100208f(c18422c, "this$0");
            AbstractC19074t.m100208f(recyclingImageView, "$dumpView");
            c18422c.m110644y0();
            c18422c.m1996y();
            recyclingImageView.setImageInfo(null);
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            if (str != null) {
                try {
                    if (AbstractC19074t.m100204b(str, this.f92905l1) && c3979l != null && c3979l.m18839c() != null) {
                        this.f92906m1.setImageInfo(c3979l, true);
                        C18422c c18422c = this.f92907n1;
                        C18903a m97632C0 = c18422c.m97632C0();
                        Bitmap m18839c = c3979l.m18839c();
                        AbstractC19074t.m100207e(m18839c, "getBitmap(...)");
                        c18422c.m110645z0(m97632C0.m99091c(m18839c));
                        C18422c c18422c2 = this.f92907n1;
                        c18422c2.m1952U(new Runnable() { // from class: ef.b

                            /* renamed from: q */
                            public final /* synthetic */ RecyclingImageView f92901q;

                            public /* synthetic */ RunnableC18421b(RecyclingImageView recyclingImageView) {
                                r2 = recyclingImageView;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C18422c.a.m97635H3(C18422c.this, r2);
                            }
                        });
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
    }

    public C18422c(C18903a c18903a, String str, C23528a c23528a) {
        AbstractC19074t.m100208f(c18903a, "musicBadge");
        AbstractC19074t.m100208f(str, "songId");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        this.f92902a0 = c18903a;
        this.f92903b0 = str;
        this.f92904c0 = c23528a;
    }

    /* renamed from: D0 */
    private final void m97631D0() {
        if (this.f92902a0.m99092d().length() == 0) {
            return;
        }
        RecyclingImageView recyclingImageView = new RecyclingImageView(MainApplication.Companion.m35500c());
        String m99092d = this.f92902a0.m99092d();
        ((C23528a) this.f92904c0.m123612r(recyclingImageView)).m123579C(m99092d, C23278z2.m120158v(), new a(m99092d, recyclingImageView, this));
    }

    /* renamed from: C0 */
    public final C18903a m97632C0() {
        return this.f92902a0;
    }

    @Override // p276jt.C21354i, p276jt.AbstractC21351f, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        m97631D0();
        super.mo1889D();
    }

    /* renamed from: E0 */
    public final void m97633E0(C18903a c18903a) {
        AbstractC19074t.m100208f(c18903a, "musicBadge");
        if (AbstractC19074t.m100204b(this.f92903b0, c18903a.m99093e())) {
            return;
        }
        this.f92903b0 = c18903a.m99093e();
        this.f92902a0 = c18903a;
        m97631D0();
    }
}
