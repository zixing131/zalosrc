package com.vng.zing.vn.zrtc;

/* loaded from: classes3.dex */
public class GroupCallPeerJNI {
    public static final native int group_call_get_endcall_quality_status(long j11);

    public static final native void group_call_peer_add_remote_render_wnd(long j11, int i11, Object obj);

    public static final native int group_call_peer_answer_meeting(long j11, String str);

    public static final native void group_call_peer_attach_devices(long j11);

    public static final native void group_call_peer_change_to_confirmed_meeting(long j11);

    public static final native long group_call_peer_create();

    public static final native void group_call_peer_delete(long j11);

    public static final native void group_call_peer_force_stop(long j11);

    public static final native String group_call_peer_get_call_info(long j11);

    public static final native String group_call_peer_get_json_stats406(long j11, String str);

    public static final native int group_call_peer_incoming_meeting(long j11, int i11, String str, String str2);

    public static final native int group_call_peer_init_meeting(long j11, String str);

    public static final native boolean group_call_peer_is_in_call(long j11);

    public static final native void group_call_peer_join_with_camera(long j11, boolean z11);

    public static final native boolean group_call_peer_kick_partner(long j11, int i11);

    public static final native boolean group_call_peer_leave_meeting(long j11, boolean z11);

    public static final native int group_call_peer_make_meeting(long j11, int i11, String str, String str2);

    public static final native void group_call_peer_mute_audio(long j11, boolean z11);

    public static final native void group_call_peer_mute_partner_audio(long j11, int i11, boolean z11);

    public static final native void group_call_peer_notify_partner_recording_state_changed(long j11, int i11, int i12);

    public static final native void group_call_peer_notify_partner_video_capture_state_changed(long j11, int i11, int i12);

    public static final native void group_call_peer_on_byte_buffer_frame_captured(long j11, byte[] bArr, int i11, int i12, int i13, int i14, long j12);

    public static final native void group_call_peer_on_switch_camera_done(long j11, boolean z11);

    public static final native void group_call_peer_on_texture_frame_captured(long j11, int i11, int i12, int i13, float[] fArr, int i14, long j12);

    public static final native void group_call_peer_register_callback(long j11, GroupCallback groupCallback);

    public static final native void group_call_peer_request_video_quality(long j11, int i11, int i12);

    public static final native boolean group_call_peer_restart_audio_device(long j11);

    public static final native void group_call_peer_restart_video_capture(long j11);

    public static final native int group_call_peer_set_app_context(long j11, Object obj);

    public static final native int group_call_peer_set_egl_context(long j11, Object obj);

    public static final native void group_call_peer_set_local_render_wnd(long j11, Object obj);

    public static final native void group_call_peer_set_log_file(long j11, String str, String str2, int i11);

    public static final native void group_call_peer_set_log_level(long j11, int i11);

    public static final native void group_call_peer_set_primary_peer(long j11, boolean z11);

    public static final native void group_call_peer_set_speaker_on(long j11, boolean z11);

    public static final native boolean group_call_peer_start_stop_audio_device(long j11, boolean z11);

    public static final native boolean group_call_peer_start_stop_video_capture(long j11, boolean z11);

    public static final native void group_call_peer_switch_audio_device_layer(long j11);

    public static final native void group_call_peer_switch_camera(long j11);

    public static final native void group_call_peer_update_list_partner_from_client(long j11, String str);

    public static final native boolean group_call_peer_update_server_config(long j11, String str);
}
