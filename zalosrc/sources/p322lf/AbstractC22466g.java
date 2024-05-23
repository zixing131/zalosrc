package p322lf;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import android.graphics.Bitmap;
import android.os.Environment;
import android.text.TextUtils;
import cg.AbstractC3460h;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.videos.C7760a;
import com.zing.zalo.camera.videos.InterfaceC7761b;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import me0.AbstractC23041d2;
import me0.AbstractC23204s0;
import me0.AbstractC23280z4;
import p322lf.AbstractC22466g;
import p559uv.C27373c;
import p716zh.C32123ta;
import th.AbstractC26689j;
import tv.AbstractC26897a;
import u30.AbstractRunnableC27007b;
import ve.AbstractC27985d;
import ve.C27983b;

/* renamed from: lf.g */
/* loaded from: classes3.dex */
public abstract class AbstractC22466g {

    /* renamed from: a */
    private static final Bitmap.CompressFormat f109872a = Bitmap.CompressFormat.PNG;

    /* renamed from: b */
    private static final Bitmap.CompressFormat f109873b = Bitmap.CompressFormat.JPEG;

    /* renamed from: lf.g$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC7761b.c {

        /* renamed from: a */
        final /* synthetic */ C32123ta f109874a;

        /* renamed from: b */
        final /* synthetic */ Boolean f109875b;

        /* renamed from: c */
        final /* synthetic */ b f109876c;

        a(C32123ta c32123ta, Boolean bool, b bVar) {
            this.f109874a = c32123ta;
            this.f109875b = bool;
            this.f109876c = bVar;
        }

        /* renamed from: g */
        public static /* synthetic */ void m116136g(b bVar) {
            bVar.mo38358a(false);
            bVar.mo38360c(-1, null);
        }

