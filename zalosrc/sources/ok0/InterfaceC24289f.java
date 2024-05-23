package ok0;

import org.json.JSONObject;

/* renamed from: ok0.f */
/* loaded from: classes.dex */
public interface InterfaceC24289f {

    /* renamed from: ok0.f$a */
    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a */
        public int f117273a;

        /* renamed from: b */
        public String f117274b;

        /* renamed from: c */
        public int f117275c = 0;

        /* renamed from: d */
        public int f117276d = 0;

        public a(int i11, String str) {
            this.f117273a = i11;
            this.f117274b = str;
        }

        /* renamed from: a */
        public void m126795a(int i11, int i12) {
            this.f117275c = i11;
            this.f117276d = i12;
        }

        public String toString() {
            return String.format("Params(%s, %s, %s, %s)", Integer.valueOf(this.f117273a), this.f117274b, Integer.valueOf(this.f117275c), Integer.valueOf(this.f117276d));
        }
    }

    /* renamed from: a */
    void mo107172a();

    /* renamed from: b */
    void mo107173b(a aVar, InterfaceC24288e interfaceC24288e);

    /* renamed from: c */
    void mo107174c(a aVar, InterfaceC24286c interfaceC24286c);

    /* renamed from: d */
    void mo107175d(String str, InterfaceC24288e interfaceC24288e, int i11, boolean z11, JSONObject jSONObject);

    /* renamed from: e */
    void mo107176e(String str, int i11, boolean z11, JSONObject jSONObject);
}
