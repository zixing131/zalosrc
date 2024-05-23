package com.vng.zing.vn.zrtc.livestream;

/* loaded from: classes3.dex */
public class PeerLiveJNI {
    public static final native void zrtc_config_set_buffer_location(long j11, String str);

    public static final native void zrtc_config_set_settings(long j11, String str, String str2, String str3);

    public static final native void zrtc_forceStop(long j11);

    public static final native int zrtc_init(long j11);

    public static final native void zrtc_pause(long j11);

    public static final native void zrtc_peer_close_camera(long j11);

    public static final native long zrtc_peer_create();

    public static final native void zrtc_peer_delete(long j11);

    public static final native String zrtc_peer_get_stats(long j11, String str);

    public static final native boolean zrtc_peer_is_in_live_stream(long j11);

    public static final native void zrtc_peer_on_byte_buffer_frame_captured(long j11, byte[] bArr, int i11, int i12, int i13, int i14, long j12);

    public static final native void zrtc_peer_on_switch_camera_done(long j11, boolean z11);

    public static final native void zrtc_peer_on_texture_frame_captured(long j11, int i11, int i12, int i13, float[] fArr, int i14, long j12);

    public static final native void zrtc_peer_open_camera(long j11);

    public static final native void zrtc_peer_register_callback(long j11, Object obj);

    public static final native void zrtc_peer_restart_camera(long j11);

    public static final native int zrtc_peer_set_app_context(long j11, Object obj);

    public static final native int zrtc_peer_set_egl_context(long j11, Object obj);

    public static final native void zrtc_peer_set_local_render_wnd(long j11, Object obj);

    public static final native void zrtc_peer_set_log_level(long j11, int i11);

    public static final native void zrtc_peer_set_pause_thumb(long j11, int i11, int i12, byte[] bArr, int i13);

    public static final native void zrtc_peer_switch_camera(long j11);

    public static final native void zrtc_resume(long j11);

    public static final native int zrtc_start(long j11);

    public static final native void zrtc_stop(long j11);
}
