package rd0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import od0.EnumC24233k;

/* renamed from: rd0.r */
/* loaded from: classes4.dex */
public abstract class AbstractC25752r {

    /* renamed from: rd0.r$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC25752r {

        /* renamed from: a */
        private final C20096c f122911a;

        /* renamed from: b */
        private final EnumC24233k f122912b;

        /* renamed from: c */
        private final int f122913c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C20096c c20096c, EnumC24233k enumC24233k, int i11) {
            super(null);
            AbstractC19074t.m100208f(enumC24233k, "uploadMethod");
            this.f122911a = c20096c;
            this.f122912b = enumC24233k;
            this.f122913c = i11;
        }

        /* renamed from: a */
        public final C20096c m132886a() {
            return this.f122911a;
        }

        /* renamed from: b */
        public final EnumC24233k m132887b() {
            return this.f122912b;
        }

        public /* synthetic */ a(C20096c c20096c, EnumC24233k enumC24233k, int i11, int i12, AbstractC19060k abstractC19060k) {
            this(c20096c, (i12 & 2) != 0 ? EnumC24233k.f117063q : enumC24233k, (i12 & 4) != 0 ? EnumC24233k.f117063q.m126539c() : i11);
        }
    }

    /* renamed from: rd0.r$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC25752r {

        /* renamed from: a */
        private final AbstractC25751q f122914a;

        /* renamed from: b */
        private final EnumC24233k f122915b;

        /* renamed from: c */
        private final int f122916c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC25751q abstractC25751q, EnumC24233k enumC24233k, int i11) {
            super(null);
            AbstractC19074t.m100208f(abstractC25751q, "uploadResponse");
            AbstractC19074t.m100208f(enumC24233k, "uploadMethod");
            this.f122914a = abstractC25751q;
            this.f122915b = enumC24233k;
            this.f122916c = i11;
        }

        /* renamed from: a */
        public final EnumC24233k m132888a() {
            return this.f122915b;
        }

        /* renamed from: b */
        public final AbstractC25751q m132889b() {
            return this.f122914a;
        }
    }

    private AbstractC25752r() {
    }

    public /* synthetic */ AbstractC25752r(AbstractC19060k abstractC19060k) {
        this();
    }
}
