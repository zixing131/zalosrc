package com.zing.zalo.dialog;

import androidx.work.AbstractC2144f;
import bn.EnumC2882j0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.dialog.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7999c {

    /* renamed from: com.zing.zalo.dialog.c$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC7999c {

        /* renamed from: a */
        public static final a f43718a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: com.zing.zalo.dialog.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC7999c {

        /* renamed from: a */
        public static final b f43719a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: com.zing.zalo.dialog.c$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC7999c {

        /* renamed from: a */
        private final int f43720a;

        public c(int i11) {
            super(null);
            this.f43720a = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f43720a == ((c) obj).f43720a;
        }

        public int hashCode() {
            return this.f43720a;
        }

        public String toString() {
            return "Downloaded(totalFiles=" + this.f43720a + ")";
        }
    }

    /* renamed from: com.zing.zalo.dialog.c$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC7999c {

        /* renamed from: a */
        private final int f43721a;

        public d(int i11) {
            super(null);
            this.f43721a = i11;
        }

        /* renamed from: a */
        public final int m43065a() {
            return this.f43721a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f43721a == ((d) obj).f43721a;
        }

        public int hashCode() {
            return this.f43721a;
        }

        public String toString() {
            return "Downloading(progress=" + this.f43721a + ")";
        }
    }

    /* renamed from: com.zing.zalo.dialog.c$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC7999c {

        /* renamed from: a */
        private final EnumC2882j0 f43722a;

        /* renamed from: b */
        private final int f43723b;

        /* renamed from: c */
        private final int f43724c;

        /* renamed from: d */
        private final boolean f43725d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EnumC2882j0 enumC2882j0, int i11, int i12, boolean z11) {
            super(null);
            AbstractC19074t.m100208f(enumC2882j0, "failedType");
            this.f43722a = enumC2882j0;
            this.f43723b = i11;
            this.f43724c = i12;
            this.f43725d = z11;
        }

        /* renamed from: a */
        public final int m43066a() {
            return this.f43723b;
        }

        /* renamed from: b */
        public final EnumC2882j0 m43067b() {
            return this.f43722a;
        }

        /* renamed from: c */
        public final boolean m43068c() {
            return this.f43725d;
        }

        /* renamed from: d */
        public final int m43069d() {
            return this.f43724c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f43722a == eVar.f43722a && this.f43723b == eVar.f43723b && this.f43724c == eVar.f43724c && this.f43725d == eVar.f43725d;
        }

        public int hashCode() {
            return (((((this.f43722a.hashCode() * 31) + this.f43723b) * 31) + this.f43724c) * 31) + AbstractC2144f.m11520a(this.f43725d);
        }

        public String toString() {
            return "Failed(failedType=" + this.f43722a + ", failedFiles=" + this.f43723b + ", totalFiles=" + this.f43724c + ", sendMessages=" + this.f43725d + ")";
        }
    }

    private AbstractC7999c() {
    }

    public /* synthetic */ AbstractC7999c(AbstractC19060k abstractC19060k) {
        this();
    }
}
