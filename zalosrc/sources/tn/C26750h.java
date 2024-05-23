package tn;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.camera.videos.InterfaceC7761b;
import fn0.AbstractC19074t;
import kotlinx.coroutines.Job;

/* renamed from: tn.h */
/* loaded from: classes4.dex */
public final class C26750h {

    /* renamed from: a */
    private final InterfaceC7761b f126908a;

    /* renamed from: b */
    private long f126909b;

    /* renamed from: c */
    private final Job f126910c;

    public C26750h(InterfaceC7761b interfaceC7761b, long j11, Job job) {
        AbstractC19074t.m100208f(interfaceC7761b, "videoCompressTask");
        this.f126908a = interfaceC7761b;
        this.f126909b = j11;
        this.f126910c = job;
    }

    /* renamed from: a */
    public final Job m137690a() {
        return this.f126910c;
    }

    /* renamed from: b */
    public final long m137691b() {
        return this.f126909b;
    }

    /* renamed from: c */
    public final InterfaceC7761b m137692c() {
        return this.f126908a;
    }

    /* renamed from: d */
    public final void m137693d(long j11) {
        this.f126909b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26750h)) {
            return false;
        }
        C26750h c26750h = (C26750h) obj;
        return AbstractC19074t.m100204b(this.f126908a, c26750h.f126908a) && this.f126909b == c26750h.f126909b && AbstractC19074t.m100204b(this.f126910c, c26750h.f126910c);
    }

    public int hashCode() {
        int hashCode = ((this.f126908a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f126909b)) * 31;
        Job job = this.f126910c;
        return hashCode + (job == null ? 0 : job.hashCode());
    }

    public String toString() {
        return "DataTaskCompressVideo(videoCompressTask=" + this.f126908a + ", lastTimeReceiveUpdate=" + this.f126909b + ", jobCheckTimeout=" + this.f126910c + ")";
    }
}
