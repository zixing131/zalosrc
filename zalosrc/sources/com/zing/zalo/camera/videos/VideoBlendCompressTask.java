package com.zing.zalo.camera.videos;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Parcelable;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.MainApplication;
import com.zing.zalo.camera.videos.InterfaceC7761b;
import com.zing.zalo.camera.videos.VideoBlendCompressTask;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.media.pojo.VideoMessageParams;
import com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver;
import com.zing.zalo.service.ProcessVideoService;
import ff0.C18907d;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.io.File;
import me0.AbstractC23041d2;
import me0.AbstractC23238v2;
import nf.AbstractC23733b;
import p363nh.C23744a;
import p363nh.EnumC23747b0;
import p390of.EnumC24245a;
import p390of.EnumC24246b;
import p390of.EnumC24247c;
import p559uv.InterfaceC27372b;
import p580vm.C28294a;

/* loaded from: classes3.dex */
public final class VideoBlendCompressTask implements InterfaceC7761b {

    /* renamed from: a */
    private final long f41615a;

    /* renamed from: b */
    public final VideoBlendingParam f41616b;

    /* renamed from: c */
    private final InterfaceC27372b f41617c;

    /* renamed from: d */
    private final InterfaceC7761b.b f41618d;

    /* renamed from: e */
    private final InterfaceC7761b.c f41619e;

    /* renamed from: f */
    private int f41620f;

    /* renamed from: g */
    private final File f41621g;

    /* renamed from: h */
    private Thread f41622h;

    /* renamed from: i */
    private File f41623i;

    /* renamed from: j */
    private EnumC24245a f41624j;

    /* renamed from: k */
    private EnumC24245a f41625k;

    /* renamed from: l */
    private boolean f41626l;

    /* renamed from: m */
    private EnumC24245a f41627m;

    /* renamed from: n */
    private EnumC24246b f41628n;

    /* renamed from: o */
    private final C18907d f41629o;

    /* renamed from: p */
    private EnumC24247c f41630p;

    /* renamed from: q */
    private BroadcastReceiver f41631q;

