package l30;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.zing.zalo.p077ui.widget.C13637g0;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import kd0.C21693c;
import me0.AbstractC23136l9;
import p516t3.C26469c;
import p588vw.C28652r;
import vg.C28050e3;

/* renamed from: l30.r0 */
/* loaded from: classes5.dex */
public abstract class AbstractC22047r0 {
    /* renamed from: e */
    public static final void m115047e(ImageView imageView, String str, int i11) {
        AbstractC19074t.m100208f(imageView, "<this>");
        AbstractC19074t.m100208f(str, "reactionId");
        C28050e3.m141486l().m141497i(str, i11, new C28050e3.e() { // from class: l30.p0

            /* renamed from: a */
            public final /* synthetic */ int f108576a;

            /* renamed from: b */
            public final /* synthetic */ ImageView f108577b;

            /* renamed from: c */
            public final /* synthetic */ String f108578c;

            public /* synthetic */ C22043p0(int i112, ImageView imageView2, String str2) {
                r1 = i112;
                r2 = imageView2;
                r3 = str2;
            }

            @Override // vg.C28050e3.e
            /* renamed from: a */
            public final void mo76136a(String str2, Drawable drawable, C28050e3.c cVar) {
                AbstractC22047r0.m115049g(r1, r2, r3, str2, drawable, cVar);
            }
        }, false);
    }

    /* renamed from: f */
    public static final void m115048f(C21693c c21693c, String str, int i11) {
        AbstractC19074t.m100208f(c21693c, "<this>");
        AbstractC19074t.m100208f(str, "reactionId");
        C28050e3.m141486l().m141496h(str, i11, new C28050e3.e() { // from class: l30.n0

            /* renamed from: a */
            public final /* synthetic */ int f108569a;

            /* renamed from: b */
            public final /* synthetic */ C21693c f108570b;

            /* renamed from: c */
            public final /* synthetic */ String f108571c;

            public /* synthetic */ C22039n0(int i112, C21693c c21693c2, String str2) {
                r1 = i112;
                r2 = c21693c2;
                r3 = str2;
            }

            @Override // vg.C28050e3.e
            /* renamed from: a */
            public final void mo76136a(String str2, Drawable drawable, C28050e3.c cVar) {
                AbstractC22047r0.m115051i(r1, r2, r3, str2, drawable, cVar);
            }
        });
    }

    /* renamed from: g */
    public static final void m115049g(int i11, ImageView imageView, String str, String str2, Drawable drawable, C28050e3.c cVar) {
        AbstractC19074t.m100208f(imageView, "$this_loadReaction");
        AbstractC19074t.m100208f(str, "$reactionId");
        AbstractC19444a.m101697e(new Runnable() { // from class: l30.q0

            /* renamed from: p */
            public final /* synthetic */ Drawable f108580p;

            /* renamed from: q */
            public final /* synthetic */ int f108581q;

            /* renamed from: r */
            public final /* synthetic */ ImageView f108582r;

            /* renamed from: s */
            public final /* synthetic */ String f108583s;

            public /* synthetic */ RunnableC22045q0(Drawable drawable2, int i112, ImageView imageView2, String str3) {
                r1 = drawable2;
                r2 = i112;
                r3 = imageView2;
                r4 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22047r0.m115050h(r1, r2, r3, r4);
            }
        });
    }

    /* renamed from: h */
    public static final void m115050h(Drawable drawable, int i11, ImageView imageView, String str) {
        C26469c c26469c;
        AbstractC19074t.m100208f(imageView, "$this_loadReaction");
        AbstractC19074t.m100208f(str, "$reactionId");
        if (drawable != null) {
            if (drawable instanceof C26469c) {
                c26469c = (C26469c) drawable;
            } else {
                c26469c = null;
            }
            if (c26469c != null) {
                float f11 = i11;
                c26469c.setBounds(0, 0, AbstractC23136l9.m118742r(f11), AbstractC23136l9.m118742r(f11));
            }
            imageView.setImageBitmap(m115053k(drawable));
            return;
        }
        String m115155o = AbstractC22055v0.m115155o(str);
        AbstractC19074t.m100207e(m115155o, "getEmoStrByEffectId(...)");
        if (m115155o.length() == 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        C13637g0 m143375n = C28652r.m143349v().m143375n(m115155o, i11);
        AbstractC19074t.m100207e(m143375n, "getDrawable(...)");
        imageView.setImageBitmap(m115053k(m143375n));
    }

    /* renamed from: i */
    public static final void m115051i(int i11, C21693c c21693c, String str, String str2, Drawable drawable, C28050e3.c cVar) {
        AbstractC19074t.m100208f(c21693c, "$this_loadReaction");
        AbstractC19074t.m100208f(str, "$reactionId");
        AbstractC19444a.m101697e(new Runnable() { // from class: l30.o0

            /* renamed from: p */
            public final /* synthetic */ Drawable f108572p;

            /* renamed from: q */
            public final /* synthetic */ int f108573q;

            /* renamed from: r */
            public final /* synthetic */ C21693c f108574r;

            /* renamed from: s */
            public final /* synthetic */ String f108575s;

            public /* synthetic */ RunnableC22041o0(Drawable drawable2, int i112, C21693c c21693c2, String str3) {
                r1 = drawable2;
                r2 = i112;
                r3 = c21693c2;
                r4 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22047r0.m115052j(r1, r2, r3, r4);
            }
        });
    }

    /* renamed from: j */
    public static final void m115052j(Drawable drawable, int i11, C21693c c21693c, String str) {
        C26469c c26469c;
        AbstractC19074t.m100208f(c21693c, "$this_loadReaction");
        AbstractC19074t.m100208f(str, "$reactionId");
        if (drawable instanceof C26469c) {
            c26469c = (C26469c) drawable;
        } else {
            c26469c = null;
        }
        if (c26469c != null) {
            float f11 = i11;
            c26469c.setBounds(0, 0, AbstractC23136l9.m118742r(f11), AbstractC23136l9.m118742r(f11));
        }
        if (drawable != null) {
            c21693c.mo111924u1(m115053k(drawable));
            return;
        }
        String m115155o = AbstractC22055v0.m115155o(str);
        AbstractC19074t.m100207e(m115155o, "getEmoStrByEffectId(...)");
        if (m115155o.length() == 0) {
            c21693c.mo44614b1(8);
            return;
        }
        c21693c.mo44614b1(0);
        C13637g0 m143375n = C28652r.m143349v().m143375n(m115155o, i11);
        AbstractC19074t.m100207e(m143375n, "getDrawable(...)");
        c21693c.mo111924u1(m115053k(m143375n));
    }

    /* renamed from: k */
    public static final Bitmap m115053k(Drawable drawable) {
        Bitmap createBitmap;
        AbstractC19074t.m100208f(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                AbstractC19074t.m100207e(bitmap, "getBitmap(...)");
                return bitmap;
            }
        }
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        } else if (drawable.getBounds().width() > 0 && drawable.getBounds().height() > 0) {
            createBitmap = Bitmap.createBitmap(drawable.getBounds().width(), drawable.getBounds().height(), Bitmap.Config.ARGB_8888);
        } else {
            createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        AbstractC19074t.m100205c(createBitmap);
        drawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }
}
