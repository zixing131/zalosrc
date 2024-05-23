package n50;

import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import fn0.AbstractC19074t;

/* renamed from: n50.d */
/* loaded from: classes5.dex */
public final class C23570d extends AbstractC23574h {

    /* renamed from: b */
    private final RingtoneData f114367b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23570d(RingtoneData ringtoneData) {
        super(0);
        AbstractC19074t.m100208f(ringtoneData, "ringtoneData");
        this.f114367b = ringtoneData;
    }

    /* renamed from: b */
    public final C23570d m123634b(RingtoneData ringtoneData) {
        AbstractC19074t.m100208f(ringtoneData, "ringtoneData");
        return new C23570d(ringtoneData);
    }

    /* renamed from: c */
    public final RingtoneData m123635c() {
        return this.f114367b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23570d) && AbstractC19074t.m100204b(this.f114367b, ((C23570d) obj).f114367b);
    }

    public int hashCode() {
        return this.f114367b.hashCode();
    }

    public String toString() {
        return "RingtoneDataRow(ringtoneData=" + this.f114367b + ")";
    }
}
