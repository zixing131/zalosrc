package p426pp;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.feed.mvp.music.domain.entity.Sentence;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pp.a */
/* loaded from: classes4.dex */
public final class C24898a {

    /* renamed from: a */
    private final List f119464a;

    /* renamed from: b */
    private long f119465b;

    /* renamed from: c */
    private long f119466c;

    /* renamed from: d */
    private String f119467d;

    public C24898a(List list, long j11, long j12, String str) {
        AbstractC19074t.m100208f(list, "sentences");
        AbstractC19074t.m100208f(str, "idSong");
        this.f119464a = list;
        this.f119465b = j11;
        this.f119466c = j12;
        this.f119467d = str;
    }

    /* renamed from: a */
    public final List m129465a(long j11) {
        List list = this.f119464a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Sentence sentence = (Sentence) obj;
            if ((j11 >= sentence.m45722b() && j11 <= sentence.m45723c()) || sentence.m45722b() > j11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final long m129466b() {
        return this.f119466c;
    }

    /* renamed from: c */
    public final String m129467c() {
        return this.f119467d;
    }

    /* renamed from: d */
    public final List m129468d() {
        return this.f119464a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24898a)) {
            return false;
        }
        C24898a c24898a = (C24898a) obj;
        return AbstractC19074t.m100204b(this.f119464a, c24898a.f119464a) && this.f119465b == c24898a.f119465b && this.f119466c == c24898a.f119466c && AbstractC19074t.m100204b(this.f119467d, c24898a.f119467d);
    }

    public int hashCode() {
        return (((((this.f119464a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f119465b)) * 31) + AbstractC2147g0.m11521a(this.f119466c)) * 31) + this.f119467d.hashCode();
    }

    public String toString() {
        return "Lyric(sentences=" + this.f119464a + ", chorusEnd=" + this.f119465b + ", chorusStart=" + this.f119466c + ", idSong=" + this.f119467d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C24898a(C24902e c24902e, List list) {
        this(r1, c24902e.m129488d(), c24902e.m129489e(), c24902e.m129490f());
        AbstractC19074t.m100208f(c24902e, "songContent");
        AbstractC19074t.m100208f(list, "sentences");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Sentence sentence = (Sentence) obj;
            if ((c24902e.m129489e() >= sentence.m45722b() && c24902e.m129489e() <= sentence.m45723c()) || ((c24902e.m129489e() < sentence.m45722b() && c24902e.m129488d() > sentence.m45723c()) || (c24902e.m129488d() >= sentence.m45722b() && c24902e.m129488d() <= sentence.m45723c()))) {
                arrayList.add(obj);
            }
        }
    }
}
