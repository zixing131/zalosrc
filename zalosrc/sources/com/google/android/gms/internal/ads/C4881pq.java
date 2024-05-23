package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p229i5.AbstractC20295p;

/* renamed from: com.google.android.gms.internal.ads.pq */
/* loaded from: classes2.dex */
public final class C4881pq extends Thread {

    /* renamed from: A */
    private final int f26276A;

    /* renamed from: B */
    private final String f26277B;

    /* renamed from: C */
    private final boolean f26278C;

    /* renamed from: D */
    private final boolean f26279D;

    /* renamed from: E */
    private final boolean f26280E;

    /* renamed from: p */
    private boolean f26281p;

    /* renamed from: q */
    private boolean f26282q;

    /* renamed from: r */
    private final Object f26283r;

    /* renamed from: s */
    private final C4547gq f26284s;

    /* renamed from: t */
    private final int f26285t;

    /* renamed from: u */
    private final int f26286u;

    /* renamed from: v */
    private final int f26287v;

    /* renamed from: w */
    private final int f26288w;

    /* renamed from: x */
    private final int f26289x;

    /* renamed from: y */
    private final int f26290y;

    /* renamed from: z */
    private final int f26291z;

    public C4881pq() {
        C4547gq c4547gq = new C4547gq();
        this.f26281p = false;
        this.f26282q = false;
        this.f26284s = c4547gq;
        this.f26283r = new Object();
        this.f26286u = ((Long) AbstractC4926qy.f26991d.m24091e()).intValue();
        this.f26287v = ((Long) AbstractC4926qy.f26988a.m24091e()).intValue();
        this.f26288w = ((Long) AbstractC4926qy.f26992e.m24091e()).intValue();
        this.f26289x = ((Long) AbstractC4926qy.f26990c.m24091e()).intValue();
        this.f26290y = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21091Q)).intValue();
        this.f26291z = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21101R)).intValue();
        this.f26276A = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21111S)).intValue();
        this.f26285t = ((Long) AbstractC4926qy.f26993f.m24091e()).intValue();
        this.f26277B = (String) zzay.zzc().m21823b(AbstractC4554gx.f21131U);
        this.f26278C = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21141V)).booleanValue();
        this.f26279D = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21150W)).booleanValue();
        this.f26280E = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21159X)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    public final C4510fq m25513a() {
        return this.f26284s.m22509a(this.f26280E);
    }

    /* renamed from: b */
    final C4843oq m25514b(View view, C4510fq c4510fq) {
        if (view == null) {
            return new C4843oq(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (!TextUtils.isEmpty(text)) {
                c4510fq.m22133k(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                return new C4843oq(this, 1, 0);
            }
            return new C4843oq(this, 0, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zq0)) {
            WebView webView = (WebView) view;
            if (!AbstractC20295p.m105950d()) {
                return new C4843oq(this, 0, 0);
            }
            c4510fq.m22130h();
            webView.post(new RunnableC4806nq(this, c4510fq, webView, globalVisibleRect));
            return new C4843oq(this, 0, 1);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                C4843oq m25514b = m25514b(viewGroup.getChildAt(i13), c4510fq);
                i11 += m25514b.f25738a;
                i12 += m25514b.f25739b;
            }
            return new C4843oq(this, i11, i12);
        }
        return new C4843oq(this, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:            if (r11 == 0) goto L64;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m25515c(View view) {
        try {
            C4510fq c4510fq = new C4510fq(this.f26286u, this.f26287v, this.f26288w, this.f26289x, this.f26290y, this.f26291z, this.f26276A, this.f26279D);
            Context m24015b = zzt.zzb().m24015b();
            if (m24015b != null && !TextUtils.isEmpty(this.f26277B)) {
                String str = (String) view.getTag(m24015b.getResources().getIdentifier((String) zzay.zzc().m21823b(AbstractC4554gx.f21121T), "id", m24015b.getPackageName()));
                if (str != null && str.equals(this.f26277B)) {
                    return;
                }
            }
            C4843oq m25514b = m25514b(view, c4510fq);
            c4510fq.m22135m();
            if (m25514b.f25738a == 0 && m25514b.f25739b == 0) {
                return;
            }
            int i11 = m25514b.f25739b;
            if (i11 == 0) {
                if (c4510fq.m22125c() == 0) {
                    return;
                }
            }
            if (this.f26284s.m22512d(c4510fq)) {
                return;
            }
            this.f26284s.m22510b(c4510fq);
        } catch (Exception e11) {
            yk0.zzh("Exception in fetchContentOnUIThread", e11);
            zzt.zzo().m22945t(e11, "ContentFetchTask.fetchContent");
        }
    }

    /* renamed from: d */
    public final void m25516d(C4510fq c4510fq, WebView webView, String str, boolean z11) {
        c4510fq.m22129g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!this.f26278C && !TextUtils.isEmpty(webView.getTitle())) {
                    c4510fq.m22134l(webView.getTitle() + "\n" + optString, z11, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    c4510fq.m22134l(optString, z11, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (c4510fq.m22137o()) {
                this.f26284s.m22511c(c4510fq);
            }
        } catch (JSONException unused) {
            yk0.zze("Json string may be malformed.");
        } catch (Throwable th2) {
            yk0.zzf("Failed to get webview content.", th2);
            zzt.zzo().m22945t(th2, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: e */
    public final void m25517e() {
        synchronized (this.f26283r) {
            try {
                if (this.f26281p) {
                    yk0.zze("Content hash thread already started, quiting...");
                } else {
                    this.f26281p = true;
                    start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public final void m25518f() {
        synchronized (this.f26283r) {
            this.f26282q = true;
            yk0.zze("ContentFetchThread: paused, mPause = true");
        }
    }

    /* renamed from: g */
    public final void m25519g() {
        synchronized (this.f26283r) {
            this.f26282q = false;
            this.f26283r.notifyAll();
            yk0.zze("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: h */
    public final boolean m25520h() {
        return this.f26282q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0042, code lost:            if (r3.importance != 100) goto L122;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0048, code lost:            if (r2.inKeyguardRestrictedInputMode() != false) goto L122;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:            r0 = (android.os.PowerManager) r0.getSystemService("power");     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:            if (r0 == null) goto L122;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:            if (r0.isScreenOn() == false) goto L122;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005a, code lost:            r0 = com.google.android.gms.ads.internal.zzt.zzb().m24014a();     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0062, code lost:            if (r0 != null) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:            com.google.android.gms.internal.ads.yk0.zze("ContentFetchThread: no activity. Sleeping.");        m25518f();     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0071, code lost:            r1 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0076, code lost:            if (r0.getWindow() == null) goto L118;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:            if (r0.getWindow().getDecorView() == null) goto L118;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:            r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0092, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0093, code lost:            com.google.android.gms.ads.internal.zzt.zzo().m22945t(r0, "ContentFetchTask.extractContent");        com.google.android.gms.internal.ads.yk0.zze("Failed getting root view of activity. Content not extracted.");     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006f, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:            com.google.android.gms.internal.ads.yk0.zzh("Error in ContentFetchTask", r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c7, code lost:            com.google.android.gms.internal.ads.yk0.zzh("Error in ContentFetchTask", r0);        com.google.android.gms.ads.internal.zzt.zzo().m22945t(r0, "ContentFetchTask.run");     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00de A[EXC_TOP_SPLITTER, LOOP:1: B:9:0x00de->B:16:0x00de, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        View view;
        while (true) {
            try {
                Context m24015b = zzt.zzb().m24015b();
                if (m24015b != null) {
                    ActivityManager activityManager = (ActivityManager) m24015b.getSystemService("activity");
                    KeyguardManager keyguardManager = (KeyguardManager) m24015b.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (Process.myPid() == next.pid) {
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                zzt.zzo().m22945t(th2, "ContentFetchTask.isInForeground");
            }
            yk0.zze("ContentFetchTask: sleeping");
            m25518f();
            Thread.sleep(this.f26285t * 1000);
            synchronized (this.f26283r) {
                while (this.f26282q) {
                    try {
                        yk0.zze("ContentFetchTask: waiting");
                        this.f26283r.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new RunnableC4731lq(this, view));
        }
        Thread.sleep(this.f26285t * 1000);
        synchronized (this.f26283r) {
        }
    }
}
