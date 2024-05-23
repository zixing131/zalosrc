package zb0;

import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: zb0.e */
/* loaded from: classes6.dex */
public abstract class AbstractC31776e {

    /* renamed from: zb0.e$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC31776e {

        /* renamed from: a */
        public static final a f145909a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: zb0.e$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC31776e {

        /* renamed from: a */
        private final ZaloCloudRecoverCloudMediaWorker.AbstractC16884f f145910a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f) {
            super(null);
            AbstractC19074t.m100208f(abstractC16884f, "state");
            this.f145910a = abstractC16884f;
        }

        /* renamed from: a */
        public final ZaloCloudRecoverCloudMediaWorker.AbstractC16884f m152798a() {
            return this.f145910a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f145910a, ((b) obj).f145910a);
        }

        public int hashCode() {
            return this.f145910a.hashCode();
        }

        public String toString() {
            return "ShowFinishView(state=" + this.f145910a + ")";
        }
    }

    private AbstractC31776e() {
    }

    public /* synthetic */ AbstractC31776e(AbstractC19060k abstractC19060k) {
        this();
    }
}
