package com.zing.zalo.camera.videos;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.camera.videos.C7760a;
import com.zing.zalo.camera.videos.InterfaceC7761b;
import com.zing.zalo.camera.videos.VideoBlendCompressTask;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import me0.AbstractC23041d2;
import me0.AbstractC23238v2;
import mm0.AbstractC23352g;
import on0.AbstractC24342w;
import p390of.EnumC24245a;
import p390of.EnumC24246b;
import p559uv.InterfaceC27372b;
import sh.InterfaceC26248a;

/* renamed from: com.zing.zalo.camera.videos.a */
/* loaded from: classes.dex */
public final class C7760a implements InterfaceC26248a {

    /* renamed from: a */
    public static final C7760a f41634a = new C7760a();

    /* renamed from: b */
    private static final Map f41635b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: c */
    private static final Map f41636c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private static final Map f41637d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e */
    private static long f41638e = -1;

    /* renamed from: f */
    private static final InterfaceC7761b.b f41639f = new a();

    /* renamed from: g */
    private static volatile boolean f41640g;

    /* renamed from: com.zing.zalo.camera.videos.a$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC7761b.b {
        a() {
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.b
        /* renamed from: a */
        public void mo39570a(InterfaceC7761b interfaceC7761b) {
            AbstractC19074t.m100208f(interfaceC7761b, "videoCompressTask");
            C7760a c7760a = C7760a.f41634a;
            c7760a.m39556g(interfaceC7761b);
            c7760a.m39561o();
        }
    }

    private C7760a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m39556g(InterfaceC7761b interfaceC7761b) {
        EnumC24246b enumC24246b;
        try {
            InterfaceC7761b interfaceC7761b2 = (InterfaceC7761b) f41635b.get(Long.valueOf(interfaceC7761b.mo39539c()));
            if (interfaceC7761b2 != null) {
                if (interfaceC7761b.mo39541e() == EnumC24245a.f117107r) {
                    enumC24246b = EnumC24246b.f117120t;
                } else {
                    enumC24246b = EnumC24246b.f117121u;
                }
                interfaceC7761b2.mo39538b(enumC24246b);
                if (f41638e == interfaceC7761b2.mo39539c()) {
                    f41638e = -1L;
                    m39562p();
                }
                f41636c.remove(Long.valueOf(interfaceC7761b2.mo39539c()));
                f41637d.remove(Long.valueOf(interfaceC7761b2.mo39539c()));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: i */
    private final void m39557i(File file) {
        boolean m127149O;
        File parentFile;
        File m118200G;
        try {
            String path = file.getPath();
            AbstractC19074t.m100207e(path, "getPath(...)");
            Locale locale = Locale.getDefault();
            AbstractC19074t.m100207e(locale, "getDefault(...)");
            String lowerCase = path.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            m127149O = AbstractC24342w.m127149O(lowerCase, "story", false, 2, null);
            if (m127149O && (parentFile = file.getParentFile()) != null && (m118200G = AbstractC23041d2.m118200G(parentFile.getParentFile(), file.getName())) != null && !AbstractC19074t.m100204b(m118200G, file)) {
                AbstractC23238v2.m119717b(m118200G, file);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: l */
    private final synchronized void m39558l() {
        try {
            try {
                Map map = f41635b;
                AbstractC19074t.m100207e(map, "pendingTask");
                if ((!map.isEmpty()) && f41638e == -1) {
                    for (InterfaceC7761b interfaceC7761b : map.values()) {
                        AbstractC19074t.m100206d(interfaceC7761b, "null cannot be cast to non-null type com.zing.zalo.camera.videos.VideoBlendCompressTask");
                        final VideoBlendCompressTask videoBlendCompressTask = (VideoBlendCompressTask) interfaceC7761b;
                        if (videoBlendCompressTask.m39544r() == EnumC24246b.f117118r) {
                            m39568q(videoBlendCompressTask.mo39539c(), System.currentTimeMillis() + 4000);
                            f41638e = videoBlendCompressTask.mo39539c();
                            videoBlendCompressTask.mo39538b(EnumC24246b.f117119s);
                            m39557i(new File(videoBlendCompressTask.f41616b.f48278r));
                            if (!TextUtils.isEmpty(videoBlendCompressTask.f41616b.f48278r) && AbstractC23041d2.m118194A(videoBlendCompressTask.f41616b.f48278r)) {
                                AbstractC20110a.f98889a.mo104558r("[VideoCompressManager] Task is duplicate: %s", Long.valueOf(videoBlendCompressTask.mo39539c()));
                                AbstractC19444a.m101694b(new Runnable() { // from class: nf.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C7760a.m39560n(VideoBlendCompressTask.this);
                                    }
                                }, 2000L);
                            }
                            AbstractC20110a.f98889a.mo104558r("[VideoCompressManager] Start task: %s", Long.valueOf(videoBlendCompressTask.mo39539c()));
                            AbstractC19444a.m101694b(new Runnable() { // from class: nf.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C7760a.m39559m(VideoBlendCompressTask.this);
                                }
                            }, 2000L);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m39559m(VideoBlendCompressTask videoBlendCompressTask) {
        AbstractC19074t.m100208f(videoBlendCompressTask, "$task");
        if (f41635b.containsKey(Long.valueOf(videoBlendCompressTask.mo39539c()))) {
            videoBlendCompressTask.m39536C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m39560n(VideoBlendCompressTask videoBlendCompressTask) {
        AbstractC19074t.m100208f(videoBlendCompressTask, "$task");
        try {
            if (f41635b.containsKey(Long.valueOf(videoBlendCompressTask.mo39539c()))) {
                videoBlendCompressTask.m39545y();
                videoBlendCompressTask.m39535B();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m39561o() {
        if (f41640g || Build.VERSION.SDK_INT < 31) {
            AbstractC20110a.f98889a.m104564x("VideoCompressManager").mo104554k("startNextTaskOnForeground", new Object[0]);
            m39558l();
        }
    }

    /* renamed from: p */
    private final void m39562p() {
        try {
            MainApplication.Companion.m35500c().sendBroadcast(new Intent("com.zing.zalo.action.CLOSE_VIDEO_PROCESSING"));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // sh.InterfaceC26248a
    /* renamed from: a */
    public synchronized void mo39563a(long j11) {
        try {
            try {
                Map map = f41635b;
                InterfaceC7761b interfaceC7761b = (InterfaceC7761b) map.remove(Long.valueOf(j11));
                AbstractC20110a.f98889a.mo104558r("Remove task: " + j11 + "; Task remain: " + map.size(), new Object[0]);
                if (interfaceC7761b != null) {
                    interfaceC7761b.mo39540d();
                }
                if (f41638e == j11) {
                    f41638e = -1L;
                    m39562p();
                }
                f41636c.remove(Long.valueOf(j11));
                f41637d.remove(Long.valueOf(j11));
                m39561o();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // sh.InterfaceC26248a
    /* renamed from: b */
    public synchronized InterfaceC7761b mo39564b(long j11, String str, VideoBlendingParam videoBlendingParam, InterfaceC7761b.c cVar, int i11, InterfaceC27372b interfaceC27372b) {
        AbstractC19074t.m100208f(str, "rootPath");
        AbstractC19074t.m100208f(videoBlendingParam, "videoBlendingParam");
        try {
            Map map = f41635b;
            if (map.containsKey(Long.valueOf(j11))) {
                return (InterfaceC7761b) map.get(Long.valueOf(j11));
            }
            videoBlendingParam.f48278r = str + "VID_" + AbstractC23352g.m122788d(videoBlendingParam.m48167c().toString() + AbstractC23041d2.m118219r(videoBlendingParam.f48277q)) + ".mp4";
            VideoBlendCompressTask videoBlendCompressTask = new VideoBlendCompressTask(j11, videoBlendingParam, interfaceC27372b, f41639f, cVar, i11);
            AbstractC19074t.m100207e(map, "pendingTask");
            map.put(Long.valueOf(videoBlendCompressTask.mo39539c()), videoBlendCompressTask);
            Map map2 = f41637d;
            AbstractC19074t.m100207e(map2, "progressListeners");
            map2.put(Long.valueOf(videoBlendCompressTask.mo39539c()), cVar);
            m39561o();
            return videoBlendCompressTask;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: h */
    public synchronized long m39565h(long j11) {
        Map map = f41636c;
        long j12 = 0;
        if (!map.containsKey(Long.valueOf(j11))) {
            return 0L;
        }
        Long l11 = (Long) map.get(Long.valueOf(j11));
        if (l11 != null) {
            j12 = l11.longValue();
        }
        return j12;
    }

    /* renamed from: j */
    public final void m39566j() {
        f41640g = true;
        m39558l();
    }

    /* renamed from: k */
    public final void m39567k() {
        f41640g = false;
    }

    /* renamed from: q */
    public void m39568q(long j11, long j12) {
        AbstractC20110a.f98889a.mo104558r("[VideoCompressManager] Ping: id=" + j11 + "; time=" + j12, new Object[0]);
        if (f41635b.containsKey(Long.valueOf(j11))) {
            Map map = f41636c;
            AbstractC19074t.m100207e(map, "pings");
            map.put(Long.valueOf(j11), Long.valueOf(j12));
        } else if (f41638e == -1) {
            m39562p();
        }
    }

    /* renamed from: r */
    public void m39569r(long j11, int i11) {
        InterfaceC7761b.c cVar;
        Map map = f41637d;
        if (map.containsKey(Long.valueOf(j11)) && (cVar = (InterfaceC7761b.c) map.get(Long.valueOf(j11))) != null) {
            cVar.mo39571a(i11);
        }
    }
}
