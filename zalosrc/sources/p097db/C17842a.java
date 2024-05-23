package p097db;

import com.vng.zing.vn.zrtc.PeerJNI;

/* renamed from: db.a */
/* loaded from: classes3.dex */
public class C17842a {

    /* renamed from: a */
    private long f90138a;

    /* renamed from: b */
    protected boolean f90139b;

    protected C17842a(long j11, boolean z11) {
        this.f90139b = z11;
        this.f90138a = j11;
    }

    /* renamed from: a */
    protected void m94115a() {
        long j11 = this.f90138a;
        if (j11 != 0) {
            if (this.f90139b) {
                this.f90139b = false;
                PeerJNI.zrtc_call_config_delete(j11);
            }
            this.f90138a = 0L;
        }
    }

    /* renamed from: b */
    public long m94116b() {
        return this.f90138a;
    }

    /* renamed from: c */
    public void m94117c(int i11) {
        PeerJNI.zrtc_call_config_set_client_version(this.f90138a, i11);
    }

    /* renamed from: d */
    public void m94118d(String str) {
        PeerJNI.zrtc_call_config_set_config_json(this.f90138a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: e */
    public void m94119e(boolean z11) {
        PeerJNI.zrtc_call_config_set_enable_change_ZRTP(this.f90138a, z11);
    }

    /* renamed from: f */
    public void m94120f(String str) {
        PeerJNI.zrtc_call_config_set_extra_info(this.f90138a, AbstractC17861t.m94383a(str));
    }

    public synchronized void finalize() {
        m94115a();
    }

    /* renamed from: g */
    public void m94121g(int i11) {
        PeerJNI.zrtc_call_config_set_fec_type(this.f90138a, i11);
    }

    /* renamed from: h */
    public void m94122h(String str) {
        PeerJNI.zrtc_call_config_set_log_stat_filename(this.f90138a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: i */
    public void m94123i(int i11) {
        PeerJNI.zrtc_call_config_set_loopback_mode(this.f90138a, i11);
    }

    /* renamed from: j */
    public void m94124j(String str) {
        PeerJNI.zrtc_call_config_set_os_info(this.f90138a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: k */
    public void m94125k(int i11) {
        PeerJNI.zrtc_call_config_set_partner_id(this.f90138a, i11);
    }

    /* renamed from: l */
    public void m94126l(boolean z11) {
        PeerJNI.zrtc_call_config_set_permission_start_camera(this.f90138a, z11);
    }

    /* renamed from: m */
    public void m94127m(int i11) {
        PeerJNI.zrtc_call_config_set_protocol(this.f90138a, i11);
    }

    /* renamed from: n */
    public void m94128n(int i11) {
        PeerJNI.zrtc_call_config_set_protocol_type(this.f90138a, i11);
    }

    /* renamed from: o */
    public void m94129o(String str) {
        PeerJNI.zrtc_call_config_set_session(this.f90138a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: p */
    public void m94130p(String[] strArr) {
        PeerJNI.zrtc_call_config_set_spectrum_file_path(this.f90138a, strArr);
    }

    /* renamed from: q */
    public void m94131q(boolean z11) {
        PeerJNI.zrtc_call_config_set_support_video_call(this.f90138a, z11);
    }

    /* renamed from: r */
    public void m94132r(int i11) {
        PeerJNI.zrtc_call_config_set_user_id(this.f90138a, i11);
    }

    /* renamed from: s */
    public void m94133s(boolean z11) {
        PeerJNI.zrtc_call_config_set_video_call(this.f90138a, z11);
    }

    /* renamed from: t */
    public void m94134t(int i11) {
        PeerJNI.zrtc_call_config_set_zalo_call_id(this.f90138a, i11);
    }

    /* renamed from: u */
    public void m94135u(String str) {
        PeerJNI.zrtc_call_config_set_zrtc_config_json(this.f90138a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: v */
    public void m94136v(String str) {
        PeerJNI.zrtc_call_config_set_zrtc_packet_output_file(this.f90138a, AbstractC17861t.m94383a(str));
    }

    public C17842a() {
        this(PeerJNI.zrtc_call_config_create(), true);
    }
}
