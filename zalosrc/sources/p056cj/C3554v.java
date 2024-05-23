package p056cj;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import nh0.C23793c;
import on0.AbstractC24340u;

/* renamed from: cj.v */
/* loaded from: classes3.dex */
public class C3554v {

    /* renamed from: a */
    private final String f15012a;

    /* renamed from: b */
    private final String f15013b;

    /* renamed from: c */
    private final String f15014c;

    /* renamed from: d */
    private final String f15015d;

    /* renamed from: e */
    private final int f15016e;

    /* renamed from: f */
    private final long f15017f;

    /* renamed from: g */
    private final long f15018g;

    /* renamed from: h */
    private final MessageId f15019h;

    /* renamed from: i */
    private String f15020i;

    /* renamed from: j */
    public ArrayList f15021j;

    public C3554v(long j11, long j12, String str, String str2, String str3, String str4, int i11, long j13, long j14) {
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(str2, "timestamp");
        AbstractC19074t.m100208f(str3, "senderUid");
        AbstractC19074t.m100208f(str4, "ownerId");
        this.f15012a = str;
        this.f15013b = str2;
        this.f15014c = str3;
        this.f15015d = str4;
        this.f15016e = i11;
        this.f15017f = j13;
        this.f15018g = j14;
        this.f15019h = MessageId.Companion.m41063a(j11, j12, str4, str3);
        this.f15020i = "";
    }

    /* renamed from: a */
    public final String m18059a() {
        return this.f15020i;
    }

    /* renamed from: b */
    public final String m18060b() {
        return this.f15012a;
    }

    /* renamed from: c */
    public final MessageId m18061c() {
        return this.f15019h;
    }

    /* renamed from: d */
    public final String m18062d() {
        return this.f15015d;
    }

    /* renamed from: e */
    public final String m18063e() {
        return this.f15014c;
    }

    /* renamed from: f */
    public final String m18064f() {
        return this.f15013b;
    }

    /* renamed from: g */
    public final int m18065g() {
        return this.f15016e;
    }

    /* renamed from: h */
    public final boolean m18066h() {
        Long m127109o;
        long j11 = 0;
        if (this.f15018g != 0) {
            m127109o = AbstractC24340u.m127109o(this.f15013b);
            if (m127109o != null) {
                j11 = m127109o.longValue();
            }
            if (j11 + this.f15018g <= C23793c.Companion.m124321a().mo124314i()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public final void m18067i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f15020i = str;
    }
}
