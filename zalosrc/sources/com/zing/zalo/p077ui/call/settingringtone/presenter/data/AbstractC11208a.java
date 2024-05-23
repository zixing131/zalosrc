package com.zing.zalo.p077ui.call.settingringtone.presenter.data;

import android.net.Uri;
import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.data.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11208a {
    public static final a Companion = new a(null);

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.data.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.data.a$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC11208a {

        /* renamed from: a */
        private final int f56363a;

        /* renamed from: b */
        private final String f56364b;

        /* renamed from: c */
        private final Uri f56365c;

        /* renamed from: d */
        private boolean f56366d;

        /* renamed from: e */
        private boolean f56367e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, String str, Uri uri, boolean z11, boolean z12) {
            super(null);
            AbstractC19074t.m100208f(str, "name");
            AbstractC19074t.m100208f(uri, "uri");
            this.f56363a = i11;
            this.f56364b = str;
            this.f56365c = uri;
            this.f56366d = z11;
            this.f56367e = z12;
        }

        /* renamed from: a */
        public final String m58745a() {
            return this.f56364b;
        }

        /* renamed from: b */
        public final int m58746b() {
            return this.f56363a;
        }

        /* renamed from: c */
        public final Uri m58747c() {
            return this.f56365c;
        }

        /* renamed from: d */
        public final boolean m58748d() {
            return this.f56366d;
        }

        /* renamed from: e */
        public final boolean m58749e() {
            return this.f56367e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f56363a == bVar.f56363a && AbstractC19074t.m100204b(this.f56364b, bVar.f56364b) && AbstractC19074t.m100204b(this.f56365c, bVar.f56365c) && this.f56366d == bVar.f56366d && this.f56367e == bVar.f56367e;
        }

        /* renamed from: f */
        public final void m58750f(boolean z11) {
            this.f56366d = z11;
        }

        /* renamed from: g */
        public final void m58751g(boolean z11) {
            this.f56367e = z11;
        }

        public int hashCode() {
            return (((((((this.f56363a * 31) + this.f56364b.hashCode()) * 31) + this.f56365c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f56366d)) * 31) + AbstractC2144f.m11520a(this.f56367e);
        }

        public String toString() {
            return "Data(type=" + this.f56363a + ", name=" + this.f56364b + ", uri=" + this.f56365c + ", isSelected=" + this.f56366d + ", isSelecting=" + this.f56367e + ")";
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.data.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC11208a {

        /* renamed from: a */
        public static final c f56368a = new c();

        private c() {
            super(null);
        }
    }

    private AbstractC11208a() {
    }

    public /* synthetic */ AbstractC11208a(AbstractC19060k abstractC19060k) {
        this();
    }
}
