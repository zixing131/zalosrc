package bo;

import com.zing.zalo.feed.models.SongData;
import fn0.AbstractC19074t;

/* renamed from: bo.p2 */
/* loaded from: classes4.dex */
public final class C3022p2 extends AbstractC3012n2 {

    /* renamed from: b */
    private final SongData f12075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3022p2(SongData songData) {
        super(0);
        AbstractC19074t.m100208f(songData, "songData");
        this.f12075b = songData;
    }

    /* renamed from: b */
    public final SongData m14543b() {
        return this.f12075b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3022p2) && AbstractC19074t.m100204b(this.f12075b, ((C3022p2) obj).f12075b);
    }

    public int hashCode() {
        return this.f12075b.hashCode();
    }

    public String toString() {
        return "MusicSongRow(songData=" + this.f12075b + ")";
    }
}
