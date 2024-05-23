package nf;

import ag.C0800t;
import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import bn0.AbstractC2933b;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.videoencode.AbstractC16778c;
import fn0.AbstractC19074t;
import gf0.C19436a;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import ln0.AbstractC22543l;
import me0.AbstractC23041d2;
import me0.AbstractC23254w8;
import me0.AbstractC23280z4;
import nf.C23732a;
import p239ih.C20556f;
import p493rt.C25977a;
import p559uv.C27373c;
import pm0.C24848g0;
import th.AbstractC26689j;
import tv.AbstractC26897a;
import vg.C28139n5;
import zh0.AbstractC32212c;

/* renamed from: nf.d */
/* loaded from: classes3.dex */
public final class C23735d {

    /* renamed from: a */
    private final Context f114831a;

    /* renamed from: b */
    private final VideoBlendingParam f114832b;

    /* renamed from: c */
    private final WeakReference f114833c;

    /* renamed from: nf.d$a */
    /* loaded from: classes3.dex */
    public static final class a implements C23732a.a {

        /* renamed from: a */
        final /* synthetic */ Object f114834a;

        /* renamed from: b */
        final /* synthetic */ C23735d f114835b;

        a(Object obj, C23735d c23735d) {
            this.f114834a = obj;
            this.f114835b = c23735d;
        }

