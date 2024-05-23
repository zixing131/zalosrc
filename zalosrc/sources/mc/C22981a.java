package mc;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.player.event.IZMediaListener;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import in.AbstractC20631e;
import java.util.HashMap;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import p296kc.C21654a;
import p716zh.C31944h6;
import pm0.C24860q;

/* renamed from: mc.a */
/* loaded from: classes3.dex */
public final class C22981a extends AbstractC20631e {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private static final HashMap f111744t = new HashMap();

    /* renamed from: p */
    private int f111745p = 8;

    /* renamed from: q */
    private String f111746q = "";

    /* renamed from: r */
    private String f111747r = "";

    /* renamed from: s */
    private b f111748s;

    /* renamed from: mc.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: mc.a$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo95341a(String str, boolean z11);

        /* renamed from: b */
        void mo95342b(int i11);
    }

    /* renamed from: mc.a$c */
    /* loaded from: classes3.dex */
    public static final class c extends IZMediaListener {

        /* renamed from: a */
        final /* synthetic */ C19059j0 f111749a;

        /* renamed from: b */
        final /* synthetic */ C22981a f111750b;

        /* renamed from: c */
        final /* synthetic */ ZMediaPlayerSettings.VideoConfig f111751c;

        /* renamed from: d */
        final /* synthetic */ String f111752d;

        c(C19059j0 c19059j0, C22981a c22981a, ZMediaPlayerSettings.VideoConfig videoConfig, String str) {
            this.f111749a = c19059j0;
            this.f111750b = c22981a;
            this.f111751c = videoConfig;
            this.f111752d = str;
        }

        @Override // com.zing.zalo.zmedia.player.event.IZMediaListener
        public void onEndSession() {
            IZMediaListener iZMediaListener = (IZMediaListener) this.f111749a.f94941p;
            if (iZMediaListener != null) {
                ZMediaPlayer.unrefZMediaListener(this.f111751c, iZMediaListener, this.f111752d);
            }
            if (this.f111750b.m107496y()) {
                this.f111750b.m107497z();
                return;
            }
            b m117743N = this.f111750b.m117743N();
            if (m117743N != null) {
                m117743N.mo95342b(9);
            }
        }

        @Override // com.zing.zalo.zmedia.player.event.IZMediaListener
        public void onEvent(int i11) {
            IZMediaListener iZMediaListener = (IZMediaListener) this.f111749a.f94941p;
            if (iZMediaListener != null) {
                ZMediaPlayer.unrefZMediaListener(this.f111751c, iZMediaListener, this.f111752d);
            }
            if (this.f111750b.m107496y()) {
                this.f111750b.m107497z();
            } else {
                this.f111750b.m117740P(i11);
            }
        }
    }

    /* renamed from: mc.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends IZMediaListener {

        /* renamed from: b */
        final /* synthetic */ C19059j0 f111754b;

        /* renamed from: c */
        final /* synthetic */ ZMediaPlayerSettings.VideoConfig f111755c;

        /* renamed from: d */
        final /* synthetic */ String f111756d;

        d(C19059j0 c19059j0, ZMediaPlayerSettings.VideoConfig videoConfig, String str) {
            this.f111754b = c19059j0;
            this.f111755c = videoConfig;
            this.f111756d = str;
        }

        @Override // com.zing.zalo.zmedia.player.event.IZMediaListener
        public void onEndSession() {
            C21654a.m111581h("DownloadStreamingVideoAsyncTask", "doInBackground() - onEndSession - " + C22981a.this.m107491s() + " - " + C22981a.this.m107490r(), C21654a.a.f105047p, false, 8, null);
            IZMediaListener iZMediaListener = (IZMediaListener) this.f111754b.f94941p;
            if (iZMediaListener != null) {
                ZMediaPlayer.unrefZMediaListener(this.f111755c, iZMediaListener, this.f111756d);
            }
            C22981a.this.m107487j(true);
            if (C22981a.this.m107496y()) {
                C22981a.this.m107497z();
                return;
            }
            b m117743N = C22981a.this.m117743N();
            if (m117743N != null) {
                m117743N.mo95342b(9);
            }
        }

        @Override // com.zing.zalo.zmedia.player.event.IZMediaListener
        public void onEvent(int i11) {
            C21654a.m111581h("DownloadStreamingVideoAsyncTask", "doInBackground() - onEvent: " + i11 + " - " + C22981a.this.m107491s() + " - " + C22981a.this.m107490r(), C21654a.a.f105047p, false, 8, null);
            IZMediaListener iZMediaListener = (IZMediaListener) this.f111754b.f94941p;
            if (iZMediaListener != null) {
                ZMediaPlayer.unrefZMediaListener(this.f111755c, iZMediaListener, this.f111756d);
            }
            C22981a.this.m107487j(true);
            if (C22981a.this.m107496y()) {
                C22981a.this.m107497z();
            } else {
                C22981a.this.m117740P(i11);
            }
        }
    }

    public C22981a() {
        this.f101515g = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:            if (fn0.AbstractC19074t.m100204b(r0.get(r2.f111746q), r2) == false) goto L11;     */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m117740P(int i11) {
        boolean z11;
        if (i11 != 5) {
            if (i11 > 0) {
                HashMap hashMap = f111744t;
                if (hashMap.containsKey(this.f111746q)) {
                }
            }
            z11 = false;
            mo1197A(Integer.valueOf(i11), z11);
        }
        z11 = true;
        mo1197A(Integer.valueOf(i11), z11);
    }

    /* renamed from: L */
    public final void m117741L() {
        if (this.f111746q.length() == 0) {
            return;
        }
        ZMediaPlayerSettings.VideoConfig videoConfig = ZMediaPlayerSettings.getVideoConfig(this.f111745p);
        String str = this.f111746q;
        C19059j0 c19059j0 = new C19059j0();
        c cVar = new c(c19059j0, this, videoConfig, str);
        c19059j0.f94941p = cVar;
        ZMediaPlayer.registerZMediaListener(videoConfig, cVar, str);
        ZMediaPlayer.forceFullDownload(videoConfig, str, videoConfig.getPlayerSection());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // in.AbstractC20631e
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public C24860q mo1204l(String... strArr) {
        int i11;
        AbstractC19074t.m100208f(strArr, "params");
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DownloadStreamingVideoAsyncTask", e11);
        }
        if (strArr[0].length() == 0) {
            if (m107496y()) {
                m107497z();
            } else {
                mo1197A(Integer.MIN_VALUE, false);
            }
            m107487j(true);
            return null;
        }
        this.f111746q = strArr[0];
        try {
            i11 = Integer.parseInt(strArr[1]);
        } catch (Exception e12) {
            AbstractC23350e.m122776f("DownloadStreamingVideoAsyncTask", e12);
            i11 = 8;
        }
        this.f111745p = i11;
        String str = this.f111746q;
        m107486I(AbstractC23352g.m122788d(str));
        m107485H(C31944h6.m153552r(str));
        ZMediaPlayerSettings.VideoConfig videoConfig = ZMediaPlayerSettings.getVideoConfig(this.f111745p);
        C21654a.m111581h("DownloadStreamingVideoAsyncTask", "doInBackground(): hash=" + m107491s() + ", domain=" + m107490r(), C21654a.a.f105047p, false, 8, null);
        C19059j0 c19059j0 = new C19059j0();
        d dVar = new d(c19059j0, videoConfig, str);
        c19059j0.f94941p = dVar;
        ZMediaPlayer.registerZMediaListener(videoConfig, dVar, str);
        ZMediaPlayer.forceFullDownload(videoConfig, str, videoConfig.getPlayerSection());
        HashMap hashMap = f111744t;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, this);
        }
        return null;
    }

    /* renamed from: N */
    public final b m117743N() {
        return this.f111748s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // in.AbstractC20631e
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo1197A(Integer num, boolean z11) {
        AbstractC19074t.m100205c(num);
        if (num.intValue() >= 0) {
            ZMediaPlayerSettings.VideoConfig videoConfig = ZMediaPlayerSettings.getVideoConfig(this.f111745p);
            if (this.f111747r.length() > 0) {
                if (ZMediaPlayer.cloneVideoFromCache(videoConfig, ZMediaPlayerSettings.getCacheDir(videoConfig.getPlayerSection()), this.f111746q, this.f111747r)) {
                    b bVar = this.f111748s;
                    if (bVar != null) {
                        bVar.mo95341a(this.f111747r, z11);
                        return;
                    }
                    return;
                }
                b bVar2 = this.f111748s;
                if (bVar2 != null) {
                    bVar2.mo95342b(3);
                    return;
                }
                return;
            }
            b bVar3 = this.f111748s;
            if (bVar3 != null) {
                bVar3.mo95341a(ZMediaPlayerSettings.getCacheDir(videoConfig.getPlayerSection()), z11);
                return;
            }
            return;
        }
        if (num.intValue() == -1013) {
            b bVar4 = this.f111748s;
            if (bVar4 != null) {
                bVar4.mo95342b(7);
                return;
            }
            return;
        }
        if (num.intValue() == -404) {
            b bVar5 = this.f111748s;
            if (bVar5 != null) {
                bVar5.mo95342b(7);
                return;
            }
            return;
        }
        b bVar6 = this.f111748s;
        if (bVar6 != null) {
            bVar6.mo95342b(3);
        }
    }

    /* renamed from: Q */
    public final void m117745Q(b bVar) {
        this.f111748s = bVar;
    }

    /* renamed from: R */
    public final void m117746R(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f111747r = str;
    }

    /* renamed from: S */
    public final void m117747S() {
        ZMediaPlayer.stopFullDownload(ZMediaPlayerSettings.getVideoConfig(this.f111745p), this.f111746q);
    }

    @Override // in.AbstractC20631e
    /* renamed from: w */
    protected boolean mo107426w() {
        return true;
    }

    @Override // in.AbstractC20631e
    /* renamed from: x */
    protected boolean mo107495x() {
        return true;
    }
}
