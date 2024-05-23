package ve;

import ag.C0800t;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.videos.C7760a;
import com.zing.zalo.camera.videos.InterfaceC7761b;
import com.zing.zalo.cameradecor.view.ImageDecorView;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.videoencode.AbstractC16778c;
import gf0.C19436a;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import me0.AbstractC23009a3;
import me0.AbstractC23041d2;
import me0.AbstractC23121k5;
import me0.AbstractC23136l9;
import me0.AbstractC23254w8;
import me0.AbstractC23280z4;
import nh0.C23793c;
import p306ku.AbstractC21943a;
import p322lf.AbstractC22466g;
import p460qt.AbstractC25493c;
import p460qt.AbstractC25494d;
import p493rt.C25977a;
import p559uv.C27373c;
import p679yf.C30923c;
import th.AbstractC26689j;
import tv.AbstractC26897a;
import u30.AbstractRunnableC27007b;
import ve.AbstractC27985d;
import ve.C27989h;
import vg.C28139n5;
import zh0.AbstractC32212c;

/* renamed from: ve.d */
/* loaded from: classes3.dex */
public abstract class AbstractC27985d {

    /* renamed from: a */
    private static final Bitmap.CompressFormat f130451a = Bitmap.CompressFormat.PNG;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ve.d$a */
    /* loaded from: classes3.dex */
    public class a extends g {

        /* renamed from: z */
        final /* synthetic */ File f130452z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, d dVar, File file) {
            super(i11, dVar);
            this.f130452z = file;
        }

