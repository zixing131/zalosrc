package i60;

import android.content.Intent;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: i60.k */
/* loaded from: classes5.dex */
public final class C20345k {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f100341a;

    /* renamed from: i60.k$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20345k m106075a(Intent intent) {
            if (intent != null) {
                return new C20345k(intent.getStringExtra("extra_group_id"));
            }
            return null;
        }
    }

    public C20345k(String str) {
        this.f100341a = str;
    }

    /* renamed from: a */
    public static final C20345k m106073a(Intent intent) {
        return Companion.m106075a(intent);
    }

    /* renamed from: b */
    public final String m106074b() {
        return this.f100341a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20345k) && AbstractC19074t.m100204b(this.f100341a, ((C20345k) obj).f100341a);
    }

    public int hashCode() {
        String str = this.f100341a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ManageGroupResult(groupId=" + this.f100341a + ")";
    }
}
