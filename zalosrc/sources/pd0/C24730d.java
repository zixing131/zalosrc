package pd0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import od0.InterfaceC24223a;
import td0.C26639b;

/* renamed from: pd0.d */
/* loaded from: classes4.dex */
public class C24730d {

    /* renamed from: a */
    private final Map f118776a;

    /* renamed from: b */
    private final Handler f118777b;

    /* renamed from: pd0.d$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        private static final C24730d f118778a = new C24730d();
    }

    /* synthetic */ C24730d(AbstractC24731e abstractC24731e) {
        this();
    }

    /* renamed from: h */
    public static C24730d m128465h() {
        return a.f118778a;
    }

    /* renamed from: j */
    public /* synthetic */ boolean m128466j(Message message) {
        try {
            if (message.what == 1) {
                AbstractC20110a.m104535d("handleMessage MESSAGE_CHECK_UPLOAD", new Object[0]);
                m128469m();
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: k */
    public /* synthetic */ void m128467k() {
        try {
            synchronized (this.f118776a) {
                try {
                    Iterator it = this.f118776a.entrySet().iterator();
                    while (it.hasNext()) {
                        C24732f c24732f = (C24732f) ((Map.Entry) it.next()).getValue();
                        it.remove();
                        if (c24732f != null) {
                            c24732f.m128489e();
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public /* synthetic */ void m128468l(String str, EnumC24734h enumC24734h, InterfaceC24223a interfaceC24223a, String str2, TrackingSource trackingSource, boolean z11, int i11, boolean z12) {
        try {
            synchronized (this.f118776a) {
                try {
                    Iterator it = this.f118776a.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C24732f c24732f = (C24732f) ((Map.Entry) it.next()).getValue();
                            if (c24732f != null && c24732f.m128490g(str, enumC24734h)) {
                                break;
                            }
                        } else {
                            C24732f c24732f2 = new C24732f(str, enumC24734h, interfaceC24223a);
                            if (TextUtils.isEmpty(str2)) {
                                str2 = "";
                            }
                            c24732f2.f118785g = str2;
                            if (enumC24734h == EnumC24734h.AVATAR) {
                                c24732f2.m128494n(trackingSource);
                                c24732f2.m128492l(z11);
                                this.f118776a.put(CoreUtility.f89233i, c24732f2);
                            } else if (enumC24734h == EnumC24734h.GROUP_AVATAR) {
                                c24732f2.m128491k(i11, z12);
                                this.f118776a.put(C26639b.m136745d(i11), c24732f2);
                            }
                        }
                    }
                    this.f118777b.sendEmptyMessage(1);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    private void m128469m() {
        C24732f c24732f;
        synchronized (this.f118776a) {
            try {
                Iterator it = this.f118776a.entrySet().iterator();
                c24732f = null;
                while (it.hasNext()) {
                    C24732f c24732f2 = (C24732f) ((Map.Entry) it.next()).getValue();
                    if (c24732f2 != null) {
                        EnumC24733g enumC24733g = c24732f2.f118782d;
                        if (enumC24733g != EnumC24733g.NONE && enumC24733g != EnumC24733g.ERROR) {
                        }
                        if (c24732f == null || c24732f.f118789k < c24732f2.f118789k) {
                            c24732f = c24732f2;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c24732f == null) {
            return;
        }
        c24732f.m128495o();
    }

    /* renamed from: d */
    public boolean m128470d(C24732f c24732f) {
        synchronized (this.f118776a) {
            try {
                Iterator it = this.f118776a.entrySet().iterator();
                while (it.hasNext()) {
                    C24732f c24732f2 = (C24732f) ((Map.Entry) it.next()).getValue();
                    if (c24732f2 != null && c24732f == c24732f2) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public void m128471e() {
        this.f118777b.removeMessages(1);
        this.f118777b.sendEmptyMessage(1);
    }

    /* renamed from: f */
    public void m128472f() {
        try {
            synchronized (this.f118776a) {
                try {
                    Iterator it = this.f118776a.entrySet().iterator();
                    while (it.hasNext()) {
                        C24732f c24732f = (C24732f) ((Map.Entry) it.next()).getValue();
                        if (c24732f != null && c24732f.f118780b == EnumC24734h.AVATAR) {
                            c24732f.m128489e();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public C24732f m128473g(String str) {
        return (C24732f) this.f118776a.get(str);
    }

    /* renamed from: i */
    public Object m128474i() {
        return this.f118776a;
    }

    /* renamed from: n */
    public void m128475n() {
        this.f118777b.post(new Runnable() { // from class: pd0.a
            public /* synthetic */ RunnableC24727a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C24730d.this.m128467k();
            }
        });
    }

    /* renamed from: o */
    public void m128476o(String str) {
        this.f118776a.remove(str);
    }

    /* renamed from: p */
    public void m128477p(String str, EnumC24734h enumC24734h, int i11, boolean z11, String str2, TrackingSource trackingSource, InterfaceC24223a interfaceC24223a) {
        m128478q(str, false, enumC24734h, i11, z11, str2, trackingSource, interfaceC24223a);
    }

    /* renamed from: q */
    public void m128478q(String str, boolean z11, EnumC24734h enumC24734h, int i11, boolean z12, String str2, TrackingSource trackingSource, InterfaceC24223a interfaceC24223a) {
        this.f118777b.post(new Runnable() { // from class: pd0.c

            /* renamed from: q */
            public final /* synthetic */ String f118768q;

            /* renamed from: r */
            public final /* synthetic */ EnumC24734h f118769r;

            /* renamed from: s */
            public final /* synthetic */ InterfaceC24223a f118770s;

            /* renamed from: t */
            public final /* synthetic */ String f118771t;

            /* renamed from: u */
            public final /* synthetic */ TrackingSource f118772u;

            /* renamed from: v */
            public final /* synthetic */ boolean f118773v;

            /* renamed from: w */
            public final /* synthetic */ int f118774w;

            /* renamed from: x */
            public final /* synthetic */ boolean f118775x;

            public /* synthetic */ RunnableC24729c(String str3, EnumC24734h enumC24734h2, InterfaceC24223a interfaceC24223a2, String str22, TrackingSource trackingSource2, boolean z112, int i112, boolean z122) {
                r2 = str3;
                r3 = enumC24734h2;
                r4 = interfaceC24223a2;
                r5 = str22;
                r6 = trackingSource2;
                r7 = z112;
                r8 = i112;
                r9 = z122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C24730d.this.m128468l(r2, r3, r4, r5, r6, r7, r8, r9);
            }
        });
    }

    /* renamed from: r */
    public void m128479r(C24732f c24732f) {
        EnumC24734h enumC24734h = c24732f.f118780b;
        if (enumC24734h == EnumC24734h.AVATAR) {
            this.f118776a.put(CoreUtility.f89233i, c24732f);
        } else if (enumC24734h == EnumC24734h.GROUP_AVATAR) {
            this.f118776a.put(C26639b.m136745d(c24732f.f118783e), c24732f);
        }
    }

    private C24730d() {
        this.f118776a = new HashMap();
        AbstractC20110a.m104535d("new AvatarUploadController", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("Z:AvatarUpload", 5);
        handlerThread.start();
        this.f118777b = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: pd0.b
            public /* synthetic */ C24728b() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m128466j;
                m128466j = C24730d.this.m128466j(message);
                return m128466j;
            }
        });
    }
}
