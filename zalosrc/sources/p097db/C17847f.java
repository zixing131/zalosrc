package p097db;

import com.vng.zing.vn.zrtc.GroupCallPeerJNI;
import com.vng.zing.vn.zrtc.GroupCallback;

/* renamed from: db.f */
/* loaded from: classes3.dex */
public class C17847f {

    /* renamed from: a */
    private long f90159a;

    /* renamed from: b */
    private boolean f90160b;

    /* renamed from: c */
    protected boolean f90161c;

    protected C17847f(long j11, boolean z11) {
        this.f90161c = z11;
        this.f90159a = j11;
    }

    /* renamed from: A */
    public void m94256A(int i11) {
        GroupCallPeerJNI.group_call_peer_set_log_level(this.f90159a, i11);
    }

    /* renamed from: B */
    public void m94257B(boolean z11) {
        GroupCallPeerJNI.group_call_peer_set_speaker_on(this.f90159a, z11);
    }

    /* renamed from: C */
    public boolean m94258C(boolean z11) {
        return GroupCallPeerJNI.group_call_peer_start_stop_video_capture(this.f90159a, z11);
    }

    /* renamed from: D */
    public void m94259D() {
        GroupCallPeerJNI.group_call_peer_switch_audio_device_layer(this.f90159a);
    }

    /* renamed from: E */
    public void m94260E() {
        GroupCallPeerJNI.group_call_peer_switch_camera(this.f90159a);
    }

    /* renamed from: F */
    public boolean m94261F(String str) {
        return GroupCallPeerJNI.group_call_peer_update_server_config(this.f90159a, str);
    }

    /* renamed from: a */
    public void m94262a(int i11, Object obj) {
        GroupCallPeerJNI.group_call_peer_add_remote_render_wnd(this.f90159a, i11, obj);
    }

    /* renamed from: b */
    public int m94263b(String str) {
        return GroupCallPeerJNI.group_call_peer_answer_meeting(this.f90159a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: c */
    public void m94264c() {
        GroupCallPeerJNI.group_call_peer_change_to_confirmed_meeting(this.f90159a);
    }

    /* renamed from: d */
    protected void m94265d() {
        long j11 = this.f90159a;
        if (j11 != 0 && this.f90161c) {
            this.f90161c = false;
            GroupCallPeerJNI.group_call_peer_delete(j11);
            this.f90159a = 0L;
        }
    }

    /* renamed from: e */
    public String m94266e() {
        return GroupCallPeerJNI.group_call_peer_get_call_info(this.f90159a);
    }

    /* renamed from: f */
    public int m94267f() {
        return GroupCallPeerJNI.group_call_get_endcall_quality_status(this.f90159a);
    }

    public synchronized void finalize() {
        m94265d();
    }

    /* renamed from: g */
    public String m94268g(String str) {
        return GroupCallPeerJNI.group_call_peer_get_json_stats406(this.f90159a, str);
    }

    /* renamed from: h */
    public int m94269h(int i11, String str, String str2) {
        return GroupCallPeerJNI.group_call_peer_incoming_meeting(this.f90159a, i11, AbstractC17861t.m94383a(str), AbstractC17861t.m94383a(str2));
    }

    /* renamed from: i */
    public int m94270i(String str) {
        return GroupCallPeerJNI.group_call_peer_init_meeting(this.f90159a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: j */
    public boolean m94271j() {
        return GroupCallPeerJNI.group_call_peer_is_in_call(this.f90159a);
    }

    /* renamed from: k */
    public void m94272k(boolean z11) {
        GroupCallPeerJNI.group_call_peer_join_with_camera(this.f90159a, z11);
    }

    /* renamed from: l */
    public boolean m94273l(boolean z11) {
        return GroupCallPeerJNI.group_call_peer_leave_meeting(this.f90159a, z11);
    }

    /* renamed from: m */
    public int m94274m(int i11, String str, String str2) {
        return GroupCallPeerJNI.group_call_peer_make_meeting(this.f90159a, i11, AbstractC17861t.m94383a(str), AbstractC17861t.m94383a(str2));
    }

    /* renamed from: n */
    public void m94275n(boolean z11) {
        GroupCallPeerJNI.group_call_peer_mute_audio(this.f90159a, z11);
    }

    /* renamed from: o */
    public void m94276o(int i11, int i12) {
        GroupCallPeerJNI.group_call_peer_notify_partner_recording_state_changed(this.f90159a, i11, i12);
    }

    /* renamed from: p */
    public void m94277p(int i11, int i12) {
        GroupCallPeerJNI.group_call_peer_notify_partner_video_capture_state_changed(this.f90159a, i11, i12);
    }

    /* renamed from: q */
    public void m94278q(boolean z11) {
        GroupCallPeerJNI.group_call_peer_on_switch_camera_done(this.f90159a, z11);
    }

    /* renamed from: r */
    public void m94279r(byte[] bArr, int i11, int i12, int i13, long j11) {
        GroupCallPeerJNI.group_call_peer_on_byte_buffer_frame_captured(this.f90159a, bArr, bArr.length, i11, i12, i13, j11);
    }

    /* renamed from: s */
    public void m94280s(int i11, int i12, int i13, float[] fArr, int i14, long j11) {
        GroupCallPeerJNI.group_call_peer_on_texture_frame_captured(this.f90159a, i11, i12, i13, fArr, i14, j11);
    }

    /* renamed from: t */
    public void m94281t(GroupCallback groupCallback) {
        GroupCallPeerJNI.group_call_peer_register_callback(this.f90159a, groupCallback);
    }

    /* renamed from: u */
    public void m94282u(int i11, int i12) {
        GroupCallPeerJNI.group_call_peer_request_video_quality(this.f90159a, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean m94283v() {
        return GroupCallPeerJNI.group_call_peer_restart_audio_device(this.f90159a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m94284w() {
        GroupCallPeerJNI.group_call_peer_restart_video_capture(this.f90159a);
    }

    /* renamed from: x */
    public int m94285x(Object obj) {
        return GroupCallPeerJNI.group_call_peer_set_app_context(this.f90159a, obj);
    }

    /* renamed from: y */
    public int m94286y(Object obj) {
        return GroupCallPeerJNI.group_call_peer_set_egl_context(this.f90159a, obj);
    }

    /* renamed from: z */
    public void m94287z(Object obj) {
        GroupCallPeerJNI.group_call_peer_set_local_render_wnd(this.f90159a, obj);
    }

    public C17847f() {
        this(GroupCallPeerJNI.group_call_peer_create(), true);
        this.f90160b = true;
    }
}
