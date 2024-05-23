package mg0;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: mg0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC23291c {

    /* renamed from: a */
    private final int f113050a;

    /* renamed from: mg0.c$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC23291c {

        /* renamed from: b */
        private final int f113051b;

        /* renamed from: c */
        private final String f113052c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, String str) {
            super(i11, null);
            AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f113051b = i11;
            this.f113052c = str;
        }

        @Override // mg0.AbstractC23291c
        /* renamed from: a */
        public int mo120404a() {
            return this.f113051b;
        }

        /* renamed from: b */
        public final String m120405b() {
            return this.f113052c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f113051b == aVar.f113051b && AbstractC19074t.m100204b(this.f113052c, aVar.f113052c);
        }

        public int hashCode() {
            return (this.f113051b * 31) + this.f113052c.hashCode();
        }

        public String toString() {
            return "Error(progress=" + this.f113051b + ", type=" + this.f113052c + ")";
        }
    }

    /* renamed from: mg0.c$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC23291c {

        /* renamed from: b */
        public static final b f113053b = new b();

        private b() {
            super(0, null);
        }

        public String toString() {
            return "State: None";
        }
    }

    /* renamed from: mg0.c$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC23291c {

        /* renamed from: b */
        private final int f113054b;

        public c(int i11) {
            super(i11, null);
            this.f113054b = i11;
        }

        @Override // mg0.AbstractC23291c
        /* renamed from: a */
        public int mo120404a() {
            return this.f113054b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f113054b == ((c) obj).f113054b;
        }

        public int hashCode() {
            return this.f113054b;
        }

        public String toString() {
            return "Progressing(progress=" + this.f113054b + ")";
        }
    }

    /* renamed from: mg0.c$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC23291c {

        /* renamed from: b */
        public static final d f113055b = new d();

        private d() {
            super(100, null);
        }

        public String toString() {
            return "State: Success";
        }
    }

    public /* synthetic */ AbstractC23291c(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public int mo120404a() {
        return this.f113050a;
    }

    private AbstractC23291c(int i11) {
        this.f113050a = i11;
    }
}
