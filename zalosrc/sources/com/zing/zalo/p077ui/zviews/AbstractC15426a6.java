package com.zing.zalo.p077ui.zviews;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: com.zing.zalo.ui.zviews.a6 */
/* loaded from: classes6.dex */
public abstract class AbstractC15426a6 {

    /* renamed from: com.zing.zalo.ui.zviews.a6$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC15426a6 {

        /* renamed from: a */
        private final int f79781a;

        /* renamed from: b */
        private final int f79782b;

        /* renamed from: c */
        private final JSONObject f79783c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, int i12, JSONObject jSONObject) {
            super(null);
            AbstractC19074t.m100208f(jSONObject, "zinstantApiInfo");
            this.f79781a = i11;
            this.f79782b = i12;
            this.f79783c = jSONObject;
        }

        /* renamed from: a */
        public final int m87257a() {
            return this.f79782b;
        }

        /* renamed from: b */
        public final int m87258b() {
            return this.f79781a;
        }

        /* renamed from: c */
        public final JSONObject m87259c() {
            return this.f79783c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f79781a == aVar.f79781a && this.f79782b == aVar.f79782b && AbstractC19074t.m100204b(this.f79783c, aVar.f79783c);
        }

        public int hashCode() {
            return (((this.f79781a * 31) + this.f79782b) * 31) + this.f79783c.hashCode();
        }

        public String toString() {
            return "Data(position=" + this.f79781a + ", maxOaItem=" + this.f79782b + ", zinstantApiInfo=" + this.f79783c + ")";
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.a6$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC15426a6 {

        /* renamed from: a */
        public static final b f79784a = new b();

        private b() {
            super(null);
        }
    }

    private AbstractC15426a6() {
    }

    public /* synthetic */ AbstractC15426a6(AbstractC19060k abstractC19060k) {
        this();
    }
}
