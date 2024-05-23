package e90;

import ag0.AbstractC0837p0;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import fn0.C19055h0;
import ho0.AbstractC20110a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import ln0.AbstractC22543l;
import p665y0.C30243e;
import p666y1.C30256b;
import pm0.C24848g0;

/* renamed from: e90.c */
/* loaded from: classes6.dex */
public final class C18310c {

    /* renamed from: a */
    public static final C18310c f92602a = new C18310c();

    /* renamed from: b */
    private static final C30243e f92603b = new C30243e(50);

    /* renamed from: e90.c$a */
    /* loaded from: classes6.dex */
    public interface a {
        /* renamed from: a */
        void mo88380a(String str, C18311d c18311d);
    }

    private C18310c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m97223e(C18312e c18312e, a aVar, String str) {
        Object m149139d;
        Object m149139d2;
        AbstractC19074t.m100208f(c18312e, "$paletteRequest");
        AbstractC19074t.m100208f(aVar, "$listener");
        AbstractC19074t.m100208f(str, "$builderKey");
        C30243e c30243e = f92603b;
        synchronized (c30243e) {
            m149139d = c30243e.m149139d(str);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        C18311d c18311d = (C18311d) m149139d;
        if (c18311d != null) {
            if (c18311d.f92605b != null) {
                aVar.mo88380a(c18312e.m97241e(), c18311d);
                return;
            }
            C30256b m97234b = c18311d.m97234b(2);
            C30256b m97234b2 = c18311d.m97234b(4);
            if (m97234b != null && m97234b2 != null) {
                c18311d.f92605b = f92602a.m97231f(m97234b, m97234b2);
                aVar.mo88380a(c18312e.m97241e(), c18311d);
                return;
            }
        }
        C18310c c18310c = f92602a;
        c18310c.m97224g(c18312e);
        synchronized (c30243e) {
            m149139d2 = c30243e.m149139d(str);
            C18311d c18311d2 = (C18311d) m149139d2;
            if (c18311d2 != null) {
                C30256b m97234b3 = c18311d2.m97234b(2);
                C30256b m97234b4 = c18311d2.m97234b(4);
                if (m97234b3 != null && m97234b4 != null) {
                    c18311d2.f92605b = c18310c.m97231f(m97234b3, m97234b4);
                }
            }
        }
        aVar.mo88380a(c18312e.m97241e(), (C18311d) m149139d2);
    }

    /* renamed from: g */
    private final void m97224g(C18312e c18312e) {
        int i11;
        int i12;
        int[] iArr;
        String str;
        final int i13;
        final C19055h0 c19055h0;
        int i14;
        int i15;
        Rect rect;
        float m116579b;
        float m116579b2;
        int[] m97238b = c18312e.m97238b();
        String m97227j = m97227j(c18312e);
        Bitmap m97237a = c18312e.m97237a();
        int width = m97237a.getWidth();
        int height = m97237a.getHeight();
        Float m97239c = c18312e.m97239c();
        Integer m97240d = c18312e.m97240d();
        int i16 = 1;
        if (m97239c != null) {
            m116579b = AbstractC22543l.m116579b(width * m97239c.floatValue(), 1.0f);
            m116579b2 = AbstractC22543l.m116579b(height * m97239c.floatValue(), 1.0f);
            i11 = (int) m116579b2;
            i12 = (int) m116579b;
        } else if (m97240d != null) {
            i12 = m97240d.intValue();
            i11 = m97240d.intValue();
        } else {
            i11 = 1;
            i12 = 1;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(m97238b.length);
        int length = m97238b.length;
        int i17 = 0;
        int i18 = 0;
        while (i18 < length) {
            C19055h0 c19055h02 = new C19055h0();
            int i19 = m97238b[i18];
            if (i19 != i16) {
                if (i19 != 2) {
                    if (i19 != 3) {
                        if (i19 != 4) {
                            rect = null;
                            iArr = m97238b;
                            str = m97227j;
                            i13 = i19;
                            c19055h0 = c19055h02;
                            i14 = i18;
                            i15 = length;
                        } else {
                            rect = new Rect();
                            int i21 = height - i11;
                            rect.set(i17, i21, width, height);
                            i13 = i19;
                            iArr = m97238b;
                            c19055h0 = c19055h02;
                            i14 = i18;
                            i15 = length;
                            c19055h0.f94931p = m97226i(m97237a, 0, i21, width, i11);
                            str = m97227j;
                        }
                    } else {
                        iArr = m97238b;
                        i13 = i19;
                        c19055h0 = c19055h02;
                        i14 = i18;
                        i15 = length;
                        rect = new Rect();
                        int i22 = width - i12;
                        rect.set(i22, 0, width, height);
                        str = m97227j;
                        c19055h0.f94931p = m97226i(m97237a, i22, 0, i12, height);
                    }
                } else {
                    iArr = m97238b;
                    str = m97227j;
                    i13 = i19;
                    c19055h0 = c19055h02;
                    i14 = i18;
                    i15 = length;
                    rect = new Rect();
                    rect.set(0, 0, width, i11);
                    c19055h0.f94931p = m97226i(m97237a, 0, 0, width, i11);
                }
            } else {
                iArr = m97238b;
                str = m97227j;
                i13 = i19;
                c19055h0 = c19055h02;
                i14 = i18;
                i15 = length;
                rect = new Rect();
                rect.set(0, 0, i12, height);
                c19055h0.f94931p = m97226i(m97237a, 0, 0, i12, height);
            }
            C30256b.b m149233b = C30256b.m149233b(m97237a);
            AbstractC19074t.m100207e(m149233b, "from(...)");
            if (rect != null) {
                try {
                    m149233b.m149248e(rect.left, rect.top, rect.right, rect.bottom);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            final String str2 = str;
            m149233b.m149246a(new C30256b.d() { // from class: e90.b
                @Override // p666y1.C30256b.d
                /* renamed from: a */
                public final void mo97220a(C30256b c30256b) {
                    C18310c.m97225h(countDownLatch, str2, i13, c19055h0, c30256b);
                }
            });
            i18 = i14 + 1;
            m97227j = str2;
            length = i15;
            m97238b = iArr;
            i17 = 0;
            i16 = 1;
        }
        try {
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m97225h(CountDownLatch countDownLatch, String str, int i11, C19055h0 c19055h0, C30256b c30256b) {
        AbstractC19074t.m100208f(countDownLatch, "$countDownLatch");
        AbstractC19074t.m100208f(str, "$builderKey");
        AbstractC19074t.m100208f(c19055h0, "$pixelColor");
        try {
            try {
                C30243e c30243e = f92603b;
                synchronized (c30243e) {
                    try {
                        C18311d c18311d = (C18311d) c30243e.m149139d(str);
                        if (c18311d == null) {
                            c18311d = new C18311d();
                            c30243e.m149140e(str, c18311d);
                        }
                        c18311d.m97236d(i11, c30256b);
                        c18311d.m97235c(i11, c19055h0.f94931p);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    /* renamed from: i */
    private final int m97226i(Bitmap bitmap, int i11, int i12, int i13, int i14) {
        if (i13 != 0 && i14 != 0) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, i11, i12, i13, i14);
                AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 1, 1, false);
                AbstractC19074t.m100207e(createScaledBitmap, "createScaledBitmap(...)");
                return createScaledBitmap.getPixel(0, 0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return 0;
    }

    /* renamed from: j */
    private final String m97227j(C18312e c18312e) {
        int length = c18312e.m97238b().length;
        String str = "";
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 > 0) {
                str = str + " ";
            }
            str = str + c18312e.m97238b()[i11];
        }
        return "url: " + c18312e.m97241e() + ", fraction: " + c18312e.m97239c() + ", pxSize: " + c18312e.m97240d() + ", areas: " + str;
    }

    /* renamed from: k */
    private final String m97228k(String str, Float f11, Integer num, int[] iArr) {
        int length = iArr.length;
        String str2 = "";
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 > 0) {
                str2 = str2 + " ";
            }
            str2 = str2 + iArr[i11];
        }
        return "url: " + str + ", fraction: " + f11 + ", pxSize: " + num + ", areas: " + str2;
    }

    /* renamed from: c */
    public final void m97229c(final C18312e c18312e, final a aVar) {
        Object m149139d;
        AbstractC19074t.m100208f(c18312e, "paletteRequest");
        AbstractC19074t.m100208f(aVar, "listener");
        final String m97227j = m97227j(c18312e);
        C30243e c30243e = f92603b;
        synchronized (c30243e) {
            m149139d = c30243e.m149139d(m97227j);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        C18311d c18311d = (C18311d) m149139d;
        if (c18311d != null && c18311d.f92605b != null) {
            aVar.mo88380a(c18312e.m97241e(), c18311d);
        } else {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: e90.a
                @Override // java.lang.Runnable
                public final void run() {
                    C18310c.m97223e(C18312e.this, aVar, m97227j);
                }
            });
        }
    }

    /* renamed from: d */
    public final void m97230d(String str, float f11, Bitmap bitmap, a aVar) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(bitmap, "bitmap");
        AbstractC19074t.m100208f(aVar, "listener");
        m97229c(new C18312e(str, bitmap, new int[]{2, 4}, Float.valueOf(f11), null, 16, null), aVar);
    }

    /* renamed from: f */
    public final Drawable m97231f(C30256b c30256b, C30256b c30256b2) {
        if (c30256b != null && c30256b2 != null) {
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{c30256b.m149239f(0), c30256b2.m149239f(0)});
        }
        return null;
    }

    /* renamed from: l */
    public final C18311d m97232l(String str, float f11) {
        C18311d c18311d;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        String m97228k = m97228k(str, Float.valueOf(f11), null, new int[]{2, 4});
        C30243e c30243e = f92603b;
        synchronized (c30243e) {
            c18311d = (C18311d) c30243e.m149139d(m97228k);
        }
        return c18311d;
    }
}
