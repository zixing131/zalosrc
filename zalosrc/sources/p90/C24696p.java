package p90;

import android.content.Intent;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: p90.p */
/* loaded from: classes6.dex */
public final class C24696p {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final List f118654a;

    /* renamed from: p90.p$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24696p m128265a(Intent intent) {
            List list = null;
            byte b11 = 0;
            if (intent == null) {
                return null;
            }
            C24696p c24696p = new C24696p(list, 1, b11 == true ? 1 : 0);
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("SELECTED_LIST");
            if (parcelableArrayListExtra != null) {
                List m128264a = c24696p.m128264a();
                AbstractC19074t.m100205c(parcelableArrayListExtra);
                m128264a.addAll(parcelableArrayListExtra);
            }
            return c24696p;
        }
    }

    public C24696p(List list) {
        AbstractC19074t.m100208f(list, "selectedList");
        this.f118654a = list;
    }

    /* renamed from: a */
    public final List m128264a() {
        return this.f118654a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24696p) && AbstractC19074t.m100204b(this.f118654a, ((C24696p) obj).f118654a);
    }

    public int hashCode() {
        return this.f118654a.hashCode();
    }

    public String toString() {
        return "MyCloudPickerActivityResult(selectedList=" + this.f118654a + ")";
    }

    public /* synthetic */ C24696p(List list, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }
}
