package l80;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC6918a0;
import id0.C20516b;
import id0.C20518d;
import kd0.C21693c;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p248iy.AbstractC20887g;
import p354n3.C23528a;
import p379o3.AbstractC24006q;
import p379o3.AbstractRunnableC23992c;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p471r3.C25630b;
import p588vw.C28644j;
import vg.C28020b3;

/* renamed from: l80.a0 */
/* loaded from: classes6.dex */
public class C22122a0 extends C21693c {

    /* renamed from: e1 */
    private static final int f108868e1 = (int) ((AbstractC23136l9.m118698c0().getDisplayMetrics().density * 1.0f) + 0.5f);

    /* renamed from: W0 */
    protected C3977j f108869W0;

    /* renamed from: X0 */
    C23999j f108870X0;

    /* renamed from: Y0 */
    private boolean f108871Y0;

    /* renamed from: Z0 */
    private boolean f108872Z0;

    /* renamed from: a1 */
    private Paint f108873a1;

    /* renamed from: b1 */
    private int f108874b1;

    /* renamed from: c1 */
    private int f108875c1;

    /* renamed from: d1 */
    private float f108876d1;

    /* renamed from: l80.a0$a */
    /* loaded from: classes6.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ d f108877l1;

        /* renamed from: m1 */
        final /* synthetic */ boolean f108878m1;

