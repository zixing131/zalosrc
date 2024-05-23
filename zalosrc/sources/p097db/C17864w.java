package p097db;

import android.os.Build;
import org.json.JSONObject;
import org.webrtc.EglRenderer;
import org.webrtc.videofilter.ZVideoFilter;

/* renamed from: db.w */
/* loaded from: classes3.dex */
public class C17864w implements ZVideoFilter {

    /* renamed from: a */
    private final float f90298a = 1.07f;

    /* renamed from: b */
    private final float f90299b = 0.5f;

    /* renamed from: c */
    private final float f90300c = 1.5f;

    /* renamed from: d */
    private ZVideoFilter.StatusCode f90301d = ZVideoFilter.StatusCode.UNKNOWN;

    /* renamed from: e */
    private int f90302e = AbstractC17845d.m94221a();

    /* renamed from: f */
    private float f90303f = 1.07f;

    /* renamed from: g */
    private EglRenderer f90304g;

    /* renamed from: a */
    private ZVideoFilter.SupportType m94386a(int i11) {
        ZVideoFilter.SupportType forInt;
        if (i11 != 1 && i11 != 2) {
            return ZVideoFilter.SupportType.NO;
        }
        if (i11 == 2 && (forInt = ZVideoFilter.SupportType.forInt(AbstractC17849h.m94294c())) != ZVideoFilter.SupportType.YES) {
            return forInt;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return ZVideoFilter.SupportType.YES;
        }
        return ZVideoFilter.SupportType.NO;
    }

    @Override // org.webrtc.videofilter.ZVideoFilter
    public ZVideoFilter.StatusCode applyConfig(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f90302e = jSONObject.optInt("enable", 2);
            this.f90303f = (float) jSONObject.optDouble("ev", 1.0700000524520874d);
        }
        if (!AbstractC17845d.m94222b(this.f90302e)) {
            this.f90302e = AbstractC17845d.m94221a();
        }
        float f11 = this.f90303f;
        if (f11 < 0.5f || f11 > 1.5f) {
            this.f90303f = 1.07f;
        }
        ZVideoFilter.SupportType m94386a = m94386a(this.f90302e);
        if (m94386a == ZVideoFilter.SupportType.NO) {
            this.f90301d = ZVideoFilter.StatusCode.NOT_SUPPORT;
        } else if (m94386a == ZVideoFilter.SupportType.UNKNOWN) {
            if (this.f90301d != ZVideoFilter.StatusCode.ON) {
                this.f90301d = ZVideoFilter.StatusCode.UNKNOWN;
            }
        } else {
            ZVideoFilter.StatusCode statusCode = this.f90301d;
            if (statusCode == ZVideoFilter.StatusCode.UNKNOWN || statusCode == ZVideoFilter.StatusCode.NOT_SUPPORT) {
                this.f90301d = ZVideoFilter.StatusCode.OFF;
            }
        }
        return this.f90301d;
    }

    @Override // org.webrtc.videofilter.ZVideoFilter
    public boolean applyFilter(int i11, int i12, int i13, float[] fArr, int i14, long j11) {
        return false;
    }

    @Override // org.webrtc.videofilter.ZVideoFilter
    public final ZVideoFilter.FilterType filterType() {
        if (this.f90301d == ZVideoFilter.StatusCode.ON) {
            return ZVideoFilter.FilterType.NATIVE;
        }
        return ZVideoFilter.FilterType.NONE;
    }

    @Override // org.webrtc.videofilter.ZVideoFilter
    public float getExposureValue() {
        return this.f90303f;
    }

    @Override // org.webrtc.videofilter.ZVideoFilter
    public ZVideoFilter.StatusCode getStatus() {
        return this.f90301d;
    }

    @Override // org.webrtc.videofilter.ZVideoFilter
    public void regisRenderer(EglRenderer eglRenderer) {
        this.f90304g = eglRenderer;
    }

    @Override // org.webrtc.videofilter.ZVideoFilter
    public void resetState() {
        this.f90301d = ZVideoFilter.StatusCode.UNKNOWN;
        this.f90302e = AbstractC17845d.m94221a();
        this.f90303f = 1.07f;
    }

    @Override // org.webrtc.videofilter.ZVideoFilter
    public boolean start() {
        ZVideoFilter.StatusCode statusCode = this.f90301d;
        if (statusCode != ZVideoFilter.StatusCode.NOT_SUPPORT && statusCode != ZVideoFilter.StatusCode.UNKNOWN) {
            this.f90301d = ZVideoFilter.StatusCode.ON;
            C17843b.m94137o().m94142E(true, 1);
            return true;
        }
        return false;
    }

    @Override // org.webrtc.videofilter.ZVideoFilter
    public boolean stop() {
        ZVideoFilter.StatusCode statusCode = this.f90301d;
        if (statusCode == ZVideoFilter.StatusCode.NOT_SUPPORT || statusCode == ZVideoFilter.StatusCode.UNKNOWN) {
            return false;
        }
        C17843b.m94137o().m94142E(false, 1);
        this.f90301d = ZVideoFilter.StatusCode.OFF;
        return true;
    }

    @Override // org.webrtc.videofilter.ZVideoFilter
    public boolean applyFilter(byte[] bArr, int i11, int i12, int i13, long j11) {
        if (this.f90304g == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean renderFrameNV21 = this.f90304g.renderFrameNV21(bArr, i11, i12, i13, j11);
        ZVideoFilter.Stat.preRenderTime.addValue((int) (System.currentTimeMillis() - currentTimeMillis));
        return renderFrameNV21;
    }
}
