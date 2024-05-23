package p097db;

import com.vng.zing.vn.zrtc.CallCallback;
import com.vng.zing.vn.zrtc.PeerJNI;

/* renamed from: db.i */
/* loaded from: classes3.dex */
public class C17850i {

    /* renamed from: a */
    private long f90165a;

    /* renamed from: b */
    protected boolean f90166b;

    protected C17850i(long j11, boolean z11) {
        this.f90166b = z11;
        this.f90165a = j11;
    }

    /* renamed from: A */
    public boolean m94307A() {
        return PeerJNI.zrtc_peer_is_record_network_data(this.f90165a);
    }

    /* renamed from: B */
    public boolean m94308B(C17842a c17842a, String str) {
        return PeerJNI.zrtc_peer_make_call(this.f90165a, c17842a.m94116b(), AbstractC17861t.m94383a(str));
    }

    /* renamed from: C */
    public void m94309C(boolean z11) {
        PeerJNI.zrtc_peer_mute_audio(this.f90165a, z11);
    }

    /* renamed from: D */
    public void m94310D(boolean z11) {
        PeerJNI.zrtc_peer_network_change(this.f90165a, z11);
    }

    /* renamed from: E */
    public void m94311E(boolean z11) {
        PeerJNI.zrtc_peer_on_switch_camera_done(this.f90165a, z11);
    }

    /* renamed from: F */
    public void m94312F(boolean z11, int i11) {
        PeerJNI.zrtc_peer_on_video_filter_change(this.f90165a, z11, i11);
    }

    /* renamed from: G */
    public void m94313G(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, long j11) {
        PeerJNI.zrtc_peer_on_byte_buffer_frame_applied_filter(this.f90165a, bArr, i11, i12, i13, i14, i15, i16, j11);
    }

    /* renamed from: H */
    public void m94314H(byte[] bArr, int i11, int i12, int i13, long j11) {
        PeerJNI.zrtc_peer_on_byte_buffer_frame_captured(this.f90165a, bArr, bArr.length, i11, i12, i13, j11);
    }

    /* renamed from: I */
    public void m94315I(int i11, int i12, int i13, float[] fArr, int i14, long j11, int i15) {
        PeerJNI.zrtc_peer_on_texture_frame_captured(this.f90165a, i11, i12, i13, fArr, i14, j11, i15);
    }

    /* renamed from: J */
    public void m94316J(int i11) {
        PeerJNI.zrtc_peer_play_dtmf(this.f90165a, i11);
    }

