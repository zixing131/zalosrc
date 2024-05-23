package com.zing.zalo.service;

import ag0.AbstractC0837p0;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.content.AbstractC1388a;
import androidx.core.os.AbstractC1438d;
import cg.AbstractC3460h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.videos.VideoCompressReceiver;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.media.pojo.VideoMessageParams;
import com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver;
import com.zing.zalo.service.ProcessVideoService;
import com.zing.zalo.videoencode.AbstractC16778c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gu.AbstractC19601a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import me0.AbstractC23041d2;
import me0.AbstractC23152n3;
import me0.AbstractC23204s0;
import me0.AbstractC23227u1;
import me0.AbstractC23238v2;
import me0.AbstractC23280z4;
import nf.C23735d;
import p239ih.C20556f;
import p308kx.C21965i;
import p363nh.C23750d;
import p390of.EnumC24247c;
import v50.C27870vb;
import vg.C28023b6;

/* loaded from: classes4.dex */
public final class ProcessVideoService extends Service implements Handler.Callback {
    public static final Companion Companion = new Companion(null);

    /* renamed from: y */
    private static final C9356a f49535y = new C9356a(ProcessVideoService.class);

    /* renamed from: p */
    private VideoBlendingParam f49536p;

    /* renamed from: q */
    private C23750d f49537q;

    /* renamed from: r */
    private NotificationManager f49538r;

    /* renamed from: s */
    private C21965i f49539s;

    /* renamed from: t */
    private File f49540t;

    /* renamed from: u */
    private int f49541u;

    /* renamed from: v */
    private int f49542v;

    /* renamed from: w */
    private final Handler f49543w = new Handler(Looper.getMainLooper(), this);

