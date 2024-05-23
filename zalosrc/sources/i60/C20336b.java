package i60;

import android.content.Intent;
import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: i60.b */
/* loaded from: classes5.dex */
public final class C20336b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f100307a;

    /* renamed from: b */
    private final String f100308b;

    /* renamed from: c */
    private final boolean f100309c;

    /* renamed from: d */
    private final boolean f100310d;

    /* renamed from: i60.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20336b m106040a() {
            return new C20336b(null, null, false, false);
        }

        /* renamed from: b */
        public final C20336b m106041b(Intent intent) {
            if (intent != null) {
                return new C20336b(intent.getStringExtra("extra_group_id"), intent.getStringExtra("EXTRA_SELECTED_UID"), intent.getBooleanExtra("BOL_EXTRA_SILENTLY_LEAVE_GROUP", false), intent.getBooleanExtra("BOL_EXTRA_PREVENT_ADD_GROUP", false));
            }
            return null;
        }
    }

    public C20336b(String str, String str2, boolean z11, boolean z12) {
        this.f100307a = str;
        this.f100308b = str2;
        this.f100309c = z11;
        this.f100310d = z12;
    }

    /* renamed from: a */
    public static final C20336b m106034a() {
        return Companion.m106040a();
    }

    /* renamed from: b */
    public static final C20336b m106035b(Intent intent) {
        return Companion.m106041b(intent);
    }

    /* renamed from: c */
    public final String m106036c() {
        return this.f100307a;
    }

    /* renamed from: d */
    public final String m106037d() {
        return this.f100308b;
    }

    /* renamed from: e */
    public final boolean m106038e() {
        return this.f100310d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20336b)) {
            return false;
        }
        C20336b c20336b = (C20336b) obj;
        return AbstractC19074t.m100204b(this.f100307a, c20336b.f100307a) && AbstractC19074t.m100204b(this.f100308b, c20336b.f100308b) && this.f100309c == c20336b.f100309c && this.f100310d == c20336b.f100310d;
    }

    /* renamed from: f */
    public final boolean m106039f() {
        return this.f100309c;
    }

    public int hashCode() {
        String str = this.f100307a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f100308b;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f100309c)) * 31) + AbstractC2144f.m11520a(this.f100310d);
    }

    public String toString() {
        return "ConfirmLeaveGroupResult(groupId=" + this.f100307a + ", newOwnerUid=" + this.f100308b + ", silentlyLeave=" + this.f100309c + ", preventAddGroup=" + this.f100310d + ")";
    }
}
