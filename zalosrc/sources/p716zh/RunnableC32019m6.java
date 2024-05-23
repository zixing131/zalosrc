package p716zh;

import ag0.C0824j;
import am.AbstractC0939u;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import bn0.AbstractC2933b;
import bo.C3013n3;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.FileOutputStream;
import l30.AbstractC22055v0;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p588vw.C28652r;
import p716zh.C31903ea;
import pm0.C24848g0;

/* renamed from: zh.m6 */
/* loaded from: classes3.dex */
public final class RunnableC32019m6 implements Runnable {
    public static final a Companion = new a(null);

    /* renamed from: p */
    private final String f147399p;

    /* renamed from: q */
    private final String f147400q;

    /* renamed from: r */
    private final int f147401r;

    /* renamed from: s */
    private final C3013n3 f147402s;

    /* renamed from: t */
    private final int f147403t;

    /* renamed from: u */
    private final C24003n f147404u;

    /* renamed from: v */
    private final C31903ea.a f147405v;

    /* renamed from: w */
    private final RecyclingImageView f147406w;

    /* renamed from: zh.m6$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: zh.m6$b */
    /* loaded from: classes3.dex */
    public static final class b extends C23999j {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "bm");
            AbstractC19074t.m100208f(c23995f, "status");
            C31903ea.a m154393c = RunnableC32019m6.this.m154393c();
            if (m154393c != null) {
                m154393c.mo153347a(RunnableC32019m6.this.m154392b(), c3979l);
            }
        }
    }

    /* renamed from: zh.m6$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f147408a;

        /* renamed from: b */
        final /* synthetic */ C3979l f147409b;

        c(String str, C3979l c3979l) {
            this.f147408a = str;
            this.f147409b = c3979l;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            AbstractC23041d2.m118208g(this.f147408a);
            FileOutputStream fileOutputStream = new FileOutputStream(this.f147408a);
            C3979l c3979l = this.f147409b;
            if (c3979l != null) {
                try {
                    c3979l.m18839c().compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(fileOutputStream, null);
        }
    }

    public RunnableC32019m6(String str, String str2, int i11, C3013n3 c3013n3, int i12, C24003n c24003n, C31903ea.a aVar) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "caption");
        AbstractC19074t.m100208f(c24003n, "options");
        this.f147399p = str;
        this.f147400q = str2;
        this.f147401r = i11;
        this.f147402s = c3013n3;
        this.f147403t = i12;
        this.f147404u = c24003n;
        this.f147405v = aVar;
        this.f147406w = new RecyclingImageView(MainApplication.Companion.m35500c());
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* renamed from: a */
    private final C3979l m154391a(CharSequence charSequence, C3013n3 c3013n3, C24003n c24003n) {
        int i11;
        StaticLayout staticLayout;
        int i12;
        TextPaint textPaint;
        int i13;
        Canvas canvas;
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        CharSequence charSequence2 = charSequence;
        if (charSequence2 != null && charSequence.length() != 0 && c3013n3 != null && c24003n != null && c24003n.f116260a > 0) {
            ?? r52 = 0;
            if (charSequence.length() > 50) {
                charSequence2 = ((Object) charSequence2.subSequence(0, 50)) + "...";
            }
            CharSequence m143357H = C28652r.m143349v().m143357H(charSequence2.toString());
            int i14 = c24003n.f116260a;
            float f11 = c24003n.f116270k;
            if (f11 > 0.0f) {
                i11 = (int) (i14 * f11);
            } else {
                i11 = i14;
            }
            int i15 = i14 / 8;
            Bitmap createBitmap = Bitmap.createBitmap(i14, i11, Bitmap.Config.ARGB_8888);
            AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
            Canvas canvas2 = new Canvas(createBitmap);
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(c3013n3.f11991c);
            canvas2.drawRect(0.0f, 0.0f, i14, i11, paint);
            int m118742r = AbstractC23136l9.m118742r(30.0f);
            int i16 = i14 - (i15 * 2);
            int i17 = i11 - (i15 * 4);
            TextPaint textPaint2 = new TextPaint(1);
            textPaint2.setColor(c3013n3.f11990b);
            textPaint2.setTypeface(C31903ea.f146582a.m153336a());
            int i18 = m118742r;
            while (true) {
                textPaint2.setTextSize(i18);
                if (Build.VERSION.SDK_INT >= 23) {
                    obtain = StaticLayout.Builder.obtain(m143357H, r52, m143357H.length(), textPaint2, i16);
                    alignment = obtain.setAlignment(AbstractC22055v0.m115165y(c3013n3.f11992d));
                    lineSpacing = alignment.setLineSpacing(0.8f, 1.0f);
                    includePad = lineSpacing.setIncludePad(r52);
                    staticLayout = includePad.build();
                    AbstractC19074t.m100205c(staticLayout);
                    i12 = i18;
                    textPaint = textPaint2;
                    i13 = i17;
                    canvas = canvas2;
                } else {
                    i12 = i18;
                    textPaint = textPaint2;
                    i13 = i17;
                    canvas = canvas2;
                    staticLayout = new StaticLayout(m143357H, textPaint2, i16, AbstractC22055v0.m115165y(c3013n3.f11992d), 1.0f, 0.8f, false);
                }
                i18 = i12 - AbstractC23222t7.f112550b;
                if (i18 == 0 || staticLayout.getHeight() <= i13) {
                    break;
                }
                canvas2 = canvas;
                i17 = i13;
                textPaint2 = textPaint;
                r52 = 0;
            }
            canvas.save();
            Canvas canvas3 = canvas;
            canvas3.translate(i15, (i11 - staticLayout.getHeight()) / 2);
            staticLayout.draw(canvas3);
            canvas3.restore();
            if (c24003n.f116264e == 1000) {
                createBitmap = C23999j.m125743s2(createBitmap);
                AbstractC19074t.m100207e(createBitmap, "getCircleBitmap(...)");
            }
            return new C3979l(createBitmap, c24003n.f116266g);
        }
        return null;
    }

    /* renamed from: b */
    public final String m154392b() {
        return this.f147399p;
    }

    /* renamed from: c */
    public final C31903ea.a m154393c() {
        return this.f147405v;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x000c, B:9:0x001f, B:13:0x003a, B:15:0x0055, B:19:0x005b, B:21:0x0015, B:23:0x0019), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        String m153342g;
        C31903ea.a aVar;
        try {
            if (!TextUtils.isEmpty(this.f147400q)) {
                C3013n3 c3013n3 = this.f147402s;
                if (c3013n3 != null) {
                    if (!c3013n3.m14430a()) {
                    }
                    C31903ea c31903ea = C31903ea.f146582a;
                    m153342g = c31903ea.m153342g(this.f147400q, this.f147401r, this.f147403t);
                    boolean m118194A = AbstractC23041d2.m118194A(m153342g);
                    if (!C23999j.m125696L2(m153342g, this.f147404u) && !m118194A) {
                        C3979l m154391a = m154391a(this.f147400q, this.f147402s, this.f147404u);
                        C23999j.m125686E1(m154391a, m153342g, this.f147404u);
                        C0824j.m2153b(new c(m153342g, m154391a));
                        aVar = this.f147405v;
                        if (aVar == null) {
                            aVar.mo153347a(this.f147399p, m154391a);
                            return;
                        }
                        return;
                    }
                    ((C23528a) c31903ea.m153338c().m123612r(this.f147406w)).m123579C(m153342g, this.f147404u, new b());
                }
            }
            C31903ea.a aVar2 = this.f147405v;
            if (aVar2 != null) {
                aVar2.mo153347a(this.f147399p, null);
            }
            C31903ea c31903ea2 = C31903ea.f146582a;
            m153342g = c31903ea2.m153342g(this.f147400q, this.f147401r, this.f147403t);
            boolean m118194A2 = AbstractC23041d2.m118194A(m153342g);
            if (!C23999j.m125696L2(m153342g, this.f147404u)) {
                C3979l m154391a2 = m154391a(this.f147400q, this.f147402s, this.f147404u);
                C23999j.m125686E1(m154391a2, m153342g, this.f147404u);
                C0824j.m2153b(new c(m153342g, m154391a2));
                aVar = this.f147405v;
                if (aVar == null) {
                }
            }
            ((C23528a) c31903ea2.m153338c().m123612r(this.f147406w)).m123579C(m153342g, this.f147404u, new b());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
