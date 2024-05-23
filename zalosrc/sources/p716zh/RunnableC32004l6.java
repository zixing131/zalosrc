package p716zh;

import ag0.C0824j;
import am.AbstractC0939u;
import android.graphics.Bitmap;
import bn0.AbstractC2933b;
import bo.C3063z0;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.MainApplication;
import com.zing.zalo.location.C8976v;
import com.zing.zalo.location.C8977w;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.io.FileOutputStream;
import me0.AbstractC23041d2;
import me0.C23278z2;
import mm0.AbstractC23352g;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p471r3.EnumC25629a;
import p716zh.C32049o6;
import pm0.C24848g0;

/* renamed from: zh.l6 */
/* loaded from: classes3.dex */
public final class RunnableC32004l6 implements Runnable {

    /* renamed from: p */
    private final C3063z0 f147257p;

    /* renamed from: q */
    private final int f147258q;

    /* renamed from: r */
    private final float f147259r;

    /* renamed from: s */
    private final C23528a f147260s;

    /* renamed from: t */
    private final C32049o6.b f147261t;

    /* renamed from: u */
    private final C3977j f147262u;

    /* renamed from: zh.l6$a */
    /* loaded from: classes3.dex */
    public static final class a extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ String f147264m1;

        /* renamed from: n1 */
        final /* synthetic */ boolean f147265n1;

        a(String str, boolean z11) {
            this.f147264m1 = str;
            this.f147265n1 = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            RunnableC32004l6.this.m154297c().mo154650a(this.f147264m1, c3979l, this.f147265n1);
            C32049o6 c32049o6 = C32049o6.f147573a;
            boolean z11 = this.f147265n1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onMEm ---");
            sb2.append(z11);
            sb2.append("--onFile--");
            sb2.append(!z11);
            c32049o6.m154649e(sb2.toString());
        }
    }

    /* renamed from: zh.l6$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f147266a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f147267b;

        /* renamed from: zh.l6$b$a */
        /* loaded from: classes3.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Bitmap f147268q;

            /* renamed from: r */
            final /* synthetic */ FileOutputStream f147269r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, FileOutputStream fileOutputStream) {
                super(0);
                this.f147268q = bitmap;
                this.f147269r = fileOutputStream;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m154298a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m154298a() {
                this.f147268q.compress(Bitmap.CompressFormat.JPEG, 100, this.f147269r);
                this.f147269r.flush();
            }
        }

        b(String str, Bitmap bitmap) {
            this.f147266a = str;
            this.f147267b = bitmap;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                AbstractC23041d2.m118208g(this.f147266a);
                FileOutputStream fileOutputStream = new FileOutputStream(this.f147266a);
                try {
                    new a(this.f147267b, fileOutputStream);
                    AbstractC2933b.m13890a(fileOutputStream, null);
                } finally {
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    public RunnableC32004l6(C3063z0 c3063z0, int i11, float f11, C23528a c23528a, C32049o6.b bVar) {
        AbstractC19074t.m100208f(bVar, "listener");
        this.f147257p = c3063z0;
        this.f147258q = i11;
        this.f147259r = f11;
        this.f147260s = c23528a;
        this.f147261t = bVar;
        this.f147262u = new C3977j(MainApplication.Companion.m35500c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m154295d(final RunnableC32004l6 runnableC32004l6, final String str) {
        AbstractC19074t.m100208f(runnableC32004l6, "this$0");
        AbstractC19074t.m100208f(str, "$mapPath");
        C32049o6.f147573a.m154649e("src on MapGenerator");
        C8976v m47987h = C8976v.m47987h();
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = runnableC32004l6.f147258q;
        m47987h.m48000g(new C8977w(currentTimeMillis, i11, (int) (i11 * runnableC32004l6.f147259r), runnableC32004l6.f147257p.m153169a(), runnableC32004l6.f147257p.m153170b(), 15.0f, true, false, new C8976v.a() { // from class: zh.k6
            @Override // com.zing.zalo.location.C8976v.a
            /* renamed from: a */
            public final void mo48001a(Bitmap bitmap) {
                RunnableC32004l6.m154296e(RunnableC32004l6.this, str, bitmap);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m154296e(RunnableC32004l6 runnableC32004l6, String str, Bitmap bitmap) {
        AbstractC19074t.m100208f(runnableC32004l6, "this$0");
        AbstractC19074t.m100208f(str, "$mapPath");
        if (bitmap == null) {
            runnableC32004l6.f147261t.mo154650a(str, null, false);
            return;
        }
        try {
            C3979l c3979l = new C3979l(bitmap, EnumC25629a.DEFAULT);
            C23999j.m125686E1(c3979l, str, C23278z2.m120096T());
            runnableC32004l6.f147261t.mo154650a(str, c3979l, false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        C0824j.m2153b(new b(str, bitmap));
    }

    /* renamed from: c */
    public final C32049o6.b m154297c() {
        return this.f147261t;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        try {
            if (this.f147257p != null) {
                str = AbstractC23352g.m122788d("FEED_LOCATION_" + this.f147257p.m153169a() + "_" + this.f147257p.m153170b());
            } else {
                str = "";
            }
            C32049o6 c32049o6 = C32049o6.f147573a;
            final String str2 = c32049o6.m154645a() + str;
            if (this.f147257p == null) {
                this.f147261t.mo154650a(str2, null, false);
                c32049o6.m154649e("feedLocation null");
                return;
            }
            boolean m118194A = AbstractC23041d2.m118194A(str2);
            boolean m125696L2 = C23999j.m125696L2(str2, C23278z2.m120096T());
            C23528a c23528a = this.f147260s;
            if (c23528a != null && (m125696L2 || m118194A)) {
                ((C23528a) c23528a.m123612r(this.f147262u)).m123579C(str2, C23278z2.m120096T(), new a(str2, m125696L2));
            } else {
                AbstractC19444a.m101695c(new Runnable() { // from class: zh.j6
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC32004l6.m154295d(RunnableC32004l6.this, str2);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
