package p127eb;

import com.vng.zing.vn.zrtc.livestream.PeerLiveJNI;
import p097db.AbstractC17861t;

/* renamed from: eb.a */
/* loaded from: classes3.dex */
public class C18372a {

    /* renamed from: a */
    private long f92742a;

    /* renamed from: b */
    protected boolean f92743b;

    protected C18372a(long j11, boolean z11) {
        this.f92743b = z11;
        this.f92742a = j11;
    }

    /* renamed from: a */
    public void m97313a() {
        PeerLiveJNI.zrtc_peer_close_camera(this.f92742a);
    }

    /* renamed from: b */
    protected void m97314b() {
        long j11 = this.f92742a;
        if (j11 != 0 && this.f92743b) {
            this.f92743b = false;
            PeerLiveJNI.zrtc_peer_delete(j11);
            this.f92742a = 0L;
        }
    }

    /* renamed from: c */
    public void m97315c() {
        PeerLiveJNI.zrtc_forceStop(this.f92742a);
    }

    /* renamed from: d */
    public String m97316d(String str) {
        return PeerLiveJNI.zrtc_peer_get_stats(this.f92742a, str);
    }

    /* renamed from: e */
    public int m97317e() {
        return PeerLiveJNI.zrtc_init(this.f92742a);
    }

    /* renamed from: f */
    public boolean m97318f() {
        return PeerLiveJNI.zrtc_peer_is_in_live_stream(this.f92742a);
    }

    public synchronized void finalize() {
        m97314b();
    }

    /* renamed from: g */
    public void m97319g(boolean z11) {
        PeerLiveJNI.zrtc_peer_on_switch_camera_done(this.f92742a, z11);
    }

    /* renamed from: h */
    public void m97320h(byte[] bArr, int i11, int i12, int i13, long j11) {
        PeerLiveJNI.zrtc_peer_on_byte_buffer_frame_captured(this.f92742a, bArr, bArr.length, i11, i12, i13, j11);
    }

    /* renamed from: i */
    public void m97321i(int i11, int i12, int i13, float[] fArr, int i14, long j11) {
        PeerLiveJNI.zrtc_peer_on_texture_frame_captured(this.f92742a, i11, i12, i13, fArr, i14, j11);
    }

    /* renamed from: j */
    public void m97322j() {
        PeerLiveJNI.zrtc_peer_open_camera(this.f92742a);
    }

    /* renamed from: k */
    public void m97323k() {
        PeerLiveJNI.zrtc_pause(this.f92742a);
    }

    /* renamed from: l */
    public void m97324l(Object obj) {
        PeerLiveJNI.zrtc_peer_register_callback(this.f92742a, obj);
    }

    /* renamed from: m */
    public void m97325m() {
        PeerLiveJNI.zrtc_peer_restart_camera(this.f92742a);
    }

    /* renamed from: n */
    public void m97326n() {
        PeerLiveJNI.zrtc_resume(this.f92742a);
    }

    /* renamed from: o */
    public int m97327o(Object obj) {
        return PeerLiveJNI.zrtc_peer_set_app_context(this.f92742a, obj);
    }

    /* renamed from: p */
    public int m97328p(Object obj) {
        return PeerLiveJNI.zrtc_peer_set_egl_context(this.f92742a, obj);
    }

    /* renamed from: q */
    public void m97329q(C18375d c18375d) {
        PeerLiveJNI.zrtc_config_set_settings(this.f92742a, AbstractC17861t.m94383a(c18375d.m97357a()), AbstractC17861t.m94383a(c18375d.m97359c()), AbstractC17861t.m94383a(c18375d.m97358b()));
    }

    /* renamed from: r */
    public void m97330r(Object obj) {
        PeerLiveJNI.zrtc_peer_set_local_render_wnd(this.f92742a, obj);
    }

    /* renamed from: s */
    public void m97331s(int i11) {
        PeerLiveJNI.zrtc_peer_set_log_level(this.f92742a, i11);
    }

    /* renamed from: t */
    public int m97332t() {
        return PeerLiveJNI.zrtc_start(this.f92742a);
    }

    /* renamed from: u */
    public void m97333u() {
        PeerLiveJNI.zrtc_peer_switch_camera(this.f92742a);
    }

    public C18372a() {
        this(PeerLiveJNI.zrtc_peer_create(), true);
    }
}
