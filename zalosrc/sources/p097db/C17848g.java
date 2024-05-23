package p097db;

import com.vng.zing.vn.zrtc.PeerJNI;

/* renamed from: db.g */
/* loaded from: classes3.dex */
public class C17848g {

    /* renamed from: a */
    private long f90162a;

    /* renamed from: b */
    protected boolean f90163b;

    protected C17848g(long j11, boolean z11) {
        this.f90163b = z11;
        this.f90162a = j11;
    }

    /* renamed from: a */
    protected void m94288a() {
        long j11 = this.f90162a;
        if (j11 != 0) {
            if (this.f90163b) {
                this.f90163b = false;
                PeerJNI.zrtc_media_codec_info_delete(j11);
            }
            this.f90162a = 0L;
        }
    }

    /* renamed from: b */
    public long m94289b() {
        return this.f90162a;
    }

    /* renamed from: c */
    public void m94290c(String str) {
        PeerJNI.zrtc_media_codec_info_set_audio_partner_codec(this.f90162a, AbstractC17861t.m94383a(str));
    }

    /* renamed from: d */
    public void m94291d(String str) {
        PeerJNI.zrtc_media_codec_info_set_extend_data(this.f90162a, AbstractC17861t.m94383a(str));
    }

    public synchronized void finalize() {
        m94288a();
    }

    public C17848g() {
        this(PeerJNI.zrtc_media_codec_info_create(), true);
    }
}
