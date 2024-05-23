package p423pi;

import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: pi.d */
/* loaded from: classes3.dex */
public final class C24762d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f118933a;

    /* renamed from: b */
    private int f118934b;

    /* renamed from: c */
    private int f118935c;

    /* renamed from: d */
    private int f118936d;

    /* renamed from: pi.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24762d m128714a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return new C24762d();
            }
            try {
                int i11 = 0;
                int optInt = jSONObject.optInt("enable", 0);
                int i12 = 12;
                int optInt2 = jSONObject.optInt("msgType", 12);
                if (optInt2 >= 0) {
                    i12 = optInt2;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("minMsgSize");
                if (optJSONObject != null) {
                    i11 = optJSONObject.optInt("video", 0);
                }
                int i13 = 30;
                if (optJSONObject != null) {
                    i13 = optJSONObject.optInt("file", 30);
                }
                return new C24762d(optInt, i12, i11, i13);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SyncActionMediaConfig", e11);
                return new C24762d();
            }
        }
    }

    public C24762d() {
        this.f118934b = 12;
        this.f118936d = 30;
    }

    /* renamed from: a */
    public final boolean m128710a(C17945a0 c17945a0) {
        boolean z11;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        boolean z12 = true;
        if ((this.f118934b & 1) == 1) {
            z11 = c17945a0.m95316z8();
        } else {
            z11 = false;
        }
        if ((this.f118934b & 2) == 2) {
            if (!z11 && !c17945a0.m94871D7() && !c17945a0.m95120e6()) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if ((this.f118934b & 4) == 4) {
            if (!z11 && !c17945a0.m95306y8()) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if ((this.f118934b & 8) == 8) {
            if (!z11 && !c17945a0.m95276v6()) {
                z12 = false;
            }
            return z12;
        }
        return z11;
    }

    /* renamed from: b */
    public final int m128711b() {
        return this.f118933a;
    }

    /* renamed from: c */
    public final int m128712c() {
        return this.f118936d;
    }

    /* renamed from: d */
    public final int m128713d() {
        return this.f118935c;
    }

    public C24762d(int i11, int i12, int i13, int i14) {
        this.f118933a = i11;
        this.f118934b = i12;
        this.f118935c = i13;
        this.f118936d = i14;
    }
}