        a(d dVar, boolean z11) {
            this.f108877l1 = dVar;
            this.f108878m1 = z11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            d dVar;
            if (str != null && str.equals(C22122a0.this.getTag(AbstractC6918a0.tag_url_recycling_image_module)) && (dVar = this.f108877l1) != null) {
                dVar.mo43943h(str, C22122a0.this, c3979l, c23995f, this.f108878m1);
            }
            C22122a0.this.f108870X0 = null;
        }
    }

    /* renamed from: l80.a0$b */
    /* loaded from: classes6.dex */
    public class b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ d f108880l1;

        /* renamed from: m1 */
        final /* synthetic */ boolean f108881m1;

        b(d dVar, boolean z11) {
            this.f108880l1 = dVar;
            this.f108881m1 = z11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            d dVar;
            if (str != null && str.equals(C22122a0.this.getTag(AbstractC6918a0.tag_url_recycling_image_module)) && (dVar = this.f108880l1) != null) {
                dVar.mo43943h(str, C22122a0.this, c3979l, c23995f, this.f108881m1);
            }
            C22122a0.this.f108870X0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l80.a0$c */
    /* loaded from: classes6.dex */
    public class c extends AbstractC24006q {

        /* renamed from: M0 */
        final /* synthetic */ e f108883M0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C25630b c25630b, Drawable drawable, int i11, e eVar) {
            super(c25630b, drawable, i11);
            this.f108883M0 = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.AbstractC24006q
        /* renamed from: I1 */
        public void mo115390I1(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c23995f.m125666q() == 1 && c23995f.m125657h() == 200) {
                C28644j.m143233Y().m143297a1(this.f116145U);
            }
            if (str != null && str.equals(C22122a0.this.getTag(AbstractC6918a0.tag_url_recycling_image_module)) && this.f108883M0 != null) {
                if (c23995f.m125657h() == 200) {
                    this.f108883M0.mo108746b(str, c25630b, C22122a0.this, c3979l, c23995f);
                } else {
                    this.f108883M0.mo108745a(str, c25630b, C22122a0.this, c23995f);
                }
            }
        }
    }

    /* renamed from: l80.a0$d */
    /* loaded from: classes6.dex */
    public static class d {

        /* renamed from: b */
        private int f108886b = 6;

        /* renamed from: a */
        private C20516b f108885a = m115392e();

        /* renamed from: d */
        private int m115391d(int i11) {
            if (i11 == 1) {
                return 4;
            }
            if (i11 != 3) {
                return i11 != 4 ? 0 : 1;
            }
            return 2;
        }

        /* renamed from: e */
        private static C20516b m115392e() {
            return new C20518d().mo106587c(0.25f).mo106594k(1.0f).m106599o(true).m106593j(150L);
        }

        /* renamed from: f */
        private boolean m115393f(int i11) {
            if ((m115391d(i11) & this.f108886b) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public static void m115394g(C3979l c3979l, long j11) {
            if (c3979l.m18846j() == null || c3979l.m18841e() != 1) {
                return;
            }
            if (c3979l.m18846j().equals(C3979l.b.FEED_THUMBNAIL) || c3979l.m18846j().equals(C3979l.b.FEED_VIEW_FULL_NORMAL) || c3979l.m18846j().equals(C3979l.b.FEED_VIEW_FULL_HQ)) {
                if (c3979l.m18845i() == C3979l.a.JPEG) {
                    AbstractC20887g.m109247y(16872, c3979l.m18847k(), c3979l.m18842f(), c3979l.m18840d());
                    AbstractC20887g.m109247y(16873, 0L, 0L, j11);
                } else if (c3979l.m18843g() == 0) {
                    AbstractC20887g.m109247y(16868, c3979l.m18847k(), c3979l.m18842f(), c3979l.m18840d());
                    AbstractC20887g.m109247y(16890, 0L, 0L, j11);
                } else {
                    AbstractC20887g.m109241s(16868, "" + c3979l.m18843g(), c3979l.m18847k());
                }
            }
        }

        /* renamed from: a */
        public d m115395a(long j11) {
            C20516b c20516b = this.f108885a;
            if (c20516b != null) {
                c20516b.m106593j(j11);
            }
            return this;
        }

        /* renamed from: b */
        public d m115396b(int i11) {
            this.f108886b = i11;
            return this;
        }

        /* renamed from: c */
        public d m115397c(C20516b c20516b) {
            this.f108885a = c20516b;
            return this;
        }

        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            C20516b c20516b;
            if (c3979l != null) {
                try {
                    c22122a0.m115386T1(c3979l);
                    if (m115393f(c23995f.m125666q()) && (c20516b = this.f108885a) != null) {
                        c22122a0.m89135c1(c20516b);
                    }
                    if (!z11) {
                        m115394g(c3979l, c23995f.m125661l());
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* renamed from: l80.a0$e */
    /* loaded from: classes6.dex */
    public static class e {
        /* renamed from: a */
        public void mo108745a(String str, C25630b c25630b, C22122a0 c22122a0, C23995f c23995f) {
            try {
                C28020b3.f130648a.m141189R(c23995f);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: b */
        public void mo108746b(String str, C25630b c25630b, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f) {
            try {
                if (c23995f.m125666q() == 1) {
                    C28644j.m143233Y().m143297a1(c25630b);
                }
                if (c3979l != null) {
                    c22122a0.m115387U1(c3979l, false);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    public C22122a0(Context context) {
        super(context);
        this.f108871Y0 = false;
        this.f108872Z0 = false;
        this.f108874b1 = 402653184;
        this.f108875c1 = f108868e1;
    }

    /* renamed from: F1 */
    private void m115370F1() {
        if (this.f108869W0 == null) {
            this.f108869W0 = new C3977j(getContext());
        }
    }

    /* renamed from: B1 */
    public void m115371B1() {
        C23999j c23999j = this.f108870X0;
        if (c23999j != null) {
            c23999j.m125586E();
            this.f108870X0 = null;
        }
    }

    /* renamed from: C1 */
    public void m115372C1() {
        setTag(AbstractC6918a0.tag_url_recycling_image_module, "");
    }

    /* renamed from: D1 */
    public C3979l m115373D1() {
        C3977j c3977j = this.f108869W0;
        if (c3977j != null) {
            return c3977j.m18836a();
        }
        return null;
    }

    /* renamed from: E1 */
    public float m115374E1() {
        return this.f108876d1;
    }

    /* renamed from: G1 */
    public void m115375G1(C23528a c23528a, String str, C24003n c24003n) {
        mo65956I1(c23528a, str, c24003n, -1, C3979l.b.UNKNOWN, new d());
    }

    /* renamed from: H1 */
    public void m115376H1(C23528a c23528a, String str, C24003n c24003n, int i11) {
        mo65956I1(c23528a, str, c24003n, i11, C3979l.b.UNKNOWN, new d());
    }

    /* renamed from: I1 */
    public void mo65956I1(C23528a c23528a, String str, C24003n c24003n, int i11, C3979l.b bVar, d dVar) {
        m115378L1(c23528a, str, c24003n, i11, bVar, dVar, null);
    }

    /* renamed from: J1 */
    public void mo65957J1(C23528a c23528a, String str, C24003n c24003n, int i11, C3979l.b bVar, d dVar, int i12) {
        m115377K1(c23528a, str, c24003n, i11, bVar, dVar, i12, null);
    }

    /* renamed from: K1 */
    public void m115377K1(C23528a c23528a, String str, C24003n c24003n, int i11, C3979l.b bVar, d dVar, int i12, AbstractRunnableC23992c.c cVar) {
        try {
            m115370F1();
            Drawable drawable = c24003n.f116261b;
            if (drawable != null) {
                mo111925v1(drawable);
            }
            boolean m125696L2 = C23999j.m125696L2(str, c24003n);
            setTag(AbstractC6918a0.tag_url_recycling_image_module, str);
            b bVar2 = new b(dVar, m125696L2);
            this.f108870X0 = bVar2;
            bVar2.m125607d1(cVar);
            this.f108870X0.m125609e1(true);
            this.f108870X0.m125611h1(i12, 0);
            if (i11 == -1) {
                ((C23528a) c23528a.m123612r(this.f108869W0)).m123578B(str, c24003n, bVar, this.f108870X0);
            } else {
                ((C23528a) c23528a.m123612r(this.f108869W0)).m123620z(str, c24003n, i11, bVar, this.f108870X0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: L1 */
    public void m115378L1(C23528a c23528a, String str, C24003n c24003n, int i11, C3979l.b bVar, d dVar, AbstractRunnableC23992c.c cVar) {
        try {
            m115370F1();
            Drawable drawable = c24003n.f116261b;
            if (drawable != null) {
                mo111925v1(drawable);
            }
            boolean m125696L2 = C23999j.m125696L2(str, c24003n);
            setTag(AbstractC6918a0.tag_url_recycling_image_module, str);
            a aVar = new a(dVar, m125696L2);
            this.f108870X0 = aVar;
            aVar.m125607d1(cVar);
            this.f108870X0.m125609e1(true);
            if (i11 == -1) {
                ((C23528a) c23528a.m123612r(this.f108869W0)).m123578B(str, c24003n, bVar, this.f108870X0);
            } else {
                ((C23528a) c23528a.m123612r(this.f108869W0)).m123620z(str, c24003n, i11, bVar, this.f108870X0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: M1 */
    public void m115379M1(C23528a c23528a, String str, C24003n c24003n, C3979l.b bVar, d dVar) {
        mo65956I1(c23528a, str, c24003n, -1, bVar, dVar);
    }

    /* renamed from: N1 */
    public void m115380N1(C23528a c23528a, String str, C24003n c24003n, C3979l.b bVar, d dVar, int i11) {
        mo65957J1(c23528a, str, c24003n, -1, bVar, dVar, i11);
    }

    /* renamed from: O1 */
    public void m115381O1(C23528a c23528a, String str, C24003n c24003n, d dVar) {
        mo65956I1(c23528a, str, c24003n, -1, C3979l.b.UNKNOWN, dVar);
    }

    /* renamed from: P1 */
    public void m115382P1(C23528a c23528a, String str, C24003n c24003n, d dVar, int i11) {
        mo65957J1(c23528a, str, c24003n, -1, C3979l.b.UNKNOWN, dVar, i11);
    }

    /* renamed from: Q1 */
    public void m115383Q1(C23528a c23528a, C25630b c25630b, Drawable drawable, int i11, e eVar) {
        try {
            m115370F1();
            if (drawable != null) {
                mo111925v1(drawable);
            }
            setTag(AbstractC6918a0.tag_url_recycling_image_module, c25630b.m132446x());
            ((C23528a) c23528a.m123612r(this.f108869W0)).m123594T((AbstractC24006q) new c(c25630b, drawable, i11, eVar).m125609e1(true));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: R1 */
    public void m115384R1(boolean z11) {
        if (this.f108871Y0 != z11) {
            this.f108871Y0 = z11;
            invalidate();
        }
    }

    /* renamed from: S1 */
    public void m115385S1(Bitmap bitmap, boolean z11) {
        super.mo111924u1(bitmap);
        if (z11) {
            m115372C1();
        }
    }

    /* renamed from: T1 */
    public void m115386T1(C3979l c3979l) {
        m115387U1(c3979l, true);
    }

    /* renamed from: U1 */
    public void m115387U1(C3979l c3979l, boolean z11) {
        try {
            m115370F1();
            if (c3979l != null) {
                if (z11) {
                    mo111924u1(c3979l.m18839c());
                }
            } else {
                mo111924u1(null);
            }
            C3977j c3977j = this.f108869W0;
            if (c3977j != null) {
                c3977j.setImageInfo(c3979l, false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: V1 */
    public void m115388V1(int i11) {
        if (this.f108874b1 != i11) {
            this.f108874b1 = i11;
            invalidate();
        }
    }

    /* renamed from: W1 */
    public void m115389W1(int i11) {
        if (this.f108875c1 != i11) {
            this.f108875c1 = i11;
            invalidate();
        }
    }

    @Override // kd0.C21693c
    /* renamed from: j1 */
    public void mo111914j1() {
        super.mo111914j1();
        mo89140i();
    }

    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        super.mo44775o0(canvas);
        try {
            if (this.f108871Y0) {
                if (this.f108872Z0) {
                    this.f108873a1.setColor(this.f108874b1);
                    this.f108873a1.setStrokeWidth(this.f108875c1);
                    float m89114P = m89114P() / 2.0f;
                    canvas.drawCircle(m89114P, m89114P, m89114P, this.f108873a1);
                } else {
                    this.f108873a1.setColor(this.f108874b1);
                    this.f108873a1.setStrokeWidth(this.f108875c1);
                    canvas.drawRect(0.0f, 0.0f, m89114P(), m89112O(), this.f108873a1);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f108871Y0 = false;
            invalidate();
        }
    }

    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: r */
    public void mo88812r() {
        super.mo88812r();
        if (this.f108871Y0 && this.f108873a1 == null) {
            Paint paint = new Paint();
            this.f108873a1 = paint;
            paint.setAntiAlias(true);
            this.f108873a1.setStyle(Paint.Style.STROKE);
        }
    }

    @Override // kd0.C21693c
    /* renamed from: u1 */
    public void mo111924u1(Bitmap bitmap) {
        m115385S1(bitmap, true);
    }

    @Override // kd0.C21693c
    /* renamed from: v1 */
    public void mo111925v1(Drawable drawable) {
        super.mo111925v1(drawable);
        m115372C1();
        C3977j c3977j = this.f108869W0;
        if (c3977j != null) {
            c3977j.setImageDrawable(drawable);
        }
    }

    @Override // kd0.C21693c
    /* renamed from: w1 */
    public void mo111926w1(int i11) {
        super.mo111926w1(i11);
        m115372C1();
        C3977j c3977j = this.f108869W0;
        if (c3977j != null) {
            c3977j.setImageResource(i11);
        }
    }

    @Override // kd0.C21693c
    /* renamed from: x1 */
    public void mo111927x1(float f11) {
        this.f108876d1 = f11;
        super.mo111927x1(f11);
    }
}