    /* renamed from: com.zing.zalo.camera.videos.VideoBlendCompressTask$a */
    /* loaded from: classes3.dex */
    public static final class C7759a extends Thread {
        C7759a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (VideoBlendCompressTask.this.f41626l) {
                VideoBlendCompressTask.this.m39526o();
                VideoBlendCompressTask.this.m39524m();
                try {
                    Thread.sleep(10000L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public VideoBlendCompressTask(long j11, VideoBlendingParam videoBlendingParam, InterfaceC27372b interfaceC27372b, InterfaceC7761b.b bVar, InterfaceC7761b.c cVar, int i11) {
        AbstractC19074t.m100208f(videoBlendingParam, "videoBlendingParam");
        AbstractC19074t.m100208f(bVar, "videoCompressTaskListener");
        this.f41615a = j11;
        this.f41616b = videoBlendingParam;
        this.f41617c = interfaceC27372b;
        this.f41618d = bVar;
        this.f41619e = cVar;
        this.f41620f = i11;
        this.f41621g = new File(videoBlendingParam.f48278r);
        EnumC24245a enumC24245a = EnumC24245a.f117106q;
        this.f41624j = enumC24245a;
        this.f41625k = enumC24245a;
        this.f41626l = true;
        this.f41627m = enumC24245a;
        this.f41628n = EnumC24246b.f117117q;
        this.f41629o = new C18907d();
        this.f41630p = EnumC24247c.f117125q;
        mo39538b(EnumC24246b.f117118r);
        String str = videoBlendingParam.f48256H;
        if (str != null && str.length() != 0) {
            this.f41623i = new File(videoBlendingParam.f48256H);
        }
        this.f41631q = new ZamReceiver() { // from class: com.zing.zalo.camera.videos.VideoBlendCompressTask$broadcastReceiver$1
            public VideoBlendCompressTask$broadcastReceiver$1() {
            }

            @Override // com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver, com.zing.zalo.startup.NonBlockingBroadcastReceiver
            /* renamed from: b */
            public void mo39547b(Context context, Intent intent) {
                AbstractC19074t.m100208f(context, "context");
                AbstractC19074t.m100208f(intent, "intent");
                String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode != -255525363) {
                        if (hashCode == 202827409 && action.equals("com.zing.zalo.action.ACTION_BLEND_VIDEO")) {
                            VideoBlendCompressTask.this.m39528s(intent);
                            return;
                        }
                        return;
                    }
                    if (action.equals("com.zing.zalo.action.ACTION_UPDATE_SERVICE_STATE")) {
                        VideoBlendCompressTask.this.m39529t(intent);
                    }
                }
            }
        };
    }

    /* renamed from: D */
    public static final void m39517D(VideoBlendCompressTask videoBlendCompressTask) {
        AbstractC19074t.m100208f(videoBlendCompressTask, "this$0");
        videoBlendCompressTask.m39531v();
    }

    /* renamed from: m */
    public final void m39524m() {
        EnumC24245a enumC24245a;
        try {
            AbstractC20110a.f98889a.mo104558r("Check compress file ...", new Object[0]);
            if (this.f41625k != EnumC24245a.f117106q) {
                return;
            }
            if (this.f41621g.exists()) {
                if (this.f41621g.length() <= 0) {
                    AbstractC23041d2.m118207f(this.f41621g);
                    if (!AbstractC23238v2.m119726k()) {
                        enumC24245a = EnumC24245a.f117100A;
                    } else {
                        enumC24245a = EnumC24245a.f117111v;
                    }
                } else {
                    enumC24245a = EnumC24245a.f117107r;
                }
                this.f41625k = enumC24245a;
                m39527p();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - C7760a.f41634a.m39565h(mo39539c());
            if (this.f41616b.f48274Z.m40335i() == 720.0f) {
                if (currentTimeMillis <= 60000) {
                    return;
                }
            } else if (currentTimeMillis <= 20000) {
                return;
            }
            this.f41625k = EnumC24245a.f117112w;
            if (m39543q().compareTo(EnumC24247c.f117127s) < 0) {
                this.f41625k = EnumC24245a.f117103D;
            }
            m39527p();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            this.f41625k = EnumC24245a.f117113x;
            m39527p();
        }
    }

    /* renamed from: n */
    private final void m39525n(int i11) {
        if (i11 != -100) {
            if (i11 != -2) {
                if (i11 != -1) {
                    if (i11 != 1 && i11 != 2) {
                        if (i11 == 3) {
                            this.f41625k = EnumC24245a.f117100A;
                        }
                    }
                } else {
                    this.f41625k = EnumC24245a.f117114y;
                }
            } else {
                this.f41625k = EnumC24245a.f117115z;
            }
            m39527p();
            return;
        }
        m39524m();
    }

    /* renamed from: o */
    public final void m39526o() {
        EnumC24245a enumC24245a;
        try {
            if (this.f41624j != EnumC24245a.f117106q) {
                return;
            }
            if (!this.f41616b.f48257I) {
                this.f41624j = EnumC24245a.f117107r;
                m39527p();
                return;
            }
            File file = this.f41623i;
            AbstractC19074t.m100205c(file);
            if (file.exists()) {
                File file2 = this.f41623i;
                AbstractC19074t.m100205c(file2);
                if (file2.length() <= 0) {
                    AbstractC23041d2.m118207f(this.f41623i);
                    enumC24245a = EnumC24245a.f117109t;
                } else {
                    enumC24245a = EnumC24245a.f117107r;
                }
                this.f41624j = enumC24245a;
                InterfaceC27372b interfaceC27372b = this.f41617c;
                if ((interfaceC27372b instanceof VideoMessageParams) && ((VideoMessageParams) interfaceC27372b).f48287p.length() > 0) {
                    C23744a.Companion.m124119a().m124116d(4, ((VideoMessageParams) this.f41617c).f48287p);
                }
                m39527p();
                return;
            }
            if (System.currentTimeMillis() - C7760a.f41634a.m39565h(mo39539c()) > 20000) {
                this.f41624j = EnumC24245a.f117110u;
                if (m39543q().compareTo(EnumC24247c.f117127s) < 0) {
                    this.f41624j = EnumC24245a.f117103D;
                }
                m39527p();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            this.f41624j = EnumC24245a.f117108s;
            m39527p();
        }
    }

    /* renamed from: p */
    private final void m39527p() {
        EnumC24245a enumC24245a;
        try {
            EnumC24245a enumC24245a2 = this.f41624j;
            EnumC24245a enumC24245a3 = EnumC24245a.f117106q;
            if (enumC24245a2 != enumC24245a3 && (enumC24245a = this.f41625k) != enumC24245a3) {
                this.f41626l = false;
                EnumC24245a enumC24245a4 = EnumC24245a.f117107r;
                if (enumC24245a2 == enumC24245a4 && enumC24245a == enumC24245a4) {
                    enumC24245a2 = enumC24245a4;
                } else if (enumC24245a != enumC24245a4) {
                    enumC24245a2 = enumC24245a;
                }
                m39546z(enumC24245a2);
                if (this.f41631q != null) {
                    MainApplication.Companion.m35500c().unregisterReceiver(this.f41631q);
                    this.f41631q = null;
                }
                this.f41618d.mo39570a(this);
                if (mo39541e() == enumC24245a4) {
                    m39532w();
                } else {
                    m39531v();
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: s */
    public final void m39528s(Intent intent) {
        int intExtra = intent.getIntExtra("extra_status_code", -100);
        C18907d mo39537a = mo39537a();
        mo39537a.m99111e(intent.getIntExtra("HARDWARE_ASYNC", -1));
        mo39537a.m99110d(intent.getIntExtra("BLEND", -1));
        mo39537a.m99112f(intent.getIntExtra("NATIVE_COMPRESS", -1));
        AbstractC20110a.f98889a.m104564x("[VideoCompress]").mo104556o(8, "Transcode done, error:" + intExtra, new Object[0]);
        m39526o();
        m39525n(intExtra);
    }

    /* renamed from: t */
    public final void m39529t(Intent intent) {
        EnumC24247c enumC24247c;
        int intExtra = intent.getIntExtra("service_state", -1);
        EnumC24247c[] values = EnumC24247c.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                enumC24247c = values[i11];
                if (enumC24247c.m126584c() == intExtra) {
                    break;
                } else {
                    i11++;
                }
            } else {
                enumC24247c = null;
                break;
            }
        }
        if (enumC24247c != null) {
            m39534A(enumC24247c);
        }
        AbstractC20110a.f98889a.m104564x("[VideoCompress]").mo104556o(8, "Update service state: " + enumC24247c, new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:            if (r1.length() == 0) goto L34;     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m39530u() {
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        boolean z11 = false;
        try {
            String m124128g = EnumC23747b0.f114864K.m124128g();
            if (m124128g != null) {
            }
            z11 = true;
            return !z11;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: v */
    private final void m39531v() {
        InterfaceC7761b.c cVar = this.f41619e;
        if (cVar != null) {
            cVar.mo39572b(this);
        }
    }

    /* renamed from: w */
    private final void m39532w() {
        InterfaceC7761b.c cVar = this.f41619e;
        if (cVar != null) {
            String absolutePath = this.f41621g.getAbsolutePath();
            AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
            cVar.mo39574d(this, absolutePath);
        }
    }

    /* renamed from: x */
    private final void m39533x() {
        InterfaceC7761b.c cVar = this.f41619e;
        if (cVar != null) {
            cVar.mo39573c(this);
        }
    }

    /* renamed from: A */
    public void m39534A(EnumC24247c enumC24247c) {
        AbstractC19074t.m100208f(enumC24247c, "<set-?>");
        this.f41630p = enumC24247c;
    }

    /* renamed from: B */
    public final void m39535B() {
        C7759a c7759a = new C7759a();
        this.f41622h = c7759a;
        AbstractC19074t.m100205c(c7759a);
        c7759a.start();
    }

    /* renamed from: C */
    public void m39536C() {
        try {
            m39533x();
            m39545y();
            if (m39530u()) {
                MainApplication.C6895a c6895a = MainApplication.Companion;
                Intent intent = new Intent(c6895a.m35500c(), (Class<?>) ProcessVideoService.class);
                intent.setAction("com.zing.zalo.action.ACTION_BLEND_VIDEO");
                VideoBlendingParam videoBlendingParam = this.f41616b;
                AbstractC19074t.m100206d(videoBlendingParam, "null cannot be cast to non-null type android.os.Parcelable");
                intent.putExtra("extra_compress_params", (Parcelable) videoBlendingParam);
                intent.putExtra("extra_update_id", mo39539c());
                C28294a c28294a = C28294a.f131993a;
                intent.putExtra("extra_force_anr", c28294a.m142567b());
                intent.putExtra("extra_force_crash", c28294a.m142568c());
                intent.putExtra("extra_delay_pin_noti", c28294a.m142566a());
                InterfaceC27372b interfaceC27372b = this.f41617c;
                if (interfaceC27372b instanceof VideoMessageParams) {
                    intent.putExtra("extra_message_params", (Parcelable) interfaceC27372b);
                }
                ProcessVideoService.Companion.m50433a(c6895a.m35500c(), intent);
                m39535B();
                return;
            }
            m39546z(EnumC24245a.f117102C);
            m39531v();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            if (Build.VERSION.SDK_INT >= 31 && AbstractC23733b.m124090a(e11)) {
                m39546z(EnumC24245a.f117101B);
                AbstractC19444a.m101694b(new Runnable() { // from class: nf.c
                    public /* synthetic */ RunnableC23734c() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoBlendCompressTask.m39517D(VideoBlendCompressTask.this);
                    }
                }, 10000L);
            } else {
                m39531v();
            }
        }
    }

    @Override // com.zing.zalo.camera.videos.InterfaceC7761b
    /* renamed from: a */
    public C18907d mo39537a() {
        return this.f41629o;
    }

    @Override // com.zing.zalo.camera.videos.InterfaceC7761b
    /* renamed from: b */
    public void mo39538b(EnumC24246b enumC24246b) {
        AbstractC19074t.m100208f(enumC24246b, "<set-?>");
        this.f41628n = enumC24246b;
    }

    @Override // com.zing.zalo.camera.videos.InterfaceC7761b
    /* renamed from: c */
    public long mo39539c() {
        return this.f41615a;
    }

    @Override // com.zing.zalo.camera.videos.InterfaceC7761b
    /* renamed from: d */
    public void mo39540d() {
        try {
            this.f41626l = false;
            Thread thread = this.f41622h;
            if (thread != null) {
                thread.interrupt();
            }
            if (this.f41631q != null) {
                MainApplication.Companion.m35500c().unregisterReceiver(this.f41631q);
                this.f41631q = null;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.camera.videos.InterfaceC7761b
    /* renamed from: e */
    public EnumC24245a mo39541e() {
        return this.f41627m;
    }

    @Override // com.zing.zalo.camera.videos.InterfaceC7761b
    /* renamed from: h */
    public int mo39542h() {
        return this.f41620f;
    }

    /* renamed from: q */
    public EnumC24247c m39543q() {
        return this.f41630p;
    }

    /* renamed from: r */
    public EnumC24246b m39544r() {
        return this.f41628n;
    }

    /* renamed from: y */
    public final void m39545y() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.zing.zalo.action.ACTION_BLEND_VIDEO");
            intentFilter.addAction("com.zing.zalo.action.ACTION_UPDATE_SERVICE_STATE");
            AbstractC1388a.m6972n(MainApplication.Companion.m35500c(), this.f41631q, intentFilter, "com.zing.zalo.permission.BROADCAST_FROM_VIDEO_PROCESSING", null, 2);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104551d(e11.toString(), new Object[0]);
        }
    }

    /* renamed from: z */
    public void m39546z(EnumC24245a enumC24245a) {
        AbstractC19074t.m100208f(enumC24245a, "<set-?>");
        this.f41627m = enumC24245a;
    }
}
