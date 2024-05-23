package com.zing.zalo.zinstant;

import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import lk0.C22504b;
import lk0.C22505c;
import lk0.InterfaceC22508f;
import org.json.JSONObject;

/* renamed from: com.zing.zalo.zinstant.x0 */
/* loaded from: classes7.dex */
public class C17244x0 {

    /* renamed from: a */
    private C22504b f87922a;

    /* renamed from: b */
    private C22505c f87923b;

    /* renamed from: c */
    private boolean f87924c;

    /* renamed from: com.zing.zalo.zinstant.x0$b */
    /* loaded from: classes7.dex */
    public interface b {
        /* renamed from: a */
        C22504b mo2748a(JSONObject jSONObject, int i11);

        /* renamed from: b */
        C22505c mo2749b(JSONObject jSONObject, int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zinstant.x0$c */
    /* loaded from: classes7.dex */
    public static class c implements b {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // com.zing.zalo.zinstant.C17244x0.b
        /* renamed from: a */
        public C22504b mo2748a(JSONObject jSONObject, int i11) {
            if (jSONObject == null || !jSONObject.has("zinstantdata")) {
                return null;
            }
            return new C22504b(i11, jSONObject.getJSONObject("zinstantdata"));
        }

        @Override // com.zing.zalo.zinstant.C17244x0.b
        /* renamed from: b */
        public C22505c mo2749b(JSONObject jSONObject, int i11) {
            if (jSONObject == null || !jSONObject.has(ZMediaPlayer.OnNativeInvokeListener.ARG_URL) || !jSONObject.has("zinstantdata_id")) {
                return null;
            }
            return new C22505c(i11, jSONObject);
        }
    }

    public C17244x0(int i11, JSONObject jSONObject, b bVar) {
        this.f87924c = false;
        bVar = bVar == null ? new c() : bVar;
        this.f87924c = false;
        this.f87922a = bVar.mo2748a(jSONObject, i11);
        C22505c mo2749b = bVar.mo2749b(jSONObject, i11);
        this.f87923b = mo2749b;
        if (this.f87922a == null && mo2749b == null) {
            throw new Exception("ZinstantAPIInfo is invalid");
        }
        this.f87924c = true;
    }

    /* renamed from: a */
    public static JSONObject m92063a(InterfaceC22508f interfaceC22508f) {
        try {
            if (interfaceC22508f instanceof C22505c) {
                return interfaceC22508f.mo116351a();
            }
            if (!(interfaceC22508f instanceof C22504b)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zinstantdata", interfaceC22508f.mo116351a());
            return jSONObject;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public InterfaceC22508f m92064b() {
        C22504b c22504b = this.f87922a;
        if (c22504b != null && c22504b.m116354d()) {
            return this.f87922a;
        }
        return this.f87923b;
    }

    /* renamed from: c */
    public boolean m92065c() {
        return this.f87924c;
    }

    /* renamed from: d */
    public JSONObject m92066d() {
        JSONObject jSONObject;
        C22505c c22505c = this.f87923b;
        if (c22505c != null) {
            jSONObject = c22505c.mo116351a();
        } else {
            jSONObject = null;
        }
        if (this.f87922a != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("zinstantdata", this.f87922a.mo116351a());
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17244x0)) {
            return false;
        }
        InterfaceC22508f m92064b = ((C17244x0) obj).m92064b();
        InterfaceC22508f m92064b2 = m92064b();
        if (m92064b2 == m92064b) {
            return true;
        }
        if (m92064b2 != null && m92064b2.equals(m92064b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC17201m.m91818j(this.f87922a, this.f87923b);
    }

    public C17244x0(int i11, JSONObject jSONObject) {
        this(i11, jSONObject, null);
    }
}
