package p367nn;

import androidx.lifecycle.LiveData;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import jg0.AbstractC21246a;

/* renamed from: nn.a */
/* loaded from: classes3.dex */
public final class C23886a {

    /* renamed from: a */
    private final EnumC23888c f115464a;

    /* renamed from: b */
    private final int f115465b;

    /* renamed from: c */
    private final Integer f115466c;

    /* renamed from: d */
    private final int f115467d;

    /* renamed from: e */
    private final int f115468e;

    /* renamed from: f */
    private final Integer f115469f;

    /* renamed from: g */
    private final LiveData f115470g;

    public C23886a(EnumC23888c enumC23888c, int i11, Integer num, int i12, int i13, Integer num2, LiveData liveData) {
        AbstractC19074t.m100208f(enumC23888c, "id");
        this.f115464a = enumC23888c;
        this.f115465b = i11;
        this.f115466c = num;
        this.f115467d = i12;
        this.f115468e = i13;
        this.f115469f = num2;
        this.f115470g = liveData;
    }

    /* renamed from: a */
    public final int m124959a() {
        return this.f115467d;
    }

    /* renamed from: b */
    public final int m124960b() {
        return this.f115465b;
    }

    /* renamed from: c */
    public final LiveData m124961c() {
        return this.f115470g;
    }

    /* renamed from: d */
    public final EnumC23888c m124962d() {
        return this.f115464a;
    }

    /* renamed from: e */
    public final int m124963e() {
        return this.f115468e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23886a)) {
            return false;
        }
        C23886a c23886a = (C23886a) obj;
        return this.f115464a == c23886a.f115464a && this.f115465b == c23886a.f115465b && AbstractC19074t.m100204b(this.f115466c, c23886a.f115466c) && this.f115467d == c23886a.f115467d && this.f115468e == c23886a.f115468e && AbstractC19074t.m100204b(this.f115469f, c23886a.f115469f) && AbstractC19074t.m100204b(this.f115470g, c23886a.f115470g);
    }

    /* renamed from: f */
    public final Integer m124964f() {
        return this.f115466c;
    }

    /* renamed from: g */
    public final Integer m124965g() {
        return this.f115469f;
    }

    public int hashCode() {
        int hashCode = ((this.f115464a.hashCode() * 31) + this.f115465b) * 31;
        Integer num = this.f115466c;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f115467d) * 31) + this.f115468e) * 31;
        Integer num2 = this.f115469f;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        LiveData liveData = this.f115470g;
        return hashCode3 + (liveData != null ? liveData.hashCode() : 0);
    }

    public String toString() {
        return "CameraActionButtonConfig(id=" + this.f115464a + ", iconRes=" + this.f115465b + ", textRes=" + this.f115466c + ", iconColorRes=" + this.f115467d + ", textColorRes=" + this.f115468e + ", topPadding=" + this.f115469f + ", iconResLiveData=" + this.f115470g + ")";
    }

    public /* synthetic */ C23886a(EnumC23888c enumC23888c, int i11, Integer num, int i12, int i13, Integer num2, LiveData liveData, int i14, AbstractC19060k abstractC19060k) {
        this(enumC23888c, i11, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? AbstractC21246a.white : i12, (i14 & 16) != 0 ? AbstractC21246a.white : i13, (i14 & 32) != 0 ? null : num2, (i14 & 64) != 0 ? null : liveData);
    }
}
