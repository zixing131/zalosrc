package com.vng.zing.vn.zrtc;

/* loaded from: classes3.dex */
public class PeerJNI {
    public static final native long zrtc_call_config_create();

    public static final native void zrtc_call_config_delete(long j11);

    public static final native void zrtc_call_config_set_app_demo(long j11, boolean z11);

    public static final native void zrtc_call_config_set_client_version(long j11, int i11);

    public static final native void zrtc_call_config_set_config_json(long j11, String str);

    public static final native void zrtc_call_config_set_enable_change_ZRTP(long j11, boolean z11);

    public static final native void zrtc_call_config_set_extra_info(long j11, String str);

    public static final native void zrtc_call_config_set_fec_type(long j11, int i11);

    public static final native void zrtc_call_config_set_log_stat_filename(long j11, String str);

    public static final native void zrtc_call_config_set_loopback_mode(long j11, int i11);

    public static final native void zrtc_call_config_set_os_info(long j11, String str);

    public static final native void zrtc_call_config_set_partner_id(long j11, int i11);

    public static final native void zrtc_call_config_set_permission_start_camera(long j11, boolean z11);

    public static final native void zrtc_call_config_set_protocol(long j11, int i11);

    public static final native void zrtc_call_config_set_protocol_type(long j11, int i11);

    public static final native void zrtc_call_config_set_session(long j11, String str);

    public static final native void zrtc_call_config_set_spectrum_file_path(long j11, String[] strArr);

    public static final native void zrtc_call_config_set_support_video_call(long j11, boolean z11);

    public static final native void zrtc_call_config_set_user_id(long j11, int i11);

    public static final native void zrtc_call_config_set_video_call(long j11, boolean z11);

    public static final native void zrtc_call_config_set_zalo_call_id(long j11, int i11);

    public static final native void zrtc_call_config_set_zrtc_config_json(long j11, String str);

    public static final native void zrtc_call_config_set_zrtc_packet_output_file(long j11, String str);

    public static final native long zrtc_media_codec_info_create();

    public static final native void zrtc_media_codec_info_delete(long j11);

    public static final native void zrtc_media_codec_info_set_audio_partner_codec(long j11, String str);

    public static final native void zrtc_media_codec_info_set_extend_data(long j11, String str);

    public static final native void zrtc_peer_add_render_wnd(long j11, int i11, Object obj);

    public static final native void zrtc_peer_call_change_ZRTP(long j11, String str, String[] strArr, String[] strArr2);

    public static final native boolean zrtc_peer_check_cache_valid(long j11, int i11, int i12);

    public static final native long zrtc_peer_create();

    public static final native void zrtc_peer_delete(long j11);

    public static final native void zrtc_peer_enable_low_data_mode(long j11, boolean z11, String str);

    public static final native void zrtc_peer_end_call(long j11, boolean z11);

    public static final native void zrtc_peer_force_stop(long j11);

    public static final native String zrtc_peer_get_active_audio_codecs(long j11);

    public static final native int zrtc_peer_get_aec_external(long j11);

    public static final native int zrtc_peer_get_aec_internal(long j11);

    public static final native int zrtc_peer_get_agc_mic_level(long j11);

    public static final native int zrtc_peer_get_agc_play_level(long j11);

    public static final native int zrtc_peer_get_auto_hangup_process_time(long j11);

    public static final native String zrtc_peer_get_call_info(long j11);

    public static final native String zrtc_peer_get_client_cache_info(long j11, int i11, int i12);

    public static final native int zrtc_peer_get_end_call_state(long j11);

    public static final native String zrtc_peer_get_extend_data(long j11);

    public static final native String zrtc_peer_get_extend_data_ringring(long j11);

    public static final native String zrtc_peer_get_json_stats406(long j11, int i11, int i12);

    public static final native String zrtc_peer_get_json_stats406(long j11, int i11, int i12, String str);

    public static final native int zrtc_peer_get_loading_time_bad_connection(long j11);

    public static final native String zrtc_peer_get_native_trace_data(long j11);

    public static final native int zrtc_peer_get_ns_level(long j11);

    public static final native boolean zrtc_peer_get_spectrum_files(long j11, String[] strArr);

    public static final native int zrtc_peer_hardware_encoder_support(long j11);

    public static final native void zrtc_peer_hold_audio(long j11, boolean z11, boolean z12);

    public static final native boolean zrtc_peer_incoming_call(long j11, long j12, long j13, String str, String str2, String str3);

    public static final native boolean zrtc_peer_init_call(long j11, String str);

    public static final native boolean zrtc_peer_is_in_call(long j11);

