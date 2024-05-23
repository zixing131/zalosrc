package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class th3 implements mr3 {

    /* renamed from: a */
    private final String f28339a;

    /* renamed from: b */
    private final int f28340b;

    /* renamed from: c */
    private om3 f28341c;

    /* renamed from: d */
    private pl3 f28342d;

    /* renamed from: e */
    private int f28343e;

    /* renamed from: f */
    private an3 f28344f;

    public th3(pp3 pp3Var) {
        String m25511J = pp3Var.m25511J();
        this.f28339a = m25511J;
        if (m25511J.equals(gf3.f20574b)) {
            try {
                rm3 m26132I = rm3.m26132I(pp3Var.m25510I(), gu3.m22615a());
                this.f28341c = (om3) df3.m21370d(pp3Var);
                this.f28340b = m26132I.m26134F();
                return;
            } catch (zzgrq e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e11);
            }
        }
        if (m25511J.equals(gf3.f20573a)) {
            try {
                sl3 m26353H = sl3.m26353H(pp3Var.m25510I(), gu3.m22615a());
                this.f28342d = (pl3) df3.m21370d(pp3Var);
                this.f28343e = m26353H.m26356I().m28239F();
                this.f28340b = this.f28343e + m26353H.m26357J().m25500F();
                return;
            } catch (zzgrq e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        }
        if (m25511J.equals(dh3.f19246a)) {
            try {
                dn3 m21509I = dn3.m21509I(pp3Var.m25510I(), gu3.m22615a());
                this.f28344f = (an3) df3.m21370d(pp3Var);
                this.f28340b = m21509I.m21511F();
                return;
            } catch (zzgrq e13) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e13);
            }
        }
        throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(m25511J)));
    }

    @Override // com.google.android.gms.internal.ads.mr3
    /* renamed from: b */
    public final qi3 mo24701b(byte[] bArr) {
        if (bArr.length == this.f28340b) {
            if (this.f28339a.equals(gf3.f20574b)) {
                nm3 m25216G = om3.m25216G();
                m25216G.m25896l(this.f28341c);
                m25216G.m24961q(mt3.m24727J(bArr, 0, this.f28340b));
                return new qi3((pd3) df3.m21374h(this.f28339a, (om3) m25216G.m25898n(), pd3.class));
            }
            if (this.f28339a.equals(gf3.f20573a)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f28343e);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f28343e, this.f28340b);
                ul3 m27293G = vl3.m27293G();
                m27293G.m25896l(this.f28342d.m25486J());
                m27293G.m26984q(mt3.m24726I(copyOfRange));
                vl3 vl3Var = (vl3) m27293G.m25898n();
                ko3 m24654G = mo3.m24654G();
                m24654G.m25896l(this.f28342d.m25487K());
                m24654G.m23985q(mt3.m24726I(copyOfRange2));
                mo3 mo3Var = (mo3) m24654G.m25898n();
                ol3 m25479G = pl3.m25479G();
                m25479G.m25210s(this.f28342d.m25485F());
                m25479G.m25208q(vl3Var);
                m25479G.m25209r(mo3Var);
                return new qi3((pd3) df3.m21374h(this.f28339a, (pl3) m25479G.m25898n(), pd3.class));
            }
            if (this.f28339a.equals(dh3.f19246a)) {
                zm3 m20187G = an3.m20187G();
                m20187G.m25896l(this.f28344f);
                m20187G.m28550q(mt3.m24727J(bArr, 0, this.f28340b));
                return new qi3((vd3) df3.m21374h(this.f28339a, (an3) m20187G.m25898n(), vd3.class));
            }
            throw new GeneralSecurityException("unknown DEM key type");
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }

    @Override // com.google.android.gms.internal.ads.mr3
    public final int zza() {
        return this.f28340b;
    }
}
