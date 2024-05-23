package pb0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.widget.C13704p1;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: pb0.j */
/* loaded from: classes6.dex */
public final class C24719j {
    public static final a Companion = new a(null);

    /* renamed from: i */
    private static final int f118721i = AbstractC23222t7.f112580q;

    /* renamed from: j */
    private static final int f118722j = AbstractC23222t7.f112566j;

    /* renamed from: a */
    private final String f118723a;

    /* renamed from: b */
    private final int f118724b;

    /* renamed from: c */
    private final int f118725c;

    /* renamed from: d */
    private final InterfaceC24854k f118726d;

    /* renamed from: e */
    private final Drawable f118727e;

    /* renamed from: f */
    private int f118728f;

    /* renamed from: g */
    private int f118729g;

    /* renamed from: h */
    private final InterfaceC24854k f118730h;

    /* renamed from: pb0.j$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: pb0.j$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f118731q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13704p1 mo12V4() {
            return new C13704p1(1);
        }
    }

    /* renamed from: pb0.j$c */
    /* loaded from: classes6.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f118732q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RectF mo12V4() {
            return new RectF();
        }
    }

    public C24719j() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(c.f118732q);
        this.f118726d = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f118731q);
        this.f118730h = m129210a2;
        m128372b().setColor(-1);
        m128372b().m76613c();
        m128372b().m76614d(f118721i, false);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_fss_tap_to_view);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        this.f118723a = m118743r0;
        this.f118724b = AbstractC23136l9.m118764y0(m128372b(), m118743r0);
        this.f118725c = AbstractC23136l9.m118761x0(m128372b(), m118743r0);
        this.f118727e = AbstractC11531v0.Companion.m62616u0();
    }

    /* renamed from: b */
    private final C13704p1 m128372b() {
        return (C13704p1) this.f118730h.getValue();
    }

    /* renamed from: c */
    private final RectF m128373c() {
        return (RectF) this.f118726d.getValue();
    }

    /* renamed from: a */
    public final void m128374a(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        Drawable drawable = this.f118727e;
        if (drawable != null) {
            int i11 = this.f118728f;
            drawable.setBounds(i11, this.f118729g, drawable.getIntrinsicWidth() + i11, this.f118729g + drawable.getIntrinsicHeight());
            drawable.draw(canvas);
        }
        canvas.drawText(this.f118723a, m128373c().left, m128373c().top, m128372b());
    }

    /* renamed from: d */
    public final void m128375d(int i11, int i12) {
        int i13;
        Drawable drawable = this.f118727e;
        int i14 = 0;
        if (drawable != null) {
            i13 = drawable.getIntrinsicWidth();
        } else {
            i13 = 0;
        }
        Drawable drawable2 = this.f118727e;
        if (drawable2 != null) {
            i14 = drawable2.getIntrinsicHeight();
        }
        int i15 = f118722j;
        int i16 = (i12 - i14) - i15;
        this.f118729g = i16;
        int i17 = ((i11 / 2) - this.f118724b) + i13 + ((i15 / 2) / 2);
        this.f118728f = i17;
        m128373c().set(i17 + i13 + (i15 / 2), i16 + ((i14 + this.f118725c) / 2), r5 + this.f118724b, r6 + this.f118725c);
    }
}
