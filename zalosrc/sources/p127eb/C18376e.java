package p127eb;

import com.vng.zing.vn.zrtc.livestream.ZlsViewerJni;
import p097db.AbstractC17861t;

/* renamed from: eb.e */
/* loaded from: classes3.dex */
public class C18376e {

    /* renamed from: a */
    private long f92767a;

    /* renamed from: b */
    protected boolean f92768b;

    protected C18376e(long j11, boolean z11) {
        this.f92768b = z11;
        this.f92767a = j11;
    }

    /* renamed from: a */
    protected void m97363a() {
        long j11 = this.f92767a;
        if (j11 != 0 && this.f92768b) {
            this.f92768b = false;
            ZlsViewerJni.zls_viewer_delete(j11);
            this.f92767a = 0L;
        }
    }

    /* renamed from: b */
    public void m97364b(Object obj) {
        ZlsViewerJni.zls_viewer_register_cb(this.f92767a, obj);
    }

    /* renamed from: c */
    public int m97365c(Object obj) {
        return ZlsViewerJni.zls_viewer_set_app_context(this.f92767a, obj);
    }

    /* renamed from: d */
    public int m97366d(Object obj) {
        return ZlsViewerJni.zls_viewer_set_egl_context(this.f92767a, obj);
    }

    /* renamed from: e */
    public void m97367e(int i11) {
        ZlsViewerJni.zls_viewer_set_log_level(this.f92767a, i11);
    }

    /* renamed from: f */
    public void m97368f(Object obj) {
        ZlsViewerJni.zls_viewer_set_render_wnd(this.f92767a, obj);
    }

    public synchronized void finalize() {
        m97363a();
    }

    /* renamed from: g */
    public int m97369g(String str) {
        return ZlsViewerJni.zls_viewer_start(this.f92767a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: h */
    public void m97370h() {
        ZlsViewerJni.zls_viewer_stop(this.f92767a);
    }

    public C18376e() {
        this(ZlsViewerJni.zls_viewer_create(), true);
    }
}