        /* renamed from: h */
        public static /* synthetic */ void m116137h(b bVar, C32123ta c32123ta) {
            bVar.mo38358a(false);
            bVar.mo38360c(0, c32123ta.f148156v.f48278r);
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: a */
        public void mo39571a(int i11) {
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: b */
        public void mo39572b(InterfaceC7761b interfaceC7761b) {
            if (interfaceC7761b != null) {
                AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[StoryCameraHelper] onError: %d, errorCode=%s, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), interfaceC7761b.mo39541e(), Long.valueOf(System.currentTimeMillis()));
                C0815e1.m2075D().m2111i(interfaceC7761b);
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: lf.e
                public /* synthetic */ RunnableC22464e() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC22466g.a.m116136g(AbstractC22466g.b.this);
                }
            });
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: c */
        public void mo39573c(InterfaceC7761b interfaceC7761b) {
            AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[StoryCameraHelper] onStartProcessing: %d, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), Long.valueOf(System.currentTimeMillis()));
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: d */
        public void mo39574d(InterfaceC7761b interfaceC7761b, String str) {
            AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[StoryCameraHelper] onFinished: %d, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), Long.valueOf(System.currentTimeMillis()));
            VideoBlendingParam videoBlendingParam = this.f109874a.f148156v;
            if (videoBlendingParam != null) {
                videoBlendingParam.f48278r = str;
                SensitiveData sensitiveData = new SensitiveData("gallery_save_story_video", "social_timeline");
                if (this.f109875b.booleanValue()) {
                    AbstractC23280z4.m120305Q(str, AbstractC23041d2.m118212k(str), 0L, false, false, sensitiveData);
                } else {
                    AbstractC23280z4.m120306R(str, Environment.DIRECTORY_DCIM, AbstractC23041d2.m118212k(str), 0L, false, false, sensitiveData);
                }
                C0815e1.m2075D().m2111i(interfaceC7761b);
                AbstractC19444a.m101695c(new Runnable() { // from class: lf.f

                    /* renamed from: q */
                    public final /* synthetic */ C32123ta f109871q;

                    public /* synthetic */ RunnableC22465f(C32123ta c32123ta) {
                        r2 = c32123ta;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC22466g.a.m116137h(AbstractC22466g.b.this, r2);
                    }
                });
            }
        }
    }

    /* renamed from: lf.g$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo38358a(boolean z11);

        /* renamed from: b */
        void mo38359b(boolean z11, C32123ta c32123ta);

        /* renamed from: c */
        void mo38360c(int i11, String str);
    }

    /* renamed from: lf.g$c */
    /* loaded from: classes3.dex */
    public static class c extends AbstractRunnableC27007b {
        c() {
            super(AbstractC0837p0.m2225f());
        }

        @Override // u30.AbstractRunnableC27007b
        /* renamed from: g */
        public Boolean mo116138b(Object... objArr) {
            C32123ta c32123ta = (C32123ta) objArr[0];
            InterfaceC7761b.c cVar = (InterfaceC7761b.c) objArr[1];
            try {
                VideoBlendingParam videoBlendingParam = c32123ta.f148156v;
                Bitmap bitmap = videoBlendingParam.f48271W;
                if (TextUtils.isEmpty(videoBlendingParam.f48279s) && bitmap != null) {
                    File file = new File(AbstractC23204s0.m119557h(), "PIC_STORY_OVERLAY_TEMP.png");
                    c32123ta.f148156v.f48279s = file.getPath();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(c32123ta.f148156v.f48279s);
                        try {
                            bitmap.compress(AbstractC22466g.f109872a, 72, fileOutputStream);
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
                C7760a.f41634a.mo39564b(c32123ta.f148150p, AbstractC20130d.m104834H0(), c32123ta.f148156v, cVar, 1, null);
                return Boolean.TRUE;
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
                cVar.mo39572b(null);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: lf.g$d */
    /* loaded from: classes3.dex */
    public static class d extends AbstractRunnableC27007b {

        /* renamed from: r */
        private final C32123ta f109877r;

        /* renamed from: s */
        private final b f109878s;

        /* renamed from: t */
        private CountDownLatch f109879t;

        public d(C32123ta c32123ta, b bVar) {
            super(AbstractC0837p0.m2225f());
            this.f109877r = c32123ta;
            this.f109878s = bVar;
        }

        /* renamed from: i */
        public /* synthetic */ void m116141i(String str, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i11) {
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
                AbstractC20110a.m104539h(e11);
            }
            CountDownLatch countDownLatch = this.f109879t;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }

        /* renamed from: k */
        private void m116142k(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i11) {
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: lf.h

                /* renamed from: q */
                public final /* synthetic */ String f109881q;

                /* renamed from: r */
                public final /* synthetic */ Bitmap f109882r;

                /* renamed from: s */
                public final /* synthetic */ Bitmap.CompressFormat f109883s;

                /* renamed from: t */
                public final /* synthetic */ int f109884t;

                public /* synthetic */ RunnableC22467h(String str2, Bitmap bitmap2, Bitmap.CompressFormat compressFormat2, int i112) {
                    r2 = str2;
                    r3 = bitmap2;
                    r4 = compressFormat2;
                    r5 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC22466g.d.this.m116141i(r2, r3, r4, r5);
                }
            });
        }

        /* JADX WARN: Can't wrap try/catch for region: R(21:1|2|3|(1:5)|6|7|8|(2:13|(10:15|(1:58)(1:19)|20|21|22|23|24|(12:26|(10:31|32|(7:36|37|(1:41)|42|(1:44)|45|(1:47))|49|37|(2:39|41)|42|(0)|45|(0))|50|32|(7:36|37|(0)|42|(0)|45|(0))|49|37|(0)|42|(0)|45|(0))|51|52)(6:59|23|24|(0)|51|52))|60|(1:62)(1:71)|63|(1:70)(1:67)|68|69|22|23|24|(0)|51|52|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0180, code lost:            r0 = e;     */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0181, code lost:            r2 = r3;     */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01cb, code lost:            ho0.AbstractC20110a.m104539h(r0);        r3 = r2;     */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0175 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:24:0x0165, B:26:0x0175, B:28:0x0179, B:32:0x0184, B:37:0x018e, B:39:0x0192, B:42:0x01be, B:44:0x01c2, B:45:0x01c4, B:47:0x01c8), top: B:23:0x0165 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0192 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:24:0x0165, B:26:0x0175, B:28:0x0179, B:32:0x0184, B:37:0x018e, B:39:0x0192, B:42:0x01be, B:44:0x01c2, B:45:0x01c4, B:47:0x01c8), top: B:23:0x0165 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01c2 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:24:0x0165, B:26:0x0175, B:28:0x0179, B:32:0x0184, B:37:0x018e, B:39:0x0192, B:42:0x01be, B:44:0x01c2, B:45:0x01c4, B:47:0x01c8), top: B:23:0x0165 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01c8 A[Catch: Exception -> 0x0180, TRY_LEAVE, TryCatch #0 {Exception -> 0x0180, blocks: (B:24:0x0165, B:26:0x0175, B:28:0x0179, B:32:0x0184, B:37:0x018e, B:39:0x0192, B:42:0x01be, B:44:0x01c2, B:45:0x01c4, B:47:0x01c8), top: B:23:0x0165 }] */
        @Override // u30.AbstractRunnableC27007b
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Boolean mo116138b(Void... voidArr) {
            boolean z11;
            File file;
            String m116146a;
            VideoBlendingParam videoBlendingParam;
            boolean z12;
            boolean z13;
            boolean z14 = false;
            try {
                file = new File(AbstractC23204s0.m119557h(), this.f109877r.f148138h);
                if (!file.exists()) {
                    file.mkdirs();
                }
                AbstractC23204s0.m119550a(file.getAbsolutePath());
                m116146a = C22468i.m116146a(new Date());
                videoBlendingParam = this.f109877r.f148156v;
                try {
                } catch (Exception e11) {
                    e = e11;
                    z14 = true;
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (!videoBlendingParam.f48259K && !videoBlendingParam.f48260L) {
                if (videoBlendingParam.f48261M) {
                    this.f109879t = new CountDownLatch(1);
                    Bitmap bitmap = this.f109877r.f148156v.f48272X;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        File file2 = new File(file.getPath() + File.separator + "VIDEO_THUMB_TEMP_" + m116146a + ".jpg");
                        this.f109877r.f148146l = file2.getAbsolutePath();
                        m116142k(bitmap, file2.getPath(), AbstractC22466g.f109873b, AbstractC26689j.m137103l());
                    } else {
                        this.f109879t.countDown();
                    }
                    this.f109879t.await(10L, TimeUnit.SECONDS);
                    this.f109877r.f148156v.f48272X = null;
                    z11 = true;
                    C27373c c27373c = new C27373c();
                    c27373c.m140250e0(videoBlendingParam.f48277q);
                    z11 = AbstractC26897a.m138618d(c27373c);
                    if (z11) {
                        if (videoBlendingParam.f48264P == 0 && videoBlendingParam.f48265Q == 0) {
                            z12 = false;
                            if (!videoBlendingParam.f48259K && !z12) {
                                z13 = false;
                                if (videoBlendingParam.f48260L && AbstractC3460h.m17452t(3, c27373c.m140218C(), c27373c.m140217B(), c27373c.m140271y(), c27373c.m140269w(), c27373c.m140247d(), c27373c.m140270x(), c27373c.m140219D(), c27373c.m140216A(), c27373c.m140256j())) {
                                    z14 = true;
                                }
                                if (z13 != videoBlendingParam.f48259K) {
                                    videoBlendingParam.f48259K = z13;
                                }
                                if (z14 != videoBlendingParam.f48260L) {
                                    videoBlendingParam.f48260L = z14;
                                }
                            }
                            z13 = true;
                            if (videoBlendingParam.f48260L) {
                                z14 = true;
                            }
                            if (z13 != videoBlendingParam.f48259K) {
                            }
                            if (z14 != videoBlendingParam.f48260L) {
                            }
                        }
                        z12 = true;
                        if (!videoBlendingParam.f48259K) {
                            z13 = false;
                            if (videoBlendingParam.f48260L) {
                            }
                            if (z13 != videoBlendingParam.f48259K) {
                            }
                            if (z14 != videoBlendingParam.f48260L) {
                            }
                        }
                        z13 = true;
                        if (videoBlendingParam.f48260L) {
                        }
                        if (z13 != videoBlendingParam.f48259K) {
                        }
                        if (z14 != videoBlendingParam.f48260L) {
                        }
                    }
                    return Boolean.valueOf(z11);
                }
                z11 = false;
                C27373c c27373c2 = new C27373c();
                c27373c2.m140250e0(videoBlendingParam.f48277q);
                z11 = AbstractC26897a.m138618d(c27373c2);
                if (z11) {
                }
                return Boolean.valueOf(z11);
            }
            CountDownLatch countDownLatch = new CountDownLatch(2);
            this.f109879t = countDownLatch;
            Bitmap bitmap2 = this.f109877r.f148156v.f48271W;
            if (bitmap2 != null) {
                this.f109877r.f148156v.f48279s = new File(file.getPath() + File.separator + "PIC_STORY_OVERLAY_TEMP_" + m116146a + ".png").getPath();
                m116142k(bitmap2, this.f109877r.f148156v.f48279s, AbstractC22466g.f109872a, 72);
            } else {
                countDownLatch.countDown();
            }
            Bitmap bitmap3 = this.f109877r.f148156v.f48272X;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                File file3 = new File(file.getPath() + File.separator + "VIDEO_THUMB_TEMP_" + m116146a + ".jpg");
                this.f109877r.f148146l = file3.getAbsolutePath();
                m116142k(bitmap3, file3.getPath(), AbstractC22466g.f109873b, AbstractC26689j.m137103l());
            } else {
                this.f109879t.countDown();
            }
            this.f109879t.await(10L, TimeUnit.SECONDS);
            VideoBlendingParam videoBlendingParam2 = this.f109877r.f148156v;
            videoBlendingParam2.f48271W = null;
            videoBlendingParam2.f48272X = null;
            z11 = true;
            C27373c c27373c22 = new C27373c();
            c27373c22.m140250e0(videoBlendingParam.f48277q);
            z11 = AbstractC26897a.m138618d(c27373c22);
            if (z11) {
            }
            return Boolean.valueOf(z11);
        }

        @Override // u30.AbstractRunnableC27007b
        /* renamed from: j */
        public void mo116143d(Boolean bool) {
            super.mo116143d(bool);
            this.f109878s.mo38359b(bool.booleanValue(), this.f109877r);
        }
    }

    /* renamed from: c */
    public static String m116129c() {
        File file = new File(AbstractC20130d.m104834H0());
        return file.getPath() + File.separator + "VID_STORY_" + C22468i.m116146a(new Date()) + ".mp4";
    }

    /* renamed from: d */
    public static String m116130d() {
        File file = new File(AbstractC23204s0.m119557h().getPath() + File.separator + "story_video_record_" + System.currentTimeMillis() + ".mp4");
        if (file.exists()) {
            file.delete();
        }
        return file.getPath();
    }

    /* renamed from: e */
    public static void m116131e(VideoBlendingParam videoBlendingParam, String str, StoryMusicAttachment storyMusicAttachment, b bVar, Boolean bool) {
        try {
            C32123ta m155063s = C32123ta.m155063s(videoBlendingParam, null, new PrivacyInfo(), 0, str, storyMusicAttachment);
            bVar.mo38358a(true);
            new c().m139138c(m155063s, new a(m155063s, bool, bVar));
        } catch (IllegalArgumentException e11) {
            AbstractC20110a.m104539h(e11);
            bVar.mo38358a(false);
            bVar.mo38360c(-1, null);
        }
    }

    /* renamed from: f */
    public static void m116132f(String str, b bVar) {
        String m116129c = m116129c();
        Objects.requireNonNull(bVar);
        AbstractC27985d.m141002s(str, m116129c, true, true, new C27983b(bVar));
    }

    /* renamed from: g */
    public static void m116133g(C32123ta c32123ta, b bVar) {
        new d(c32123ta, bVar).m139138c(new Void[0]);
    }
}