    /* renamed from: x */
    private final BroadcastReceiver f49544x = new ZamReceiver() { // from class: com.zing.zalo.service.ProcessVideoService$broadcastReceiver$1
        @Override // com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver, com.zing.zalo.startup.NonBlockingBroadcastReceiver
        /* renamed from: b */
        public void mo39547b(Context context, Intent intent) {
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(intent, "intent");
            try {
                if (AbstractC19074t.m100204b("com.zing.zalo.action.CLOSE_VIDEO_PROCESSING", intent.getAction())) {
                    ProcessVideoService.this.m50430s("onReceive: com.zing.zalo.action.CLOSE_VIDEO_PROCESSING");
                    ProcessVideoService.this.m50429r();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    };

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m50433a(Context context, Intent intent) {
            ProcessVideoService.f49535y.m50475b(context, intent);
        }

        /* renamed from: b */
        public final void m50434b(Context context) {
            ProcessVideoService.f49535y.m50476c(context);
        }
    }

    /* renamed from: com.zing.zalo.service.ProcessVideoService$a */
    /* loaded from: classes4.dex */
    public static final class C9354a implements AbstractC16778c.a {

        /* renamed from: b */
        final /* synthetic */ Bundle f49546b;

        C9354a(Bundle bundle) {
            this.f49546b = bundle;
        }

        @Override // com.zing.zalo.videoencode.AbstractC16778c.a
        /* renamed from: a */
        public void mo50435a(int i11) {
            ProcessVideoService.this.f49541u = i11;
        }

        @Override // com.zing.zalo.videoencode.AbstractC16778c.a
        /* renamed from: b */
        public void mo50436b(String str, int i11) {
            AbstractC19074t.m100208f(str, "key");
            this.f49546b.putInt(str, i11);
        }

        @Override // com.zing.zalo.videoencode.AbstractC16778c.a
        /* renamed from: c */
        public void mo50437c(String str) {
            AbstractC19074t.m100208f(str, "logInfo");
            ProcessVideoService.this.m50432v(str);
        }

        @Override // com.zing.zalo.videoencode.AbstractC16778c.a
        /* renamed from: d */
        public void mo50438d(int i11, String str, int i12, long j11) {
            ProcessVideoService.this.m50418w(i11, str, i12, j11);
        }

        @Override // com.zing.zalo.videoencode.AbstractC16778c.a
        /* renamed from: e */
        public void mo50439e(int i11, String str, long j11, long j12, long j13) {
            ProcessVideoService.this.m50419x(i11, str, j11, j12, j13);
        }

        @Override // com.zing.zalo.videoencode.AbstractC16778c.a
        /* renamed from: f */
        public void mo50440f(int i11) {
            ProcessVideoService.this.m50423E(i11);
            ProcessVideoService.this.f49541u = 0;
            ProcessVideoService.this.f49543w.removeMessages(2);
            ProcessVideoService.this.f49543w.sendEmptyMessage(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m50398A(ProcessVideoService processVideoService) {
        AbstractC19074t.m100208f(processVideoService, "this$0");
        processVideoService.m50412l(true);
    }

    /* renamed from: B */
    private final void m50399B(Bundle bundle) {
        C23750d m50415p = m50415p(bundle);
        this.f49537q = m50415p;
        if (m50415p != null) {
            AbstractC19074t.m100205c(m50415p);
            startForeground(1000, m50415p.mo6879e());
            C28023b6.m141262r2();
            AbstractC20110a.f98889a.mo104556o(9, "startForeground: %s", ProcessVideoService.class.getName());
            m50420y(EnumC24247c.f117127s);
            return;
        }
        throw new IllegalStateException("Cannot create notification builder".toString());
    }

    /* renamed from: C */
    private final void m50400C() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.zing.zalo.action.CLOSE_VIDEO_PROCESSING");
        AbstractC1388a.m6972n(this, this.f49544x, intentFilter, "com.zing.zalo.permission.BROADCAST_FROM_VIDEO_PROCESSING", null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static final void m50401G(ProcessVideoService processVideoService, long j11) {
        AbstractC19074t.m100208f(processVideoService, "this$0");
        while (true) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(processVideoService, (Class<?>) VideoCompressReceiver.class));
                intent.setAction("com.zing.zalo.action.ACTION_UPDATE_VIDEO_PROCESSING");
                intent.putExtra("current_progress", System.currentTimeMillis());
                intent.putExtra("extra_update_id", j11);
                intent.putExtra("progress_compress", processVideoService.f49541u);
                processVideoService.sendBroadcast(intent);
            } catch (Exception e11) {
                try {
                    AbstractC20110a.f98889a.mo104552e(e11);
                } catch (Exception e12) {
                    AbstractC20110a.f98889a.mo104552e(e12);
                    return;
                }
            }
            processVideoService.m50430s("send ACTION_UPDATE_VIDEO_PROCESSING:" + System.currentTimeMillis());
            Thread.sleep(1500L);
        }
    }

    /* renamed from: l */
    private final void m50412l(boolean z11) {
        if (z11) {
            AbstractC20110a.f98889a.mo104554k("Force crash process ...", new Object[0]);
            Process.killProcess(Process.myPid());
        }
    }

    /* renamed from: n */
    private final Runnable m50413n(String str, final Bundle bundle) {
        if (AbstractC19074t.m100204b("com.zing.zalo.action.ACTION_BLEND_VIDEO", str)) {
            return new Runnable() { // from class: q00.g
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessVideoService.m50414o(ProcessVideoService.this, bundle);
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m50414o(ProcessVideoService processVideoService, Bundle bundle) {
        AbstractC19074t.m100208f(processVideoService, "this$0");
        AbstractC19074t.m100208f(bundle, "$bundle");
        processVideoService.m50427k(bundle);
    }

    /* renamed from: p */
    private final C23750d m50415p(Bundle bundle) {
        C23750d c23750d = null;
        try {
            VideoMessageParams videoMessageParams = (VideoMessageParams) bundle.getParcelable("extra_message_params");
            C23750d c23750d2 = new C23750d(this);
            try {
                c23750d2.m124165v0("video_processing");
                c23750d2.m6866S(AbstractC16803z.ic_stat_videoprocess);
                c23750d2.m6870W(getString(AbstractC8020f0.video_encode_notification_title));
                if (videoMessageParams != null) {
                    ContactProfile contactProfile = new ContactProfile(videoMessageParams.f48287p);
                    contactProfile.f42437s = videoMessageParams.f48288q;
                    contactProfile.f42446v = videoMessageParams.f48289r;
                    String mo2478b = contactProfile.mo2478b();
                    AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                    Bundle m140776b = new C27870vb(mo2478b).m140780g(contactProfile).m140781h(MessageId.Companion.m41065d(videoMessageParams.f48290s, 0L, videoMessageParams.f48287p, "")).m140776b();
                    m140776b.putBoolean("fromNotification", true);
                    m140776b.putString("uidNotif", videoMessageParams.f48287p);
                    m140776b.putString("dpnNotif", videoMessageParams.f48288q);
                    m140776b.putString("avtNotif", videoMessageParams.f48289r);
                    m140776b.putBoolean("fromVideoNotif", true);
                    m140776b.putBoolean("cancelVideoCompress", true);
                    c23750d2.m6893u(PendingIntent.getActivity(this, 1000, AbstractC23152n3.m119002J(m140776b), AbstractC19601a.Companion.m102574b(134217728)));
                }
                c23750d2.m6875a0(System.currentTimeMillis());
                c23750d2.mo6860M(true);
                c23750d2.mo6895w(getString(AbstractC8020f0.video_encode_notification_title));
                c23750d2.mo6894v(getString(AbstractC8020f0.video_encode_notification_content));
                c23750d2.m6863P(100, this.f49541u, false);
                C28023b6.m141256k2(c23750d2);
                return c23750d2;
            } catch (Exception e11) {
                e = e11;
                c23750d = c23750d2;
                AbstractC20110a.f98889a.mo104552e(e);
                return c23750d;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: q */
    private final void m50416q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m50417u(ProcessVideoService processVideoService) {
        AbstractC19074t.m100208f(processVideoService, "this$0");
        processVideoService.m50429r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final void m50418w(int i11, String str, int i12, long j11) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this, (Class<?>) VideoCompressReceiver.class));
            intent.setAction("com.zing.zalo.action.ACTION_LOG_QOS_DETAILS");
            intent.putExtra("cmdCodeQOS", i11);
            if (str != null) {
                intent.putExtra("msg", str);
            }
            intent.putExtra("retCode", i12);
            intent.putExtra("executeTime", j11);
            sendBroadcast(intent);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m50419x(int i11, String str, long j11, long j12, long j13) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this, (Class<?>) VideoCompressReceiver.class));
            intent.setAction("com.zing.zalo.action.ACTION_LOG_QOS_FILTER_ACTION_SUCCESS");
            intent.putExtra("command", i11);
            if (str != null) {
                intent.putExtra("param", str);
            }
            intent.putExtra("startTime", j11);
            intent.putExtra("endTime", j12);
            intent.putExtra("executeTime", j13);
            sendBroadcast(intent);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: y */
    private final void m50420y(EnumC24247c enumC24247c) {
        AbstractC20110a.f98889a.mo104554k("broadcastUpdateServiceState: " + enumC24247c, new Object[0]);
        try {
            Intent intent = new Intent();
            intent.setAction("com.zing.zalo.action.ACTION_UPDATE_SERVICE_STATE");
            intent.putExtra("service_state", enumC24247c.m126584c());
            sendBroadcast(intent);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m50421z(ProcessVideoService processVideoService, Bundle bundle) {
        AbstractC19074t.m100208f(processVideoService, "this$0");
        AbstractC19074t.m100208f(bundle, "$bundle");
        processVideoService.m50399B(bundle);
    }

    /* renamed from: D */
    public final void m50422D() {
        try {
            m50430s("releaseResource");
            C21965i c21965i = this.f49539s;
            if (c21965i != null) {
                AbstractC19074t.m100205c(c21965i);
                c21965i.m114697N();
                this.f49539s = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E */
    public final void m50423E(int i11) {
        this.f49542v = i11;
    }

    /* renamed from: F */
    public final void m50424F(final long j11) {
        m50430s("startPingThread");
        new Thread(new Runnable() { // from class: q00.i
            @Override // java.lang.Runnable
            public final void run() {
                ProcessVideoService.m50401G(ProcessVideoService.this, j11);
            }
        }).start();
    }

    /* renamed from: H */
    public final void m50425H() {
        if (!AbstractC19444a.m101693a()) {
            m50430s("unpinForeground not on main thread");
            return;
        }
        m50430s("unpinForeground");
        try {
            if (this.f49538r != null) {
                m50430s("notificationManager.cancel: 1000");
                NotificationManager notificationManager = this.f49538r;
                AbstractC19074t.m100205c(notificationManager);
                notificationManager.cancel(1000);
            }
            m50430s("stopForeground");
            stopForeground(true);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            m50430s("stopForeground-e: " + e11.getMessage());
        }
    }

    /* renamed from: I */
    public final void m50426I() {
        try {
            m50430s("unregisterCloseVideoBroadcast");
            unregisterReceiver(this.f49544x);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        boolean z11;
        C23750d c23750d;
        AbstractC19074t.m100208f(message, "msg");
        if (message.what == 2) {
            try {
                boolean z12 = true;
                if (this.f49540t != null) {
                    if (this.f49541u > 100) {
                        this.f49541u = 100;
                    }
                    if (this.f49541u < 0) {
                        this.f49541u = 0;
                    }
                    if (this.f49541u == 100) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } else {
                    z11 = true;
                    z12 = false;
                }
                m50430s("CALC_PROGRESS: shouldNoti - " + z12 + ", doNext - " + z11 + ", processingPercent - " + this.f49541u);
                if (z12 && this.f49538r != null && (c23750d = this.f49537q) != null) {
                    AbstractC19074t.m100205c(c23750d);
                    c23750d.m6863P(100, this.f49541u, false);
                    NotificationManager notificationManager = this.f49538r;
                    AbstractC19074t.m100205c(notificationManager);
                    C23750d c23750d2 = this.f49537q;
                    AbstractC19074t.m100205c(c23750d2);
                    notificationManager.notify(1000, c23750d2.mo6879e());
                    C28023b6.m141262r2();
                }
                if (z11) {
                    Message obtainMessage = this.f49543w.obtainMessage(2);
                    AbstractC19074t.m100207e(obtainMessage, "obtainMessage(...)");
                    this.f49543w.sendMessageDelayed(obtainMessage, 1000L);
                } else {
                    m50430s("notificationManager.cancel");
                    this.f49543w.removeMessages(2);
                    NotificationManager notificationManager2 = this.f49538r;
                    AbstractC19074t.m100205c(notificationManager2);
                    notificationManager2.cancel(1000);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0205 A[Catch: Exception -> 0x0197, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0197, blocks: (B:59:0x0192, B:105:0x0205, B:4:0x000f, B:6:0x0040, B:8:0x0048, B:10:0x0051, B:12:0x005e, B:14:0x006b, B:15:0x0084, B:26:0x0096, B:28:0x009c, B:31:0x00a6, B:45:0x011d, B:47:0x0122, B:49:0x0135, B:50:0x015d, B:52:0x0163, B:54:0x0169, B:56:0x016d, B:57:0x018c, B:62:0x01b5, B:64:0x01bb, B:74:0x01cc, B:75:0x01d1, B:79:0x01d2, B:82:0x01d3), top: B:3:0x000f, inners: #8 }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m50427k(Bundle bundle) {
        C20556f c20556f;
        InputStream m106838k;
        File file;
        C23735d c23735d;
        VideoBlendingParam videoBlendingParam;
        AbstractC19074t.m100208f(bundle, "bundle");
        Bundle m7340a = AbstractC1438d.m7340a();
        InputStream inputStream = null;
        try {
            try {
                try {
                    m50430s("blendVideo: start");
                    VideoBlendingParam videoBlendingParam2 = (VideoBlendingParam) bundle.getParcelable("extra_compress_params");
                    this.f49536p = videoBlendingParam2;
                    AbstractC19074t.m100205c(videoBlendingParam2);
                    c20556f = new C20556f(videoBlendingParam2.f48277q);
                    m106838k = c20556f.m106838k();
                    VideoBlendingParam videoBlendingParam3 = this.f49536p;
                    AbstractC19074t.m100205c(videoBlendingParam3);
                    file = new File(videoBlendingParam3.f48278r);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    if (!AbstractC23227u1.m119701a(e11) && (!(e11 instanceof IOException) || AbstractC23238v2.m119726k())) {
                        m50431t(m7340a, -2);
                        if (0 != 0) {
                            inputStream.close();
                        }
                    }
                    m50431t(m7340a, 3);
                    if (0 != 0) {
                    }
                }
            } catch (Exception e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
            }
            if (file.exists() && file.length() > 0) {
                VideoBlendingParam videoBlendingParam4 = this.f49536p;
                AbstractC19074t.m100205c(videoBlendingParam4);
                if (videoBlendingParam4.f48257I) {
                    VideoBlendingParam videoBlendingParam5 = this.f49536p;
                    AbstractC19074t.m100205c(videoBlendingParam5);
                    if (!TextUtils.isEmpty(videoBlendingParam5.f48256H)) {
                        VideoBlendingParam videoBlendingParam6 = this.f49536p;
                        AbstractC19074t.m100205c(videoBlendingParam6);
                        if (!AbstractC23041d2.m118194A(videoBlendingParam6.f48256H)) {
                            VideoBlendingParam videoBlendingParam7 = this.f49536p;
                            AbstractC19074t.m100205c(videoBlendingParam7);
                            String str = videoBlendingParam7.f48278r;
                            VideoBlendingParam videoBlendingParam8 = this.f49536p;
                            AbstractC19074t.m100205c(videoBlendingParam8);
                            m50428m(str, videoBlendingParam8.f48256H);
                        }
                    }
                }
                m50431t(m7340a, 2);
                if (m106838k != null) {
                    try {
                        m106838k.close();
                        return;
                    } catch (Exception e13) {
                        AbstractC20110a.f98889a.mo104552e(e13);
                        return;
                    }
                }
                return;
            }
            if (c20556f.m106830b() && c20556f.m106845r() != 0) {
                m50424F(bundle.getLong("extra_update_id", -1L));
                this.f49540t = new File(AbstractC20130d.m104836I0(), file.getName());
                try {
                    VideoBlendingParam videoBlendingParam9 = this.f49536p;
                    AbstractC19074t.m100205c(videoBlendingParam9);
                    File file2 = this.f49540t;
                    AbstractC19074t.m100205c(file2);
                    videoBlendingParam9.f48278r = file2.getPath();
                    VideoBlendingParam videoBlendingParam10 = this.f49536p;
                    AbstractC19074t.m100205c(videoBlendingParam10);
                    c23735d = new C23735d(this, videoBlendingParam10, new C9354a(m7340a));
                    c23735d.m124099i();
                    videoBlendingParam = this.f49536p;
                    AbstractC19074t.m100205c(videoBlendingParam);
                } catch (Exception e14) {
                    AbstractC20110a.f98889a.mo104552e(e14);
                }
                if (videoBlendingParam.f48282v > 0) {
                    VideoBlendingParam videoBlendingParam11 = this.f49536p;
                    AbstractC19074t.m100205c(videoBlendingParam11);
                    if (videoBlendingParam11.f48283w > 0) {
                        VideoBlendingParam videoBlendingParam12 = this.f49536p;
                        AbstractC19074t.m100205c(videoBlendingParam12);
                        if (videoBlendingParam12.f48271W != null) {
                            VideoBlendingParam videoBlendingParam13 = this.f49536p;
                            AbstractC19074t.m100205c(videoBlendingParam13);
                            if (!TextUtils.isEmpty(videoBlendingParam13.f48277q)) {
                                VideoBlendingParam videoBlendingParam14 = this.f49536p;
                                AbstractC19074t.m100205c(videoBlendingParam14);
                                if (!TextUtils.isEmpty(videoBlendingParam14.f48278r)) {
                                    boolean m124097b = c23735d.m124097b();
                                    if (m124097b) {
                                        c23735d.m124098c();
                                    }
                                    if (m124097b) {
                                        m50430s("blendVideo: processSuccess");
                                        AbstractC23238v2.m119718c(this.f49540t, file);
                                        VideoBlendingParam videoBlendingParam15 = this.f49536p;
                                        AbstractC19074t.m100205c(videoBlendingParam15);
                                        if (videoBlendingParam15.f48254F) {
                                            String absolutePath = file.getAbsolutePath();
                                            String str2 = Environment.DIRECTORY_DCIM;
                                            String name = file.getName();
                                            AbstractC19074t.m100205c(this.f49536p);
                                            AbstractC23280z4.m120306R(absolutePath, str2, name, r0.f48255G, false, false, new SensitiveData("gallery_save_video_blend", "comm_csc", null, 4, null));
                                        }
                                        if (this.f49541u < 100) {
                                            this.f49541u = 100;
                                            C23750d c23750d = this.f49537q;
                                            if (c23750d != null && this.f49538r != null) {
                                                AbstractC19074t.m100205c(c23750d);
                                                c23750d.m6863P(100, this.f49541u, false);
                                                NotificationManager notificationManager = this.f49538r;
                                                AbstractC19074t.m100205c(notificationManager);
                                                C23750d c23750d2 = this.f49537q;
                                                AbstractC19074t.m100205c(c23750d2);
                                                notificationManager.notify(1000, c23750d2.mo6879e());
                                                C28023b6.m141262r2();
                                            }
                                        }
                                        m50431t(m7340a, 1);
                                        if (m106838k != null) {
                                            m106838k.close();
                                        }
                                        m50430s("blendVideo: end");
                                        return;
                                    }
                                    if (!AbstractC23238v2.m119726k()) {
                                        m50431t(m7340a, 3);
                                        if (m106838k != null) {
                                            try {
                                                m106838k.close();
                                                return;
                                            } catch (Exception e15) {
                                                AbstractC20110a.f98889a.mo104552e(e15);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    throw new Exception();
                                }
                            }
                        }
                    }
                }
                throw new IllegalArgumentException("Video parameters invalid".toString());
            }
            m50431t(m7340a, -1);
            if (m106838k != null) {
                try {
                    m106838k.close();
                } catch (Exception e16) {
                    AbstractC20110a.f98889a.mo104552e(e16);
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                    throw th2;
                } catch (Exception e17) {
                    AbstractC20110a.f98889a.mo104552e(e17);
                    throw th2;
                }
            }
            throw th2;
        }
    }

    /* renamed from: m */
    public final void m50428m(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !AbstractC23041d2.m118194A(str2)) {
                File file = new File(str2);
                File file2 = new File(AbstractC23204s0.m119558i(), file.getName());
                AbstractC3460h.m17441i(str, file2, 480, false);
                if (file2.exists() && file2.length() > 0) {
                    AbstractC23238v2.m119718c(file2, file);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC19074t.m100208f(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C21965i c21965i = new C21965i(1, "ProcessVideoService:wakelock");
        this.f49539s = c21965i;
        AbstractC19074t.m100205c(c21965i);
        c21965i.m114700x();
        m50416q();
        m50420y(EnumC24247c.f117126r);
    }

    @Override // android.app.Service
    public void onDestroy() {
        m50430s("onDestroy");
        m50422D();
        m50425H();
        super.onDestroy();
        m50430s("onDestroy: killProcess");
        Process.killProcess(Process.myPid());
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        if (intent != null) {
            try {
                m50430s("onStartCommand: start");
                final Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = AbstractC1438d.m7340a();
                }
                AbstractC19074t.m100205c(extras);
                if (extras.getBoolean("extra_force_anr", false)) {
                    AbstractC19444a.m101694b(new Runnable() { // from class: q00.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProcessVideoService.m50421z(ProcessVideoService.this, extras);
                        }
                    }, extras.getLong("extra_delay_pin_noti", 0L));
                } else {
                    m50399B(extras);
                }
                Runnable m50413n = m50413n(intent.getAction(), extras);
                if (m50413n != null) {
                    m50400C();
                    Object systemService = getSystemService("notification");
                    AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    this.f49538r = (NotificationManager) systemService;
                    AbstractC0837p0.Companion.m2238g().mo2040a(m50413n);
                }
                f49535y.m50474a(this);
                if (extras.getBoolean("extra_force_crash", false)) {
                    AbstractC19444a.m101694b(new Runnable() { // from class: q00.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProcessVideoService.m50398A(ProcessVideoService.this);
                        }
                    }, 5000L);
                    return 2;
                }
                return 2;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return 2;
            }
        }
        return 2;
    }

    /* renamed from: r */
    public final void m50429r() {
        m50430s("killService");
        this.f49543w.removeMessages(2);
        this.f49540t = null;
        m50422D();
        m50425H();
        try {
            m50430s("killService: stopSelf");
            Companion.m50434b(this);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            m50430s("stopSelf-e: " + e11.getMessage());
            stopSelf();
        }
    }

    /* renamed from: s */
    public final void m50430s(String str) {
        AbstractC20110a.f98889a.mo104558r(str, new Object[0]);
    }

    /* renamed from: t */
    public final void m50431t(Bundle bundle, int i11) {
        m50430s("broadcastCompressVideoDone: action: com.zing.zalo.action.ACTION_BLEND_VIDEO, code: " + i11);
        try {
            Intent intent = new Intent();
            intent.setAction("com.zing.zalo.action.ACTION_BLEND_VIDEO");
            AbstractC19074t.m100205c(bundle);
            intent.putExtras(bundle);
            intent.putExtra("extra_status_code", i11);
            sendBroadcast(intent);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        m50426I();
        AbstractC19444a.m101695c(new Runnable() { // from class: q00.h
            @Override // java.lang.Runnable
            public final void run() {
                ProcessVideoService.m50417u(ProcessVideoService.this);
            }
        });
    }

    /* renamed from: v */
    public final void m50432v(String str) {
        AbstractC19074t.m100208f(str, "logInfo");
        if (str.length() > 0) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(this, (Class<?>) VideoCompressReceiver.class));
                intent.setAction("com.zing.zalo.action.ACTION_WRITE_LOG");
                intent.putExtra("extra_log_info", str);
                sendBroadcast(intent);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }
}