        @Override // ve.AbstractC27985d.g, p460qt.AbstractC25493c, p460qt.AbstractC25494d
        /* renamed from: h */
        protected File mo132070h() {
            File file = this.f130452z;
            if (file != null) {
                return file;
            }
            return super.mo132070h();
        }
    }

    /* renamed from: ve.d$b */
    /* loaded from: classes3.dex */
    class b extends e {

        /* renamed from: z */
        final /* synthetic */ File f130453z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, int i12, boolean z11, d dVar, File file) {
            super(i11, i12, z11, dVar);
            this.f130453z = file;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p460qt.AbstractC25493c, p460qt.AbstractC25494d
        /* renamed from: h */
        public File mo132070h() {
            File file = this.f130453z;
            if (file != null) {
                return file;
            }
            return super.mo132070h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ve.d$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC7761b.c {

        /* renamed from: a */
        final /* synthetic */ VideoBlendingParam f130454a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22466g.b f130455b;

        c(VideoBlendingParam videoBlendingParam, AbstractC22466g.b bVar) {
            this.f130454a = videoBlendingParam;
            this.f130455b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static /* synthetic */ void m141009g(AbstractC22466g.b bVar) {
            bVar.mo38358a(false);
            bVar.mo38360c(-1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static /* synthetic */ void m141010h(AbstractC22466g.b bVar, VideoBlendingParam videoBlendingParam) {
            bVar.mo38358a(false);
            bVar.mo38360c(0, videoBlendingParam.f48278r);
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: a */
        public void mo39571a(int i11) {
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: b */
        public void mo39572b(InterfaceC7761b interfaceC7761b) {
            if (interfaceC7761b != null) {
                AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[CameraTaskHelper] onError: %d, errorCode=%s, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), interfaceC7761b.mo39541e(), Long.valueOf(System.currentTimeMillis()));
                C0815e1.m2075D().m2111i(interfaceC7761b);
            }
            final AbstractC22466g.b bVar = this.f130455b;
            AbstractC19444a.m101695c(new Runnable() { // from class: ve.f
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC27985d.c.m141009g(AbstractC22466g.b.this);
                }
            });
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: c */
        public void mo39573c(InterfaceC7761b interfaceC7761b) {
            AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[CameraTaskHelper] onStartProcessing: %d, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), Long.valueOf(System.currentTimeMillis()));
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: d */
        public void mo39574d(InterfaceC7761b interfaceC7761b, String str) {
            AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[CameraTaskHelper] onFinished: %d, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), Long.valueOf(System.currentTimeMillis()));
            this.f130454a.f48278r = str;
            AbstractC23280z4.m120306R(str, Environment.DIRECTORY_DCIM, AbstractC23041d2.m118212k(str), 0L, false, false, new SensitiveData("gallery_save_video_when_record_csc", "comm_csc"));
            if (!TextUtils.equals(str, AbstractC23041d2.m118212k(str))) {
                AbstractC23041d2.m118208g(this.f130454a.f48278r);
            }
            C0815e1.m2075D().m2111i(interfaceC7761b);
            final AbstractC22466g.b bVar = this.f130455b;
            final VideoBlendingParam videoBlendingParam = this.f130454a;
            AbstractC19444a.m101695c(new Runnable() { // from class: ve.e
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC27985d.c.m141010h(AbstractC22466g.b.this, videoBlendingParam);
                }
            });
        }
    }

    /* renamed from: ve.d$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo39425a(int i11, String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ve.d$e */
    /* loaded from: classes3.dex */
    public static class e extends AbstractC25493c {

        /* renamed from: w */
        final int f130456w;

        /* renamed from: x */
        final boolean f130457x;

        /* renamed from: y */
        final d f130458y;

        e(int i11, int i12, boolean z11, d dVar) {
            super(MainApplication.getAppContext().getContentResolver(), Bitmap.CompressFormat.JPEG, i12, C28139n5.m141620j().m141645r(), C28139n5.m141620j().m141640m());
            this.f130456w = i11;
            this.f130457x = z11;
            this.f130458y = dVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u30.AbstractRunnableC27007b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC25494d.a mo116138b(Bitmap... bitmapArr) {
            boolean m117953d;
            Bitmap m117962m;
            try {
                Bitmap bitmap = bitmapArr[0];
                if (bitmap != null && !bitmap.isRecycled()) {
                    if (!this.f130457x) {
                        int i11 = this.f130456w;
                        m117953d = AbstractC23009a3.m117951b(bitmap, i11, i11);
                    } else {
                        m117953d = AbstractC23009a3.m117953d(bitmap, this.f130456w);
                    }
                    if (!m117953d) {
                        if (!this.f130457x) {
                            int i12 = this.f130456w;
                            m117962m = AbstractC23009a3.m117965p(bitmap, i12, i12);
                        } else {
                            m117962m = AbstractC23009a3.m117962m(bitmap, this.f130456w);
                        }
                        if (m117962m != null) {
                            AbstractC20110a.m104535d("needCompressImage", new Object[0]);
                            AbstractC20110a.m104535d("resizedBitmap: wxh = " + m117962m.getWidth() + "x" + m117962m.getHeight(), new Object[0]);
                            return super.mo116138b(m117962m);
                        }
                    }
                    AbstractC20110a.m104535d("no needCompressImage", new Object[0]);
                    AbstractC20110a.m104535d("bitmap: wxh = " + bitmap.getWidth() + "x" + bitmap.getHeight(), new Object[0]);
                    return super.mo116138b(bitmap);
                }
                return null;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }

        @Override // p460qt.AbstractC25494d
        /* renamed from: i */
        protected boolean mo132072i() {
            return false;
        }

        @Override // p460qt.AbstractC25494d
        /* renamed from: j */
        protected boolean mo132073j() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u30.AbstractRunnableC27007b
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo116143d(AbstractC25494d.a aVar) {
            super.mo116143d(aVar);
            if (this.f130458y != null) {
                if (aVar != null && aVar.m132074a() == 0 && !TextUtils.isEmpty(aVar.m132075b())) {
                    this.f130458y.mo39425a(0, aVar.m132075b());
                } else if (aVar != null && aVar.m132074a() == 78002) {
                    this.f130458y.mo39425a(1, "");
                } else {
                    this.f130458y.mo39425a(-1, "");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ve.d$f */
    /* loaded from: classes3.dex */
    public static class f extends AbstractRunnableC27007b {

        /* renamed from: r */
        final d f130459r;

        /* renamed from: s */
        final String f130460s;

        /* renamed from: t */
        final String f130461t;

        /* renamed from: u */
        final boolean f130462u;

        /* renamed from: v */
        private final boolean f130463v;

        f(String str, String str2, boolean z11, boolean z12, d dVar) {
            super(AbstractC0837p0.m2225f());
            this.f130459r = dVar;
            this.f130460s = str;
            this.f130461t = str2;
            this.f130462u = z11;
            this.f130463v = z12;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u30.AbstractRunnableC27007b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean mo116138b(Void... voidArr) {
            SensitiveData sensitiveData;
            try {
                String m118212k = AbstractC23041d2.m118212k(this.f130461t);
                if (this.f130462u) {
                    if (this.f130463v) {
                        sensitiveData = new SensitiveData("gallery_save_story_video", "social_timeline");
                    } else {
                        sensitiveData = new SensitiveData("gallery_save_video_when_record_csc", "comm_csc");
                    }
                    AbstractC23280z4.m120306R(this.f130460s, Environment.DIRECTORY_DCIM, m118212k, 0L, false, false, sensitiveData);
                } else {
                    AbstractC23280z4.m120303O(this.f130460s, Environment.DIRECTORY_DCIM, m118212k, false, false, false, new SensitiveData("not_available", "comm_csc"));
                }
                return Boolean.TRUE;
            } catch (Exception e11) {
                e11.printStackTrace();
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u30.AbstractRunnableC27007b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo116143d(Boolean bool) {
            int i11;
            d dVar = this.f130459r;
            if (dVar != null) {
                if (bool.booleanValue()) {
                    i11 = 0;
                } else {
                    i11 = -1;
                }
                dVar.mo39425a(i11, this.f130461t);
            }
        }
    }

    /* renamed from: ve.d$g */
    /* loaded from: classes3.dex */
    static class g extends e {
        g(int i11, d dVar) {
            super(i11, 100, false, dVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ve.AbstractC27985d.e, u30.AbstractRunnableC27007b
        /* renamed from: g */
        public AbstractC25494d.a mo116138b(Bitmap... bitmapArr) {
            Bitmap bitmap;
            if (bitmapArr.length != 0 && (bitmap = bitmapArr[0]) != null) {
                try {
                    return super.mo116138b(bitmap);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p460qt.AbstractC25493c, p460qt.AbstractC25494d
        /* renamed from: h */
        public File mo132070h() {
            return AbstractC21943a.m114581e();
        }
    }

    /* renamed from: ve.d$h */
    /* loaded from: classes3.dex */
    public interface h {
        /* renamed from: a */
        void mo38374a(boolean z11);

        /* renamed from: b */
        void mo38375b(boolean z11, C27373c c27373c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ve.d$i */
    /* loaded from: classes3.dex */
    public static class i extends AbstractRunnableC27007b {

        /* renamed from: A */
        static final Bitmap.CompressFormat f130464A = Bitmap.CompressFormat.JPEG;

        /* renamed from: B */
        static final Bitmap.CompressFormat f130465B = Bitmap.CompressFormat.PNG;

        /* renamed from: r */
        final C27373c f130466r;

        /* renamed from: s */
        final Bitmap f130467s;

        /* renamed from: t */
        final Bitmap f130468t;

        /* renamed from: u */
        final float f130469u;

        /* renamed from: v */
        final int f130470v;

        /* renamed from: w */
        final h f130471w;

        /* renamed from: x */
        CountDownLatch f130472x;

        /* renamed from: y */
        final Handler f130473y;

        /* renamed from: z */
        final Runnable f130474z;

        /* renamed from: ve.d$i$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h hVar = i.this.f130471w;
                if (hVar != null) {
                    hVar.mo38374a(true);
                }
            }
        }

        i(C27373c c27373c, Bitmap bitmap, Bitmap bitmap2, float f11, int i11, h hVar) {
            super(AbstractC0837p0.m2225f());
            this.f130473y = new Handler(Looper.getMainLooper());
            this.f130474z = new a();
            this.f130466r = c27373c;
            this.f130467s = bitmap;
            this.f130468t = bitmap2;
            this.f130469u = f11;
            this.f130470v = i11;
            this.f130471w = hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m141015i(String str, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i11) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                try {
                    bitmap.compress(compressFormat, i11, fileOutputStream);
                    bitmap.recycle();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } finally {
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            CountDownLatch countDownLatch = this.f130472x;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }

        /* renamed from: k */
        private void m141016k(final Bitmap bitmap, final String str, final Bitmap.CompressFormat compressFormat, final int i11) {
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: ve.g
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC27985d.i.this.m141015i(str, bitmap, compressFormat, i11);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u30.AbstractRunnableC27007b
        /* renamed from: e */
        public void mo139139e() {
            super.mo139139e();
            this.f130473y.postDelayed(this.f130474z, 500L);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u30.AbstractRunnableC27007b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean mo116138b(Void... voidArr) {
            C27373c c27373c;
            boolean z11 = false;
            try {
                c27373c = this.f130466r;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (!c27373c.f128943P && !c27373c.f128942O) {
                if (c27373c.f128945R) {
                    this.f130472x = new CountDownLatch(1);
                    if (this.f130468t != null && !TextUtils.isEmpty(this.f130466r.m140268v()) && !this.f130468t.isRecycled()) {
                        this.f130466r.f128947T.f48253E = new File(this.f130466r.m140268v()).getAbsolutePath();
                        m141016k(this.f130468t, this.f130466r.f128947T.f48253E, f130464A, AbstractC26689j.m137103l());
                    } else {
                        this.f130472x.countDown();
                    }
                    this.f130472x.await(10L, TimeUnit.SECONDS);
                }
                C27373c c27373c2 = this.f130466r;
                c27373c2.f128947T.f48272X = null;
                z11 = AbstractC26897a.m138618d(c27373c2);
                return Boolean.valueOf(z11);
            }
            this.f130472x = new CountDownLatch(2);
            if (this.f130467s != null && !TextUtils.isEmpty(this.f130466r.m140263q()) && !this.f130467s.isRecycled()) {
                this.f130466r.f128947T.f48279s = new File(this.f130466r.m140263q()).getPath();
                m141016k(this.f130467s, this.f130466r.f128947T.f48279s, f130465B, 72);
            } else {
                this.f130472x.countDown();
            }
            if (this.f130468t != null && !TextUtils.isEmpty(this.f130466r.m140268v()) && !this.f130468t.isRecycled()) {
                this.f130466r.f128947T.f48253E = new File(this.f130466r.m140268v()).getAbsolutePath();
                m141016k(this.f130468t, this.f130466r.f128947T.f48253E, f130464A, AbstractC26689j.m137103l());
            } else {
                this.f130472x.countDown();
            }
            this.f130472x.await(10L, TimeUnit.SECONDS);
            C27373c c27373c3 = this.f130466r;
            VideoBlendingParam videoBlendingParam = c27373c3.f128947T;
            videoBlendingParam.f48271W = null;
            videoBlendingParam.f48272X = null;
            long m140254h = c27373c3.m140254h();
            z11 = AbstractC26897a.m138618d(this.f130466r);
            float f11 = this.f130469u;
            if (f11 == 2.0f) {
                this.f130466r.m140226K(Math.max((long) Math.ceil(((float) m140254h) / 2.0f), 1000L));
            } else if (f11 == 3.0f) {
                this.f130466r.m140226K(Math.max((long) Math.ceil(((float) m140254h) / 3.0f), 1000L));
            } else if (f11 == 0.5f) {
                this.f130466r.m140226K((long) Math.ceil(m140254h * 2));
            } else if (f11 == 0.3f) {
                this.f130466r.m140226K((long) Math.ceil(m140254h * 3));
            }
            if (this.f130470v == 2) {
                this.f130466r.m140226K(4000L);
            }
            return Boolean.valueOf(z11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u30.AbstractRunnableC27007b
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo116143d(Boolean bool) {
            super.mo116143d(bool);
            this.f130473y.removeCallbacks(this.f130474z);
            h hVar = this.f130471w;
            if (hVar != null) {
                hVar.mo38374a(false);
                this.f130471w.mo38375b(bool.booleanValue(), this.f130466r);
            }
        }
    }

    /* renamed from: ve.d$j */
    /* loaded from: classes3.dex */
    public interface j {
        /* renamed from: a */
        void mo39485a(boolean z11, String str);
    }

    /* renamed from: c */
    private static int m140986c(C19436a c19436a, int i11) {
        return AbstractC16778c.m89558o(i11, c19436a).mo89540a();
    }

    /* renamed from: d */
    private static C19436a.a m140987d(String str, String str2, int i11, int i12, C27373c c27373c, C25977a c25977a) {
        C0800t c0800t = new C0800t(MainApplication.getAppContext(), m140988e(c27373c, c25977a), c27373c.m140221F(), c27373c.m140272z(), null);
        int i13 = 30;
        if (c27373c.m140271y() > 0) {
            i13 = Math.min(c27373c.m140271y(), 30);
        }
        return C19436a.m101607a().m101639g(str).m101647o(str2).m101646n(c27373c.m140221F()).m101645m(c27373c.m140272z()).m101649q(c25977a.f123940a).m101648p(c25977a.f123941b).m101654v(c25977a.f123942c).m101637e(i13).m101638f(AbstractC26689j.f126437c).m101655w(((float) c27373c.m140254h()) / 1000.0f).m101650r(0).m101635c(c27373c.m140249e()).m101634b(c27373c.m140247d()).m101653u(i11).m101652t(i12).m101644l(true).m101651s(c0800t).m101641i(C28139n5.m141620j().m141645r()).m101640h(C28139n5.m141620j().m141640m());
    }

    /* renamed from: e */
    private static C30923c m140988e(C27373c c27373c, C25977a c25977a) {
        return new C30923c(c25977a.f123940a, c25977a.f123941b, c27373c.m140265s(), false, 1, true);
    }

    /* renamed from: f */
    public static void m140989f(ImageDecorView imageDecorView, C27989h.a aVar) {
        m140991h(imageDecorView, new C27989h.b(true, true, 0, true), aVar);
    }

    /* renamed from: g */
    public static String m140990g() {
        File file = new File(AbstractC20130d.m104906y0());
        return file.getPath() + File.separator + "VID_CHAT_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + ".mp4";
    }

    /* renamed from: h */
    public static void m140991h(ImageDecorView imageDecorView, C27989h.b bVar, C27989h.a aVar) {
        new C27989h(imageDecorView, aVar).m139138c(bVar);
    }

    /* renamed from: i */
    public static void m140992i(ImageDecorView imageDecorView, C27989h.a aVar) {
        m140991h(imageDecorView, new C27989h.b(), aVar);
    }

    /* renamed from: j */
    public static void m140993j(ImageDecorView imageDecorView, boolean z11, int i11, C27989h.a aVar) {
        C27989h.b bVar;
        if (z11) {
            bVar = new C27989h.b(false, false, i11, false);
        } else {
            bVar = new C27989h.b(true, true, i11, false);
        }
        m140991h(imageDecorView, bVar, aVar);
    }

    /* renamed from: k */
    private static String m140994k(long j11) {
        return AbstractC20130d.m104838J0() + "PIC_CHAT_OVERLAY_TEMP_" + j11 + ".png";
    }

    /* renamed from: l */
    public static String m140995l(long j11) {
        return AbstractC20130d.m104838J0() + "THUMB_VIDEO_" + j11 + ".jpg";
    }

    /* renamed from: m */
    public static String m140996m(String str) {
        return AbstractC20130d.m104838J0() + "THUMB_VIDEO_" + str + ".jpg";
    }

    /* renamed from: n */
    private static boolean m140997n(int i11) {
        return i11 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ void m140998o(VideoBlendingParam videoBlendingParam, InterfaceC7761b.c cVar) {
        try {
            Bitmap bitmap = videoBlendingParam.f48271W;
            if (TextUtils.isEmpty(videoBlendingParam.f48279s) && bitmap != null) {
                videoBlendingParam.f48279s = new File(AbstractC20130d.m104906y0(), "PIC_CHAT_OVERLAY_TEMP.png").getPath();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(videoBlendingParam.f48279s);
                    try {
                        bitmap.compress(f130451a, 72, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            if (bitmap != null) {
                bitmap.recycle();
            }
            C7760a.f41634a.mo39564b(C23793c.m124316k().mo124311f(), AbstractC20130d.m104906y0(), videoBlendingParam, cVar, 0, null);
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
            cVar.mo39572b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m140999p(String str, int i11, String str2, int i12, int i13, j jVar) {
        boolean z11;
        int i14;
        C27373c c27373c = new C27373c();
        c27373c.m140250e0(str);
        AbstractC26897a.m138618d(c27373c);
        C25977a m133806c = C25977a.m133806c(c27373c.m140221F(), c27373c.m140272z(), AbstractC26689j.m137077D(i11), "4000000");
        if (AbstractC32212c.m155334d(c27373c.m140265s())) {
            int i15 = m133806c.f123940a;
            int i16 = m133806c.f123941b;
            m133806c.f123940a = i16;
            m133806c.f123941b = AbstractC23121k5.m118608f(i15, i16);
        }
        C19436a.a m140987d = m140987d(str, str2, i12, i13, c27373c, m133806c);
        if (i12 == 0 && i13 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AbstractC0924m0.m4400za() && z11 && AbstractC26689j.m137088O(i11)) {
            m140987d.m101657y(AbstractC26689j.m137106o(i11));
            if (AbstractC23254w8.m119859g(str)) {
                m140987d.m101639g(AbstractC23280z4.m120351s(Uri.parse(str)));
            }
            i14 = 1;
        } else {
            i14 = 3;
        }
        int m140986c = m140986c(m140987d.m101633a(), i14);
        if (!m140997n(m140986c) && i14 == 1) {
            m140986c = m140986c(m140987d(str, str2, i12, i13, c27373c, m133806c).m101633a(), 3);
        }
        if (jVar != null) {
            jVar.mo39485a(m140997n(m140986c), str2);
        }
    }

    /* renamed from: q */
    public static void m141000q(final VideoBlendingParam videoBlendingParam, AbstractC22466g.b bVar) {
        try {
            bVar.mo38358a(true);
            final c cVar = new c(videoBlendingParam, bVar);
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: ve.c
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC27985d.m140998o(VideoBlendingParam.this, cVar);
                }
            });
        } catch (IllegalArgumentException e11) {
            AbstractC20110a.m104539h(e11);
            bVar.mo38358a(false);
            bVar.mo38360c(-1, null);
        }
    }

    /* renamed from: r */
    public static void m141001r(String str, AbstractC22466g.b bVar) {
        String m140990g = m140990g();
        Objects.requireNonNull(bVar);
        m141002s(str, m140990g, true, false, new C27983b(bVar));
    }

    /* renamed from: s */
    public static void m141002s(String str, String str2, boolean z11, boolean z12, d dVar) {
        new f(str, str2, z11, z12, dVar).m139138c(new Void[0]);
    }

    /* renamed from: t */
    public static void m141003t(Bitmap bitmap, File file, int i11, boolean z11, int i12, d dVar) {
        new b(i11, i12, z11, dVar, file).m139138c(bitmap);
    }

    /* renamed from: u */
    public static void m141004u(Bitmap bitmap, File file, d dVar) {
        new a(Math.max(AbstractC23136l9.m118731n0(MainApplication.getAppContext()), AbstractC23136l9.m118719j0(MainApplication.getAppContext())), dVar, file).m139138c(bitmap);
    }

    /* renamed from: v */
    public static void m141005v(C27373c c27373c, h hVar) {
        long currentTimeMillis = System.currentTimeMillis();
        VideoBlendingParam videoBlendingParam = c27373c.f128947T;
        if (videoBlendingParam != null && videoBlendingParam.f48272X != null) {
            c27373c.m140237V(new File(m140995l(currentTimeMillis)).getPath());
        }
        VideoBlendingParam videoBlendingParam2 = c27373c.f128947T;
        if (videoBlendingParam2 != null && videoBlendingParam2.f48271W != null) {
            c27373c.m140233R(new File(m140994k(currentTimeMillis)).getPath());
        }
        VideoBlendingParam videoBlendingParam3 = c27373c.f128947T;
        new i(c27373c, videoBlendingParam3.f48271W, videoBlendingParam3.f48272X, videoBlendingParam3.f48262N, videoBlendingParam3.f48276p, hVar).m139138c(new Void[0]);
    }

    /* renamed from: w */
    public static void m141006w(final String str, final String str2, final int i11, final int i12, final int i13, final j jVar) {
        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: ve.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC27985d.m140999p(str, i13, str2, i11, i12, jVar);
            }
        });
    }
}
