package com.vng.zing.vn.zrtc.livestream;

/* loaded from: classes3.dex */
public class ZlsViewerJni {
    public static final native long zls_viewer_create();

    public static final native void zls_viewer_delete(long j11);

    public static final native void zls_viewer_register_cb(long j11, Object obj);

    public static final native int zls_viewer_set_app_context(long j11, Object obj);

    public static final native int zls_viewer_set_egl_context(long j11, Object obj);

    public static final native void zls_viewer_set_log_level(long j11, int i11);

    public static final native void zls_viewer_set_render_wnd(long j11, Object obj);

    public static final native int zls_viewer_start(long j11, String str);

    public static final native void zls_viewer_stop(long j11);
}