        @Override // nf.C23732a.a
        /* renamed from: a */
        public void mo124089a(Bitmap bitmap) {
            Object obj = this.f114834a;
            C23735d c23735d = this.f114835b;
            synchronized (obj) {
                c23735d.f114832b.f48271W = bitmap;
                obj.notify();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    public C23735d(Context context, VideoBlendingParam videoBlendingParam, AbstractC16778c.a aVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(videoBlendingParam, "videoBlendingParam");
        AbstractC19074t.m100208f(aVar, "listener");
        this.f114831a = context;
        this.f114832b = videoBlendingParam;
        this.f114833c = new WeakReference(aVar);
    }

    /* renamed from: d */
    private final int m124092d(C19436a c19436a, int i11, String str) {
        AbstractC16778c m89558o = AbstractC16778c.m89558o(i11, c19436a);
        AbstractC19074t.m100207e(m89558o, "newInstance(...)");
        int mo89540a = m89558o.mo89540a();
        if (AbstractC23738g.m124101b(mo89540a)) {
            m124096h(str, 0);
        } else {
            m124096h(str, 1);
        }
        return mo89540a;
    }

    /* renamed from: e */
    private final C19436a.a m124093e(C27373c c27373c, C25977a c25977a) {
        int m116580c;
        float m140254h = ((float) c27373c.m140254h()) / 1000.0f;
        int i11 = c25977a.f123942c;
        if (c27373c.m140269w() > 0) {
            i11 = AbstractC22543l.m116584g(c27373c.m140269w(), c25977a.f123942c);
        }
        C0800t c0800t = new C0800t(this.f114831a, AbstractC23738g.m124100a(c25977a, c27373c, this.f114832b), c27373c.m140221F(), c27373c.m140272z(), this.f114832b.f48273Y);
        c0800t.m2019A0(this.f114832b.f48271W);
        if (AbstractC23738g.m124102c(this.f114832b)) {
            c0800t.m2020B0(new C0800t.a(this.f114832b.f48256H, AbstractC26689j.m137103l()));
        }
        int i12 = this.f114832b.f48286z;
        if (c27373c.m140271y() > 0) {
            i12 = AbstractC22543l.m116584g(c27373c.m140271y(), this.f114832b.f48286z);
        }
        C19436a.a m101648p = C19436a.m101607a().m101639g(this.f114832b.f48277q).m101647o(this.f114832b.f48278r).m101646n(c27373c.m140221F()).m101645m(c27373c.m140272z()).m101649q(c25977a.f123940a).m101648p(c25977a.f123941b);
        m116580c = AbstractC22543l.m116580c(this.f114832b.f48250B, 0);
        C19436a.a m101636d = m101648p.m101650r(m116580c).m101654v(i11).m101637e(i12).m101638f(AbstractC26689j.f126437c).m101655w(m140254h).m101635c(c27373c.m140249e()).m101634b(c27373c.m140247d()).m101656x(this.f114832b.f48276p).m101642j(this.f114832b.f48269U).m101658z(this.f114832b.f48262N).m101653u(this.f114832b.f48264P).m101652t(this.f114832b.f48265Q).m101651s(c0800t).m101641i(C28139n5.m141620j().m141645r()).m101640h(C28139n5.m141620j().m141640m()).m101643k(this.f114832b.f48270V).m101636d((AbstractC16778c.a) this.f114833c.get());
        AbstractC19074t.m100207e(m101636d, "setEncodingEventListener(...)");
        return m101636d;
    }

    /* renamed from: f */
    private final boolean m124094f(VideoBlendingParam videoBlendingParam) {
        boolean z11;
        if (videoBlendingParam.f48264P == 0 && videoBlendingParam.f48265Q == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 || i11 == 26 || i11 == 27 || !z11) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private final void m124095g(String str) {
        AbstractC16778c.a aVar = (AbstractC16778c.a) this.f114833c.get();
        if (aVar != null) {
            aVar.mo50437c(str);
        } else {
            AbstractC20110a.f98889a.m104564x("[VideoCompress]").mo104548a(str, new Object[0]);
        }
    }

    /* renamed from: h */
    private final void m124096h(String str, int i11) {
        AbstractC16778c.a aVar = (AbstractC16778c.a) this.f114833c.get();
        if (aVar != null) {
            aVar.mo50436b(str, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x019f A[Catch: all -> 0x01bb, TryCatch #0 {all -> 0x01bb, blocks: (B:8:0x0101, B:11:0x0112, B:13:0x0118, B:15:0x011c, B:17:0x012d, B:21:0x0157, B:23:0x0163, B:26:0x0176, B:31:0x0182, B:33:0x018a, B:34:0x0199, B:36:0x019f, B:37:0x01ae, B:42:0x016b, B:43:0x0148), top: B:7:0x0101 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m124097b() {
        int m116584g;
        int m116584g2;
        String str;
        int i11;
        int m124092d;
        C27373c c27373c = new C27373c(null, null, null, null, null, null, 0L, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0.0f, 0.0f, 0L, 0L, 0L, false, false, false, false, false, null, 0, false, null, 0, -1, 7, null);
        VideoBlendingParam videoBlendingParam = this.f114832b;
        C25977a m133806c = C25977a.m133806c(videoBlendingParam.f48282v, videoBlendingParam.f48283w, videoBlendingParam.f48249A, videoBlendingParam.f48284x);
        AbstractC19074t.m100207e(m133806c, "newInstance(...)");
        c27373c.m140250e0(this.f114832b.f48277q);
        AbstractC26897a.m138620f(c27373c);
        m124095g("Input video info: " + c27373c + "\nTranscode config: needBlending= " + this.f114832b.f48259K + ", isEnableVideoEncodeAsync= " + AbstractC0924m0.m4400za() + ", isNativeCompressEnable= " + this.f114832b.f48275a0);
        m116584g = AbstractC22543l.m116584g(c27373c.m140218C(), c27373c.m140217B());
        m116584g2 = AbstractC22543l.m116584g(m133806c.f123940a, m133806c.f123941b);
        if (m116584g <= m116584g2) {
            int m140218C = c27373c.m140218C();
            int m140217B = c27373c.m140217B();
            VideoBlendingParam videoBlendingParam2 = this.f114832b;
            m133806c = C25977a.m133806c(m140218C, m140217B, videoBlendingParam2.f48249A, videoBlendingParam2.f48284x);
            AbstractC19074t.m100207e(m133806c, "newInstance(...)");
            if (AbstractC32212c.m155334d(c27373c.m140265s())) {
                int i12 = m133806c.f123940a;
                m133806c.f123940a = m133806c.f123941b;
                m133806c.f123941b = i12;
            }
        } else if (AbstractC32212c.m155334d(c27373c.m140265s()) && c27373c.m140265s() == this.f114832b.f48250B) {
            int i13 = m133806c.f123940a;
            m133806c.f123940a = m133806c.f123941b;
            m133806c.f123941b = i13;
        }
        this.f114832b.f48250B = 0;
        try {
            C19436a.a m124093e = m124093e(c27373c, m133806c);
            if (AbstractC0924m0.m4400za()) {
                VideoBlendingParam videoBlendingParam3 = this.f114832b;
                if (!videoBlendingParam3.f48259K) {
                    if (videoBlendingParam3.f48275a0) {
                        str = "NATIVE_COMPRESS";
                        m124093e.m101657y(videoBlendingParam3.f48274Z);
                        if (AbstractC23254w8.m119859g(this.f114832b.f48277q)) {
                            String str2 = this.f114832b.f48277q;
                            AbstractC19074t.m100207e(str2, "inputPath");
                            Uri parse = Uri.parse(str2);
                            AbstractC19074t.m100207e(parse, "parse(this)");
                            m124093e.m101639g(AbstractC23280z4.m120351s(parse));
                        }
                        i11 = 1;
                    } else if (m124094f(videoBlendingParam3)) {
                        str = "HARDWARE_ASYNC";
                        i11 = 2;
                    }
                    if (i11 != 3 && AbstractC19074t.m100204b("hevc", c27373c.m140270x()) && Build.VERSION.SDK_INT < 23) {
                        m124092d = 4;
                    } else {
                        C19436a m101633a = m124093e.m101633a();
                        AbstractC19074t.m100207e(m101633a, "build(...)");
                        m124092d = m124092d(m101633a, i11, str);
                    }
                    if (!AbstractC23738g.m124101b(m124092d) && i11 == 1) {
                        if (m124092d == 17 && m124094f(this.f114832b)) {
                            C19436a m101633a2 = m124093e(c27373c, m133806c).m101633a();
                            AbstractC19074t.m100207e(m101633a2, "build(...)");
                            m124092d = m124092d(m101633a2, 2, "HARDWARE_ASYNC");
                        }
                        if (!AbstractC23738g.m124101b(m124092d)) {
                            C19436a m101633a3 = m124093e(c27373c, m133806c).m101633a();
                            AbstractC19074t.m100207e(m101633a3, "build(...)");
                            m124092d = m124092d(m101633a3, 3, "BLEND");
                        }
                    }
                    boolean m124101b = AbstractC23738g.m124101b(m124092d);
                    this.f114832b.f48250B = c27373c.m140265s();
                    return m124101b;
                }
            }
            str = "BLEND";
            i11 = 3;
            if (i11 != 3) {
            }
            C19436a m101633a4 = m124093e.m101633a();
            AbstractC19074t.m100207e(m101633a4, "build(...)");
            m124092d = m124092d(m101633a4, i11, str);
            if (!AbstractC23738g.m124101b(m124092d)) {
                if (m124092d == 17) {
                    C19436a m101633a22 = m124093e(c27373c, m133806c).m101633a();
                    AbstractC19074t.m100207e(m101633a22, "build(...)");
                    m124092d = m124092d(m101633a22, 2, "HARDWARE_ASYNC");
                }
                if (!AbstractC23738g.m124101b(m124092d)) {
                }
            }
            boolean m124101b2 = AbstractC23738g.m124101b(m124092d);
            this.f114832b.f48250B = c27373c.m140265s();
            return m124101b2;
        } catch (Throwable unused) {
            this.f114832b.f48250B = c27373c.m140265s();
            return false;
        }
    }

    /* renamed from: c */
    public final void m124098c() {
        try {
            if (this.f114832b.f48251C) {
                File file = new File(this.f114832b.f48277q);
                if (file.exists()) {
                    file.delete();
                }
            }
            Bitmap bitmap = this.f114832b.f48271W;
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            VideoBlendingParam videoBlendingParam = this.f114832b;
            videoBlendingParam.f48271W = null;
            String str = videoBlendingParam.f48279s;
            if (str != null && str.length() != 0) {
                File file2 = new File(str);
                if (file2.exists()) {
                    file2.delete();
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004f, code lost:            r0 = r5.f114832b.f48280t;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0053, code lost:            if (r0 == null) goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0059, code lost:            if (r0.length() != 0) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005c, code lost:            r0 = new java.lang.Object();        r2 = r5.f114832b.f48280t;        fn0.AbstractC19074t.m100207e(r2, "decorData");        new nf.C23732a(r2, new nf.C23735d.a(r0, r5));     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0074, code lost:            monitor-enter(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0077, code lost:            r0.wait(10000);        r1 = pm0.C24848g0.f119245a;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007c, code lost:            monitor-exit(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007e, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0083, code lost:            ho0.AbstractC20110a.f98889a.mo104552e(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0089, code lost:            r0 = r5.f114832b;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x008d, code lost:            if (r0.f48258J == false) goto L74;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x008f, code lost:            r0 = p493rt.C25977a.m133805b(r0.f48282v, r0.f48283w, r0.f48249A);        fn0.AbstractC19074t.m100207e(r0, "newInstance(...)");     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a6, code lost:            if (zh0.AbstractC32212c.m155334d(r5.f114832b.f48250B) == false) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a8, code lost:            r1 = r0.f123940a;        r0.f123940a = r0.f123941b;        r0.f123941b = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b0, code lost:            r0 = android.graphics.Bitmap.createBitmap(r0.f123940a, r0.f123941b, android.graphics.Bitmap.Config.ARGB_8888);        r0.eraseColor(0);        r5.f114832b.f48271W = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:            return;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m124099i() {
        Throwable th2;
        try {
            VideoBlendingParam videoBlendingParam = this.f114832b;
            if (videoBlendingParam.f48271W == null) {
                String str = videoBlendingParam.f48279s;
                Bitmap bitmap = null;
                if (str != null && str.length() != 0 && AbstractC23041d2.m118194A(this.f114832b.f48279s)) {
                    ?? r22 = this.f114832b.f48279s;
                    try {
                        try {
                            InputStream m106838k = new C20556f(r22).m106838k();
                            try {
                                r22 = BitmapFactory.decodeStream(m106838k);
                            } catch (Throwable th3) {
                                r22 = 0;
                                th2 = th3;
                            }
                            try {
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                AbstractC2933b.m13890a(m106838k, null);
                                bitmap = r22;
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    throw th2;
                                } catch (Throwable th5) {
                                    AbstractC2933b.m13890a(m106838k, th2);
                                    throw th5;
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            AbstractC20110a.f98889a.mo104552e(e);
                            this.f114832b.f48271W = bitmap;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        bitmap = r22;
                        AbstractC20110a.f98889a.mo104552e(e);
                        this.f114832b.f48271W = bitmap;
                    }
                }
                this.f114832b.f48271W = bitmap;
            }
        } catch (Exception e13) {
            AbstractC20110a.f98889a.mo104552e(e13);
        }
    }
}
