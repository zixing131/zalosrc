package p170fv;

import fn0.AbstractC19060k;
import org.json.JSONObject;

/* renamed from: fv.c */
/* loaded from: classes4.dex */
public final class C19149c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f95188a;

    /* renamed from: fv.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19149c m100493a(JSONObject jSONObject) {
            AbstractC19060k abstractC19060k = null;
            int i11 = 0;
            int i12 = 1;
            try {
                if (jSONObject == null) {
                    return new C19149c(i11, i12, abstractC19060k);
                }
                return new C19149c(jSONObject.optInt("bottombarType", 1));
            } catch (Exception e11) {
                e11.printStackTrace();
                return new C19149c(i11, i12, abstractC19060k);
            }
        }
    }

    public C19149c(int i11) {
        this.f95188a = i11;
    }

    /* renamed from: a */
    public final int m100492a() {
        return this.f95188a;
    }

    public /* synthetic */ C19149c(int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 1 : i11);
    }
}