    public static final native boolean zrtc_peer_is_in_video_call(long j11);

    public static final native boolean zrtc_peer_is_record_network_data(long j11);

    public static final native boolean zrtc_peer_make_call(long j11, long j12, String str);

    public static final native void zrtc_peer_mute_audio(long j11, boolean z11);

    public static final native void zrtc_peer_network_change(long j11, boolean z11);

    public static final native void zrtc_peer_on_app_state_change(long j11, int i11);

    public static final native void zrtc_peer_on_byte_buffer_frame_applied_filter(long j11, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, long j12);

    public static final native void zrtc_peer_on_byte_buffer_frame_captured(long j11, byte[] bArr, int i11, int i12, int i13, int i14, long j12);

    public static final native void zrtc_peer_on_switch_camera_done(long j11, boolean z11);

    public static final native void zrtc_peer_on_texture_frame_captured(long j11, int i11, int i12, int i13, float[] fArr, int i14, long j12, int i15);

    public static final native void zrtc_peer_on_video_filter_change(long j11, boolean z11, int i11);

    public static final native void zrtc_peer_play_dtmf(long j11, int i11);

    public static final native void zrtc_peer_pre_incoming(long j11, int i11, int i12, String str);

    public static final native void zrtc_peer_receive_answer_preconnect(long j11, int i11, int i12, String str);

    public static final native void zrtc_peer_receive_call_event(long j11, int i11);

    public static final native void zrtc_peer_receive_incoming_preconnect(long j11, int i11, int i12, String str);

    public static final native void zrtc_peer_receive_msg_preconnect(long j11, int i11, String str);

    public static final native boolean zrtc_peer_receive_partner_forward_data(long j11, String str);

    public static final native void zrtc_peer_record_audio_from_file(long j11, boolean z11, String str);

    public static final native void zrtc_peer_register_callback(long j11, CallCallback callCallback);

    public static final native boolean zrtc_peer_reinit_audio_device(long j11);

    public static final native void zrtc_peer_restart_capture(long j11);

    public static final native boolean zrtc_peer_save_last_capture_frame(long j11, String str);

    public static final native boolean zrtc_peer_save_last_render_frame(long j11, String str);

    public static final native void zrtc_peer_set_aec_external(long j11, int i11);

    public static final native void zrtc_peer_set_aec_internal(long j11, int i11);

    public static final native void zrtc_peer_set_agc_mic_level(long j11, int i11);

    public static final native void zrtc_peer_set_agc_play_level(long j11, int i11);

    public static final native int zrtc_peer_set_app_context(long j11, Object obj);

    public static final native void zrtc_peer_set_call_state(long j11, int i11);

    public static final native void zrtc_peer_set_dev_config(long j11, String str);

    public static final native int zrtc_peer_set_egl_context(long j11, Object obj);

    public static final native void zrtc_peer_set_last_frame_into_view(long j11);

    public static final native void zrtc_peer_set_local_render_wnd(long j11, Object obj);

    public static final native void zrtc_peer_set_log_file(long j11, String str, String str2, int i11);

    public static final native void zrtc_peer_set_log_level(long j11, int i11);

    public static final native void zrtc_peer_set_ns_level(long j11, int i11);

    public static final native void zrtc_peer_set_partner_off_camera(long j11, int i11, int i12);

    public static final native void zrtc_peer_set_speaker_on(long j11, boolean z11);

    public static final native void zrtc_peer_start_record_audio(long j11, boolean z11, String str);

    public static final native void zrtc_peer_stop_capture(long j11, boolean z11, int i11);

    public static final native void zrtc_peer_switch_audio_device_layer(long j11);

    public static final native void zrtc_peer_switch_camera(long j11);

    public static final native int zrtc_peer_switch_to_video_call(long j11, boolean z11, String str);

    public static final native int zrtc_peer_switch_to_video_call_answer(long j11, boolean z11);

    public static final native void zrtc_peer_test_reset_encoder(long j11, boolean z11);

    public static final native void zrtc_peer_toggle_current_server(long j11);

    public static final native boolean zrtc_peer_turn_off_encoder_h265(long j11, boolean z11);

    public static final native boolean zrtc_peer_update_callee_pre_ringing(long j11, String str);

    public static final native boolean zrtc_peer_update_caller_info(long j11, long j12, String str);

    public static final native boolean zrtc_peer_update_caller_new_request(long j11, String str);

    public static final native boolean zrtc_peer_update_caller_ringring(long j11, String str);

    public static final native boolean zrtc_peer_update_zrtc_config_in_call(long j11, String str);
}