    /* renamed from: K */
    public void m94317K(int i11, int i12, String str) {
        PeerJNI.zrtc_peer_pre_incoming(this.f90165a, i11, i12, AbstractC17861t.m94383a(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean m94318L() {
        return PeerJNI.zrtc_peer_reinit_audio_device(this.f90165a);
    }

    /* renamed from: M */
    public void m94319M(int i11, int i12, String str) {
        PeerJNI.zrtc_peer_receive_answer_preconnect(this.f90165a, i11, i12, AbstractC17861t.m94383a(str));
    }

    /* renamed from: N */
    public void m94320N(int i11) {
        PeerJNI.zrtc_peer_receive_call_event(this.f90165a, i11);
    }

    /* renamed from: O */
    public void m94321O(int i11, int i12, String str) {
        PeerJNI.zrtc_peer_receive_incoming_preconnect(this.f90165a, i11, i12, AbstractC17861t.m94383a(str));
    }

    /* renamed from: P */
    public void m94322P(int i11, String str) {
        PeerJNI.zrtc_peer_receive_msg_preconnect(this.f90165a, i11, AbstractC17861t.m94383a(str));
    }

    /* renamed from: Q */
    public boolean m94323Q(String str) {
        return PeerJNI.zrtc_peer_receive_partner_forward_data(this.f90165a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: R */
    public void m94324R(CallCallback callCallback) {
        PeerJNI.zrtc_peer_register_callback(this.f90165a, callCallback);
    }

    /* renamed from: S */
    public void m94325S() {
        PeerJNI.zrtc_peer_restart_capture(this.f90165a);
    }

    /* renamed from: T */
    public boolean m94326T(String str) {
        return PeerJNI.zrtc_peer_save_last_capture_frame(this.f90165a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: U */
    public boolean m94327U(String str) {
        return PeerJNI.zrtc_peer_save_last_render_frame(this.f90165a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: V */
    public void m94328V(int i11) {
        PeerJNI.zrtc_peer_set_aec_external(this.f90165a, i11);
    }

    /* renamed from: W */
    public void m94329W(int i11) {
        PeerJNI.zrtc_peer_set_aec_internal(this.f90165a, i11);
    }

    /* renamed from: X */
    public void m94330X(int i11) {
        PeerJNI.zrtc_peer_set_agc_mic_level(this.f90165a, i11);
    }

    /* renamed from: Y */
    public void m94331Y(int i11) {
        PeerJNI.zrtc_peer_set_agc_play_level(this.f90165a, i11);
    }

    /* renamed from: Z */
    public int m94332Z(Object obj) {
        return PeerJNI.zrtc_peer_set_app_context(this.f90165a, obj);
    }

    /* renamed from: a */
    public void m94333a(int i11, Object obj) {
        PeerJNI.zrtc_peer_add_render_wnd(this.f90165a, i11, obj);
    }

    /* renamed from: a0 */
    public void m94334a0(int i11) {
        PeerJNI.zrtc_peer_set_call_state(this.f90165a, i11);
    }

    /* renamed from: b */
    public void m94335b(String str, String[] strArr, String[] strArr2) {
        PeerJNI.zrtc_peer_call_change_ZRTP(this.f90165a, AbstractC17861t.m94383a(str), strArr, strArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m94336b0(String str) {
        PeerJNI.zrtc_peer_set_dev_config(this.f90165a, str);
    }

    /* renamed from: c */
    protected void m94337c() {
        long j11 = this.f90165a;
        if (j11 != 0 && this.f90166b) {
            this.f90166b = false;
            PeerJNI.zrtc_peer_delete(j11);
            this.f90165a = 0L;
        }
    }

    /* renamed from: c0 */
    public int m94338c0(Object obj) {
        return PeerJNI.zrtc_peer_set_egl_context(this.f90165a, obj);
    }

    /* renamed from: d */
    public void m94339d(boolean z11) {
        PeerJNI.zrtc_peer_end_call(this.f90165a, z11);
    }

    /* renamed from: d0 */
    public void m94340d0() {
        PeerJNI.zrtc_peer_set_last_frame_into_view(this.f90165a);
    }

    /* renamed from: e */
    public String m94341e() {
        return PeerJNI.zrtc_peer_get_active_audio_codecs(this.f90165a);
    }

    /* renamed from: e0 */
    public void m94342e0(Object obj) {
        PeerJNI.zrtc_peer_set_local_render_wnd(this.f90165a, obj);
    }

    /* renamed from: f */
    public int m94343f() {
        return PeerJNI.zrtc_peer_get_aec_external(this.f90165a);
    }

    /* renamed from: f0 */
    public void m94344f0(int i11) {
        PeerJNI.zrtc_peer_set_log_level(this.f90165a, i11);
    }

    public synchronized void finalize() {
        m94337c();
    }

    /* renamed from: g */
    public int m94345g() {
        return PeerJNI.zrtc_peer_get_aec_internal(this.f90165a);
    }

    /* renamed from: g0 */
    public void m94346g0(int i11) {
        PeerJNI.zrtc_peer_set_ns_level(this.f90165a, i11);
    }

    /* renamed from: h */
    public int m94347h() {
        return PeerJNI.zrtc_peer_get_agc_mic_level(this.f90165a);
    }

    /* renamed from: h0 */
    public void m94348h0(int i11, int i12) {
        PeerJNI.zrtc_peer_set_partner_off_camera(this.f90165a, i11, i12);
    }

    /* renamed from: i */
    public int m94349i() {
        return PeerJNI.zrtc_peer_get_agc_play_level(this.f90165a);
    }

    /* renamed from: i0 */
    public void m94350i0(boolean z11) {
        PeerJNI.zrtc_peer_set_speaker_on(this.f90165a, z11);
    }

    /* renamed from: j */
    public int m94351j() {
        return PeerJNI.zrtc_peer_get_auto_hangup_process_time(this.f90165a);
    }

    /* renamed from: j0 */
    public void m94352j0(boolean z11, String str) {
        PeerJNI.zrtc_peer_start_record_audio(this.f90165a, z11, AbstractC17861t.m94383a(str));
    }

    /* renamed from: k */
    public String m94353k() {
        return PeerJNI.zrtc_peer_get_call_info(this.f90165a);
    }

    /* renamed from: k0 */
    public void m94354k0(boolean z11, int i11) {
        PeerJNI.zrtc_peer_stop_capture(this.f90165a, z11, i11);
    }

    /* renamed from: l */
    public String m94355l(int i11, int i12) {
        return PeerJNI.zrtc_peer_get_client_cache_info(this.f90165a, i11, i12);
    }

    /* renamed from: l0 */
    public void m94356l0() {
        PeerJNI.zrtc_peer_switch_audio_device_layer(this.f90165a);
    }

    /* renamed from: m */
    public int m94357m() {
        return PeerJNI.zrtc_peer_get_end_call_state(this.f90165a);
    }

    /* renamed from: m0 */
    public void m94358m0() {
        PeerJNI.zrtc_peer_switch_camera(this.f90165a);
    }

    /* renamed from: n */
    public String m94359n() {
        return PeerJNI.zrtc_peer_get_extend_data(this.f90165a);
    }

    /* renamed from: n0 */
    public int m94360n0(boolean z11, String str) {
        return PeerJNI.zrtc_peer_switch_to_video_call(this.f90165a, z11, str);
    }

    /* renamed from: o */
    public String m94361o() {
        return PeerJNI.zrtc_peer_get_extend_data_ringring(this.f90165a);
    }

    /* renamed from: o0 */
    public int m94362o0(boolean z11) {
        return PeerJNI.zrtc_peer_switch_to_video_call_answer(this.f90165a, z11);
    }

    /* renamed from: p */
    public String m94363p(int i11, int i12, String str) {
        return PeerJNI.zrtc_peer_get_json_stats406(this.f90165a, i11, i12, str);
    }

    /* renamed from: p0 */
    public void m94364p0(Boolean bool) {
        PeerJNI.zrtc_peer_test_reset_encoder(this.f90165a, bool.booleanValue());
    }

    /* renamed from: q */
    public int m94365q() {
        return PeerJNI.zrtc_peer_get_loading_time_bad_connection(this.f90165a);
    }

    /* renamed from: q0 */
    public void m94366q0() {
        PeerJNI.zrtc_peer_toggle_current_server(this.f90165a);
    }

    /* renamed from: r */
    public String m94367r() {
        return PeerJNI.zrtc_peer_get_native_trace_data(this.f90165a);
    }

    /* renamed from: r0 */
    public boolean m94368r0(boolean z11) {
        return PeerJNI.zrtc_peer_turn_off_encoder_h265(this.f90165a, z11);
    }

    /* renamed from: s */
    public int m94369s() {
        return PeerJNI.zrtc_peer_get_ns_level(this.f90165a);
    }

    /* renamed from: s0 */
    public void m94370s0(int i11) {
        PeerJNI.zrtc_peer_on_app_state_change(this.f90165a, i11);
    }

    /* renamed from: t */
    public boolean m94371t(String[] strArr) {
        return PeerJNI.zrtc_peer_get_spectrum_files(this.f90165a, strArr);
    }

    /* renamed from: t0 */
    public boolean m94372t0(String str) {
        return PeerJNI.zrtc_peer_update_callee_pre_ringing(this.f90165a, str);
    }

    /* renamed from: u */
    public void m94373u(boolean z11, boolean z12) {
        PeerJNI.zrtc_peer_hold_audio(this.f90165a, z11, z12);
    }

    /* renamed from: u0 */
    public boolean m94374u0(C17848g c17848g, String str) {
        return PeerJNI.zrtc_peer_update_caller_info(this.f90165a, c17848g.m94289b(), str);
    }

    /* renamed from: v */
    public boolean m94375v(C17842a c17842a, C17848g c17848g, String str, String str2, String str3) {
        return PeerJNI.zrtc_peer_incoming_call(this.f90165a, c17842a.m94116b(), c17848g.m94289b(), AbstractC17861t.m94383a(str), AbstractC17861t.m94383a(str2), AbstractC17861t.m94383a(str3));
    }

    /* renamed from: v0 */
    public boolean m94376v0(String str) {
        return PeerJNI.zrtc_peer_update_caller_new_request(this.f90165a, str);
    }

    /* renamed from: w */
    public boolean m94377w(String str) {
        return PeerJNI.zrtc_peer_init_call(this.f90165a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: w0 */
    public boolean m94378w0(String str) {
        return PeerJNI.zrtc_peer_update_caller_ringring(this.f90165a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: x */
    public int m94379x() {
        return PeerJNI.zrtc_peer_hardware_encoder_support(this.f90165a);
    }

    /* renamed from: x0 */
    public boolean m94380x0(String str) {
        return PeerJNI.zrtc_peer_update_zrtc_config_in_call(this.f90165a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: y */
    public boolean m94381y() {
        return PeerJNI.zrtc_peer_is_in_call(this.f90165a);
    }

    /* renamed from: z */
    public boolean m94382z() {
        return PeerJNI.zrtc_peer_is_in_video_call(this.f90165a);
    }

    public C17850i() {
        this(PeerJNI.zrtc_peer_create(), true);
    }
}
