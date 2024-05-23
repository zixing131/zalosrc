package com.zing.zalo.data.zalocloud.model.api;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import org.json.JSONObject;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class CloudKeyResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f43026a;

    /* renamed from: b */
    private final String f43027b;

    /* renamed from: c */
    private final String f43028c;

    /* renamed from: d */
    private final int f43029d;

    /* renamed from: e */
    private final int f43030e;

    /* renamed from: f */
    private final int f43031f;

    /* renamed from: g */
    private final int f43032g;

    /* renamed from: h */
    private final long f43033h;

    /* renamed from: i */
    private final long f43034i;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final CloudKeyResponse m41291a(int i11, String str) {
            JSONObject jSONObject;
            long optLong;
            int i12;
            AbstractC19074t.m100208f(str, "data");
            if (str.length() == 0) {
                return new CloudKeyResponse(-1, "", "", -1, i11, -1, -1, -1L, 0L, 256, (AbstractC19060k) null);
            }
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            int i13 = -1;
            if (i11 != -212) {
                if (i11 != -210) {
                    optLong = -1;
                } else {
                    i13 = jSONObject.optInt("max_attempts", -1);
                    i12 = jSONObject.optInt("attempt_left", -1);
                    optLong = -1;
                    return new CloudKeyResponse(-1, "", "", -1, i11, i13, i12, optLong, 0L, 256, (AbstractC19060k) null);
                }
            } else {
                i13 = jSONObject.optInt("max_attempts", -1);
                optLong = jSONObject.optLong("unlock_ts", -1L);
            }
            i12 = -1;
            return new CloudKeyResponse(-1, "", "", -1, i11, i13, i12, optLong, 0L, 256, (AbstractC19060k) null);
        }

        public final KSerializer serializer() {
            return CloudKeyResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CloudKeyResponse(int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16, long j11, long j12, AbstractC26805k1 abstractC26805k1) {
        if (15 != (i11 & 15)) {
            AbstractC26774a1.m137800b(i11, 15, CloudKeyResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f43026a = i12;
        this.f43027b = str;
        this.f43028c = str2;
        this.f43029d = i13;
        if ((i11 & 16) == 0) {
            this.f43030e = -1;
        } else {
            this.f43030e = i14;
        }
        if ((i11 & 32) == 0) {
            this.f43031f = -1;
        } else {
            this.f43031f = i15;
        }
        if ((i11 & 64) == 0) {
            this.f43032g = -1;
        } else {
            this.f43032g = i16;
        }
        if ((i11 & 128) == 0) {
            this.f43033h = -1L;
        } else {
            this.f43033h = j11;
        }
        if ((i11 & 256) == 0) {
            this.f43034i = 0L;
        } else {
            this.f43034i = j12;
        }
    }

    /* renamed from: n */
    public static final /* synthetic */ void m41277n(CloudKeyResponse cloudKeyResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, cloudKeyResponse.f43026a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, cloudKeyResponse.f43027b);
        interfaceC21886d.mo114035z(serialDescriptor, 2, cloudKeyResponse.f43028c);
        interfaceC21886d.mo114033x(serialDescriptor, 3, cloudKeyResponse.f43029d);
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || cloudKeyResponse.f43030e != -1) {
            interfaceC21886d.mo114033x(serialDescriptor, 4, cloudKeyResponse.f43030e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || cloudKeyResponse.f43031f != -1) {
            interfaceC21886d.mo114033x(serialDescriptor, 5, cloudKeyResponse.f43031f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || cloudKeyResponse.f43032g != -1) {
            interfaceC21886d.mo114033x(serialDescriptor, 6, cloudKeyResponse.f43032g);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || cloudKeyResponse.f43033h != -1) {
            interfaceC21886d.mo114022E(serialDescriptor, 7, cloudKeyResponse.f43033h);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || cloudKeyResponse.f43034i != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 8, cloudKeyResponse.f43034i);
        }
    }

    /* renamed from: a */
    public final int m41278a() {
        return this.f43032g;
    }

    /* renamed from: b */
    public final int m41279b() {
        return this.f43029d;
    }

    /* renamed from: c */
    public final String m41280c() {
        return this.f43028c;
    }

    /* renamed from: d */
    public final int m41281d() {
        return this.f43030e;
    }

    /* renamed from: e */
    public final int m41282e() {
        return this.f43026a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudKeyResponse)) {
            return false;
        }
        CloudKeyResponse cloudKeyResponse = (CloudKeyResponse) obj;
        return this.f43026a == cloudKeyResponse.f43026a && AbstractC19074t.m100204b(this.f43027b, cloudKeyResponse.f43027b) && AbstractC19074t.m100204b(this.f43028c, cloudKeyResponse.f43028c) && this.f43029d == cloudKeyResponse.f43029d && this.f43030e == cloudKeyResponse.f43030e && this.f43031f == cloudKeyResponse.f43031f && this.f43032g == cloudKeyResponse.f43032g && this.f43033h == cloudKeyResponse.f43033h && this.f43034i == cloudKeyResponse.f43034i;
    }

    /* renamed from: f */
    public final long m41283f() {
        return this.f43034i;
    }

    /* renamed from: g */
    public final int m41284g() {
        return this.f43031f;
    }

    /* renamed from: h */
    public final String m41285h() {
        return this.f43027b;
    }

    public int hashCode() {
        return (((((((((((((((this.f43026a * 31) + this.f43027b.hashCode()) * 31) + this.f43028c.hashCode()) * 31) + this.f43029d) * 31) + this.f43030e) * 31) + this.f43031f) * 31) + this.f43032g) * 31) + AbstractC2147g0.m11521a(this.f43033h)) * 31) + AbstractC2147g0.m11521a(this.f43034i);
    }

    /* renamed from: i */
    public final long m41286i() {
        return this.f43033h;
    }

    /* renamed from: j */
    public final boolean m41287j() {
        return this.f43030e != -1;
    }

    /* renamed from: k */
    public final boolean m41288k() {
        return this.f43030e == 50001;
    }

    /* renamed from: l */
    public final boolean m41289l() {
        int i11 = this.f43030e;
        return i11 == -209 || i11 == -210 || i11 == -212;
    }

    /* renamed from: m */
    public final boolean m41290m() {
        int i11;
        int i12 = this.f43032g;
        return i12 > 0 && (i11 = this.f43031f) > 0 && i11 - i12 > 1;
    }

    public String toString() {
        return "CloudKeyResponse(keyVersion=" + this.f43026a + ", publicKey=" + this.f43027b + ", encryptedPrivateKey=" + this.f43028c + ", encryptType=" + this.f43029d + ", errorCode=" + this.f43030e + ", maxAttempt=" + this.f43031f + ", attemptLeft=" + this.f43032g + ", unlockTS=" + this.f43033h + ", lastSubmit=" + this.f43034i + ")";
    }

    public CloudKeyResponse(int i11, String str, String str2, int i12, int i13, int i14, int i15, long j11, long j12) {
        AbstractC19074t.m100208f(str, "publicKey");
        AbstractC19074t.m100208f(str2, "encryptedPrivateKey");
        this.f43026a = i11;
        this.f43027b = str;
        this.f43028c = str2;
        this.f43029d = i12;
        this.f43030e = i13;
        this.f43031f = i14;
        this.f43032g = i15;
        this.f43033h = j11;
        this.f43034i = j12;
    }

    public /* synthetic */ CloudKeyResponse(int i11, String str, String str2, int i12, int i13, int i14, int i15, long j11, long j12, int i16, AbstractC19060k abstractC19060k) {
        this(i11, str, str2, i12, (i16 & 16) != 0 ? -1 : i13, (i16 & 32) != 0 ? -1 : i14, (i16 & 64) != 0 ? -1 : i15, (i16 & 128) != 0 ? -1L : j11, (i16 & 256) != 0 ? 0L : j12);
    }
}
